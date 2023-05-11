        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentTopicTest.testCreateTopicWithZombieReplicatorCursor
Number of failures: 1

org.apache.pulsar.broker.service.persistent.PersistentTopicTest is flaky. The testCreateTopicWithZombieReplicatorCursor test method fails sporadically.

```
java.util.concurrent.ExecutionException: java.lang.RuntimeException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: remote
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2022)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicTest.testCreateTopicWithZombieReplicatorCursor(PersistentTopicTest.java:457)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-05-06T11:42:50.6155008Z](https://github.com/apache/pulsar/actions/runs/4901334907/jobs/8752546073#step:9:431)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.ExecutionException: java.lang.RuntimeException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: remote
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2022)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicTest.testCreateTopicWithZombieReplicatorCursor(PersistentTopicTest.java:457)
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
Caused by: java.lang.RuntimeException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: remote
	at org.apache.pulsar.broker.service.BrokerService.lambda$getReplicationClient$48(BrokerService.java:1257)
	at org.apache.pulsar.common.util.collections.ConcurrentOpenHashMap$Section.put(ConcurrentOpenHashMap.java:404)
	at org.apache.pulsar.common.util.collections.ConcurrentOpenHashMap.computeIfAbsent(ConcurrentOpenHashMap.java:238)
	at org.apache.pulsar.broker.service.BrokerService.getReplicationClient(BrokerService.java:1197)
	at org.apache.pulsar.broker.service.persistent.PersistentTopic.lambda$addReplicationCluster$53(PersistentTopic.java:1562)
	at java.base/java.util.concurrent.CompletableFuture$UniApply.tryFire(CompletableFuture.java:642)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2073)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleGetResult(ZKMetadataStore.java:238)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:188)
	at org.apache.zookeeper.MockZooKeeper.multi(MockZooKeeper.java:1006)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.batchOperation(ZKMetadataStore.java:159)
	at org.apache.pulsar.metadata.impl.batching.AbstractBatchedMetadataStore.flush(AbstractBatchedMetadataStore.java:92)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: remote
	at org.apache.pulsar.broker.service.BrokerService.lambda$getReplicationClient$47(BrokerService.java:1200)
	at java.base/java.util.Optional.orElseThrow(Optional.java:408)
	at org.apache.pulsar.broker.service.BrokerService.lambda$getReplicationClient$48(BrokerService.java:1200)
	... 19 more

</pre></code>
</details>

