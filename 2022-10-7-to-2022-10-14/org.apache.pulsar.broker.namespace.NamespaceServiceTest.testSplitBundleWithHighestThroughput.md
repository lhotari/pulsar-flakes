        
Flaky-test: org.apache.pulsar.broker.namespace.NamespaceServiceTest.testSplitBundleWithHighestThroughput
Number of failures: 2

org.apache.pulsar.broker.namespace.NamespaceServiceTest is flaky. The testSplitBundleWithHighestThroughput test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: Cannot invoke "org.apache.pulsar.common.naming.NamespaceBundle.getBundleRange()" because the return value of "org.apache.pulsar.broker.admin.impl.NamespacesBase.findHotBundle(org.apache.pulsar.common.naming.NamespaceName)" is null

Stacktrace:

java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.common.naming.NamespaceBundle.getBundleRange()" because the return value of "org.apache.pulsar.broker.admin.impl.NamespacesBase.findHotBundle(org.apache.pulsar.common.naming.NamespaceName)" is null
	at org.apache.pulsar.broker.admin.impl.NamespacesBase.getBundleRange(NamespacesBase.java:1222)
	at org.apache.pulsar.broker.admin.impl.NamespacesBase.lambda$internalSplitNamespaceBundleAsync$119(NamespacesBase.java:1160)
	at java.base/java.util.concurrent.CompletableFuture.uniComposeStage(CompletableFuture.java:1187)
	at java.base/java.util.concurrent.CompletableFuture.thenCompose(CompletableFuture.java:2309)
	at org.apache.pulsar.broker.admin.impl.NamespacesBase.internalSplitNamespaceBundleAsync(NamespacesBase.java:1159)
	at org.apache.pulsar.broker.admin.v1.Namespaces.splitNamespaceBundle(Namespaces.java:909)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-08-31T22:07:34.2930845Z](https://github.com/apache/pulsar/runs/8123741914?check_suite_focus=true#step:10:611)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: Cannot invoke "org.apache.pulsar.common.naming.NamespaceBundle.getBundleRange()" because the return value of "org.apache.pulsar.broker.admin.impl.NamespacesBase.findHotBundle(org.apache.pulsar.common.naming.NamespaceName)" is null

Stacktrace:

java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.common.naming.NamespaceBundle.getBundleRange()" because the return value of "org.apache.pulsar.broker.admin.impl.NamespacesBase.findHotBundle(org.apache.pulsar.common.naming.NamespaceName)" is null
	at org.apache.pulsar.broker.admin.impl.NamespacesBase.getBundleRange(NamespacesBase.java:1222)
	at org.apache.pulsar.broker.admin.impl.NamespacesBase.lambda$internalSplitNamespaceBundleAsync$119(NamespacesBase.java:1160)
	at java.base/java.util.concurrent.CompletableFuture.uniComposeStage(CompletableFuture.java:1187)
	at java.base/java.util.concurrent.CompletableFuture.thenCompose(CompletableFuture.java:2309)
	at org.apache.pulsar.broker.admin.impl.NamespacesBase.internalSplitNamespaceBundleAsync(NamespacesBase.java:1159)
	at org.apache.pulsar.broker.admin.v1.Namespaces.splitNamespaceBundle(Namespaces.java:909)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.glassfish.jersey.server.model.internal.ResourceMethodInvocationHandlerFactory.lambda$static$0(ResourceMethodInvocationHandlerFactory.java:52)
	at org.glassfish.jersey.server.model.internal.AbstractJavaResourceMethodDispatcher$1.run(AbstractJavaResourceMethodDispatcher.java:124)
	at org.glassfish.jersey.server.model.internal.AbstractJavaResourceMethodDispatcher.invoke(AbstractJavaResourceMethodDispatcher.java:167)
	at org.glassfish.jersey.server.model.internal.JavaResourceMethodDispatcherProvider$VoidOutInvoker.doDispatch(JavaResourceMethodDispatcherProvider.java:159)
	at org.glassfish.jersey.server.model.internal.AbstractJavaResourceMethodDispatcher.dispatch(AbstractJavaResourceMethodDispatcher.java:79)
	at org.glassfish.jersey.server.model.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:475)
	at org.glassfish.jersey.server.model.ResourceMethodInvoker.apply(ResourceMethodInvoker.java:397)
	at org.glassfish.jersey.server.model.ResourceMethodInvoker.apply(ResourceMethodInvoker.java:81)
	at org.glassfish.jersey.server.ServerRuntime$1.run(ServerRuntime.java:255)
	at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
	at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
	at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
	at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
	at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
	at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:265)
	at org.glassfish.jersey.server.ServerRuntime.process(ServerRuntime.java:234)
	at org.glassfish.jersey.server.ApplicationHandler.handle(ApplicationHandler.java:680)
	at org.glassfish.jersey.servlet.WebComponent.serviceImpl(WebComponent.java:394)
	at org.glassfish.jersey.servlet.WebComponent.service(WebComponent.java:346)
	at org.glassfish.jersey.servlet.ServletContainer.service(ServletContainer.java:366)
	at org.glassfish.jersey.servlet.ServletContainer.service(ServletContainer.java:319)
	at org.glassfish.jersey.servlet.ServletContainer.service(ServletContainer.java:205)
	at org.eclipse.jetty.servlet.ServletHolder.handle(ServletHolder.java:799)
	at org.eclipse.jetty.servlet.ServletHandler$ChainEnd.doFilter(ServletHandler.java:1656)
	at org.apache.pulsar.broker.web.ResponseHandlerFilter.doFilter(ResponseHandlerFilter.java:67)
	at org.eclipse.jetty.servlet.FilterHolder.doFilter(FilterHolder.java:193)
	at org.eclipse.jetty.servlet.ServletHandler$Chain.doFilter(ServletHandler.java:1626)
	at org.eclipse.jetty.servlets.QoSFilter.doFilter(QoSFilter.java:202)
	at org.eclipse.jetty.servlet.FilterHolder.doFilter(FilterHolder.java:193)
	at org.eclipse.jetty.servlet.ServletHandler$Chain.doFilter(ServletHandler.java:1626)
	at org.eclipse.jetty.servlet.ServletHandler.doHandle(ServletHandler.java:552)
	at org.eclipse.jetty.server.handler.ScopedHandler.nextHandle(ScopedHandler.java:233)
	at org.eclipse.jetty.server.session.SessionHandler.doHandle(SessionHandler.java:1624)
	at org.eclipse.jetty.server.handler.ScopedHandler.nextHandle(ScopedHandler.java:233)
	at org.eclipse.jetty.server.handler.ContextHandler.doHandle(ContextHandler.java:1440)
	at org.eclipse.jetty.server.handler.ScopedHandler.nextScope(ScopedHandler.java:188)
	at org.eclipse.jetty.servlet.ServletHandler.doScope(ServletHandler.java:505)
	at org.eclipse.jetty.server.session.SessionHandler.doScope(SessionHandler.java:1594)
	at org.eclipse.jetty.server.handler.ScopedHandler.nextScope(ScopedHandler.java:186)
	at org.eclipse.jetty.server.handler.ContextHandler.doScope(ContextHandler.java:1355)
	at org.eclipse.jetty.server.handler.ScopedHandler.handle(ScopedHandler.java:141)
	at org.eclipse.jetty.server.handler.ContextHandlerCollection.handle(ContextHandlerCollection.java:234)
	at org.eclipse.jetty.server.handler.HandlerCollection.handle(HandlerCollection.java:146)
	at org.eclipse.jetty.server.handler.StatisticsHandler.handle(StatisticsHandler.java:181)
	at org.eclipse.jetty.server.handler.HandlerWrapper.handle(HandlerWrapper.java:127)
	at org.eclipse.jetty.server.Server.handle(Server.java:516)
	at org.eclipse.jetty.server.HttpChannel.lambda$handle$1(HttpChannel.java:487)
	at org.eclipse.jetty.server.HttpChannel.dispatch(HttpChannel.java:732)
	at org.eclipse.jetty.server.HttpChannel.handle(HttpChannel.java:479)
	at org.eclipse.jetty.server.HttpConnection.onFillable(HttpConnection.java:277)
	at org.eclipse.jetty.io.AbstractConnection$ReadCallback.succeeded(AbstractConnection.java:311)
	at org.eclipse.jetty.io.FillInterest.fillable(FillInterest.java:105)
	at org.eclipse.jetty.io.ChannelEndPoint$1.run(ChannelEndPoint.java:104)
	at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.runTask(EatWhatYouKill.java:338)
	at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.doProduce(EatWhatYouKill.java:315)
	at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.tryProduce(EatWhatYouKill.java:173)
	at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.run(EatWhatYouKill.java:131)
	at org.eclipse.jetty.util.thread.ReservedThreadExecutor$ReservedThread.run(ReservedThreadExecutor.java:409)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:316)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.splitNamespaceBundle(NamespacesImpl.java:840)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.splitNamespaceBundle(NamespacesImpl.java:827)
	at org.apache.pulsar.broker.namespace.NamespaceServiceTest.testSplitBundleWithHighestThroughput(NamespaceServiceTest.java:652)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: Cannot invoke "org.apache.pulsar.common.naming.NamespaceBundle.getBundleRange()" because the return value of "org.apache.pulsar.broker.admin.impl.NamespacesBase.findHotBundle(org.apache.pulsar.common.naming.NamespaceName)" is null

