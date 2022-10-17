        
Flaky-test: org.apache.pulsar.websocket.proxy.v1.V1_ProxyAuthenticationTest.authenticatedSocketTest
Number of failures: 3

org.apache.pulsar.websocket.proxy.v1.V1_ProxyAuthenticationTest is flaky. The authenticatedSocketTest test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.websocket.proxy.v1.V1_ProxyAuthenticationTest.authenticatedSocketTest() didn't finish within the time-out 10000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-14T01:30:45.2524955Z](https://github.com/apache/pulsar/actions/runs/3246245283/jobs/5326011735#step:9:527)  
[example failure 2022-10-12T16:10:41.9528948Z](https://github.com/apache/pulsar/actions/runs/3235740229/jobs/5301094569#step:10:489)  
[example failure 2022-10-11T04:30:44.4424075Z](https://github.com/apache/pulsar/actions/runs/3223919370/jobs/5274866882#step:9:526)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.websocket.proxy.v1.V1_ProxyAuthenticationTest.authenticatedSocketTest() didn't finish within the time-out 10000
	at org.testng.internal.MethodInvocationHelper.invokeWithTimeoutWithNewExecutor(MethodInvocationHelper.java:371)
	at org.testng.internal.MethodInvocationHelper.invokeWithTimeout(MethodInvocationHelper.java:282)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:605)
	at org.testng.internal.TestInvoker.retryFailed(TestInvoker.java:214)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:58)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
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

