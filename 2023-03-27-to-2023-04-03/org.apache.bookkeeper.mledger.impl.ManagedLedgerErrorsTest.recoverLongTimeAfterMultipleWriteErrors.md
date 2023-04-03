        
Flaky-test: org.apache.bookkeeper.mledger.impl.ManagedLedgerErrorsTest.recoverLongTimeAfterMultipleWriteErrors
Number of failures: 4

org.apache.bookkeeper.mledger.impl.ManagedLedgerErrorsTest is flaky. The recoverLongTimeAfterMultipleWriteErrors test method fails sporadically.

```
java.lang.AssertionError: expected [null] but found [org.apache.bookkeeper.mledger.ManagedLedgerException$ManagedLedgerAlreadyClosedException: Waiting to recover from failure]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerErrorsTest.recoverLongTimeAfterMultipleWriteErrors(ManagedLedgerErrorsTest.java:541)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-03-31T07:30:54.0126295Z](https://github.com/apache/pulsar/actions/runs/4572589261/jobs/8072003198#step:8:2731)  
[example failure 2023-03-27T11:39:57.1980851Z](https://github.com/apache/pulsar/actions/runs/4531854504/jobs/7982518239#step:8:5421)  
[example failure 2023-03-27T11:34:16.5659924Z](https://github.com/apache/pulsar/actions/runs/4531854504/jobs/7982518239#step:8:3543)  
[example failure 2023-03-27T11:28:39.0961271Z](https://github.com/apache/pulsar/actions/runs/4531854504/jobs/7982518239#step:8:1666)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.bookkeeper.mledger.ManagedLedgerException$ManagedLedgerAlreadyClosedException: Waiting to recover from failure]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerErrorsTest.recoverLongTimeAfterMultipleWriteErrors(ManagedLedgerErrorsTest.java:541)
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

