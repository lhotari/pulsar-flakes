        
Flaky-test: org.apache.pulsar.broker.service.ReplicatorTest.activeBrokerParse
Number of failures: 1

org.apache.pulsar.broker.service.ReplicatorTest is flaky. The activeBrokerParse test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException: java.util.concurrent.CompletionException: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/[0:0:0:0:0:0:0:1]:5678
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.BrokersImpl.getActiveBrokers(BrokersImpl.java:57)
	at org.apache.pulsar.broker.service.ReplicatorTest.activeBrokerParse(ReplicatorTest.java:243)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-02T09:32:10.9674625Z](https://github.com/apache/pulsar/actions/runs/4072853701/jobs/7016366670#step:11:1122)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException: java.util.concurrent.CompletionException: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/[0:0:0:0:0:0:0:1]:5678
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.BrokersImpl.getActiveBrokers(BrokersImpl.java:57)
	at org.apache.pulsar.broker.service.ReplicatorTest.activeBrokerParse(ReplicatorTest.java:243)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException: java.util.concurrent.CompletionException: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/[0:0:0:0:0:0:0:1]:5678
		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:300)
		at org.apache.pulsar.client.admin.internal.BaseResource$FutureCallback.failed(BaseResource.java:373)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
		at org.glassfish.jersey.client.ClientRuntime.processFailure(ClientRuntime.java:247)
		at org.glassfish.jersey.client.ClientRuntime.processFailure(ClientRuntime.java:242)
		at org.glassfish.jersey.client.ClientRuntime.access$100(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$failure$1(ClientRuntime.java:178)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.failure(ClientRuntime.java:178)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:227)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:289)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
		at org.asynchttpclient.netty.NettyResponseFuture.abort(NettyResponseFuture.java:273)
		at org.asynchttpclient.netty.channel.NettyConnectListener.onFailure(NettyConnectListener.java:181)
		at org.asynchttpclient.netty.channel.NettyChannelConnector$1.onFailure(NettyChannelConnector.java:108)
		at org.asynchttpclient.netty.SimpleChannelFutureListener.operationComplete(SimpleChannelFutureListener.java:28)
		at org.asynchttpclient.netty.SimpleChannelFutureListener.operationComplete(SimpleChannelFutureListener.java:20)
		at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:590)
		at io.netty.util.concurrent.DefaultPromise.notifyListeners0(DefaultPromise.java:583)
		at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:559)
		at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:492)
		at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:636)
		at io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:629)
		at io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:118)
		at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.fulfillConnectPromise(AbstractNioChannel.java:321)
		at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.finishConnect(AbstractNioChannel.java:337)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:776)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:724)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:650)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/[0:0:0:0:0:0:0:1]:5678
		at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
		at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
		at java.base/java.util.concurrent.CompletableFuture$OrApply.tryFire(CompletableFuture.java:1576)
		... 29 more
	Caused by: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/[0:0:0:0:0:0:0:1]:5678
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:291)
		... 26 more
	Caused by: java.net.ConnectException: Connection refused: localhost/[0:0:0:0:0:0:0:1]:5678
		at org.asynchttpclient.netty.channel.NettyConnectListener.onFailure(NettyConnectListener.java:179)
		... 20 more
	Caused by: io.netty.channel.AbstractChannel$AnnotatedConnectException: Connection refused: localhost/[0:0:0:0:0:0:0:1]:5678
	Caused by: java.net.ConnectException: Connection refused
		at java.base/sun.nio.ch.Net.pollConnect(Native Method)
		at java.base/sun.nio.ch.Net.pollConnectNow(Net.java:672)
		at java.base/sun.nio.ch.SocketChannelImpl.finishConnect(SocketChannelImpl.java:946)
		at io.netty.channel.socket.nio.NioSocketChannel.doFinishConnect(NioSocketChannel.java:337)
		at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.finishConnect(AbstractNioChannel.java:334)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:776)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:724)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:650)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: [CIRCULAR REFERENCE: java.util.concurrent.CompletionException: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/[0:0:0:0:0:0:0:1]:5678]

</pre></code>
</details>

