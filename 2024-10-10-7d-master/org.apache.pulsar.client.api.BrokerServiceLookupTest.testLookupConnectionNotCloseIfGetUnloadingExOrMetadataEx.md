        
Flaky-test: org.apache.pulsar.client.api.BrokerServiceLookupTest.testLookupConnectionNotCloseIfGetUnloadingExOrMetadataEx
Number of failures: 2

org.apache.pulsar.client.api.BrokerServiceLookupTest is flaky. The testLookupConnectionNotCloseIfGetUnloadingExOrMetadataEx test method fails sporadically.

```
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertTrue(Assert.java:56)
	at org.testng.Assert.assertTrue(Assert.java:66)
	at org.apache.pulsar.client.api.BrokerServiceLookupTest.testLookupConnectionNotCloseIfGetUnloadingExOrMetadataEx(BrokerServiceLookupTest.java:1264)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-10-04T06:26:09.3007675Z](https://github.com/apache/pulsar/actions/runs/11174811221/job/31065422542#step:10:1710)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertTrue(Assert.java:56)
	at org.testng.Assert.assertTrue(Assert.java:66)
	at org.apache.pulsar.client.api.BrokerServiceLookupTest.testLookupConnectionNotCloseIfGetUnloadingExOrMetadataEx(BrokerServiceLookupTest.java:1264)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer test-0-0 can not send message to the topic persistent://public/default/tp-54c1998d-5a8f-42a7-aeb0-8cd3461aaebf within given timeout : createdAt 30.002 seconds ago, firstSentAt 0.0 seconds ago, lastSentAt 0.0 seconds ago, retryCount 0
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1057)
	at org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:107)
	at org.apache.pulsar.client.impl.ProducerBase.send(ProducerBase.java:61)
	at org.apache.pulsar.client.api.BrokerServiceLookupTest.testLookupConnectionNotCloseIfGetUnloadingExOrMetadataEx(BrokerServiceLookupTest.java:1267)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-10-10T12:29:48.2488492Z](https://github.com/apache/pulsar/actions/runs/11273730567/job/31351886594#step:11:749)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer test-0-0 can not send message to the topic persistent://public/default/tp-54c1998d-5a8f-42a7-aeb0-8cd3461aaebf within given timeout : createdAt 30.002 seconds ago, firstSentAt 0.0 seconds ago, lastSentAt 0.0 seconds ago, retryCount 0
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1057)
	at org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:107)
	at org.apache.pulsar.client.impl.ProducerBase.send(ProducerBase.java:61)
	at org.apache.pulsar.client.api.BrokerServiceLookupTest.testLookupConnectionNotCloseIfGetUnloadingExOrMetadataEx(BrokerServiceLookupTest.java:1267)
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

</pre></code>
</details>

