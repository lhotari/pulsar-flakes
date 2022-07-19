        
Flaky-test: org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost
Number of failures: 4

org.apache.pulsar.metadata.ZKSessionTest is flaky. The testReacquireLocksAfterSessionLost test method fails sporadically.

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$5(ZKMetadataStore.java:165)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$6(ZKMetadataStore.java:165)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:490)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:714)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:432)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$6(ZKMetadataStore.java:164)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-10T05:46:19.2153641Z](https://github.com/apache/pulsar/runs/6825361405?check_suite_focus=true#step:10:10350)  
[example failure 2022-06-08T08:26:38.5384786Z](https://github.com/apache/pulsar/runs/6789070546?check_suite_focus=true#step:10:633)  
[example failure 2022-06-07T02:33:52.2541064Z](https://github.com/apache/pulsar/runs/6766330214?check_suite_focus=true#step:10:10295)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$5(ZKMetadataStore.java:165)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$6(ZKMetadataStore.java:165)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:490)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:714)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:432)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$6(ZKMetadataStore.java:164)
	... 3 more
Caused by: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:134)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:422)
	... 4 more

</pre></code>
</details>

```
java.lang.AssertionError: expected [Reconnected] but found [null]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:131)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-08T23:47:34.9798461Z](https://github.com/apache/pulsar/runs/6803517352?check_suite_focus=true#step:10:527)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [Reconnected] but found [null]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:131)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

