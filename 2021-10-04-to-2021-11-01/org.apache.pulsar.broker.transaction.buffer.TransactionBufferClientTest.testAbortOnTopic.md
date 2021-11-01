        
Flaky-test: org.apache.pulsar.broker.transaction.buffer.TransactionBufferClientTest.testAbortOnTopic
Number of failures: 3

org.apache.pulsar.broker.transaction.buffer.TransactionBufferClientTest is flaky. The testAbortOnTopic test method fails sporadically.

```
java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.transaction.TransactionBufferClientException$RequestTimeoutException: Transaction buffer request timeout.
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.broker.transaction.buffer.TransactionBufferClientTest.testAbortOnTopic(TransactionBufferClientTest.java:122)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-08T05:45:50.3336855Z](https://github.com/apache/pulsar/runs/3834932992?check_suite_focus=true?check_suite_focus=true#step:9:5524)
[example failure 2021-10-04T15:04:31.0356094Z](https://github.com/apache/pulsar/runs/3792268877?check_suite_focus=true?check_suite_focus=true#step:9:4961)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.transaction.TransactionBufferClientException$RequestTimeoutException: Transaction buffer request timeout.
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.broker.transaction.buffer.TransactionBufferClientTest.testAbortOnTopic(TransactionBufferClientTest.java:122)
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
Caused by: org.apache.pulsar.client.api.transaction.TransactionBufferClientException$RequestTimeoutException: Transaction buffer request timeout.
	at org.apache.pulsar.broker.transaction.buffer.impl.TransactionBufferHandlerImpl.run(TransactionBufferHandlerImpl.java:240)
	at io.netty.util.HashedWheelTimer$HashedWheelTimeout.expire(HashedWheelTimer.java:669)
	at io.netty.util.HashedWheelTimer$HashedWheelBucket.expireTimeouts(HashedWheelTimer.java:744)
	at io.netty.util.HashedWheelTimer$Worker.run(HashedWheelTimer.java:469)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

```
java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.lang.Exception: java.util.concurrent.CompletionException: org.apache.pulsar.client.api.PulsarClientException$ConsumerBusyException: {"errorMsg":"Exclusive consumer is already connected","reqId":888059402843102856, "remote":"localhost/127.0.0.1:37099", "local":"/127.0.0.1:39416"}
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.broker.transaction.buffer.TransactionBufferClientTest.testAbortOnTopic(TransactionBufferClientTest.java:122)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-05T07:49:59.6673318Z](https://github.com/apache/pulsar/runs/3800317380?check_suite_focus=true?check_suite_focus=true#step:9:8100)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.lang.Exception: java.util.concurrent.CompletionException: org.apache.pulsar.client.api.PulsarClientException$ConsumerBusyException: {"errorMsg":"Exclusive consumer is already connected","reqId":888059402843102856, "remote":"localhost/127.0.0.1:37099", "local":"/127.0.0.1:39416"}
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.broker.transaction.buffer.TransactionBufferClientTest.testAbortOnTopic(TransactionBufferClientTest.java:122)
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
Caused by: org.apache.pulsar.client.api.PulsarClientException: java.lang.Exception: java.util.concurrent.CompletionException: org.apache.pulsar.client.api.PulsarClientException$ConsumerBusyException: {"errorMsg":"Exclusive consumer is already connected","reqId":888059402843102856, "remote":"localhost/127.0.0.1:37099", "local":"/127.0.0.1:39416"}
	at org.apache.pulsar.client.impl.ClientCnx.getPulsarClientException(ClientCnx.java:1145)
	at org.apache.pulsar.broker.transaction.buffer.impl.TransactionBufferHandlerImpl.handleEndTxnOnTopicResponse(TransactionBufferHandlerImpl.java:180)
	at org.apache.pulsar.client.impl.ClientCnx.handleEndTxnOnPartitionResponse(ClientCnx.java:963)
	at org.apache.pulsar.common.protocol.PulsarDecoder.channelRead(PulsarDecoder.java:411)
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

