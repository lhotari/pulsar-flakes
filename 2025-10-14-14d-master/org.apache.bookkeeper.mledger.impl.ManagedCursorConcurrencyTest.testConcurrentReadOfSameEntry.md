        
Flaky-test: org.apache.bookkeeper.mledger.impl.ManagedCursorConcurrencyTest.testConcurrentReadOfSameEntry
Number of failures: 1

org.apache.bookkeeper.mledger.impl.ManagedCursorConcurrencyTest is flaky. The testConcurrentReadOfSameEntry test method fails sporadically.

```
java.lang.AssertionError: expected [null] but found [Mismatched entry in cursor 3 at position 99--- Expected: entry98, Actual: 98]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotSame(Assert.java:1573)
	at org.testng.Assert.assertNull(Assert.java:1506)
	at org.testng.Assert.assertNull(Assert.java:1494)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorConcurrencyTest.testConcurrentReadOfSameEntry(ManagedCursorConcurrencyTest.java:359)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-09T06:17:13.3976959Z](https://github.com/apache/pulsar/actions/runs/18367010518/job/52322377012#step:11:2293)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [Mismatched entry in cursor 3 at position 99--- Expected: entry98, Actual: 98]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotSame(Assert.java:1573)
	at org.testng.Assert.assertNull(Assert.java:1506)
	at org.testng.Assert.assertNull(Assert.java:1494)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorConcurrencyTest.testConcurrentReadOfSameEntry(ManagedCursorConcurrencyTest.java:359)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
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

