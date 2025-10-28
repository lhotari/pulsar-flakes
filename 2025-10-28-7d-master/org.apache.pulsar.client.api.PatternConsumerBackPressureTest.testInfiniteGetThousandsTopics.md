        
Flaky-test: org.apache.pulsar.client.api.PatternConsumerBackPressureTest.testInfiniteGetThousandsTopics
Number of failures: 2

org.apache.pulsar.client.api.PatternConsumerBackPressureTest is flaky. The testInfiniteGetThousandsTopics test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a org.apache.pulsar.client.api.PatternConsumerBackPressureTest expected [2048] but found [291] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.client.api.PatternConsumerBackPressureTest.testInfiniteGetThousandsTopics(PatternConsumerBackPressureTest.java:95)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-24T06:19:26.0758902Z](https://github.com/apache/pulsar/actions/runs/18771071741/job/53556168299#step:11:2512)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a org.apache.pulsar.client.api.PatternConsumerBackPressureTest expected [2048] but found [291] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.client.api.PatternConsumerBackPressureTest.testInfiniteGetThousandsTopics(PatternConsumerBackPressureTest.java:95)
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
Caused by: java.lang.AssertionError: expected [2048] but found [291]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1418)
	at org.testng.Assert.assertEquals(Assert.java:1382)
	at org.testng.Assert.assertEquals(Assert.java:1428)
	at org.apache.pulsar.client.api.PatternConsumerBackPressureTest.lambda$testInfiniteGetThousandsTopics$2(PatternConsumerBackPressureTest.java:96)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	... 4 more

</pre></code>
</details>

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.client.api.PatternConsumerBackPressureTest.testInfiniteGetThousandsTopics() didn't finish within the time-out 60000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-23T06:21:01.8813604Z](https://github.com/apache/pulsar/actions/runs/18739041419/job/53452090810#step:11:1499)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.client.api.PatternConsumerBackPressureTest.testInfiniteGetThousandsTopics() didn't finish within the time-out 60000
	at java.base@17.0.17/jdk.internal.misc.Unsafe.park(Native Method)
	at java.base@17.0.17/java.util.concurrent.locks.LockSupport.park(LockSupport.java:211)
	at java.base@17.0.17/java.util.concurrent.locks.AbstractQueuedSynchronizer.acquire(AbstractQueuedSynchronizer.java:715)
	at java.base@17.0.17/java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1047)
	at java.base@17.0.17/java.util.concurrent.CountDownLatch.await(CountDownLatch.java:230)
	at app//org.apache.pulsar.client.api.PatternConsumerBackPressureTest.testInfiniteGetThousandsTopics(PatternConsumerBackPressureTest.java:94)
	at java.base@17.0.17/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base@17.0.17/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base@17.0.17/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base@17.0.17/java.lang.reflect.Method.invoke(Method.java:569)
	at app//org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base@17.0.17/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base@17.0.17/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base@17.0.17/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base@17.0.17/java.lang.Thread.run(Thread.java:840)

</pre></code>
</details>

