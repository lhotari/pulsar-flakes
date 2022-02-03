        
Flaky-test: org.apache.pulsar.metadata.ZKSessionTest.testSessionLost
Number of failures: 5

org.apache.pulsar.metadata.ZKSessionTest is flaky. The testSessionLost test method fails sporadically.

```
java.lang.AssertionError: expected [Reconnected] but found [null]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testSessionLost(ZKSessionTest.java:91)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-30T12:31:48.6236090Z](https://github.com/apache/pulsar/runs/4996482948?check_suite_focus=true?check_suite_focus=true#step:8:17798)  
[example failure 2022-01-29T07:00:33.9978848Z](https://github.com/apache/pulsar/runs/4989658343?check_suite_focus=true?check_suite_focus=true#step:8:17794)  
[example failure 2022-01-28T13:32:39.6065870Z](https://github.com/apache/pulsar/runs/4980584591?check_suite_focus=true?check_suite_focus=true#step:8:17794)  
[example failure 2022-01-28T11:57:47.0870676Z](https://github.com/apache/pulsar/runs/4979694510?check_suite_focus=true?check_suite_focus=true#step:8:17794)  
[example failure 2022-01-27T12:07:16.7537224Z](https://github.com/apache/pulsar/runs/4964582766?check_suite_focus=true?check_suite_focus=true#step:8:17794)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [Reconnected] but found [null]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testSessionLost(ZKSessionTest.java:91)
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

