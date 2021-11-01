        
Flaky-test: org.apache.pulsar.broker.service.ReplicatorTest.activeBrokerParse
Number of failures: 4

org.apache.pulsar.broker.service.ReplicatorTest is flaky. The activeBrokerParse test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException: java.util.concurrent.CompletionException: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/0:0:0:0:0:0:0:1:5678
	at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:247)
	at org.apache.pulsar.client.admin.internal.BrokersImpl$1.failed(BrokersImpl.java:75)
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
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-16T18:54:02.3901672Z](https://github.com/apache/pulsar/runs/3915265627?check_suite_focus=true?check_suite_focus=true#step:9:286)
[example failure 2021-10-05T07:33:41.0345801Z](https://github.com/apache/pulsar/runs/3800317380?check_suite_focus=true?check_suite_focus=true#step:9:3068)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException: java.util.concurrent.CompletionException: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/0:0:0:0:0:0:0:1:5678
	at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:247)
	at org.apache.pulsar.client.admin.internal.BrokersImpl$1.failed(BrokersImpl.java:75)
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
	at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:204)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:263)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.asynchttpclient.netty.NettyResponseFuture.abort(NettyResponseFuture.java:273)
	at org.asynchttpclient.netty.channel.NettyConnectListener.onFailure(NettyConnectListener.java:181)
	at org.asynchttpclient.netty.channel.NettyChannelConnector$1.onFailure(NettyChannelConnector.java:108)
	at org.asynchttpclient.netty.SimpleChannelFutureListener.operationComplete(SimpleChannelFutureListener.java:28)
	at org.asynchttpclient.netty.SimpleChannelFutureListener.operationComplete(SimpleChannelFutureListener.java:20)
	at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:578)
	at io.netty.util.concurrent.DefaultPromise.notifyListeners0(DefaultPromise.java:571)
	at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:550)
	at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:491)
	at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:616)
	at io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:609)
	at io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:117)
	at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.fulfillConnectPromise(AbstractNioChannel.java:321)
	at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.finishConnect(AbstractNioChannel.java:337)
	at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:707)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:655)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:581)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:493)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/0:0:0:0:0:0:0:1:5678
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture$OrApply.tryFire(CompletableFuture.java:1503)
	... 29 more
Caused by: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/0:0:0:0:0:0:0:1:5678
	at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:265)
	... 26 more
Caused by: java.net.ConnectException: Connection refused: localhost/0:0:0:0:0:0:0:1:5678
	at org.asynchttpclient.netty.channel.NettyConnectListener.onFailure(NettyConnectListener.java:179)
	... 20 more
Caused by: io.netty.channel.AbstractChannel$AnnotatedConnectException: Connection refused: localhost/0:0:0:0:0:0:0:1:5678
Caused by: java.net.ConnectException: Connection refused
	at java.base/sun.nio.ch.SocketChannelImpl.checkConnect(Native Method)
	at java.base/sun.nio.ch.SocketChannelImpl.finishConnect(SocketChannelImpl.java:777)
	at io.netty.channel.socket.nio.NioSocketChannel.doFinishConnect(NioSocketChannel.java:330)
	at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.finishConnect(AbstractNioChannel.java:334)
	at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:707)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:655)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:581)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:493)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException: java.util.concurrent.CompletionException: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/0:0:0:0:0:0:0:1:1234
	at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:247)
	at org.apache.pulsar.client.admin.internal.BrokersImpl$1.failed(BrokersImpl.java:75)
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
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-25T16:25:22.6329069Z](https://github.com/apache/pulsar/runs/3999392973?check_suite_focus=true?check_suite_focus=true#step:9:286)
[example failure 2021-10-06T07:17:03.2321881Z](https://github.com/apache/pulsar/runs/3811845570?check_suite_focus=true?check_suite_focus=true#step:9:398)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException: java.util.concurrent.CompletionException: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/0:0:0:0:0:0:0:1:1234
	at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:247)
	at org.apache.pulsar.client.admin.internal.BrokersImpl$1.failed(BrokersImpl.java:75)
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
	at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:204)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:263)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.asynchttpclient.netty.NettyResponseFuture.abort(NettyResponseFuture.java:273)
	at org.asynchttpclient.netty.channel.NettyConnectListener.onFailure(NettyConnectListener.java:181)
	at org.asynchttpclient.netty.channel.NettyChannelConnector$1.onFailure(NettyChannelConnector.java:108)
	at org.asynchttpclient.netty.SimpleChannelFutureListener.operationComplete(SimpleChannelFutureListener.java:28)
	at org.asynchttpclient.netty.SimpleChannelFutureListener.operationComplete(SimpleChannelFutureListener.java:20)
	at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:578)
	at io.netty.util.concurrent.DefaultPromise.notifyListeners0(DefaultPromise.java:571)
	at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:550)
	at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:491)
	at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:616)
	at io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:609)
	at io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:117)
	at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.fulfillConnectPromise(AbstractNioChannel.java:321)
	at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.finishConnect(AbstractNioChannel.java:337)
	at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:707)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:655)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:581)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:493)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/0:0:0:0:0:0:0:1:1234
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:331)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:346)
	at java.base/java.util.concurrent.CompletableFuture$OrApply.tryFire(CompletableFuture.java:1503)
	... 29 more
Caused by: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/0:0:0:0:0:0:0:1:1234
	at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:265)
	... 26 more
Caused by: java.net.ConnectException: Connection refused: localhost/0:0:0:0:0:0:0:1:1234
	at org.asynchttpclient.netty.channel.NettyConnectListener.onFailure(NettyConnectListener.java:179)
	... 20 more
Caused by: io.netty.channel.AbstractChannel$AnnotatedConnectException: Connection refused: localhost/0:0:0:0:0:0:0:1:1234
Caused by: java.net.ConnectException: Connection refused
	at java.base/sun.nio.ch.SocketChannelImpl.checkConnect(Native Method)
	at java.base/sun.nio.ch.SocketChannelImpl.finishConnect(SocketChannelImpl.java:777)
	at io.netty.channel.socket.nio.NioSocketChannel.doFinishConnect(NioSocketChannel.java:330)
	at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.finishConnect(AbstractNioChannel.java:334)
	at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:707)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:655)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:581)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:493)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>

