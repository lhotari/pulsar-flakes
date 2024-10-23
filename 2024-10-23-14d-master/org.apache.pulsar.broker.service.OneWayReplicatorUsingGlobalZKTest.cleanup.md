        
Flaky-test: org.apache.pulsar.broker.service.OneWayReplicatorUsingGlobalZKTest.cleanup
Number of failures: 9

org.apache.pulsar.broker.service.OneWayReplicatorUsingGlobalZKTest is flaky. The cleanup test method fails sporadically.

```
org.testng.internal.invokers.InvokeMethodRunnable$TestNGRuntimeException:
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-ce9bc1c7-bb07-44d0-ba1a-09e9458561b1-partition-1/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-ce9bc1c7-bb07-44d0-ba1a-09e9458561b1-partition-1/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-10-21T06:31:56.0079648Z](https://github.com/apache/pulsar/actions/runs/11434164248/job/31807272307#step:9:2316)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.invokers.InvokeMethodRunnable$TestNGRuntimeException:
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-ce9bc1c7-bb07-44d0-ba1a-09e9458561b1-partition-1/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-ce9bc1c7-bb07-44d0-ba1a-09e9458561b1-partition-1/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:107)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-ce9bc1c7-bb07-44d0-ba1a-09e9458561b1-partition-1/pulsar.repl.r2

	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:56)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-ce9bc1c7-bb07-44d0-ba1a-09e9458561b1-partition-1/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-ce9bc1c7-bb07-44d0-ba1a-09e9458561b1-partition-1/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:107)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-ce9bc1c7-bb07-44d0-ba1a-09e9458561b1-partition-1/pulsar.repl.r2

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:230)
	at org.apache.pulsar.broker.service.OneWayReplicatorTestBase.cleanupPulsarResources(OneWayReplicatorTestBase.java:291)
	at org.apache.pulsar.broker.service.OneWayReplicatorTestBase.cleanup(OneWayReplicatorTestBase.java:302)
	at org.apache.pulsar.broker.service.OneWayReplicatorTest.cleanup(OneWayReplicatorTest.java:119)
	at org.apache.pulsar.broker.service.OneWayReplicatorUsingGlobalZKTest.cleanup(OneWayReplicatorUsingGlobalZKTest.java:60)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	... 6 more
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-ce9bc1c7-bb07-44d0-ba1a-09e9458561b1-partition-1/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-ce9bc1c7-bb07-44d0-ba1a-09e9458561b1-partition-1/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:107)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-ce9bc1c7-bb07-44d0-ba1a-09e9458561b1-partition-1/pulsar.repl.r2

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:272)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:898)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:879)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:232)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:176)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:176)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:275)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:331)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2512)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:400)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
		at com.spotify.futures.ConcurrencyReducer.lambda$invoke$0(ConcurrencyReducer.java:173)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
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
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1357)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:440)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:868)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:788)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:724)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:650)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-ce9bc1c7-bb07-44d0-ba1a-09e9458561b1-partition-1/pulsar.repl.r2\n\nStacktrace:\n\norg.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-ce9bc1c7-bb07-44d0-ba1a-09e9458561b1-partition-1/pulsar.repl.r2\n\tat org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)\n\tat java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)\n\tat java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)\n\tat org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:107)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-ce9bc1c7-bb07-44d0-ba1a-09e9458561b1-partition-1/pulsar.repl.r2\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-ce9bc1c7-bb07-44d0-ba1a-09e9458561b1-partition-1/pulsar.repl.r2\n\nStacktrace:\n\norg.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-ce9bc1c7-bb07-44d0-ba1a-09e9458561b1-partition-1/pulsar.repl.r2\n\tat org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)\n\tat java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)\n\tat java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)\n\tat org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:107)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-ce9bc1c7-bb07-44d0-ba1a-09e9458561b1-partition-1/pulsar.repl.r2\n"}]

</pre></code>
</details>

```
org.testng.internal.invokers.InvokeMethodRunnable$TestNGRuntimeException:
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-18e13e24-d398-4bfe-bab4-6140820df65c-partition-1/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-18e13e24-d398-4bfe-bab4-6140820df65c-partition-1/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-10-20T12:38:06.2098946Z](https://github.com/apache/pulsar/actions/runs/11426178041/job/31788795242#step:9:2316)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.invokers.InvokeMethodRunnable$TestNGRuntimeException:
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-18e13e24-d398-4bfe-bab4-6140820df65c-partition-1/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-18e13e24-d398-4bfe-bab4-6140820df65c-partition-1/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:107)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-18e13e24-d398-4bfe-bab4-6140820df65c-partition-1/pulsar.repl.r2

	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:56)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-18e13e24-d398-4bfe-bab4-6140820df65c-partition-1/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-18e13e24-d398-4bfe-bab4-6140820df65c-partition-1/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:107)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-18e13e24-d398-4bfe-bab4-6140820df65c-partition-1/pulsar.repl.r2

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:230)
	at org.apache.pulsar.broker.service.OneWayReplicatorTestBase.cleanupPulsarResources(OneWayReplicatorTestBase.java:291)
	at org.apache.pulsar.broker.service.OneWayReplicatorTestBase.cleanup(OneWayReplicatorTestBase.java:302)
	at org.apache.pulsar.broker.service.OneWayReplicatorTest.cleanup(OneWayReplicatorTest.java:119)
	at org.apache.pulsar.broker.service.OneWayReplicatorUsingGlobalZKTest.cleanup(OneWayReplicatorUsingGlobalZKTest.java:60)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	... 6 more
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-18e13e24-d398-4bfe-bab4-6140820df65c-partition-1/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-18e13e24-d398-4bfe-bab4-6140820df65c-partition-1/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:107)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-18e13e24-d398-4bfe-bab4-6140820df65c-partition-1/pulsar.repl.r2

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:272)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:898)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:879)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:232)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:176)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:176)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:275)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:331)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2480)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:400)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at com.spotify.futures.ConcurrencyReducer.lambda$invoke$0(ConcurrencyReducer.java:173)
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
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1357)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:440)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:868)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:788)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:724)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:650)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-18e13e24-d398-4bfe-bab4-6140820df65c-partition-1/pulsar.repl.r2\n\nStacktrace:\n\norg.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-18e13e24-d398-4bfe-bab4-6140820df65c-partition-1/pulsar.repl.r2\n\tat org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)\n\tat java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)\n\tat java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)\n\tat org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:107)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-18e13e24-d398-4bfe-bab4-6140820df65c-partition-1/pulsar.repl.r2\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-18e13e24-d398-4bfe-bab4-6140820df65c-partition-1/pulsar.repl.r2\n\nStacktrace:\n\norg.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-18e13e24-d398-4bfe-bab4-6140820df65c-partition-1/pulsar.repl.r2\n\tat org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)\n\tat java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)\n\tat java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)\n\tat org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:107)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-18e13e24-d398-4bfe-bab4-6140820df65c-partition-1/pulsar.repl.r2\n"}]

