        
Flaky-test: org.apache.pulsar.broker.stats.ManagedCursorMetricsTest.testManagedCursorMetrics
Number of failures: 2

org.apache.pulsar.broker.stats.ManagedCursorMetricsTest is flaky. The testManagedCursorMetrics test method fails sporadically.

```
java.lang.AssertionError: did not expect [0] but found [0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failEquals(Assert.java:1041)
	at org.testng.Assert.assertNotEqualsImpl(Assert.java:147)
	at org.testng.Assert.assertNotEquals(Assert.java:1531)
	at org.testng.Assert.assertNotEquals(Assert.java:1535)
	at org.apache.pulsar.broker.stats.ManagedCursorMetricsTest.testManagedCursorMetrics(ManagedCursorMetricsTest.java:89)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-17T05:43:56.0988938Z](https://github.com/apache/pulsar/runs/4234170375?check_suite_focus=true?check_suite_focus=true#step:9:4789)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: did not expect [0] but found [0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failEquals(Assert.java:1041)
	at org.testng.Assert.assertNotEqualsImpl(Assert.java:147)
	at org.testng.Assert.assertNotEquals(Assert.java:1531)
	at org.testng.Assert.assertNotEquals(Assert.java:1535)
	at org.apache.pulsar.broker.stats.ManagedCursorMetricsTest.testManagedCursorMetrics(ManagedCursorMetricsTest.java:89)
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
java.lang.AssertionError: did not expect [0] but found [0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failEquals(Assert.java:1041)
	at org.testng.Assert.assertNotEqualsImpl(Assert.java:147)
	at org.testng.Assert.assertNotEquals(Assert.java:1531)
	at org.testng.Assert.assertNotEquals(Assert.java:1535)
	at org.apache.pulsar.broker.stats.ManagedCursorMetricsTest.testManagedCursorMetrics(ManagedCursorMetricsTest.java:90)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-18T08:40:26.5967980Z](https://github.com/apache/pulsar/runs/4248742376?check_suite_focus=true?check_suite_focus=true#step:9:452)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: did not expect [0] but found [0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failEquals(Assert.java:1041)
	at org.testng.Assert.assertNotEqualsImpl(Assert.java:147)
	at org.testng.Assert.assertNotEquals(Assert.java:1531)
	at org.testng.Assert.assertNotEquals(Assert.java:1535)
	at org.apache.pulsar.broker.stats.ManagedCursorMetricsTest.testManagedCursorMetrics(ManagedCursorMetricsTest.java:90)
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

