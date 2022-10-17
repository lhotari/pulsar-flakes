        
Flaky-test: org.apache.pulsar.metadata.ZKSessionTest.testReacquireLeadershipAfterSessionLost
Number of failures: 13

org.apache.pulsar.metadata.ZKSessionTest is flaky. The testReacquireLeadershipAfterSessionLost test method fails sporadically.

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3819457125146
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3819457125146
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3819457125146
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-12T17:16:59.8812570Z](https://github.com/apache/pulsar/actions/runs/3235740229/jobs/5301094142#step:10:11125)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3819457125146
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3819457125146
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3819457125146
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 5 more

</pre></code>
</details>

```
java.lang.AssertionError: expected [SessionReestablished] but found [SessionLost]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLeadershipAfterSessionLost(ZKSessionTest.java:178)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-14T12:42:26.3557000Z](https://github.com/apache/pulsar/actions/runs/3249033203/jobs/5332090127#step:10:11124)  
[example failure 2022-10-14T10:23:16.3424745Z](https://github.com/apache/pulsar/actions/runs/3248340818/jobs/5329936883#step:10:617)  
[example failure 2022-10-12T02:58:51.6167954Z](https://github.com/apache/pulsar/actions/runs/3225080643/jobs/5291128167#step:10:590)  
[example failure 2022-10-11T04:30:09.5026312Z](https://github.com/apache/pulsar/actions/runs/3223890093/jobs/5274562681#step:10:591)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [SessionReestablished] but found [SessionLost]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLeadershipAfterSessionLost(ZKSessionTest.java:178)
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

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3843729048782
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3843729048782
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3843729048782
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-12T03:10:19.1130197Z](https://github.com/apache/pulsar/actions/runs/3231410502/jobs/5291043731#step:10:11127)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3843729048782
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3843729048782
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3843729048782
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 5 more

</pre></code>
</details>

```
java.lang.AssertionError: expected [SessionLost] but found [Reconnected]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLeadershipAfterSessionLost(ZKSessionTest.java:171)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-13T09:55:48.6202492Z](https://github.com/apache/pulsar/actions/runs/3240577025/jobs/5312101995#step:10:11130)  
[example failure 2022-10-12T08:40:22.2576158Z](https://github.com/apache/pulsar/actions/runs/3227865812/jobs/5293737664#step:10:593)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [SessionLost] but found [Reconnected]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLeadershipAfterSessionLost(ZKSessionTest.java:171)
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

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3922219899526
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3922219899526
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3922219899526
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-12T14:03:33.4327388Z](https://github.com/apache/pulsar/actions/runs/3233318841/jobs/5298287312#step:10:11125)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3922219899526
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3922219899526
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3922219899526
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 5 more

</pre></code>
</details>

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3235590633951
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3235590633951
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3235590633951
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-13T09:47:37.7994176Z](https://github.com/apache/pulsar/actions/runs/3240610251/jobs/5312107203#step:10:617)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3235590633951
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3235590633951
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3235590633951
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 5 more

</pre></code>
</details>

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3058179613597
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3058179613597
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3058179613597
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-11T20:51:48.2989678Z](https://github.com/apache/pulsar/actions/runs/3229794671/jobs/5287635695#step:10:617)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3058179613597
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3058179613597
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3058179613597
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 5 more

</pre></code>
</details>

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3390241620216
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3390241620216
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3390241620216
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-13T10:01:03.2628240Z](https://github.com/apache/pulsar/actions/runs/3240623984/jobs/5312197839#step:10:11125)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3390241620216
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3390241620216
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3390241620216
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 5 more

</pre></code>
</details>

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3783894542335
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3783894542335
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3783894542335
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-14T02:29:48.2717326Z](https://github.com/apache/pulsar/actions/runs/3246245283/jobs/5326011608#step:10:613)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3783894542335
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:489)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:712)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3783894542335
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /key-3783894542335
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 5 more

</pre></code>
</details>

