        
Flaky-test: org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost
Number of failures: 4

org.apache.pulsar.metadata.ZKSessionTest is flaky. The testReacquireLocksAfterSessionLost test method fails sporadically.

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:777)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$5(ZKMetadataStore.java:161)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$6(ZKMetadataStore.java:161)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:490)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:724)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:563)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:428)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$6(ZKMetadataStore.java:160)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-29T17:05:12.2178930Z](https://github.com/apache/pulsar/runs/4991983834?check_suite_focus=true?check_suite_focus=true#step:8:19493)  
[example failure 2022-01-27T19:52:55.0932921Z](https://github.com/apache/pulsar/runs/4970761706?check_suite_focus=true?check_suite_focus=true#step:8:24986)  
[example failure 2022-01-27T12:33:24.8143117Z](https://github.com/apache/pulsar/runs/4965382777?check_suite_focus=true?check_suite_focus=true#step:8:17794)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:777)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$5(ZKMetadataStore.java:161)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$6(ZKMetadataStore.java:161)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:490)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:724)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:563)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:428)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$6(ZKMetadataStore.java:160)
	... 3 more
Caused by: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:134)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:418)
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
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:129)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-28T15:59:12.7679798Z](https://github.com/apache/pulsar/runs/4982126215?check_suite_focus=true?check_suite_focus=true#step:8:23495)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [Reconnected] but found [null]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:129)
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

</pre></code>
</details>

