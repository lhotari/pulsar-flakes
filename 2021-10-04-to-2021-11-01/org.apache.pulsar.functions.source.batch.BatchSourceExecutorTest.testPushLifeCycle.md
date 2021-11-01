        
Flaky-test: org.apache.pulsar.functions.source.batch.BatchSourceExecutorTest.testPushLifeCycle
Number of failures: 22

org.apache.pulsar.functions.source.batch.BatchSourceExecutorTest is flaky. The testPushLifeCycle test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.functions.source.batch.BatchSourceExecutorTest.testPushLifeCycle() didn't finish within the time-out 300000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-30T00:23:05.0547678Z](https://github.com/apache/pulsar/runs/4052347394?check_suite_focus=true?check_suite_focus=true#step:8:5109)
[example failure 2021-10-28T18:01:18.8444432Z](https://github.com/apache/pulsar/runs/4037997562?check_suite_focus=true?check_suite_focus=true#step:8:5113)
[example failure 2021-10-20T19:17:55.0220503Z](https://github.com/apache/pulsar/runs/3955676928?check_suite_focus=true?check_suite_focus=true#step:8:5111)
[example failure 2021-10-20T09:51:00.5658214Z](https://github.com/apache/pulsar/runs/3949735843?check_suite_focus=true?check_suite_focus=true#step:8:5111)
[example failure 2021-10-20T08:25:36.1054432Z](https://github.com/apache/pulsar/runs/3948729173?check_suite_focus=true?check_suite_focus=true#step:8:10486)
[example failure 2021-10-20T04:27:41.2279223Z](https://github.com/apache/pulsar/runs/3947248175?check_suite_focus=true?check_suite_focus=true#step:8:5105)
[example failure 2021-10-19T08:47:17.1741436Z](https://github.com/apache/pulsar/runs/3936613140?check_suite_focus=true?check_suite_focus=true#step:8:5105)
[example failure 2021-10-19T07:36:23.6853946Z](https://github.com/apache/pulsar/runs/3935901751?check_suite_focus=true?check_suite_focus=true#step:8:5111)
[example failure 2021-10-15T03:10:35.5151219Z](https://github.com/apache/pulsar/runs/3901846078?check_suite_focus=true?check_suite_focus=true#step:8:10470)
[example failure 2021-10-15T02:51:36.7617281Z](https://github.com/apache/pulsar/runs/3901846078?check_suite_focus=true?check_suite_focus=true#step:8:5105)
[example failure 2021-10-14T21:57:45.2732506Z](https://github.com/apache/pulsar/runs/3899640793?check_suite_focus=true?check_suite_focus=true#step:8:15839)
[example failure 2021-10-14T21:18:36.4665465Z](https://github.com/apache/pulsar/runs/3899640793?check_suite_focus=true?check_suite_focus=true#step:8:5099)
[example failure 2021-10-14T17:50:22.4648664Z](https://github.com/apache/pulsar/runs/3897710703?check_suite_focus=true?check_suite_focus=true#step:8:5105)
[example failure 2021-10-14T15:36:09.1621735Z](https://github.com/apache/pulsar/runs/3896418744?check_suite_focus=true?check_suite_focus=true#step:8:5099)
[example failure 2021-10-12T09:27:39.7570221Z](https://github.com/apache/pulsar/runs/3868469382?check_suite_focus=true?check_suite_focus=true#step:8:5098)
[example failure 2021-10-08T10:00:48.0231542Z](https://github.com/apache/pulsar/runs/3836704101?check_suite_focus=true?check_suite_focus=true#step:8:20910)
[example failure 2021-10-08T04:12:18.8388700Z](https://github.com/apache/pulsar/runs/3834640253?check_suite_focus=true?check_suite_focus=true#step:8:5084)
[example failure 2021-10-08T01:49:15.3322127Z](https://github.com/apache/pulsar/runs/3833881364?check_suite_focus=true?check_suite_focus=true#step:8:5078)
[example failure 2021-10-05T18:30:23.0454295Z](https://github.com/apache/pulsar/runs/3806386813?check_suite_focus=true?check_suite_focus=true#step:8:5076)
[example failure 2021-10-05T07:03:45.5175592Z](https://github.com/apache/pulsar/runs/3799981420?check_suite_focus=true?check_suite_focus=true#step:8:10378)
[example failure 2021-10-05T06:39:25.4092410Z](https://github.com/apache/pulsar/runs/3799981420?check_suite_focus=true?check_suite_focus=true#step:8:5092)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.functions.source.batch.BatchSourceExecutorTest.testPushLifeCycle() didn't finish within the time-out 300000
	at org.testng.internal.MethodInvocationHelper.invokeWithTimeoutWithNewExecutor(MethodInvocationHelper.java:371)
	at org.testng.internal.MethodInvocationHelper.invokeWithTimeout(MethodInvocationHelper.java:282)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:605)
	at org.testng.internal.TestInvoker.retryFailed(TestInvoker.java:214)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:58)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
	at org.testng.TestRunner.privateRun(TestRunner.java:764)
	at org.testng.TestRunner.run(TestRunner.java:585)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:384)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)
	at org.testng.SuiteRunner.run(SuiteRunner.java:286)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1218)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1140)
	at org.testng.TestNG.runSuites(TestNG.java:1069)
	at org.testng.TestNG.run(TestNG.java:1037)
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)

</pre></code>
</details>

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.functions.source.batch.BatchSourceExecutorTest.testPushLifeCycle() didn't finish within the time-out 5000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T01:16:14.1151872Z](https://github.com/apache/pulsar/runs/3889473970?check_suite_focus=true?check_suite_focus=true#step:6:3131)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.functions.source.batch.BatchSourceExecutorTest.testPushLifeCycle() didn't finish within the time-out 5000
	at org.testng.internal.MethodInvocationHelper.invokeWithTimeoutWithNewExecutor(MethodInvocationHelper.java:371)
	at org.testng.internal.MethodInvocationHelper.invokeWithTimeout(MethodInvocationHelper.java:282)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:605)
	at org.testng.internal.TestInvoker.retryFailed(TestInvoker.java:214)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:58)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.util.ArrayList.forEach(ArrayList.java:1257)
	at org.testng.TestRunner.privateRun(TestRunner.java:764)
	at org.testng.TestRunner.run(TestRunner.java:585)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:384)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)
	at org.testng.SuiteRunner.run(SuiteRunner.java:286)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1218)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1140)
	at org.testng.TestNG.runSuites(TestNG.java:1069)
	at org.testng.TestNG.run(TestNG.java:1037)
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)

</pre></code>
</details>

