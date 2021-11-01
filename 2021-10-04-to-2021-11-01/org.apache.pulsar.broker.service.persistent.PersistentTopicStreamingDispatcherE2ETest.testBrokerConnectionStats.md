        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherE2ETest.testBrokerConnectionStats
Number of failures: 18

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
[example failure 2021-10-27T06:11:54.7030960Z](https://github.com/apache/pulsar/runs/4018551340?check_suite_focus=true?check_suite_focus=true#step:9:313)
[example failure 2021-10-23T08:31:29.8991122Z](https://github.com/apache/pulsar/runs/3983256390?check_suite_focus=true?check_suite_focus=true#step:9:313)
[example failure 2021-10-23T06:09:14.8124839Z](https://github.com/apache/pulsar/runs/3982788045?check_suite_focus=true?check_suite_focus=true#step:9:313)
[example failure 2021-10-21T10:01:09.4950562Z](https://github.com/apache/pulsar/runs/3962075780?check_suite_focus=true?check_suite_focus=true#step:9:313)
[example failure 2021-10-20T20:17:19.4915627Z](https://github.com/apache/pulsar/runs/3956389069?check_suite_focus=true?check_suite_focus=true#step:9:313)
[example failure 2021-10-20T07:55:53.0040348Z](https://github.com/apache/pulsar/runs/3948723858?check_suite_focus=true?check_suite_focus=true#step:9:313)
[example failure 2021-10-19T07:23:58.6058385Z](https://github.com/apache/pulsar/runs/3935901205?check_suite_focus=true?check_suite_focus=true#step:9:313)
[example failure 2021-10-17T07:47:03.8132076Z](https://github.com/apache/pulsar/runs/3917749472?check_suite_focus=true?check_suite_focus=true#step:9:313)
[example failure 2021-10-16T01:25:41.4705386Z](https://github.com/apache/pulsar/runs/3911815448?check_suite_focus=true?check_suite_focus=true#step:9:313)
[example failure 2021-10-15T01:39:33.0762124Z](https://github.com/apache/pulsar/runs/3901517532?check_suite_focus=true?check_suite_focus=true#step:9:313)
[example failure 2021-10-13T04:47:48.3333926Z](https://github.com/apache/pulsar/runs/3878517819?check_suite_focus=true?check_suite_focus=true#step:9:309)
[example failure 2021-10-13T01:04:34.6104126Z](https://github.com/apache/pulsar/runs/3877217137?check_suite_focus=true?check_suite_focus=true#step:9:309)
[example failure 2021-10-12T13:06:33.3090459Z](https://github.com/apache/pulsar/runs/3870601192?check_suite_focus=true?check_suite_focus=true#step:9:309)
[example failure 2021-10-10T03:07:09.1924119Z](https://github.com/apache/pulsar/runs/3849391187?check_suite_focus=true?check_suite_focus=true#step:9:309)
[example failure 2021-10-08T19:44:07.6984228Z](https://github.com/apache/pulsar/runs/3842296284?check_suite_focus=true?check_suite_focus=true#step:9:309)
[example failure 2021-10-08T10:09:30.9043757Z](https://github.com/apache/pulsar/runs/3837218430?check_suite_focus=true?check_suite_focus=true#step:9:309)
[example failure 2021-10-05T06:32:58.9390629Z](https://github.com/apache/pulsar/runs/3799981441?check_suite_focus=true?check_suite_focus=true#step:9:351)
[example failure 2021-10-05T05:42:57.8298610Z](https://github.com/apache/pulsar/runs/3799683465?check_suite_focus=true?check_suite_focus=true#step:9:353)


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

