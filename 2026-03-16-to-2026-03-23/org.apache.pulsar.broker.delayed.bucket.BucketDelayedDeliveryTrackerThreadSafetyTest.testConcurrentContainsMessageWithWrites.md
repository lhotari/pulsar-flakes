        
Flaky-test: org.apache.pulsar.broker.delayed.bucket.BucketDelayedDeliveryTrackerThreadSafetyTest.testConcurrentContainsMessageWithWrites
Number of failures: 2

org.apache.pulsar.broker.delayed.bucket.BucketDelayedDeliveryTrackerThreadSafetyTest is flaky. The testConcurrentContainsMessageWithWrites test method fails sporadically.

```
java.lang.AssertionError: No exceptions should occur during concurrent operations expected [0] but found [4]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1418)
	at org.testng.Assert.assertEquals(Assert.java:1382)
	at org.apache.pulsar.broker.delayed.bucket.BucketDelayedDeliveryTrackerThreadSafetyTest.testConcurrentContainsMessageWithWrites(BucketDelayedDeliveryTrackerThreadSafetyTest.java:176)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-17T23:30:31.9121961Z](https://github.com/apache/pulsar/actions/runs/23220634967/job/67493010737#step:11:1476)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.delayed.bucket.BucketDelayedDeliveryTrackerThreadSafetyTest.testConcurrentContainsMessageWithWrites -- Time elapsed: 0.061 s <<< FAILURE!
java.lang.AssertionError: No exceptions should occur during concurrent operations expected [0] but found [4]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1418)
	at org.testng.Assert.assertEquals(Assert.java:1382)
	at org.apache.pulsar.broker.delayed.bucket.BucketDelayedDeliveryTrackerThreadSafetyTest.testConcurrentContainsMessageWithWrites(BucketDelayedDeliveryTrackerThreadSafetyTest.java:176)
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

```
java.lang.AssertionError: No exceptions should occur during concurrent operations expected [0] but found [1]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1418)
	at org.testng.Assert.assertEquals(Assert.java:1382)
	at org.apache.pulsar.broker.delayed.bucket.BucketDelayedDeliveryTrackerThreadSafetyTest.testConcurrentContainsMessageWithWrites(BucketDelayedDeliveryTrackerThreadSafetyTest.java:176)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-19T17:05:56.1418064Z](https://github.com/apache/pulsar/actions/runs/23305964916/job/67781402620#step:11:1479)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.delayed.bucket.BucketDelayedDeliveryTrackerThreadSafetyTest.testConcurrentContainsMessageWithWrites -- Time elapsed: 0.037 s <<< FAILURE!
java.lang.AssertionError: No exceptions should occur during concurrent operations expected [0] but found [1]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1418)
	at org.testng.Assert.assertEquals(Assert.java:1382)
	at org.apache.pulsar.broker.delayed.bucket.BucketDelayedDeliveryTrackerThreadSafetyTest.testConcurrentContainsMessageWithWrites(BucketDelayedDeliveryTrackerThreadSafetyTest.java:176)
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

