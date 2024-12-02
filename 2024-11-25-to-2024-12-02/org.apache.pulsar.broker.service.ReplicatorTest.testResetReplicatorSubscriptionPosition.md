        
Flaky-test: org.apache.pulsar.broker.service.ReplicatorTest.testResetReplicatorSubscriptionPosition
Number of failures: 1

org.apache.pulsar.broker.service.ReplicatorTest is flaky. The testResetReplicatorSubscriptionPosition test method fails sporadically.

```
java.lang.AssertionError: expected [0] but found [20]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:979)
	at org.testng.Assert.assertEquals(Assert.java:955)
	at org.testng.Assert.assertEquals(Assert.java:989)
	at org.apache.pulsar.broker.service.ReplicatorTest.testResetReplicatorSubscriptionPosition(ReplicatorTest.java:703)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-11-25T11:59:34.6347003Z](https://github.com/apache/pulsar/actions/runs/12009132304/job/33473682002#step:11:1474)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [0] but found [20]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:979)
	at org.testng.Assert.assertEquals(Assert.java:955)
	at org.testng.Assert.assertEquals(Assert.java:989)
	at org.apache.pulsar.broker.service.ReplicatorTest.testResetReplicatorSubscriptionPosition(ReplicatorTest.java:703)
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
