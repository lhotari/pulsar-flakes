        
Flaky-test: org.apache.bookkeeper.replication.AutoRecoveryMainTest.testAutoRecoverySessionLoss
Number of failures: 1

org.apache.bookkeeper.replication.AutoRecoveryMainTest is flaky. The testAutoRecoverySessionLoss test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a org.apache.bookkeeper.replication.AutoRecoveryMainTest  within 30 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.bookkeeper.replication.AutoRecoveryMainTest.testAutoRecoverySessionLoss(AutoRecoveryMainTest.java:100)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-09-25T13:51:37.2260412Z](https://github.com/apache/pulsar/actions/runs/6298312472/job/17102701263#step:9:1913)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a org.apache.bookkeeper.replication.AutoRecoveryMainTest  within 30 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.bookkeeper.replication.AutoRecoveryMainTest.testAutoRecoverySessionLoss(AutoRecoveryMainTest.java:100)
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
Caused by: java.lang.AssertionError:
	at org.testng.AssertJUnit.fail(AssertJUnit.java:65)
	at org.testng.AssertJUnit.assertTrue(AssertJUnit.java:23)
	at org.testng.AssertJUnit.assertNotNull(AssertJUnit.java:347)
	at org.testng.AssertJUnit.assertNotNull(AssertJUnit.java:337)
	at org.apache.bookkeeper.replication.AutoRecoveryMainTest.lambda$testAutoRecoverySessionLoss$0(AutoRecoveryMainTest.java:101)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	... 4 more

</pre></code>
</details>

