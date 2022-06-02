        
Flaky-test: org.apache.pulsar.client.impl.MultiTopicsConsumerImplTest.testParallelSubscribeAsync
Number of failures: 12

org.apache.pulsar.client.impl.MultiTopicsConsumerImplTest is flaky. The testParallelSubscribeAsync test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.client.impl.MultiTopicsConsumerImplTest.testParallelSubscribeAsync() didn't finish within the time-out 5000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-01T01:37:22.2495949Z](https://github.com/apache/pulsar/runs/6681292149?check_suite_focus=true#step:9:9642)  
[example failure 2022-06-01T01:31:35.4257632Z](https://github.com/apache/pulsar/runs/6681292149?check_suite_focus=true#step:9:6566)  
[example failure 2022-05-31T19:48:27.5176194Z](https://github.com/apache/pulsar/runs/6677404841?check_suite_focus=true#step:10:7239)  
[example failure 2022-05-31T19:43:53.1290685Z](https://github.com/apache/pulsar/runs/6677421056?check_suite_focus=true#step:10:3501)  
[example failure 2022-05-31T18:31:32.1856365Z](https://github.com/apache/pulsar/runs/6676191161?check_suite_focus=true#step:9:6866)  
[example failure 2022-05-31T16:57:27.5268675Z](https://github.com/apache/pulsar/runs/6674573055?check_suite_focus=true#step:9:3522)  
[example failure 2022-05-31T15:57:21.1374162Z](https://github.com/apache/pulsar/runs/6673827333?check_suite_focus=true#step:9:10890)  
[example failure 2022-05-31T10:46:53.9026934Z](https://github.com/apache/pulsar/runs/6668795517?check_suite_focus=true#step:10:3503)  
[example failure 2022-05-31T10:42:30.7877979Z](https://github.com/apache/pulsar/runs/6668332616?check_suite_focus=true#step:10:6581)  
[example failure 2022-05-31T10:35:25.7938704Z](https://github.com/apache/pulsar/runs/6668332616?check_suite_focus=true#step:10:3505)  
[example failure 2022-05-31T09:34:46.7774238Z](https://github.com/apache/pulsar/runs/6667570973?check_suite_focus=true#step:9:10715)  
[example failure 2022-05-27T10:28:07.5821691Z](https://github.com/apache/pulsar/runs/6623863985?check_suite_focus=true#step:10:3498)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.client.impl.MultiTopicsConsumerImplTest.testParallelSubscribeAsync() didn't finish within the time-out 5000
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

