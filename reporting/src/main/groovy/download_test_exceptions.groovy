import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import groovyx.net.http.FromServer
import groovyx.net.http.NativeHandlers
import groovyx.net.http.optional.Download
import jakarta.ws.rs.core.Link
import org.apache.http.HttpHost
import org.apache.http.HttpRequest
import org.apache.http.HttpRequestInterceptor
import org.apache.http.impl.client.HttpClientBuilder
import org.apache.http.impl.client.StandardHttpRequestRetryHandler
import org.apache.http.protocol.HttpContext
import org.apache.http.protocol.HttpCoreContext

import java.time.Duration
import java.time.Instant
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

import static groovyx.net.http.ApacheHttpBuilder.configure as configureHttpBuilder

SLUG = 'apache/pulsar'

def toJson(object) {
    JsonOutput.prettyPrint(JsonOutput.toJson(object))
}

// credentials for accessing the Github API are read from ~/.github_download_tokens.json
// if the file doesn't exist, one will be created with values that explain what is expected
def tokenFile = new File(System.getProperty("user.home"), ".github_download_tokens.json")
if (!tokenFile.exists()) {
    tokenFile.text = toJson([githubUser  : 'github user',
                             githubToken : 'personal access token for user (workflow scope required)'])
    println "Please enter credentials to ${tokenFile.absolutePath}"
    System.exit(1)
}
def tokens = new JsonSlurper().parse(tokenFile)
def maxBuildAgeEnv = System.getenv("MAX_BUILD_AGE");
maxBuildAge = null
if (maxBuildAgeEnv != null) {
    if (maxBuildAgeEnv =~ /\d+$/) {
        // assume milliseconds
        maxBuildAge = Duration.ofMillis(Long.parseLong(maxBuildAgeEnv))
    } else if (maxBuildAgeEnv =~ /\d+[smhd]$/) {
        // support suffixes s, m, h, d for seconds, minutes, hours, days
        maxBuildAge = Duration.parse('P' + maxBuildAgeEnv)
    } else if (maxBuildAgeEnv.startsWith('P')) {
        // support ISO-8601 duration format
        maxBuildAge = Duration.parse(maxBuildAgeEnv)
    }
}
if (maxBuildAge == null) {
    maxBuildAge = Duration.ofDays(1)
}
println("Max build age: ${maxBuildAge}")
baseUri = "https://api.github.com/repos/${SLUG}"

// configures HttpBuilder-NG builder
// https://http-builder-ng.github.io/http-builder-ng/asciidoc/html5/ for documentation
githubHttpBuilder = configureHttpBuilder {
    // retry on failure 3 times
    client.clientCustomizer { HttpClientBuilder apacheHttpClientBuilder ->
        apacheHttpClientBuilder.retryHandler = new StandardHttpRequestRetryHandler(3, true)
        apacheHttpClientBuilder.addInterceptorFirst({ HttpRequest request, HttpContext context ->
            HttpHost targetHost = (HttpHost) context.getAttribute(HttpCoreContext.HTTP_TARGET_HOST);
            if (targetHost != null && targetHost.getHostName().endsWith(".github.com")) {
                request.addHeader('Authorization', "token ${tokens.githubToken}".toString())
            }
        } as HttpRequestInterceptor)
    }
}

// parses a Link header that is in https://tools.ietf.org/html/draft-nottingham-http-link-header-10#section-5 format
// returns a map where
// key - "rel" parameter of the link (for example "next" or "prev")
// value - uri of the link
def parseLinkHeader(FromServer resp) {
    // split the different parts using regex
    def linkHeaderValue = resp.headers.find { h -> h.key == 'Link' }?.value
    if (linkHeaderValue) {
        return (~/,\s*(?=\<|$)/).split(linkHeaderValue).collectEntries {
            // parse each individual value using JaxRS Link class
            def link = Link.valueOf(it)
            [link.rel, link.uri]
        }
    } else {
        return null
    }
}

failureReportsDir = new File(System.getProperty("user.home"), 'pulsar-flakes')
pullsDirectory = new File(failureReportsDir, 'pulls')
pullsDirectory.mkdirs()
buildsDirectory = new File(failureReportsDir, 'builds')
buildsDirectory.mkdirs()
testExceptionsDirectory = new File(failureReportsDir, 'test-exceptions')
testExceptionsDirectory.mkdirs()
testExceptionUniquenessCheckSet = new HashSet()

