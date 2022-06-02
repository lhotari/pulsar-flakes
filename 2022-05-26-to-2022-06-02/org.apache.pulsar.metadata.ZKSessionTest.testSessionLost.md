        
Flaky-test: org.apache.pulsar.metadata.ZKSessionTest.testSessionLost
Number of failures: 4

org.apache.pulsar.metadata.ZKSessionTest is flaky. The testSessionLost test method fails sporadically.

```
java.lang.AssertionError: expected [Reconnected] but found [null]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testSessionLost(ZKSessionTest.java:93)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-05-27T11:52:22.1431735Z](https://github.com/apache/pulsar/runs/6623889615?check_suite_focus=true#step:8:17932)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [Reconnected] but found [null]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testSessionLost(ZKSessionTest.java:93)
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

[example failure 2022-06-01T07:55:47.2195313Z](https://github.com/apache/pulsar/runs/6684270600?check_suite_focus=true#step:10:602)  
[example failure 2022-05-31T23:03:04.6332298Z](https://github.com/apache/pulsar/runs/6679252126?check_suite_focus=true#step:10:25047)  
[example failure 2022-05-31T11:43:52.4433426Z](https://github.com/apache/pulsar/runs/6668795517?check_suite_focus=true#step:10:21184)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [Reconnected] but found [null]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testSessionLost(ZKSessionTest.java:93)
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

