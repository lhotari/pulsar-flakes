        
Flaky-test: org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate
Number of failures: 56

org.apache.pulsar.broker.service.ReplicatorTest is flaky. The testTopicReplicatedAndProducerCreate test method fails sporadically.

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'2256945349988570448', 'remote':'localhost/127.0.0.1:37765', 'local':'/127.0.0.1:42908'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-07T21:33:07.3173157Z](https://github.com/apache/pulsar/runs/3832038782?check_suite_focus=true?check_suite_focus=true#step:9:4649)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'2256945349988570448', 'remote':'localhost/127.0.0.1:37765', 'local':'/127.0.0.1:42908'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:38411 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-05T06:48:58.8695595Z](https://github.com/apache/pulsar/runs/3799981373?check_suite_focus=true?check_suite_focus=true#step:9:3303)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:38411 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:38411 after 30000 ms
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:89)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:38411 after 30000 ms
	at org.apache.pulsar.client.impl.HttpClient.lambda$get$1(HttpClient.java:204)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.asynchttpclient.netty.NettyResponseFuture.abort(NettyResponseFuture.java:273)
	at org.asynchttpclient.netty.request.NettyRequestSender.abort(NettyRequestSender.java:473)
	at org.asynchttpclient.netty.timeout.TimeoutTimerTask.expire(TimeoutTimerTask.java:43)
	at org.asynchttpclient.netty.timeout.ReadTimeoutTimerTask.run(ReadTimeoutTimerTask.java:56)
	at io.netty.util.HashedWheelTimer$HashedWheelTimeout.expire(HashedWheelTimer.java:669)
	at io.netty.util.HashedWheelTimer$HashedWheelBucket.expireTimeouts(HashedWheelTimer.java:744)
	at io.netty.util.HashedWheelTimer$Worker.run(HashedWheelTimer.java:469)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more