def storeTestException(testException) {
    if (testException.testClass && testException.testMethod && !testException.message.contains('FailFastSkipException')) {
        // limit 1 similar exception in a test class test method in 10 seconds. This prevents a flood of duplicate exceptions that skew the results
        // "2022-01-26T23:48:25.8538745Z".take(18) ===> 2022-01-26T23:48:2
        def testUniqueKey = [testException.testClass, testException.testMethod, testException.message, testException.timestamp.take(18)].join('#')
        if (testExceptionUniquenessCheckSet.add(testUniqueKey)) {
            def directory = new File(testExceptionsDirectory, "${testException.testClass}.${testException.testMethod}")
            directory.mkdirs()
            def file = new File(directory, "${testException.run_id}_${testException.job_id}_${testException.step}_${testException.line}.json")
            println "Storing ${file.absolutePath}"
            file.text = toJson(testException)
            def counterFile = new File(directory, "counter.txt")
            if (counterFile.exists()) {
                counterFile.text = (Integer.parseInt(counterFile.text) + 1).toString()
            } else {
                counterFile.text = "1"
            }
        } else {
            println "Skipping duplicate test key ${testUniqueKey}"
        }
    }
}

def checkLogs(runInfo, prInfo, pullDirectory, oldestStartedAtAccepted, attemptNumber, onlyFailed = false) {
    def id = runInfo.id

    print "Checking logs for run ${id} attempt ${attemptNumber} ${runInfo.html_url}"
    if (prInfo) {
        println ", PR ${prInfo.html_url}"
    } else {
        println()
    }

    def jobs

    try {
        jobs = githubHttpBuilder.get {
            request.uri = "${baseUri}/actions/runs/${id}/attempts/${attemptNumber}/jobs?filter=all&per_page=100"
        }
    } catch (groovyx.net.http.HttpException e) {
        println "Error ${e.message}, skipping"
    }

    if (jobs && jobs.jobs) {
        def jobsDirectory = new File(pullDirectory, "jobs")
        jobsDirectory.mkdirs()

        jobs.jobs.each { job ->
            if ((prInfo == null || job.head_sha == prInfo.head.sha) && job.status == 'completed'
                    && (!onlyFailed || (job.conclusion == 'failure' || job.conclusion == 'timed_out'))) {
                def startedAt = job.started_at ? Instant.parse(job.started_at) : null
                if (startedAt && startedAt.isAfter(oldestStartedAtAccepted)) {
                    println "Handling job ${job.id}"
                    def jobDirectory = new File(jobsDirectory, "${job.id}")
                    jobDirectory.mkdirs()
                    new File(jobDirectory, "job_${attemptNumber}.json").text = toJson(job)

                    def logsUrl = "${baseUri}/actions/jobs/${job.id}/logs"
                    try {
                        def logFile = new File(jobDirectory, "log_${attemptNumber}.txt")
                        println "Downloading logs for ${job.html_url} from ${logsUrl} to ${logFile.absolutePath}"
                        githubHttpBuilder.get {
                            request.uri = logsUrl
                            Download.toFile(delegate, logFile)
                        }
                        println "Processing logs"
                        processLogFile(logFile, job, runInfo, prInfo, attemptNumber)
                    } catch (Exception e) {
                        e.printStackTrace()
                        println "Cannot download logs ${logsUrl}"
                    }
                }
            }
        }
    }
}

