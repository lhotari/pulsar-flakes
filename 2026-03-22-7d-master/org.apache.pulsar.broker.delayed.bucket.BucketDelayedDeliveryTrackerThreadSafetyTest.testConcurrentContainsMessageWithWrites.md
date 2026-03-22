        
Flaky-test: org.apache.pulsar.broker.delayed.bucket.BucketDelayedDeliveryTrackerThreadSafetyTest.testConcurrentContainsMessageWithWrites
Number of failures: 1

org.apache.pulsar.broker.delayed.bucket.BucketDelayedDeliveryTrackerThreadSafetyTest is flaky. The testConcurrentContainsMessageWithWrites test method fails sporadically.

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
[example failure 2026-03-16T06:48:59.7564164Z](https://github.com/apache/pulsar/actions/runs/23130809987/job/67184289463#step:11:1488)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.delayed.bucket.BucketDelayedDeliveryTrackerThreadSafetyTest.testConcurrentContainsMessageWithWrites -- Time elapsed: 0.051 s <<< FAILURE!
java.lang.AssertionError: No exceptions should occur during concurrent operations expected [0] but found [1]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1418)
	at org.testng.Assert.assertEquals(Assert.java:1382)
	at org.apache.pulsar.broker.delayed.bucket.BucketDelayedDeliveryTrackerThreadSafetyTest.testConcurrentContainsMessageWithWrites(BucketDelayedDeliveryTrackerThreadSafetyTest.java:176)
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

