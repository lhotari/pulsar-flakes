        
Flaky-test: org.apache.pulsar.broker.SameAuthParamsLookupAutoClusterFailoverTest.testAutoClusterFailover
Number of failures: 1

org.apache.pulsar.broker.SameAuthParamsLookupAutoClusterFailoverTest is flaky. The testAutoClusterFailover test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition expected [true] but found [false] within 1 minutes.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.SameAuthParamsLookupAutoClusterFailoverTest.testAutoClusterFailover(SameAuthParamsLookupAutoClusterFailoverTest.java:135)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-03-03T12:39:12.4652095Z](https://github.com/apache/pulsar/actions/runs/13630586650/job/38097779761#step:11:1722)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition expected [true] but found [false] within 1 minutes.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.SameAuthParamsLookupAutoClusterFailoverTest.testAutoClusterFailover(SameAuthParamsLookupAutoClusterFailoverTest.java:135)
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
Caused by: java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertTrue(Assert.java:56)
	at org.testng.Assert.assertTrue(Assert.java:66)
	at org.apache.pulsar.broker.SameAuthParamsLookupAutoClusterFailoverTest.lambda$testAutoClusterFailover$5(SameAuthParamsLookupAutoClusterFailoverTest.java:143)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	... 4 more

</pre></code>
</details>

