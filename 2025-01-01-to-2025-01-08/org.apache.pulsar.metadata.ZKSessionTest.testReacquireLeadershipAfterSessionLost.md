        
Flaky-test: org.apache.pulsar.metadata.ZKSessionTest.testReacquireLeadershipAfterSessionLost
Number of failures: 1

org.apache.pulsar.metadata.ZKSessionTest is flaky. The testReacquireLeadershipAfterSessionLost test method fails sporadically.

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$8(ZKMetadataStore.java:220)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$11(ZKMetadataStore.java:220)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:703)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:542)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:495)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$11(ZKMetadataStore.java:219)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-01-02T11:21:57.4136733Z](https://github.com/apache/pulsar/actions/runs/12580383927/job/35065709741#step:10:1731)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$8(ZKMetadataStore.java:220)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$11(ZKMetadataStore.java:220)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:703)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:542)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:495)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$11(ZKMetadataStore.java:219)
	... 3 more
Caused by: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:133)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:485)
	... 4 more

</pre></code>
</details>

