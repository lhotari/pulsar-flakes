        
Flaky-test: org.apache.pulsar.broker.service.RackAwareTest.testRackUpdate
Number of failures: 1

org.apache.pulsar.broker.service.RackAwareTest is flaky. The testRackUpdate test method fails sporadically.

```
java.lang.AssertionError: Should be failed due to no enough rack can be found
	at org.testng.Assert.fail(Assert.java:110)
	at org.apache.pulsar.broker.service.RackAwareTest.testRackUpdate(RackAwareTest.java:324)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-01T03:47:39.0166569Z](https://github.com/apache/pulsar/actions/runs/4052838203/jobs/6989994642#step:9:1087)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: Should be failed due to no enough rack can be found
	at org.testng.Assert.fail(Assert.java:110)
	at org.apache.pulsar.broker.service.RackAwareTest.testRackUpdate(RackAwareTest.java:324)
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

