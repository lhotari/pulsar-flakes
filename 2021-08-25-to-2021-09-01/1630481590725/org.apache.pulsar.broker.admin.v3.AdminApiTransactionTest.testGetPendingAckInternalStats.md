        
Flaky-test: org.apache.pulsar.broker.admin.v3.AdminApiTransactionTest.testGetPendingAckInternalStats
Number of failures: 1

org.apache.pulsar.broker.admin.v3.AdminApiTransactionTest is flaky. The testGetPendingAckInternalStats test method fails sporadically.

```
java.lang.AssertionError: expected object to not be null
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.assertNotNull(Assert.java:942)
	at org.testng.Assert.assertNotNull(Assert.java:926)
	at org.apache.pulsar.broker.admin.v3.AdminApiTransactionTest.verifyManagedLegerInternalStats(AdminApiTransactionTest.java:421)
	at org.apache.pulsar.broker.admin.v3.AdminApiTransactionTest.testGetPendingAckInternalStats(AdminApiTransactionTest.java:370)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T07:52:05.7424325Z](https://github.com/apache/pulsar/runs/3440855061?check_suite_focus=true#step:9:320)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected object to not be null
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.assertNotNull(Assert.java:942)
	at org.testng.Assert.assertNotNull(Assert.java:926)
	at org.apache.pulsar.broker.admin.v3.AdminApiTransactionTest.verifyManagedLegerInternalStats(AdminApiTransactionTest.java:421)
	at org.apache.pulsar.broker.admin.v3.AdminApiTransactionTest.testGetPendingAckInternalStats(AdminApiTransactionTest.java:370)
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

