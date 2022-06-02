        
Flaky-test: org.apache.pulsar.broker.admin.v3.AdminApiTransactionMultiBrokerTest.testRedirectOfGetCoordinatorInternalStats
Number of failures: 1

org.apache.pulsar.broker.admin.v3.AdminApiTransactionMultiBrokerTest is flaky. The testRedirectOfGetCoordinatorInternalStats test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException$TimeoutException: java.util.concurrent.TimeoutException
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:297)
	at org.apache.pulsar.client.admin.internal.LookupImpl.lookupPartitionedTopic(LookupImpl.java:82)
	at org.apache.pulsar.broker.admin.v3.AdminApiTransactionMultiBrokerTest.testRedirectOfGetCoordinatorInternalStats(AdminApiTransactionMultiBrokerTest.java:52)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-01T02:16:39.7409693Z](https://github.com/apache/pulsar/runs/6681608749?check_suite_focus=true#step:10:2995)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$TimeoutException: java.util.concurrent.TimeoutException
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:297)
	at org.apache.pulsar.client.admin.internal.LookupImpl.lookupPartitionedTopic(LookupImpl.java:82)
	at org.apache.pulsar.broker.admin.v3.AdminApiTransactionMultiBrokerTest.testRedirectOfGetCoordinatorInternalStats(AdminApiTransactionMultiBrokerTest.java:52)
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
Caused by: java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.CompletableFuture.timedGet(CompletableFuture.java:1960)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2095)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:292)
	... 14 more

</pre></code>
</details>

