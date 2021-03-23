        
Flaky-test: org.apache.pulsar.broker.admin.AdminApiTest.testNamespaceSplitBundle
Number of failures: 1

org.apache.pulsar.broker.admin.AdminApiTest is flaky. The testNamespaceSplitBundle test method fails sporadically.

```
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: Producer was not registered on the connection
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1027)
	at org.apache.pulsar.client.impl.ProducerBase.close(ProducerBase.java:138)
	at org.apache.pulsar.broker.admin.AdminApiTest.testNamespaceSplitBundle(AdminApiTest.java:1230)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-19T09:12:04.8298337Z](https://github.com/apache/pulsar/runs/2146460755?check_suite_focus=true#step:9:711)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: Producer was not registered on the connection
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1027)
	at org.apache.pulsar.client.impl.ProducerBase.close(ProducerBase.java:138)
	at org.apache.pulsar.broker.admin.AdminApiTest.testNamespaceSplitBundle(AdminApiTest.java:1230)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: Producer was not registered on the connection
	at java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:357)
	at java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1908)
	at org.apache.pulsar.client.impl.ProducerBase.close(ProducerBase.java:136)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException: Producer was not registered on the connection
	at org.apache.pulsar.client.impl.ClientCnx.getPulsarClientException(ClientCnx.java:1122)
	at org.apache.pulsar.client.impl.ClientCnx.handleError(ClientCnx.java:694)
	at org.apache.pulsar.common.protocol.PulsarDecoder.channelRead(PulsarDecoder.java:176)
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
	at io.netty.channel.epoll.AbstractEpollStreamChannel$EpollStreamUnsafe.epollInReady(AbstractEpollStreamChannel.java:792)
	at io.netty.channel.epoll.EpollEventLoop.processReady(EpollEventLoop.java:475)
	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:378)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:989)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

