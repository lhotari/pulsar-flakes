        
Flaky-test: org.apache.pulsar.broker.service.BatchMessageTest.testBatchMessageDispatchingAccordingToPermits
Number of failures: 2

org.apache.pulsar.broker.service.BatchMessageTest is flaky. The testBatchMessageDispatchingAccordingToPermits test method fails sporadically.

```
java.lang.AssertionError: expected [10.0] but found [31.0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEquals(Assert.java:836)
	at org.testng.Assert.assertEquals(Assert.java:849)
	at org.apache.pulsar.broker.service.BatchMessageTest.testBatchMessageDispatchingAccordingToPermits(BatchMessageTest.java:1015)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-03-05T06:20:04.6732394Z](https://github.com/apache/pulsar/actions/runs/13669533277/job/38217337948#step:11:1052)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [10.0] but found [31.0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEquals(Assert.java:836)
	at org.testng.Assert.assertEquals(Assert.java:849)
	at org.apache.pulsar.broker.service.BatchMessageTest.testBatchMessageDispatchingAccordingToPermits(BatchMessageTest.java:1015)
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

```
java.lang.AssertionError: expected [10.0] but found [100.0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEquals(Assert.java:836)
	at org.testng.Assert.assertEquals(Assert.java:849)
	at org.apache.pulsar.broker.service.BatchMessageTest.testBatchMessageDispatchingAccordingToPermits(BatchMessageTest.java:1015)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-03-06T06:18:47.8394530Z](https://github.com/apache/pulsar/actions/runs/13692271763/job/38287800956#step:10:1070)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [10.0] but found [100.0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEquals(Assert.java:836)
	at org.testng.Assert.assertEquals(Assert.java:849)
	at org.apache.pulsar.broker.service.BatchMessageTest.testBatchMessageDispatchingAccordingToPermits(BatchMessageTest.java:1015)
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

