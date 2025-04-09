        
Flaky-test: org.apache.pulsar.broker.service.BrokerServiceChaosTest.testFetchPartitionedTopicMetadataWithCacheRefresh
Number of failures: 19

org.apache.pulsar.broker.service.BrokerServiceChaosTest is flaky. The testFetchPartitionedTopicMetadataWithCacheRefresh test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea65e627807f4525ae0d7f99632f5ecf/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea65e627807f4525ae0d7f99632f5ecf/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-03-29T06:25:17.7074815Z](https://github.com/apache/pulsar/actions/runs/14142843129/job/39626718346#step:11:753)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea65e627807f4525ae0d7f99632f5ecf/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea65e627807f4525ae0d7f99632f5ecf/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea65e627807f4525ae0d7f99632f5ecf/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:461)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:803)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:438)
	at org.apache.pulsar.broker.service.BrokerServiceChaosTest.testFetchPartitionedTopicMetadataWithCacheRefresh(BrokerServiceChaosTest.java:100)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
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

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea65e627807f4525ae0d7f99632f5ecf/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea65e627807f4525ae0d7f99632f5ecf/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea65e627807f4525ae0d7f99632f5ecf/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:278)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:337)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2480)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:406)
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
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:113)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:142)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:107)
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
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea65e627807f4525ae0d7f99632f5ecf/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea65e627807f4525ae0d7f99632f5ecf/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea65e627807f4525ae0d7f99632f5ecf/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea65e627807f4525ae0d7f99632f5ecf/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea65e627807f4525ae0d7f99632f5ecf/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea65e627807f4525ae0d7f99632f5ecf/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9c86ee706cc44470b8d80998934f1b8f/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9c86ee706cc44470b8d80998934f1b8f/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-03-30T06:23:51.9279701Z](https://github.com/apache/pulsar/actions/runs/14153207832/job/39649261913#step:11:730)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9c86ee706cc44470b8d80998934f1b8f/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9c86ee706cc44470b8d80998934f1b8f/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9c86ee706cc44470b8d80998934f1b8f/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:461)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:803)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:438)
	at org.apache.pulsar.broker.service.BrokerServiceChaosTest.testFetchPartitionedTopicMetadataWithCacheRefresh(BrokerServiceChaosTest.java:100)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
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

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9c86ee706cc44470b8d80998934f1b8f/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9c86ee706cc44470b8d80998934f1b8f/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9c86ee706cc44470b8d80998934f1b8f/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:278)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:337)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2480)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:406)
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
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:113)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:142)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:107)
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
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9c86ee706cc44470b8d80998934f1b8f/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9c86ee706cc44470b8d80998934f1b8f/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9c86ee706cc44470b8d80998934f1b8f/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9c86ee706cc44470b8d80998934f1b8f/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9c86ee706cc44470b8d80998934f1b8f/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9c86ee706cc44470b8d80998934f1b8f/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_d5d0693851934e9f81e4aca07042645b/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_d5d0693851934e9f81e4aca07042645b/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-03-30T12:34:15.9528110Z](https://github.com/apache/pulsar/actions/runs/14155876693/job/39655234413#step:10:745)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_d5d0693851934e9f81e4aca07042645b/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_d5d0693851934e9f81e4aca07042645b/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_d5d0693851934e9f81e4aca07042645b/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:461)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:803)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:438)
	at org.apache.pulsar.broker.service.BrokerServiceChaosTest.testFetchPartitionedTopicMetadataWithCacheRefresh(BrokerServiceChaosTest.java:100)
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

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_d5d0693851934e9f81e4aca07042645b/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_d5d0693851934e9f81e4aca07042645b/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_d5d0693851934e9f81e4aca07042645b/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:278)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:337)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2512)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:406)
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
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:113)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:142)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:107)
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
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_d5d0693851934e9f81e4aca07042645b/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_d5d0693851934e9f81e4aca07042645b/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_d5d0693851934e9f81e4aca07042645b/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_d5d0693851934e9f81e4aca07042645b/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_d5d0693851934e9f81e4aca07042645b/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_d5d0693851934e9f81e4aca07042645b/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ddda8ed0d34947669d5acd2b33179b83/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ddda8ed0d34947669d5acd2b33179b83/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-04T06:24:14.5083169Z](https://github.com/apache/pulsar/actions/runs/14259036143/job/39967069141#step:11:730)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ddda8ed0d34947669d5acd2b33179b83/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ddda8ed0d34947669d5acd2b33179b83/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ddda8ed0d34947669d5acd2b33179b83/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:461)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:803)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:438)
	at org.apache.pulsar.broker.service.BrokerServiceChaosTest.testFetchPartitionedTopicMetadataWithCacheRefresh(BrokerServiceChaosTest.java:100)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
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

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ddda8ed0d34947669d5acd2b33179b83/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ddda8ed0d34947669d5acd2b33179b83/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ddda8ed0d34947669d5acd2b33179b83/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:278)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:337)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2480)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:406)
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
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:113)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:142)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:107)
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
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ddda8ed0d34947669d5acd2b33179b83/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ddda8ed0d34947669d5acd2b33179b83/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ddda8ed0d34947669d5acd2b33179b83/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ddda8ed0d34947669d5acd2b33179b83/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ddda8ed0d34947669d5acd2b33179b83/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ddda8ed0d34947669d5acd2b33179b83/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea497849ac904d04bf2ae09f73604dd2/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea497849ac904d04bf2ae09f73604dd2/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-01T12:47:48.0492083Z](https://github.com/apache/pulsar/actions/runs/14195268210/job/39769420818#step:11:1006)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea497849ac904d04bf2ae09f73604dd2/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea497849ac904d04bf2ae09f73604dd2/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea497849ac904d04bf2ae09f73604dd2/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:461)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:803)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:438)
	at org.apache.pulsar.broker.service.BrokerServiceChaosTest.testFetchPartitionedTopicMetadataWithCacheRefresh(BrokerServiceChaosTest.java:100)
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

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea497849ac904d04bf2ae09f73604dd2/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea497849ac904d04bf2ae09f73604dd2/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea497849ac904d04bf2ae09f73604dd2/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:278)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:337)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2512)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:406)
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
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:113)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:142)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:107)
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
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea497849ac904d04bf2ae09f73604dd2/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea497849ac904d04bf2ae09f73604dd2/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea497849ac904d04bf2ae09f73604dd2/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea497849ac904d04bf2ae09f73604dd2/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea497849ac904d04bf2ae09f73604dd2/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_ea497849ac904d04bf2ae09f73604dd2/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_06a3bc24abbb43689b69812c55027db4/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_06a3bc24abbb43689b69812c55027db4/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-05T12:33:16.0676917Z](https://github.com/apache/pulsar/actions/runs/14281742340/job/40032243094#step:11:725)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_06a3bc24abbb43689b69812c55027db4/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_06a3bc24abbb43689b69812c55027db4/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_06a3bc24abbb43689b69812c55027db4/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:461)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:803)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:438)
	at org.apache.pulsar.broker.service.BrokerServiceChaosTest.testFetchPartitionedTopicMetadataWithCacheRefresh(BrokerServiceChaosTest.java:100)
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

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_06a3bc24abbb43689b69812c55027db4/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_06a3bc24abbb43689b69812c55027db4/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_06a3bc24abbb43689b69812c55027db4/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:278)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:337)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2512)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:406)
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
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:113)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:142)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:107)
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
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_06a3bc24abbb43689b69812c55027db4/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_06a3bc24abbb43689b69812c55027db4/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_06a3bc24abbb43689b69812c55027db4/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_06a3bc24abbb43689b69812c55027db4/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_06a3bc24abbb43689b69812c55027db4/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_06a3bc24abbb43689b69812c55027db4/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_de59731bcdf542249e0e99be5dd0614d/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_de59731bcdf542249e0e99be5dd0614d/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-01T06:24:12.4133827Z](https://github.com/apache/pulsar/actions/runs/14188344572/job/39747969893#step:10:750)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_de59731bcdf542249e0e99be5dd0614d/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_de59731bcdf542249e0e99be5dd0614d/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_de59731bcdf542249e0e99be5dd0614d/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:461)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:803)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:438)
	at org.apache.pulsar.broker.service.BrokerServiceChaosTest.testFetchPartitionedTopicMetadataWithCacheRefresh(BrokerServiceChaosTest.java:100)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
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

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_de59731bcdf542249e0e99be5dd0614d/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_de59731bcdf542249e0e99be5dd0614d/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_de59731bcdf542249e0e99be5dd0614d/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:278)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:337)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2480)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:406)
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
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:113)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:142)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:107)
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
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_de59731bcdf542249e0e99be5dd0614d/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_de59731bcdf542249e0e99be5dd0614d/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_de59731bcdf542249e0e99be5dd0614d/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_de59731bcdf542249e0e99be5dd0614d/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_de59731bcdf542249e0e99be5dd0614d/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_de59731bcdf542249e0e99be5dd0614d/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_dec7c99e58894043b3ffa4809534417e/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_dec7c99e58894043b3ffa4809534417e/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-04T12:35:03.4097968Z](https://github.com/apache/pulsar/actions/runs/14265049113/job/39985351136#step:11:767)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_dec7c99e58894043b3ffa4809534417e/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_dec7c99e58894043b3ffa4809534417e/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_dec7c99e58894043b3ffa4809534417e/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:461)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:803)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:438)
	at org.apache.pulsar.broker.service.BrokerServiceChaosTest.testFetchPartitionedTopicMetadataWithCacheRefresh(BrokerServiceChaosTest.java:100)
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

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_dec7c99e58894043b3ffa4809534417e/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_dec7c99e58894043b3ffa4809534417e/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_dec7c99e58894043b3ffa4809534417e/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:278)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:337)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2512)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:406)
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
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:113)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:142)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:107)
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
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_dec7c99e58894043b3ffa4809534417e/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_dec7c99e58894043b3ffa4809534417e/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_dec7c99e58894043b3ffa4809534417e/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_dec7c99e58894043b3ffa4809534417e/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_dec7c99e58894043b3ffa4809534417e/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_dec7c99e58894043b3ffa4809534417e/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c00778210ffd4653b1968e0610630f39/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c00778210ffd4653b1968e0610630f39/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-08T12:41:31.1131255Z](https://github.com/apache/pulsar/actions/runs/14333178015/job/40174245633#step:11:853)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c00778210ffd4653b1968e0610630f39/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c00778210ffd4653b1968e0610630f39/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c00778210ffd4653b1968e0610630f39/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:461)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:803)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:438)
	at org.apache.pulsar.broker.service.BrokerServiceChaosTest.testFetchPartitionedTopicMetadataWithCacheRefresh(BrokerServiceChaosTest.java:100)
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

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c00778210ffd4653b1968e0610630f39/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c00778210ffd4653b1968e0610630f39/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c00778210ffd4653b1968e0610630f39/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:278)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:337)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2512)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:406)
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
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:113)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:142)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:107)
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
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c00778210ffd4653b1968e0610630f39/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c00778210ffd4653b1968e0610630f39/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c00778210ffd4653b1968e0610630f39/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c00778210ffd4653b1968e0610630f39/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c00778210ffd4653b1968e0610630f39/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c00778210ffd4653b1968e0610630f39/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_a59f057936d7476789414aef071cfb2b/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_a59f057936d7476789414aef071cfb2b/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-07T06:24:56.8232465Z](https://github.com/apache/pulsar/actions/runs/14301942628/job/40078132389#step:11:730)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_a59f057936d7476789414aef071cfb2b/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_a59f057936d7476789414aef071cfb2b/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_a59f057936d7476789414aef071cfb2b/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:461)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:803)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:438)
	at org.apache.pulsar.broker.service.BrokerServiceChaosTest.testFetchPartitionedTopicMetadataWithCacheRefresh(BrokerServiceChaosTest.java:100)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
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

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_a59f057936d7476789414aef071cfb2b/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_a59f057936d7476789414aef071cfb2b/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_a59f057936d7476789414aef071cfb2b/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:278)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:337)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2480)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:406)
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
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:113)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:142)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:107)
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
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_a59f057936d7476789414aef071cfb2b/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_a59f057936d7476789414aef071cfb2b/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_a59f057936d7476789414aef071cfb2b/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_a59f057936d7476789414aef071cfb2b/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_a59f057936d7476789414aef071cfb2b/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_a59f057936d7476789414aef071cfb2b/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2073f8aa6f0a465fa8ce827cf6e88531/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2073f8aa6f0a465fa8ce827cf6e88531/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-06T06:23:54.3723065Z](https://github.com/apache/pulsar/actions/runs/14289613290/job/40049266407#step:11:730)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2073f8aa6f0a465fa8ce827cf6e88531/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2073f8aa6f0a465fa8ce827cf6e88531/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2073f8aa6f0a465fa8ce827cf6e88531/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:461)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:803)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:438)
	at org.apache.pulsar.broker.service.BrokerServiceChaosTest.testFetchPartitionedTopicMetadataWithCacheRefresh(BrokerServiceChaosTest.java:100)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
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

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2073f8aa6f0a465fa8ce827cf6e88531/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2073f8aa6f0a465fa8ce827cf6e88531/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2073f8aa6f0a465fa8ce827cf6e88531/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:278)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:337)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2480)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:406)
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
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:113)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:142)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:107)
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
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2073f8aa6f0a465fa8ce827cf6e88531/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2073f8aa6f0a465fa8ce827cf6e88531/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2073f8aa6f0a465fa8ce827cf6e88531/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2073f8aa6f0a465fa8ce827cf6e88531/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2073f8aa6f0a465fa8ce827cf6e88531/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2073f8aa6f0a465fa8ce827cf6e88531/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c6d51efab17b4fa7bf973514d9e6493f/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c6d51efab17b4fa7bf973514d9e6493f/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-02T12:47:28.0452601Z](https://github.com/apache/pulsar/actions/runs/14219287597/job/39843681687#step:11:1048)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c6d51efab17b4fa7bf973514d9e6493f/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c6d51efab17b4fa7bf973514d9e6493f/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c6d51efab17b4fa7bf973514d9e6493f/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:461)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:803)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:438)
	at org.apache.pulsar.broker.service.BrokerServiceChaosTest.testFetchPartitionedTopicMetadataWithCacheRefresh(BrokerServiceChaosTest.java:100)
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

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c6d51efab17b4fa7bf973514d9e6493f/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c6d51efab17b4fa7bf973514d9e6493f/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c6d51efab17b4fa7bf973514d9e6493f/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:278)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:337)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2512)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:406)
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
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:113)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:142)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:107)
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
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c6d51efab17b4fa7bf973514d9e6493f/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c6d51efab17b4fa7bf973514d9e6493f/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c6d51efab17b4fa7bf973514d9e6493f/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c6d51efab17b4fa7bf973514d9e6493f/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c6d51efab17b4fa7bf973514d9e6493f/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_c6d51efab17b4fa7bf973514d9e6493f/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_0fea0b15585c43a2bb293264685ae727/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_0fea0b15585c43a2bb293264685ae727/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-05T06:23:37.8642012Z](https://github.com/apache/pulsar/actions/runs/14279053943/job/40026464918#step:11:730)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_0fea0b15585c43a2bb293264685ae727/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_0fea0b15585c43a2bb293264685ae727/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_0fea0b15585c43a2bb293264685ae727/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:461)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:803)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:438)
	at org.apache.pulsar.broker.service.BrokerServiceChaosTest.testFetchPartitionedTopicMetadataWithCacheRefresh(BrokerServiceChaosTest.java:100)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
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

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_0fea0b15585c43a2bb293264685ae727/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_0fea0b15585c43a2bb293264685ae727/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_0fea0b15585c43a2bb293264685ae727/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:278)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:337)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2480)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:406)
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
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:113)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:142)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:107)
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
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_0fea0b15585c43a2bb293264685ae727/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_0fea0b15585c43a2bb293264685ae727/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_0fea0b15585c43a2bb293264685ae727/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_0fea0b15585c43a2bb293264685ae727/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_0fea0b15585c43a2bb293264685ae727/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_0fea0b15585c43a2bb293264685ae727/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_5fc2e0c8432442a4b4b48b9e0b881c9a/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_5fc2e0c8432442a4b4b48b9e0b881c9a/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-08T06:15:42.4415602Z](https://github.com/apache/pulsar/actions/runs/14326297985/job/40152304116#step:9:1772)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_5fc2e0c8432442a4b4b48b9e0b881c9a/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_5fc2e0c8432442a4b4b48b9e0b881c9a/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_5fc2e0c8432442a4b4b48b9e0b881c9a/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:461)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:803)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:438)
	at org.apache.pulsar.broker.service.BrokerServiceChaosTest.testFetchPartitionedTopicMetadataWithCacheRefresh(BrokerServiceChaosTest.java:102)
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

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_5fc2e0c8432442a4b4b48b9e0b881c9a/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_5fc2e0c8432442a4b4b48b9e0b881c9a/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_5fc2e0c8432442a4b4b48b9e0b881c9a/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:278)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:337)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2512)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:406)
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
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:113)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:142)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:107)
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
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_5fc2e0c8432442a4b4b48b9e0b881c9a/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_5fc2e0c8432442a4b4b48b9e0b881c9a/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_5fc2e0c8432442a4b4b48b9e0b881c9a/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_5fc2e0c8432442a4b4b48b9e0b881c9a/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_5fc2e0c8432442a4b4b48b9e0b881c9a/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_5fc2e0c8432442a4b4b48b9e0b881c9a/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_acae3ea91e844d4d93b7ebfae50f70c1/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_acae3ea91e844d4d93b7ebfae50f70c1/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-03-29T12:33:28.3575366Z](https://github.com/apache/pulsar/actions/runs/14145474244/job/39632430972#step:11:725)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_acae3ea91e844d4d93b7ebfae50f70c1/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_acae3ea91e844d4d93b7ebfae50f70c1/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_acae3ea91e844d4d93b7ebfae50f70c1/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:461)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:803)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:438)
	at org.apache.pulsar.broker.service.BrokerServiceChaosTest.testFetchPartitionedTopicMetadataWithCacheRefresh(BrokerServiceChaosTest.java:100)
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

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_acae3ea91e844d4d93b7ebfae50f70c1/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_acae3ea91e844d4d93b7ebfae50f70c1/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_acae3ea91e844d4d93b7ebfae50f70c1/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:278)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:337)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2512)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:406)
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
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:113)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:142)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:107)
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
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_acae3ea91e844d4d93b7ebfae50f70c1/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_acae3ea91e844d4d93b7ebfae50f70c1/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_acae3ea91e844d4d93b7ebfae50f70c1/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_acae3ea91e844d4d93b7ebfae50f70c1/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_acae3ea91e844d4d93b7ebfae50f70c1/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_acae3ea91e844d4d93b7ebfae50f70c1/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2dc4dc622eae4a9aabf70009c6a95b78/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2dc4dc622eae4a9aabf70009c6a95b78/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-06T12:34:11.6379161Z](https://github.com/apache/pulsar/actions/runs/14292369657/job/40055414621#step:10:745)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2dc4dc622eae4a9aabf70009c6a95b78/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2dc4dc622eae4a9aabf70009c6a95b78/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2dc4dc622eae4a9aabf70009c6a95b78/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:461)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:803)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:438)
	at org.apache.pulsar.broker.service.BrokerServiceChaosTest.testFetchPartitionedTopicMetadataWithCacheRefresh(BrokerServiceChaosTest.java:100)
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

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2dc4dc622eae4a9aabf70009c6a95b78/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2dc4dc622eae4a9aabf70009c6a95b78/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2dc4dc622eae4a9aabf70009c6a95b78/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:278)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:337)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2512)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:406)
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
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:113)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:142)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:107)
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
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2dc4dc622eae4a9aabf70009c6a95b78/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2dc4dc622eae4a9aabf70009c6a95b78/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2dc4dc622eae4a9aabf70009c6a95b78/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2dc4dc622eae4a9aabf70009c6a95b78/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2dc4dc622eae4a9aabf70009c6a95b78/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_2dc4dc622eae4a9aabf70009c6a95b78/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_272b625978ce4ffc8ee545681780cded/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_272b625978ce4ffc8ee545681780cded/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-03-31T12:35:25.2607784Z](https://github.com/apache/pulsar/actions/runs/14171235180/job/39695829953#step:11:725)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_272b625978ce4ffc8ee545681780cded/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_272b625978ce4ffc8ee545681780cded/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_272b625978ce4ffc8ee545681780cded/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:461)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:803)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:438)
	at org.apache.pulsar.broker.service.BrokerServiceChaosTest.testFetchPartitionedTopicMetadataWithCacheRefresh(BrokerServiceChaosTest.java:100)
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

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_272b625978ce4ffc8ee545681780cded/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_272b625978ce4ffc8ee545681780cded/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_272b625978ce4ffc8ee545681780cded/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:278)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:337)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2512)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:406)
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
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:113)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:142)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:107)
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
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_272b625978ce4ffc8ee545681780cded/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_272b625978ce4ffc8ee545681780cded/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_272b625978ce4ffc8ee545681780cded/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_272b625978ce4ffc8ee545681780cded/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_272b625978ce4ffc8ee545681780cded/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:1583)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_272b625978ce4ffc8ee545681780cded/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9b33dea3d1734f93a46fe9b6a62c335d/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9b33dea3d1734f93a46fe9b6a62c335d/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-03T06:23:59.2976138Z](https://github.com/apache/pulsar/actions/runs/14236028883/job/39895728158#step:11:767)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9b33dea3d1734f93a46fe9b6a62c335d/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9b33dea3d1734f93a46fe9b6a62c335d/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9b33dea3d1734f93a46fe9b6a62c335d/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:461)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:803)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:438)
	at org.apache.pulsar.broker.service.BrokerServiceChaosTest.testFetchPartitionedTopicMetadataWithCacheRefresh(BrokerServiceChaosTest.java:100)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
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

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9b33dea3d1734f93a46fe9b6a62c335d/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9b33dea3d1734f93a46fe9b6a62c335d/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9b33dea3d1734f93a46fe9b6a62c335d/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:278)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:337)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2480)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:406)
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
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:113)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:142)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:107)
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
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9b33dea3d1734f93a46fe9b6a62c335d/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9b33dea3d1734f93a46fe9b6a62c335d/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9b33dea3d1734f93a46fe9b6a62c335d/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9b33dea3d1734f93a46fe9b6a62c335d/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9b33dea3d1734f93a46fe9b6a62c335d/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_9b33dea3d1734f93a46fe9b6a62c335d/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_be74c2c99fda43078bc51205c2738f8f/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_be74c2c99fda43078bc51205c2738f8f/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-02T06:37:41.0859179Z](https://github.com/apache/pulsar/actions/runs/14212605378/job/39822769310#step:10:1069)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_be74c2c99fda43078bc51205c2738f8f/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_be74c2c99fda43078bc51205c2738f8f/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_be74c2c99fda43078bc51205c2738f8f/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:461)
	at org.apache.pulsar.client.admin.Topics.deletePartitionedTopic(Topics.java:803)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.deletePartitionedTopic(TopicsImpl.java:438)
	at org.apache.pulsar.broker.service.BrokerServiceChaosTest.testFetchPartitionedTopicMetadataWithCacheRefresh(BrokerServiceChaosTest.java:100)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
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

Message: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_be74c2c99fda43078bc51205c2738f8f/persistent/__change_events-partition-0

Stacktrace:

org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_be74c2c99fda43078bc51205c2738f8f/persistent/__change_events-partition-0
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_be74c2c99fda43078bc51205c2738f8f/persistent/__change_events-partition-0
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:101)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)
	... 8 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:278)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:337)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2480)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:406)
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
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:113)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:142)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:444)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:420)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:412)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:107)
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
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:796)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		... 1 more
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_be74c2c99fda43078bc51205c2738f8f/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_be74c2c99fda43078bc51205c2738f8f/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_be74c2c99fda43078bc51205c2738f8f/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:977)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 64 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_be74c2c99fda43078bc51205c2738f8f/persistent/__change_events-partition-0\n\nStacktrace:\n\norg.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_be74c2c99fda43078bc51205c2738f8f/persistent/__change_events-partition-0\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:501)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$existsFromStore$13(ZKMetadataStore.java:378)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss for /managed-ledgers/public/ns_be74c2c99fda43078bc51205c2738f8f/persistent/__change_events-partition-0\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:101)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:491)\n\t... 8 more\n"}]

</pre></code>
</details>

