        
Flaky-test: org.apache.pulsar.client.api.SubscriptionMessageDispatchThrottlingTest.reset
Number of failures: 1

org.apache.pulsar.client.api.SubscriptionMessageDispatchThrottlingTest is flaky. The reset test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-02-28T12:34:10.7681199Z](https://github.com/apache/pulsar/actions/runs/8080082158/job/22075863586#step:9:2414)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:304)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$5(ZKMetadataStore.java:216)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:476)
	... 9 more
Caused by: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:131)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:466)
	... 9 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:228)
	at org.apache.pulsar.client.api.MessageDispatchThrottlingTest.reset(MessageDispatchThrottlingTest.java:90)
	at jdk.internal.reflect.GeneratedMethodAccessor1026.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:69)
	at org.testng.internal.invokers.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:361)
	at org.testng.internal.invokers.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:296)
	at org.testng.internal.invokers.TestInvoker.runConfigMethods(TestInvoker.java:823)
	at org.testng.internal.invokers.TestInvoker.runAfterConfigurations(TestInvoker.java:792)
	at org.testng.internal.invokers.TestInvoker.invokeMethod(TestInvoker.java:768)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethod(TestInvoker.java:221)
	at org.testng.internal.invokers.MethodRunner.runInSequence(MethodRunner.java:50)
	at org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:969)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:194)
	at org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:148)
	at org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:829)
	at org.testng.TestRunner.run(TestRunner.java:602)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:437)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:431)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:391)
	at org.testng.SuiteRunner.run(SuiteRunner.java:330)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:95)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1256)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1176)
	at org.testng.TestNG.runSuites(TestNG.java:1099)
	at org.testng.TestNG.run(TestNG.java:1067)
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:155)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:102)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:117)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:86)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:137)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:304)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$5(ZKMetadataStore.java:216)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:476)
	... 9 more
Caused by: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:131)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:466)
	... 9 more

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:272)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
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
		at java.base/java.lang.Thread.run(Thread.java:840)
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1\n\nStacktrace:\n\norg.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1\nCaused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1\n\tat java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)\n\tat java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:304)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$5(ZKMetadataStore.java:216)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:476)\n\t... 9 more\nCaused by: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:131)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:466)\n\t... 9 more\n"}
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:960)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 {"reason":"\n --- An unexpected error occurred in the server ---\n\nMessage: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1\n\nStacktrace:\n\norg.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1\nCaused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1\n\tat java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)\n\tat java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)\n\tat java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)\n\tat java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)\n\tat java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:304)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$5(ZKMetadataStore.java:216)\n\tat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\n\tat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)\n\tat io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)\n\tat java.base/java.lang.Thread.run(Thread.java:840)\nCaused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:476)\n\t... 9 more\nCaused by: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/throttling_ns/persistent/throttlingOverride1\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:131)\n\tat org.apache.zookeeper.KeeperException.create(KeeperException.java:53)\n\tat org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:466)\n\t... 9 more\n"}]

</pre></code>
</details>

