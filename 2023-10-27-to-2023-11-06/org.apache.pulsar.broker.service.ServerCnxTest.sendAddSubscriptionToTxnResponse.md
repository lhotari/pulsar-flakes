        
Flaky-test: org.apache.pulsar.broker.service.ServerCnxTest.sendAddSubscriptionToTxnResponse
Number of failures: 1

org.apache.pulsar.broker.service.ServerCnxTest is flaky. The sendAddSubscriptionToTxnResponse test method fails sporadically.

```
java.lang.ClassCastException: class org.apache.pulsar.broker.TransactionMetadataStoreService cannot be cast to class org.apache.pulsar.broker.resources.PulsarResources (org.apache.pulsar.broker.TransactionMetadataStoreService and org.apache.pulsar.broker.resources.PulsarResources are in unnamed module of loader 'app')
	at org.apache.pulsar.broker.PulsarService.getPulsarResources(PulsarService.java:269)
	at org.apache.pulsar.broker.service.TopicListService.<init>(TopicListService.java:103)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:315)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:271)
	at org.apache.pulsar.broker.service.ServerCnxTest.resetChannel(ServerCnxTest.java:2837)
	at org.apache.pulsar.broker.service.ServerCnxTest.sendAddSubscriptionToTxnResponse(ServerCnxTest.java:3678)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-11-04T22:17:05.5494166Z](https://github.com/apache/pulsar/actions/runs/6757378233/job/18368035640#step:11:616)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.ClassCastException: class org.apache.pulsar.broker.TransactionMetadataStoreService cannot be cast to class org.apache.pulsar.broker.resources.PulsarResources (org.apache.pulsar.broker.TransactionMetadataStoreService and org.apache.pulsar.broker.resources.PulsarResources are in unnamed module of loader 'app')
	at org.apache.pulsar.broker.PulsarService.getPulsarResources(PulsarService.java:269)
	at org.apache.pulsar.broker.service.TopicListService.<init>(TopicListService.java:103)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:315)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:271)
	at org.apache.pulsar.broker.service.ServerCnxTest.resetChannel(ServerCnxTest.java:2837)
	at org.apache.pulsar.broker.service.ServerCnxTest.sendAddSubscriptionToTxnResponse(ServerCnxTest.java:3678)
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
	at java.base/java.lang.Thread.run(Thread.java:840)

</pre></code>
</details>

