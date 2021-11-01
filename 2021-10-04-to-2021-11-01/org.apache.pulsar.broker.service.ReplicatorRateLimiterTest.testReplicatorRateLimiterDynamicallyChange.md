        
Flaky-test: org.apache.pulsar.broker.service.ReplicatorRateLimiterTest.testReplicatorRateLimiterDynamicallyChange
Number of failures: 50

org.apache.pulsar.broker.service.ReplicatorRateLimiterTest is flaky. The testReplicatorRateLimiterDynamicallyChange test method fails sporadically.

```
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.broker.service.ReplicatorRateLimiterTest.testReplicatorRateLimiterDynamicallyChange(ReplicatorRateLimiterTest.java:212)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T10:09:26.9292397Z](https://github.com/apache/pulsar/runs/3893041314?check_suite_focus=true?check_suite_focus=true#step:9:1068)
[example failure 2021-10-14T09:31:40.2599122Z](https://github.com/apache/pulsar/runs/3892561299?check_suite_focus=true?check_suite_focus=true#step:9:926)
[example failure 2021-10-14T07:00:25.7807565Z](https://github.com/apache/pulsar/runs/3891419074?check_suite_focus=true?check_suite_focus=true#step:9:997)
[example failure 2021-10-14T02:22:44.6900394Z](https://github.com/apache/pulsar/runs/3889806188?check_suite_focus=true?check_suite_focus=true#step:9:924)
[example failure 2021-10-13T20:21:21.7233905Z](https://github.com/apache/pulsar/runs/3887306167?check_suite_focus=true?check_suite_focus=true#step:9:983)
[example failure 2021-10-13T15:07:14.1223554Z](https://github.com/apache/pulsar/runs/3884073043?check_suite_focus=true?check_suite_focus=true#step:9:866)
[example failure 2021-10-13T13:36:08.3087879Z](https://github.com/apache/pulsar/runs/3882997012?check_suite_focus=true?check_suite_focus=true#step:9:866)
[example failure 2021-10-13T13:26:25.4683221Z](https://github.com/apache/pulsar/runs/3882965793?check_suite_focus=true?check_suite_focus=true#step:9:983)
[example failure 2021-10-13T13:06:55.6562606Z](https://github.com/apache/pulsar/runs/3882671827?check_suite_focus=true?check_suite_focus=true#step:9:866)
[example failure 2021-10-13T04:50:45.4658126Z](https://github.com/apache/pulsar/runs/3878517819?check_suite_focus=true?check_suite_focus=true#step:9:1001)
[example failure 2021-10-13T01:52:05.2028708Z](https://github.com/apache/pulsar/runs/3877403076?check_suite_focus=true?check_suite_focus=true#step:9:866)
[example failure 2021-10-13T01:07:24.3474002Z](https://github.com/apache/pulsar/runs/3877217137?check_suite_focus=true?check_suite_focus=true#step:9:1002)
[example failure 2021-10-12T13:09:00.3289971Z](https://github.com/apache/pulsar/runs/3870601192?check_suite_focus=true?check_suite_focus=true#step:9:1002)
[example failure 2021-10-12T09:17:43.6566271Z](https://github.com/apache/pulsar/runs/3868468816?check_suite_focus=true?check_suite_focus=true#step:9:1068)
[example failure 2021-10-12T03:19:06.3368580Z](https://github.com/apache/pulsar/runs/3865935074?check_suite_focus=true?check_suite_focus=true#step:9:912)
[example failure 2021-10-12T02:42:21.6736255Z](https://github.com/apache/pulsar/runs/3865758930?check_suite_focus=true?check_suite_focus=true#step:9:1014)
[example failure 2021-10-11T01:47:02.0746310Z](https://github.com/apache/pulsar/runs/3854364463?check_suite_focus=true?check_suite_focus=true#step:9:924)
[example failure 2021-10-10T03:09:56.7932735Z](https://github.com/apache/pulsar/runs/3849391187?check_suite_focus=true?check_suite_focus=true#step:9:912)
[example failure 2021-10-09T10:57:03.8791049Z](https://github.com/apache/pulsar/runs/3846135508?check_suite_focus=true?check_suite_focus=true#step:9:866)
[example failure 2021-10-08T19:47:06.3114444Z](https://github.com/apache/pulsar/runs/3842296284?check_suite_focus=true?check_suite_focus=true#step:9:912)
[example failure 2021-10-08T15:03:52.0802156Z](https://github.com/apache/pulsar/runs/3839908944?check_suite_focus=true?check_suite_focus=true#step:9:1086)
[example failure 2021-10-08T10:12:39.8627745Z](https://github.com/apache/pulsar/runs/3837218430?check_suite_focus=true?check_suite_focus=true#step:9:912)
[example failure 2021-10-08T09:22:22.2435206Z](https://github.com/apache/pulsar/runs/3836703737?check_suite_focus=true?check_suite_focus=true#step:9:866)
[example failure 2021-10-08T09:15:42.1160878Z](https://github.com/apache/pulsar/runs/3836736202?check_suite_focus=true?check_suite_focus=true#step:9:983)
[example failure 2021-10-08T07:14:23.1058796Z](https://github.com/apache/pulsar/runs/3835731054?check_suite_focus=true?check_suite_focus=true#step:9:924)
[example failure 2021-10-08T04:04:05.6351501Z](https://github.com/apache/pulsar/runs/3834640404?check_suite_focus=true?check_suite_focus=true#step:9:924)
[example failure 2021-10-08T01:46:08.7854731Z](https://github.com/apache/pulsar/runs/3833881411?check_suite_focus=true?check_suite_focus=true#step:9:866)
[example failure 2021-10-07T23:38:57.2751005Z](https://github.com/apache/pulsar/runs/3833183326?check_suite_focus=true?check_suite_focus=true#step:9:912)
[example failure 2021-10-07T20:59:53.5026535Z](https://github.com/apache/pulsar/runs/3831980099?check_suite_focus=true?check_suite_focus=true#step:9:866)
[example failure 2021-10-07T20:58:29.6652306Z](https://github.com/apache/pulsar/runs/3832038876?check_suite_focus=true?check_suite_focus=true#step:9:1068)
[example failure 2021-10-07T07:14:54.1944791Z](https://github.com/apache/pulsar/runs/3824011803?check_suite_focus=true?check_suite_focus=true#step:9:866)
[example failure 2021-10-06T20:06:13.2628022Z](https://github.com/apache/pulsar/runs/3819587196?check_suite_focus=true?check_suite_focus=true#step:9:866)
[example failure 2021-10-05T09:12:14.1875875Z](https://github.com/apache/pulsar/runs/3801226670?check_suite_focus=true?check_suite_focus=true#step:9:864)
[example failure 2021-10-05T07:19:25.6233908Z](https://github.com/apache/pulsar/runs/3800317209?check_suite_focus=true?check_suite_focus=true#step:9:1007)
[example failure 2021-10-05T06:37:40.0536681Z](https://github.com/apache/pulsar/runs/3799981441?check_suite_focus=true?check_suite_focus=true#step:9:924)
[example failure 2021-10-05T06:15:25.2571461Z](https://github.com/apache/pulsar/runs/3799834829?check_suite_focus=true?check_suite_focus=true#step:9:864)
[example failure 2021-10-05T05:52:09.8184610Z](https://github.com/apache/pulsar/runs/3799683465?check_suite_focus=true?check_suite_focus=true#step:9:912)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.broker.service.ReplicatorRateLimiterTest.testReplicatorRateLimiterDynamicallyChange(ReplicatorRateLimiterTest.java:212)
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
java.lang.AssertionError: expected [100] but found [-1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.broker.service.ReplicatorRateLimiterTest.testReplicatorRateLimiterDynamicallyChange(ReplicatorRateLimiterTest.java:213)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-27T01:02:03.7811060Z](https://github.com/apache/pulsar/runs/4016762268?check_suite_focus=true?check_suite_focus=true#step:9:1007)
[example failure 2021-10-26T01:10:53.8483678Z](https://github.com/apache/pulsar/runs/4004149676?check_suite_focus=true?check_suite_focus=true#step:9:1024)
[example failure 2021-10-25T16:33:15.7199952Z](https://github.com/apache/pulsar/runs/3999590399?check_suite_focus=true?check_suite_focus=true#step:9:1074)
[example failure 2021-10-22T13:32:52.0142169Z](https://github.com/apache/pulsar/runs/3976144094?check_suite_focus=true?check_suite_focus=true#step:9:872)
[example failure 2021-10-21T12:01:19.2141786Z](https://github.com/apache/pulsar/runs/3963357106?check_suite_focus=true?check_suite_focus=true#step:9:872)
[example failure 2021-10-20T10:14:53.0086259Z](https://github.com/apache/pulsar/runs/3949789162?check_suite_focus=true?check_suite_focus=true#step:9:872)
[example failure 2021-10-18T22:10:09.0948605Z](https://github.com/apache/pulsar/runs/3932392486?check_suite_focus=true?check_suite_focus=true#step:9:989)
[example failure 2021-10-18T03:31:29.2304883Z](https://github.com/apache/pulsar/runs/3922105078?check_suite_focus=true?check_suite_focus=true#step:9:872)
[example failure 2021-10-18T02:16:47.2186744Z](https://github.com/apache/pulsar/runs/3921750858?check_suite_focus=true?check_suite_focus=true#step:9:930)
[example failure 2021-10-14T17:34:02.8596081Z](https://github.com/apache/pulsar/runs/3897711134?check_suite_focus=true?check_suite_focus=true#step:9:1001)
[example failure 2021-10-14T15:26:56.7757605Z](https://github.com/apache/pulsar/runs/3896418193?check_suite_focus=true?check_suite_focus=true#step:9:928)
[example failure 2021-10-14T07:03:00.6120532Z](https://github.com/apache/pulsar/runs/3891370340?check_suite_focus=true?check_suite_focus=true#step:9:866)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [100] but found [-1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.broker.service.ReplicatorRateLimiterTest.testReplicatorRateLimiterDynamicallyChange(ReplicatorRateLimiterTest.java:213)
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
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.broker.service.ReplicatorRateLimiterTest.testReplicatorRateLimiterDynamicallyChange(ReplicatorRateLimiterTest.java:234)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-11T10:51:35.6407131Z](https://github.com/apache/pulsar/runs/3858046273?check_suite_focus=true?check_suite_focus=true#step:9:866)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.broker.service.ReplicatorRateLimiterTest.testReplicatorRateLimiterDynamicallyChange(ReplicatorRateLimiterTest.java:234)
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

