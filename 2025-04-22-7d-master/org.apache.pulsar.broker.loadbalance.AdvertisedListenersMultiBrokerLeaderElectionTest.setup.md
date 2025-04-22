        
Flaky-test: org.apache.pulsar.broker.loadbalance.AdvertisedListenersMultiBrokerLeaderElectionTest.setup
Number of failures: 1

org.apache.pulsar.broker.loadbalance.AdvertisedListenersMultiBrokerLeaderElectionTest is flaky. The setup test method fails sporadically.

```
java.lang.RuntimeException: org.apache.pulsar.broker.PulsarServerException: java.io.IOException: Failed to bind to /0.0.0.0:38701
	at org.apache.pulsar.broker.testcontext.PulsarTestContext$AbstractCustomBuilder.build(PulsarTestContext.java:629)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.createAdditionalPulsarTestContext(MockedPulsarServiceBaseTest.java:521)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.createAdditionalPulsarTestContext(MockedPulsarServiceBaseTest.java:502)
	at org.apache.pulsar.broker.MultiBrokerBaseTest.createAdditionalBroker(MultiBrokerBaseTest.java:87)
	at org.apache.pulsar.broker.MultiBrokerBaseTest.additionalBrokersSetup(MultiBrokerBaseTest.java:68)
	at org.apache.pulsar.broker.MultiBrokerBaseTest.setup(MultiBrokerBaseTest.java:51)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-18T06:18:55.1365549Z](https://github.com/apache/pulsar/actions/runs/14530546485/job/40769731255#step:11:1038)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.RuntimeException: org.apache.pulsar.broker.PulsarServerException: java.io.IOException: Failed to bind to /0.0.0.0:38701
	at org.apache.pulsar.broker.testcontext.PulsarTestContext$AbstractCustomBuilder.build(PulsarTestContext.java:629)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.createAdditionalPulsarTestContext(MockedPulsarServiceBaseTest.java:521)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.createAdditionalPulsarTestContext(MockedPulsarServiceBaseTest.java:502)
	at org.apache.pulsar.broker.MultiBrokerBaseTest.createAdditionalBroker(MultiBrokerBaseTest.java:87)
	at org.apache.pulsar.broker.MultiBrokerBaseTest.additionalBrokersSetup(MultiBrokerBaseTest.java:68)
	at org.apache.pulsar.broker.MultiBrokerBaseTest.setup(MultiBrokerBaseTest.java:51)
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
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:155)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:102)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:117)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:86)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:137)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
Caused by: org.apache.pulsar.broker.PulsarServerException: java.io.IOException: Failed to bind to /0.0.0.0:38701
	at org.apache.pulsar.broker.web.WebService.start(WebService.java:419)
	at org.apache.pulsar.broker.PulsarService.start(PulsarService.java:955)
	at org.apache.pulsar.broker.testcontext.PulsarTestContext$AbstractCustomBuilder.build(PulsarTestContext.java:625)
	... 37 more
Caused by: java.io.IOException: Failed to bind to /0.0.0.0:38701
	at org.eclipse.jetty.server.ServerConnector.openAcceptChannel(ServerConnector.java:349)
	at org.eclipse.jetty.server.ServerConnector.open(ServerConnector.java:310)
	at org.eclipse.jetty.server.AbstractNetworkConnector.doStart(AbstractNetworkConnector.java:80)
	at org.eclipse.jetty.server.ServerConnector.doStart(ServerConnector.java:234)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:73)
	at org.eclipse.jetty.server.Server.doStart(Server.java:401)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:73)
	at org.apache.pulsar.broker.web.WebService.start(WebService.java:402)
	... 39 more
Caused by: java.net.BindException: Address already in use
	at java.base/sun.nio.ch.Net.bind0(Native Method)
	at java.base/sun.nio.ch.Net.bind(Net.java:555)
	at java.base/sun.nio.ch.ServerSocketChannelImpl.netBind(ServerSocketChannelImpl.java:337)
	at java.base/sun.nio.ch.ServerSocketChannelImpl.bind(ServerSocketChannelImpl.java:294)
	at java.base/sun.nio.ch.ServerSocketAdaptor.bind(ServerSocketAdaptor.java:89)
	at org.eclipse.jetty.server.ServerConnector.openAcceptChannel(ServerConnector.java:344)
	... 46 more

</pre></code>
</details>

