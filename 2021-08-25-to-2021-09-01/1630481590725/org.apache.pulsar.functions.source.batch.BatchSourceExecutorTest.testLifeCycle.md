        
Flaky-test: org.apache.pulsar.functions.source.batch.BatchSourceExecutorTest.testLifeCycle
Number of failures: 7

org.apache.pulsar.functions.source.batch.BatchSourceExecutorTest is flaky. The testLifeCycle test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.functions.source.batch.BatchSourceExecutorTest.testLifeCycle() didn't finish within the time-out 300000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-31T11:14:18.9844077Z](https://github.com/apache/pulsar/runs/3472022291?check_suite_focus=true#step:8:5152)
[example failure 2021-08-30T19:49:52.2085611Z](https://github.com/apache/pulsar/runs/3465551686?check_suite_focus=true#step:8:6799)
[example failure 2021-08-28T00:04:34.3012006Z](https://github.com/apache/pulsar/runs/3447917397?check_suite_focus=true#step:8:6814)
[example failure 2021-08-27T11:44:43.5443208Z](https://github.com/apache/pulsar/runs/3442570175?check_suite_focus=true#step:8:8428)
[example failure 2021-08-27T11:21:54.4133468Z](https://github.com/apache/pulsar/runs/3442396885?check_suite_focus=true#step:8:6831)
[example failure 2021-08-27T08:53:44.6302990Z](https://github.com/apache/pulsar/runs/3441276090?check_suite_focus=true#step:8:5154)
[example failure 2021-08-27T06:25:16.2242689Z](https://github.com/apache/pulsar/runs/3440270116?check_suite_focus=true#step:8:5160)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.functions.source.batch.BatchSourceExecutorTest.testLifeCycle() didn't finish within the time-out 300000
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

