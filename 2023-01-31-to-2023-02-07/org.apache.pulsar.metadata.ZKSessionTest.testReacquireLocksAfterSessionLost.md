        
Flaky-test: org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost
Number of failures: 19

org.apache.pulsar.metadata.ZKSessionTest is flaky. The testReacquireLocksAfterSessionLost test method fails sporadically.

```
java.lang.AssertionError: expected [SessionReestablished] but found [SessionLost]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1413)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:643)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:133)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-04T18:35:18.8852015Z](https://github.com/apache/pulsar/actions/runs/4092731997/jobs/7057712179#step:11:538)  
[example failure 2023-02-03T13:29:49.1281252Z](https://github.com/apache/pulsar/actions/runs/4084258077/jobs/7040958234#step:11:10480)  
[example failure 2023-02-03T08:53:59.2162325Z](https://github.com/apache/pulsar/actions/runs/4080607974/jobs/7036609920#step:11:540)  
[example failure 2023-02-03T07:10:28.0941909Z](https://github.com/apache/pulsar/actions/runs/4081522085/jobs/7035431186#step:11:519)  
[example failure 2023-02-02T18:23:35.0028778Z](https://github.com/apache/pulsar/actions/runs/4076880348/jobs/7025841245#step:11:10501)  
[example failure 2023-02-02T10:51:24.6946231Z](https://github.com/apache/pulsar/actions/runs/4073367805/jobs/7017478453#step:11:10471)  
[example failure 2023-02-02T03:47:44.5115337Z](https://github.com/apache/pulsar/actions/runs/4070796719/jobs/7012178986#step:11:519)  
[example failure 2023-02-01T18:58:00.4863752Z](https://github.com/apache/pulsar/actions/runs/4067388870/jobs/7004983176#step:11:10519)  
[example failure 2023-02-01T09:26:58.4570569Z](https://github.com/apache/pulsar/actions/runs/4062520688/jobs/6993847519#step:11:10508)  
[example failure 2023-02-01T06:03:28.1380711Z](https://github.com/apache/pulsar/actions/runs/4061212500/jobs/6991164455#step:11:551)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [SessionReestablished] but found [SessionLost]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1413)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:643)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:133)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

```
java.lang.AssertionError: expected [SessionLost] but found [Reconnected]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1413)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:643)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:128)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-07T07:13:38.6209756Z](https://github.com/apache/pulsar/actions/runs/4111179596/jobs/7094821865#step:11:10443)  
[example failure 2023-02-03T15:29:26.3561549Z](https://github.com/apache/pulsar/actions/runs/4085189242/jobs/7043097955#step:11:10480)  
[example failure 2023-02-03T03:57:15.7692001Z](https://github.com/apache/pulsar/actions/runs/4080739802/jobs/7033639834#step:11:10501)  
[example failure 2023-02-02T18:53:58.5571498Z](https://github.com/apache/pulsar/actions/runs/4077347649/jobs/7026520131#step:11:540)  
[example failure 2023-02-02T05:01:42.1213811Z](https://github.com/apache/pulsar/actions/runs/4071192392/jobs/7012876151#step:11:10519)  
[example failure 2023-02-01T07:08:01.7776634Z](https://github.com/apache/pulsar/actions/runs/4061536044/jobs/6991799480#step:11:10479)  
[example failure 2023-01-31T23:38:35.4656913Z](https://github.com/apache/pulsar/actions/runs/4059057719/jobs/6986870270#step:11:10535)  
[example failure 2023-01-31T23:21:19.4577519Z](https://github.com/apache/pulsar/actions/runs/4058927942/jobs/6986633167#step:11:10515)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [SessionLost] but found [Reconnected]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1413)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:643)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:128)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

```
java.lang.AssertionError: expected [SessionReestablished] but found [null]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1413)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:643)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:133)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-03T08:00:03.3780314Z](https://github.com/apache/pulsar/actions/runs/4081947710/jobs/7035964284#step:11:10495)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [SessionReestablished] but found [null]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1413)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:643)
	at org.apache.pulsar.metadata.ZKSessionTest.testReacquireLocksAfterSessionLost(ZKSessionTest.java:133)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

