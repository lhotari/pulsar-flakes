        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherE2ETest.testBrokerConnectionStats
Number of failures: 8

org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherE2ETest is flaky. The testBrokerConnectionStats test method fails sporadically.

```
java.lang.AssertionError: expected [0] but found [1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.broker.service.PersistentTopicE2ETest.testBrokerConnectionStats(PersistentTopicE2ETest.java:1549)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T23:01:41.8361874Z](https://github.com/apache/pulsar/runs/3467152590?check_suite_focus=true#step:9:385)
[example failure 2021-08-30T14:21:34.8155122Z](https://github.com/apache/pulsar/runs/3462661633?check_suite_focus=true#step:9:385)
[example failure 2021-08-27T10:54:21.1777101Z](https://github.com/apache/pulsar/runs/3442314708?check_suite_focus=true#step:9:385)
[example failure 2021-08-27T05:22:33.8174064Z](https://github.com/apache/pulsar/runs/3440010388?check_suite_focus=true#step:9:385)
[example failure 2021-08-26T09:15:05.1235240Z](https://github.com/apache/pulsar/runs/3430942268?check_suite_focus=true#step:9:382)
[example failure 2021-08-26T07:03:54.9852674Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:382)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [0] but found [1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.broker.service.PersistentTopicE2ETest.testBrokerConnectionStats(PersistentTopicE2ETest.java:1549)
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
[example failure 2021-08-30T19:31:46.3879155Z](https://github.com/apache/pulsar/runs/3465551342?check_suite_focus=true#step:9:407)
[example failure 2021-08-25T16:49:49.9998453Z](https://github.com/apache/pulsar/runs/3424390559?check_suite_focus=true#step:9:404)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

