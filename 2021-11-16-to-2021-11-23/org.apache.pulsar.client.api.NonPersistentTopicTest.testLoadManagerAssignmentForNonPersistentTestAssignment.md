        
Flaky-test: org.apache.pulsar.client.api.NonPersistentTopicTest.testLoadManagerAssignmentForNonPersistentTestAssignment
Number of failures: 3

org.apache.pulsar.client.api.NonPersistentTopicTest is flaky. The testLoadManagerAssignmentForNonPersistentTestAssignment test method fails sporadically.

```
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Resource at /loadbalance/brokers/localhost:35067 is already locked
	at org.apache.pulsar.broker.loadbalance.impl.SimpleLoadManagerImpl.start(SimpleLoadManagerImpl.java:285)
	at org.apache.pulsar.client.api.NonPersistentTopicTest.testLoadManagerAssignmentForNonPersistentTestAssignment(NonPersistentTopicTest.java:706)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-22T09:38:09.8313829Z](https://github.com/apache/pulsar/runs/4284301115?check_suite_focus=true?check_suite_focus=true#step:9:526)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Resource at /loadbalance/brokers/localhost:35067 is already locked
	at org.apache.pulsar.broker.loadbalance.impl.SimpleLoadManagerImpl.start(SimpleLoadManagerImpl.java:285)
	at org.apache.pulsar.client.api.NonPersistentTopicTest.testLoadManagerAssignmentForNonPersistentTestAssignment(NonPersistentTopicTest.java:706)
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
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Resource at /loadbalance/brokers/localhost:35067 is already locked
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.broker.loadbalance.impl.SimpleLoadManagerImpl.start(SimpleLoadManagerImpl.java:268)
	... 13 more
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Resource at /loadbalance/brokers/localhost:35067 is already locked
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.lambda$acquireWithNoRevalidation$8(ResourceLockImpl.java:179)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:986)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:970)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$storePut$15(ZKMetadataStore.java:226)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

```
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Resource at /loadbalance/brokers/localhost:33629 is already locked
	at org.apache.pulsar.broker.loadbalance.impl.SimpleLoadManagerImpl.start(SimpleLoadManagerImpl.java:290)
	at org.apache.pulsar.client.api.NonPersistentTopicTest.testLoadManagerAssignmentForNonPersistentTestAssignment(NonPersistentTopicTest.java:702)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-17T10:40:54.7385169Z](https://github.com/apache/pulsar/runs/4236764779?check_suite_focus=true?check_suite_focus=true#step:9:200)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Resource at /loadbalance/brokers/localhost:33629 is already locked
	at org.apache.pulsar.broker.loadbalance.impl.SimpleLoadManagerImpl.start(SimpleLoadManagerImpl.java:290)
	at org.apache.pulsar.client.api.NonPersistentTopicTest.testLoadManagerAssignmentForNonPersistentTestAssignment(NonPersistentTopicTest.java:702)
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
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Resource at /loadbalance/brokers/localhost:33629 is already locked
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.broker.loadbalance.impl.SimpleLoadManagerImpl.start(SimpleLoadManagerImpl.java:272)
	... 13 more
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Resource at /loadbalance/brokers/localhost:33629 is already locked
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.lambda$acquireWithNoRevalidation$7(ResourceLockImpl.java:166)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:986)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:970)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$storePut$17(ZKMetadataStore.java:261)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

```
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Resource at /loadbalance/brokers/localhost:40991 is already locked
	at org.apache.pulsar.broker.loadbalance.impl.SimpleLoadManagerImpl.start(SimpleLoadManagerImpl.java:290)
	at org.apache.pulsar.client.api.NonPersistentTopicTest.testLoadManagerAssignmentForNonPersistentTestAssignment(NonPersistentTopicTest.java:702)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-18T13:40:22.4276960Z](https://github.com/apache/pulsar/runs/4251895110?check_suite_focus=true?check_suite_focus=true#step:9:552)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Resource at /loadbalance/brokers/localhost:40991 is already locked
	at org.apache.pulsar.broker.loadbalance.impl.SimpleLoadManagerImpl.start(SimpleLoadManagerImpl.java:290)
	at org.apache.pulsar.client.api.NonPersistentTopicTest.testLoadManagerAssignmentForNonPersistentTestAssignment(NonPersistentTopicTest.java:702)
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
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Resource at /loadbalance/brokers/localhost:40991 is already locked
	at java.base/java.util.concurrent.CompletableFuture.reportJoin(CompletableFuture.java:412)
	at java.base/java.util.concurrent.CompletableFuture.join(CompletableFuture.java:2044)
	at org.apache.pulsar.broker.loadbalance.impl.SimpleLoadManagerImpl.start(SimpleLoadManagerImpl.java:272)
	... 13 more
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$LockBusyException: Resource at /loadbalance/brokers/localhost:40991 is already locked
	at org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl.lambda$acquireWithNoRevalidation$7(ResourceLockImpl.java:166)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:986)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:970)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$storePut$17(ZKMetadataStore.java:261)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

