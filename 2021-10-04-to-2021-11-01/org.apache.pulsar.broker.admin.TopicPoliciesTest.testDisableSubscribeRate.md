        
Flaky-test: org.apache.pulsar.broker.admin.TopicPoliciesTest.testDisableSubscribeRate
Number of failures: 45

org.apache.pulsar.broker.admin.TopicPoliciesTest is flaky. The testDisableSubscribeRate test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException: HTTP 500 Internal Server Error
	at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:219)
	at org.apache.pulsar.client.admin.internal.BaseResource$3.failed(BaseResource.java:184)
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
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T07:28:37.8305534Z](https://github.com/apache/pulsar/runs/3891419194?check_suite_focus=true?check_suite_focus=true#step:9:5284)
[example failure 2021-10-14T07:03:00.8430259Z](https://github.com/apache/pulsar/runs/3891419194?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-13T15:31:18.9392161Z](https://github.com/apache/pulsar/runs/3884072644?check_suite_focus=true?check_suite_focus=true#step:9:8368)
[example failure 2021-10-13T01:46:37.2384696Z](https://github.com/apache/pulsar/runs/3877217335?check_suite_focus=true?check_suite_focus=true#step:9:6242)
[example failure 2021-10-12T04:53:21.8608322Z](https://github.com/apache/pulsar/runs/3866428402?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-12T02:57:28.3468429Z](https://github.com/apache/pulsar/runs/3865759005?check_suite_focus=true?check_suite_focus=true#step:9:4435)
[example failure 2021-10-09T07:21:56.3617743Z](https://github.com/apache/pulsar/runs/3845303776?check_suite_focus=true?check_suite_focus=true#step:9:5520)
[example failure 2021-10-09T01:38:33.2605302Z](https://github.com/apache/pulsar/runs/3844247013?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-07T21:25:21.9706367Z](https://github.com/apache/pulsar/runs/3831980230?check_suite_focus=true?check_suite_focus=true#step:9:4467)
[example failure 2021-10-06T03:45:44.0546714Z](https://github.com/apache/pulsar/runs/3810510251?check_suite_focus=true?check_suite_focus=true#step:9:775)
[example failure 2021-10-05T05:48:07.5922349Z](https://github.com/apache/pulsar/runs/3799683536?check_suite_focus=true?check_suite_focus=true#step:9:3571)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException: HTTP 500 Internal Server Error
	at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:219)
	at org.apache.pulsar.client.admin.internal.BaseResource$3.failed(BaseResource.java:184)
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
	at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:228)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2073)
	at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:270)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2073)
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
	at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:324)
	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:296)
	at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
	at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
	at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:719)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:655)
	at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:581)
	at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:493)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 Internal Server Error
	at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:960)
	at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
	... 54 more

