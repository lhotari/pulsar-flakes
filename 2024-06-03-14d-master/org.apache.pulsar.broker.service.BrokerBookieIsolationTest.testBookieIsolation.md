        
Flaky-test: org.apache.pulsar.broker.service.BrokerBookieIsolationTest.testBookieIsolation
Number of failures: 1

org.apache.pulsar.broker.service.BrokerBookieIsolationTest is flaky. The testBookieIsolation test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: Cannot invoke "java.util.Set.isEmpty()" because the return value of "org.apache.pulsar.common.policies.data.TenantInfoImpl.getAdminRoles()" is null

Stacktrace:

java.lang.NullPointerException: Cannot invoke "java.util.Set.isEmpty()" because the return value of "org.apache.pulsar.common.policies.data.TenantInfoImpl.getAdminRoles()" is null
	at org.apache.pulsar.broker.admin.impl.TenantsBase.validateAdminRoleAsync(TenantsBase.java:289)
	at org.apache.pulsar.broker.admin.impl.TenantsBase.lambda$createTenant$8(TenantsBase.java:125)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1150)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleGetChildrenResult(ZKMetadataStore.java:304)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-05-24T04:09:24.2556146Z](https://github.com/apache/pulsar/actions/runs/9172277968/job/25361905747#step:11:1118)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: Cannot invoke "java.util.Set.isEmpty()" because the return value of "org.apache.pulsar.common.policies.data.TenantInfoImpl.getAdminRoles()" is null

Stacktrace:

java.lang.NullPointerException: Cannot invoke "java.util.Set.isEmpty()" because the return value of "org.apache.pulsar.common.policies.data.TenantInfoImpl.getAdminRoles()" is null
	at org.apache.pulsar.broker.admin.impl.TenantsBase.validateAdminRoleAsync(TenantsBase.java:289)
	at org.apache.pulsar.broker.admin.impl.TenantsBase.lambda$createTenant$8(TenantsBase.java:125)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1150)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleGetChildrenResult(ZKMetadataStore.java:304)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:235)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TenantsImpl.createTenant(TenantsImpl.java:66)
	at org.apache.pulsar.broker.service.BrokerBookieIsolationTest.testBookieIsolation(BrokerBookieIsolationTest.java:184)
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

Message: Cannot invoke "java.util.Set.isEmpty()" because the return value of "org.apache.pulsar.common.policies.data.TenantInfoImpl.getAdminRoles()" is null

Stacktrace:

java.lang.NullPointerException: Cannot invoke "java.util.Set.isEmpty()" because the return value of "org.apache.pulsar.common.policies.data.TenantInfoImpl.getAdminRoles()" is null
	at org.apache.pulsar.broker.admin.impl.TenantsBase.validateAdminRoleAsync(TenantsBase.java:289)
	at org.apache.pulsar.broker.admin.impl.TenantsBase.lambda$createTenant$8(TenantsBase.java:125)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1150)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleGetChildrenResult(ZKMetadataStore.java:304)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:235)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:272)
		at org.apache.pulsar.client.admin.internal.BaseResource$1.failed(BaseResource.java:136)
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
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:300)
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
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: Cannot invoke \"java.util.Set.isEmpty()\" because the return value of \"org.apache.pulsar.common.policies.data.TenantInfoImpl.getAdminRoles()\" is null\n\nStacktrace:\n\njava.lang.NullPointerException: Cannot invoke \"java.util.Set.isEmpty()\" because the return value of \"org.apache.pulsar.common.policies.data.TenantInfoImpl.getAdminRoles()\" is null\n\tat org.apache.pulsar.broker.admin.impl.TenantsBase.validateAdminRoleAsync(TenantsBase.java:289)\n\tat org.apache.pulsar.broker.admin.impl.TenantsBase.lambda$createTenant$8(TenantsBase.java:125)\n\tat java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1150)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.handleGetChildrenResult(ZKMetadataStore.java:304)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:235)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:960)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: Cannot invoke \"java.util.Set.isEmpty()\" because the return value of \"org.apache.pulsar.common.policies.data.TenantInfoImpl.getAdminRoles()\" is null\n\nStacktrace:\n\njava.lang.NullPointerException: Cannot invoke \"java.util.Set.isEmpty()\" because the return value of \"org.apache.pulsar.common.policies.data.TenantInfoImpl.getAdminRoles()\" is null\n\tat org.apache.pulsar.broker.admin.impl.TenantsBase.validateAdminRoleAsync(TenantsBase.java:289)\n\tat org.apache.pulsar.broker.admin.impl.TenantsBase.lambda$createTenant$8(TenantsBase.java:125)\n\tat java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1150)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.handleGetChildrenResult(ZKMetadataStore.java:304)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:235)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\n"}]

</pre></code>
</details>

