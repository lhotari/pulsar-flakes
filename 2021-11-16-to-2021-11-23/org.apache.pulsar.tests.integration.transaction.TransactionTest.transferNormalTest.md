        
Flaky-test: org.apache.pulsar.tests.integration.transaction.TransactionTest.transferNormalTest
Number of failures: 1

org.apache.pulsar.tests.integration.transaction.TransactionTest is flaky. The transferNormalTest test method fails sporadically.

```
org.apache.pulsar.client.api.PulsarClientException: org.apache.pulsar.client.api.transaction.TransactionCoordinatorClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$ConnectException: Disconnected from server at localhost/127.0.0.1:49173
	at org.apache.pulsar.client.impl.PulsarClientImpl.<init>(PulsarClientImpl.java:193)
	at org.apache.pulsar.client.impl.PulsarClientImpl.<init>(PulsarClientImpl.java:156)
	at org.apache.pulsar.client.impl.PulsarClientImpl.<init>(PulsarClientImpl.java:137)
	at org.apache.pulsar.client.impl.ClientBuilderImpl.build(ClientBuilderImpl.java:68)
	at org.apache.pulsar.tests.integration.transaction.TransactionTest.transferNormalTest(TransactionTest.java:80)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-16T16:24:34.1801813Z](https://github.com/apache/pulsar/runs/4226997315?check_suite_focus=true?check_suite_focus=true#step:13:2548)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: org.apache.pulsar.client.api.transaction.TransactionCoordinatorClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$ConnectException: Disconnected from server at localhost/127.0.0.1:49173
	at org.apache.pulsar.client.impl.PulsarClientImpl.<init>(PulsarClientImpl.java:193)
	at org.apache.pulsar.client.impl.PulsarClientImpl.<init>(PulsarClientImpl.java:156)
	at org.apache.pulsar.client.impl.PulsarClientImpl.<init>(PulsarClientImpl.java:137)
	at org.apache.pulsar.client.impl.ClientBuilderImpl.build(ClientBuilderImpl.java:68)
	at org.apache.pulsar.tests.integration.transaction.TransactionTest.transferNormalTest(TransactionTest.java:80)
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
Caused by: org.apache.pulsar.client.api.transaction.TransactionCoordinatorClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$ConnectException: Disconnected from server at localhost/127.0.0.1:49173
	at org.apache.pulsar.client.api.transaction.TransactionCoordinatorClientException.unwrap(TransactionCoordinatorClientException.java:130)
	at org.apache.pulsar.client.impl.transaction.TransactionCoordinatorClientImpl.start(TransactionCoordinatorClientImpl.java:71)
	at org.apache.pulsar.client.impl.PulsarClientImpl.<init>(PulsarClientImpl.java:190)
	... 16 more
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$ConnectException: Disconnected from server at localhost/127.0.0.1:49173
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.transaction.TransactionCoordinatorClientImpl.start(TransactionCoordinatorClientImpl.java:69)
	... 17 more
Caused by: org.apache.pulsar.client.api.PulsarClientException$ConnectException: Disconnected from server at localhost/127.0.0.1:49173
	at org.apache.pulsar.client.impl.ClientCnx.channelInactive(ClientCnx.java:262)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelInactive(AbstractChannelHandlerContext.java:262)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelInactive(AbstractChannelHandlerContext.java:248)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelInactive(AbstractChannelHandlerContext.java:241)
	at io.netty.handler.codec.ByteToMessageDecoder.channelInputClosed(ByteToMessageDecoder.java:389)
	at io.netty.handler.codec.ByteToMessageDecoder.channelInactive(ByteToMessageDecoder.java:354)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelInactive(AbstractChannelHandlerContext.java:262)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelInactive(AbstractChannelHandlerContext.java:248)
	at io.netty.channel.AbstractChannelHandlerContext.fireChannelInactive(AbstractChannelHandlerContext.java:241)
	at io.netty.channel.DefaultChannelPipeline$HeadContext.channelInactive(DefaultChannelPipeline.java:1405)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelInactive(AbstractChannelHandlerContext.java:262)
	at io.netty.channel.AbstractChannelHandlerContext.invokeChannelInactive(AbstractChannelHandlerContext.java:248)
	at io.netty.channel.DefaultChannelPipeline.fireChannelInactive(DefaultChannelPipeline.java:901)
	at io.netty.channel.AbstractChannel$AbstractUnsafe$8.run(AbstractChannel.java:831)
	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:164)
	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:469)
	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:384)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:986)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

