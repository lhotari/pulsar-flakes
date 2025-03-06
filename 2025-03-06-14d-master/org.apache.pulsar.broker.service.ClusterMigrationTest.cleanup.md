        
Flaky-test: org.apache.pulsar.broker.service.ClusterMigrationTest.cleanup
Number of failures: 1

org.apache.pulsar.broker.service.ClusterMigrationTest is flaky. The cleanup test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.ClusterMigrationTest.cleanup() didn't finish within the time-out 300000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-02-23T06:27:21.0875270Z](https://github.com/apache/pulsar/actions/runs/13480266456/job/37664763686#step:11:1724)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.ClusterMigrationTest.cleanup() didn't finish within the time-out 300000
	at java.base@17.0.14/jdk.internal.misc.Unsafe.park(Native Method)
	at java.base@17.0.14/java.util.concurrent.locks.LockSupport.park(LockSupport.java:211)
	at java.base@17.0.14/java.util.concurrent.CompletableFuture$Signaller.block(CompletableFuture.java:1864)
	at java.base@17.0.14/java.util.concurrent.ForkJoinPool.unmanagedBlock(ForkJoinPool.java:3465)
	at java.base@17.0.14/java.util.concurrent.ForkJoinPool.managedBlock(ForkJoinPool.java:3436)
	at java.base@17.0.14/java.util.concurrent.CompletableFuture.waitingGet(CompletableFuture.java:1898)
	at java.base@17.0.14/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2072)
	at app//org.apache.pulsar.broker.systopic.TopicPoliciesSystemTopicClient$TopicPolicyReader.close(TopicPoliciesSystemTopicClient.java:201)
	at app//org.apache.pulsar.broker.service.SystemTopicBasedTopicPoliciesService.lambda$close$30(SystemTopicBasedTopicPoliciesService.java:709)
	at app//org.apache.pulsar.broker.service.SystemTopicBasedTopicPoliciesService$$Lambda$2018/0x00007f02c8c98b28.accept(Unknown Source)
	at java.base@17.0.14/java.util.concurrent.ConcurrentHashMap$ValuesView.forEach(ConcurrentHashMap.java:4780)
	at app//org.apache.pulsar.broker.service.SystemTopicBasedTopicPoliciesService.close(SystemTopicBasedTopicPoliciesService.java:705)
	at app//org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:522)
	at java.base@17.0.14/java.lang.invoke.DirectMethodHandle$Holder.invokeVirtual(DirectMethodHandle$Holder)
	at java.base@17.0.14/java.lang.invoke.LambdaForm$MH/0x00007f02c84f0000.invoke(LambdaForm$MH)
	at java.base@17.0.14/java.lang.invoke.LambdaForm$MH/0x00007f02c84f0400.invoke(LambdaForm$MH)
	at java.base@17.0.14/java.lang.invoke.LambdaForm$MH/0x00007f02c84f0800.invokeExact_MT(LambdaForm$MH)
	at java.base@17.0.14/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$gT02rbqq.invokeWithArguments(Unknown Source)
	at app//org.mockito.internal.util.reflection.InstrumentationMemberAccessor.invoke(InstrumentationMemberAccessor.java:251)
	at app//org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
	at app//org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:314)
	at app//org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:234)
	at app//org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
	at app//org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
	at app//org.mockito.Answers.answer(Answers.java:90)
	at app//org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:111)
	at app//org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
	at app//org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
	at app//org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
	at app//org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:134)
	at app//org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:509)
	at app//org.apache.pulsar.broker.PulsarService.close(PulsarService.java:484)
	at java.base@17.0.14/java.lang.invoke.LambdaForm$DMH/0x00007f02c819c000.invokeVirtual(LambdaForm$DMH)
	at java.base@17.0.14/java.lang.invoke.LambdaForm$MH/0x00007f02c85d4c00.invoke(LambdaForm$MH)
	at java.base@17.0.14/java.lang.invoke.LambdaForm$MH/0x00007f02c84f0400.invoke(LambdaForm$MH)
	at java.base@17.0.14/java.lang.invoke.LambdaForm$MH/0x00007f02c84f0800.invokeExact_MT(LambdaForm$MH)
	at java.base@17.0.14/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$gT02rbqq.invokeWithArguments(Unknown Source)
	at app//org.mockito.internal.util.reflection.InstrumentationMemberAccessor.invoke(InstrumentationMemberAccessor.java:251)
	at app//org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
	at app//org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:314)
	at app//org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:234)
	at app//org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
	at app//org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
	at app//org.mockito.Answers.answer(Answers.java:90)
	at app//org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:111)
	at app//org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
	at app//org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
	at app//org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
	at app//org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:134)
	at app//org.apache.pulsar.broker.PulsarService.close(PulsarService.java:484)
	at app//org.apache.pulsar.broker.testcontext.PulsarTestContext$StartableCustomBuilder.lambda$initializePulsarServices$0(PulsarTestContext.java:854)
	at app//org.apache.pulsar.broker.testcontext.PulsarTestContext$StartableCustomBuilder$$Lambda$612/0x00007f02c85d09b0.close(Unknown Source)
	at app//org.apache.pulsar.broker.testcontext.PulsarTestContext.callCloseables(PulsarTestContext.java:224)
	at app//org.apache.pulsar.broker.testcontext.PulsarTestContext.close(PulsarTestContext.java:218)
	at app//org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalCleanup(MockedPulsarServiceBaseTest.java:295)
	at app//org.apache.pulsar.broker.service.ClusterMigrationTest$TestBroker.cleanup(ClusterMigrationTest.java:1237)
	at app//org.apache.pulsar.broker.service.ClusterMigrationTest.cleanup(ClusterMigrationTest.java:236)
	at java.base@17.0.14/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base@17.0.14/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base@17.0.14/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base@17.0.14/java.lang.reflect.Method.invoke(Method.java:569)
	at app//org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base@17.0.14/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base@17.0.14/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base@17.0.14/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base@17.0.14/java.lang.Thread.run(Thread.java:840)

</pre></code>
</details>