Stacktrace:

java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.common.naming.NamespaceBundle.getBundleRange()" because the return value of "org.apache.pulsar.broker.admin.impl.NamespacesBase.findHotBundle(org.apache.pulsar.common.naming.NamespaceName)" is null
	at org.apache.pulsar.broker.admin.impl.NamespacesBase.getBundleRange(NamespacesBase.java:1222)
	at org.apache.pulsar.broker.admin.impl.NamespacesBase.lambda$internalSplitNamespaceBundleAsync$119(NamespacesBase.java:1160)
	at java.base/java.util.concurrent.CompletableFuture.uniComposeStage(CompletableFuture.java:1187)
	at java.base/java.util.concurrent.CompletableFuture.thenCompose(CompletableFuture.java:2309)
	at org.apache.pulsar.broker.admin.impl.NamespacesBase.internalSplitNamespaceBundleAsync(NamespacesBase.java:1159)
	at org.apache.pulsar.broker.admin.v1.Namespaces.splitNamespaceBundle(Namespaces.java:909)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.glassfish.jersey.server.model.internal.ResourceMethodInvocationHandlerFactory.lambda$static$0(ResourceMethodInvocationHandlerFactory.java:52)
	at org.glassfish.jersey.server.model.internal.AbstractJavaResourceMethodDispatcher$1.run(AbstractJavaResourceMethodDispatcher.java:124)
	at org.glassfish.jersey.server.model.internal.AbstractJavaResourceMethodDispatcher.invoke(AbstractJavaResourceMethodDispatcher.java:167)
	at org.glassfish.jersey.server.model.internal.JavaResourceMethodDispatcherProvider$VoidOutInvoker.doDispatch(JavaResourceMethodDispatcherProvider.java:159)
	at org.glassfish.jersey.server.model.internal.AbstractJavaResourceMethodDispatcher.dispatch(AbstractJavaResourceMethodDispatcher.java:79)
	at org.glassfish.jersey.server.model.ResourceMethodInvoker.invoke(ResourceMethodInvoker.java:475)
	at org.glassfish.jersey.server.model.ResourceMethodInvoker.apply(ResourceMethodInvoker.java:397)
	at org.glassfish.jersey.server.model.ResourceMethodInvoker.apply(ResourceMethodInvoker.java:81)
	at org.glassfish.jersey.server.ServerRuntime$1.run(ServerRuntime.java:255)
	at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
	at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
	at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
	at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
	at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
	at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:265)
	at org.glassfish.jersey.server.ServerRuntime.process(ServerRuntime.java:234)
	at org.glassfish.jersey.server.ApplicationHandler.handle(ApplicationHandler.java:680)
	at org.glassfish.jersey.servlet.WebComponent.serviceImpl(WebComponent.java:394)
	at org.glassfish.jersey.servlet.WebComponent.service(WebComponent.java:346)
	at org.glassfish.jersey.servlet.ServletContainer.service(ServletContainer.java:366)
	at org.glassfish.jersey.servlet.ServletContainer.service(ServletContainer.java:319)
	at org.glassfish.jersey.servlet.ServletContainer.service(ServletContainer.java:205)
	at org.eclipse.jetty.servlet.ServletHolder.handle(ServletHolder.java:799)
	at org.eclipse.jetty.servlet.ServletHandler$ChainEnd.doFilter(ServletHandler.java:1656)
	at org.apache.pulsar.broker.web.ResponseHandlerFilter.doFilter(ResponseHandlerFilter.java:67)
	at org.eclipse.jetty.servlet.FilterHolder.doFilter(FilterHolder.java:193)
	at org.eclipse.jetty.servlet.ServletHandler$Chain.doFilter(ServletHandler.java:1626)
	at org.eclipse.jetty.servlets.QoSFilter.doFilter(QoSFilter.java:202)
	at org.eclipse.jetty.servlet.FilterHolder.doFilter(FilterHolder.java:193)
	at org.eclipse.jetty.servlet.ServletHandler$Chain.doFilter(ServletHandler.java:1626)
	at org.eclipse.jetty.servlet.ServletHandler.doHandle(ServletHandler.java:552)
	at org.eclipse.jetty.server.handler.ScopedHandler.nextHandle(ScopedHandler.java:233)
	at org.eclipse.jetty.server.session.SessionHandler.doHandle(SessionHandler.java:1624)
	at org.eclipse.jetty.server.handler.ScopedHandler.nextHandle(ScopedHandler.java:233)
	at org.eclipse.jetty.server.handler.ContextHandler.doHandle(ContextHandler.java:1440)
	at org.eclipse.jetty.server.handler.ScopedHandler.nextScope(ScopedHandler.java:188)
	at org.eclipse.jetty.servlet.ServletHandler.doScope(ServletHandler.java:505)
	at org.eclipse.jetty.server.session.SessionHandler.doScope(SessionHandler.java:1594)
	at org.eclipse.jetty.server.handler.ScopedHandler.nextScope(ScopedHandler.java:186)
	at org.eclipse.jetty.server.handler.ContextHandler.doScope(ContextHandler.java:1355)
	at org.eclipse.jetty.server.handler.ScopedHandler.handle(ScopedHandler.java:141)
	at org.eclipse.jetty.server.handler.ContextHandlerCollection.handle(ContextHandlerCollection.java:234)
	at org.eclipse.jetty.server.handler.HandlerCollection.handle(HandlerCollection.java:146)
	at org.eclipse.jetty.server.handler.StatisticsHandler.handle(StatisticsHandler.java:181)
	at org.eclipse.jetty.server.handler.HandlerWrapper.handle(HandlerWrapper.java:127)
	at org.eclipse.jetty.server.Server.handle(Server.java:516)
	at org.eclipse.jetty.server.HttpChannel.lambda$handle$1(HttpChannel.java:487)
	at org.eclipse.jetty.server.HttpChannel.dispatch(HttpChannel.java:732)
	at org.eclipse.jetty.server.HttpChannel.handle(HttpChannel.java:479)
	at org.eclipse.jetty.server.HttpConnection.onFillable(HttpConnection.java:277)
	at org.eclipse.jetty.io.AbstractConnection$ReadCallback.succeeded(AbstractConnection.java:311)
	at org.eclipse.jetty.io.FillInterest.fillable(FillInterest.java:105)
	at org.eclipse.jetty.io.ChannelEndPoint$1.run(ChannelEndPoint.java:104)
	at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.runTask(EatWhatYouKill.java:338)
	at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.doProduce(EatWhatYouKill.java:315)
	at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.tryProduce(EatWhatYouKill.java:173)
	at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.run(EatWhatYouKill.java:131)
	at org.eclipse.jetty.util.thread.ReservedThreadExecutor$ReservedThread.run(ReservedThreadExecutor.java:409)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:237)
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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:246)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:288)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
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
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:995)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 Cannot invoke "org.apache.pulsar.common.naming.NamespaceBundle.getBundleRange()" because the return value of "org.apache.pulsar.broker.admin.impl.NamespacesBase.findHotBundle(org.apache.pulsar.common.naming.NamespaceName)" is null
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:960)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 Cannot invoke "org.apache.pulsar.common.naming.NamespaceBundle.getBundleRange()" because the return value of "org.apache.pulsar.broker.admin.impl.NamespacesBase.findHotBundle(org.apache.pulsar.common.naming.NamespaceName)" is null]

</pre></code>
</details>

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a org.apache.pulsar.broker.namespace.NamespaceServiceTest expected [10] but found [0] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.namespace.NamespaceServiceTest.testSplitBundleWithHighestThroughput(NamespaceServiceTest.java:658)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-09-06T00:20:15.0158785Z](https://github.com/apache/pulsar/runs/8197602800?check_suite_focus=true#step:10:609)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a org.apache.pulsar.broker.namespace.NamespaceServiceTest expected [10] but found [0] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.namespace.NamespaceServiceTest.testSplitBundleWithHighestThroughput(NamespaceServiceTest.java:658)
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
Caused by: java.lang.AssertionError: expected [10] but found [0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.broker.namespace.NamespaceServiceTest.lambda$testSplitBundleWithHighestThroughput$8(NamespaceServiceTest.java:661)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	... 4 more

</pre></code>
</details>

