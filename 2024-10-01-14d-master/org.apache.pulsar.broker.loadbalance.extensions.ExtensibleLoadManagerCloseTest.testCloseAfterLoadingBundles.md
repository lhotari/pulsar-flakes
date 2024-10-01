        
Flaky-test: org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerCloseTest.testCloseAfterLoadingBundles
Number of failures: 1

org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerCloseTest is flaky. The testCloseAfterLoadingBundles test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException: java.lang.IllegalStateException: Client instance has been closed.
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:354)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.createPartitionedTopic(TopicsImpl.java:307)
	at org.apache.pulsar.client.admin.Topics.createPartitionedTopic(Topics.java:475)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerCloseTest.testCloseAfterLoadingBundles(ExtensibleLoadManagerCloseTest.java:89)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-09-23T06:25:02.4775460Z](https://github.com/apache/pulsar/actions/runs/10988510949/job/30505363661#step:11:1108)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException: java.lang.IllegalStateException: Client instance has been closed.
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:354)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.createPartitionedTopic(TopicsImpl.java:307)
	at org.apache.pulsar.client.admin.Topics.createPartitionedTopic(Topics.java:475)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerCloseTest.testCloseAfterLoadingBundles(ExtensibleLoadManagerCloseTest.java:89)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException: java.lang.IllegalStateException: Client instance has been closed.
		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:300)
		... 14 more
	Caused by: java.lang.IllegalStateException: Client instance has been closed.
		at org.glassfish.jersey.internal.guava.Preconditions.checkState(Preconditions.java:169)
		at org.glassfish.jersey.client.JerseyClient.checkNotClosed(JerseyClient.java:248)
		at org.glassfish.jersey.client.JerseyWebTarget.checkNotClosed(JerseyWebTarget.java:118)
		at org.glassfish.jersey.client.JerseyWebTarget.path(JerseyWebTarget.java:129)
		at org.glassfish.jersey.client.JerseyWebTarget.path(JerseyWebTarget.java:38)
		at org.apache.pulsar.client.admin.internal.TopicsImpl.topicPath(TopicsImpl.java:1256)
		at org.apache.pulsar.client.admin.internal.TopicsImpl.createPartitionedTopicAsync(TopicsImpl.java:338)
		at org.apache.pulsar.client.admin.internal.TopicsImpl.createPartitionedTopicAsync(TopicsImpl.java:331)
		at org.apache.pulsar.client.admin.internal.TopicsImpl.lambda$createPartitionedTopic$8(TopicsImpl.java:307)
		at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:342)
		... 13 more
Caused by: [CIRCULAR REFERENCE: java.lang.IllegalStateException: Client instance has been closed.]

</pre></code>
</details>

