        
Flaky-test: org.apache.pulsar.functions.instance.JavaInstanceTest.testAsyncFunctionMaxPending
Number of failures: 1

org.apache.pulsar.functions.instance.JavaInstanceTest is flaky. The testAsyncFunctionMaxPending test method fails sporadically.

```
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.functions.instance.JavaInstance$AsyncFuncRequest.getProcessResult()" because "request" is null
	at org.apache.pulsar.functions.instance.JavaInstanceTest.testAsyncFunctionMaxPending(JavaInstanceTest.java:227)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-01-07T06:24:54.0642054Z](https://github.com/apache/pulsar/actions/runs/7436415342/job/20233000560#step:11:5875)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.functions.instance.JavaInstance$AsyncFuncRequest.getProcessResult()" because "request" is null
	at org.apache.pulsar.functions.instance.JavaInstanceTest.testAsyncFunctionMaxPending(JavaInstanceTest.java:227)
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

