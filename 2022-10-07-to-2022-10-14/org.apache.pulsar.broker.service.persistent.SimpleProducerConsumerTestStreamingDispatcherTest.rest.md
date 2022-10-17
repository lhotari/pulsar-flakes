        
Flaky-test: org.apache.pulsar.broker.service.persistent.SimpleProducerConsumerTestStreamingDispatcherTest.rest
Number of failures: 14

org.apache.pulsar.broker.service.persistent.SimpleProducerConsumerTestStreamingDispatcherTest is flaky. The rest test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException$ConflictException: Cannot delete non empty bundle
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-13T02:18:32.8700284Z](https://github.com/apache/pulsar/actions/runs/3239067534/jobs/5308020214#step:8:1995)  
[example failure 2022-10-11T06:56:09.4587490Z](https://github.com/apache/pulsar/actions/runs/3224531076/jobs/5275758632#step:8:2142)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ConflictException: Cannot delete non empty bundle
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor999.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:661)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:764)
	at org.testng.TestRunner.run(TestRunner.java:585)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:384)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)
	at org.testng.SuiteRunner.run(SuiteRunner.java:286)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1218)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1140)
	at org.testng.TestNG.runSuites(TestNG.java:1069)
	at org.testng.TestNG.run(TestNG.java:1037)
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ConflictException: Cannot delete non empty bundle
		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:287)
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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
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
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.ClientErrorException: HTTP 409 Cannot delete non empty bundle
		at org.glassfish.jersey.client.JerseyInvocation.createExceptionForFamily(JerseyInvocation.java:985)
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:967)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.ClientErrorException: HTTP 409 Cannot delete non empty bundle]

</pre></code>
</details>

[example failure 2022-10-12T02:54:35.1416225Z](https://github.com/apache/pulsar/actions/runs/3227865814/jobs/5291100978#step:8:1988)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ConflictException: Cannot delete non empty bundle
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor998.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:661)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:764)
	at org.testng.TestRunner.run(TestRunner.java:585)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:384)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)
	at org.testng.SuiteRunner.run(SuiteRunner.java:286)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1218)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1140)
	at org.testng.TestNG.runSuites(TestNG.java:1069)
	at org.testng.TestNG.run(TestNG.java:1037)
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ConflictException: Cannot delete non empty bundle
		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:287)
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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
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
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.ClientErrorException: HTTP 409 Cannot delete non empty bundle
		at org.glassfish.jersey.client.JerseyInvocation.createExceptionForFamily(JerseyInvocation.java:985)
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:967)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.ClientErrorException: HTTP 409 Cannot delete non empty bundle]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665541793503

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665541793503
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1241)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$21.operationFailed(ManagedLedgerImpl.java:2886)
	at org.apache.bookkeeper.mledger.impl.MetaStoreImpl.lambda$removeManagedLedger$23(MetaStoreImpl.java:311)
	at org.apache.bookkeeper.util.SafeRunnable$1.safeRun(SafeRunnable.java:43)
	at org.apache.bookkeeper.common.util.SafeRunnable.run(SafeRunnable.java:36)
	at org.apache.bookkeeper.common.util.OrderedExecutor$TimedRunnable.run(OrderedExecutor.java:214)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-12T02:31:31.1069426Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5290991996#step:8:1988)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665541793503

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665541793503
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1241)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$21.operationFailed(ManagedLedgerImpl.java:2886)
	at org.apache.bookkeeper.mledger.impl.MetaStoreImpl.lambda$removeManagedLedger$23(MetaStoreImpl.java:311)
	at org.apache.bookkeeper.util.SafeRunnable$1.safeRun(SafeRunnable.java:43)
	at org.apache.bookkeeper.common.util.SafeRunnable.run(SafeRunnable.java:36)
	at org.apache.bookkeeper.common.util.OrderedExecutor$TimedRunnable.run(OrderedExecutor.java:214)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665541793503
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665541793503
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.zookeeper.MockZooKeeper.multi(MockZooKeeper.java:1006)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.batchOperation(ZKMetadataStore.java:165)
	at org.apache.pulsar.metadata.impl.batching.AbstractBatchedMetadataStore.flush(AbstractBatchedMetadataStore.java:117)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665541793503
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:449)
	... 12 more
Caused by: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665541793503
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:132)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 12 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor974.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:661)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:764)
	at org.testng.TestRunner.run(TestRunner.java:585)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:384)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)
	at org.testng.SuiteRunner.run(SuiteRunner.java:286)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1218)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1140)
	at org.testng.TestNG.runSuites(TestNG.java:1069)
	at org.testng.TestNG.run(TestNG.java:1037)
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665541793503

Stacktrace:

