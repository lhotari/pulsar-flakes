        
Flaky-test: org.apache.pulsar.broker.service.BacklogQuotaManagerTest.testConsumerBacklogEvictionTimeQuotaWithEmptyLedger
Number of failures: 5

org.apache.pulsar.broker.service.BacklogQuotaManagerTest is flaky. The testConsumerBacklogEvictionTimeQuotaWithEmptyLedger test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.broker.service.BacklogQuotaManagerTest expected [0] but found [1] within 3 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.broker.service.BacklogQuotaManagerTest.testConsumerBacklogEvictionTimeQuotaWithEmptyLedger(BacklogQuotaManagerTest.java:519)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-31T16:01:06.9540902Z](https://github.com/apache/pulsar/runs/5008094073?check_suite_focus=true?check_suite_focus=true#step:9:3081)  
[example failure 2022-01-31T09:01:09.6952186Z](https://github.com/apache/pulsar/runs/5002911404?check_suite_focus=true?check_suite_focus=true#step:9:1391)  
[example failure 2022-01-29T05:08:04.8375396Z](https://github.com/apache/pulsar/runs/4989344391?check_suite_focus=true?check_suite_focus=true#step:9:528)  
[example failure 2022-01-28T09:29:20.6453391Z](https://github.com/apache/pulsar/runs/4978229090?check_suite_focus=true?check_suite_focus=true#step:9:4467)  
[example failure 2022-01-27T19:47:35.3671180Z](https://github.com/apache/pulsar/runs/4971515684?check_suite_focus=true?check_suite_focus=true#step:9:522)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.broker.service.BacklogQuotaManagerTest expected [0] but found [1] within 3 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.broker.service.BacklogQuotaManagerTest.testConsumerBacklogEvictionTimeQuotaWithEmptyLedger(BacklogQuotaManagerTest.java:519)
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
Caused by: java.lang.AssertionError: expected [0] but found [1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.broker.service.BacklogQuotaManagerTest.lambda$testConsumerBacklogEvictionTimeQuotaWithEmptyLedger$4(BacklogQuotaManagerTest.java:528)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:222)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:209)
	... 4 more

</pre></code>
</details>

