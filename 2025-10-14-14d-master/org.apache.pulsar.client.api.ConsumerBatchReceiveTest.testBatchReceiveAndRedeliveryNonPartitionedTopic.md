        
Flaky-test: org.apache.pulsar.client.api.ConsumerBatchReceiveTest.testBatchReceiveAndRedeliveryNonPartitionedTopic
Number of failures: 1

org.apache.pulsar.client.api.ConsumerBatchReceiveTest is flaky. The testBatchReceiveAndRedeliveryNonPartitionedTopic test method fails sporadically.

```
java.lang.AssertionError: expected [202] but found [200]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1418)
	at org.testng.Assert.assertEquals(Assert.java:1382)
	at org.testng.Assert.assertEquals(Assert.java:1428)
	at org.apache.pulsar.client.api.ConsumerBatchReceiveTest.batchReceiveAndRedelivery(ConsumerBatchReceiveTest.java:651)
	at org.apache.pulsar.client.api.ConsumerBatchReceiveTest.testBatchReceiveAndRedelivery(ConsumerBatchReceiveTest.java:567)
	at org.apache.pulsar.client.api.ConsumerBatchReceiveTest.testBatchReceiveAndRedeliveryNonPartitionedTopic(ConsumerBatchReceiveTest.java:382)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-05T06:38:18.4213444Z](https://github.com/apache/pulsar/actions/runs/18254770865/job/51974816330#step:11:1810)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [202] but found [200]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1418)
	at org.testng.Assert.assertEquals(Assert.java:1382)
	at org.testng.Assert.assertEquals(Assert.java:1428)
	at org.apache.pulsar.client.api.ConsumerBatchReceiveTest.batchReceiveAndRedelivery(ConsumerBatchReceiveTest.java:651)
	at org.apache.pulsar.client.api.ConsumerBatchReceiveTest.testBatchReceiveAndRedelivery(ConsumerBatchReceiveTest.java:567)
	at org.apache.pulsar.client.api.ConsumerBatchReceiveTest.testBatchReceiveAndRedeliveryNonPartitionedTopic(ConsumerBatchReceiveTest.java:382)
	at jdk.internal.reflect.GeneratedMethodAccessor1466.invoke(Unknown Source)
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