org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665541793503
	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1241)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$21.operationFailed(ManagedLedgerImpl.java:2886)
	at org.apache.bookkeeper.mledger.impl.MetaStoreImpl.lambda$removeManagedLedger$23(MetaStoreImpl.java:311)
	at org.apache.bookkeeper.util.SafeRunnable$1.safeRun(SafeRunnable.java:43)
	at org.apache.bookkeeper.common.util.SafeRunnable.run(SafeRunnable.java:36)
	at org.apache.bookkeeper.common.util.OrderedExecutor$TimedRunnable.run(OrderedExecutor.java:214)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665541793503
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665541793503
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.zookeeper.MockZooKeeper.multi(MockZooKeeper.java:1006)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.batchOperation(ZKMetadataStore.java:165)
	at org.apache.pulsar.metadata.impl.batching.AbstractBatchedMetadataStore.flush(AbstractBatchedMetadataStore.java:117)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665541793503
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:449)
	... 12 more
Caused by: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665541793503
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:132)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 12 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
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
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 ? --- An unexpected error occurred in the server ---??Message: org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665541793503??Stacktrace:??org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665541793503?	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1241)?	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$21.operationFailed
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:960)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 ? --- An unexpected error occurred in the server ---??Message: org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665541793503??Stacktrace:??org.apache.pulsar.broker.service.BrokerServiceException$PersistenceException: org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$NotEmptyException: KeeperErrorCode = Directory not empty for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665541793503?	at org.apache.pulsar.broker.service.persistent.PersistentTopic$6.deleteLedgerFailed(PersistentTopic.java:1241)?	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl$21.operationFailed]

</pre></code>
</details>

