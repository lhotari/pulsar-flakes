        
Flaky-test: org.apache.pulsar.broker.service.persistent.ShadowTopicTest.testConsumeShadowMessageWithoutCache
Number of failures: 6

org.apache.pulsar.broker.service.persistent.ShadowTopicTest is flaky. The testConsumeShadowMessageWithoutCache test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.persistent.ShadowTopicTest.testConsumeShadowMessageWithoutCache() didn't finish within the time-out 300000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-19T02:21:27.4831148Z](https://github.com/apache/pulsar/actions/runs/23275934973/job/67679482457#step:11:1770)  
[example failure 2026-03-18T00:12:59.0204959Z](https://github.com/apache/pulsar/actions/runs/23221716233/job/67496336569#step:11:1772)  
[example failure 2026-03-17T23:56:39.8736100Z](https://github.com/apache/pulsar/actions/runs/23221222844/job/67494863930#step:11:1871)  
[example failure 2026-03-17T23:49:17.6220695Z](https://github.com/apache/pulsar/actions/runs/23221035406/job/67494178349#step:11:1770)  
[example failure 2026-03-17T23:32:01.5060585Z](https://github.com/apache/pulsar/actions/runs/23220417973/job/67492524743#step:11:1762)  
[example failure 2026-03-17T01:22:55.0314294Z](https://github.com/apache/pulsar/actions/runs/23173173743/job/67330162536#step:11:1765)  


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

