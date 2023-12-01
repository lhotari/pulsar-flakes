        
Flaky-test: org.apache.pulsar.tests.integration.cli.PerfToolTest.testRead
Number of failures: 2

org.apache.pulsar.tests.integration.cli.PerfToolTest is flaky. The testRead test method fails sporadically.

```
java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.CompletableFuture.timedGet(CompletableFuture.java:1960)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2095)
	at org.apache.pulsar.tests.integration.cli.PerfToolTest.readWithPerfTool(PerfToolTest.java:89)
	at org.apache.pulsar.tests.integration.cli.PerfToolTest.testRead(PerfToolTest.java:64)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-12-01T06:52:07.9633745Z](https://github.com/apache/pulsar/actions/runs/7056402624/job/19208695097#step:12:28732)  
[example failure 2023-11-29T06:57:13.0823361Z](https://github.com/apache/pulsar/actions/runs/7028635721/job/19125319488#step:12:28378)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.CompletableFuture.timedGet(CompletableFuture.java:1960)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2095)
	at org.apache.pulsar.tests.integration.cli.PerfToolTest.readWithPerfTool(PerfToolTest.java:89)
	at org.apache.pulsar.tests.integration.cli.PerfToolTest.testRead(PerfToolTest.java:64)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

</pre></code>
</details>