```
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.service.BrokerTestBase was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:177)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-11T20:34:07.5487369Z](https://github.com/apache/pulsar/actions/runs/3229794672/jobs/5287496883#step:8:2174)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.service.BrokerTestBase was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:177)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor998.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:548)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:764)
	at org.testng.TestRunner.run(TestRunner.java:585)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:384)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)
	at org.testng.SuiteRunner.run(SuiteRunner.java:286)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1218)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1140)
	at org.testng.TestNG.runSuites(TestNG.java:1069)
	at org.testng.TestNG.run(TestNG.java:1037)
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.FutureTask.get(FutureTask.java:204)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:101)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:81)
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:103)
	... 45 more

</pre></code>
</details>

[example failure 2022-10-12T02:31:31.2085118Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5290991996#step:8:2195)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.service.BrokerTestBase was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:177)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor974.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:548)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:764)
	at org.testng.TestRunner.run(TestRunner.java:585)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:384)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)
	at org.testng.SuiteRunner.run(SuiteRunner.java:286)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1218)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1140)
	at org.testng.TestNG.runSuites(TestNG.java:1069)
	at org.testng.TestNG.run(TestNG.java:1037)
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.FutureTask.get(FutureTask.java:204)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:101)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:81)
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:103)
	... 45 more

</pre></code>
</details>

[example failure 2022-10-11T11:54:20.1812163Z](https://github.com/apache/pulsar/actions/runs/3225447109/jobs/5278912457#step:8:2589)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.service.BrokerTestBase was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:177)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor973.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:548)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:764)
	at org.testng.TestRunner.run(TestRunner.java:585)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:384)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)
	at org.testng.SuiteRunner.run(SuiteRunner.java:286)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1218)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1140)
	at org.testng.TestNG.runSuites(TestNG.java:1069)
	at org.testng.TestNG.run(TestNG.java:1037)
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)

</pre></code>
</details>

[example failure 2022-10-12T02:54:35.1545898Z](https://github.com/apache/pulsar/actions/runs/3227865814/jobs/5291100978#step:8:2099)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.service.BrokerTestBase was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:177)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor998.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:548)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:764)
	at org.testng.TestRunner.run(TestRunner.java:585)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:384)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)
	at org.testng.SuiteRunner.run(SuiteRunner.java:286)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1218)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1140)
	at org.testng.TestNG.runSuites(TestNG.java:1069)
	at org.testng.TestNG.run(TestNG.java:1037)
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)

</pre></code>
</details>

[example failure 2022-10-11T06:56:09.4930129Z](https://github.com/apache/pulsar/actions/runs/3224531076/jobs/5275758632#step:8:2253)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.service.BrokerTestBase was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:177)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor999.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:548)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:764)
	at org.testng.TestRunner.run(TestRunner.java:585)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:384)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)
	at org.testng.SuiteRunner.run(SuiteRunner.java:286)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1218)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1140)
	at org.testng.TestNG.runSuites(TestNG.java:1069)
	at org.testng.TestNG.run(TestNG.java:1037)
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)

</pre></code>
</details>

[example failure 2022-10-11T08:08:34.4981183Z](https://github.com/apache/pulsar/actions/runs/3224852740/jobs/5276534790#step:8:1988)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.service.BrokerTestBase was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:177)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor1075.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:661)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:764)
	at org.testng.TestRunner.run(TestRunner.java:585)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:384)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)
	at org.testng.SuiteRunner.run(SuiteRunner.java:286)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1218)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1140)
	at org.testng.TestNG.runSuites(TestNG.java:1069)
	at org.testng.TestNG.run(TestNG.java:1037)
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.FutureTask.get(FutureTask.java:204)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:101)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:81)
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:103)
	... 45 more

</pre></code>
</details>

[example failure 2022-10-11T13:56:15.4649370Z](https://github.com/apache/pulsar/actions/runs/3224852740/jobs/5281004691#step:8:2434)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.service.BrokerTestBase was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:177)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor972.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:661)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:764)
	at org.testng.TestRunner.run(TestRunner.java:585)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:384)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)
	at org.testng.SuiteRunner.run(SuiteRunner.java:286)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1218)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1140)
	at org.testng.TestNG.runSuites(TestNG.java:1069)
	at org.testng.TestNG.run(TestNG.java:1037)
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-11T11:54:20.1578828Z](https://github.com/apache/pulsar/actions/runs/3225447109/jobs/5278912457#step:8:2410)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.zookeeper.MockZooKeeper.multi(MockZooKeeper.java:1006)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.batchOperation(ZKMetadataStore.java:165)
	at org.apache.pulsar.metadata.impl.batching.AbstractBatchedMetadataStore.flush(AbstractBatchedMetadataStore.java:117)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 12 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 12 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor973.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:661)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:764)
	at org.testng.TestRunner.run(TestRunner.java:585)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:384)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)
	at org.testng.SuiteRunner.run(SuiteRunner.java:286)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1218)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1140)
	at org.testng.TestNG.runSuites(TestNG.java:1069)
	at org.testng.TestNG.run(TestNG.java:1037)
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.zookeeper.MockZooKeeper.multi(MockZooKeeper.java:1006)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.batchOperation(ZKMetadataStore.java:165)
	at org.apache.pulsar.metadata.impl.batching.AbstractBatchedMetadataStore.flush(AbstractBatchedMetadataStore.java:117)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 12 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 12 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
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
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 ? --- An unexpected error occurred in the server ---??Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1??Stacktrace:??org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1?Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1?	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)?	at
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:960)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 ? --- An unexpected error occurred in the server ---??Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1??Stacktrace:??org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1?Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1?	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)?	at]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665520181717

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665520181717
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665520181717
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-11T20:34:07.5277256Z](https://github.com/apache/pulsar/actions/runs/3229794672/jobs/5287496883#step:8:1995)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665520181717

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665520181717
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665520181717
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.zookeeper.MockZooKeeper.multi(MockZooKeeper.java:1006)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.batchOperation(ZKMetadataStore.java:165)
	at org.apache.pulsar.metadata.impl.batching.AbstractBatchedMetadataStore.flush(AbstractBatchedMetadataStore.java:117)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665520181717
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 12 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665520181717
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 12 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor998.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:661)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:764)
	at org.testng.TestRunner.run(TestRunner.java:585)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:384)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)
	at org.testng.SuiteRunner.run(SuiteRunner.java:286)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1218)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1140)
	at org.testng.TestNG.runSuites(TestNG.java:1069)
	at org.testng.TestNG.run(TestNG.java:1037)
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665520181717

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665520181717
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665520181717
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.zookeeper.MockZooKeeper.multi(MockZooKeeper.java:1006)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.batchOperation(ZKMetadataStore.java:165)
	at org.apache.pulsar.metadata.impl.batching.AbstractBatchedMetadataStore.flush(AbstractBatchedMetadataStore.java:117)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665520181717
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 12 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665520181717
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 12 more

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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
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
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 ? --- An unexpected error occurred in the server ---??Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665520181717??Stacktrace:??org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665520181717?Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665520181717?	at java.base/java.util.concurrent.Completab
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:960)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 ? --- An unexpected error occurred in the server ---??Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665520181717??Stacktrace:??org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665520181717?Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665520181717?	at java.base/java.util.concurrent.Completab]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /admin/policies/my-property/my-ns
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:156)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-13T02:18:32.8764725Z](https://github.com/apache/pulsar/actions/runs/3239067534/jobs/5308020214#step:8:2106)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /admin/policies/my-property/my-ns
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:156)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor999.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:548)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:764)
	at org.testng.TestRunner.run(TestRunner.java:585)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:384)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)
	at org.testng.SuiteRunner.run(SuiteRunner.java:286)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1218)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1140)
	at org.testng.TestNG.runSuites(TestNG.java:1069)
	at org.testng.TestNG.run(TestNG.java:1037)
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /admin/policies/my-property/my-ns
		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:283)
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
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
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
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.NotFoundException: HTTP 404 org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /admin/policies/my-property/my-ns
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:948)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.NotFoundException: HTTP 404 org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /admin/policies/my-property/my-ns]

</pre></code>
</details>

