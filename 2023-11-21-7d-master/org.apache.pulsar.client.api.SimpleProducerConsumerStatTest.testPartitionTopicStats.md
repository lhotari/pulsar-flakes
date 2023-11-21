        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerStatTest.testPartitionTopicStats
Number of failures: 1

org.apache.pulsar.client.api.SimpleProducerConsumerStatTest is flaky. The testPartitionTopicStats test method fails sporadically.

```
java.lang.AssertionError: Received message my-message-1 did not match the expected message my-message-0 expected [my-message-0] but found [my-message-1]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.apache.pulsar.client.api.ProducerConsumerBase.testMessageOrderAndDuplicates(ProducerConsumerBase.java:59)
	at org.apache.pulsar.client.api.SimpleProducerConsumerStatTest.testPartitionTopicStats(SimpleProducerConsumerStatTest.java:499)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-11-17T06:15:51.5075686Z](https://github.com/apache/pulsar/actions/runs/6900459298/job/18773848684#step:11:1414)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: Received message my-message-1 did not match the expected message my-message-0 expected [my-message-0] but found [my-message-1]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.apache.pulsar.client.api.ProducerConsumerBase.testMessageOrderAndDuplicates(ProducerConsumerBase.java:59)
	at org.apache.pulsar.client.api.SimpleProducerConsumerStatTest.testPartitionTopicStats(SimpleProducerConsumerStatTest.java:499)
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

