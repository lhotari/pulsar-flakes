        
Flaky-test: org.apache.pulsar.client.api.NonPersistentTopicTest.testNonPersistentBrokerModeRejectPersistentTopic
Number of failures: 1

org.apache.pulsar.client.api.NonPersistentTopicTest is flaky. The testNonPersistentBrokerModeRejectPersistentTopic test method fails sporadically.

```
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Resource at /loadbalance/brokers/localhost:37741 is already locked
	at org.apache.pulsar.broker.loadbalance.impl.SimpleLoadManagerImpl.start(SimpleLoadManagerImpl.java:285)
	at org.apache.pulsar.client.api.NonPersistentTopicTest.testNonPersistentBrokerModeRejectPersistentTopic(NonPersistentTopicTest.java:795)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-22T09:41:38.2155231Z](https://github.com/apache/pulsar/runs/4284301115?check_suite_focus=true?check_suite_focus=true#step:9:1315)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Resource at /loadbalance/brokers/localhost:37741 is already locked
	at org.apache.pulsar.broker.loadbalance.impl.SimpleLoadManagerImpl.start(SimpleLoadManagerImpl.java:285)
	at org.apache.pulsar.client.api.NonPersistentTopicTest.testNonPersistentBrokerModeRejectPersistentTopic(NonPersistentTopicTest.java:795)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Resource at /loadbalance/brokers/localhost:37741 is already locked
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.broker.loadbalance.impl.SimpleLoadManagerImpl.start(SimpleLoadManagerImpl.java:268)
	... 13 more
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Resource at /loadbalance/brokers/localhost:37741 is already locked
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.lambda$acquireWithNoRevalidation$8(ResourceLockImpl.java:179)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:986)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionallyStage(CompletableFuture.java:1004)
	at java.base/java.util.concurrent.CompletableFuture.exceptionally(CompletableFuture.java:2307)
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.acquireWithNoRevalidation(ResourceLockImpl.java:177)
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.lambda$revalidate$14(ResourceLockImpl.java:277)
	at java.base/java.util.concurrent.CompletableFuture.uniComposeStage(CompletableFuture.java:1106)
	at java.base/java.util.concurrent.CompletableFuture.thenCompose(CompletableFuture.java:2235)
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.lambda$revalidate$16(ResourceLockImpl.java:277)
	at java.base/java.util.concurrent.CompletableFuture.uniComposeStage(CompletableFuture.java:1106)
	at java.base/java.util.concurrent.CompletableFuture.thenCompose(CompletableFuture.java:2235)
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.revalidate(ResourceLockImpl.java:227)
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.lambda$acquire$6(ResourceLockImpl.java:144)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:986)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionallyStage(CompletableFuture.java:1004)
	at java.base/java.util.concurrent.CompletableFuture.exceptionally(CompletableFuture.java:2307)
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.acquire(ResourceLockImpl.java:142)
	at org.apache.pulsar.metadata.coordination.impl.LockManagerImpl.acquireLock(LockManagerImpl.java:77)
	... 14 more

</pre></code>
</details>

