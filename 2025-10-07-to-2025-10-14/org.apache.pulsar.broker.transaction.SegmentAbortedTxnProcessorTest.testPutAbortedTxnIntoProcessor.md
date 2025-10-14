        
Flaky-test: org.apache.pulsar.broker.transaction.SegmentAbortedTxnProcessorTest.testPutAbortedTxnIntoProcessor
Number of failures: 1

org.apache.pulsar.broker.transaction.SegmentAbortedTxnProcessorTest is flaky. The testPutAbortedTxnIntoProcessor test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition expected:<1> but was:<0> within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.transaction.SegmentAbortedTxnProcessorTest.waitTaskExecuteCompletely(SegmentAbortedTxnProcessorTest.java:161)
	at org.apache.pulsar.broker.transaction.SegmentAbortedTxnProcessorTest.testPutAbortedTxnIntoProcessor(SegmentAbortedTxnProcessorTest.java:131)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-13T13:03:47.0462349Z](https://github.com/apache/pulsar/actions/runs/18463783817/job/52609672434#step:11:602)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition expected:<1> but was:<0> within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.transaction.SegmentAbortedTxnProcessorTest.waitTaskExecuteCompletely(SegmentAbortedTxnProcessorTest.java:161)
	at org.apache.pulsar.broker.transaction.SegmentAbortedTxnProcessorTest.testPutAbortedTxnIntoProcessor(SegmentAbortedTxnProcessorTest.java:131)
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
Caused by: java.lang.AssertionError: expected:<1> but was:<0>
	at org.testng.AssertJUnit.fail(AssertJUnit.java:65)
	at org.testng.AssertJUnit.failNotEquals(AssertJUnit.java:467)
	at org.testng.AssertJUnit.assertEquals(AssertJUnit.java:88)
	at org.testng.AssertJUnit.assertEquals(AssertJUnit.java:318)
	at org.testng.AssertJUnit.assertEquals(AssertJUnit.java:328)
	at org.apache.pulsar.broker.transaction.SegmentAbortedTxnProcessorTest.lambda$waitTaskExecuteCompletely$2(SegmentAbortedTxnProcessorTest.java:161)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	... 4 more

</pre></code>
</details>

