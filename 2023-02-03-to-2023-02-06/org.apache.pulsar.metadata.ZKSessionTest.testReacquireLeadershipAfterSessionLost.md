        
Flaky-test: org.apache.pulsar.metadata.ZKSessionTest.testReacquireLeadershipAfterSessionLost
Number of failures: 6

org.apache.pulsar.metadata.ZKSessionTest is flaky. The testReacquireLeadershipAfterSessionLost test method fails sporadically.

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-1836758653479
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:304)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$5(ZKMetadataStore.java:216)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-1836758653479
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:472)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-1836758653479
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-04T00:35:10.2964500Z](https://github.com/apache/pulsar/actions/runs/4088804128/jobs/7051007771#step:11:10436)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-1836758653479
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:304)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$5(ZKMetadataStore.java:216)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-1836758653479
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:472)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-1836758653479
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:466)
	... 5 more

</pre></code>
</details>

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-2370819345981
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:304)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$5(ZKMetadataStore.java:216)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-2370819345981
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:472)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-2370819345981
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-04T18:35:18.8738792Z](https://github.com/apache/pulsar/actions/runs/4092731997/jobs/7057712179#step:11:517)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-2370819345981
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:304)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$5(ZKMetadataStore.java:216)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-2370819345981
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:472)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-2370819345981
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:466)
	... 5 more

</pre></code>
</details>

```
java.lang.AssertionError: expected [SessionReestablished] but found [SessionLost]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1413)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:643)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLeadershipAfterSessionLost(ZKSessionTest.java:178)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-06T10:53:30.3991695Z](https://github.com/apache/pulsar/actions/runs/4095494412/jobs/7075810247#step:11:519)  
[example failure 2023-02-04T03:43:13.1519937Z](https://github.com/apache/pulsar/actions/runs/4089625319/jobs/7052571463#step:11:10480)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [SessionReestablished] but found [SessionLost]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1413)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:643)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLeadershipAfterSessionLost(ZKSessionTest.java:178)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-2343732549506
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:304)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$5(ZKMetadataStore.java:216)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-2343732549506
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:472)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-2343732549506
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-05T15:07:25.2069105Z](https://github.com/apache/pulsar/actions/runs/4097007616/jobs/7065136566#step:11:10483)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-2343732549506
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:304)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$5(ZKMetadataStore.java:216)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-2343732549506
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:472)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-2343732549506
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:466)
	... 5 more

</pre></code>
</details>

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-1968811028774
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:304)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$5(ZKMetadataStore.java:216)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-1968811028774
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:472)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-1968811028774
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-04T01:06:19.4447628Z](https://github.com/apache/pulsar/actions/runs/4088378502/jobs/7051315589#step:11:10439)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-1968811028774
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:304)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$5(ZKMetadataStore.java:216)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-1968811028774
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:472)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-1968811028774
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:466)
	... 5 more

</pre></code>
</details>

