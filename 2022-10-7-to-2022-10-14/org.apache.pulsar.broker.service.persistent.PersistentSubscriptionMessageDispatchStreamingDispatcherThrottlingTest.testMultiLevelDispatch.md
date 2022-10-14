        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentSubscriptionMessageDispatchStreamingDispatcherThrottlingTest.testMultiLevelDispatch
Number of failures: 23

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
[example failure 2022-10-11T13:11:36.5652832Z](https://github.com/apache/pulsar/actions/runs/3226312724/jobs/5280142088#step:8:2139)  
[example failure 2022-10-10T06:57:57.4320646Z](https://github.com/apache/pulsar/actions/runs/3216792245/jobs/5259871584#step:8:2074)  
[example failure 2022-10-09T10:01:38.1681601Z](https://github.com/apache/pulsar/actions/runs/3213605116/jobs/5253399150#step:8:1919)  
[example failure 2022-10-09T09:16:53.9151222Z](https://github.com/apache/pulsar/actions/runs/3213481763/jobs/5253186221#step:8:1919)  
[example failure 2022-08-31T21:20:16.3335079Z](https://github.com/apache/pulsar/runs/8122844849?check_suite_focus=true#step:10:671)  
[example failure 2022-08-31T14:50:15.3817035Z](https://github.com/apache/pulsar/runs/8115929202?check_suite_focus=true#step:10:2024)  
[example failure 2022-08-31T08:52:32.0446410Z](https://github.com/apache/pulsar/runs/8109126255?check_suite_focus=true#step:10:667)  
[example failure 2022-08-27T02:13:47.9751847Z](https://github.com/apache/pulsar/runs/8047094589?check_suite_focus=true#step:10:2019)  


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
[example failure 2022-10-09T15:17:24.8037694Z](https://github.com/apache/pulsar/actions/runs/3214320846/jobs/5254851479#step:8:2074)  
[example failure 2022-10-09T11:22:43.5192917Z](https://github.com/apache/pulsar/actions/runs/3209406941/jobs/5253787615#step:8:3261)  
[example failure 2022-08-31T23:39:35.9607904Z](https://github.com/apache/pulsar/runs/8124732086?check_suite_focus=true#step:10:2179)  
[example failure 2022-08-31T07:29:38.0661965Z](https://github.com/apache/pulsar/runs/8108061748?check_suite_focus=true#step:10:671)  
[example failure 2022-08-31T04:28:20.9020901Z](https://github.com/apache/pulsar/runs/8106045360?check_suite_focus=true#step:10:667)  
[example failure 2022-08-31T02:13:01.5236043Z](https://github.com/apache/pulsar/runs/8105007570?check_suite_focus=true#step:10:2018)  
[example failure 2022-08-30T03:31:46.9202581Z](https://github.com/apache/pulsar/runs/8083809184?check_suite_focus=true#step:10:2018)  
[example failure 2022-08-27T05:13:45.2932129Z](https://github.com/apache/pulsar/runs/8048028449?check_suite_focus=true#step:10:2335)  


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

```
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.api.SubscriptionMessageDispatchThrottlingTest.testDispatchRate(SubscriptionMessageDispatchThrottlingTest.java:478)
	at org.apache.pulsar.client.api.SubscriptionMessageDispatchThrottlingTest.testMultiLevelDispatch(SubscriptionMessageDispatchThrottlingTest.java:507)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-11T15:03:32.4238399Z](https://github.com/apache/pulsar/actions/runs/3225955522/jobs/5282662964#step:8:2322)  
[example failure 2022-10-10T02:29:49.6682865Z](https://github.com/apache/pulsar/actions/runs/3209406941/jobs/5258176046#step:8:2074)  
[example failure 2022-08-27T05:48:55.5292418Z](https://github.com/apache/pulsar/runs/8048208334?check_suite_focus=true#step:10:668)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.api.SubscriptionMessageDispatchThrottlingTest.testDispatchRate(SubscriptionMessageDispatchThrottlingTest.java:478)
	at org.apache.pulsar.client.api.SubscriptionMessageDispatchThrottlingTest.testMultiLevelDispatch(SubscriptionMessageDispatchThrottlingTest.java:507)
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

