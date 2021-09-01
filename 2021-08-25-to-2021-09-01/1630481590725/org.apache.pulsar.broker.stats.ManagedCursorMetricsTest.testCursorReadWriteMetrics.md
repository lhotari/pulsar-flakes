        
Flaky-test: org.apache.pulsar.broker.stats.ManagedCursorMetricsTest.testCursorReadWriteMetrics
Number of failures: 23

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
[example failure 2021-08-31T02:55:25.3914124Z](https://github.com/apache/pulsar/runs/3468534483?check_suite_focus=true#step:9:465)
[example failure 2021-08-30T16:53:35.0762074Z](https://github.com/apache/pulsar/runs/3464151178?check_suite_focus=true#step:9:465)
[example failure 2021-08-30T15:05:37.0132638Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:465)
[example failure 2021-08-29T03:05:33.2228314Z](https://github.com/apache/pulsar/runs/3452988247?check_suite_focus=true#step:9:465)
[example failure 2021-08-28T02:10:14.9952538Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:465)
[example failure 2021-08-27T23:52:37.9098168Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:465)
[example failure 2021-08-27T19:05:42.0905707Z](https://github.com/apache/pulsar/runs/3446249767?check_suite_focus=true#step:9:585)
[example failure 2021-08-27T08:28:40.9258782Z](https://github.com/apache/pulsar/runs/3441181162?check_suite_focus=true#step:9:465)
[example failure 2021-08-27T08:05:25.4319206Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:465)
[example failure 2021-08-27T07:56:56.1571018Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:465)
[example failure 2021-08-27T06:43:34.9887079Z](https://github.com/apache/pulsar/runs/3440456730?check_suite_focus=true#step:9:465)
[example failure 2021-08-27T00:47:02.7318249Z](https://github.com/apache/pulsar/runs/3438608599?check_suite_focus=true#step:9:465)
[example failure 2021-08-26T10:08:00.2451168Z](https://github.com/apache/pulsar/runs/3431383943?check_suite_focus=true#step:9:465)
[example failure 2021-08-26T07:17:47.6314409Z](https://github.com/apache/pulsar/runs/3429972501?check_suite_focus=true#step:9:462)
[example failure 2021-08-25T09:05:41.2699419Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:448)


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

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T23:01:43.6384911Z](https://github.com/apache/pulsar/runs/3467152590?check_suite_focus=true#step:9:491)
[example failure 2021-08-30T19:31:48.0112643Z](https://github.com/apache/pulsar/runs/3465551342?check_suite_focus=true#step:9:495)
[example failure 2021-08-27T10:54:23.8302988Z](https://github.com/apache/pulsar/runs/3442314708?check_suite_focus=true#step:9:491)
[example failure 2021-08-27T06:38:44.1222477Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:484)
[example failure 2021-08-27T05:22:36.2066127Z](https://github.com/apache/pulsar/runs/3440010388?check_suite_focus=true#step:9:491)
[example failure 2021-08-26T09:15:07.3781370Z](https://github.com/apache/pulsar/runs/3430942268?check_suite_focus=true#step:9:488)
[example failure 2021-08-26T07:03:57.6114739Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:488)
[example failure 2021-08-25T16:49:52.7494499Z](https://github.com/apache/pulsar/runs/3424390559?check_suite_focus=true#step:9:492)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

