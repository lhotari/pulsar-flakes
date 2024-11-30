        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.testMultiTopicsConsumerImplPauseForPartitionNumberChange
Number of failures: 2

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The testMultiTopicsConsumerImplPauseForPartitionNumberChange test method fails sporadically.

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.TopicMessageImpl@529034c5]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotSame(Assert.java:1573)
	at org.testng.Assert.assertNull(Assert.java:1506)
	at org.testng.Assert.assertNull(Assert.java:1494)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testMultiTopicsConsumerImplPauseForPartitionNumberChange(SimpleProducerConsumerTest.java:3479)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-11-25T12:35:14.9341964Z](https://github.com/apache/pulsar/actions/runs/12009749403/job/33475627109#step:10:842)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.TopicMessageImpl@529034c5]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotSame(Assert.java:1573)
	at org.testng.Assert.assertNull(Assert.java:1506)
	at org.testng.Assert.assertNull(Assert.java:1494)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testMultiTopicsConsumerImplPauseForPartitionNumberChange(SimpleProducerConsumerTest.java:3479)
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

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.TopicMessageImpl@5b3525ec]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotSame(Assert.java:1573)
	at org.testng.Assert.assertNull(Assert.java:1506)
	at org.testng.Assert.assertNull(Assert.java:1494)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testMultiTopicsConsumerImplPauseForPartitionNumberChange(SimpleProducerConsumerTest.java:3479)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-11-28T06:25:16.6891429Z](https://github.com/apache/pulsar/actions/runs/12063374292/job/33638780390#step:11:830)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.TopicMessageImpl@5b3525ec]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotSame(Assert.java:1573)
	at org.testng.Assert.assertNull(Assert.java:1506)
	at org.testng.Assert.assertNull(Assert.java:1494)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testMultiTopicsConsumerImplPauseForPartitionNumberChange(SimpleProducerConsumerTest.java:3479)
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

