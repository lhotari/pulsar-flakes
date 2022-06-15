        
Flaky-test: org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest.testAddRemoveConsumer
Number of failures: 7

org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest is flaky. The testAddRemoveConsumer test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest.testAddRemoveConsumer() didn't finish within the time-out 300000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-10T02:45:37.1036865Z](https://github.com/apache/pulsar/runs/6823969711?check_suite_focus=true#step:9:940)  
[example failure 2022-06-09T15:02:04.3564052Z](https://github.com/apache/pulsar/runs/6814328645?check_suite_focus=true#step:10:2218)  
[example failure 2022-06-09T12:10:26.7530879Z](https://github.com/apache/pulsar/runs/6811583954?check_suite_focus=true#step:9:2995)  
[example failure 2022-06-09T08:48:29.3951574Z](https://github.com/apache/pulsar/runs/6807800345?check_suite_focus=true#step:10:2984)  
[example failure 2022-06-09T00:39:51.6974068Z](https://github.com/apache/pulsar/runs/6803818014?check_suite_focus=true#step:9:3794)  
[example failure 2022-06-06T10:52:26.4497476Z](https://github.com/apache/pulsar/runs/6753618434?check_suite_focus=true#step:10:1914)  
[example failure 2022-06-03T07:27:53.3417789Z](https://github.com/apache/pulsar/runs/6721616096?check_suite_focus=true#step:9:1241)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest.testAddRemoveConsumer() didn't finish within the time-out 300000
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

