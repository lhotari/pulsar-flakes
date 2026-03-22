        
Flaky-test: org.apache.pulsar.broker.service.ServerCnxTest.testCreateProducerTimeout
Number of failures: 1

org.apache.pulsar.broker.service.ServerCnxTest is flaky. The testCreateProducerTimeout test method fails sporadically.

```
java.io.IOException: Failed to get response from socket within 10s
	at org.apache.pulsar.broker.service.ServerCnxTest.getResponse(ServerCnxTest.java:2908)
	at org.apache.pulsar.broker.service.ServerCnxTest.getResponse(ServerCnxTest.java:2884)
	at org.apache.pulsar.broker.service.ServerCnxTest.testCreateProducerTimeout(ServerCnxTest.java:2093)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-19T06:36:20.4896327Z](https://github.com/apache/pulsar/actions/runs/23282433746/job/67699333061#step:11:1057)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.service.ServerCnxTest.testCreateProducerTimeout -- Time elapsed: 10.07 s <<< FAILURE!
java.io.IOException: Failed to get response from socket within 10s
	at org.apache.pulsar.broker.service.ServerCnxTest.getResponse(ServerCnxTest.java:2908)
	at org.apache.pulsar.broker.service.ServerCnxTest.getResponse(ServerCnxTest.java:2884)
	at org.apache.pulsar.broker.service.ServerCnxTest.testCreateProducerTimeout(ServerCnxTest.java:2093)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
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

