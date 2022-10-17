        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentStreamingDispatcherBlockConsumerTest.testBrokerSubscriptionRecovery
Number of failures: 2

org.apache.pulsar.broker.service.persistent.PersistentStreamingDispatcherBlockConsumerTest is flaky. The testBrokerSubscriptionRecovery test method fails sporadically.

```
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.api.DispatcherBlockConsumerTest.lambda$testBrokerSubscriptionRecovery$15(DispatcherBlockConsumerTest.java:659)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-14T10:01:19.6737116Z](https://github.com/apache/pulsar/actions/runs/3246245282/jobs/5329887234#step:8:1983)  
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

