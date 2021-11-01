        
Flaky-test: org.apache.pulsar.broker.systopic.PartitionedSystemTopicTest.testAutoCreatedPartitionedSystemTopic
Number of failures: 1

org.apache.pulsar.broker.systopic.PartitionedSystemTopicTest is flaky. The testAutoCreatedPartitionedSystemTopic test method fails sporadically.

```
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$IncompatibleSchemaException: {"errorMsg":"Topic does not have schema to check","reqId":3035278409931421810, "remote":"localhost/127.0.0.1:35649", "local":"/127.0.0.1:51280"}
	at org.apache.pulsar.broker.systopic.SystemTopicClientBase.newReader(SystemTopicClientBase.java:53)
	at org.apache.pulsar.broker.systopic.PartitionedSystemTopicTest.testAutoCreatedPartitionedSystemTopic(PartitionedSystemTopicTest.java:61)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-20T20:40:58.4198409Z](https://github.com/apache/pulsar/runs/3956389227?check_suite_focus=true?check_suite_focus=true#step:9:522)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$IncompatibleSchemaException: {"errorMsg":"Topic does not have schema to check","reqId":3035278409931421810, "remote":"localhost/127.0.0.1:35649", "local":"/127.0.0.1:51280"}
	at org.apache.pulsar.broker.systopic.SystemTopicClientBase.newReader(SystemTopicClientBase.java:53)
	at org.apache.pulsar.broker.systopic.PartitionedSystemTopicTest.testAutoCreatedPartitionedSystemTopic(PartitionedSystemTopicTest.java:61)
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
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$IncompatibleSchemaException: {"errorMsg":"Topic does not have schema to check","reqId":3035278409931421810, "remote":"localhost/127.0.0.1:35649", "local":"/127.0.0.1:51280"}
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.broker.systopic.SystemTopicClientBase.newReader(SystemTopicClientBase.java:51)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException$IncompatibleSchemaException: {"errorMsg":"Topic does not have schema to check","reqId":3035278409931421810, "remote":"localhost/127.0.0.1:35649", "local":"/127.0.0.1:51280"}
	at org.apache.pulsar.client.impl.ClientCnx.getPulsarClientException(ClientCnx.java:1162)
	at org.apache.pulsar.client.impl.ClientCnx.handleError(ClientCnx.java:708)
	at org.apache.pulsar.common.protocol.PulsarDecoder.channelRead(PulsarDecoder.java:177)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
	at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:324)
	at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:296)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
	at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
	at io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe.epollInReady(AbstractEpollStreamChannel.java:795)
	at io.netty.channel.epoll.EpollEventLoop.processReady(EpollEventLoop.java:480)
	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:378)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

