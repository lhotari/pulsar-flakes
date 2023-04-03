        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentStreamingDispatcherBlockConsumerTest.testBrokerSubscriptionRecovery
Number of failures: 1

org.apache.pulsar.broker.service.persistent.PersistentStreamingDispatcherBlockConsumerTest is flaky. The testBrokerSubscriptionRecovery test method fails sporadically.

```
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1413)
	at org.testng.Assert.assertTrue(Assert.java:56)
	at org.testng.Assert.assertTrue(Assert.java:66)
	at org.apache.pulsar.client.api.DispatcherBlockConsumerTest.lambda$testBrokerSubscriptionRecovery$15(DispatcherBlockConsumerTest.java:660)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-03-27T14:48:00.4235835Z](https://github.com/apache/pulsar/actions/runs/4531219591/jobs/7985042471#step:9:1741)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1413)
	at org.testng.Assert.assertTrue(Assert.java:56)
	at org.testng.Assert.assertTrue(Assert.java:66)
	at org.apache.pulsar.client.api.DispatcherBlockConsumerTest.lambda$testBrokerSubscriptionRecovery$15(DispatcherBlockConsumerTest.java:660)
	at java.base/java.lang.Iterable.forEach(Iterable.java:75)
	at org.apache.pulsar.client.api.DispatcherBlockConsumerTest.testBrokerSubscriptionRecovery(DispatcherBlockConsumerTest.java:660)
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
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

