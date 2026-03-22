        
Flaky-test: org.apache.pulsar.broker.service.persistent.ShadowTopicTest.testConsumeShadowMessageWithoutCache
Number of failures: 2

org.apache.pulsar.broker.service.persistent.ShadowTopicTest is flaky. The testConsumeShadowMessageWithoutCache test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.persistent.ShadowTopicTest.testConsumeShadowMessageWithoutCache() didn't finish within the time-out 300000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-17T13:01:58.2453011Z](https://github.com/apache/pulsar/actions/runs/23194100184/job/67399483692#step:11:1755)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.service.persistent.ShadowTopicTest.testConsumeShadowMessageWithoutCache -- Time elapsed: 300.0 s <<< FAILURE!
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.persistent.ShadowTopicTest.testConsumeShadowMessageWithoutCache() didn't finish within the time-out 300000
	at java.base/jdk.internal.misc.Unsafe.park(Native Method)
	at java.base/java.util.concurrent.locks.LockSupport.park(LockSupport.java:371)
	at java.base/java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionNode.block(AbstractQueuedSynchronizer.java:519)
	at java.base/java.util.concurrent.ForkJoinPool.unmanagedBlock(ForkJoinPool.java:3780)
	at java.base/java.util.concurrent.ForkJoinPool.managedBlock(ForkJoinPool.java:3725)
	at java.base/java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:1746)
	at org.apache.pulsar.common.util.collections.GrowableArrayBlockingQueue.take(GrowableArrayBlockingQueue.java:200)
	at org.apache.pulsar.client.impl.ConsumerImpl.internalReceive(ConsumerImpl.java:517)
	at org.apache.pulsar.client.impl.ConsumerBase.receive(ConsumerBase.java:268)
	at org.apache.pulsar.broker.service.persistent.ShadowTopicTest.testConsumeShadowMessageWithoutCache(ShadowTopicTest.java:253)
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

[example failure 2026-03-17T06:49:03.8443682Z](https://github.com/apache/pulsar/actions/runs/23181205990/job/67355142230#step:11:1766)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.service.persistent.ShadowTopicTest.testConsumeShadowMessageWithoutCache -- Time elapsed: 300.0 s <<< FAILURE!
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.persistent.ShadowTopicTest.testConsumeShadowMessageWithoutCache() didn't finish within the time-out 300000
	at java.base@17.0.18/jdk.internal.misc.Unsafe.park(Native Method)
	at java.base@17.0.18/java.util.concurrent.locks.LockSupport.park(LockSupport.java:341)
	at java.base@17.0.18/java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionNode.block(AbstractQueuedSynchronizer.java:506)
	at java.base@17.0.18/java.util.concurrent.ForkJoinPool.unmanagedBlock(ForkJoinPool.java:3465)
	at java.base@17.0.18/java.util.concurrent.ForkJoinPool.managedBlock(ForkJoinPool.java:3436)
	at java.base@17.0.18/java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:1630)
	at app//org.apache.pulsar.common.util.collections.GrowableArrayBlockingQueue.take(GrowableArrayBlockingQueue.java:200)
	at app//org.apache.pulsar.client.impl.ConsumerImpl.internalReceive(ConsumerImpl.java:517)
	at app//org.apache.pulsar.client.impl.ConsumerBase.receive(ConsumerBase.java:268)
	at app//org.apache.pulsar.broker.service.persistent.ShadowTopicTest.testConsumeShadowMessageWithoutCache(ShadowTopicTest.java:253)
	at java.base@17.0.18/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base@17.0.18/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base@17.0.18/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base@17.0.18/java.lang.reflect.Method.invoke(Method.java:569)
	at app//org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base@17.0.18/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base@17.0.18/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base@17.0.18/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base@17.0.18/java.lang.Thread.run(Thread.java:840)

</pre></code>
</details>

