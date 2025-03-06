        
Flaky-test: org.apache.pulsar.broker.service.BatchMessageWithBatchIndexLevelTest.testBatchMessageDispatchingAccordingToPermits
Number of failures: 1

org.apache.pulsar.broker.service.BatchMessageWithBatchIndexLevelTest is flaky. The testBatchMessageDispatchingAccordingToPermits test method fails sporadically.

```
java.lang.AssertionError: expected [10.0] but found [100.0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEquals(Assert.java:836)
	at org.testng.Assert.assertEquals(Assert.java:849)
	at org.apache.pulsar.broker.service.BatchMessageTest.testBatchMessageDispatchingAccordingToPermits(BatchMessageTest.java:1015)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-03-04T12:31:40.1997064Z](https://github.com/apache/pulsar/actions/runs/13653402772/job/38167450974#step:11:657)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [10.0] but found [100.0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEquals(Assert.java:836)
	at org.testng.Assert.assertEquals(Assert.java:849)
	at org.apache.pulsar.broker.service.BatchMessageTest.testBatchMessageDispatchingAccordingToPermits(BatchMessageTest.java:1015)
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

