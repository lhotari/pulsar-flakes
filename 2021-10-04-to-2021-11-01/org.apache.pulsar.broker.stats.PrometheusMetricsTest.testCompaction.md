        
Flaky-test: org.apache.pulsar.broker.stats.PrometheusMetricsTest.testCompaction
Number of failures: 18

org.apache.pulsar.broker.stats.PrometheusMetricsTest is flaky. The testCompaction test method fails sporadically.

```
java.lang.AssertionError: expected [10.0] but found [0.0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEquals(Assert.java:701)
	at org.testng.Assert.assertEquals(Assert.java:712)
	at org.apache.pulsar.broker.stats.PrometheusMetricsTest.testCompaction(PrometheusMetricsTest.java:1217)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-21T08:00:46.6596278Z](https://github.com/apache/pulsar/runs/3960910885?check_suite_focus=true?check_suite_focus=true#step:9:6421)
[example failure 2021-10-21T07:45:01.5391549Z](https://github.com/apache/pulsar/runs/3960910885?check_suite_focus=true?check_suite_focus=true#step:9:1200)
[example failure 2021-10-19T07:49:02.1373455Z](https://github.com/apache/pulsar/runs/3936090549?check_suite_focus=true?check_suite_focus=true#step:9:1212)
[example failure 2021-10-18T04:06:34.9039268Z](https://github.com/apache/pulsar/runs/3922105078?check_suite_focus=true?check_suite_focus=true#step:9:4766)
[example failure 2021-10-17T07:50:43.8351716Z](https://github.com/apache/pulsar/runs/3917749472?check_suite_focus=true?check_suite_focus=true#step:9:1229)
[example failure 2021-10-14T19:12:17.7724456Z](https://github.com/apache/pulsar/runs/3898240523?check_suite_focus=true?check_suite_focus=true#step:9:4692)
[example failure 2021-10-14T08:31:45.2270533Z](https://github.com/apache/pulsar/runs/3892043669?check_suite_focus=true?check_suite_focus=true#step:9:1102)
[example failure 2021-10-14T07:04:51.7956017Z](https://github.com/apache/pulsar/runs/3891370340?check_suite_focus=true?check_suite_focus=true#step:9:1170)
[example failure 2021-10-14T07:02:14.4969008Z](https://github.com/apache/pulsar/runs/3891419074?check_suite_focus=true?check_suite_focus=true#step:9:1324)
[example failure 2021-10-11T11:26:39.0690209Z](https://github.com/apache/pulsar/runs/3858046273?check_suite_focus=true?check_suite_focus=true#step:9:3797)
[example failure 2021-10-11T02:05:08.1400692Z](https://github.com/apache/pulsar/runs/3854364463?check_suite_focus=true?check_suite_focus=true#step:9:3038)
[example failure 2021-10-10T03:23:08.1923150Z](https://github.com/apache/pulsar/runs/3849391187?check_suite_focus=true?check_suite_focus=true#step:9:2052)
[example failure 2021-10-08T10:14:53.4070154Z](https://github.com/apache/pulsar/runs/3837218430?check_suite_focus=true?check_suite_focus=true#step:9:1212)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [10.0] but found [0.0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEquals(Assert.java:701)
	at org.testng.Assert.assertEquals(Assert.java:712)
	at org.apache.pulsar.broker.stats.PrometheusMetricsTest.testCompaction(PrometheusMetricsTest.java:1217)
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
java.lang.AssertionError: expected [10.0] but found [0.0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEquals(Assert.java:701)
	at org.testng.Assert.assertEquals(Assert.java:712)
	at org.apache.pulsar.broker.stats.PrometheusMetricsTest.testCompaction(PrometheusMetricsTest.java:1210)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-28T17:53:06.1344333Z](https://github.com/apache/pulsar/runs/4037997436?check_suite_focus=true?check_suite_focus=true#step:9:1170)
[example failure 2021-10-27T06:15:55.3683627Z](https://github.com/apache/pulsar/runs/4018551340?check_suite_focus=true?check_suite_focus=true#step:9:1158)
[example failure 2021-10-26T01:13:01.5292244Z](https://github.com/apache/pulsar/runs/4004149676?check_suite_focus=true?check_suite_focus=true#step:9:1359)
[example failure 2021-10-25T15:13:45.7716193Z](https://github.com/apache/pulsar/runs/3998605619?check_suite_focus=true?check_suite_focus=true#step:9:1170)
[example failure 2021-10-24T14:34:12.1700030Z](https://github.com/apache/pulsar/runs/3989262029?check_suite_focus=true?check_suite_focus=true#step:9:1247)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [10.0] but found [0.0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEquals(Assert.java:701)
	at org.testng.Assert.assertEquals(Assert.java:712)
	at org.apache.pulsar.broker.stats.PrometheusMetricsTest.testCompaction(PrometheusMetricsTest.java:1210)
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

