        
Flaky-test: org.apache.bookkeeper.mledger.impl.ManagedCursorTest.testSkipEntriesWithIndividualDeletedMessages
Number of failures: 1

org.apache.bookkeeper.mledger.impl.ManagedCursorTest is flaky. The testSkipEntriesWithIndividualDeletedMessages test method fails sporadically.

```
java.lang.AssertionError: expected [4:0] but found [5:0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:643)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorTest.testSkipEntriesWithIndividualDeletedMessages(ManagedCursorTest.java:1852)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-21T06:14:33.1853855Z](https://github.com/apache/pulsar/actions/runs/14568292622/job/40861261963#step:11:2971)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [4:0] but found [5:0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:643)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorTest.testSkipEntriesWithIndividualDeletedMessages(ManagedCursorTest.java:1852)
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

