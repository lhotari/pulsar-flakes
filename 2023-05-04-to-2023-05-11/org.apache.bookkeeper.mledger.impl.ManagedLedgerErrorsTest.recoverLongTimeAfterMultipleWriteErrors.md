        
Flaky-test: org.apache.bookkeeper.mledger.impl.ManagedLedgerErrorsTest.recoverLongTimeAfterMultipleWriteErrors
Number of failures: 7

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
[example failure 2023-05-10T09:40:22.7071896Z](https://github.com/apache/pulsar/actions/runs/4934042860/jobs/8821241983#step:8:5679)  
[example failure 2023-05-10T09:29:58.0810053Z](https://github.com/apache/pulsar/actions/runs/4934042860/jobs/8821241983#step:8:3696)  
[example failure 2023-05-10T09:19:40.8957321Z](https://github.com/apache/pulsar/actions/runs/4934042860/jobs/8821241983#step:8:1731)  
[example failure 2023-05-10T07:23:07.1325963Z](https://github.com/apache/pulsar/actions/runs/4934042860/jobs/8818616438#step:8:4496)  
[example failure 2023-05-10T07:12:21.9787218Z](https://github.com/apache/pulsar/actions/runs/4934042860/jobs/8818616438#step:8:2520)  
[example failure 2023-05-06T11:26:35.0497316Z](https://github.com/apache/pulsar/actions/runs/4901318971/jobs/8752520647#step:8:1642)  
[example failure 2023-05-06T06:24:34.8548405Z](https://github.com/apache/pulsar/actions/runs/4900136585/jobs/8750592102#step:8:1762)  


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

