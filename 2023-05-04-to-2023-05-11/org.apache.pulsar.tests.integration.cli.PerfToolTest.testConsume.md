        
Flaky-test: org.apache.pulsar.tests.integration.cli.PerfToolTest.testConsume
Number of failures: 2

org.apache.pulsar.tests.integration.cli.PerfToolTest is flaky. The testConsume test method fails sporadically.

```
java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.CompletableFuture.timedGet(CompletableFuture.java:1886)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2021)
	at org.apache.pulsar.tests.integration.cli.PerfToolTest.consumeWithPerfTool(PerfToolTest.java:80)
	at org.apache.pulsar.tests.integration.cli.PerfToolTest.testConsume(PerfToolTest.java:53)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-05-07T16:43:44.0680423Z](https://github.com/apache/pulsar/actions/runs/4907231742/jobs/8763587145#step:12:25422)  
[example failure 2023-05-07T13:31:32.5095530Z](https://github.com/apache/pulsar/actions/runs/4907231742/jobs/8762228850#step:12:26347)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.CompletableFuture.timedGet(CompletableFuture.java:1886)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2021)
	at org.apache.pulsar.tests.integration.cli.PerfToolTest.consumeWithPerfTool(PerfToolTest.java:80)
	at org.apache.pulsar.tests.integration.cli.PerfToolTest.testConsume(PerfToolTest.java:53)
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

