        
Flaky-test: org.apache.pulsar.client.impl.KeySharedSubscriptionTest.testCanRecoverConsumptionWhenLiftMaxUnAckedMessagesRestriction
Number of failures: 8

org.apache.pulsar.client.impl.KeySharedSubscriptionTest is flaky. The testCanRecoverConsumptionWhenLiftMaxUnAckedMessagesRestriction test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.client.impl.KeySharedSubscriptionTest was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.client.impl.KeySharedSubscriptionTest.testCanRecoverConsumptionWhenLiftMaxUnAckedMessagesRestriction(KeySharedSubscriptionTest.java:176)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-11-30T11:19:58.2932803Z](https://github.com/apache/pulsar/actions/runs/3582673357/jobs/6027379286#step:9:599)  
[example failure 2022-11-28T05:27:44.6703597Z](https://github.com/apache/pulsar/actions/runs/3561452310/jobs/5983334445#step:9:599)  
[example failure 2022-11-28T03:50:53.3412576Z](https://github.com/apache/pulsar/actions/runs/3561452310/jobs/5982492982#step:9:599)  
[example failure 2022-11-28T02:34:56.2714295Z](https://github.com/apache/pulsar/actions/runs/3561123430/jobs/5981834666#step:10:589)  
[example failure 2022-11-28T01:35:42.6310567Z](https://github.com/apache/pulsar/actions/runs/3560857647/jobs/5981340045#step:10:589)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.client.impl.KeySharedSubscriptionTest was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.client.impl.KeySharedSubscriptionTest.testCanRecoverConsumptionWhenLiftMaxUnAckedMessagesRestriction(KeySharedSubscriptionTest.java:176)
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

</pre></code>
</details>

```
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.client.impl.KeySharedSubscriptionTest was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.client.impl.KeySharedSubscriptionTest.testCanRecoverConsumptionWhenLiftMaxUnAckedMessagesRestriction(KeySharedSubscriptionTest.java:180)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-11-25T12:12:32.9275929Z](https://github.com/apache/pulsar/actions/runs/3547729724/jobs/5958334303#step:10:589)  
[example failure 2022-11-25T03:35:31.4394420Z](https://github.com/apache/pulsar/actions/runs/3545047879/jobs/5952956351#step:10:589)  
[example failure 2022-11-24T20:22:46.3532773Z](https://github.com/apache/pulsar/actions/runs/3543385957/jobs/5949880473#step:10:589)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.client.impl.KeySharedSubscriptionTest was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.client.impl.KeySharedSubscriptionTest.testCanRecoverConsumptionWhenLiftMaxUnAckedMessagesRestriction(KeySharedSubscriptionTest.java:180)
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

</pre></code>
</details>

