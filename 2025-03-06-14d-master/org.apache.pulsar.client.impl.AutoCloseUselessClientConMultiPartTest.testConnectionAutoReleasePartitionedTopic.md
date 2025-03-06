        
Flaky-test: org.apache.pulsar.client.impl.AutoCloseUselessClientConMultiPartTest.testConnectionAutoReleasePartitionedTopic
Number of failures: 1

org.apache.pulsar.client.impl.AutoCloseUselessClientConMultiPartTest is flaky. The testConnectionAutoReleasePartitionedTopic test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Condition org.apache.pulsar.client.impl.AutoCloseUselessClientConSupports$$Lambda/0x00007f01d0da3b78 was not fulfilled within 5 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.client.impl.AutoCloseUselessClientConSupports.trigReleaseConnection(AutoCloseUselessClientConSupports.java:69)
	at org.apache.pulsar.client.impl.AutoCloseUselessClientConMultiPartTest.testConnectionAutoReleasePartitionedTopic(AutoCloseUselessClientConMultiPartTest.java:89)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-02-28T12:40:01.5754240Z](https://github.com/apache/pulsar/actions/runs/13587854348/job/37987201720#step:11:1720)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition org.apache.pulsar.client.impl.AutoCloseUselessClientConSupports$$Lambda/0x00007f01d0da3b78 was not fulfilled within 5 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.client.impl.AutoCloseUselessClientConSupports.trigReleaseConnection(AutoCloseUselessClientConSupports.java:69)
	at org.apache.pulsar.client.impl.AutoCloseUselessClientConMultiPartTest.testConnectionAutoReleasePartitionedTopic(AutoCloseUselessClientConMultiPartTest.java:89)
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

</pre></code>
</details>

