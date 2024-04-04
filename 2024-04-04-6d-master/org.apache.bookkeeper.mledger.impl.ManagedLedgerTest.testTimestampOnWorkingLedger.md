        
Flaky-test: org.apache.bookkeeper.mledger.impl.ManagedLedgerTest.testTimestampOnWorkingLedger
Number of failures: 1

org.apache.bookkeeper.mledger.impl.ManagedLedgerTest is flaky. The testTimestampOnWorkingLedger test method fails sporadically.

```
java.lang.AssertionError: well closed LedgerInfo should set a timestamp > 0 expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertTrue(Assert.java:56)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerTest.testTimestampOnWorkingLedger(ManagedLedgerTest.java:2486)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-03-31T12:47:05.5836051Z](https://github.com/apache/pulsar/actions/runs/8498023953/job/23277488610#step:11:111)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: well closed LedgerInfo should set a timestamp > 0 expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertTrue(Assert.java:56)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerTest.testTimestampOnWorkingLedger(ManagedLedgerTest.java:2486)
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
	at java.base/java.lang.Thread.run(Thread.java:840)

</pre></code>
</details>

