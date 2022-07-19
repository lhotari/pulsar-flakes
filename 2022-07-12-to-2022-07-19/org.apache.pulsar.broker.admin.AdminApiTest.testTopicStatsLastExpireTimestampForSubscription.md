        
Flaky-test: org.apache.pulsar.broker.admin.AdminApiTest.testTopicStatsLastExpireTimestampForSubscription
Number of failures: 1

org.apache.pulsar.broker.admin.AdminApiTest is flaky. The testTopicStatsLastExpireTimestampForSubscription test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Condition with lambda expression in org.apache.pulsar.broker.admin.AdminApiTest was not fulfilled within 2 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:864)
	at org.apache.pulsar.broker.admin.AdminApiTest.testTopicStatsLastExpireTimestampForSubscription(AdminApiTest.java:2528)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-05T03:44:12.1430888Z](https://github.com/apache/pulsar/runs/7189187181?check_suite_focus=true#step:9:406)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition with lambda expression in org.apache.pulsar.broker.admin.AdminApiTest was not fulfilled within 2 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:864)
	at org.apache.pulsar.broker.admin.AdminApiTest.testTopicStatsLastExpireTimestampForSubscription(AdminApiTest.java:2528)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