</pre></code>
</details>

```
org.testng.internal.invokers.InvokeMethodRunnable$TestNGRuntimeException:
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-675f9fe2-9e33-4cfd-a96a-1898a69c5bd7-partition-1/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-675f9fe2-9e33-4cfd-a96a-1898a69c5bd7-partition-1/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-10-14T06:24:01.5094902Z](https://github.com/apache/pulsar/actions/runs/11321832112/job/31481832316#step:11:1222)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.invokers.InvokeMethodRunnable$TestNGRuntimeException:
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-675f9fe2-9e33-4cfd-a96a-1898a69c5bd7-partition-1/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-675f9fe2-9e33-4cfd-a96a-1898a69c5bd7-partition-1/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-675f9fe2-9e33-4cfd-a96a-1898a69c5bd7-partition-1/pulsar.repl.r2

	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:56)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-675f9fe2-9e33-4cfd-a96a-1898a69c5bd7-partition-1/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-675f9fe2-9e33-4cfd-a96a-1898a69c5bd7-partition-1/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-675f9fe2-9e33-4cfd-a96a-1898a69c5bd7-partition-1/pulsar.repl.r2

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:230)
	at org.apache.pulsar.broker.service.OneWayReplicatorTestBase.cleanupPulsarResources(OneWayReplicatorTestBase.java:291)
	at org.apache.pulsar.broker.service.OneWayReplicatorTestBase.cleanup(OneWayReplicatorTestBase.java:302)
	at org.apache.pulsar.broker.service.OneWayReplicatorTest.cleanup(OneWayReplicatorTest.java:119)
	at org.apache.pulsar.broker.service.OneWayReplicatorUsingGlobalZKTest.cleanup(OneWayReplicatorUsingGlobalZKTest.java:60)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	... 6 more
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-675f9fe2-9e33-4cfd-a96a-1898a69c5bd7-partition-1/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-675f9fe2-9e33-4cfd-a96a-1898a69c5bd7-partition-1/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-675f9fe2-9e33-4cfd-a96a-1898a69c5bd7-partition-1/pulsar.repl.r2

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:272)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:898)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:879)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:232)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:176)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:176)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:275)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:331)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2480)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:400)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at com.spotify.futures.ConcurrencyReducer.lambda$invoke$0(ConcurrencyReducer.java:173)
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
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1357)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:440)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:868)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:788)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:724)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:650)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-675f9fe2-9e33-4cfd-a96a-1898a69c5bd7-partition-1/pulsar.repl.r2\n\nStacktrace:\n\norg.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-675f9fe2-9e33-4cfd-a96a-1898a69c5bd7-partition-1/pulsar.repl.r2\n\tat org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)\n\tat java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)\n\tat java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)\n\tat org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-675f9fe2-9e33-4cfd-a96a-1898a69c5bd7-partition-1/pulsar.repl.r2\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-675f9fe2-9e33-4cfd-a96a-1898a69c5bd7-partition-1/pulsar.repl.r2\n\nStacktrace:\n\norg.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-675f9fe2-9e33-4cfd-a96a-1898a69c5bd7-partition-1/pulsar.repl.r2\n\tat org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)\n\tat java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)\n\tat java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)\n\tat org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-675f9fe2-9e33-4cfd-a96a-1898a69c5bd7-partition-1/pulsar.repl.r2\n"}]

</pre></code>
</details>

```
org.testng.internal.invokers.InvokeMethodRunnable$TestNGRuntimeException:
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-291e8006-f516-4c2c-9766-f5c09dcace4e-partition-1/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-291e8006-f516-4c2c-9766-f5c09dcace4e-partition-1/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-10-15T06:23:39.6747599Z](https://github.com/apache/pulsar/actions/runs/11340166452/job/31536466360#step:11:1205)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.invokers.InvokeMethodRunnable$TestNGRuntimeException:
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-291e8006-f516-4c2c-9766-f5c09dcace4e-partition-1/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-291e8006-f516-4c2c-9766-f5c09dcace4e-partition-1/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-291e8006-f516-4c2c-9766-f5c09dcace4e-partition-1/pulsar.repl.r2

	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:56)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-291e8006-f516-4c2c-9766-f5c09dcace4e-partition-1/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-291e8006-f516-4c2c-9766-f5c09dcace4e-partition-1/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-291e8006-f516-4c2c-9766-f5c09dcace4e-partition-1/pulsar.repl.r2

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:230)
	at org.apache.pulsar.broker.service.OneWayReplicatorTestBase.cleanupPulsarResources(OneWayReplicatorTestBase.java:291)
	at org.apache.pulsar.broker.service.OneWayReplicatorTestBase.cleanup(OneWayReplicatorTestBase.java:302)
	at org.apache.pulsar.broker.service.OneWayReplicatorTest.cleanup(OneWayReplicatorTest.java:119)
	at org.apache.pulsar.broker.service.OneWayReplicatorUsingGlobalZKTest.cleanup(OneWayReplicatorUsingGlobalZKTest.java:60)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	... 6 more
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-291e8006-f516-4c2c-9766-f5c09dcace4e-partition-1/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-291e8006-f516-4c2c-9766-f5c09dcace4e-partition-1/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-291e8006-f516-4c2c-9766-f5c09dcace4e-partition-1/pulsar.repl.r2

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:272)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:898)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:879)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:232)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:176)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:176)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:275)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:331)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2480)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:400)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at com.spotify.futures.ConcurrencyReducer.lambda$invoke$0(ConcurrencyReducer.java:173)
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
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1357)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:440)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:868)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:788)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:724)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:650)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-291e8006-f516-4c2c-9766-f5c09dcace4e-partition-1/pulsar.repl.r2\n\nStacktrace:\n\norg.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-291e8006-f516-4c2c-9766-f5c09dcace4e-partition-1/pulsar.repl.r2\n\tat org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)\n\tat java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)\n\tat java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)\n\tat org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-291e8006-f516-4c2c-9766-f5c09dcace4e-partition-1/pulsar.repl.r2\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-291e8006-f516-4c2c-9766-f5c09dcace4e-partition-1/pulsar.repl.r2\n\nStacktrace:\n\norg.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-291e8006-f516-4c2c-9766-f5c09dcace4e-partition-1/pulsar.repl.r2\n\tat org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)\n\tat java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)\n\tat java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)\n\tat org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-291e8006-f516-4c2c-9766-f5c09dcace4e-partition-1/pulsar.repl.r2\n"}]

