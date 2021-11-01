        
Flaky-test: org.apache.pulsar.functions.source.batch.BatchSourceExecutorTest.testLifeCycle
Number of failures: 28

org.apache.pulsar.functions.source.batch.BatchSourceExecutorTest is flaky. The testLifeCycle test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.functions.source.batch.BatchSourceExecutorTest.testLifeCycle() didn't finish within the time-out 300000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-30T12:21:22.7103711Z](https://github.com/apache/pulsar/runs/4054904980?check_suite_focus=true?check_suite_focus=true#step:8:6733)
[example failure 2021-10-27T06:26:42.6115064Z](https://github.com/apache/pulsar/runs/4018551001?check_suite_focus=true?check_suite_focus=true#step:8:6835)
[example failure 2021-10-26T01:25:15.8689101Z](https://github.com/apache/pulsar/runs/4004188513?check_suite_focus=true?check_suite_focus=true#step:8:5113)
[example failure 2021-10-26T01:20:47.7184112Z](https://github.com/apache/pulsar/runs/4004149303?check_suite_focus=true?check_suite_focus=true#step:8:5113)
[example failure 2021-10-22T15:14:56.3215031Z](https://github.com/apache/pulsar/runs/3977188361?check_suite_focus=true?check_suite_focus=true#step:8:5111)
[example failure 2021-10-22T13:36:55.9074274Z](https://github.com/apache/pulsar/runs/3976144084?check_suite_focus=true?check_suite_focus=true#step:8:5111)
[example failure 2021-10-22T07:49:12.1187791Z](https://github.com/apache/pulsar/runs/3972696102?check_suite_focus=true?check_suite_focus=true#step:8:16989)
[example failure 2021-10-21T12:42:53.9085386Z](https://github.com/apache/pulsar/runs/3963356839?check_suite_focus=true?check_suite_focus=true#step:8:16995)
[example failure 2021-10-21T07:46:48.9648537Z](https://github.com/apache/pulsar/runs/3960911080?check_suite_focus=true?check_suite_focus=true#step:8:5111)
[example failure 2021-10-21T04:57:42.1229242Z](https://github.com/apache/pulsar/runs/3959780514?check_suite_focus=true?check_suite_focus=true#step:8:5111)
[example failure 2021-10-21T03:18:12.8474126Z](https://github.com/apache/pulsar/runs/3959210072?check_suite_focus=true?check_suite_focus=true#step:8:5123)
[example failure 2021-10-20T08:43:45.3616414Z](https://github.com/apache/pulsar/runs/3948729173?check_suite_focus=true?check_suite_focus=true#step:8:15857)
[example failure 2021-10-20T08:07:25.0657820Z](https://github.com/apache/pulsar/runs/3948729173?check_suite_focus=true?check_suite_focus=true#step:8:5105)
[example failure 2021-10-18T03:10:46.8435280Z](https://github.com/apache/pulsar/runs/3921750760?check_suite_focus=true?check_suite_focus=true#step:8:16977)
[example failure 2021-10-14T21:38:02.8075181Z](https://github.com/apache/pulsar/runs/3899640793?check_suite_focus=true?check_suite_focus=true#step:8:10464)
[example failure 2021-10-14T18:42:49.4101425Z](https://github.com/apache/pulsar/runs/3898240723?check_suite_focus=true?check_suite_focus=true#step:8:5099)
[example failure 2021-10-14T16:12:54.0916959Z](https://github.com/apache/pulsar/runs/3896418744?check_suite_focus=true?check_suite_focus=true#step:8:15779)
[example failure 2021-10-14T15:54:40.2721855Z](https://github.com/apache/pulsar/runs/3896418744?check_suite_focus=true?check_suite_focus=true#step:8:10464)
[example failure 2021-10-14T02:29:59.3641953Z](https://github.com/apache/pulsar/runs/3889806190?check_suite_focus=true?check_suite_focus=true#step:8:5101)
[example failure 2021-10-12T14:00:20.5892929Z](https://github.com/apache/pulsar/runs/3870600528?check_suite_focus=true?check_suite_focus=true#step:8:22327)
[example failure 2021-10-12T13:13:41.3907372Z](https://github.com/apache/pulsar/runs/3870600528?check_suite_focus=true?check_suite_focus=true#step:8:5096)
[example failure 2021-10-12T02:48:56.7584700Z](https://github.com/apache/pulsar/runs/3865758651?check_suite_focus=true?check_suite_focus=true#step:8:5098)
[example failure 2021-10-11T02:31:31.3482669Z](https://github.com/apache/pulsar/runs/3854364451?check_suite_focus=true?check_suite_focus=true#step:8:18558)
[example failure 2021-10-10T03:19:27.1917206Z](https://github.com/apache/pulsar/runs/3849391067?check_suite_focus=true?check_suite_focus=true#step:8:5093)
[example failure 2021-10-08T19:55:28.9809389Z](https://github.com/apache/pulsar/runs/3842296524?check_suite_focus=true?check_suite_focus=true#step:8:5092)
[example failure 2021-10-08T15:13:31.6359240Z](https://github.com/apache/pulsar/runs/3839908504?check_suite_focus=true?check_suite_focus=true#step:8:5092)
[example failure 2021-10-08T09:26:58.0877571Z](https://github.com/apache/pulsar/runs/3836735971?check_suite_focus=true?check_suite_focus=true#step:8:5093)
[example failure 2021-10-05T07:22:40.1094719Z](https://github.com/apache/pulsar/runs/3799981420?check_suite_focus=true?check_suite_focus=true#step:8:15664)


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

