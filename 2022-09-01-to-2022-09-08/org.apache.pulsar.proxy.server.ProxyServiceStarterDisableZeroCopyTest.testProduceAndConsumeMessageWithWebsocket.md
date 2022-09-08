        
Flaky-test: org.apache.pulsar.proxy.server.ProxyServiceStarterDisableZeroCopyTest.testProduceAndConsumeMessageWithWebsocket
Number of failures: 1

org.apache.pulsar.proxy.server.ProxyServiceStarterDisableZeroCopyTest is flaky. The testProduceAndConsumeMessageWithWebsocket test method fails sporadically.

```
java.lang.NullPointerException: Cannot invoke "String.toLowerCase(java.util.Locale)" because "host" is null
	at org.eclipse.jetty.client.HttpClient.createOrigin(HttpClient.java:560)
	at org.eclipse.jetty.client.HttpClient.resolveDestination(HttpClient.java:550)
	at org.eclipse.jetty.client.HttpClient.send(HttpClient.java:599)
	at org.eclipse.jetty.client.HttpRequest.sendAsync(HttpRequest.java:778)
	at org.eclipse.jetty.client.HttpRequest.send(HttpRequest.java:765)
	at org.eclipse.jetty.websocket.client.WebSocketUpgradeRequest.send(WebSocketUpgradeRequest.java:565)
	at org.eclipse.jetty.websocket.client.WebSocketUpgradeRequest.sendAsync(WebSocketUpgradeRequest.java:570)
	at org.eclipse.jetty.websocket.client.WebSocketClient.connect(WebSocketClient.java:389)
	at org.eclipse.jetty.websocket.client.WebSocketClient.connect(WebSocketClient.java:315)
	at org.eclipse.jetty.websocket.client.WebSocketClient.connect(WebSocketClient.java:301)
	at org.apache.pulsar.proxy.server.ProxyServiceStarterTest.testProduceAndConsumeMessageWithWebsocket(ProxyServiceStarterTest.java:115)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-06T11:34:35.2479418Z](https://github.com/apache/pulsar/runs/7213753036?check_suite_focus=true#step:10:426)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "String.toLowerCase(java.util.Locale)" because "host" is null
	at org.eclipse.jetty.client.HttpClient.createOrigin(HttpClient.java:560)
	at org.eclipse.jetty.client.HttpClient.resolveDestination(HttpClient.java:550)
	at org.eclipse.jetty.client.HttpClient.send(HttpClient.java:599)
	at org.eclipse.jetty.client.HttpRequest.sendAsync(HttpRequest.java:778)
	at org.eclipse.jetty.client.HttpRequest.send(HttpRequest.java:765)
	at org.eclipse.jetty.websocket.client.WebSocketUpgradeRequest.send(WebSocketUpgradeRequest.java:565)
	at org.eclipse.jetty.websocket.client.WebSocketUpgradeRequest.sendAsync(WebSocketUpgradeRequest.java:570)
	at org.eclipse.jetty.websocket.client.WebSocketClient.connect(WebSocketClient.java:389)
	at org.eclipse.jetty.websocket.client.WebSocketClient.connect(WebSocketClient.java:315)
	at org.eclipse.jetty.websocket.client.WebSocketClient.connect(WebSocketClient.java:301)
	at org.apache.pulsar.proxy.server.ProxyServiceStarterTest.testProduceAndConsumeMessageWithWebsocket(ProxyServiceStarterTest.java:115)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

