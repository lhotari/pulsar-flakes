        
Flaky-test: org.apache.pulsar.metadata.LeaderElectionTest.revalidateLeaderWithinSameSession
Number of failures: 2

org.apache.pulsar.metadata.LeaderElectionTest is flaky. The revalidateLeaderWithinSameSession test method fails sporadically.

```
java.lang.AssertionError: expected [Optional[test-2]] but found [Optional.empty]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:643)
	at org.apache.pulsar.metadata.BaseMetadataStoreTest.lambda$assertEqualsAndRetry$6(BaseMetadataStoreTest.java:133)
	at org.apache.pulsar.metadata.BaseMetadataStoreTest.retryStrategically(BaseMetadataStoreTest.java:141)
	at org.apache.pulsar.metadata.BaseMetadataStoreTest.assertEqualsAndRetry(BaseMetadataStoreTest.java:129)
	at org.apache.pulsar.metadata.BaseMetadataStoreTest.assertEqualsAndRetry(BaseMetadataStoreTest.java:121)
	at org.apache.pulsar.metadata.LeaderElectionTest.revalidateLeaderWithinSameSession(LeaderElectionTest.java:212)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-11-18T12:21:56.1868635Z](https://github.com/apache/pulsar/actions/runs/6913796539/job/18811149757#step:11:241)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [Optional[test-2]] but found [Optional.empty]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:643)
	at org.apache.pulsar.metadata.BaseMetadataStoreTest.lambda$assertEqualsAndRetry$6(BaseMetadataStoreTest.java:133)
	at org.apache.pulsar.metadata.BaseMetadataStoreTest.retryStrategically(BaseMetadataStoreTest.java:141)
	at org.apache.pulsar.metadata.BaseMetadataStoreTest.assertEqualsAndRetry(BaseMetadataStoreTest.java:129)
	at org.apache.pulsar.metadata.BaseMetadataStoreTest.assertEqualsAndRetry(BaseMetadataStoreTest.java:121)
	at org.apache.pulsar.metadata.LeaderElectionTest.revalidateLeaderWithinSameSession(LeaderElectionTest.java:212)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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

[example failure 2023-11-15T06:20:40.2995786Z](https://github.com/apache/pulsar/actions/runs/6873539140/job/18694087992#step:11:257)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [Optional[test-2]] but found [Optional.empty]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:643)
	at org.apache.pulsar.metadata.BaseMetadataStoreTest.lambda$assertEqualsAndRetry$6(BaseMetadataStoreTest.java:133)
	at org.apache.pulsar.metadata.BaseMetadataStoreTest.retryStrategically(BaseMetadataStoreTest.java:141)
	at org.apache.pulsar.metadata.BaseMetadataStoreTest.assertEqualsAndRetry(BaseMetadataStoreTest.java:129)
	at org.apache.pulsar.metadata.BaseMetadataStoreTest.assertEqualsAndRetry(BaseMetadataStoreTest.java:121)
	at org.apache.pulsar.metadata.LeaderElectionTest.revalidateLeaderWithinSameSession(LeaderElectionTest.java:212)
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