</pre></code>
</details>

```
org.testng.internal.invokers.InvokeMethodRunnable$TestNGRuntimeException:
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9deb2c50-cd45-4686-96a0-d3365b9ea561-partition-0/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9deb2c50-cd45-4686-96a0-d3365b9ea561-partition-0/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-10-15T12:36:21.8966575Z](https://github.com/apache/pulsar/actions/runs/11345743790/job/31553959107#step:11:1195)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.invokers.InvokeMethodRunnable$TestNGRuntimeException:
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9deb2c50-cd45-4686-96a0-d3365b9ea561-partition-0/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9deb2c50-cd45-4686-96a0-d3365b9ea561-partition-0/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9deb2c50-cd45-4686-96a0-d3365b9ea561-partition-0/pulsar.repl.r2

	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:56)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9deb2c50-cd45-4686-96a0-d3365b9ea561-partition-0/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9deb2c50-cd45-4686-96a0-d3365b9ea561-partition-0/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9deb2c50-cd45-4686-96a0-d3365b9ea561-partition-0/pulsar.repl.r2

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:230)
	at org.apache.pulsar.broker.service.OneWayReplicatorTestBase.cleanupPulsarResources(OneWayReplicatorTestBase.java:291)
	at org.apache.pulsar.broker.service.OneWayReplicatorTestBase.cleanup(OneWayReplicatorTestBase.java:302)
	at org.apache.pulsar.broker.service.OneWayReplicatorTest.cleanup(OneWayReplicatorTest.java:119)
	at org.apache.pulsar.broker.service.OneWayReplicatorUsingGlobalZKTest.cleanup(OneWayReplicatorUsingGlobalZKTest.java:60)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	... 6 more
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9deb2c50-cd45-4686-96a0-d3365b9ea561-partition-0/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9deb2c50-cd45-4686-96a0-d3365b9ea561-partition-0/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9deb2c50-cd45-4686-96a0-d3365b9ea561-partition-0/pulsar.repl.r2

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:272)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:898)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:879)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:232)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:176)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:176)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:275)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:331)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2512)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:400)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
		at com.spotify.futures.ConcurrencyReducer.lambda$invoke$0(ConcurrencyReducer.java:173)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
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
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1357)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:440)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:868)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:788)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:724)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:650)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9deb2c50-cd45-4686-96a0-d3365b9ea561-partition-0/pulsar.repl.r2\n\nStacktrace:\n\norg.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9deb2c50-cd45-4686-96a0-d3365b9ea561-partition-0/pulsar.repl.r2\n\tat org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)\n\tat java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)\n\tat java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)\n\tat org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9deb2c50-cd45-4686-96a0-d3365b9ea561-partition-0/pulsar.repl.r2\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9deb2c50-cd45-4686-96a0-d3365b9ea561-partition-0/pulsar.repl.r2\n\nStacktrace:\n\norg.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9deb2c50-cd45-4686-96a0-d3365b9ea561-partition-0/pulsar.repl.r2\n\tat org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)\n\tat java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)\n\tat java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)\n\tat org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9deb2c50-cd45-4686-96a0-d3365b9ea561-partition-0/pulsar.repl.r2\n"}]

</pre></code>
</details>

```
org.testng.internal.invokers.InvokeMethodRunnable$TestNGRuntimeException:
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-b9fa7687-702c-464d-a627-a89d9f1969e5-partition-0/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-b9fa7687-702c-464d-a627-a89d9f1969e5-partition-0/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-10-19T06:31:15.6497001Z](https://github.com/apache/pulsar/actions/runs/11415144383/job/31764870363#step:9:2316)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.invokers.InvokeMethodRunnable$TestNGRuntimeException:
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-b9fa7687-702c-464d-a627-a89d9f1969e5-partition-0/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-b9fa7687-702c-464d-a627-a89d9f1969e5-partition-0/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-b9fa7687-702c-464d-a627-a89d9f1969e5-partition-0/pulsar.repl.r2

	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:56)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-b9fa7687-702c-464d-a627-a89d9f1969e5-partition-0/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-b9fa7687-702c-464d-a627-a89d9f1969e5-partition-0/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-b9fa7687-702c-464d-a627-a89d9f1969e5-partition-0/pulsar.repl.r2

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:230)
	at org.apache.pulsar.broker.service.OneWayReplicatorTestBase.cleanupPulsarResources(OneWayReplicatorTestBase.java:291)
	at org.apache.pulsar.broker.service.OneWayReplicatorTestBase.cleanup(OneWayReplicatorTestBase.java:302)
	at org.apache.pulsar.broker.service.OneWayReplicatorTest.cleanup(OneWayReplicatorTest.java:119)
	at org.apache.pulsar.broker.service.OneWayReplicatorUsingGlobalZKTest.cleanup(OneWayReplicatorUsingGlobalZKTest.java:60)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	... 6 more
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-b9fa7687-702c-464d-a627-a89d9f1969e5-partition-0/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-b9fa7687-702c-464d-a627-a89d9f1969e5-partition-0/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-b9fa7687-702c-464d-a627-a89d9f1969e5-partition-0/pulsar.repl.r2

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:272)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:898)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:879)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:232)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:176)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:176)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:275)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:331)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2512)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:400)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
		at com.spotify.futures.ConcurrencyReducer.lambda$invoke$0(ConcurrencyReducer.java:173)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
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
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1357)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:440)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:868)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:788)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:724)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:650)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-b9fa7687-702c-464d-a627-a89d9f1969e5-partition-0/pulsar.repl.r2\n\nStacktrace:\n\norg.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-b9fa7687-702c-464d-a627-a89d9f1969e5-partition-0/pulsar.repl.r2\n\tat org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)\n\tat java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)\n\tat java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)\n\tat org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-b9fa7687-702c-464d-a627-a89d9f1969e5-partition-0/pulsar.repl.r2\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-b9fa7687-702c-464d-a627-a89d9f1969e5-partition-0/pulsar.repl.r2\n\nStacktrace:\n\norg.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-b9fa7687-702c-464d-a627-a89d9f1969e5-partition-0/pulsar.repl.r2\n\tat org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)\n\tat java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)\n\tat java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)\n\tat org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-b9fa7687-702c-464d-a627-a89d9f1969e5-partition-0/pulsar.repl.r2\n"}]

