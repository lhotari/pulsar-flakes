        
Flaky-test: org.apache.pulsar.tests.integration.transaction.TransactionTest.transferNormalTest
Number of failures: 8

org.apache.pulsar.tests.integration.transaction.TransactionTest is flaky. The transferNormalTest test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.tests.integration.transaction.TransactionTest.transferNormalTest() didn't finish within the time-out 300000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-05T06:12:08.5113686Z](https://github.com/apache/pulsar/runs/3799683547?check_suite_focus=true?check_suite_focus=true#step:13:2734)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.tests.integration.transaction.TransactionTest.transferNormalTest() didn't finish within the time-out 300000
	at org.testng.internal.MethodInvocationHelper.invokeWithTimeoutWithNewExecutor(MethodInvocationHelper.java:371)
	at org.testng.internal.MethodInvocationHelper.invokeWithTimeout(MethodInvocationHelper.java:282)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:605)
	at org.testng.internal.TestInvoker.retryFailed(TestInvoker.java:214)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:58)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
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
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:283)
	at org.apache.maven.surefire.testng.TestNGXmlTestSuite.execute(TestNGXmlTestSuite.java:75)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:120)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException: org.apache.pulsar.client.api.transaction.TransactionCoordinatorClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$ConnectException: Disconnected from server at localhost/127.0.0.1:49173
	at org.apache.pulsar.client.impl.PulsarClientImpl.<init>(PulsarClientImpl.java:193)
	at org.apache.pulsar.client.impl.PulsarClientImpl.<init>(PulsarClientImpl.java:156)
	at org.apache.pulsar.client.impl.PulsarClientImpl.<init>(PulsarClientImpl.java:137)
	at org.apache.pulsar.client.impl.ClientBuilderImpl.build(ClientBuilderImpl.java:68)
	at org.apache.pulsar.tests.integration.transaction.TransactionTest.transferNormalTest(TransactionTest.java:80)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-22T13:50:54.8337498Z](https://github.com/apache/pulsar/runs/3976143697?check_suite_focus=true?check_suite_focus=true#step:13:8316)
[example failure 2021-10-20T04:42:27.1609413Z](https://github.com/apache/pulsar/runs/3947248109?check_suite_focus=true?check_suite_focus=true#step:13:8517)
[example failure 2021-10-19T07:46:49.4124556Z](https://github.com/apache/pulsar/runs/3935901197?check_suite_focus=true?check_suite_focus=true#step:13:8416)


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
	at org.apache.pulsar.client.impl.ClientCnx.channelInactive(ClientCnx.java:264)
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

[example failure 2021-10-07T21:24:53.2815664Z](https://github.com/apache/pulsar/runs/3832038857?check_suite_focus=true?check_suite_focus=true#step:13:2297)
[example failure 2021-10-05T07:44:35.5060554Z](https://github.com/apache/pulsar/runs/3800317318?check_suite_focus=true?check_suite_focus=true#step:13:2470)


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
	at org.apache.pulsar.client.impl.ClientCnx.channelInactive(ClientCnx.java:259)
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
org.apache.pulsar.client.api.PulsarClientException: org.apache.pulsar.client.api.transaction.TransactionCoordinatorClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$LookupException: {"errorMsg":"{"errorMsg":"org.apache.pulsar.metadata.api.MetadataStoreException$AlreadyExistsException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /admin/local-policies/pulsar/system","reqId":2266937801559114625, "remote":"pulsar-broker-1/172.19.0.7:6650", "local":"/172.19.0.8:60682"}","reqId":3570305164642292554, "remote":"localhost/127.0.0.1:49173", "local":"/127.0.0.1:49218"}
	at org.apache.pulsar.client.impl.PulsarClientImpl.<init>(PulsarClientImpl.java:193)
	at org.apache.pulsar.client.impl.PulsarClientImpl.<init>(PulsarClientImpl.java:156)
	at org.apache.pulsar.client.impl.PulsarClientImpl.<init>(PulsarClientImpl.java:137)
	at org.apache.pulsar.client.impl.ClientBuilderImpl.build(ClientBuilderImpl.java:68)
	at org.apache.pulsar.tests.integration.transaction.TransactionTest.transferNormalTest(TransactionTest.java:80)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-13T15:27:32.4272880Z](https://github.com/apache/pulsar/runs/3884072933?check_suite_focus=true?check_suite_focus=true#step:13:8719)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: org.apache.pulsar.client.api.transaction.TransactionCoordinatorClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$LookupException: {"errorMsg":"{"errorMsg":"org.apache.pulsar.metadata.api.MetadataStoreException$AlreadyExistsException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /admin/local-policies/pulsar/system","reqId":2266937801559114625, "remote":"pulsar-broker-1/172.19.0.7:6650", "local":"/172.19.0.8:60682"}","reqId":3570305164642292554, "remote":"localhost/127.0.0.1:49173", "local":"/127.0.0.1:49218"}
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
Caused by: org.apache.pulsar.client.api.transaction.TransactionCoordinatorClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$LookupException: {"errorMsg":"{"errorMsg":"org.apache.pulsar.metadata.api.MetadataStoreException$AlreadyExistsException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /admin/local-policies/pulsar/system","reqId":2266937801559114625, "remote":"pulsar-broker-1/172.19.0.7:6650", "local":"/172.19.0.8:60682"}","reqId":3570305164642292554, "remote":"localhost/127.0.0.1:49173", "local":"/127.0.0.1:49218"}
	at org.apache.pulsar.client.api.transaction.TransactionCoordinatorClientException.unwrap(TransactionCoordinatorClientException.java:130)
	at org.apache.pulsar.client.impl.transaction.TransactionCoordinatorClientImpl.start(TransactionCoordinatorClientImpl.java:71)
	at org.apache.pulsar.client.impl.PulsarClientImpl.<init>(PulsarClientImpl.java:190)
	... 16 more
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$LookupException: {"errorMsg":"{"errorMsg":"org.apache.pulsar.metadata.api.MetadataStoreException$AlreadyExistsException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /admin/local-policies/pulsar/system","reqId":2266937801559114625, "remote":"pulsar-broker-1/172.19.0.7:6650", "local":"/172.19.0.8:60682"}","reqId":3570305164642292554, "remote":"localhost/127.0.0.1:49173", "local":"/127.0.0.1:49218"}
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.transaction.TransactionCoordinatorClientImpl.start(TransactionCoordinatorClientImpl.java:69)
	... 17 more
Caused by: org.apache.pulsar.client.api.PulsarClientException$LookupException: {"errorMsg":"{"errorMsg":"org.apache.pulsar.metadata.api.MetadataStoreException$AlreadyExistsException: org.apache.pulsar.metadata.api.MetadataStoreException$BadVersionException: org.apache.zookeeper.KeeperException$BadVersionException: KeeperErrorCode = BadVersion for /admin/local-policies/pulsar/system","reqId":2266937801559114625, "remote":"pulsar-broker-1/172.19.0.7:6650", "local":"/172.19.0.8:60682"}","reqId":3570305164642292554, "remote":"localhost/127.0.0.1:49173", "local":"/127.0.0.1:49218"}
	at org.apache.pulsar.client.impl.ClientCnx.getPulsarClientException(ClientCnx.java:1152)
	at org.apache.pulsar.client.impl.ClientCnx.handleLookupResponse(ClientCnx.java:563)
	at org.apache.pulsar.common.protocol.PulsarDecoder.channelRead(PulsarDecoder.java:140)
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

```
org.apache.pulsar.client.api.PulsarClientException: org.apache.pulsar.client.api.transaction.TransactionCoordinatorClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$ConnectException: Disconnected from server at localhost/127.0.0.1:49194
	at org.apache.pulsar.client.impl.PulsarClientImpl.<init>(PulsarClientImpl.java:193)
	at org.apache.pulsar.client.impl.PulsarClientImpl.<init>(PulsarClientImpl.java:156)
	at org.apache.pulsar.client.impl.PulsarClientImpl.<init>(PulsarClientImpl.java:137)
	at org.apache.pulsar.client.impl.ClientBuilderImpl.build(ClientBuilderImpl.java:68)
	at org.apache.pulsar.tests.integration.transaction.TransactionTest.transferNormalTest(TransactionTest.java:80)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-22T13:53:19.7034966Z](https://github.com/apache/pulsar/runs/3976143697?check_suite_focus=true?check_suite_focus=true#step:13:16966)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: org.apache.pulsar.client.api.transaction.TransactionCoordinatorClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$ConnectException: Disconnected from server at localhost/127.0.0.1:49194
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
Caused by: org.apache.pulsar.client.api.transaction.TransactionCoordinatorClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$ConnectException: Disconnected from server at localhost/127.0.0.1:49194
	at org.apache.pulsar.client.api.transaction.TransactionCoordinatorClientException.unwrap(TransactionCoordinatorClientException.java:130)
	at org.apache.pulsar.client.impl.transaction.TransactionCoordinatorClientImpl.start(TransactionCoordinatorClientImpl.java:71)
	at org.apache.pulsar.client.impl.PulsarClientImpl.<init>(PulsarClientImpl.java:190)
	... 16 more
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$ConnectException: Disconnected from server at localhost/127.0.0.1:49194
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.transaction.TransactionCoordinatorClientImpl.start(TransactionCoordinatorClientImpl.java:69)
	... 17 more
Caused by: org.apache.pulsar.client.api.PulsarClientException$ConnectException: Disconnected from server at localhost/127.0.0.1:49194
	at org.apache.pulsar.client.impl.ClientCnx.channelInactive(ClientCnx.java:264)
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

