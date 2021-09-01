        
Flaky-test: org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost
Number of failures: 29

org.apache.pulsar.metadata.ZKSessionTest is flaky. The testReacquireLocksAfterSessionLost test method fails sporadically.

```
java.lang.AssertionError: expected [SessionReestablished] but found [null]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:128)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T22:37:56.6174511Z](https://github.com/apache/pulsar/runs/3467041097?check_suite_focus=true#step:8:1481)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [SessionReestablished] but found [null]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:128)
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

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired for /key-1377893717448
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:777)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$storeDelete$22(ZKMetadataStore.java:308)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired for /key-1377893717448
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:345)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired for /key-1377893717448
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T10:52:46.7075439Z](https://github.com/apache/pulsar/runs/3442314900?check_suite_focus=true#step:8:3099)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired for /key-1377893717448
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:777)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$storeDelete$22(ZKMetadataStore.java:308)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired for /key-1377893717448
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:345)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired for /key-1377893717448
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:134)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:335)
	... 5 more

</pre></code>
</details>

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.metadata.ZKSessionTest that uses org.apache.pulsar.metadata.api.coordination.ResourceLock expected [false] but found [true] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:130)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T10:36:37.4140568Z](https://github.com/apache/pulsar/runs/3442216685?check_suite_focus=true#step:8:1455)
[example failure 2021-08-27T08:01:08.3982218Z](https://github.com/apache/pulsar/runs/3440980411?check_suite_focus=true#step:8:3095)
[example failure 2021-08-27T07:57:50.9839446Z](https://github.com/apache/pulsar/runs/3440706428?check_suite_focus=true#step:8:12264)
[example failure 2021-08-27T07:48:42.0834144Z](https://github.com/apache/pulsar/runs/3440855173?check_suite_focus=true#step:8:1481)
[example failure 2021-08-27T07:22:56.2707073Z](https://github.com/apache/pulsar/runs/3440736597?check_suite_focus=true#step:8:1494)
[example failure 2021-08-27T07:15:30.6054575Z](https://github.com/apache/pulsar/runs/3440662193?check_suite_focus=true#step:8:3155)
[example failure 2021-08-27T05:20:44.9991826Z](https://github.com/apache/pulsar/runs/3440010092?check_suite_focus=true#step:8:3117)
[example failure 2021-08-27T05:17:40.2536797Z](https://github.com/apache/pulsar/runs/3440010092?check_suite_focus=true#step:8:1455)
[example failure 2021-08-27T00:43:04.1879590Z](https://github.com/apache/pulsar/runs/3438608620?check_suite_focus=true#step:8:1461)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.metadata.ZKSessionTest that uses org.apache.pulsar.metadata.api.coordination.ResourceLock expected [false] but found [true] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:130)
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
Caused by: java.lang.AssertionError: expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertFalse(Assert.java:67)
	at org.testng.Assert.assertFalse(Assert.java:77)
	at org.apache.pulsar.metadata.ZKSessionTest.lambda$testReacquireLocksAfterSessionLost$0(ZKSessionTest.java:131)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:222)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:209)
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
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:126)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-31T10:49:54.7348241Z](https://github.com/apache/pulsar/runs/3471949444?check_suite_focus=true#step:8:3102)
[example failure 2021-08-27T23:46:12.5790743Z](https://github.com/apache/pulsar/runs/3447917397?check_suite_focus=true#step:8:1481)
[example failure 2021-08-27T06:28:08.2104021Z](https://github.com/apache/pulsar/runs/3440270116?check_suite_focus=true#step:8:6865)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [Reconnected] but found [null]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:126)
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

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /key-638703873919
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:777)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$storeDelete$22(ZKMetadataStore.java:308)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /key-638703873919
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:345)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /key-638703873919
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T05:43:29.5652062Z](https://github.com/apache/pulsar/runs/3440109884?check_suite_focus=true#step:8:4729)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /key-638703873919
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:777)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$storeDelete$22(ZKMetadataStore.java:308)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /key-638703873919
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:345)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /key-638703873919
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:102)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:335)
	... 5 more

</pre></code>
</details>

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.metadata.ZKSessionTest that uses org.apache.pulsar.metadata.api.coordination.ResourceLock expected [false] but found [true] within 30 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:130)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:02:01.0543767Z](https://github.com/apache/pulsar/runs/3463119556?check_suite_focus=true#step:8:1489)
[example failure 2021-08-30T14:41:47.7943221Z](https://github.com/apache/pulsar/runs/3462898842?check_suite_focus=true#step:8:3121)
[example failure 2021-08-30T14:30:55.2358464Z](https://github.com/apache/pulsar/runs/3462775600?check_suite_focus=true#step:8:3158)
[example failure 2021-08-30T14:27:37.7528370Z](https://github.com/apache/pulsar/runs/3462775600?check_suite_focus=true#step:8:1481)
[example failure 2021-08-27T15:03:27.2402804Z](https://github.com/apache/pulsar/runs/3444389116?check_suite_focus=true#step:8:1488)
[example failure 2021-08-27T11:25:51.8913132Z](https://github.com/apache/pulsar/runs/3442396885?check_suite_focus=true#step:8:8561)
[example failure 2021-08-27T11:02:12.4868896Z](https://github.com/apache/pulsar/runs/3442396885?check_suite_focus=true#step:8:1488)
[example failure 2021-08-27T10:56:16.5201748Z](https://github.com/apache/pulsar/runs/3442314900?check_suite_focus=true#step:8:4751)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.metadata.ZKSessionTest that uses org.apache.pulsar.metadata.api.coordination.ResourceLock expected [false] but found [true] within 30 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:130)
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
Caused by: java.lang.AssertionError: expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertFalse(Assert.java:67)
	at org.testng.Assert.assertFalse(Assert.java:77)
	at org.apache.pulsar.metadata.ZKSessionTest.lambda$testReacquireLocksAfterSessionLost$0(ZKSessionTest.java:131)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:222)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:209)
	... 4 more

</pre></code>
</details>

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /key-392819602115
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:777)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$storeDelete$22(ZKMetadataStore.java:308)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /key-392819602115
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:345)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /key-392819602115
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T15:24:55.2390154Z](https://github.com/apache/pulsar/runs/3444574425?check_suite_focus=true#step:8:3093)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /key-392819602115
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:777)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$storeDelete$22(ZKMetadataStore.java:308)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /key-392819602115
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:345)
	... 5 more
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /key-392819602115
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:102)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:335)
	... 5 more

</pre></code>
</details>

```
java.lang.AssertionError: expected [SessionReestablished] but found [ConnectionLost]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:128)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T16:52:07.2730242Z](https://github.com/apache/pulsar/runs/3464151126?check_suite_focus=true#step:8:3123)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [SessionReestablished] but found [ConnectionLost]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:128)
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

```
java.lang.AssertionError: expected [SessionReestablished] but found [Reconnected]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:128)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-31T02:49:59.8823159Z](https://github.com/apache/pulsar/runs/3468534508?check_suite_focus=true#step:8:1489)
[example failure 2021-08-30T17:32:27.7814361Z](https://github.com/apache/pulsar/runs/3464533950?check_suite_focus=true#step:8:1456)
[example failure 2021-08-29T03:02:49.1314971Z](https://github.com/apache/pulsar/runs/3452988226?check_suite_focus=true#step:8:3133)
[example failure 2021-08-26T07:12:36.8829660Z](https://github.com/apache/pulsar/runs/3429971992?check_suite_focus=true#step:8:3087)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [SessionReestablished] but found [Reconnected]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:128)
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

