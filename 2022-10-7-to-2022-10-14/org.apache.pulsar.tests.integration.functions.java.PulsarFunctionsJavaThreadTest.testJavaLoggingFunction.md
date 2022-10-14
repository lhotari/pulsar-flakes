        
Flaky-test: org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaThreadTest.testJavaLoggingFunction
Number of failures: 13

org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaThreadTest is flaky. The testJavaLoggingFunction test method fails sporadically.

```
java.lang.AssertionError: expected [10] but found [0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.getFunctionStats(PulsarFunctionsTest.java:1013)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testLoggingFunction(PulsarFunctionsTest.java:1521)
	at org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testJavaLoggingFunction(PulsarFunctionsJavaTest.java:111)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-08-31T18:45:20.2388237Z](https://github.com/apache/pulsar/runs/8120277303?check_suite_focus=true#step:11:18337)  
[example failure 2022-08-31T12:53:19.7542975Z](https://github.com/apache/pulsar/runs/8113444458?check_suite_focus=true#step:11:19306)  
[example failure 2022-08-31T12:42:42.6351818Z](https://github.com/apache/pulsar/runs/8113263718?check_suite_focus=true#step:11:17903)  
[example failure 2022-08-31T05:51:18.9580803Z](https://github.com/apache/pulsar/runs/8106541789?check_suite_focus=true#step:11:19151)  
[example failure 2022-08-30T20:55:54.5434339Z](https://github.com/apache/pulsar/runs/8101165782?check_suite_focus=true#step:11:18531)  
[example failure 2022-08-30T02:44:33.0366129Z](https://github.com/apache/pulsar/runs/8083513069?check_suite_focus=true#step:11:17852)  
[example failure 2022-08-27T05:54:11.7488235Z](https://github.com/apache/pulsar/runs/8048209220?check_suite_focus=true#step:11:19877)  
[example failure 2022-08-27T02:19:21.5423960Z](https://github.com/apache/pulsar/runs/8047093798?check_suite_focus=true#step:11:18305)  
[example failure 2022-08-27T01:46:09.1667394Z](https://github.com/apache/pulsar/runs/8046904897?check_suite_focus=true#step:11:18157)  
[example failure 2022-08-25T21:02:22.3000614Z](https://github.com/apache/pulsar/runs/8017853276?check_suite_focus=true#step:11:19856)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [10] but found [0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.getFunctionStats(PulsarFunctionsTest.java:1013)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testLoggingFunction(PulsarFunctionsTest.java:1521)
	at org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testJavaLoggingFunction(PulsarFunctionsJavaTest.java:111)
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

</pre></code>
</details>

[example failure 2022-08-31T14:57:49.0804907Z](https://github.com/apache/pulsar/runs/8115931905?check_suite_focus=true#step:11:18934)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [10] but found [0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.getFunctionStats(PulsarFunctionsTest.java:1013)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testLoggingFunction(PulsarFunctionsTest.java:1521)
	at org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testJavaLoggingFunction(PulsarFunctionsJavaTest.java:111)
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

2022-08-31T14:57:49,023 - INFO  - [docker-java-stream--1030632918:DockerUtils$4@383] - DOCKER.exec(PulsarFunctionsJavaThreadTest-oujtf-pulsar-broker-1:tail -f /var/log/pulsar/broker.log): STDOUT: 2022-08-31T14:57:48,343+0000 [Thread-54] INFO  org.eclipse.jetty.server.RequestLog - 172.20.0.9 - - [31/Aug/2022:14:57:48 +0000] "GET /admin/v2/persistent/public/functions/coordinate/stats?getPreciseBacklog=false&authoritative=true&subscriptionBacklogSize=false&getEarliestTimeInBacklog=false HTTP/1.1" 200 3251 "-" "Pulsar-Java-v2.11.0-SNAPSHOT" 4
</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException: HTTP 502 Bad Gateway
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:316)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.getStats(TopicsImpl.java:625)
	at org.apache.pulsar.client.admin.Topics.getStats(Topics.java:1136)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.publishAndConsumeMessages(PulsarFunctionsTest.java:1594)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testLoggingFunction(PulsarFunctionsTest.java:1511)
	at org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testJavaLoggingFunction(PulsarFunctionsJavaTest.java:111)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-08-31T11:38:40.6471603Z](https://github.com/apache/pulsar/runs/8112133497?check_suite_focus=true#step:11:17837)  
[example failure 2022-08-30T04:54:16.4781351Z](https://github.com/apache/pulsar/runs/8084255947?check_suite_focus=true#step:11:18790)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException: HTTP 502 Bad Gateway
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:316)
	at org.apache.pulsar.client.admin.internal.TopicsImpl.getStats(TopicsImpl.java:625)
	at org.apache.pulsar.client.admin.Topics.getStats(Topics.java:1136)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.publishAndConsumeMessages(PulsarFunctionsTest.java:1594)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testLoggingFunction(PulsarFunctionsTest.java:1511)
	at org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testJavaLoggingFunction(PulsarFunctionsJavaTest.java:111)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException: HTTP 502 Bad Gateway
		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:237)
		at org.apache.pulsar.client.admin.internal.TopicsImpl$12.failed(TopicsImpl.java:647)
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
	Caused by: javax.ws.rs.ServerErrorException: HTTP 502 Bad Gateway
		at org.glassfish.jersey.client.JerseyInvocation.createExceptionForFamily(JerseyInvocation.java:988)
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:967)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.ServerErrorException: HTTP 502 Bad Gateway]

</pre></code>
</details>

