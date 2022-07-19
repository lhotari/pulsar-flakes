        
Flaky-test: org.apache.pulsar.client.impl.BinaryProtoLookupServiceTest.maxLookupRedirectsTest1
Number of failures: 4

org.apache.pulsar.client.impl.BinaryProtoLookupServiceTest is flaky. The maxLookupRedirectsTest1 test method fails sporadically.

```
java.util.concurrent.ExecutionException: java.lang.NoClassDefFoundError: Could not initialize class org.apache.pulsar.common.protocol.Commands
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.client.impl.BinaryProtoLookupServiceTest.maxLookupRedirectsTest1(BinaryProtoLookupServiceTest.java:83)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-01T13:01:20.9900495Z](https://github.com/apache/pulsar/runs/6688903109?check_suite_focus=true#step:10:6633)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.ExecutionException: java.lang.NoClassDefFoundError: Could not initialize class org.apache.pulsar.common.protocol.Commands
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.client.impl.BinaryProtoLookupServiceTest.maxLookupRedirectsTest1(BinaryProtoLookupServiceTest.java:83)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:70)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: java.lang.NoClassDefFoundError: Could not initialize class org.apache.pulsar.common.protocol.Commands
	at org.apache.pulsar.client.impl.BinaryProtoLookupService.lambda$findBroker$2(BinaryProtoLookupService.java:117)
	at java.base/java.util.concurrent.CompletableFuture.uniAcceptNow(CompletableFuture.java:757)
	at java.base/java.util.concurrent.CompletableFuture.uniAcceptStage(CompletableFuture.java:735)
	at java.base/java.util.concurrent.CompletableFuture.thenAccept(CompletableFuture.java:2182)
	at org.apache.pulsar.client.impl.BinaryProtoLookupService.findBroker(BinaryProtoLookupService.java:115)
	at org.apache.pulsar.client.impl.BinaryProtoLookupService.getBroker(BinaryProtoLookupService.java:94)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$m2Y46IFK.invokeWithArguments(Unknown Source)
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
	at org.apache.pulsar.client.impl.BinaryProtoLookupService.getBroker(BinaryProtoLookupService.java:94)
	... 13 more

</pre></code>
</details>

[example failure 2022-07-12T18:56:57.8877823Z](https://github.com/apache/pulsar/runs/7305439196?check_suite_focus=true#step:10:7121)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.ExecutionException: java.lang.NoClassDefFoundError: Could not initialize class org.apache.pulsar.common.protocol.Commands
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.client.impl.BinaryProtoLookupServiceTest.maxLookupRedirectsTest1(BinaryProtoLookupServiceTest.java:83)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:70)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: java.lang.NoClassDefFoundError: Could not initialize class org.apache.pulsar.common.protocol.Commands
	at org.apache.pulsar.client.impl.BinaryProtoLookupService.lambda$findBroker$2(BinaryProtoLookupService.java:117)
	at java.base/java.util.concurrent.CompletableFuture.uniAcceptNow(CompletableFuture.java:757)
	at java.base/java.util.concurrent.CompletableFuture.uniAcceptStage(CompletableFuture.java:735)
	at java.base/java.util.concurrent.CompletableFuture.thenAccept(CompletableFuture.java:2182)
	at org.apache.pulsar.client.impl.BinaryProtoLookupService.findBroker(BinaryProtoLookupService.java:115)
	at org.apache.pulsar.client.impl.BinaryProtoLookupService.getBroker(BinaryProtoLookupService.java:94)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$0a2ZKkvl.invokeWithArguments(Unknown Source)
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
	at org.apache.pulsar.client.impl.BinaryProtoLookupService.getBroker(BinaryProtoLookupService.java:94)
	... 13 more

</pre></code>
</details>

[example failure 2022-06-02T02:00:12.5825590Z](https://github.com/apache/pulsar/runs/6701039357?check_suite_focus=true#step:9:3405)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.ExecutionException: java.lang.NoClassDefFoundError: Could not initialize class org.apache.pulsar.common.protocol.Commands
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.client.impl.BinaryProtoLookupServiceTest.maxLookupRedirectsTest1(BinaryProtoLookupServiceTest.java:83)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:70)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: java.lang.NoClassDefFoundError: Could not initialize class org.apache.pulsar.common.protocol.Commands
	at org.apache.pulsar.client.impl.BinaryProtoLookupService.lambda$findBroker$2(BinaryProtoLookupService.java:117)
	at java.base/java.util.concurrent.CompletableFuture.uniAcceptNow(CompletableFuture.java:757)
	at java.base/java.util.concurrent.CompletableFuture.uniAcceptStage(CompletableFuture.java:735)
	at java.base/java.util.concurrent.CompletableFuture.thenAccept(CompletableFuture.java:2182)
	at org.apache.pulsar.client.impl.BinaryProtoLookupService.findBroker(BinaryProtoLookupService.java:115)
	at org.apache.pulsar.client.impl.BinaryProtoLookupService.getBroker(BinaryProtoLookupService.java:94)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$mIL31Hf7.invokeWithArguments(Unknown Source)
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
	at org.apache.pulsar.client.impl.BinaryProtoLookupService.getBroker(BinaryProtoLookupService.java:94)
	... 13 more

</pre></code>
</details>

[example failure 2022-07-12T18:50:43.3148318Z](https://github.com/apache/pulsar/runs/7305439196?check_suite_focus=true#step:10:3471)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.ExecutionException: java.lang.NoClassDefFoundError: Could not initialize class org.apache.pulsar.common.protocol.Commands
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.client.impl.BinaryProtoLookupServiceTest.maxLookupRedirectsTest1(BinaryProtoLookupServiceTest.java:83)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:70)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: java.lang.NoClassDefFoundError: Could not initialize class org.apache.pulsar.common.protocol.Commands
	at org.apache.pulsar.client.impl.BinaryProtoLookupService.lambda$findBroker$2(BinaryProtoLookupService.java:117)
	at java.base/java.util.concurrent.CompletableFuture.uniAcceptNow(CompletableFuture.java:757)
	at java.base/java.util.concurrent.CompletableFuture.uniAcceptStage(CompletableFuture.java:735)
	at java.base/java.util.concurrent.CompletableFuture.thenAccept(CompletableFuture.java:2182)
	at org.apache.pulsar.client.impl.BinaryProtoLookupService.findBroker(BinaryProtoLookupService.java:115)
	at org.apache.pulsar.client.impl.BinaryProtoLookupService.getBroker(BinaryProtoLookupService.java:94)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$qE1QdQiF.invokeWithArguments(Unknown Source)
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
	at org.apache.pulsar.client.impl.BinaryProtoLookupService.getBroker(BinaryProtoLookupService.java:94)
	... 13 more

</pre></code>
</details>

