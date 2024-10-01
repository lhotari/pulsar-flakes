        
Flaky-test: org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_4.setup
Number of failures: 1

org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_4 is flaky. The setup test method fails sporadically.

```
org.testcontainers.containers.ContainerLaunchException: Container startup failed for image apachepulsar/pulsar:2.4.0
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:349)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at org.apache.pulsar.tests.integration.containers.PulsarContainer.start(PulsarContainer.java:251)
	at org.apache.pulsar.tests.integration.topologies.PulsarStandaloneTestBase.startCluster(PulsarStandaloneTestBase.java:87)
	at org.apache.pulsar.tests.integration.suites.PulsarStandaloneTestSuite.setUpCluster(PulsarStandaloneTestSuite.java:39)
	at org.apache.pulsar.tests.integration.suites.PulsarStandaloneTestSuite.setup(PulsarStandaloneTestSuite.java:50)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-09-26T12:43:18.0904639Z](https://github.com/apache/pulsar/actions/runs/11051928931/job/30703892691#step:12:3267)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testcontainers.containers.ContainerLaunchException: Container startup failed for image apachepulsar/pulsar:2.4.0
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:349)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at org.apache.pulsar.tests.integration.containers.PulsarContainer.start(PulsarContainer.java:251)
	at org.apache.pulsar.tests.integration.topologies.PulsarStandaloneTestBase.startCluster(PulsarStandaloneTestBase.java:87)
	at org.apache.pulsar.tests.integration.suites.PulsarStandaloneTestSuite.setUpCluster(PulsarStandaloneTestSuite.java:39)
	at org.apache.pulsar.tests.integration.suites.PulsarStandaloneTestSuite.setup(PulsarStandaloneTestSuite.java:50)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:69)
	at org.testng.internal.invokers.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:361)
	at org.testng.internal.invokers.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:296)
	at org.testng.internal.invokers.TestMethodWorker.invokeBeforeClassMethods(TestMethodWorker.java:180)
	at org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:122)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:829)
	at org.testng.TestRunner.run(TestRunner.java:602)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:437)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:431)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:391)
	at org.testng.SuiteRunner.run(SuiteRunner.java:330)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:95)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1256)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1176)
	at org.testng.TestNG.runSuites(TestNG.java:1099)
	at org.testng.TestNG.run(TestNG.java:1067)
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:308)
	at org.apache.maven.surefire.testng.TestNGXmlTestSuite.execute(TestNGXmlTestSuite.java:71)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:113)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
Caused by: org.rnorth.ducttape.RetryCountExceededException: Retry limit hit with exception
	at org.rnorth.ducttape.unreliables.Unreliables.retryUntilSuccess(Unreliables.java:88)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:334)
	... 35 more
Caused by: org.testcontainers.containers.ContainerLaunchException: Could not create/start container
	at org.testcontainers.containers.GenericContainer.tryStart(GenericContainer.java:553)
	at org.testcontainers.containers.GenericContainer.lambda$doStart$0(GenericContainer.java:344)
	at org.rnorth.ducttape.unreliables.Unreliables.retryUntilSuccess(Unreliables.java:81)
	... 36 more
Caused by: org.testcontainers.containers.ContainerLaunchException: Timed out waiting for URL to be accessible (http://localhost:32781/admin/v2/namespaces/public/default should return HTTP [200])
	at org.testcontainers.containers.wait.strategy.HttpWaitStrategy.waitUntilReady(HttpWaitStrategy.java:320)
	at org.testcontainers.containers.wait.strategy.AbstractWaitStrategy.waitUntilReady(AbstractWaitStrategy.java:52)
	at org.testcontainers.containers.GenericContainer.waitUntilContainerStarted(GenericContainer.java:964)
	at org.testcontainers.containers.GenericContainer.tryStart(GenericContainer.java:490)
	... 38 more
Caused by: org.rnorth.ducttape.TimeoutException: Timeout waiting for result with exception
	at org.rnorth.ducttape.unreliables.Unreliables.retryUntilSuccess(Unreliables.java:54)
	at org.testcontainers.containers.wait.strategy.HttpWaitStrategy.waitUntilReady(HttpWaitStrategy.java:252)
	... 41 more
Caused by: java.lang.RuntimeException: HTTP response code was: 404
	at org.testcontainers.containers.wait.strategy.HttpWaitStrategy.lambda$null$6(HttpWaitStrategy.java:296)
	at org.rnorth.ducttape.ratelimits.RateLimiter.doWhenReady(RateLimiter.java:27)
	at org.testcontainers.containers.wait.strategy.HttpWaitStrategy.lambda$waitUntilReady$7(HttpWaitStrategy.java:257)
	at org.rnorth.ducttape.unreliables.Unreliables.lambda$retryUntilSuccess$0(Unreliables.java:43)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:840)

</pre></code>
</details>

