        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentStreamingDispatcherBlockConsumerTest.testBrokerSubscriptionRecovery
Number of failures: 8

org.apache.pulsar.broker.service.persistent.PersistentStreamingDispatcherBlockConsumerTest is flaky. The testBrokerSubscriptionRecovery test method fails sporadically.

```
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.api.DispatcherBlockConsumerTest.lambda$testBrokerSubscriptionRecovery$15(DispatcherBlockConsumerTest.java:658)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-09-08T03:05:13.1657589Z](https://github.com/apache/pulsar/runs/8240899110?check_suite_focus=true#step:9:825)  
[example failure 2022-09-07T23:14:26.0343337Z](https://github.com/apache/pulsar/runs/8238428387?check_suite_focus=true#step:10:804)  
[example failure 2022-09-06T11:19:36.3239691Z](https://github.com/apache/pulsar/runs/8203207960?check_suite_focus=true#step:9:831)  
[example failure 2022-08-31T21:17:16.2099416Z](https://github.com/apache/pulsar/runs/8122844322?check_suite_focus=true#step:10:804)  
[example failure 2022-08-31T18:07:12.7571796Z](https://github.com/apache/pulsar/runs/8119669938?check_suite_focus=true#step:10:806)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.api.DispatcherBlockConsumerTest.lambda$testBrokerSubscriptionRecovery$15(DispatcherBlockConsumerTest.java:658)
	at java.base/java.lang.Iterable.forEach(Iterable.java:75)
	at org.apache.pulsar.client.api.DispatcherBlockConsumerTest.testBrokerSubscriptionRecovery(DispatcherBlockConsumerTest.java:658)
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
	at org.apache.pulsar.client.api.DispatcherBlockConsumerTest.lambda$testBrokerSubscriptionRecovery$15(DispatcherBlockConsumerTest.java:657)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-08-31T10:39:18.5254350Z](https://github.com/apache/pulsar/runs/8110828963?check_suite_focus=true#step:10:1823)  
[example failure 2022-08-27T05:08:13.1871139Z](https://github.com/apache/pulsar/runs/8048028449?check_suite_focus=true#step:10:1802)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.api.DispatcherBlockConsumerTest.lambda$testBrokerSubscriptionRecovery$15(DispatcherBlockConsumerTest.java:657)
	at java.base/java.lang.Iterable.forEach(Iterable.java:75)
	at org.apache.pulsar.client.api.DispatcherBlockConsumerTest.testBrokerSubscriptionRecovery(DispatcherBlockConsumerTest.java:657)
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
	at org.apache.pulsar.client.api.DispatcherBlockConsumerTest.lambda$testBrokerSubscriptionRecovery$15(DispatcherBlockConsumerTest.java:659)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-13T05:57:45.0162954Z](https://github.com/apache/pulsar/actions/runs/3239849062/jobs/5309746036#step:8:1983)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.api.DispatcherBlockConsumerTest.lambda$testBrokerSubscriptionRecovery$15(DispatcherBlockConsumerTest.java:659)
	at java.base/java.lang.Iterable.forEach(Iterable.java:75)
	at org.apache.pulsar.client.api.DispatcherBlockConsumerTest.testBrokerSubscriptionRecovery(DispatcherBlockConsumerTest.java:659)
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

