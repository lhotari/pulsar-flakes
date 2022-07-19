        
Flaky-test: org.apache.pulsar.broker.systopic.PartitionedSystemTopicTest.cleanup
Number of failures: 1

org.apache.pulsar.broker.systopic.PartitionedSystemTopicTest is flaky. The cleanup test method fails sporadically.

```
org.apache.pulsar.broker.PulsarServerException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.common.util.FutureUtil$LowOverheadTimeoutException: Closing producers and consumers timed out.
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:574)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:395)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:374)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.common.util.FutureUtil$LowOverheadTimeoutException: Closing producers and consumers timed out.
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.PulsarClientImpl.close(PulsarClientImpl.java:711)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:491)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$Kf8nzKi5.invokeWithArguments(Unknown Source)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.invoke(InstrumentationMemberAccessor.java:239)
	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-03T07:52:32.3553852Z](https://github.com/apache/pulsar/runs/6721616096?check_suite_focus=true#step:9:1876)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.broker.PulsarServerException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.common.util.FutureUtil$LowOverheadTimeoutException: Closing producers and consumers timed out.
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:574)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:395)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:374)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.common.util.FutureUtil$LowOverheadTimeoutException: Closing producers and consumers timed out.
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.PulsarClientImpl.close(PulsarClientImpl.java:711)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:491)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$Kf8nzKi5.invokeWithArguments(Unknown Source)
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
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:395)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:374)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$Kf8nzKi5.invokeWithArguments(Unknown Source)
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
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:374)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.stopBroker(MockedPulsarServiceBaseTest.java:300)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalCleanup(MockedPulsarServiceBaseTest.java:239)
	at org.apache.pulsar.broker.systopic.PartitionedSystemTopicTest.cleanup(PartitionedSystemTopicTest.java:84)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:661)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
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
	... 1 more
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.common.util.FutureUtil$LowOverheadTimeoutException: Closing producers and consumers timed out.
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.client.impl.PulsarClientImpl.close(PulsarClientImpl.java:706)
	... 76 more
Caused by: org.apache.pulsar.common.util.FutureUtil$LowOverheadTimeoutException: Closing producers and consumers timed out.
	at org.apache.pulsar.client.impl.PulsarClientImpl.closeAsync(Unknown Source)

</pre></code>
</details>

