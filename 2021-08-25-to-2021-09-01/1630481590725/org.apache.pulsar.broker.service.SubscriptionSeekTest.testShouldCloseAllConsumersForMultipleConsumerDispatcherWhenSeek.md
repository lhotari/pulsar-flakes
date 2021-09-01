        
Flaky-test: org.apache.pulsar.broker.service.SubscriptionSeekTest.testShouldCloseAllConsumersForMultipleConsumerDispatcherWhenSeek
Number of failures: 2

org.apache.pulsar.broker.service.SubscriptionSeekTest is flaky. The testShouldCloseAllConsumersForMultipleConsumerDispatcherWhenSeek test method fails sporadically.

```
java.lang.AssertionError: expected [2] but found [1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.broker.service.SubscriptionSeekTest.testShouldCloseAllConsumersForMultipleConsumerDispatcherWhenSeek(SubscriptionSeekTest.java:501)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-26T07:26:18.9854209Z](https://github.com/apache/pulsar/runs/3429971799?check_suite_focus=true#step:9:279)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [2] but found [1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.broker.service.SubscriptionSeekTest.testShouldCloseAllConsumersForMultipleConsumerDispatcherWhenSeek(SubscriptionSeekTest.java:501)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T06:37:32.1317206Z](https://github.com/apache/pulsar/runs/3440411059?check_suite_focus=true#step:9:2119)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

