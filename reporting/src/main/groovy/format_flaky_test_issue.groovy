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
    if (testException.testMethod.endsWith("-suite")) {
        def realTestClassAndMethod = testException.text.readLines().takeWhile { it }.reverse().collect { String line ->
            line.find("at (org\\.apache\\.pulsar\\..*?)\\(") { it[1] }
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
    def testKey = "${testException.testClass}.${testException.testMethod}".toString()
    def allExceptions = exceptionsForTest.computeIfAbsent(testKey, { k -> [] })
    allExceptions << testException
}

def reportCounts = [:]
exceptionsForTest.sort { it.value.size() }.reverseEach { testKey, allExceptions ->
    if (allExceptions.size() >= minFailures) {
        reportCounts.put(testKey, allExceptions.size())
        def reportFile = new File(reportsDir, "${testKey}.md")
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
            allExceptions.groupBy { it.shortException }.each { shortException, values ->
                out.println "```\n$shortException\n```\n"

                out.println 'Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  '
                values.groupBy { it.textLines.drop(1).join('\n') }.each { longException, items ->
                    items.sort { it.timestamp }.reverse().each { item ->
                        out.println "[example failure ${item.timestamp}](${item.url})  "
                    }
                    out.println """

<details>
<summary>Full exception stacktrace</summary>
<code><pre>
${longException}
</pre></code>
</details>
"""
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
def toReadme(reportCounts) {
    def res = "# Summary\n\nTest method name | Failures | Report | Search issues | Fixed by |\n---------------- | -------- | ------ | ------------- | -------- |\n"

    reportCounts.each { testKey, count ->
        split = testKey.split("\\.")
        println("split" + split)
        className = split[split.length - 2]
        methodName = split[split.length - 1]
        res += "${className}.${methodName} | ${count} | [Report](./${testKey}.md) | [Issues](https://github.com/apache/pulsar/issues?q=${className}%20${methodName}) | |\n"
    }
    return res
}

new File(reportsDir, "report_counts.json").text = toJson(reportCounts)
new File(reportsDir, "report_counts.csv").text = toCsv(reportCounts)
new File(reportsDir, "README.md").text = toReadme(reportCounts)
