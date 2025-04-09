        
Flaky-test: org.apache.pulsar.client.impl.ProduceWithMessageIdTest.sendWithCallBack
Number of failures: 3

org.apache.pulsar.client.impl.ProduceWithMessageIdTest is flaky. The sendWithCallBack test method fails sporadically.

```
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.impl.OpSendMsgStats.getUncompressedSize()" because "opSendMsgStats" is null
	at org.apache.pulsar.client.impl.ProduceWithMessageIdTest.sendWithCallBack(ProduceWithMessageIdTest.java:188)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-08T06:22:40.6398209Z](https://github.com/apache/pulsar/actions/runs/14326248658/job/40152519760#step:11:1420)  
[example failure 2025-04-05T06:22:25.0386947Z](https://github.com/apache/pulsar/actions/runs/14279053943/job/40026465522#step:11:1418)  
[example failure 2025-04-02T06:22:07.9353948Z](https://github.com/apache/pulsar/actions/runs/14212605378/job/39822770724#step:10:1516)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.impl.OpSendMsgStats.getUncompressedSize()" because "opSendMsgStats" is null
	at org.apache.pulsar.client.impl.ProduceWithMessageIdTest.sendWithCallBack(ProduceWithMessageIdTest.java:188)
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

