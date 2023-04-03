        
Flaky-test: org.apache.bookkeeper.mledger.impl.ManagedLedgerTest.testLedgerReachMaximumRolloverTime
Number of failures: 2

org.apache.bookkeeper.mledger.impl.ManagedLedgerTest is flaky. The testLedgerReachMaximumRolloverTime test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Condition with lambda expression in org.apache.bookkeeper.mledger.impl.ManagedLedgerTest that uses long, longorg.apache.bookkeeper.mledger.ManagedLedger was not fulfilled within 1 seconds 100 milliseconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:864)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerTest.testLedgerReachMaximumRolloverTime(ManagedLedgerTest.java:3110)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-03-31T08:34:43.1127110Z](https://github.com/apache/pulsar/actions/runs/4572796692/jobs/8072449598#step:8:20255)  
[example failure 2023-03-31T08:33:31.6208316Z](https://github.com/apache/pulsar/actions/runs/4572796692/jobs/8072449598#step:8:20013)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition with lambda expression in org.apache.bookkeeper.mledger.impl.ManagedLedgerTest that uses long, longorg.apache.bookkeeper.mledger.ManagedLedger was not fulfilled within 1 seconds 100 milliseconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:864)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerTest.testLedgerReachMaximumRolloverTime(ManagedLedgerTest.java:3110)
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

</pre></code>
</details>

