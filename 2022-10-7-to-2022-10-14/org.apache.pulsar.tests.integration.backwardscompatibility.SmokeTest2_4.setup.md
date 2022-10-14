        
Flaky-test: org.apache.pulsar.tests.integration.backwardscompatibility.SmokeTest2_4.setup
Number of failures: 1

org.apache.pulsar.tests.integration.backwardscompatibility.SmokeTest2_4 is flaky. The setup test method fails sporadically.

```
org.testcontainers.containers.ContainerLaunchException: Container startup failed
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:345)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:326)
	at org.apache.pulsar.tests.integration.containers.PulsarContainer.start(PulsarContainer.java:182)
	at org.apache.pulsar.tests.integration.topologies.PulsarStandaloneTestBase.startCluster(PulsarStandaloneTestBase.java:87)
	at org.apache.pulsar.tests.integration.suites.PulsarStandaloneTestSuite.setUpCluster(PulsarStandaloneTestSuite.java:39)
	at org.apache.pulsar.tests.integration.suites.PulsarStandaloneTestSuite.setup(PulsarStandaloneTestSuite.java:50)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-08-30T23:48:52.7240211Z](https://github.com/apache/pulsar/runs/8103645244?check_suite_focus=true#step:12:2659)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testcontainers.containers.ContainerLaunchException: Container startup failed
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:345)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:326)
	at org.apache.pulsar.tests.integration.containers.PulsarContainer.start(PulsarContainer.java:182)
	at org.apache.pulsar.tests.integration.topologies.PulsarStandaloneTestBase.startCluster(PulsarStandaloneTestBase.java:87)
	at org.apache.pulsar.tests.integration.suites.PulsarStandaloneTestSuite.setUpCluster(PulsarStandaloneTestSuite.java:39)
	at org.apache.pulsar.tests.integration.suites.PulsarStandaloneTestSuite.setup(PulsarStandaloneTestSuite.java:50)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestMethodWorker.invokeBeforeClassMethods(TestMethodWorker.java:176)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:122)
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
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:283)
	at org.apache.maven.surefire.testng.TestNGXmlTestSuite.execute(TestNGXmlTestSuite.java:75)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:120)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: org.rnorth.ducttape.RetryCountExceededException: Retry limit hit with exception
	at org.rnorth.ducttape.unreliables.Unreliables.retryUntilSuccess(Unreliables.java:88)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:338)
	... 35 more
Caused by: org.testcontainers.containers.ContainerLaunchException: Could not create/start container
	at org.testcontainers.containers.GenericContainer.tryStart(GenericContainer.java:537)
	at org.testcontainers.containers.GenericContainer.lambda$doStart$0(GenericContainer.java:340)
	at org.rnorth.ducttape.unreliables.Unreliables.retryUntilSuccess(Unreliables.java:81)
	... 36 more
Caused by: org.testcontainers.containers.ContainerLaunchException: Timed out waiting for URL to be accessible (http://localhost:49158/admin/v2/namespaces/public/default should return HTTP [200])
	at org.testcontainers.containers.wait.strategy.HttpWaitStrategy.waitUntilReady(HttpWaitStrategy.java:286)
	at org.testcontainers.containers.wait.strategy.AbstractWaitStrategy.waitUntilReady(AbstractWaitStrategy.java:51)
	at org.testcontainers.containers.GenericContainer.waitUntilContainerStarted(GenericContainer.java:926)
	at org.testcontainers.containers.GenericContainer.tryStart(GenericContainer.java:480)
	... 38 more

</pre></code>
</details>

