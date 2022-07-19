        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentSubscriptionMessageDispatchStreamingDispatcherThrottlingTest.testDispatchRateCompatibility2
Number of failures: 27

org.apache.pulsar.broker.service.persistent.PersistentSubscriptionMessageDispatchStreamingDispatcherThrottlingTest is flaky. The testDispatchRateCompatibility2 test method fails sporadically.

```
java.util.concurrent.ExecutionException: org.apache.pulsar.broker.service.BrokerServiceException$TopicFencedException: Topic is already fenced
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.client.api.MessageDispatchThrottlingTest.testDispatchRateCompatibility2(MessageDispatchThrottlingTest.java:1094)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-10T12:29:11.2963739Z](https://github.com/apache/pulsar/runs/6830374279?check_suite_focus=true#step:10:5696)  
[example failure 2022-06-10T12:18:24.7703399Z](https://github.com/apache/pulsar/runs/6830374279?check_suite_focus=true#step:10:2534)  
[example failure 2022-06-10T12:07:40.4347010Z](https://github.com/apache/pulsar/runs/6830374279?check_suite_focus=true#step:10:1561)  
[example failure 2022-06-10T08:25:26.8899973Z](https://github.com/apache/pulsar/runs/6826981667?check_suite_focus=true#step:10:5697)  
[example failure 2022-06-10T08:13:19.8452900Z](https://github.com/apache/pulsar/runs/6826981667?check_suite_focus=true#step:10:2535)  
[example failure 2022-06-10T08:01:07.7073906Z](https://github.com/apache/pulsar/runs/6826981667?check_suite_focus=true#step:10:1562)  
[example failure 2022-06-10T06:45:19.6404767Z](https://github.com/apache/pulsar/runs/6825800651?check_suite_focus=true#step:10:3506)  
[example failure 2022-06-10T06:32:56.5915967Z](https://github.com/apache/pulsar/runs/6825800651?check_suite_focus=true#step:10:2533)  
[example failure 2022-06-10T06:20:33.0120990Z](https://github.com/apache/pulsar/runs/6825800651?check_suite_focus=true#step:10:1560)  
[example failure 2022-06-10T02:55:04.5143093Z](https://github.com/apache/pulsar/runs/6823943951?check_suite_focus=true#step:10:7909)  
[example failure 2022-06-10T02:43:15.1035731Z](https://github.com/apache/pulsar/runs/6823943951?check_suite_focus=true#step:10:4747)  
[example failure 2022-06-10T02:31:40.4713626Z](https://github.com/apache/pulsar/runs/6823943951?check_suite_focus=true#step:10:1585)  
[example failure 2022-06-10T01:14:26.9202412Z](https://github.com/apache/pulsar/runs/6823120736?check_suite_focus=true#step:10:5697)  
[example failure 2022-06-10T01:03:29.7706647Z](https://github.com/apache/pulsar/runs/6823120736?check_suite_focus=true#step:10:2535)  
[example failure 2022-06-10T00:52:32.6005287Z](https://github.com/apache/pulsar/runs/6823120736?check_suite_focus=true#step:10:1562)  
[example failure 2022-06-09T15:55:09.9586008Z](https://github.com/apache/pulsar/runs/6815615197?check_suite_focus=true#step:10:5697)  
[example failure 2022-06-09T15:43:35.6027376Z](https://github.com/apache/pulsar/runs/6815615197?check_suite_focus=true#step:10:4724)  
[example failure 2022-06-09T15:32:17.0218219Z](https://github.com/apache/pulsar/runs/6815615197?check_suite_focus=true#step:10:1562)  
[example failure 2022-06-09T14:48:37.5205131Z](https://github.com/apache/pulsar/runs/6814329388?check_suite_focus=true#step:10:5709)  
[example failure 2022-06-09T14:37:14.8113332Z](https://github.com/apache/pulsar/runs/6814329388?check_suite_focus=true#step:10:4736)  
[example failure 2022-06-09T14:25:56.3539683Z](https://github.com/apache/pulsar/runs/6814329388?check_suite_focus=true#step:10:1574)  
[example failure 2022-06-09T02:25:39.1104190Z](https://github.com/apache/pulsar/runs/6804794251?check_suite_focus=true#step:10:7849)  
[example failure 2022-06-09T02:14:14.2616083Z](https://github.com/apache/pulsar/runs/6804794251?check_suite_focus=true#step:10:4701)  
[example failure 2022-06-09T02:02:40.8027599Z](https://github.com/apache/pulsar/runs/6804794251?check_suite_focus=true#step:10:1553)  
[example failure 2022-06-08T17:24:34.0261411Z](https://github.com/apache/pulsar/runs/6798149430?check_suite_focus=true#step:10:5670)  
[example failure 2022-06-08T17:12:58.2467212Z](https://github.com/apache/pulsar/runs/6798149430?check_suite_focus=true#step:10:4701)  
[example failure 2022-06-08T17:01:16.6898498Z](https://github.com/apache/pulsar/runs/6798149430?check_suite_focus=true#step:10:1553)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.ExecutionException: org.apache.pulsar.broker.service.BrokerServiceException$TopicFencedException: Topic is already fenced
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.client.api.MessageDispatchThrottlingTest.testDispatchRateCompatibility2(MessageDispatchThrottlingTest.java:1094)
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
Caused by: org.apache.pulsar.broker.service.BrokerServiceException$TopicFencedException: Topic is already fenced
	at org.apache.pulsar.broker.service.persistent.PersistentTopic.delete(PersistentTopic.java:1129)
	at org.apache.pulsar.broker.service.persistent.PersistentTopic.deleteForcefully(PersistentTopic.java:1102)
	at org.apache.pulsar.broker.service.persistent.PersistentTopic.checkReplication(PersistentTopic.java:1381)
	at org.apache.pulsar.broker.service.persistent.PersistentTopic.checkReplicationAndRetryOnFailure(PersistentTopic.java:1324)
	at org.apache.pulsar.broker.service.persistent.PersistentTopic.lambda$onPoliciesUpdate$97(PersistentTopic.java:2400)
	at java.base/java.util.concurrent.CompletableFuture.uniComposeStage(CompletableFuture.java:1187)
	at java.base/java.util.concurrent.CompletableFuture.thenCompose(CompletableFuture.java:2309)
	at org.apache.pulsar.broker.service.persistent.PersistentTopic.lambda$onPoliciesUpdate$98(PersistentTopic.java:2395)
	at java.base/java.util.concurrent.CompletableFuture.uniComposeStage(CompletableFuture.java:1187)
	at java.base/java.util.concurrent.CompletableFuture.thenCompose(CompletableFuture.java:2309)
	at org.apache.pulsar.broker.service.persistent.PersistentTopic.onPoliciesUpdate(PersistentTopic.java:2394)
	... 13 more

</pre></code>
</details>