</pre></code>
</details>

```
org.testng.internal.invokers.InvokeMethodRunnable$TestNGRuntimeException:
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9b128196-6f9a-4c0d-af67-beb17feecba3-partition-1/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9b128196-6f9a-4c0d-af67-beb17feecba3-partition-1/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-10-22T12:38:57.6305091Z](https://github.com/apache/pulsar/actions/runs/11459870652/job/31885339434#step:9:2320)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.invokers.InvokeMethodRunnable$TestNGRuntimeException:
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9b128196-6f9a-4c0d-af67-beb17feecba3-partition-1/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9b128196-6f9a-4c0d-af67-beb17feecba3-partition-1/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9b128196-6f9a-4c0d-af67-beb17feecba3-partition-1/pulsar.repl.r2

	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:56)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9b128196-6f9a-4c0d-af67-beb17feecba3-partition-1/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9b128196-6f9a-4c0d-af67-beb17feecba3-partition-1/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9b128196-6f9a-4c0d-af67-beb17feecba3-partition-1/pulsar.repl.r2

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:230)
	at org.apache.pulsar.broker.service.OneWayReplicatorTestBase.cleanupPulsarResources(OneWayReplicatorTestBase.java:291)
	at org.apache.pulsar.broker.service.OneWayReplicatorTestBase.cleanup(OneWayReplicatorTestBase.java:302)
	at org.apache.pulsar.broker.service.OneWayReplicatorTest.cleanup(OneWayReplicatorTest.java:119)
	at org.apache.pulsar.broker.service.OneWayReplicatorUsingGlobalZKTest.cleanup(OneWayReplicatorUsingGlobalZKTest.java:60)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	... 6 more
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9b128196-6f9a-4c0d-af67-beb17feecba3-partition-1/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9b128196-6f9a-4c0d-af67-beb17feecba3-partition-1/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9b128196-6f9a-4c0d-af67-beb17feecba3-partition-1/pulsar.repl.r2

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:272)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:898)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:879)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:232)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:176)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:176)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:275)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:331)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2480)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:400)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at com.spotify.futures.ConcurrencyReducer.lambda$invoke$0(ConcurrencyReducer.java:173)
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
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1357)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:440)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:868)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:788)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:724)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:650)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9b128196-6f9a-4c0d-af67-beb17feecba3-partition-1/pulsar.repl.r2\n\nStacktrace:\n\norg.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9b128196-6f9a-4c0d-af67-beb17feecba3-partition-1/pulsar.repl.r2\n\tat org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)\n\tat java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)\n\tat java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)\n\tat org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9b128196-6f9a-4c0d-af67-beb17feecba3-partition-1/pulsar.repl.r2\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9b128196-6f9a-4c0d-af67-beb17feecba3-partition-1/pulsar.repl.r2\n\nStacktrace:\n\norg.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9b128196-6f9a-4c0d-af67-beb17feecba3-partition-1/pulsar.repl.r2\n\tat org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)\n\tat java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)\n\tat java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)\n\tat org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-9b128196-6f9a-4c0d-af67-beb17feecba3-partition-1/pulsar.repl.r2\n"}]

</pre></code>
</details>

```
org.testng.internal.invokers.InvokeMethodRunnable$TestNGRuntimeException:
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-57530aa0-1f37-401c-91c8-1eff22776cc3-partition-0/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-57530aa0-1f37-401c-91c8-1eff22776cc3-partition-0/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-10-16T06:22:36.1582377Z](https://github.com/apache/pulsar/actions/runs/11359810245/job/31596806195#step:11:1225)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.invokers.InvokeMethodRunnable$TestNGRuntimeException:
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-57530aa0-1f37-401c-91c8-1eff22776cc3-partition-0/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-57530aa0-1f37-401c-91c8-1eff22776cc3-partition-0/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-57530aa0-1f37-401c-91c8-1eff22776cc3-partition-0/pulsar.repl.r2

	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:56)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-57530aa0-1f37-401c-91c8-1eff22776cc3-partition-0/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-57530aa0-1f37-401c-91c8-1eff22776cc3-partition-0/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-57530aa0-1f37-401c-91c8-1eff22776cc3-partition-0/pulsar.repl.r2

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:230)
	at org.apache.pulsar.broker.service.OneWayReplicatorTestBase.cleanupPulsarResources(OneWayReplicatorTestBase.java:291)
	at org.apache.pulsar.broker.service.OneWayReplicatorTestBase.cleanup(OneWayReplicatorTestBase.java:302)
	at org.apache.pulsar.broker.service.OneWayReplicatorTest.cleanup(OneWayReplicatorTest.java:119)
	at org.apache.pulsar.broker.service.OneWayReplicatorUsingGlobalZKTest.cleanup(OneWayReplicatorUsingGlobalZKTest.java:60)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	... 6 more
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-57530aa0-1f37-401c-91c8-1eff22776cc3-partition-0/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-57530aa0-1f37-401c-91c8-1eff22776cc3-partition-0/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-57530aa0-1f37-401c-91c8-1eff22776cc3-partition-0/pulsar.repl.r2

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:272)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:898)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:879)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:232)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:176)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:176)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:275)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:331)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2480)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:400)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at com.spotify.futures.ConcurrencyReducer.lambda$invoke$0(ConcurrencyReducer.java:173)
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
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1357)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:440)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:868)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:788)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:724)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:650)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-57530aa0-1f37-401c-91c8-1eff22776cc3-partition-0/pulsar.repl.r2\n\nStacktrace:\n\norg.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-57530aa0-1f37-401c-91c8-1eff22776cc3-partition-0/pulsar.repl.r2\n\tat org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)\n\tat java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)\n\tat java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)\n\tat org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-57530aa0-1f37-401c-91c8-1eff22776cc3-partition-0/pulsar.repl.r2\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-57530aa0-1f37-401c-91c8-1eff22776cc3-partition-0/pulsar.repl.r2\n\nStacktrace:\n\norg.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-57530aa0-1f37-401c-91c8-1eff22776cc3-partition-0/pulsar.repl.r2\n\tat org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)\n\tat java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)\n\tat java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)\n\tat org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-57530aa0-1f37-401c-91c8-1eff22776cc3-partition-0/pulsar.repl.r2\n"}]

