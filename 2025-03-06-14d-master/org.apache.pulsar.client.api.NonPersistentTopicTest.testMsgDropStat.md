        
Flaky-test: org.apache.pulsar.client.api.NonPersistentTopicTest.testMsgDropStat
Number of failures: 1

org.apache.pulsar.client.api.NonPersistentTopicTest is flaky. The testMsgDropStat test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a org.apache.pulsar.client.api.NonPersistentTopicTest expected [true] but found [false] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.client.api.NonPersistentTopicTest.testMsgDropStat(NonPersistentTopicTest.java:900)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-02-25T06:17:10.5245802Z](https://github.com/apache/pulsar/actions/runs/13514692857/job/37761526396#step:11:610)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a org.apache.pulsar.client.api.NonPersistentTopicTest expected [true] but found [false] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.client.api.NonPersistentTopicTest.testMsgDropStat(NonPersistentTopicTest.java:900)
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
Caused by: java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertTrue(Assert.java:56)
	at org.testng.Assert.assertTrue(Assert.java:66)
	at org.apache.pulsar.client.api.NonPersistentTopicTest.lambda$testMsgDropStat$5(NonPersistentTopicTest.java:906)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	... 4 more

</pre></code>
</details>

