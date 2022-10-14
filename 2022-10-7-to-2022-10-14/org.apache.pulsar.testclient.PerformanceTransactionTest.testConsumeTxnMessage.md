        
Flaky-test: org.apache.pulsar.testclient.PerformanceTransactionTest.testConsumeTxnMessage
Number of failures: 3

org.apache.pulsar.testclient.PerformanceTransactionTest is flaky. The testConsumeTxnMessage test method fails sporadically.

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@734a2757]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.testclient.PerformanceTransactionTest.testConsumeTxnMessage(PerformanceTransactionTest.java:246)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-12T03:09:55.2412888Z](https://github.com/apache/pulsar/actions/runs/3227865812/jobs/5291236118#step:9:8750)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@734a2757]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.testclient.PerformanceTransactionTest.testConsumeTxnMessage(PerformanceTransactionTest.java:246)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@64691c19]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.testclient.PerformanceTransactionTest.testConsumeTxnMessage(PerformanceTransactionTest.java:246)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-11T07:01:12.9311297Z](https://github.com/apache/pulsar/actions/runs/3224531073/jobs/5275888862#step:9:8750)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@64691c19]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.testclient.PerformanceTransactionTest.testConsumeTxnMessage(PerformanceTransactionTest.java:246)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@52c5c46]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.testclient.PerformanceTransactionTest.testConsumeTxnMessage(PerformanceTransactionTest.java:245)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-08-31T18:27:34.3429023Z](https://github.com/apache/pulsar/runs/8119669756?check_suite_focus=true#step:9:8678)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@52c5c46]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.testclient.PerformanceTransactionTest.testConsumeTxnMessage(PerformanceTransactionTest.java:245)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