</pre></code>
</details>

```
org.testng.internal.invokers.InvokeMethodRunnable$TestNGRuntimeException:
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-5512bade-e278-471c-a658-5aac5f9f558d-partition-0/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-5512bade-e278-471c-a658-5aac5f9f558d-partition-0/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-10-17T06:22:56.6125040Z](https://github.com/apache/pulsar/actions/runs/11379240094/job/31656657365#step:11:1205)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.invokers.InvokeMethodRunnable$TestNGRuntimeException:
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-5512bade-e278-471c-a658-5aac5f9f558d-partition-0/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-5512bade-e278-471c-a658-5aac5f9f558d-partition-0/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-5512bade-e278-471c-a658-5aac5f9f558d-partition-0/pulsar.repl.r2

	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:56)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-5512bade-e278-471c-a658-5aac5f9f558d-partition-0/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-5512bade-e278-471c-a658-5aac5f9f558d-partition-0/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-5512bade-e278-471c-a658-5aac5f9f558d-partition-0/pulsar.repl.r2

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:230)
	at org.apache.pulsar.broker.service.OneWayReplicatorTestBase.cleanupPulsarResources(OneWayReplicatorTestBase.java:291)
	at org.apache.pulsar.broker.service.OneWayReplicatorTestBase.cleanup(OneWayReplicatorTestBase.java:302)
	at org.apache.pulsar.broker.service.OneWayReplicatorTest.cleanup(OneWayReplicatorTest.java:119)
	at org.apache.pulsar.broker.service.OneWayReplicatorUsingGlobalZKTest.cleanup(OneWayReplicatorUsingGlobalZKTest.java:60)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	... 6 more
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-5512bade-e278-471c-a658-5aac5f9f558d-partition-0/pulsar.repl.r2

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-5512bade-e278-471c-a658-5aac5f9f558d-partition-0/pulsar.repl.r2
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	at java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)
	at org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)
	at org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-5512bade-e278-471c-a658-5aac5f9f558d-partition-0/pulsar.repl.r2

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:272)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:898)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:879)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:232)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:176)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:176)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:275)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:331)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2480)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:400)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at com.spotify.futures.ConcurrencyReducer.lambda$invoke$0(ConcurrencyReducer.java:173)
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
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1357)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:440)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:868)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:788)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:724)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:650)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-5512bade-e278-471c-a658-5aac5f9f558d-partition-0/pulsar.repl.r2\n\nStacktrace:\n\norg.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-5512bade-e278-471c-a658-5aac5f9f558d-partition-0/pulsar.repl.r2\n\tat org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)\n\tat java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)\n\tat java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)\n\tat org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-5512bade-e278-471c-a658-5aac5f9f558d-partition-0/pulsar.repl.r2\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-5512bade-e278-471c-a658-5aac5f9f558d-partition-0/pulsar.repl.r2\n\nStacktrace:\n\norg.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-5512bade-e278-471c-a658-5aac5f9f558d-partition-0/pulsar.repl.r2\n\tat org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1546)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncDelete$35(ManagedLedgerImpl.java:2978)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.lambda$asyncTruncate$58(ManagedLedgerImpl.java:4372)\n\tat java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)\n\tat java.base/java.util.concurrent.CompletableFuture$UniExceptionally.tryFire(CompletableFuture.java:974)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$26.clearBacklogFailed(ManagedLedgerImpl.java:4363)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$16.markDeleteFailed(ManagedCursorImpl.java:1767)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$28.operationFailed(ManagedCursorImpl.java:2940)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl$31.lambda$operationFailed$0(ManagedCursorImpl.java:3317)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:787)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)\n\tat org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.lambda$deleteLedgerAsync$39(ManagedCursorImpl.java:3051)\n\tat org.apache.bookkeeper.client.LedgerDeleteOp.lambda$initiate$0(LedgerDeleteOp.java:86)\n\tat java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)\n\tat java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)\n\tat java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.safeRunTask(SingleThreadExecutor.java:137)\n\tat org.apache.bookkeeper.common.util.SingleThreadExecutor.run(SingleThreadExecutor.java:113)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.bookkeeper.mledger.ManagedLedgerException$BadVersionException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /managed-ledgers/public/default/persistent/tp_-5512bade-e278-471c-a658-5aac5f9f558d-partition-0/pulsar.repl.r2\n"}]

</pre></code>
</details>

