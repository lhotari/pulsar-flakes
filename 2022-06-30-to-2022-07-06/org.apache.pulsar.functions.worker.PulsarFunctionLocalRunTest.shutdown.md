        
Flaky-test: org.apache.pulsar.functions.worker.PulsarFunctionLocalRunTest.shutdown
Number of failures: 1

org.apache.pulsar.functions.worker.PulsarFunctionLocalRunTest is flaky. The shutdown test method fails sporadically.

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /loadbalance/brokers/localhost:39913
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:777)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$storeDelete$23(ZKMetadataStore.java:312)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /loadbalance/brokers/localhost:39913
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:345)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /loadbalance/brokers/localhost:39913
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-10T18:26:07.7260955Z](https://github.com/apache/pulsar/runs/6834700072?check_suite_focus=true#step:9:3574)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /loadbalance/brokers/localhost:39913
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:777)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$storeDelete$23(ZKMetadataStore.java:312)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /loadbalance/brokers/localhost:39913
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:345)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /loadbalance/brokers/localhost:39913
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:122)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:341)
	... 5 more

</pre></code>
</details>

