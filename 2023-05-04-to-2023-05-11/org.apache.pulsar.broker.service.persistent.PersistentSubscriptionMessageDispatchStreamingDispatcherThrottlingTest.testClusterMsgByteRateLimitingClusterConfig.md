        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentSubscriptionMessageDispatchStreamingDispatcherThrottlingTest.testClusterMsgByteRateLimitingClusterConfig
Number of failures: 2

org.apache.pulsar.broker.service.persistent.PersistentSubscriptionMessageDispatchStreamingDispatcherThrottlingTest is flaky. The testClusterMsgByteRateLimitingClusterConfig test method fails sporadically.

```
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.broker.PulsarService.getConfiguration()" because "this.pulsar" is null
	at org.apache.pulsar.client.api.MessageDispatchThrottlingTest.testClusterMsgByteRateLimitingClusterConfig(MessageDispatchThrottlingTest.java:288)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-05-09T09:54:08.2771789Z](https://github.com/apache/pulsar/actions/runs/4924293879/jobs/8797179686#step:8:2102)  
[example failure 2023-05-06T15:22:42.5533135Z](https://github.com/apache/pulsar/actions/runs/4902139875/jobs/8753807967#step:8:2098)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.broker.PulsarService.getConfiguration()" because "this.pulsar" is null
	at org.apache.pulsar.client.api.MessageDispatchThrottlingTest.testClusterMsgByteRateLimitingClusterConfig(MessageDispatchThrottlingTest.java:288)
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

</pre></code>
</details>

