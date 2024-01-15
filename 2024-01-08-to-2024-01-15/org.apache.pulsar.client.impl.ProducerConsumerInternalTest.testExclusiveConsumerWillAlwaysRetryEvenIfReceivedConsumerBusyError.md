        
Flaky-test: org.apache.pulsar.client.impl.ProducerConsumerInternalTest.testExclusiveConsumerWillAlwaysRetryEvenIfReceivedConsumerBusyError
Number of failures: 4

org.apache.pulsar.client.impl.ProducerConsumerInternalTest is flaky. The testExclusiveConsumerWillAlwaysRetryEvenIfReceivedConsumerBusyError test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a org.apache.pulsar.client.impl.ProducerConsumerInternalTest expected [Ready] but found [Connecting] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.client.impl.ProducerConsumerInternalTest.testExclusiveConsumerWillAlwaysRetryEvenIfReceivedConsumerBusyError(ProducerConsumerInternalTest.java:139)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-01-11T13:54:30.4387529Z](https://github.com/apache/pulsar/actions/runs/7488297259/job/20386521221#step:10:1574)  
[example failure 2024-01-11T12:11:17.1255887Z](https://github.com/apache/pulsar/actions/runs/7488297259/job/20382798807#step:11:1556)  
[example failure 2024-01-11T05:39:10.6200436Z](https://github.com/apache/pulsar/actions/runs/7479720760/job/20371819901#step:10:1575)  
[example failure 2024-01-09T12:51:58.0185768Z](https://github.com/apache/pulsar/actions/runs/7461155069/job/20301048706#step:10:1574)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a org.apache.pulsar.client.impl.ProducerConsumerInternalTest expected [Ready] but found [Connecting] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.client.impl.ProducerConsumerInternalTest.testExclusiveConsumerWillAlwaysRetryEvenIfReceivedConsumerBusyError(ProducerConsumerInternalTest.java:139)
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
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: java.lang.AssertionError: expected [Ready] but found [Connecting]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:643)
	at org.apache.pulsar.client.impl.ProducerConsumerInternalTest.lambda$testExclusiveConsumerWillAlwaysRetryEvenIfReceivedConsumerBusyError$4(ProducerConsumerInternalTest.java:140)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	... 4 more

</pre></code>
</details>

