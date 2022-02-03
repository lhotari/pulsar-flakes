        
Flaky-test: org.apache.pulsar.broker.service.ReplicatorSubscriptionTest.testGetReplicatedSubscriptionStatus
Number of failures: 5

org.apache.pulsar.broker.service.ReplicatorSubscriptionTest is flaky. The testGetReplicatedSubscriptionStatus test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException: HTTP 500 Internal Server Error
	at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:223)
	at org.apache.pulsar.client.admin.internal.BaseResource$1.failed(BaseResource.java:134)
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
[example failure 2022-02-02T13:41:08.0585576Z](https://github.com/apache/pulsar/runs/5036755113?check_suite_focus=true?check_suite_focus=true#step:9:3750)  
[example failure 2022-01-29T18:13:41.5803629Z](https://github.com/apache/pulsar/runs/4992450750?check_suite_focus=true?check_suite_focus=true#step:9:312)  
[example failure 2022-01-29T02:04:48.3329717Z](https://github.com/apache/pulsar/runs/4988528750?check_suite_focus=true?check_suite_focus=true#step:9:312)  
[example failure 2022-01-28T14:07:44.3111438Z](https://github.com/apache/pulsar/runs/4981115916?check_suite_focus=true?check_suite_focus=true#step:9:2209)  
[example failure 2022-01-28T12:31:40.1702236Z](https://github.com/apache/pulsar/runs/4980324517?check_suite_focus=true?check_suite_focus=true#step:9:312)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException: HTTP 500 Internal Server Error
	at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:223)
	at org.apache.pulsar.client.admin.internal.BaseResource$1.failed(BaseResource.java:134)
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
	at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
	at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
	at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
	at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:722)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:658)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:584)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:496)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 Internal Server Error
	at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:960)
	at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
	... 54 more

</pre></code>
</details>

