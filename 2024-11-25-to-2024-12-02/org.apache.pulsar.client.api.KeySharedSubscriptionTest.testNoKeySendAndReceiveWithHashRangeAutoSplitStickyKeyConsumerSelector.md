        
Flaky-test: org.apache.pulsar.client.api.KeySharedSubscriptionTest.testNoKeySendAndReceiveWithHashRangeAutoSplitStickyKeyConsumerSelector
Number of failures: 1

org.apache.pulsar.client.api.KeySharedSubscriptionTest is flaky. The testNoKeySendAndReceiveWithHashRangeAutoSplitStickyKeyConsumerSelector test method fails sporadically.

```
java.lang.AssertionError: expected [33.333333333333336] but found [18.0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEquals(Assert.java:697)
	at org.testng.Assert.assertEquals(Assert.java:710)
	at org.apache.pulsar.client.api.KeySharedSubscriptionTest.receiveAndCheckDistribution(KeySharedSubscriptionTest.java:1478)
	at org.apache.pulsar.client.api.KeySharedSubscriptionTest.testNoKeySendAndReceiveWithHashRangeAutoSplitStickyKeyConsumerSelector(KeySharedSubscriptionTest.java:400)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-11-28T19:32:03.0544910Z](https://github.com/apache/pulsar/actions/runs/12074341127/job/33672445502#step:10:1712)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [33.333333333333336] but found [18.0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEquals(Assert.java:697)
	at org.testng.Assert.assertEquals(Assert.java:710)
	at org.apache.pulsar.client.api.KeySharedSubscriptionTest.receiveAndCheckDistribution(KeySharedSubscriptionTest.java:1478)
	at org.apache.pulsar.client.api.KeySharedSubscriptionTest.testNoKeySendAndReceiveWithHashRangeAutoSplitStickyKeyConsumerSelector(KeySharedSubscriptionTest.java:400)
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