def processLogFile(File logFile, job, runInfo, prInfo, attemptNumber) {
    def content
    boolean handlingException = false
    def testException
    def firstLineOfException = false
    int currentStepNumber = 1
    def currentStep = job.steps.find { it.number == currentStepNumber }
    if (currentStep) {
        def currentStepCompletedAt = currentStep?.completed_at ? ZonedDateTime.parse(currentStep.completed_at, DateTimeFormatter.ISO_OFFSET_DATE_TIME).toInstant() : null
        int currentStepLineNumber = 0
        println "Step ${currentStepNumber} - ${currentStep.name} - until ${currentStepCompletedAt} ${currentStep.completed_at}"
        println currentStep
        logFile.eachLine('UTF-8') { rawLine, number ->
            def line = rawLine.trim()
            if (line) {
                def currentLine
                def currentTimestamp
                try {
                    def timestampString = line.take(28)?.trim()
                    currentTimestamp = timestampString.length() == 28 ? Instant.parse(timestampString) : null
                    currentLine = line.drop(29)
                } catch (DateTimeParseException e) {
                    // ignore
                    currentLine = line
                }
                if (currentStepCompletedAt != null && currentTimestamp != null && currentTimestamp.isAfter(currentStepCompletedAt) &&
                        currentLine.startsWith('##[group]')) {
                    if (currentStep) {
                        currentStepNumber = currentStep.number + 1
                    }
                    currentStep = job.steps.find { it.number == currentStepNumber }
                    if (currentStep) {
                        currentStepCompletedAt = currentStep?.completed_at ? ZonedDateTime.parse(currentStep.completed_at, DateTimeFormatter.ISO_OFFSET_DATE_TIME).toInstant() : null
                        println "Step ${currentStepNumber} - ${currentStep.name} - until ${currentStepCompletedAt}"
                        currentStepLineNumber = 0
                    }
                }
                if (currentLine != '##[endgroup]') {
                    currentStepLineNumber++
                    //println "${currentStepLineNumber} ${line}"
                    if (handlingException) {
                        if(testException.testfailure && currentLine.trim().startsWith('[')
                           || testException.threaddump && !currentLine.trim()) {
                            testException.text = content.toString()
                            handlingException = false
                            content = null
                            if (testException.threaddump && testException.text.contains("ForkedBooter.runSuitesInProcess")
                                && testException.text.contains("java.lang.Thread.State: WAITING")) {
                                for (exceptionline in testException.text.readLines().reverse()) {
                                    if (exceptionline.find(~/\s+at (org\.apache\.pulsar\..*)\.(.*?)\(/) {
                                        testException.testClass = it[1]
                                        testException.testMethod = it[2]
                                    }) {
                                        break
                                    }
                                }
                            }

                            if (testException.testMethod?.endsWith("-suite")) {
                                def realTestClassAndMethod = testException.text.readLines().takeWhile { it }.reverse().collect { String l ->
                                    l.find("at (org\\.apache\\.pulsar\\..*?)\\(") { it[1] }
                                }.find { it }
                                if (!realTestClassAndMethod) {
                                    realTestClassAndMethod = testException.text.find("Method (.*?)\\(\\) didn't finish within the time-out") { it[1] }
                                }
                                def pos = realTestClassAndMethod?.lastIndexOf('.') ?: -1
                                if (pos > -1) {
                                    testException.testClass = realTestClassAndMethod.substring(0, pos)
                                    testException.testMethod = realTestClassAndMethod.substring(pos + 1)
                                }
                            }

                            storeTestException(testException)
                            testException = null
                        }
                    }
                    if (!handlingException) {
                        boolean testfailureException = currentLine.startsWith('[ERROR]') && currentLine.endsWith('<<< FAILURE!')
                        boolean threaddumpException = currentLine.startsWith('"main" #1 prio=')
                        if (testfailureException || threaddumpException) {
                            handlingException = true
                            content = new StringBuilder()
                            testException = [
                                    testfailure: testfailureException,
                                    threaddump: threaddumpException
                            ]
                            if (testfailureException) {
                                currentLine.find(~/\[ERROR\] ([^\[(]*)\.([^\[(]*)(.*?)  Time elapsed/) {
                                    testException.testClass = it[1]
                                    testException.testMethod = it[2]
                                }
                            }
                            testException.line = currentStepLineNumber
                            testException.step = currentStepNumber
                            testException.run_id = runInfo.id
                            testException.job_id = job.id
                            testException.url = "${job.html_url}#step:${testException.step}:${testException.line}"
                            testException.timestamp = line.take(28)
                            if (prInfo) {
                                testException.pr_info = [url: prInfo.html_url, number: prInfo.number, title: prInfo.title, sha: prInfo.head.sha, state: prInfo.state, draft: prInfo.draft]
                            }
                            def exceptionContextDescription = threaddumpException ? "from thread dump at" : "${testException.testClass}.${testException.testMethod}"
                            println "Handling exception ${exceptionContextDescription} ${testException.timestamp} ${testException.sha} pr:${testException.pr_info}"
                            firstLineOfException = true
                        }
                    }
                    if (handlingException) {
                        if (!testException.message && !firstLineOfException) {
                            testException.message = currentLine.trim()
                        }
                        content.append(currentLine).append('\n')
                        firstLineOfException = false
                    }
                }
            }
        }
    }
}

// Evaluates Pull Requests that were merged. The logs will be checked for builds where the SHA of the head of the PR
// matches the SHA which got merged. This ensures that all found exceptions are real flakes since no changes
// were made to the PR to make the tests pass later so that the PR was merged successfully.
def handlePulls() {
    def oldestUpdatedOrMergedTimeAccepted = Instant.now().minus(maxBuildAge)
    def pullsUri = "${baseUri}/pulls?per_page=100&state=closed&sort=updated&direction=desc"
    while (pullsUri) {
        def (linkHeader, listing) = githubHttpBuilder.get {
            request.uri = pullsUri
            response.parser("application/json") { config, resp ->
                [parseLinkHeader(resp), NativeHandlers.Parsers.json(config, resp)]
            }
        }
        Instant lastUpdatedTime
        listing.each { prInfo ->
            lastUpdatedTime = Instant.parse(prInfo.updated_at)
            def mergedAt = prInfo.merged_at ? Instant.parse(prInfo.merged_at) : null
            if (mergedAt && mergedAt.isAfter(oldestUpdatedOrMergedTimeAccepted)) {
                def pullDirectory = new File(pullsDirectory, "${prInfo.number}")
                pullDirectory.mkdirs()
                def pullFile = new File(pullDirectory, "pull.json")
                if (!pullFile.exists()) {
                    println "Handling PR #${prInfo.number}"
                    def runs = githubHttpBuilder.get {
                        request.uri = "${baseUri}/actions/runs?actor=${prInfo.head.user.login}&branch=${prInfo.head.ref}&per_page=100"
                    }
                    new File(pullDirectory, "runs.json").text = toJson(runs)
                    runs.workflow_runs.each { runInfo ->
                        int maxAttemptNumber = runInfo.run_attempt as Integer
                        for (int attemptNumber=1; attemptNumber <= maxAttemptNumber; attemptNumber++) {
                            checkLogs(runInfo, prInfo, pullDirectory, oldestUpdatedOrMergedTimeAccepted, attemptNumber)
                        }
                    }
                    pullFile.text = toJson(prInfo)
                }
            }
        }

        if (lastUpdatedTime && lastUpdatedTime.isBefore(oldestUpdatedOrMergedTimeAccepted)) {
            break
        }

        // move to next page
        pullsUri = linkHeader?.next
    }
}

def handleMasterBranchBuilds(workflowFile = 'pulsar-ci.yaml') {
    def oldestBuildTimeAccepted = Instant.now().minus(maxBuildAge)
    def oldestDateString = oldestBuildTimeAccepted.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ISO_LOCAL_DATE)

    def runs = githubHttpBuilder.get {
        request.uri = "${baseUri}/actions/workflows/${workflowFile}/runs?branch=master&exclude_pull_requests=true&status=completed&per_page=100&created=${URLEncoder.encode('>=' + oldestDateString, 'UTF-8')}"
    }
    def workflowBuildDirectory = new File(buildsDirectory, "${workflowFile - '.yaml'}")
    runs.workflow_runs.each { runInfo ->
        def buildDirectory = new File(workflowBuildDirectory, "${runInfo.id}")
        buildDirectory.mkdirs()
        new File(buildDirectory, "run.json").text = toJson(runInfo)
        int maxAttemptNumber = runInfo.run_attempt as Integer
        for (int attemptNumber=1; attemptNumber <= maxAttemptNumber; attemptNumber++) {
            checkLogs(runInfo, null, buildDirectory, oldestBuildTimeAccepted, attemptNumber, true)
        }
    }
}

boolean TESTMODE = System.getenv("TEST_REPORTING_TEST_MODE")
//TESTMODE = true
if (TESTMODE) {
    def testInputDir = new File('src/main/test_input')
    processLogFile(new File(testInputDir, 'log.txt'),
            new JsonSlurper().parse(new File(testInputDir, 'job.json')),
            new JsonSlurper().parse(new File(testInputDir, 'run.json')),
            new JsonSlurper().parse(new File(testInputDir, 'pull.json')), 4)
} else {
    switch (System.getenv("TEST_REPORTING_SOURCE")) {
        case 'master':
            handleMasterBranchBuilds('pulsar-ci.yaml')
            handleMasterBranchBuilds('pulsar-ci-flaky.yaml')
            break
        case 'pulls':
        default:
            handlePulls()
    }
}
