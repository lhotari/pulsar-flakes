        
Flaky-test: org.apache.pulsar.client.api.SubscriptionMessageDispatchThrottlingTest.testClosingRateLimiter
Number of failures: 14

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
[example failure 2023-12-19T10:10:36.5553748Z](https://github.com/apache/pulsar/actions/runs/7260037848/job/19778389165#step:9:2136)  
[example failure 2023-12-19T02:45:20.5987624Z](https://github.com/apache/pulsar/actions/runs/7256136429/job/19768921461#step:9:2156)  
[example failure 2023-12-19T01:54:41.3154188Z](https://github.com/apache/pulsar/actions/runs/7256136429/job/19767950443#step:9:2156)  
[example failure 2023-12-16T01:15:26.6337412Z](https://github.com/apache/pulsar/actions/runs/7228625553/job/19698366511#step:9:2156)  
[example failure 2023-12-15T21:14:07.4836451Z](https://github.com/apache/pulsar/actions/runs/7226901833/job/19693496943#step:9:2156)  
[example failure 2023-12-15T17:30:59.8108024Z](https://github.com/apache/pulsar/actions/runs/7224935869/job/19687324900#step:9:2136)  
[example failure 2023-12-15T15:45:27.2523005Z](https://github.com/apache/pulsar/actions/runs/7223874220/job/19683931505#step:9:2156)  
[example failure 2023-12-15T13:48:16.8438658Z](https://github.com/apache/pulsar/actions/runs/7222621310/job/19679957215#step:9:2156)  
[example failure 2023-12-15T09:33:16.6006275Z](https://github.com/apache/pulsar/actions/runs/7218696838/job/19672341850#step:9:2156)  
[example failure 2023-12-15T08:46:43.5493653Z](https://github.com/apache/pulsar/actions/runs/7218696838/job/19671080063#step:9:2156)  
[example failure 2023-12-15T07:56:12.6051746Z](https://github.com/apache/pulsar/actions/runs/7218696838/job/19669934680#step:9:2136)  
[example failure 2023-12-15T07:21:18.9087904Z](https://github.com/apache/pulsar/actions/runs/7218696838/job/19669215985#step:9:2156)  
[example failure 2023-12-15T06:42:23.4989188Z](https://github.com/apache/pulsar/actions/runs/7218696838/job/19668494724#step:9:2156)  
[example failure 2023-12-15T01:19:44.0993780Z](https://github.com/apache/pulsar/actions/runs/7216412752/job/19662753526#step:9:2156)  


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

