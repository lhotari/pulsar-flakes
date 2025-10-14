        
Flaky-test: org.apache.bookkeeper.mledger.impl.ManagedCursorConcurrencyTest.testConcurrentReadOfSameEntry
Number of failures: 1

org.apache.bookkeeper.mledger.impl.ManagedCursorConcurrencyTest is flaky. The testConcurrentReadOfSameEntry test method fails sporadically.

```
java.lang.AssertionError: expected [null] but found [Mismatched entry in cursor 2 at position 5--- Expected: entry4, Actual: 4]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotSame(Assert.java:1573)
	at org.testng.Assert.assertNull(Assert.java:1506)
	at org.testng.Assert.assertNull(Assert.java:1494)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorConcurrencyTest.testConcurrentReadOfSameEntry(ManagedCursorConcurrencyTest.java:359)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-08T13:29:50.0214025Z](https://github.com/apache/pulsar/actions/runs/18344190273/job/52253425757#step:11:2327)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [Mismatched entry in cursor 2 at position 5--- Expected: entry4, Actual: 4]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotSame(Assert.java:1573)
	at org.testng.Assert.assertNull(Assert.java:1506)
	at org.testng.Assert.assertNull(Assert.java:1494)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorConcurrencyTest.testConcurrentReadOfSameEntry(ManagedCursorConcurrencyTest.java:359)
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

