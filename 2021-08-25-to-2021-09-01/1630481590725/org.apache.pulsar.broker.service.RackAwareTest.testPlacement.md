        
Flaky-test: org.apache.pulsar.broker.service.RackAwareTest.testPlacement
Number of failures: 11

org.apache.pulsar.broker.service.RackAwareTest is flaky. The testPlacement test method fails sporadically.

```
java.lang.AssertionError: first bookie in rack 0 not included in ensemble expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.broker.service.RackAwareTest.testPlacement(RackAwareTest.java:135)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T16:54:00.5338296Z](https://github.com/apache/pulsar/runs/3464151178?check_suite_focus=true#step:9:780)
[example failure 2021-08-27T06:44:25.3190289Z](https://github.com/apache/pulsar/runs/3440456730?check_suite_focus=true#step:9:848)
[example failure 2021-08-27T06:38:42.2762501Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:427)


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

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-31T10:16:43.8379526Z](https://github.com/apache/pulsar/runs/3471501156?check_suite_focus=true#step:10:2503)
[example failure 2021-08-30T23:01:42.3208520Z](https://github.com/apache/pulsar/runs/3467152590?check_suite_focus=true#step:9:449)
[example failure 2021-08-30T19:31:47.0978266Z](https://github.com/apache/pulsar/runs/3465551342?check_suite_focus=true#step:9:453)
[example failure 2021-08-27T10:54:21.8782003Z](https://github.com/apache/pulsar/runs/3442314708?check_suite_focus=true#step:9:449)
[example failure 2021-08-27T05:22:34.5861352Z](https://github.com/apache/pulsar/runs/3440010388?check_suite_focus=true#step:9:449)
[example failure 2021-08-26T09:15:05.9172677Z](https://github.com/apache/pulsar/runs/3430942268?check_suite_focus=true#step:9:446)
[example failure 2021-08-26T07:03:55.5811616Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:446)
[example failure 2021-08-25T16:49:50.8701266Z](https://github.com/apache/pulsar/runs/3424390559?check_suite_focus=true#step:9:450)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

