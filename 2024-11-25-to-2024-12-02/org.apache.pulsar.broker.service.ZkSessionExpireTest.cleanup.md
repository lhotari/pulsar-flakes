        
Flaky-test: org.apache.pulsar.broker.service.ZkSessionExpireTest.cleanup
Number of failures: 1

org.apache.pulsar.broker.service.ZkSessionExpireTest is flaky. The cleanup test method fails sporadically.

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$6(ZKMetadataStore.java:215)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$9(ZKMetadataStore.java:215)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:512)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:703)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:542)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:490)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$9(ZKMetadataStore.java:214)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-11-29T01:41:02.4524263Z](https://github.com/apache/pulsar/actions/runs/12077403648/job/33680406087#step:11:1228)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$6(ZKMetadataStore.java:215)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$9(ZKMetadataStore.java:215)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:512)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:703)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:542)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:490)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$9(ZKMetadataStore.java:214)
	... 3 more
Caused by: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:133)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:480)
	... 4 more

</pre></code>
</details>

