        
Flaky-test: org.apache.pulsar.broker.service.ReplicatorTest.activeBrokerParse
Number of failures: 1

org.apache.pulsar.broker.service.ReplicatorTest is flaky. The activeBrokerParse test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException: java.util.concurrent.CompletionException: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/127.0.0.1:5678
	at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:229)
	at org.apache.pulsar.client.admin.internal.BrokersImpl$1.failed(BrokersImpl.java:74)
	at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:839)
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
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-20T16:36:35.8161220Z](https://github.com/apache/pulsar/runs/2155937742?check_suite_focus=true#step:9:453)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException: java.util.concurrent.CompletionException: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/127.0.0.1:5678
	at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:229)
	at org.apache.pulsar.client.admin.internal.BrokersImpl$1.failed(BrokersImpl.java:74)
	at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:839)
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
	at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:202)
	at java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:774)
	at java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:750)
	at java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:488)
	at java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:1990)
	at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$3(AsyncHttpConnector.java:244)
	at java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:774)
	at java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:750)
	at java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:488)
	at java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:1990)
	at org.asynchttpclient.netty.NettyResponseFuture.abort(NettyResponseFuture.java:273)
	at org.asynchttpclient.netty.channel.NettyConnectListener.onFailure(NettyConnectListener.java:181)
	at org.asynchttpclient.netty.channel.NettyChannelConnector$1.onFailure(NettyChannelConnector.java:108)
	at org.asynchttpclient.netty.SimpleChannelFutureListener.operationComplete(SimpleChannelFutureListener.java:28)
	at org.asynchttpclient.netty.SimpleChannelFutureListener.operationComplete(SimpleChannelFutureListener.java:20)
	at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:577)
	at io.netty.util.concurrent.DefaultPromise.notifyListeners0(DefaultPromise.java:570)
	at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:549)
	at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:490)
	at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:615)
	at io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:608)
	at io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:117)
	at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.fulfillConnectPromise(AbstractNioChannel.java:321)
	at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.finishConnect(AbstractNioChannel.java:337)
	at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:702)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:650)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:576)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:493)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:989)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.lang.Thread.run(Thread.java:748)
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/127.0.0.1:5678
	at java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:292)
	at java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:308)
	at java.util.concurrent.CompletableFuture.orApply(CompletableFuture.java:1385)
	at java.util.concurrent.CompletableFuture$OrApply.tryFire(CompletableFuture.java:1364)
	... 29 more
Caused by: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/127.0.0.1:5678
	at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$3(AsyncHttpConnector.java:246)
	... 26 more
Caused by: java.net.ConnectException: Connection refused: localhost/127.0.0.1:5678
	at org.asynchttpclient.netty.channel.NettyConnectListener.onFailure(NettyConnectListener.java:179)
	... 20 more
Caused by: io.netty.channel.AbstractChannel$AnnotatedConnectException: Connection refused: localhost/127.0.0.1:5678
Caused by: java.net.ConnectException: Connection refused
	at sun.nio.ch.SocketChannelImpl.checkConnect(Native Method)
	at sun.nio.ch.SocketChannelImpl.finishConnect(SocketChannelImpl.java:714)
	at io.netty.channel.socket.nio.NioSocketChannel.doFinishConnect(NioSocketChannel.java:330)
	at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.finishConnect(AbstractNioChannel.java:334)
	at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:702)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:650)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:576)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:493)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:989)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

