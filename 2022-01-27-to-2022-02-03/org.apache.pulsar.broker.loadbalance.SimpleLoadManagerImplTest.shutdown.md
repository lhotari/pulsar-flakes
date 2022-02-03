        
Flaky-test: org.apache.pulsar.broker.loadbalance.SimpleLoadManagerImplTest.shutdown
Number of failures: 1

org.apache.pulsar.broker.loadbalance.SimpleLoadManagerImplTest is flaky. The shutdown test method fails sporadically.

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /loadbalance/brokers/localhost:35469
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:777)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:264)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$6(ZKMetadataStore.java:176)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:490)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:722)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:563)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /loadbalance/brokers/localhost:35469
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:422)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /loadbalance/brokers/localhost:35469
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-29T06:39:27.9501653Z](https://github.com/apache/pulsar/runs/4989586769?check_suite_focus=true?check_suite_focus=true#step:9:1975)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /loadbalance/brokers/localhost:35469
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:777)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:264)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$6(ZKMetadataStore.java:176)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:490)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:722)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:563)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /loadbalance/brokers/localhost:35469
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:422)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /loadbalance/brokers/localhost:35469
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:122)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:418)
	... 5 more

</pre></code>
</details>

