        
Flaky-test: org.apache.pulsar.client.api.BrokerServiceLookupTest.testPartitionTopicLookup
Number of failures: 11

org.apache.pulsar.client.api.BrokerServiceLookupTest is flaky. The testPartitionTopicLookup test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException$TimeoutException: java.util.concurrent.TimeoutException
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:299)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:447)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:618)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:437)
	at org.apache.pulsar.client.api.BrokerServiceLookupTest.testPartitionTopicLookup(BrokerServiceLookupTest.java:405)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-02-02T21:10:39.5013840Z](https://github.com/apache/pulsar/runs/5042884729?check_suite_focus=true?check_suite_focus=true#step:9:1712)  
[example failure 2022-02-02T21:00:56.4660759Z](https://github.com/apache/pulsar/runs/5042884729?check_suite_focus=true?check_suite_focus=true#step:9:827)  
[example failure 2022-02-02T13:31:05.0225462Z](https://github.com/apache/pulsar/runs/5036754876?check_suite_focus=true?check_suite_focus=true#step:9:2589)  
[example failure 2022-02-02T13:22:23.8198343Z](https://github.com/apache/pulsar/runs/5036754876?check_suite_focus=true?check_suite_focus=true#step:9:1704)  
[example failure 2022-01-29T07:58:59.9085016Z](https://github.com/apache/pulsar/runs/4989955736?check_suite_focus=true?check_suite_focus=true#step:9:2604)  
[example failure 2022-01-29T07:49:52.1716220Z](https://github.com/apache/pulsar/runs/4989955736?check_suite_focus=true?check_suite_focus=true#step:9:1734)  
[example failure 2022-01-28T19:56:30.0287650Z](https://github.com/apache/pulsar/runs/4985339104?check_suite_focus=true?check_suite_focus=true#step:9:2597)  
[example failure 2022-01-28T19:47:10.4712955Z](https://github.com/apache/pulsar/runs/4985339104?check_suite_focus=true?check_suite_focus=true#step:9:1712)  
[example failure 2022-01-28T19:37:24.0116787Z](https://github.com/apache/pulsar/runs/4985339104?check_suite_focus=true?check_suite_focus=true#step:9:827)  
[example failure 2022-01-28T12:14:04.2773426Z](https://github.com/apache/pulsar/runs/4980157332?check_suite_focus=true?check_suite_focus=true#step:9:825)  
[example failure 2022-01-28T02:35:49.2890713Z](https://github.com/apache/pulsar/runs/4975405076?check_suite_focus=true?check_suite_focus=true#step:9:823)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$TimeoutException: java.util.concurrent.TimeoutException
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:299)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:447)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:618)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:437)
	at org.apache.pulsar.client.api.BrokerServiceLookupTest.testPartitionTopicLookup(BrokerServiceLookupTest.java:405)
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
Caused by: java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.CompletableFuture.timedGet(CompletableFuture.java:1886)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2021)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:292)
	... 16 more

</pre></code>
</details>

