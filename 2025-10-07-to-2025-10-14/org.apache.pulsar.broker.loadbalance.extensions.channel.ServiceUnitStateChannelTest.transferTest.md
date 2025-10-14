        
Flaky-test: org.apache.pulsar.broker.loadbalance.extensions.channel.ServiceUnitStateChannelTest.transferTest
Number of failures: 1

org.apache.pulsar.broker.loadbalance.extensions.channel.ServiceUnitStateChannelTest is flaky. The transferTest test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition expected:<2> but was:<1> within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.loadbalance.extensions.channel.ServiceUnitStateChannelTest.validateHandlerCounters(ServiceUnitStateChannelTest.java:2240)
	at org.apache.pulsar.broker.loadbalance.extensions.channel.ServiceUnitStateChannelTest.transferTest(ServiceUnitStateChannelTest.java:491)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-08T05:56:30.7305786Z](https://github.com/apache/pulsar/actions/runs/18331835304/job/52216367189#step:11:1240)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition expected:<2> but was:<1> within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.loadbalance.extensions.channel.ServiceUnitStateChannelTest.validateHandlerCounters(ServiceUnitStateChannelTest.java:2240)
	at org.apache.pulsar.broker.loadbalance.extensions.channel.ServiceUnitStateChannelTest.transferTest(ServiceUnitStateChannelTest.java:491)
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
Caused by: java.lang.AssertionError: expected:<2> but was:<1>
	at org.testng.AssertJUnit.fail(AssertJUnit.java:65)
	at org.testng.AssertJUnit.failNotEquals(AssertJUnit.java:467)
	at org.testng.AssertJUnit.assertEquals(AssertJUnit.java:88)
	at org.testng.AssertJUnit.assertEquals(AssertJUnit.java:208)
	at org.testng.AssertJUnit.assertEquals(AssertJUnit.java:218)
	at org.apache.pulsar.broker.loadbalance.extensions.channel.ServiceUnitStateChannelTest.lambda$validateHandlerCounters$29(ServiceUnitStateChannelTest.java:2241)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	... 4 more

</pre></code>
</details>

