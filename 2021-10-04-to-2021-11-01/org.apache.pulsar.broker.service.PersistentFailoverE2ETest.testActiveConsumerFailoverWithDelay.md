        
Flaky-test: org.apache.pulsar.broker.service.PersistentFailoverE2ETest.testActiveConsumerFailoverWithDelay
Number of failures: 2

org.apache.pulsar.broker.service.PersistentFailoverE2ETest is flaky. The testActiveConsumerFailoverWithDelay test method fails sporadically.

```
java.lang.AssertionError: expected [my-message-2] but found [my-message-3]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:629)
	at org.testng.Assert.assertEquals(Assert.java:639)
	at org.apache.pulsar.broker.service.PersistentFailoverE2ETest.testActiveConsumerFailoverWithDelay(PersistentFailoverE2ETest.java:524)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-20T09:00:38.1105839Z](https://github.com/apache/pulsar/runs/3948920935?check_suite_focus=true?check_suite_focus=true#step:9:1232)
[example failure 2021-10-14T11:55:12.1339113Z](https://github.com/apache/pulsar/runs/3893867850?check_suite_focus=true?check_suite_focus=true#step:9:4390)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [my-message-2] but found [my-message-3]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:629)
	at org.testng.Assert.assertEquals(Assert.java:639)
	at org.apache.pulsar.broker.service.PersistentFailoverE2ETest.testActiveConsumerFailoverWithDelay(PersistentFailoverE2ETest.java:524)
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