</pre></code>
</details>

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.broker.admin.TopicPoliciesTest that uses java.lang.reflect.Field, java.lang.reflect.Fieldorg.apache.pulsar.broker.service.persistent.PersistentTopic expected [true] but found [false] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.broker.admin.TopicPoliciesTest.testDisableSubscribeRate(TopicPoliciesTest.java:1530)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T12:15:32.0212923Z](https://github.com/apache/pulsar/runs/3893867850?check_suite_focus=true?check_suite_focus=true#step:9:5648)
[example failure 2021-10-14T10:14:31.0903318Z](https://github.com/apache/pulsar/runs/3893041378?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-14T09:56:32.9951163Z](https://github.com/apache/pulsar/runs/3892561604?check_suite_focus=true?check_suite_focus=true#step:9:4383)
[example failure 2021-10-14T07:48:20.6450295Z](https://github.com/apache/pulsar/runs/3891784570?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-14T07:19:31.8495510Z](https://github.com/apache/pulsar/runs/3891551509?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-14T07:15:19.3959797Z](https://github.com/apache/pulsar/runs/3891419194?check_suite_focus=true?check_suite_focus=true#step:9:4458)
[example failure 2021-10-14T00:01:18.0750245Z](https://github.com/apache/pulsar/runs/3888853715?check_suite_focus=true?check_suite_focus=true#step:9:4401)
[example failure 2021-10-13T20:25:52.9024829Z](https://github.com/apache/pulsar/runs/3887305673?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-13T15:24:15.2986336Z](https://github.com/apache/pulsar/runs/3884143127?check_suite_focus=true?check_suite_focus=true#step:9:4406)
[example failure 2021-10-12T14:27:55.1840275Z](https://github.com/apache/pulsar/runs/3871545411?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-12T13:05:18.2247824Z](https://github.com/apache/pulsar/runs/3870600532?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-12T07:57:17.4798667Z](https://github.com/apache/pulsar/runs/3867503794?check_suite_focus=true?check_suite_focus=true#step:9:4231)
[example failure 2021-10-12T06:33:37.7541304Z](https://github.com/apache/pulsar/runs/3866940285?check_suite_focus=true?check_suite_focus=true#step:9:4361)
[example failure 2021-10-12T02:43:09.8650905Z](https://github.com/apache/pulsar/runs/3865759005?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-11T20:00:50.8992734Z](https://github.com/apache/pulsar/runs/3863161653?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-11T10:50:12.4958079Z](https://github.com/apache/pulsar/runs/3858046139?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-10T07:47:58.9340584Z](https://github.com/apache/pulsar/runs/3850227525?check_suite_focus=true?check_suite_focus=true#step:9:8083)
[example failure 2021-10-10T03:43:09.2749931Z](https://github.com/apache/pulsar/runs/3849391168?check_suite_focus=true?check_suite_focus=true#step:9:5247)
[example failure 2021-10-10T03:29:06.3276094Z](https://github.com/apache/pulsar/runs/3849391168?check_suite_focus=true?check_suite_focus=true#step:9:1016)
[example failure 2021-10-09T01:51:55.5912367Z](https://github.com/apache/pulsar/runs/3844189021?check_suite_focus=true?check_suite_focus=true#step:9:8112)
[example failure 2021-10-09T01:38:06.0430017Z](https://github.com/apache/pulsar/runs/3844189021?check_suite_focus=true?check_suite_focus=true#step:9:3881)
[example failure 2021-10-08T20:06:39.6206701Z](https://github.com/apache/pulsar/runs/3842296785?check_suite_focus=true?check_suite_focus=true#step:9:4406)
[example failure 2021-10-08T10:18:29.0401982Z](https://github.com/apache/pulsar/runs/3837218633?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-08T09:22:16.4899800Z](https://github.com/apache/pulsar/runs/3836736086?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-08T05:04:11.2088248Z](https://github.com/apache/pulsar/runs/3834932992?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-08T00:22:27.7493721Z](https://github.com/apache/pulsar/runs/3833183138?check_suite_focus=true?check_suite_focus=true#step:9:6676)
[example failure 2021-10-07T21:40:42.5380826Z](https://github.com/apache/pulsar/runs/3832038782?check_suite_focus=true?check_suite_focus=true#step:9:5680)
[example failure 2021-10-07T20:54:09.2824887Z](https://github.com/apache/pulsar/runs/3831980230?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-07T15:04:30.4665157Z](https://github.com/apache/pulsar/runs/3828444600?check_suite_focus=true?check_suite_focus=true#step:9:4430)
[example failure 2021-10-07T14:50:37.7262429Z](https://github.com/apache/pulsar/runs/3828444600?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-07T09:46:56.3487749Z](https://github.com/apache/pulsar/runs/3825224562?check_suite_focus=true?check_suite_focus=true#step:9:1408)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.broker.admin.TopicPoliciesTest that uses java.lang.reflect.Field, java.lang.reflect.Fieldorg.apache.pulsar.broker.service.persistent.PersistentTopic expected [true] but found [false] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.broker.admin.TopicPoliciesTest.testDisableSubscribeRate(TopicPoliciesTest.java:1530)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.broker.admin.TopicPoliciesTest.lambda$testDisableSubscribeRate$100(TopicPoliciesTest.java:1532)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:222)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:209)
	... 4 more

</pre></code>
</details>

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.broker.admin.TopicPoliciesTest that uses java.lang.reflect.Field, java.lang.reflect.Fieldorg.apache.pulsar.broker.service.persistent.PersistentTopic expected [true] but found [false] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.broker.admin.TopicPoliciesTest.testDisableSubscribeRate(TopicPoliciesTest.java:1532)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-15T07:04:40.9089752Z](https://github.com/apache/pulsar/runs/3903179100?check_suite_focus=true?check_suite_focus=true#step:9:196)
[example failure 2021-10-14T15:31:38.6414151Z](https://github.com/apache/pulsar/runs/3896418757?check_suite_focus=true?check_suite_focus=true#step:9:196)
[example failure 2021-10-14T08:56:37.0807934Z](https://github.com/apache/pulsar/runs/3892043531?check_suite_focus=true?check_suite_focus=true#step:9:5335)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.broker.admin.TopicPoliciesTest that uses java.lang.reflect.Field, java.lang.reflect.Fieldorg.apache.pulsar.broker.service.persistent.PersistentTopic expected [true] but found [false] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.broker.admin.TopicPoliciesTest.testDisableSubscribeRate(TopicPoliciesTest.java:1532)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.broker.admin.TopicPoliciesTest.lambda$testDisableSubscribeRate$101(TopicPoliciesTest.java:1534)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:222)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:209)
	... 4 more

</pre></code>
</details>

