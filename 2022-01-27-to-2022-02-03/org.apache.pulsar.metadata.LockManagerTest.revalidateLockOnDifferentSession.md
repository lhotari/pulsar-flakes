        
Flaky-test: org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession
Number of failures: 13

org.apache.pulsar.metadata.LockManagerTest is flaky. The revalidateLockOnDifferentSession test method fails sporadically.

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-675325142913 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-02-02T20:55:17.2441826Z](https://github.com/apache/pulsar/runs/5042884600?check_suite_focus=true?check_suite_focus=true#step:8:3294)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-675325142913 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
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
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-675325142913 is already created as non-ephemeral
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.lambda$doRevalidate$20(ResourceLockImpl.java:254)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1072)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2073)
	at org.apache.pulsar.metadata.impl.EtcdMetadataStore.lambda$handleBatchOperationResult$13(EtcdMetadataStore.java:303)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-2237824807885 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-28T02:57:08.6816171Z](https://github.com/apache/pulsar/runs/4975404880?check_suite_focus=true?check_suite_focus=true#step:8:12335)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-2237824807885 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
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
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-2237824807885 is already created as non-ephemeral
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.lambda$doRevalidate$20(ResourceLockImpl.java:254)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1072)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2073)
	at org.apache.pulsar.metadata.impl.EtcdMetadataStore.lambda$handleBatchOperationResult$13(EtcdMetadataStore.java:303)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-1347131586292 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-29T05:07:06.4814697Z](https://github.com/apache/pulsar/runs/4989344300?check_suite_focus=true?check_suite_focus=true#step:8:10560)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-1347131586292 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
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
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-1347131586292 is already created as non-ephemeral
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.lambda$doRevalidate$20(ResourceLockImpl.java:254)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1072)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2073)
	at org.apache.pulsar.metadata.impl.EtcdMetadataStore.lambda$handleBatchOperationResult$13(EtcdMetadataStore.java:303)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-3283884400224 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-28T10:11:16.3613342Z](https://github.com/apache/pulsar/runs/4978229523?check_suite_focus=true?check_suite_focus=true#step:8:16073)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-3283884400224 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
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
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-3283884400224 is already created as non-ephemeral
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.lambda$doRevalidate$20(ResourceLockImpl.java:254)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1072)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2073)
	at org.apache.pulsar.metadata.impl.EtcdMetadataStore.lambda$handleBatchOperationResult$13(EtcdMetadataStore.java:303)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-310660662806 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-28T10:38:48.1126297Z](https://github.com/apache/pulsar/runs/4978580453?check_suite_focus=true?check_suite_focus=true#step:8:1495)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-310660662806 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
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
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-310660662806 is already created as non-ephemeral
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.lambda$doRevalidate$20(ResourceLockImpl.java:254)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1072)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2073)
	at org.apache.pulsar.metadata.impl.EtcdMetadataStore.lambda$handleBatchOperationResult$13(EtcdMetadataStore.java:303)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-324305432018 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-02-02T13:04:47.8141304Z](https://github.com/apache/pulsar/runs/5036755143?check_suite_focus=true?check_suite_focus=true#step:8:1495)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-324305432018 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
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
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-324305432018 is already created as non-ephemeral
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.lambda$doRevalidate$20(ResourceLockImpl.java:254)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1072)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2073)
	at org.apache.pulsar.metadata.impl.EtcdMetadataStore.lambda$handleBatchOperationResult$13(EtcdMetadataStore.java:303)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-1535607325996 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-28T12:23:05.5669534Z](https://github.com/apache/pulsar/runs/4980157480?check_suite_focus=true?check_suite_focus=true#step:8:6982)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-1535607325996 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
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
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-1535607325996 is already created as non-ephemeral
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.lambda$doRevalidate$20(ResourceLockImpl.java:254)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1072)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2073)
	at org.apache.pulsar.metadata.impl.EtcdMetadataStore.lambda$handleBatchOperationResult$13(EtcdMetadataStore.java:303)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-775436816350 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-28T13:35:59.0254280Z](https://github.com/apache/pulsar/runs/4981110712?check_suite_focus=true?check_suite_focus=true#step:8:4989)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-775436816350 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
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
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-775436816350 is already created as non-ephemeral
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.lambda$doRevalidate$20(ResourceLockImpl.java:254)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1072)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2073)
	at org.apache.pulsar.metadata.impl.EtcdMetadataStore.lambda$handleBatchOperationResult$13(EtcdMetadataStore.java:303)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-290351471135 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-02-02T20:48:52.0796930Z](https://github.com/apache/pulsar/runs/5042884600?check_suite_focus=true?check_suite_focus=true#step:8:1495)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-290351471135 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
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
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-290351471135 is already created as non-ephemeral
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.lambda$doRevalidate$20(ResourceLockImpl.java:254)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1072)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2073)
	at org.apache.pulsar.metadata.impl.EtcdMetadataStore.lambda$handleBatchOperationResult$13(EtcdMetadataStore.java:303)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-1976709931492 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-28T11:06:34.1680714Z](https://github.com/apache/pulsar/runs/4978580453?check_suite_focus=true?check_suite_focus=true#step:8:12359)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-1976709931492 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
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
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-1976709931492 is already created as non-ephemeral
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.lambda$doRevalidate$20(ResourceLockImpl.java:254)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1072)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2073)
	at org.apache.pulsar.metadata.impl.EtcdMetadataStore.lambda$handleBatchOperationResult$13(EtcdMetadataStore.java:303)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-448663706213 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-29T16:03:35.4002639Z](https://github.com/apache/pulsar/runs/4991983834?check_suite_focus=true?check_suite_focus=true#step:8:1503)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-448663706213 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
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
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-448663706213 is already created as non-ephemeral
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.lambda$doRevalidate$20(ResourceLockImpl.java:254)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1072)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2073)
	at org.apache.pulsar.metadata.impl.EtcdMetadataStore.lambda$handleBatchOperationResult$13(EtcdMetadataStore.java:303)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-1489249408191 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-28T11:13:34.5318385Z](https://github.com/apache/pulsar/runs/4979436155?check_suite_focus=true?check_suite_focus=true#step:8:7223)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-1489249408191 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
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
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-1489249408191 is already created as non-ephemeral
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.lambda$doRevalidate$20(ResourceLockImpl.java:254)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1072)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2073)
	at org.apache.pulsar.metadata.impl.EtcdMetadataStore.lambda$handleBatchOperationResult$13(EtcdMetadataStore.java:303)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-263225681892 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-02-02T16:12:36.0949112Z](https://github.com/apache/pulsar/runs/5039395056?check_suite_focus=true?check_suite_focus=true#step:8:1495)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-263225681892 is already created as non-ephemeral
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:285)
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
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Path /key-263225681892 is already created as non-ephemeral
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.lambda$doRevalidate$20(ResourceLockImpl.java:254)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1072)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2073)
	at org.apache.pulsar.metadata.impl.EtcdMetadataStore.lambda$handleBatchOperationResult$13(EtcdMetadataStore.java:303)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

