        
Flaky-test: org.apache.pulsar.metadata.MetadataCacheTest.crossStoreUpdates
Number of failures: 1

org.apache.pulsar.metadata.MetadataCacheTest is flaky. The crossStoreUpdates test method fails sporadically.

```
org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.<init>(ZKMetadataStore.java:82)
	at org.apache.pulsar.metadata.api.MetadataStoreFactory.create(MetadataStoreFactory.java:48)
	at org.apache.pulsar.metadata.MetadataCacheTest.crossStoreUpdates(MetadataCacheTest.java:107)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-03-31T07:57:55.9448233Z](https://github.com/apache/pulsar/actions/runs/4572796692/jobs/8072449598#step:8:1537)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.<init>(ZKMetadataStore.java:82)
	at org.apache.pulsar.metadata.api.MetadataStoreFactory.create(MetadataStoreFactory.java:48)
	at org.apache.pulsar.metadata.MetadataCacheTest.crossStoreUpdates(MetadataCacheTest.java:107)
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
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:102)
	at org.apache.bookkeeper.zookeeper.ZooKeeperWatcherBase.waitForConnection(ZooKeeperWatcherBase.java:159)
	at org.apache.bookkeeper.zookeeper.ZooKeeperClient$Builder.build(ZooKeeperClient.java:260)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.<init>(ZKMetadataStore.java:79)
	... 14 more

</pre></code>
</details>

