        
Flaky-test: org.apache.pulsar.broker.loadbalance.AdvertisedListenersTest.setup
Number of failures: 1

org.apache.pulsar.broker.loadbalance.AdvertisedListenersTest is flaky. The setup test method fails sporadically.

```
org.apache.pulsar.broker.PulsarServerException: org.apache.pulsar.broker.PulsarServerException: java.io.IOException: Failed to bind to /0.0.0.0:40659
	at org.apache.pulsar.broker.PulsarService.start(PulsarService.java:911)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: org.apache.pulsar.broker.PulsarServerException: java.io.IOException: Failed to bind to /0.0.0.0:40659
	at org.apache.pulsar.broker.web.WebService.start(WebService.java:321)
	at org.apache.pulsar.broker.PulsarService.start(PulsarService.java:792)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$OtKjxULD.invokeWithArguments(Unknown Source)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.invoke(InstrumentationMemberAccessor.java:239)
	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-11T08:02:44.6370841Z](https://github.com/apache/pulsar/actions/runs/3224852738/jobs/5276757438#step:10:907)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.broker.PulsarServerException: org.apache.pulsar.broker.PulsarServerException: java.io.IOException: Failed to bind to /0.0.0.0:40659
	at org.apache.pulsar.broker.PulsarService.start(PulsarService.java:911)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: org.apache.pulsar.broker.PulsarServerException: java.io.IOException: Failed to bind to /0.0.0.0:40659
	at org.apache.pulsar.broker.web.WebService.start(WebService.java:321)
	at org.apache.pulsar.broker.PulsarService.start(PulsarService.java:792)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$OtKjxULD.invokeWithArguments(Unknown Source)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.invoke(InstrumentationMemberAccessor.java:239)
	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:333)
	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.access$500(MockMethodAdvice.java:60)
	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:253)
	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
	at org.mockito.Answers.answer(Answers.java:99)
	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:110)
	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
	at org.apache.pulsar.broker.PulsarService.start(PulsarService.java:664)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.startBrokerWithoutAuthorization(MockedPulsarServiceBaseTest.java:356)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.startBroker(MockedPulsarServiceBaseTest.java:348)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.startBroker(MockedPulsarServiceBaseTest.java:325)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.init(MockedPulsarServiceBaseTest.java:228)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalSetup(MockedPulsarServiceBaseTest.java:153)
	at org.apache.pulsar.broker.MultiBrokerBaseTest.setup(MultiBrokerBaseTest.java:49)
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
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	... 1 more
Caused by: java.io.IOException: Failed to bind to /0.0.0.0:40659
	at org.eclipse.jetty.server.ServerConnector.openAcceptChannel(ServerConnector.java:349)
	at org.eclipse.jetty.server.ServerConnector.open(ServerConnector.java:310)
	at org.eclipse.jetty.server.AbstractNetworkConnector.doStart(AbstractNetworkConnector.java:80)
	at org.eclipse.jetty.server.ServerConnector.doStart(ServerConnector.java:234)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:73)
	at org.eclipse.jetty.server.Server.doStart(Server.java:401)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:73)
	at org.apache.pulsar.broker.web.WebService.start(WebService.java:304)
	... 55 more
Caused by: java.net.BindException: Address already in use
	at java.base/sun.nio.ch.Net.bind0(Native Method)
	at java.base/sun.nio.ch.Net.bind(Net.java:555)
	at java.base/sun.nio.ch.ServerSocketChannelImpl.netBind(ServerSocketChannelImpl.java:337)
	at java.base/sun.nio.ch.ServerSocketChannelImpl.bind(ServerSocketChannelImpl.java:294)
	at java.base/sun.nio.ch.ServerSocketAdaptor.bind(ServerSocketAdaptor.java:89)
	at org.eclipse.jetty.server.ServerConnector.openAcceptChannel(ServerConnector.java:344)
	... 62 more

</pre></code>
</details>

