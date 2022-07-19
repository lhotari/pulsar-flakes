        
Flaky-test: org.apache.pulsar.io.PulsarSinkE2ETest.testPulsarSinkDLQ
Number of failures: 1

org.apache.pulsar.io.PulsarSinkE2ETest is flaky. The testPulsarSinkDLQ test method fails sporadically.

```
java.lang.AssertionError: expected object to not be null
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.assertNotNull(Assert.java:942)
	at org.testng.Assert.assertNotNull(Assert.java:926)
	at org.apache.pulsar.io.PulsarSinkE2ETest.testPulsarSinkDLQ(PulsarSinkE2ETest.java:195)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-13T13:09:57.5038952Z](https://github.com/apache/pulsar/runs/7320943955?check_suite_focus=true#step:9:1274)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected object to not be null
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.assertNotNull(Assert.java:942)
	at org.testng.Assert.assertNotNull(Assert.java:926)
	at org.apache.pulsar.io.PulsarSinkE2ETest.testPulsarSinkDLQ(PulsarSinkE2ETest.java:195)
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

