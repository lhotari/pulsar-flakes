        
Flaky-test: org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerCloseTest.testCloseAfterLoadingBundles
Number of failures: 1

org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerCloseTest is flaky. The testCloseAfterLoadingBundles test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException: java.lang.IllegalStateException: Client instance has been closed.
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:354)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.createPartitionedTopic(TopicsImpl.java:306)
	at org.apache.pulsar.client.admin.Topics.createPartitionedTopic(Topics.java:475)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerCloseTest.testCloseAfterLoadingBundles(ExtensibleLoadManagerCloseTest.java:90)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-09-18T07:22:04.7670041Z](https://github.com/apache/pulsar/actions/runs/17817810114/job/50661792602#step:8:2318)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException: java.lang.IllegalStateException: Client instance has been closed.
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:354)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.createPartitionedTopic(TopicsImpl.java:306)
	at org.apache.pulsar.client.admin.Topics.createPartitionedTopic(Topics.java:475)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerCloseTest.testCloseAfterLoadingBundles(ExtensibleLoadManagerCloseTest.java:90)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:840)
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException: java.lang.IllegalStateException: Client instance has been closed.
		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:300)
		... 16 more
	Caused by: java.lang.IllegalStateException: Client instance has been closed.
		at org.glassfish.jersey.internal.guava.Preconditions.checkState(Preconditions.java:169)
		at org.glassfish.jersey.client.JerseyClient.checkNotClosed(JerseyClient.java:248)
		at org.glassfish.jersey.client.JerseyWebTarget.checkNotClosed(JerseyWebTarget.java:118)
		at org.glassfish.jersey.client.JerseyWebTarget.path(JerseyWebTarget.java:129)
		at org.glassfish.jersey.client.JerseyWebTarget.path(JerseyWebTarget.java:38)
		at org.apache.pulsar.client.admin.internal.TopicsImpl.topicPath(TopicsImpl.java:1224)
		at org.apache.pulsar.client.admin.internal.TopicsImpl.createPartitionedTopicAsync(TopicsImpl.java:337)
		at org.apache.pulsar.client.admin.internal.TopicsImpl.createPartitionedTopicAsync(TopicsImpl.java:330)
		at org.apache.pulsar.client.admin.internal.TopicsImpl.lambda$createPartitionedTopic$8(TopicsImpl.java:306)
		at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:342)
		... 15 more
Caused by: [CIRCULAR REFERENCE: java.lang.IllegalStateException: Client instance has been closed.]

</pre></code>
</details>

