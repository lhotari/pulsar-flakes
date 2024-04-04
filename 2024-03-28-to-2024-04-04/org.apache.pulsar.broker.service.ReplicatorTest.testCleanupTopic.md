        
Flaky-test: org.apache.pulsar.broker.service.ReplicatorTest.testCleanupTopic
Number of failures: 1

org.apache.pulsar.broker.service.ReplicatorTest is flaky. The testCleanupTopic test method fails sporadically.

```
java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.CompletableFuture.timedGet(CompletableFuture.java:1960)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2095)
	at org.apache.pulsar.broker.service.ReplicatorTest.testCleanupTopic(ReplicatorTest.java:1512)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-04-02T09:58:41.8555629Z](https://github.com/apache/pulsar/actions/runs/8520682849/job/23337681597#step:11:751)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.CompletableFuture.timedGet(CompletableFuture.java:1960)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2095)
	at org.apache.pulsar.broker.service.ReplicatorTest.testCleanupTopic(ReplicatorTest.java:1512)
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
	at java.base/java.lang.Thread.run(Thread.java:840)

</pre></code>
</details>

