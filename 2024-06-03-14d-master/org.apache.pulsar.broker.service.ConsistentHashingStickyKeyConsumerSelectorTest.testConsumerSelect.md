        
Flaky-test: org.apache.pulsar.broker.service.ConsistentHashingStickyKeyConsumerSelectorTest.testConsumerSelect
Number of failures: 1

org.apache.pulsar.broker.service.ConsistentHashingStickyKeyConsumerSelectorTest is flaky. The testConsumerSelect test method fails sporadically.

```
java.lang.AssertionError: expected [250.0] but found [307.0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEquals(Assert.java:697)
	at org.testng.Assert.assertEquals(Assert.java:710)
	at org.apache.pulsar.broker.service.ConsistentHashingStickyKeyConsumerSelectorTest.testConsumerSelect(ConsistentHashingStickyKeyConsumerSelectorTest.java:101)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-05-20T06:23:18.1632744Z](https://github.com/apache/pulsar/actions/runs/9154241645/job/25164745885#step:11:810)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [250.0] but found [307.0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEquals(Assert.java:697)
	at org.testng.Assert.assertEquals(Assert.java:710)
	at org.apache.pulsar.broker.service.ConsistentHashingStickyKeyConsumerSelectorTest.testConsumerSelect(ConsistentHashingStickyKeyConsumerSelectorTest.java:101)
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

