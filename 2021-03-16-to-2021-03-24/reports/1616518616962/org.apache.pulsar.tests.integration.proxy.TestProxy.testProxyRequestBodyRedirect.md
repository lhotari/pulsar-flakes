        
Flaky-test: org.apache.pulsar.tests.integration.proxy.TestProxy.testProxyRequestBodyRedirect
Number of failures: 9

org.apache.pulsar.tests.integration.proxy.TestProxy is flaky. The testProxyRequestBodyRedirect test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException: HTTP 502 Bad Gateway
	at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:205)
	at org.apache.pulsar.client.admin.internal.BaseResource$1.failed(BaseResource.java:129)
	at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:839)
	at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:820)
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
[example failure 2021-03-19T22:37:48.9565664Z](https://github.com/apache/pulsar/runs/2152312710?check_suite_focus=true#step:13:17205)
[example failure 2021-03-19T21:21:19.0485355Z](https://github.com/apache/pulsar/runs/2151799434?check_suite_focus=true#step:13:17266)
[example failure 2021-03-19T20:18:22.0945242Z](https://github.com/apache/pulsar/runs/2151018571?check_suite_focus=true#step:13:17222)
[example failure 2021-03-19T19:49:37.5671977Z](https://github.com/apache/pulsar/runs/2150562838?check_suite_focus=true#step:13:16663)
[example failure 2021-03-19T17:52:17.4688488Z](https://github.com/apache/pulsar/runs/2150255048?check_suite_focus=true#step:13:16815)
[example failure 2021-03-19T10:51:52.5953834Z](https://github.com/apache/pulsar/runs/2146721820?check_suite_focus=true#step:13:16809)
[example failure 2021-03-18T12:42:44.9043623Z](https://github.com/apache/pulsar/runs/2138106534?check_suite_focus=true#step:13:16658)
[example failure 2021-03-17T23:25:26.9383686Z](https://github.com/apache/pulsar/runs/2134973537?check_suite_focus=true#step:13:16919)
[example failure 2021-03-17T06:26:52.3046342Z](https://github.com/apache/pulsar/runs/2127869168?check_suite_focus=true#step:13:17056)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException: HTTP 502 Bad Gateway
	at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:205)
	at org.apache.pulsar.client.admin.internal.BaseResource$1.failed(BaseResource.java:129)
	at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:839)
	at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:820)
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
	at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:210)
	at java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:774)
	at java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:750)
	at java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:488)
	at java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:1975)
	at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$3(AsyncHttpConnector.java:251)
	at java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:774)
	at java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:750)
	at java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:488)
	at java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:1975)
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
	at io.netty.handler.codec.ByteToMessageDecoder.channelInputClosed(ByteToMessageDecoder.java:383)
	at io.netty.handler.codec.ByteToMessageDecoder.channelInactive(ByteToMessageDecoder.java:354)
	at io.netty.handler.codec.http.HttpClientCodec$Decoder.channelInactive(HttpClientCodec.java:311)
	at io.netty.channel.CombinedChannelDuplexHandler.channelInactive(CombinedChannelDuplexHandler.java:221)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelInactive(AbstractChannelHandlerContext.java:262)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelInactive(AbstractChannelHandlerContext.java:248)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelInactive(AbstractChannelHandlerContext.java:241)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelInactive(DefaultChannelPipeline.java:1405)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelInactive(AbstractChannelHandlerContext.java:262)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelInactive(AbstractChannelHandlerContext.java:248)
	at io.netty.channel.DefaultChannelPipeline.fireChannelInactive(DefaultChannelPipeline.java:901)
	at io.netty.channel.AbstractChannel$AbstractUnsafe$8.run(AbstractChannel.java:818)
	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:472)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:497)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:989)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.lang.Thread.run(Thread.java:748)
Caused by: javax.ws.rs.ServerErrorException: HTTP 502 Bad Gateway
	at org.glassfish.jersey.client.JerseyInvocation.createExceptionForFamily(JerseyInvocation.java:941)
	at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:921)
	at org.glassfish.jersey.client.JerseyInvocation.access$500(JerseyInvocation.java:77)
	... 55 more

</pre></code>
</details>

