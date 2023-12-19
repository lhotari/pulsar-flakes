        
Flaky-test: org.apache.pulsar.client.api.SubscriptionMessageDispatchThrottlingTest.testClosingRateLimiter
Number of failures: 9

org.apache.pulsar.client.api.SubscriptionMessageDispatchThrottlingTest is flaky. The testClosingRateLimiter test method fails sporadically.

```
java.lang.AssertionError: expected [-1] but found [10]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:979)
	at org.testng.Assert.assertEquals(Assert.java:955)
	at org.testng.Assert.assertEquals(Assert.java:989)
	at org.apache.pulsar.client.api.SubscriptionMessageDispatchThrottlingTest.testClosingRateLimiter(SubscriptionMessageDispatchThrottlingTest.java:915)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-12-19T06:28:09.7491887Z](https://github.com/apache/pulsar/actions/runs/7258004430/job/19772661615#step:9:2165)  
[example failure 2023-12-18T06:27:21.4417513Z](https://github.com/apache/pulsar/actions/runs/7244255862/job/19732299740#step:9:2165)  
[example failure 2023-12-17T06:27:12.5417636Z](https://github.com/apache/pulsar/actions/runs/7236708045/job/19715534805#step:9:2229)  
[example failure 2023-12-16T06:27:12.6309426Z](https://github.com/apache/pulsar/actions/runs/7230194114/job/19701980223#step:9:2165)  
[example failure 2023-12-15T06:27:56.4802059Z](https://github.com/apache/pulsar/actions/runs/7218583714/job/19668197509#step:9:2165)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [-1] but found [10]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:979)
	at org.testng.Assert.assertEquals(Assert.java:955)
	at org.testng.Assert.assertEquals(Assert.java:989)
	at org.apache.pulsar.client.api.SubscriptionMessageDispatchThrottlingTest.testClosingRateLimiter(SubscriptionMessageDispatchThrottlingTest.java:915)
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

[example failure 2023-12-18T12:35:20.6828847Z](https://github.com/apache/pulsar/actions/runs/7247827300/job/19742567886#step:9:2165)  
[example failure 2023-12-17T12:31:53.5837207Z](https://github.com/apache/pulsar/actions/runs/7238358558/job/19719079852#step:9:2165)  
[example failure 2023-12-16T12:32:07.8202632Z](https://github.com/apache/pulsar/actions/runs/7231791264/job/19705356604#step:9:2165)  
[example failure 2023-12-15T12:33:22.9030254Z](https://github.com/apache/pulsar/actions/runs/7221832346/job/19677642570#step:9:2146)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [-1] but found [10]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:979)
	at org.testng.Assert.assertEquals(Assert.java:955)
	at org.testng.Assert.assertEquals(Assert.java:989)
	at org.apache.pulsar.client.api.SubscriptionMessageDispatchThrottlingTest.testClosingRateLimiter(SubscriptionMessageDispatchThrottlingTest.java:915)
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

