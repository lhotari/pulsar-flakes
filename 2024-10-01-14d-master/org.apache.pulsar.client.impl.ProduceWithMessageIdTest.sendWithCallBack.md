        
Flaky-test: org.apache.pulsar.client.impl.ProduceWithMessageIdTest.sendWithCallBack
Number of failures: 2

org.apache.pulsar.client.impl.ProduceWithMessageIdTest is flaky. The sendWithCallBack test method fails sporadically.

```
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.impl.OpSendMsgStats.getUncompressedSize()" because "opSendMsgStats" is null
	at org.apache.pulsar.client.impl.ProduceWithMessageIdTest.sendWithCallBack(ProduceWithMessageIdTest.java:188)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-09-27T12:29:22.7794646Z](https://github.com/apache/pulsar/actions/runs/11070360166/job/30760341564#step:11:710)  


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

[example failure 2024-09-21T06:19:51.8712559Z](https://github.com/apache/pulsar/actions/runs/10970189870/job/30463944911#step:11:706)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.impl.OpSendMsgStats.getUncompressedSize()" because "opSendMsgStats" is null
	at org.apache.pulsar.client.impl.ProduceWithMessageIdTest.sendWithCallBack(ProduceWithMessageIdTest.java:188)
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

