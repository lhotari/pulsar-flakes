        
Flaky-test: org.apache.pulsar.client.api.KeySharedSubscriptionTest.testRemoveFirstConsumer
Number of failures: 29

org.apache.pulsar.client.api.KeySharedSubscriptionTest is flaky. The testRemoveFirstConsumer test method fails sporadically.

```
java.lang.AssertionError: expected [0] but found [10]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.client.api.KeySharedSubscriptionTest.testRemoveFirstConsumer(KeySharedSubscriptionTest.java:677)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T05:41:24.4908109Z](https://github.com/apache/pulsar/runs/3890894742?check_suite_focus=true?check_suite_focus=true#step:10:367)
[example failure 2021-10-14T03:01:01.2770408Z](https://github.com/apache/pulsar/runs/3889995753?check_suite_focus=true?check_suite_focus=true#step:10:367)
[example failure 2021-10-14T01:52:49.1758454Z](https://github.com/apache/pulsar/runs/3889610354?check_suite_focus=true?check_suite_focus=true#step:10:367)
[example failure 2021-10-14T01:26:43.0746004Z](https://github.com/apache/pulsar/runs/3889474041?check_suite_focus=true?check_suite_focus=true#step:10:367)
[example failure 2021-10-13T15:24:40.9560608Z](https://github.com/apache/pulsar/runs/3884292365?check_suite_focus=true?check_suite_focus=true#step:10:355)
[example failure 2021-10-13T14:25:16.5306012Z](https://github.com/apache/pulsar/runs/3883606909?check_suite_focus=true?check_suite_focus=true#step:10:351)
[example failure 2021-10-13T13:40:58.7237136Z](https://github.com/apache/pulsar/runs/3883077389?check_suite_focus=true?check_suite_focus=true#step:10:351)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [0] but found [10]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.client.api.KeySharedSubscriptionTest.testRemoveFirstConsumer(KeySharedSubscriptionTest.java:677)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
java.lang.AssertionError: expected [0] but found [10]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.client.api.KeySharedSubscriptionTest.testRemoveFirstConsumer(KeySharedSubscriptionTest.java:699)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-26T11:00:25.9988593Z](https://github.com/apache/pulsar/runs/4008473683?check_suite_focus=true?check_suite_focus=true#step:9:1630)
[example failure 2021-10-24T09:48:00.2309796Z](https://github.com/apache/pulsar/runs/3988166781?check_suite_focus=true?check_suite_focus=true#step:9:1428)
[example failure 2021-10-20T16:10:26.5834955Z](https://github.com/apache/pulsar/runs/3953459402?check_suite_focus=true?check_suite_focus=true#step:9:2441)
[example failure 2021-10-20T14:46:15.5777424Z](https://github.com/apache/pulsar/runs/3952724186?check_suite_focus=true?check_suite_focus=true#step:9:1392)
[example failure 2021-10-20T10:03:21.4952898Z](https://github.com/apache/pulsar/runs/3949735926?check_suite_focus=true?check_suite_focus=true#step:9:1428)
[example failure 2021-10-18T21:16:39.0556262Z](https://github.com/apache/pulsar/runs/3931725461?check_suite_focus=true?check_suite_focus=true#step:9:1428)
[example failure 2021-10-18T04:04:16.8931061Z](https://github.com/apache/pulsar/runs/3922105078?check_suite_focus=true?check_suite_focus=true#step:9:3289)
[example failure 2021-10-18T03:47:45.7438382Z](https://github.com/apache/pulsar/runs/3922105078?check_suite_focus=true?check_suite_focus=true#step:9:1496)
[example failure 2021-10-15T11:11:27.3097783Z](https://github.com/apache/pulsar/runs/3905107650?check_suite_focus=true?check_suite_focus=true#step:9:1580)
[example failure 2021-10-14T19:09:56.5631384Z](https://github.com/apache/pulsar/runs/3898240523?check_suite_focus=true?check_suite_focus=true#step:9:3217)
[example failure 2021-10-14T18:53:13.2200320Z](https://github.com/apache/pulsar/runs/3898240523?check_suite_focus=true?check_suite_focus=true#step:9:1426)
[example failure 2021-10-14T07:22:25.3460303Z](https://github.com/apache/pulsar/runs/3891370340?check_suite_focus=true?check_suite_focus=true#step:9:2301)
[example failure 2021-10-13T14:07:51.8308455Z](https://github.com/apache/pulsar/runs/3882997012?check_suite_focus=true?check_suite_focus=true#step:9:3296)
[example failure 2021-10-13T13:52:02.1081851Z](https://github.com/apache/pulsar/runs/3882997012?check_suite_focus=true?check_suite_focus=true#step:9:1509)
[example failure 2021-10-13T01:35:16.5987879Z](https://github.com/apache/pulsar/runs/3877217137?check_suite_focus=true?check_suite_focus=true#step:9:3963)
[example failure 2021-10-11T11:23:57.0960170Z](https://github.com/apache/pulsar/runs/3858046273?check_suite_focus=true?check_suite_focus=true#step:9:3296)
[example failure 2021-10-11T11:07:27.9746148Z](https://github.com/apache/pulsar/runs/3858046273?check_suite_focus=true?check_suite_focus=true#step:9:1509)
[example failure 2021-10-11T02:02:50.5252679Z](https://github.com/apache/pulsar/runs/3854364463?check_suite_focus=true?check_suite_focus=true#step:9:1567)
[example failure 2021-10-08T20:03:42.8593967Z](https://github.com/apache/pulsar/runs/3842296284?check_suite_focus=true?check_suite_focus=true#step:9:1528)
[example failure 2021-10-05T06:29:47.8251698Z](https://github.com/apache/pulsar/runs/3799834829?check_suite_focus=true?check_suite_focus=true#step:9:3833)
[example failure 2021-10-05T06:21:35.2271665Z](https://github.com/apache/pulsar/runs/3799834829?check_suite_focus=true?check_suite_focus=true#step:9:1116)
[example failure 2021-10-05T05:58:29.7625792Z](https://github.com/apache/pulsar/runs/3799683465?check_suite_focus=true?check_suite_focus=true#step:9:1164)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [0] but found [10]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.client.api.KeySharedSubscriptionTest.testRemoveFirstConsumer(KeySharedSubscriptionTest.java:699)
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

