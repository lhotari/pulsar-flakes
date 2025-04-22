        
Flaky-test: org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaProcessTest.testTumblingCountWindowTest
Number of failures: 1

org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaProcessTest is flaky. The testTumblingCountWindowTest test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testTumblingCountWindowTest() didn't finish within the time-out 300000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-17T13:28:42.7153112Z](https://github.com/apache/pulsar/actions/runs/14515342657/job/40724809847#step:12:38233)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testTumblingCountWindowTest() didn't finish within the time-out 300000
	at java.base/jdk.internal.misc.Unsafe.park(Native Method)
	at java.base/java.util.concurrent.locks.LockSupport.park(LockSupport.java:221)
	at java.base/java.util.concurrent.CompletableFuture$Signaller.block(CompletableFuture.java:1864)
	at java.base/java.util.concurrent.ForkJoinPool.unmanagedBlock(ForkJoinPool.java:3780)
	at java.base/java.util.concurrent.ForkJoinPool.managedBlock(ForkJoinPool.java:3725)
	at java.base/java.util.concurrent.CompletableFuture.waitingGet(CompletableFuture.java:1898)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2072)
	at org.apache.pulsar.tests.integration.utils.DockerUtils.runCommand(DockerUtils.java:180)
	at org.apache.pulsar.tests.integration.containers.ChaosContainer.execCmd(ChaosContainer.java:86)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testWindowFunction(PulsarFunctionsTest.java:294)
	at org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testTumblingCountWindowTest(PulsarFunctionsJavaTest.java:204)
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

