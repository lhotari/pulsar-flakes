        
Flaky-test: org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testLoadBalancerServiceUnitTableViewSyncer
Number of failures: 3

org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest is flaky. The testLoadBalancerServiceUnitTableViewSyncer test method fails sporadically.

```
java.lang.AssertionError: did not expect [pulsar://localhost:34347] but found [pulsar://localhost:34347]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failEquals(Assert.java:1581)
	at org.testng.Assert.assertNotEqualsImpl(Assert.java:156)
	at org.testng.Assert.assertNotEquals(Assert.java:2197)
	at org.testng.Assert.assertNotEquals(Assert.java:2219)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testLoadBalancerServiceUnitTableViewSyncer(ExtensibleLoadManagerImplTest.java:1470)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-17T01:26:01.4243373Z](https://github.com/apache/pulsar/actions/runs/23173173756/job/67329540335#step:9:2663)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testLoadBalancerServiceUnitTableViewSyncer -- Time elapsed: 7.952 s <<< FAILURE!
java.lang.AssertionError: did not expect [pulsar://localhost:34347] but found [pulsar://localhost:34347]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failEquals(Assert.java:1581)
	at org.testng.Assert.assertNotEqualsImpl(Assert.java:156)
	at org.testng.Assert.assertNotEquals(Assert.java:2197)
	at org.testng.Assert.assertNotEquals(Assert.java:2219)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testLoadBalancerServiceUnitTableViewSyncer(ExtensibleLoadManagerImplTest.java:1470)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

</pre></code>
</details>

```
org.awaitility.core.ConditionTimeoutException: Assertion condition expected [true] but found [false] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testLoadBalancerServiceUnitTableViewSyncer(ExtensibleLoadManagerImplTest.java:1324)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-20T20:57:11.3510805Z](https://github.com/apache/pulsar/actions/runs/23361173619/job/67964602594#step:9:2769)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testLoadBalancerServiceUnitTableViewSyncer -- Time elapsed: 10.72 s <<< FAILURE!
org.awaitility.core.ConditionTimeoutException: Assertion condition expected [true] but found [false] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testLoadBalancerServiceUnitTableViewSyncer(ExtensibleLoadManagerImplTest.java:1324)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertTrue(Assert.java:56)
	at org.testng.Assert.assertTrue(Assert.java:66)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.lambda$testLoadBalancerServiceUnitTableViewSyncer$31(ExtensibleLoadManagerImplTest.java:1324)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	... 4 more

</pre></code>
</details>

```
java.lang.AssertionError: expected [pulsar://localhost:41727] but found [pulsar://localhost:34793]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:655)
	at org.testng.Assert.assertEquals(Assert.java:665)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testLoadBalancerServiceUnitTableViewSyncer(ExtensibleLoadManagerImplTest.java:1345)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-18T00:03:06.7446682Z](https://github.com/apache/pulsar/actions/runs/23221222824/job/67494132081#step:9:2917)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testLoadBalancerServiceUnitTableViewSyncer -- Time elapsed: 4.265 s <<< FAILURE!
java.lang.AssertionError: expected [pulsar://localhost:41727] but found [pulsar://localhost:34793]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:655)
	at org.testng.Assert.assertEquals(Assert.java:665)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testLoadBalancerServiceUnitTableViewSyncer(ExtensibleLoadManagerImplTest.java:1345)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

[ERROR] org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testHandleNoChannelOwner[true](3) -- Time elapsed: 30.00 s <<< FAILURE!
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testHandleNoChannelOwner() didn't finish within the time-out 30000
	at java.base/jdk.internal.misc.Unsafe.park(Native Method)
	at java.base/java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:269)
	at java.base/java.util.concurrent.CompletableFuture$Signaller.block(CompletableFuture.java:1866)
	at java.base/java.util.concurrent.ForkJoinPool.unmanagedBlock(ForkJoinPool.java:3780)
	at java.base/java.util.concurrent.ForkJoinPool.managedBlock(ForkJoinPool.java:3725)
	at java.base/java.util.concurrent.CompletableFuture.timedGet(CompletableFuture.java:1939)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2095)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:350)
	at org.apache.pulsar.client.admin.internal.TopicPoliciesImpl.getCompactionThreshold(TopicPoliciesImpl.java:753)
	at org.apache.pulsar.client.admin.internal.TopicPoliciesImpl.getCompactionThreshold(TopicPoliciesImpl.java:743)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImpl.configureSystemTopics(ExtensibleLoadManagerImpl.java:309)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImpl.monitor(ExtensibleLoadManagerImpl.java:1073)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:733)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$rAVJIIcH.invokeWithArguments(Unknown Source)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.invoke(InstrumentationMemberAccessor.java:265)
	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:316)
	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:236)
	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
	at org.mockito.Answers.answer(Answers.java:90)
	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:111)
	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
	at org.mockito.internal.creation.bytebuddy.access.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:84)
	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:136)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImpl.monitor(ExtensibleLoadManagerImpl.java:1048)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImpl.monitor(ExtensibleLoadManagerImpl.java:1064)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:733)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$rAVJIIcH.invokeWithArguments(Unknown Source)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.invoke(InstrumentationMemberAccessor.java:265)
	at org.mockito.internal.util.reflection.ModuleMemberAccessor.invoke(ModuleMemberAccessor.java:55)
	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.tryInvoke(MockMethodAdvice.java:316)
	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice$RealMethodCall.invoke(MockMethodAdvice.java:236)
	at org.mockito.internal.invocation.InterceptedInvocation.callRealMethod(InterceptedInvocation.java:142)
	at org.mockito.internal.stubbing.answers.CallsRealMethods.answer(CallsRealMethods.java:45)
	at org.mockito.Answers.answer(Answers.java:90)
	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:111)
	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
	at org.mockito.internal.creation.bytebuddy.access.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:84)
	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:136)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImpl.monitor(ExtensibleLoadManagerImpl.java:1048)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testHandleNoChannelOwner(ExtensibleLoadManagerImplTest.java:1708)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

</pre></code>
</details>

