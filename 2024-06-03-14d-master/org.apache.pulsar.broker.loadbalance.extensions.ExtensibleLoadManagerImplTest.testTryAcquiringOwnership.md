        
Flaky-test: org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testTryAcquiringOwnership
Number of failures: 2

org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest is flaky. The testTryAcquiringOwnership test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/public/testTryAcquiringOwnership/persistent
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-05-21T06:25:23.9791461Z](https://github.com/apache/pulsar/actions/runs/9169641750/job/25210439241#step:9:2234)  
[example failure 2024-05-20T06:22:50.8529028Z](https://github.com/apache/pulsar/actions/runs/9154268983/job/25164546877#step:9:2234)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/public/testTryAcquiringOwnership/persistent

Stacktrace:

java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/public/testTryAcquiringOwnership/persistent
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:317)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:229)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/public/testTryAcquiringOwnership/persistent
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:489)
	... 9 more
Caused by: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/public/testTryAcquiringOwnership/persistent
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:131)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:479)
	... 9 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:223)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testTryAcquiringOwnership(ExtensibleLoadManagerImplTest.java:1659)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/public/testTryAcquiringOwnership/persistent

Stacktrace:

java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/public/testTryAcquiringOwnership/persistent
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:317)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:229)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/public/testTryAcquiringOwnership/persistent
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:489)
	... 9 more
Caused by: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/public/testTryAcquiringOwnership/persistent
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:131)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:479)
	... 9 more

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:272)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:863)
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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:258)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:300)
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
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/public/testTryAcquiringOwnership/persistent\n\nStacktrace:\n\njava.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/public/testTryAcquiringOwnership/persistent\n\tat java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)\n\tat java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:317)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:229)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/public/testTryAcquiringOwnership/persistent\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:489)\n\t... 9 more\nCaused by: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/public/testTryAcquiringOwnership/persistent\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:131)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:479)\n\t... 9 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:960)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/public/testTryAcquiringOwnership/persistent\n\nStacktrace:\n\njava.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/public/testTryAcquiringOwnership/persistent\n\tat java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)\n\tat java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:317)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:229)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/public/testTryAcquiringOwnership/persistent\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:489)\n\t... 9 more\nCaused by: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/public/testTryAcquiringOwnership/persistent\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:131)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:479)\n\t... 9 more\n"}]

</pre></code>
</details>

