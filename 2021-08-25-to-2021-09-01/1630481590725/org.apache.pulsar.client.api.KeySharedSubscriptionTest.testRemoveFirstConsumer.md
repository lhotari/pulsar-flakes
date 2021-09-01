        
Flaky-test: org.apache.pulsar.client.api.KeySharedSubscriptionTest.testRemoveFirstConsumer
Number of failures: 12

org.apache.pulsar.client.api.KeySharedSubscriptionTest is flaky. The testRemoveFirstConsumer test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:43.5578640Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3947)
[example failure 2021-08-28T02:15:22.0333442Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2944)
[example failure 2021-08-28T00:15:30.2257120Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2312)
[example failure 2021-08-27T08:10:56.9643383Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:3011)
[example failure 2021-08-27T08:04:16.7109077Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2936)
[example failure 2021-08-27T06:45:34.9201718Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2937)
[example failure 2021-08-26T08:59:49.3317429Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3646)
[example failure 2021-08-26T07:10:24.6683806Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2998)
[example failure 2021-08-25T09:11:49.4620409Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2904)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

```
java.lang.AssertionError: expected [0] but found [10]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.client.api.KeySharedSubscriptionTest.testRemoveFirstConsumer(KeySharedSubscriptionTest.java:685)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:30:20.5875181Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:1647)
[example failure 2021-08-26T08:53:51.3714375Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:1553)
[example failure 2021-08-26T07:43:08.9446752Z](https://github.com/apache/pulsar/runs/3429972501?check_suite_focus=true#step:9:1616)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [0] but found [10]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.client.api.KeySharedSubscriptionTest.testRemoveFirstConsumer(KeySharedSubscriptionTest.java:685)
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