Caused by: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:38411 after 30000 ms
	... 7 more

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'3125876586260722095', 'remote':'localhost/127.0.0.1:44195', 'local':'/127.0.0.1:40420'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-05T05:07:21.0427075Z](https://github.com/apache/pulsar/runs/3799300996?check_suite_focus=true?check_suite_focus=true#step:9:1690)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'3125876586260722095', 'remote':'localhost/127.0.0.1:44195', 'local':'/127.0.0.1:40420'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: Connection already closed
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-24T10:05:29.9596843Z](https://github.com/apache/pulsar/runs/3988166867?check_suite_focus=true?check_suite_focus=true#step:9:1204)
[example failure 2021-10-23T06:49:52.2845994Z](https://github.com/apache/pulsar/runs/3982788147?check_suite_focus=true?check_suite_focus=true#step:9:1684)
[example failure 2021-10-22T09:03:35.1547675Z](https://github.com/apache/pulsar/runs/3973602027?check_suite_focus=true?check_suite_focus=true#step:9:356)
[example failure 2021-10-20T19:24:36.0094816Z](https://github.com/apache/pulsar/runs/3955676840?check_suite_focus=true?check_suite_focus=true#step:9:380)
[example failure 2021-10-19T07:41:34.7691338Z](https://github.com/apache/pulsar/runs/3935901346?check_suite_focus=true?check_suite_focus=true#step:9:436)
[example failure 2021-10-18T03:41:06.4317260Z](https://github.com/apache/pulsar/runs/3922105030?check_suite_focus=true?check_suite_focus=true#step:9:410)
[example failure 2021-10-14T21:43:58.2917319Z](https://github.com/apache/pulsar/runs/3899814928?check_suite_focus=true?check_suite_focus=true#step:9:380)
[example failure 2021-10-13T07:17:43.1417121Z](https://github.com/apache/pulsar/runs/3879303280?check_suite_focus=true?check_suite_focus=true#step:9:406)
[example failure 2021-10-13T05:06:41.8416552Z](https://github.com/apache/pulsar/runs/3878517864?check_suite_focus=true?check_suite_focus=true#step:9:376)
[example failure 2021-10-13T01:36:24.0926446Z](https://github.com/apache/pulsar/runs/3877217335?check_suite_focus=true?check_suite_focus=true#step:9:4398)
[example failure 2021-10-12T10:04:46.4394073Z](https://github.com/apache/pulsar/runs/3868468858?check_suite_focus=true?check_suite_focus=true#step:9:10830)
[example failure 2021-10-08T09:49:52.8213962Z](https://github.com/apache/pulsar/runs/3836736086?check_suite_focus=true?check_suite_focus=true#step:9:1228)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: Connection already closed
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: Connection already closed
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:89)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException: Connection already closed
	at org.apache.pulsar.client.impl.ClientCnx.channelInactive(ClientCnx.java:260)
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

[example failure 2021-10-07T23:57:06.1609106Z](https://github.com/apache/pulsar/runs/3833183138?check_suite_focus=true?check_suite_focus=true#step:9:380)
[example failure 2021-10-05T18:55:36.1000525Z](https://github.com/apache/pulsar/runs/3806696934?check_suite_focus=true?check_suite_focus=true#step:9:554)
[example failure 2021-10-05T06:37:23.2908876Z](https://github.com/apache/pulsar/runs/3799981373?check_suite_focus=true?check_suite_focus=true#step:9:614)
[example failure 2021-10-05T04:11:18.2719707Z](https://github.com/apache/pulsar/runs/3799039989?check_suite_focus=true?check_suite_focus=true#step:9:8148)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: Connection already closed
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: Connection already closed
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:89)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException: Connection already closed
	at org.apache.pulsar.client.impl.ClientCnx.channelInactive(ClientCnx.java:255)
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

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'2496407747458538721', 'remote':'localhost/127.0.0.1:46675', 'local':'/127.0.0.1:42884'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-05T07:28:09.4949089Z](https://github.com/apache/pulsar/runs/3800317380?check_suite_focus=true?check_suite_focus=true#step:9:614)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'2496407747458538721', 'remote':'localhost/127.0.0.1:46675', 'local':'/127.0.0.1:42884'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:38737 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-22T02:37:00.5270408Z](https://github.com/apache/pulsar/runs/3971119963?check_suite_focus=true?check_suite_focus=true#step:9:380)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:38737 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:38737 after 30000 ms
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:89)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:38737 after 30000 ms
	at org.apache.pulsar.client.impl.HttpClient.lambda$get$1(HttpClient.java:204)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.asynchttpclient.netty.NettyResponseFuture.abort(NettyResponseFuture.java:273)
	at org.asynchttpclient.netty.request.NettyRequestSender.abort(NettyRequestSender.java:473)
	at org.asynchttpclient.netty.timeout.TimeoutTimerTask.expire(TimeoutTimerTask.java:43)
	at org.asynchttpclient.netty.timeout.ReadTimeoutTimerTask.run(ReadTimeoutTimerTask.java:56)
	at io.netty.util.HashedWheelTimer$HashedWheelTimeout.expire(HashedWheelTimer.java:669)
	at io.netty.util.HashedWheelTimer$HashedWheelBucket.expireTimeouts(HashedWheelTimer.java:744)
	at io.netty.util.HashedWheelTimer$Worker.run(HashedWheelTimer.java:469)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more
Caused by: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:38737 after 30000 ms
	... 7 more

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'4310156082089158516', 'remote':'localhost/127.0.0.1:39607', 'local':'/127.0.0.1:51742'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-25T01:15:32.2955001Z](https://github.com/apache/pulsar/runs/3991561519?check_suite_focus=true?check_suite_focus=true#step:9:362)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'4310156082089158516', 'remote':'localhost/127.0.0.1:39607', 'local':'/127.0.0.1:51742'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'459857690192248348', 'remote':'localhost/127.0.0.1:34261', 'local':'/127.0.0.1:46926'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-23T06:29:48.2620441Z](https://github.com/apache/pulsar/runs/3982788147?check_suite_focus=true?check_suite_focus=true#step:9:436)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'459857690192248348', 'remote':'localhost/127.0.0.1:34261', 'local':'/127.0.0.1:46926'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'2797344749389048089', 'remote':'localhost/127.0.0.1:41185', 'local':'/127.0.0.1:42126'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-24T09:42:15.9184349Z](https://github.com/apache/pulsar/runs/3988166867?check_suite_focus=true?check_suite_focus=true#step:9:386)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'2797344749389048089', 'remote':'localhost/127.0.0.1:41185', 'local':'/127.0.0.1:42126'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:44861 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-19T08:01:31.1731306Z](https://github.com/apache/pulsar/runs/3935901346?check_suite_focus=true?check_suite_focus=true#step:9:1257)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:44861 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:44861 after 30000 ms
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:89)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:44861 after 30000 ms
	at org.apache.pulsar.client.impl.HttpClient.lambda$get$1(HttpClient.java:204)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.asynchttpclient.netty.NettyResponseFuture.abort(NettyResponseFuture.java:273)
	at org.asynchttpclient.netty.request.NettyRequestSender.abort(NettyRequestSender.java:473)
	at org.asynchttpclient.netty.timeout.TimeoutTimerTask.expire(TimeoutTimerTask.java:43)
	at org.asynchttpclient.netty.timeout.ReadTimeoutTimerTask.run(ReadTimeoutTimerTask.java:56)
	at io.netty.util.HashedWheelTimer$HashedWheelTimeout.expire(HashedWheelTimer.java:669)
	at io.netty.util.HashedWheelTimer$HashedWheelBucket.expireTimeouts(HashedWheelTimer.java:744)
	at io.netty.util.HashedWheelTimer$Worker.run(HashedWheelTimer.java:469)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more
Caused by: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:44861 after 30000 ms
	... 7 more

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'3308556667308142110', 'remote':'localhost/127.0.0.1:38159', 'local':'/127.0.0.1:55610'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-25T03:45:36.8665312Z](https://github.com/apache/pulsar/runs/3992360779?check_suite_focus=true?check_suite_focus=true#step:9:414)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'3308556667308142110', 'remote':'localhost/127.0.0.1:38159', 'local':'/127.0.0.1:55610'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'4345682341150140525', 'remote':'localhost/127.0.0.1:36503', 'local':'/127.0.0.1:45984'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-07T09:39:32.4693314Z](https://github.com/apache/pulsar/runs/3825224562?check_suite_focus=true?check_suite_focus=true#step:9:452)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'4345682341150140525', 'remote':'localhost/127.0.0.1:36503', 'local':'/127.0.0.1:45984'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:41133 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-15T02:56:00.0324236Z](https://github.com/apache/pulsar/runs/3901845758?check_suite_focus=true?check_suite_focus=true#step:9:404)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:41133 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:41133 after 30000 ms
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:89)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:41133 after 30000 ms
	at org.apache.pulsar.client.impl.HttpClient.lambda$get$1(HttpClient.java:204)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.asynchttpclient.netty.NettyResponseFuture.abort(NettyResponseFuture.java:273)
	at org.asynchttpclient.netty.request.NettyRequestSender.abort(NettyRequestSender.java:473)
	at org.asynchttpclient.netty.timeout.TimeoutTimerTask.expire(TimeoutTimerTask.java:43)
	at org.asynchttpclient.netty.timeout.ReadTimeoutTimerTask.run(ReadTimeoutTimerTask.java:56)
	at io.netty.util.HashedWheelTimer$HashedWheelTimeout.expire(HashedWheelTimer.java:669)
	at io.netty.util.HashedWheelTimer$HashedWheelBucket.expireTimeouts(HashedWheelTimer.java:744)
	at io.netty.util.HashedWheelTimer$Worker.run(HashedWheelTimer.java:469)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more
Caused by: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:41133 after 30000 ms
	... 7 more

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:34723 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T10:12:51.4714481Z](https://github.com/apache/pulsar/runs/3892711834?check_suite_focus=true?check_suite_focus=true#step:9:366)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:34723 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:34723 after 30000 ms
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:89)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:34723 after 30000 ms
	at org.apache.pulsar.client.impl.HttpClient.lambda$get$1(HttpClient.java:204)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.asynchttpclient.netty.NettyResponseFuture.abort(NettyResponseFuture.java:273)
	at org.asynchttpclient.netty.request.NettyRequestSender.abort(NettyRequestSender.java:473)
	at org.asynchttpclient.netty.timeout.TimeoutTimerTask.expire(TimeoutTimerTask.java:43)
	at org.asynchttpclient.netty.timeout.ReadTimeoutTimerTask.run(ReadTimeoutTimerTask.java:56)
	at io.netty.util.HashedWheelTimer$HashedWheelTimeout.expire(HashedWheelTimer.java:669)
	at io.netty.util.HashedWheelTimer$HashedWheelBucket.expireTimeouts(HashedWheelTimer.java:744)
	at io.netty.util.HashedWheelTimer$Worker.run(HashedWheelTimer.java:469)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more
Caused by: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:34723 after 30000 ms
	... 7 more

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'211859161139307773', 'remote':'localhost/127.0.0.1:33061', 'local':'/127.0.0.1:46206'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-25T15:31:02.4416467Z](https://github.com/apache/pulsar/runs/3998605221?check_suite_focus=true?check_suite_focus=true#step:9:410)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'211859161139307773', 'remote':'localhost/127.0.0.1:33061', 'local':'/127.0.0.1:46206'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'2991324927245012982', 'remote':'localhost/127.0.0.1:41727', 'local':'/127.0.0.1:57918'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-15T01:21:55.4730720Z](https://github.com/apache/pulsar/runs/3901276867?check_suite_focus=true?check_suite_focus=true#step:9:406)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'2991324927245012982', 'remote':'localhost/127.0.0.1:41727', 'local':'/127.0.0.1:57918'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:38495 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-05T07:03:58.7443353Z](https://github.com/apache/pulsar/runs/3799981373?check_suite_focus=true?check_suite_focus=true#step:9:6167)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:38495 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:38495 after 30000 ms
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:89)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:38495 after 30000 ms
	at org.apache.pulsar.client.impl.HttpClient.lambda$get$1(HttpClient.java:204)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.asynchttpclient.netty.NettyResponseFuture.abort(NettyResponseFuture.java:273)
	at org.asynchttpclient.netty.request.NettyRequestSender.abort(NettyRequestSender.java:473)
	at org.asynchttpclient.netty.timeout.TimeoutTimerTask.expire(TimeoutTimerTask.java:43)
	at org.asynchttpclient.netty.timeout.ReadTimeoutTimerTask.run(ReadTimeoutTimerTask.java:56)
	at io.netty.util.HashedWheelTimer$HashedWheelTimeout.expire(HashedWheelTimer.java:669)
	at io.netty.util.HashedWheelTimer$HashedWheelBucket.expireTimeouts(HashedWheelTimer.java:744)
	at io.netty.util.HashedWheelTimer$Worker.run(HashedWheelTimer.java:469)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more
Caused by: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:38495 after 30000 ms
	... 7 more

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'181847103725064038', 'remote':'localhost/127.0.0.1:44251', 'local':'/127.0.0.1:58994'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-08T10:59:29.1619541Z](https://github.com/apache/pulsar/runs/3837385360?check_suite_focus=true?check_suite_focus=true#step:9:4588)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'181847103725064038', 'remote':'localhost/127.0.0.1:44251', 'local':'/127.0.0.1:58994'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:32915 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-28T17:26:29.9970104Z](https://github.com/apache/pulsar/runs/4037573326?check_suite_focus=true?check_suite_focus=true#step:9:366)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:32915 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:32915 after 30000 ms
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:89)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:32915 after 30000 ms
	at org.apache.pulsar.client.impl.HttpClient.lambda$get$1(HttpClient.java:204)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.asynchttpclient.netty.NettyResponseFuture.abort(NettyResponseFuture.java:273)
	at org.asynchttpclient.netty.request.NettyRequestSender.abort(NettyRequestSender.java:473)
	at org.asynchttpclient.netty.timeout.TimeoutTimerTask.expire(TimeoutTimerTask.java:43)
	at org.asynchttpclient.netty.timeout.ReadTimeoutTimerTask.run(ReadTimeoutTimerTask.java:56)
	at io.netty.util.HashedWheelTimer$HashedWheelTimeout.expire(HashedWheelTimer.java:669)
	at io.netty.util.HashedWheelTimer$HashedWheelBucket.expireTimeouts(HashedWheelTimer.java:744)
	at io.netty.util.HashedWheelTimer$Worker.run(HashedWheelTimer.java:469)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more
Caused by: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:32915 after 30000 ms
	... 7 more

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:43695 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-15T01:57:45.8472823Z](https://github.com/apache/pulsar/runs/3901517512?check_suite_focus=true?check_suite_focus=true#step:9:384)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:43695 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:43695 after 30000 ms
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:89)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:43695 after 30000 ms
	at org.apache.pulsar.client.impl.HttpClient.lambda$get$1(HttpClient.java:204)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.asynchttpclient.netty.NettyResponseFuture.abort(NettyResponseFuture.java:273)
	at org.asynchttpclient.netty.request.NettyRequestSender.abort(NettyRequestSender.java:473)
	at org.asynchttpclient.netty.timeout.TimeoutTimerTask.expire(TimeoutTimerTask.java:43)
	at org.asynchttpclient.netty.timeout.ReadTimeoutTimerTask.run(ReadTimeoutTimerTask.java:56)
	at io.netty.util.HashedWheelTimer$HashedWheelTimeout.expire(HashedWheelTimer.java:669)
	at io.netty.util.HashedWheelTimer$HashedWheelBucket.expireTimeouts(HashedWheelTimer.java:744)
	at io.netty.util.HashedWheelTimer$Worker.run(HashedWheelTimer.java:469)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more
Caused by: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:43695 after 30000 ms
	... 7 more

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'603579795825382117', 'remote':'localhost/127.0.0.1:44979', 'local':'/127.0.0.1:36012'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-20T08:37:13.7727915Z](https://github.com/apache/pulsar/runs/3948920935?check_suite_focus=true?check_suite_focus=true#step:9:416)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'603579795825382117', 'remote':'localhost/127.0.0.1:44979', 'local':'/127.0.0.1:36012'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:33331 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-05T08:14:36.6290559Z](https://github.com/apache/pulsar/runs/3800698763?check_suite_focus=true?check_suite_focus=true#step:9:642)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:33331 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:33331 after 30000 ms
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:89)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:33331 after 30000 ms
	at org.apache.pulsar.client.impl.HttpClient.lambda$get$1(HttpClient.java:204)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.asynchttpclient.netty.NettyResponseFuture.abort(NettyResponseFuture.java:273)
	at org.asynchttpclient.netty.request.NettyRequestSender.abort(NettyRequestSender.java:473)
	at org.asynchttpclient.netty.timeout.TimeoutTimerTask.expire(TimeoutTimerTask.java:43)
	at org.asynchttpclient.netty.timeout.ReadTimeoutTimerTask.run(ReadTimeoutTimerTask.java:56)
	at io.netty.util.HashedWheelTimer$HashedWheelTimeout.expire(HashedWheelTimer.java:669)
	at io.netty.util.HashedWheelTimer$HashedWheelBucket.expireTimeouts(HashedWheelTimer.java:744)
	at io.netty.util.HashedWheelTimer$Worker.run(HashedWheelTimer.java:469)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more
Caused by: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:33331 after 30000 ms
	... 7 more

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'3885088651231916957', 'remote':'localhost/127.0.0.1:38265', 'local':'/127.0.0.1:58040'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T01:36:56.2177730Z](https://github.com/apache/pulsar/runs/3889477087?check_suite_focus=true?check_suite_focus=true#step:9:362)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'3885088651231916957', 'remote':'localhost/127.0.0.1:38265', 'local':'/127.0.0.1:58040'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:38779 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-05T06:42:37.7050808Z](https://github.com/apache/pulsar/runs/3799834745?check_suite_focus=true?check_suite_focus=true#step:9:1714)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:38779 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:38779 after 30000 ms
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:89)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:38779 after 30000 ms
	at org.apache.pulsar.client.impl.HttpClient.lambda$get$1(HttpClient.java:204)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.asynchttpclient.netty.NettyResponseFuture.abort(NettyResponseFuture.java:273)
	at org.asynchttpclient.netty.request.NettyRequestSender.abort(NettyRequestSender.java:473)
	at org.asynchttpclient.netty.timeout.TimeoutTimerTask.expire(TimeoutTimerTask.java:43)
	at org.asynchttpclient.netty.timeout.ReadTimeoutTimerTask.run(ReadTimeoutTimerTask.java:56)
	at io.netty.util.HashedWheelTimer$HashedWheelTimeout.expire(HashedWheelTimer.java:669)
	at io.netty.util.HashedWheelTimer$HashedWheelBucket.expireTimeouts(HashedWheelTimer.java:744)
	at io.netty.util.HashedWheelTimer$Worker.run(HashedWheelTimer.java:469)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more
Caused by: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:38779 after 30000 ms
	... 7 more

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'1104209340452181840', 'remote':'localhost/127.0.0.1:37929', 'local':'/127.0.0.1:45230'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-15T11:13:11.6783367Z](https://github.com/apache/pulsar/runs/3905107925?check_suite_focus=true?check_suite_focus=true#step:9:426)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'1104209340452181840', 'remote':'localhost/127.0.0.1:37929', 'local':'/127.0.0.1:45230'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'3635007631584495181', 'remote':'localhost/127.0.0.1:43905', 'local':'/127.0.0.1:37422'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-26T01:28:25.9787405Z](https://github.com/apache/pulsar/runs/4004149232?check_suite_focus=true?check_suite_focus=true#step:9:436)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'3635007631584495181', 'remote':'localhost/127.0.0.1:43905', 'local':'/127.0.0.1:37422'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:46267 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-22T02:59:48.6121313Z](https://github.com/apache/pulsar/runs/3971119963?check_suite_focus=true?check_suite_focus=true#step:9:2635)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:46267 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:46267 after 30000 ms
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:89)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:46267 after 30000 ms
	at org.apache.pulsar.client.impl.HttpClient.lambda$get$1(HttpClient.java:204)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.asynchttpclient.netty.NettyResponseFuture.abort(NettyResponseFuture.java:273)
	at org.asynchttpclient.netty.request.NettyRequestSender.abort(NettyRequestSender.java:473)
	at org.asynchttpclient.netty.timeout.TimeoutTimerTask.expire(TimeoutTimerTask.java:43)
	at org.asynchttpclient.netty.timeout.ReadTimeoutTimerTask.run(ReadTimeoutTimerTask.java:56)
	at io.netty.util.HashedWheelTimer$HashedWheelTimeout.expire(HashedWheelTimer.java:669)
	at io.netty.util.HashedWheelTimer$HashedWheelBucket.expireTimeouts(HashedWheelTimer.java:744)
	at io.netty.util.HashedWheelTimer$Worker.run(HashedWheelTimer.java:469)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more
Caused by: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:46267 after 30000 ms
	... 7 more

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'4426919402754056335', 'remote':'localhost/127.0.0.1:38901', 'local':'/127.0.0.1:41590'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-19T08:04:35.3451060Z](https://github.com/apache/pulsar/runs/3936090803?check_suite_focus=true?check_suite_focus=true#step:9:426)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'4426919402754056335', 'remote':'localhost/127.0.0.1:38901', 'local':'/127.0.0.1:41590'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'80679175137804180', 'remote':'localhost/127.0.0.1:42957', 'local':'/127.0.0.1:45364'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-09T07:12:22.4871162Z](https://github.com/apache/pulsar/runs/3845303776?check_suite_focus=true?check_suite_focus=true#step:9:4282)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'80679175137804180', 'remote':'localhost/127.0.0.1:42957', 'local':'/127.0.0.1:45364'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'4813454399923431', 'remote':'localhost/127.0.0.1:36381', 'local':'/127.0.0.1:51418'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-19T10:10:07.0921752Z](https://github.com/apache/pulsar/runs/3937430640?check_suite_focus=true?check_suite_focus=true#step:9:372)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'4813454399923431', 'remote':'localhost/127.0.0.1:36381', 'local':'/127.0.0.1:51418'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'4076076735843296003', 'remote':'localhost/127.0.0.1:44255', 'local':'/127.0.0.1:42046'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-05T09:11:54.9013458Z](https://github.com/apache/pulsar/runs/3801226346?check_suite_focus=true?check_suite_focus=true#step:9:614)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'4076076735843296003', 'remote':'localhost/127.0.0.1:44255', 'local':'/127.0.0.1:42046'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'1168969955545256152', 'remote':'localhost/127.0.0.1:34989', 'local':'/127.0.0.1:56364'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-15T02:20:50.4875574Z](https://github.com/apache/pulsar/runs/3901517512?check_suite_focus=true?check_suite_focus=true#step:9:2659)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'1168969955545256152', 'remote':'localhost/127.0.0.1:34989', 'local':'/127.0.0.1:56364'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:46763 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-25T03:25:43.2761181Z](https://github.com/apache/pulsar/runs/3992255694?check_suite_focus=true?check_suite_focus=true#step:9:404)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:46763 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:46763 after 30000 ms
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:89)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:46763 after 30000 ms
	at org.apache.pulsar.client.impl.HttpClient.lambda$get$1(HttpClient.java:204)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.asynchttpclient.netty.NettyResponseFuture.abort(NettyResponseFuture.java:273)
	at org.asynchttpclient.netty.request.NettyRequestSender.abort(NettyRequestSender.java:473)
	at org.asynchttpclient.netty.timeout.TimeoutTimerTask.expire(TimeoutTimerTask.java:43)
	at org.asynchttpclient.netty.timeout.ReadTimeoutTimerTask.run(ReadTimeoutTimerTask.java:56)
	at io.netty.util.HashedWheelTimer$HashedWheelTimeout.expire(HashedWheelTimer.java:669)
	at io.netty.util.HashedWheelTimer$HashedWheelBucket.expireTimeouts(HashedWheelTimer.java:744)
	at io.netty.util.HashedWheelTimer$Worker.run(HashedWheelTimer.java:469)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more
Caused by: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:46763 after 30000 ms
	... 7 more

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'2345302934661030062', 'remote':'localhost/127.0.0.1:43243', 'local':'/127.0.0.1:48222'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-20T04:35:58.0514547Z](https://github.com/apache/pulsar/runs/3947247972?check_suite_focus=true?check_suite_focus=true#step:9:422)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'2345302934661030062', 'remote':'localhost/127.0.0.1:43243', 'local':'/127.0.0.1:48222'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'4187027134917440159', 'remote':'localhost/127.0.0.1:37635', 'local':'/127.0.0.1:41268'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-06T07:33:36.4870872Z](https://github.com/apache/pulsar/runs/3811845570?check_suite_focus=true?check_suite_focus=true#step:9:5465)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'4187027134917440159', 'remote':'localhost/127.0.0.1:37635', 'local':'/127.0.0.1:41268'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'2839086464529209266', 'remote':'localhost/127.0.0.1:35159', 'local':'/127.0.0.1:42864'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T08:48:33.7294114Z](https://github.com/apache/pulsar/runs/3892043531?check_suite_focus=true?check_suite_focus=true#step:9:4267)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'2839086464529209266', 'remote':'localhost/127.0.0.1:35159', 'local':'/127.0.0.1:42864'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'2627761589475001423', 'remote':'localhost/127.0.0.1:35735', 'local':'/127.0.0.1:44390'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-05T03:57:31.3228545Z](https://github.com/apache/pulsar/runs/3799039989?check_suite_focus=true?check_suite_focus=true#step:9:5023)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'2627761589475001423', 'remote':'localhost/127.0.0.1:35735', 'local':'/127.0.0.1:44390'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'2284559013647072710', 'remote':'localhost/127.0.0.1:45107', 'local':'/127.0.0.1:35846'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-20T04:56:48.8697556Z](https://github.com/apache/pulsar/runs/3947247972?check_suite_focus=true?check_suite_focus=true#step:9:1860)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'2284559013647072710', 'remote':'localhost/127.0.0.1:45107', 'local':'/127.0.0.1:35846'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:36065 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-29T15:56:45.9148693Z](https://github.com/apache/pulsar/runs/4048378747?check_suite_focus=true?check_suite_focus=true#step:9:384)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:36065 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:36065 after 30000 ms
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:89)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:36065 after 30000 ms
	at org.apache.pulsar.client.impl.HttpClient.lambda$get$1(HttpClient.java:204)
	at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:859)
	at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:837)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:506)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2088)
	at org.asynchttpclient.netty.NettyResponseFuture.abort(NettyResponseFuture.java:273)
	at org.asynchttpclient.netty.request.NettyRequestSender.abort(NettyRequestSender.java:473)
	at org.asynchttpclient.netty.timeout.TimeoutTimerTask.expire(TimeoutTimerTask.java:43)
	at org.asynchttpclient.netty.timeout.ReadTimeoutTimerTask.run(ReadTimeoutTimerTask.java:56)
	at io.netty.util.HashedWheelTimer$HashedWheelTimeout.expire(HashedWheelTimer.java:669)
	at io.netty.util.HashedWheelTimer$HashedWheelBucket.expireTimeouts(HashedWheelTimer.java:744)
	at io.netty.util.HashedWheelTimer$Worker.run(HashedWheelTimer.java:469)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more
Caused by: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:36065 after 30000 ms
	... 7 more

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'2912970145325446321', 'remote':'localhost/127.0.0.1:39761', 'local':'/127.0.0.1:53776'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-20T03:08:22.0250599Z](https://github.com/apache/pulsar/runs/3946784183?check_suite_focus=true?check_suite_focus=true#step:9:404)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'2912970145325446321', 'remote':'localhost/127.0.0.1:39761', 'local':'/127.0.0.1:53776'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'3966781303670930927', 'remote':'localhost/127.0.0.1:41625', 'local':'/127.0.0.1:53118'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-25T16:49:58.0173045Z](https://github.com/apache/pulsar/runs/3999590494?check_suite_focus=true?check_suite_focus=true#step:9:410)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: request timeout {'durationMs': '30000', 'reqId':'3966781303670930927', 'remote':'localhost/127.0.0.1:41625', 'local':'/127.0.0.1:53118'}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1008)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:91)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1102)
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

</pre></code>
</details>

