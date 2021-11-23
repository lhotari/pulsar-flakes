        
Flaky-test: org.apache.pulsar.broker.stats.ManagedCursorMetricsTest.testCursorReadWriteMetrics
Number of failures: 4

org.apache.pulsar.broker.stats.ManagedCursorMetricsTest is flaky. The testCursorReadWriteMetrics test method fails sporadically.

```
java.lang.AssertionError: expected [3] but found [2]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.broker.stats.ManagedCursorMetricsTest.testCursorReadWriteMetrics(ManagedCursorMetricsTest.java:143)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-22T12:12:14.6116761Z](https://github.com/apache/pulsar/runs/4286190786?check_suite_focus=true?check_suite_focus=true#step:9:465)
[example failure 2021-11-22T11:38:29.5573859Z](https://github.com/apache/pulsar/runs/4285858767?check_suite_focus=true?check_suite_focus=true#step:9:465)
[example failure 2021-11-22T10:55:10.6919757Z](https://github.com/apache/pulsar/runs/4285386039?check_suite_focus=true?check_suite_focus=true#step:9:465)
[example failure 2021-11-21T03:49:00.8106829Z](https://github.com/apache/pulsar/runs/4276528367?check_suite_focus=true?check_suite_focus=true#step:9:465)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [3] but found [2]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.broker.stats.ManagedCursorMetricsTest.testCursorReadWriteMetrics(ManagedCursorMetricsTest.java:143)
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

