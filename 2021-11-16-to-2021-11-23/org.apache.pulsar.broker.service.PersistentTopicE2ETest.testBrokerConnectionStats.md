        
Flaky-test: org.apache.pulsar.broker.service.PersistentTopicE2ETest.testBrokerConnectionStats
Number of failures: 5

org.apache.pulsar.broker.service.PersistentTopicE2ETest is flaky. The testBrokerConnectionStats test method fails sporadically.

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
[example failure 2021-11-22T14:53:08.1521393Z](https://github.com/apache/pulsar/runs/4287950608?check_suite_focus=true?check_suite_focus=true#step:9:209)
[example failure 2021-11-19T19:57:15.3698024Z](https://github.com/apache/pulsar/runs/4268539104?check_suite_focus=true?check_suite_focus=true#step:9:209)
[example failure 2021-11-19T03:06:05.1598820Z](https://github.com/apache/pulsar/runs/4259782607?check_suite_focus=true?check_suite_focus=true#step:9:209)
[example failure 2021-11-19T02:29:17.9631523Z](https://github.com/apache/pulsar/runs/4259542832?check_suite_focus=true?check_suite_focus=true#step:9:209)
[example failure 2021-11-18T15:23:23.4902365Z](https://github.com/apache/pulsar/runs/4253132939?check_suite_focus=true?check_suite_focus=true#step:9:209)


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

