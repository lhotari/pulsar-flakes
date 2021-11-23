        
Flaky-test: org.apache.pulsar.broker.service.RackAwareTest.testPlacement
Number of failures: 3

org.apache.pulsar.broker.service.RackAwareTest is flaky. The testPlacement test method fails sporadically.

```
java.lang.AssertionError: first bookie in rack 0 not included in ensemble expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.broker.service.RackAwareTest.testPlacement(RackAwareTest.java:135)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-19T02:14:12.6483173Z](https://github.com/apache/pulsar/runs/4259433654?check_suite_focus=true?check_suite_focus=true#step:9:564)
[example failure 2021-11-18T18:52:05.1614439Z](https://github.com/apache/pulsar/runs/4255515479?check_suite_focus=true?check_suite_focus=true#step:9:321)
[example failure 2021-11-17T05:26:10.2265527Z](https://github.com/apache/pulsar/runs/4234170555?check_suite_focus=true?check_suite_focus=true#step:9:569)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: first bookie in rack 0 not included in ensemble expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.broker.service.RackAwareTest.testPlacement(RackAwareTest.java:135)
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

