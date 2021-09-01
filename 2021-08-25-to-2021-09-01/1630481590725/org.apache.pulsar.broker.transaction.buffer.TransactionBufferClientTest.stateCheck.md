        
Flaky-test: org.apache.pulsar.broker.transaction.buffer.TransactionBufferClientTest.stateCheck
Number of failures: 9

org.apache.pulsar.broker.transaction.buffer.TransactionBufferClientTest is flaky. The stateCheck test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException$ConflictException: Cluster already exists
	at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:234)
	at org.apache.pulsar.client.admin.internal.BaseResource$1.failed(BaseResource.java:130)
	at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
	at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:863)
	at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:229)
	at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
	at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:173)
	at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
	at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
	at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
	at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
	at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
	at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
	at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:173)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T23:21:40.3838594Z](https://github.com/apache/pulsar/runs/3467152431?check_suite_focus=true#step:9:3460)
[example failure 2021-08-30T23:21:40.3443598Z](https://github.com/apache/pulsar/runs/3467152431?check_suite_focus=true#step:9:3355)
[example failure 2021-08-30T23:21:40.2915178Z](https://github.com/apache/pulsar/runs/3467152431?check_suite_focus=true#step:9:3290)
[example failure 2021-08-30T23:21:40.2587873Z](https://github.com/apache/pulsar/runs/3467152431?check_suite_focus=true#step:9:3225)
[example failure 2021-08-30T23:21:40.2308512Z](https://github.com/apache/pulsar/runs/3467152431?check_suite_focus=true#step:9:3160)
[example failure 2021-08-30T23:21:40.2032642Z](https://github.com/apache/pulsar/runs/3467152431?check_suite_focus=true#step:9:3095)
[example failure 2021-08-30T23:21:40.1654218Z](https://github.com/apache/pulsar/runs/3467152431?check_suite_focus=true#step:9:3030)
[example failure 2021-08-30T23:21:40.1318043Z](https://github.com/apache/pulsar/runs/3467152431?check_suite_focus=true#step:9:2965)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ConflictException: Cluster already exists
	at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:234)
	at org.apache.pulsar.client.admin.internal.BaseResource$1.failed(BaseResource.java:130)
	at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
	at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:863)
	at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:229)
	at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
	at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:173)
	at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
	at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
	at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
	at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
	at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
	at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
	at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:173)
	at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:228)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2073)
	at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:270)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2073)
	at org.asynchttpclient.netty.NettyResponseFuture.loadContent(NettyResponseFuture.java:222)
	at org.asynchttpclient.netty.NettyResponseFuture.done(NettyResponseFuture.java:257)
	at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.finishUpdate(AsyncHttpClientHandler.java:241)
	at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:114)
	at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:143)
	at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
	at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
	at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
	at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:324)
	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:296)
	at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
	at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
	at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:719)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:655)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:581)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:493)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: javax.ws.rs.ClientErrorException: HTTP 409 Conflict
	at org.glassfish.jersey.client.JerseyInvocation.createExceptionForFamily(JerseyInvocation.java:985)
	at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:967)
	at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
	... 54 more

</pre></code>
</details>

[example failure 2021-08-30T23:21:40.3772480Z](https://github.com/apache/pulsar/runs/3467152431?check_suite_focus=true#step:9:3420)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ConflictException: Cluster already exists
	at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:234)
	at org.apache.pulsar.client.admin.internal.BaseResource$1.failed(BaseResource.java:130)
	at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
	at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:863)
	at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:229)
	at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
	at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:173)
	at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
	at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
	at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
	at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
	at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
	at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
	at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:173)
	at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:228)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenCompleteStage(CompletableFuture.java:883)
	at java.base/java.util.concurrent.CompletableFuture.whenComplete(CompletableFuture.java:2251)
	at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.apply(AsyncHttpConnector.java:202)
	at org.glassfish.jersey.client.ClientRuntime.lambda$null$6(ClientRuntime.java:182)
	at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
	at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
	at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
	at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
	at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
	at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
	at org.glassfish.jersey.client.ClientRuntime.lambda$createRunnableForAsyncProcessing$7(ClientRuntime.java:156)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: javax.ws.rs.ClientErrorException: HTTP 409 Conflict
	at org.glassfish.jersey.client.JerseyInvocation.createExceptionForFamily(JerseyInvocation.java:985)
	at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:967)
	at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
	... 29 more

</pre></code>
</details>

