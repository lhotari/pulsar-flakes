        
Flaky-test: org.apache.pulsar.broker.admin.v3.AdminApiTransactionMultiBrokerTest.testRedirectOfGetCoordinatorInternalStats
Number of failures: 1

org.apache.pulsar.broker.admin.v3.AdminApiTransactionMultiBrokerTest is flaky. The testRedirectOfGetCoordinatorInternalStats test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.admin.v3.AdminApiTransactionMultiBrokerTest.testRedirectOfGetCoordinatorInternalStats() didn't finish within the time-out 300000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-11-25T05:30:41.9607481Z](https://github.com/apache/pulsar/actions/runs/3539262113/jobs/5953699333#step:10:1362)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.admin.v3.AdminApiTransactionMultiBrokerTest.testRedirectOfGetCoordinatorInternalStats() didn't finish within the time-out 300000
	at java.base@17.0.5/jdk.internal.misc.Unsafe.park(Native Method)
	at java.base@17.0.5/java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:252)
	at java.base@17.0.5/java.util.concurrent.CompletableFuture$Signaller.block(CompletableFuture.java:1866)
	at java.base@17.0.5/java.util.concurrent.ForkJoinPool.unmanagedBlock(ForkJoinPool.java:3463)
	at java.base@17.0.5/java.util.concurrent.ForkJoinPool.managedBlock(ForkJoinPool.java:3434)
	at java.base@17.0.5/java.util.concurrent.CompletableFuture.timedGet(CompletableFuture.java:1939)
	at java.base@17.0.5/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2095)
	at app//org.apache.pulsar.broker.resources.BaseResources.create(BaseResources.java:128)
	at app//org.apache.pulsar.broker.resources.NamespaceResources$PartitionedTopicResources.createPartitionedTopic(NamespaceResources.java:243)
	at app//org.apache.pulsar.broker.admin.v3.AdminApiTransactionMultiBrokerTest.testRedirectOfGetCoordinatorInternalStats(AdminApiTransactionMultiBrokerTest.java:61)
	at java.base@17.0.5/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base@17.0.5/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base@17.0.5/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base@17.0.5/java.lang.reflect.Method.invoke(Method.java:568)
	at app//org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base@17.0.5/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base@17.0.5/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base@17.0.5/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base@17.0.5/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

