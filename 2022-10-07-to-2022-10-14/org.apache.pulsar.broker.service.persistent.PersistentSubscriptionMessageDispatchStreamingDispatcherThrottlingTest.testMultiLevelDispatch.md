        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentSubscriptionMessageDispatchStreamingDispatcherThrottlingTest.testMultiLevelDispatch
Number of failures: 4

org.apache.pulsar.broker.service.persistent.PersistentSubscriptionMessageDispatchStreamingDispatcherThrottlingTest is flaky. The testMultiLevelDispatch test method fails sporadically.

```
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.api.SubscriptionMessageDispatchThrottlingTest.testDispatchRate(SubscriptionMessageDispatchThrottlingTest.java:478)
	at org.apache.pulsar.client.api.SubscriptionMessageDispatchThrottlingTest.testMultiLevelDispatch(SubscriptionMessageDispatchThrottlingTest.java:503)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-12T16:54:04.1514549Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5300997885#step:8:2288)  
[example failure 2022-10-12T02:55:41.9118918Z](https://github.com/apache/pulsar/actions/runs/3227865814/jobs/5291100978#step:8:2162)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.api.SubscriptionMessageDispatchThrottlingTest.testDispatchRate(SubscriptionMessageDispatchThrottlingTest.java:478)
	at org.apache.pulsar.client.api.SubscriptionMessageDispatchThrottlingTest.testMultiLevelDispatch(SubscriptionMessageDispatchThrottlingTest.java:503)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

```
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.api.SubscriptionMessageDispatchThrottlingTest.testDispatchRate(SubscriptionMessageDispatchThrottlingTest.java:478)
	at org.apache.pulsar.client.api.SubscriptionMessageDispatchThrottlingTest.testMultiLevelDispatch(SubscriptionMessageDispatchThrottlingTest.java:505)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-13T09:21:07.0579716Z](https://github.com/apache/pulsar/actions/runs/3240623988/jobs/5311736002#step:8:2162)  
[example failure 2022-10-11T05:53:31.0811009Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5275189880#step:8:2153)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.api.SubscriptionMessageDispatchThrottlingTest.testDispatchRate(SubscriptionMessageDispatchThrottlingTest.java:478)
	at org.apache.pulsar.client.api.SubscriptionMessageDispatchThrottlingTest.testMultiLevelDispatch(SubscriptionMessageDispatchThrottlingTest.java:505)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

