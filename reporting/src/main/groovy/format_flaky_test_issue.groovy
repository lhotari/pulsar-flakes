import groovy.io.FileType
import groovy.json.JsonOutput
import groovy.json.JsonSlurper

def testExceptionsDirectory = args.size() > 0 ? new File(args[0]).absoluteFile : new File(System.getProperty("user.home"), "pulsar-flakes/test-exceptions")
if (!testExceptionsDirectory.exists()) {
    System.err.println("usage: [test exceptions directory]")
    System.exit(1)
}

def toJson(object) {
    JsonOutput.prettyPrint(JsonOutput.toJson(object))
}

reportsDir = new File(System.getProperty("user.home"), "pulsar-flakes/reports/${System.currentTimeMillis()}")
reportsDir.mkdirs()

def minFailures = args.length > 1 ? args[1] as Integer : 1

def exceptionsForTest = [:]
testExceptionsDirectory.traverse(type: FileType.FILES, nameFilter: ~/.*\.json$/) { file ->
    def testException = new JsonSlurper().parse(file)
    def testKey = "${testException.testClass}.${testException.testMethod}".toString()
    def allExceptions = exceptionsForTest.computeIfAbsent(testKey, { k -> [] })
    allExceptions << testException
}

def reportCounts = [:]
issueFields = [:]
exceptionsForTest.sort { it.value.size() }.reverseEach { testKey, allExceptions ->
    if (allExceptions.size() >= minFailures) {
        reportCounts.put(testKey, allExceptions.size())
        def reportFile = new File(reportsDir, "${testKey}.md")
        def issueFieldsForTest = [:]
        issueFields.put(testKey, issueFieldsForTest)
        reportFile.withPrintWriter { out ->
            out.println """        
Flaky-test: ${testKey}
Number of failures: ${allExceptions.size()}

${allExceptions[0].testClass} is flaky. The ${allExceptions[0].testMethod} test method fails sporadically.
"""
            allExceptions.each { testException ->
                testException.textLines = testException.text.readLines()
                def foundIt = false
                testException.shortException = testException.textLines.drop(1).takeWhile {
                    boolean beforeThis = foundIt
                    if (it.contains(testException.testMethod)) {
                        foundIt = true
                    }
                    !beforeThis
                }.take(15).join('\n')
            }
            def issueBodyAdded = false
            allExceptions.groupBy { it.shortException }.each { shortException, values ->
                out.println "```\n$shortException\n```\n"

                out.println 'Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  '
                values.groupBy { it.textLines.drop(1).join('\n') }.each { longException, items ->
                    items.sort { it.timestamp }.reverse().each { item ->
                        out.println "[example failure ${item.timestamp}](${item.url})  "
                        if (!issueBodyAdded) {
                            issueFieldsForTest.put("failureUrl", item.url)
                        }
                    }
                    out.println """

<details>
<summary>Full exception stacktrace</summary>
<code><pre>
${longException}
</pre></code>
</details>
"""
                    if (!issueBodyAdded) {
                        issueFieldsForTest.put("stacktrace", longException.readLines().take(30).join('\n').take(4000))
                        issueBodyAdded = true
                    }
                }
            }
        }
    }
}

def toCsv(reportCounts) {
    reportCounts.collect { testKey, count ->
        "\"${testKey}\",${count}"
    }.join("\n")
}

def gsheetLink(text, url) {
    return "=HYPERLINK(\"${url}\",\"${text}\")"
}

def getCreateIssueUrl(testKey) {
    def split = testKey.split("\\.")
    def className = split[split.length - 2]
    def methodName = split[split.length - 1]
    def issueFieldsForTest = [template     : 'flaky-test.yml',
                              confirmSearch: 'true',
                              title        : "Flaky-test: ${className}.${methodName}"] + issueFields.get(testKey)
    def encodedFields = issueFieldsForTest.collect { entry -> "${entry.key}=${java.net.URLEncoder.encode(entry.value, "UTF-8")}" }.join('&')
    return "https://github.com/apache/pulsar/issues/new?${encodedFields}".take(8000)
}

def toGSheetCsv(reportCounts) {
    def res = "Test method name\tFailures\tReport\tSearch issues\tCreate issue\tFixed by\n"

    reportCounts.each { testKey, count ->
        split = testKey.split("\\.")
        className = split[split.length - 2]
        methodName = split[split.length - 1]
        createIssueUrl = getCreateIssueUrl(testKey)
        res += "${className}.${methodName}\t${count}\t${gsheetLink('Report', 'BASE_REPORT_URL_PLACEHOLDER/' + testKey + '.md')}\t${gsheetLink('Issues', "https://github.com/apache/pulsar/issues?q=${className}%20${methodName}")}\t${gsheetLink('Create issue', createIssueUrl)}\t\n"
    }
    return res
}

def toReadme(reportCounts) {
    def res = "# Summary\n\nTest method name | Failures | Report | Search issues | Create issue | Fixed by |\n---------------- | -------- | ------ | ------------- | ------------ | -------- |\n"

    reportCounts.each { testKey, count ->
        split = testKey.split("\\.")
        className = split[split.length - 2]
        methodName = split[split.length - 1]
        createIssueUrl = getCreateIssueUrl(testKey)
        res += "${className}.${methodName} | ${count} | [Report](./${testKey}.md) | [Issues](https://github.com/apache/pulsar/issues?q=${className}%20${methodName}) | [Create issue](${createIssueUrl}) | |\n"
    }
    return res
}

new File(reportsDir, "report_counts.json").text = toJson(reportCounts)
new File(reportsDir, "report_counts.csv").text = toCsv(reportCounts)
new File(reportsDir, "summary.googlesheet.csv").text = toGSheetCsv(reportCounts)
new File(reportsDir, "README.md").text = toReadme(reportCounts)
println("Reports are in ${reportsDir}")