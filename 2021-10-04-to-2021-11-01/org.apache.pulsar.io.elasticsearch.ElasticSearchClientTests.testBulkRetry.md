        
Flaky-test: org.apache.pulsar.io.elasticsearch.ElasticSearchClientTests.testBulkRetry
Number of failures: 12

org.apache.pulsar.io.elasticsearch.ElasticSearchClientTests is flaky. The testBulkRetry test method fails sporadically.

```
java.lang.AssertionError: expected [2] but found [3]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.io.elasticsearch.ElasticSearchClientTests.testBulkRetry(ElasticSearchClientTests.java:207)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-13T15:26:14.5400032Z](https://github.com/apache/pulsar/runs/3884073272?check_suite_focus=true?check_suite_focus=true#step:8:11653)
[example failure 2021-10-12T13:41:22.5399763Z](https://github.com/apache/pulsar/runs/3870600528?check_suite_focus=true?check_suite_focus=true#step:8:17034)
[example failure 2021-10-12T03:19:39.2985456Z](https://github.com/apache/pulsar/runs/3865758651?check_suite_focus=true?check_suite_focus=true#step:8:17029)
[example failure 2021-10-11T02:13:32.4505846Z](https://github.com/apache/pulsar/runs/3854364451?check_suite_focus=true?check_suite_focus=true#step:8:13266)
[example failure 2021-10-05T19:02:24.3079216Z](https://github.com/apache/pulsar/runs/3806386813?check_suite_focus=true?check_suite_focus=true#step:8:16795)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [2] but found [3]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.io.elasticsearch.ElasticSearchClientTests.testBulkRetry(ElasticSearchClientTests.java:207)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.io.elasticsearch.ElasticSearchClientTests.testBulkRetry() didn't finish within the time-out 300000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-22T07:30:04.0125597Z](https://github.com/apache/pulsar/runs/3972696102?check_suite_focus=true?check_suite_focus=true#step:8:11667)
[example failure 2021-10-22T06:26:11.5829508Z](https://github.com/apache/pulsar/runs/3972294602?check_suite_focus=true?check_suite_focus=true#step:8:11667)
[example failure 2021-10-21T12:24:33.5607775Z](https://github.com/apache/pulsar/runs/3963356839?check_suite_focus=true?check_suite_focus=true#step:8:11673)
[example failure 2021-10-21T05:40:03.2968446Z](https://github.com/apache/pulsar/runs/3959780514?check_suite_focus=true?check_suite_focus=true#step:8:17054)
[example failure 2021-10-18T22:39:10.2119045Z](https://github.com/apache/pulsar/runs/3932392186?check_suite_focus=true?check_suite_focus=true#step:8:11686)
[example failure 2021-10-18T02:51:23.0114660Z](https://github.com/apache/pulsar/runs/3921750760?check_suite_focus=true?check_suite_focus=true#step:8:11661)
[example failure 2021-10-14T20:08:44.6108639Z](https://github.com/apache/pulsar/runs/3898240723?check_suite_focus=true?check_suite_focus=true#step:8:33060)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.io.elasticsearch.ElasticSearchClientTests.testBulkRetry() didn't finish within the time-out 300000
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

