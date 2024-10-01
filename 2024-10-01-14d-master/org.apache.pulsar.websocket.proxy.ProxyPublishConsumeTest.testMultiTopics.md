        
Flaky-test: org.apache.pulsar.websocket.proxy.ProxyPublishConsumeTest.testMultiTopics
Number of failures: 1

org.apache.pulsar.websocket.proxy.ProxyPublishConsumeTest is flaky. The testMultiTopics test method fails sporadically.

```
java.lang.IllegalStateException: Blocking message pending 10000 for BLOCKING
	at org.eclipse.jetty.websocket.common.WebSocketRemoteEndpoint.lockMsg(WebSocketRemoteEndpoint.java:133)
	at org.eclipse.jetty.websocket.common.WebSocketRemoteEndpoint.sendString(WebSocketRemoteEndpoint.java:392)
	at org.apache.pulsar.websocket.proxy.SimpleConsumerSocket.sendPermits(SimpleConsumerSocket.java:105)
	at org.apache.pulsar.websocket.proxy.ProxyPublishConsumeTest.testMultiTopics(ProxyPublishConsumeTest.java:1104)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-09-20T06:21:03.0736954Z](https://github.com/apache/pulsar/actions/runs/10954018373/job/30415616997#step:10:677)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.IllegalStateException: Blocking message pending 10000 for BLOCKING
	at org.eclipse.jetty.websocket.common.WebSocketRemoteEndpoint.lockMsg(WebSocketRemoteEndpoint.java:133)
	at org.eclipse.jetty.websocket.common.WebSocketRemoteEndpoint.sendString(WebSocketRemoteEndpoint.java:392)
	at org.apache.pulsar.websocket.proxy.SimpleConsumerSocket.sendPermits(SimpleConsumerSocket.java:105)
	at org.apache.pulsar.websocket.proxy.ProxyPublishConsumeTest.testMultiTopics(ProxyPublishConsumeTest.java:1104)
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

