        
Flaky-test: org.apache.pulsar.broker.admin.v1.V1_AdminApiTest.reset
Number of failures: 1

org.apache.pulsar.broker.admin.v1.V1_AdminApiTest is flaky. The reset test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/[0:0:0:0:0:0:0:1]:33001
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TenantsImpl.getTenants(TenantsImpl.java:44)
	at org.apache.pulsar.broker.admin.v1.V1_AdminApiTest.reset(V1_AdminApiTest.java:193)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-07T06:21:00.6786903Z](https://github.com/apache/pulsar/actions/runs/14301942628/job/40078133073#step:11:930)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/[0:0:0:0:0:0:0:1]:33001
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:352)
	at org.apache.pulsar.client.admin.internal.TenantsImpl.getTenants(TenantsImpl.java:44)
	at org.apache.pulsar.broker.admin.v1.V1_AdminApiTest.reset(V1_AdminApiTest.java:193)
	at jdk.internal.reflect.GeneratedMethodAccessor654.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/[0:0:0:0:0:0:0:1]:33001
		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:300)
		at org.apache.pulsar.client.admin.internal.BaseResource$FutureCallback.failed(BaseResource.java:373)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:898)
		at org.glassfish.jersey.client.ClientRuntime.processFailure(ClientRuntime.java:250)
		at org.glassfish.jersey.client.ClientRuntime.processFailure(ClientRuntime.java:245)
		at org.glassfish.jersey.client.ClientRuntime.access$100(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$failure$1(ClientRuntime.java:181)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.failure(ClientRuntime.java:181)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:250)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:330)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.cancel(CompletableFuture.java:2480)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$executeRequest$10(AsyncHttpConnector.java:406)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
		at com.spotify.futures.ConcurrencyReducer.lambda$invoke$0(ConcurrencyReducer.java:169)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
		at org.asynchttpclient.netty.NettyResponseFuture.abort(NettyResponseFuture.java:273)
		at org.asynchttpclient.netty.channel.NettyConnectListener.onFailure(NettyConnectListener.java:181)
		at org.asynchttpclient.netty.channel.NettyChannelConnector$1.onFailure(NettyChannelConnector.java:108)
		at org.asynchttpclient.netty.SimpleChannelFutureListener.operationComplete(SimpleChannelFutureListener.java:28)
		at org.asynchttpclient.netty.SimpleChannelFutureListener.operationComplete(SimpleChannelFutureListener.java:20)
		at io.netty.util.concurrent.DefaultPromise.notifyListener0(DefaultPromise.java:590)
		at io.netty.util.concurrent.DefaultPromise.notifyListeners0(DefaultPromise.java:583)
		at io.netty.util.concurrent.DefaultPromise.notifyListenersNow(DefaultPromise.java:559)
		at io.netty.util.concurrent.DefaultPromise.notifyListeners(DefaultPromise.java:492)
		at io.netty.util.concurrent.DefaultPromise.setValue0(DefaultPromise.java:636)
		at io.netty.util.concurrent.DefaultPromise.setFailure0(DefaultPromise.java:629)
		at io.netty.util.concurrent.DefaultPromise.tryFailure(DefaultPromise.java:118)
		at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.fulfillConnectPromise(AbstractNioChannel.java:326)
		at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.finishConnect(AbstractNioChannel.java:342)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:784)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		at java.base/java.lang.Thread.run(Thread.java:840)
	Caused by: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/[0:0:0:0:0:0:0:1]:33001
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:332)
		... 36 more
	Caused by: java.net.ConnectException: Connection refused: localhost/[0:0:0:0:0:0:0:1]:33001
		at org.asynchttpclient.netty.channel.NettyConnectListener.onFailure(NettyConnectListener.java:179)
		... 20 more
	Caused by: io.netty.channel.AbstractChannel$AnnotatedConnectException: Connection refused: localhost/[0:0:0:0:0:0:0:1]:33001
	Caused by: java.net.ConnectException: Connection refused
		at java.base/sun.nio.ch.Net.pollConnect(Native Method)
		at java.base/sun.nio.ch.Net.pollConnectNow(Net.java:672)
		at java.base/sun.nio.ch.SocketChannelImpl.finishConnect(SocketChannelImpl.java:946)
		at io.netty.channel.socket.nio.NioSocketChannel.doFinishConnect(NioSocketChannel.java:336)
		at io.netty.channel.nio.AbstractNioChannel$AbstractNioUnsafe.finishConnect(AbstractNioChannel.java:339)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:784)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:732)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:562)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: [CIRCULAR REFERENCE: org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector$RetryException: Could not complete the operation. Number of retries has been exhausted. Failed reason: Connection refused: localhost/[0:0:0:0:0:0:0:1]:33001]

</pre></code>
</details>

