        
Flaky-test: org.apache.pulsar.metadata.MetadataCacheTest.crossStoreUpdates
Number of failures: 1

org.apache.pulsar.metadata.MetadataCacheTest is flaky. The crossStoreUpdates test method fails sporadically.

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$AlreadyExistsException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /test-key1
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.MetadataCacheTest.multiStoreAddDelete(MetadataCacheTest.java:143)
	at org.apache.pulsar.metadata.MetadataCacheTest.crossStoreUpdates(MetadataCacheTest.java:125)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-25T09:01:40.9025898Z](https://github.com/apache/pulsar/runs/3420085646?check_suite_focus=true#step:9:1511)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$AlreadyExistsException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /test-key1
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.MetadataCacheTest.multiStoreAddDelete(MetadataCacheTest.java:143)
	at org.apache.pulsar.metadata.MetadataCacheTest.crossStoreUpdates(MetadataCacheTest.java:125)
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
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$AlreadyExistsException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /test-key1
	at org.apache.pulsar.metadata.cache.impl.MetadataCacheImpl.lambda$create$12(MetadataCacheImpl.java:228)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:986)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:970)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$storePut$15(ZKMetadataStore.java:226)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /test-key1
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:308)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /test-key1
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:122)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:304)
	... 5 more

</pre></code>
</details>

