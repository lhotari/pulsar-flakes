        
Flaky-test: org.apache.pulsar.broker.service.RackAwareTest.testPlacement
Number of failures: 12

org.apache.pulsar.broker.service.RackAwareTest is flaky. The testPlacement test method fails sporadically.

```
java.lang.AssertionError: first bookie in rack 0 not included in ensemble expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.broker.service.RackAwareTest.testPlacement(RackAwareTest.java:135)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-15T14:53:09.3749611Z](https://github.com/apache/pulsar/runs/7359009535?check_suite_focus=true#step:9:441)  
[example failure 2022-06-11T00:16:49.5409412Z](https://github.com/apache/pulsar/runs/6839584504?check_suite_focus=true#step:9:281)  


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
java.lang.AssertionError: first bookie in rack 0 not included in ensemble expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.broker.service.RackAwareTest.testPlacement(RackAwareTest.java:144)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-10T12:21:22.9112136Z](https://github.com/apache/pulsar/runs/6830378843?check_suite_focus=true#step:9:299)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: first bookie in rack 0 not included in ensemble expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.broker.service.RackAwareTest.testPlacement(RackAwareTest.java:144)
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
java.lang.AssertionError: first bookie in rack 0 not included in ensemble expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.broker.service.RackAwareTest.testPlacement(RackAwareTest.java:145)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-16T15:43:49.0778031Z](https://github.com/apache/pulsar/runs/7371495930?check_suite_focus=true#step:10:1129)  
[example failure 2022-07-16T15:20:15.2179613Z](https://github.com/apache/pulsar/runs/7371381437?check_suite_focus=true#step:10:879)  
[example failure 2022-07-15T13:27:25.7424754Z](https://github.com/apache/pulsar/runs/7358260032?check_suite_focus=true#step:10:879)  
[example failure 2022-07-13T13:01:08.7448272Z](https://github.com/apache/pulsar/runs/7320944455?check_suite_focus=true#step:10:950)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: first bookie in rack 0 not included in ensemble expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.broker.service.RackAwareTest.testPlacement(RackAwareTest.java:145)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

```
java.lang.AssertionError: first bookie in rack 0 not included in ensemble expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.broker.service.RackAwareTest.testPlacement(RackAwareTest.java:142)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-10T11:35:15.6687506Z](https://github.com/apache/pulsar/runs/6830068240?check_suite_focus=true#step:10:662)  
[example failure 2022-06-09T07:59:47.7781615Z](https://github.com/apache/pulsar/runs/6807798424?check_suite_focus=true#step:10:660)  
[example failure 2022-06-08T04:11:41.2540461Z](https://github.com/apache/pulsar/runs/6786847531?check_suite_focus=true#step:10:659)  
[example failure 2022-06-07T02:10:02.0871001Z](https://github.com/apache/pulsar/runs/6766330496?check_suite_focus=true#step:9:671)  
[example failure 2022-06-04T19:17:00.7811660Z](https://github.com/apache/pulsar/runs/6740218946?check_suite_focus=true#step:10:654)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: first bookie in rack 0 not included in ensemble expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.broker.service.RackAwareTest.testPlacement(RackAwareTest.java:142)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

