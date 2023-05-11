        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.testConcurrentConsumerReceiveWhileReconnect
Number of failures: 5

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The testConcurrentConsumerReceiveWhileReconnect test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a org.apache.pulsar.client.api.SimpleProducerConsumerTest expected [10] but found [0] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testConcurrentConsumerReceiveWhileReconnect(SimpleProducerConsumerTest.java:969)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-05-08T09:03:45.2903053Z](https://github.com/apache/pulsar/actions/runs/4913117414/jobs/8773172923#step:9:320)  
[example failure 2023-05-06T08:48:52.2639346Z](https://github.com/apache/pulsar/actions/runs/4900653267/jobs/8751450718#step:8:332)  
[example failure 2023-05-05T15:10:00.4882578Z](https://github.com/apache/pulsar/actions/runs/4894688425/jobs/8739261866#step:8:332)  
[example failure 2023-05-04T10:46:48.1348334Z](https://github.com/apache/pulsar/actions/runs/4872859455/jobs/8711035357#step:9:331)  
[example failure 2023-05-04T08:08:59.7001438Z](https://github.com/apache/pulsar/actions/runs/4879114080/jobs/8707862624#step:9:331)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a org.apache.pulsar.client.api.SimpleProducerConsumerTest expected [10] but found [0] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testConcurrentConsumerReceiveWhileReconnect(SimpleProducerConsumerTest.java:969)
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
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: java.lang.AssertionError: expected [10] but found [0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1413)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1240)
	at org.testng.Assert.assertEquals(Assert.java:1274)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.lambda$testConcurrentConsumerReceiveWhileReconnect$9(SimpleProducerConsumerTest.java:971)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	... 4 more

</pre></code>
</details>

