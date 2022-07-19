        
Flaky-test: org.apache.pulsar.websocket.proxy.ProxyPublishConsumeTest.consumeEncryptedMessages
Number of failures: 1

org.apache.pulsar.websocket.proxy.ProxyPublishConsumeTest is flaky. The consumeEncryptedMessages test method fails sporadically.

```
java.lang.IllegalStateException: Blocking message pending 10000 for BLOCKING
	at org.eclipse.jetty.websocket.common.WebSocketRemoteEndpoint.lockMsg(WebSocketRemoteEndpoint.java:133)
	at org.eclipse.jetty.websocket.common.WebSocketRemoteEndpoint.sendString(WebSocketRemoteEndpoint.java:392)
	at org.apache.pulsar.websocket.proxy.SimpleConsumerSocket.sendPermits(SimpleConsumerSocket.java:105)
	at org.apache.pulsar.websocket.proxy.ProxyPublishConsumeTest.consumeEncryptedMessages(ProxyPublishConsumeTest.java:968)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-15T04:17:38.9008206Z](https://github.com/apache/pulsar/runs/7351540734?check_suite_focus=true#step:8:609)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.IllegalStateException: Blocking message pending 10000 for BLOCKING
	at org.eclipse.jetty.websocket.common.WebSocketRemoteEndpoint.lockMsg(WebSocketRemoteEndpoint.java:133)
	at org.eclipse.jetty.websocket.common.WebSocketRemoteEndpoint.sendString(WebSocketRemoteEndpoint.java:392)
	at org.apache.pulsar.websocket.proxy.SimpleConsumerSocket.sendPermits(SimpleConsumerSocket.java:105)
	at org.apache.pulsar.websocket.proxy.ProxyPublishConsumeTest.consumeEncryptedMessages(ProxyPublishConsumeTest.java:968)
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

