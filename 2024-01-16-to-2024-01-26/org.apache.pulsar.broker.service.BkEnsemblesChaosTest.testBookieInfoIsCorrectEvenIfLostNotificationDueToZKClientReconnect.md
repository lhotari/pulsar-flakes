        
Flaky-test: org.apache.pulsar.broker.service.BkEnsemblesChaosTest.testBookieInfoIsCorrectEvenIfLostNotificationDueToZKClientReconnect
Number of failures: 1

org.apache.pulsar.broker.service.BkEnsemblesChaosTest is flaky. The testBookieInfoIsCorrectEvenIfLostNotificationDueToZKClientReconnect test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException: Not enough non-faulty bookies available error code: -6

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException: Not enough non-faulty bookies available error code: -6
	at org.apache.pulsar.broker.service.BrokerService$2.openLedgerFailed(BrokerService.java:1719)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerFactoryImpl.lambda$asyncOpen$8(ManagedLedgerFactoryImpl.java:428)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-01-18T19:18:06.8449161Z](https://github.com/apache/pulsar/actions/runs/7574624877/job/20629743546#step:11:988)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException: Not enough non-faulty bookies available error code: -6

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException: Not enough non-faulty bookies available error code: -6
	at org.apache.pulsar.broker.service.BrokerService$2.openLedgerFailed(BrokerService.java:1719)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerFactoryImpl.lambda$asyncOpen$8(ManagedLedgerFactoryImpl.java:428)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerFactoryImpl$2.initializeFailed(ManagedLedgerFactoryImpl.java:423)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$initializeBookKeeper$0(ManagedLedgerImpl.java:526)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:107)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException: Not enough non-faulty bookies available error code: -6

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.unload(TopicsImpl.java:496)
	at org.apache.pulsar.broker.service.BkEnsemblesChaosTest.testBookieInfoIsCorrectEvenIfLostNotificationDueToZKClientReconnect(BkEnsemblesChaosTest.java:67)
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
	at java.base/java.lang.Thread.run(Thread.java:840)
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException: Not enough non-faulty bookies available error code: -6

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException: Not enough non-faulty bookies available error code: -6
	at org.apache.pulsar.broker.service.BrokerService$2.openLedgerFailed(BrokerService.java:1719)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerFactoryImpl.lambda$asyncOpen$8(ManagedLedgerFactoryImpl.java:428)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerFactoryImpl$2.initializeFailed(ManagedLedgerFactoryImpl.java:423)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$initializeBookKeeper$0(ManagedLedgerImpl.java:526)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:107)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException: Not enough non-faulty bookies available error code: -6

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:272)
		at org.apache.pulsar.client.admin.internal.BaseResource$1.failed(BaseResource.java:136)
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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:254)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:296)
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
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
		at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:346)
		at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:318)
		at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:442)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:440)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:788)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:724)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:650)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.bookkeeper.mledger.ManagedLedgerException: Not enough non-faulty bookies available error code: -6\n\nStacktrace:\n\norg.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException: Not enough non-faulty bookies available error code: -6\n\tat org.apache.pulsar.broker.service.BrokerService$2.openLedgerFailed(BrokerService.java:1719)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerFactoryImpl.lambda$asyncOpen$8(ManagedLedgerFactoryImpl.java:428)\n\tat java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)\n\tat java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerFactoryImpl$2.initializeFailed(ManagedLedgerFactoryImpl.java:423)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$initializeBookKeeper$0(ManagedLedgerImpl.java:526)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:107)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.bookkeeper.mledger.ManagedLedgerException: Not enough non-faulty bookies available error code: -6\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:960)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.bookkeeper.mledger.ManagedLedgerException: Not enough non-faulty bookies available error code: -6\n\nStacktrace:\n\norg.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException: Not enough non-faulty bookies available error code: -6\n\tat org.apache.pulsar.broker.service.BrokerService$2.openLedgerFailed(BrokerService.java:1719)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerFactoryImpl.lambda$asyncOpen$8(ManagedLedgerFactoryImpl.java:428)\n\tat java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)\n\tat java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerFactoryImpl$2.initializeFailed(ManagedLedgerFactoryImpl.java:423)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$initializeBookKeeper$0(ManagedLedgerImpl.java:526)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:107)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.bookkeeper.mledger.ManagedLedgerException: Not enough non-faulty bookies available error code: -6\n"}]

</pre></code>
</details>

