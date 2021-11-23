        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherE2ETest.testBrokerConnectionStats
Number of failures: 13

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
[example failure 2021-11-22T10:21:26.0699121Z](https://github.com/apache/pulsar/runs/4284726558?check_suite_focus=true?check_suite_focus=true#step:9:229)
[example failure 2021-11-22T09:16:48.6868570Z](https://github.com/apache/pulsar/runs/4284014543?check_suite_focus=true?check_suite_focus=true#step:9:229)
[example failure 2021-11-20T15:21:50.1527881Z](https://github.com/apache/pulsar/runs/4273902089?check_suite_focus=true?check_suite_focus=true#step:9:229)
[example failure 2021-11-19T18:35:16.7387534Z](https://github.com/apache/pulsar/runs/4267806531?check_suite_focus=true?check_suite_focus=true#step:9:229)
[example failure 2021-11-19T08:57:24.7590019Z](https://github.com/apache/pulsar/runs/4262032089?check_suite_focus=true?check_suite_focus=true#step:9:229)
[example failure 2021-11-18T19:28:16.5256800Z](https://github.com/apache/pulsar/runs/4255938036?check_suite_focus=true?check_suite_focus=true#step:9:229)
[example failure 2021-11-18T15:45:17.9390767Z](https://github.com/apache/pulsar/runs/4253422122?check_suite_focus=true?check_suite_focus=true#step:9:229)
[example failure 2021-11-18T11:44:30.0490121Z](https://github.com/apache/pulsar/runs/4250703767?check_suite_focus=true?check_suite_focus=true#step:9:229)
[example failure 2021-11-17T07:24:32.1761716Z](https://github.com/apache/pulsar/runs/4234826468?check_suite_focus=true?check_suite_focus=true#step:9:699)
[example failure 2021-11-17T06:13:53.0636365Z](https://github.com/apache/pulsar/runs/4234420379?check_suite_focus=true?check_suite_focus=true#step:9:699)
[example failure 2021-11-17T01:02:58.0734289Z](https://github.com/apache/pulsar/runs/4232476879?check_suite_focus=true?check_suite_focus=true#step:9:699)


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
java.lang.AssertionError: expected [0] but found [1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.broker.service.PersistentTopicE2ETest.testBrokerConnectionStats(PersistentTopicE2ETest.java:1548)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-22T10:26:54.1283300Z](https://github.com/apache/pulsar/runs/4285064651?check_suite_focus=true?check_suite_focus=true#step:9:229)
[example failure 2021-11-22T09:39:46.6942355Z](https://github.com/apache/pulsar/runs/4284301214?check_suite_focus=true?check_suite_focus=true#step:9:229)


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
	at org.apache.pulsar.broker.service.PersistentTopicE2ETest.testBrokerConnectionStats(PersistentTopicE2ETest.java:1548)
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

