        
Flaky-test: org.apache.pulsar.tests.integration.functions.go.PulsarFunctionsGoThreadTest.setupBeforeClass
Number of failures: 1

org.apache.pulsar.tests.integration.functions.go.PulsarFunctionsGoThreadTest is flaky. The setupBeforeClass test method fails sporadically.

```
org.testcontainers.containers.ContainerLaunchException: Container startup failed
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:330)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:311)
	at org.apache.pulsar.tests.integration.containers.PulsarContainer.start(PulsarContainer.java:182)
	at org.apache.pulsar.tests.integration.topologies.PulsarCluster.start(PulsarCluster.java:234)
	at org.apache.pulsar.tests.integration.topologies.PulsarClusterTestBase.setupCluster(PulsarClusterTestBase.java:122)
	at org.apache.pulsar.tests.integration.topologies.PulsarClusterTestBase.setupCluster(PulsarClusterTestBase.java:100)
	at org.apache.pulsar.tests.integration.topologies.PulsarClusterTestBase.setupCluster(PulsarClusterTestBase.java:89)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTestBase.setupCluster(PulsarFunctionsTestBase.java:107)
	at org.apache.pulsar.tests.integration.topologies.PulsarClusterTestBase.setup(PulsarClusterTestBase.java:33)
	at org.apache.pulsar.tests.integration.suites.PulsarTestSuite.setupBeforeClass(PulsarTestSuite.java:30)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-07T07:49:24.4057083Z](https://github.com/apache/pulsar/runs/3824011759?check_suite_focus=true?check_suite_focus=true#step:13:9550)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testcontainers.containers.ContainerLaunchException: Container startup failed
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:330)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:311)
	at org.apache.pulsar.tests.integration.containers.PulsarContainer.start(PulsarContainer.java:182)
	at org.apache.pulsar.tests.integration.topologies.PulsarCluster.start(PulsarCluster.java:234)
	at org.apache.pulsar.tests.integration.topologies.PulsarClusterTestBase.setupCluster(PulsarClusterTestBase.java:122)
	at org.apache.pulsar.tests.integration.topologies.PulsarClusterTestBase.setupCluster(PulsarClusterTestBase.java:100)
	at org.apache.pulsar.tests.integration.topologies.PulsarClusterTestBase.setupCluster(PulsarClusterTestBase.java:89)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTestBase.setupCluster(PulsarFunctionsTestBase.java:107)
	at org.apache.pulsar.tests.integration.topologies.PulsarClusterTestBase.setup(PulsarClusterTestBase.java:33)
	at org.apache.pulsar.tests.integration.suites.PulsarTestSuite.setupBeforeClass(PulsarTestSuite.java:30)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestMethodWorker.invokeBeforeClassMethods(TestMethodWorker.java:176)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:122)
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
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:283)
	at org.apache.maven.surefire.testng.TestNGXmlTestSuite.execute(TestNGXmlTestSuite.java:75)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:120)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=apachepulsar/pulsar-test-latest-version:latest, imagePullPolicy=DefaultPullPolicy())
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1286)
	at org.testcontainers.containers.GenericContainer.logger(GenericContainer.java:615)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:320)
	... 39 more
Caused by: com.github.dockerjava.api.exception.BadRequestException: Status 400: 400 Bad Request
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.execute(DefaultInvocationBuilder.java:237)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.get(DefaultInvocationBuilder.java:202)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.get(DefaultInvocationBuilder.java:74)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.ListImagesCmdExec.execute(ListImagesCmdExec.java:41)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.ListImagesCmdExec.execute(ListImagesCmdExec.java:16)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrSyncDockerCmdExec.exec(AbstrSyncDockerCmdExec.java:21)
	at org.testcontainers.shaded.com.github.dockerjava.core.command.AbstrDockerCmd.exec(AbstrDockerCmd.java:35)
	at org.testcontainers.images.LocalImagesCache.maybeInitCache(LocalImagesCache.java:68)
	at org.testcontainers.images.LocalImagesCache.get(LocalImagesCache.java:32)
	at org.testcontainers.images.AbstractImagePullPolicy.shouldPull(AbstractImagePullPolicy.java:18)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:66)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:27)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:17)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:39)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1284)
	... 41 more

</pre></code>
</details>

