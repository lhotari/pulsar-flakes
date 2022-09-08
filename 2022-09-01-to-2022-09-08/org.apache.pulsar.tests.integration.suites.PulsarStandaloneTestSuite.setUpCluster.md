        
Flaky-test: org.apache.pulsar.tests.integration.suites.PulsarStandaloneTestSuite.setUpCluster
Number of failures: 1

org.apache.pulsar.tests.integration.suites.PulsarStandaloneTestSuite is flaky. The setUpCluster test method fails sporadically.

```
org.testcontainers.containers.ContainerLaunchException: Container startup failed
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:330)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:311)
	at org.apache.pulsar.tests.integration.containers.PulsarContainer.start(PulsarContainer.java:150)
	at org.apache.pulsar.tests.integration.topologies.PulsarStandaloneTestBase.startCluster(PulsarStandaloneTestBase.java:76)
	at org.apache.pulsar.tests.integration.suites.PulsarStandaloneTestSuite.setUpCluster(PulsarStandaloneTestSuite.java:31)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-05T08:21:02.8752649Z](https://github.com/apache/pulsar/runs/7191875372?check_suite_focus=true#step:12:1512)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testcontainers.containers.ContainerLaunchException: Container startup failed
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:330)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:311)
	at org.apache.pulsar.tests.integration.containers.PulsarContainer.start(PulsarContainer.java:150)
	at org.apache.pulsar.tests.integration.topologies.PulsarStandaloneTestBase.startCluster(PulsarStandaloneTestBase.java:76)
	at org.apache.pulsar.tests.integration.suites.PulsarStandaloneTestSuite.setUpCluster(PulsarStandaloneTestSuite.java:31)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:327)
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
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:323)
	... 27 more
Caused by: org.testcontainers.containers.ContainerLaunchException: Could not create/start container
	at org.testcontainers.containers.GenericContainer.tryStart(GenericContainer.java:497)
	at org.testcontainers.containers.GenericContainer.lambda$doStart$0(GenericContainer.java:325)
	at org.rnorth.ducttape.unreliables.Unreliables.retryUntilSuccess(Unreliables.java:81)
	... 28 more
Caused by: java.lang.IllegalStateException: Container exited with code 255
	at org.testcontainers.containers.GenericContainer.tryStart(GenericContainer.java:469)
	... 30 more

</pre></code>
</details>

