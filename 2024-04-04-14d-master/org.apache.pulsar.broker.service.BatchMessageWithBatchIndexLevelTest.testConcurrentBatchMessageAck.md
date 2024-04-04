        
Flaky-test: org.apache.pulsar.broker.service.BatchMessageWithBatchIndexLevelTest.testConcurrentBatchMessageAck
Number of failures: 1

org.apache.pulsar.broker.service.BatchMessageWithBatchIndexLevelTest is flaky. The testConcurrentBatchMessageAck test method fails sporadically.

```
java.lang.AssertionError: expected [0] but found [10]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1418)
	at org.testng.Assert.assertEquals(Assert.java:1382)
	at org.testng.Assert.assertEquals(Assert.java:1428)
	at org.apache.pulsar.broker.service.BatchMessageTest.testConcurrentBatchMessageAck(BatchMessageTest.java:793)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-03-27T06:32:17.6978178Z](https://github.com/apache/pulsar/actions/runs/8447341311/job/23137784128#step:11:969)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [0] but found [10]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1418)
	at org.testng.Assert.assertEquals(Assert.java:1382)
	at org.testng.Assert.assertEquals(Assert.java:1428)
	at org.apache.pulsar.broker.service.BatchMessageTest.testConcurrentBatchMessageAck(BatchMessageTest.java:793)
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
