        
Flaky-test: org.apache.bookkeeper.mledger.impl.ManagedLedgerTest.testLedgerReachMaximumRolloverTime
Number of failures: 1

org.apache.bookkeeper.mledger.impl.ManagedLedgerTest is flaky. The testLedgerReachMaximumRolloverTime test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Condition with lambda expression in org.apache.bookkeeper.mledger.impl.ManagedLedgerTest that uses long, longorg.apache.bookkeeper.mledger.ManagedLedger was not fulfilled within 1 seconds 100 milliseconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:864)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerTest.testLedgerReachMaximumRolloverTime(ManagedLedgerTest.java:3040)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-21T04:27:40.8911144Z](https://github.com/apache/pulsar/runs/4276528360?check_suite_focus=true?check_suite_focus=true#step:8:18053)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition with lambda expression in org.apache.bookkeeper.mledger.impl.ManagedLedgerTest that uses long, longorg.apache.bookkeeper.mledger.ManagedLedger was not fulfilled within 1 seconds 100 milliseconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:864)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerTest.testLedgerReachMaximumRolloverTime(ManagedLedgerTest.java:3040)
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

