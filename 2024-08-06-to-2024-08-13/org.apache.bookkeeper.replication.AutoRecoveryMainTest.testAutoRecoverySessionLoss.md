        
Flaky-test: org.apache.bookkeeper.replication.AutoRecoveryMainTest.testAutoRecoverySessionLoss
Number of failures: 1

org.apache.bookkeeper.replication.AutoRecoveryMainTest is flaky. The testAutoRecoverySessionLoss test method fails sporadically.

```
java.lang.AssertionError: Current Auditor should be AR3 expected:<null> but was:<127.0.0.1:37123>
	at org.testng.AssertJUnit.fail(AssertJUnit.java:65)
	at org.testng.AssertJUnit.failNotEquals(AssertJUnit.java:467)
	at org.testng.AssertJUnit.assertEquals(AssertJUnit.java:88)
	at org.apache.bookkeeper.replication.AutoRecoveryMainTest.testAutoRecoverySessionLoss(AutoRecoveryMainTest.java:199)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-08-08T12:19:38.0039753Z](https://github.com/apache/pulsar/actions/runs/10301530029/job/28513715228#step:10:356)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: Current Auditor should be AR3 expected:<null> but was:<127.0.0.1:37123>
	at org.testng.AssertJUnit.fail(AssertJUnit.java:65)
	at org.testng.AssertJUnit.failNotEquals(AssertJUnit.java:467)
	at org.testng.AssertJUnit.assertEquals(AssertJUnit.java:88)
	at org.apache.bookkeeper.replication.AutoRecoveryMainTest.testAutoRecoverySessionLoss(AutoRecoveryMainTest.java:199)
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

