        
Flaky-test: org.apache.pulsar.broker.service.BrokerServiceTest.testLookupThrottlingForClientByClient
Number of failures: 2

org.apache.pulsar.broker.service.BrokerServiceTest is flaky. The testLookupThrottlingForClientByClient test method fails sporadically.

```
java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$TimeoutException: Lookup request timeout {'durationMs': '30000', 'reqId':'-559038730', 'remote':'localhost/127.0.0.1:42973', 'local':'/127.0.0.1:41054'}
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.broker.service.BrokerServiceTest.testLookupThrottlingForClientByClient(BrokerServiceTest.java:1141)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-01-11T06:34:04.2385549Z](https://github.com/apache/pulsar/actions/runs/12721764903/job/35465235939#step:11:1368)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$TimeoutException: Lookup request timeout {'durationMs': '30000', 'reqId':'-559038730', 'remote':'localhost/127.0.0.1:42973', 'local':'/127.0.0.1:41054'}
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.broker.service.BrokerServiceTest.testLookupThrottlingForClientByClient(BrokerServiceTest.java:1141)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: org.apache.pulsar.client.api.PulsarClientException$TimeoutException: Lookup request timeout {'durationMs': '30000', 'reqId':'-559038730', 'remote':'localhost/127.0.0.1:42973', 'local':'/127.0.0.1:41054'}
	at org.apache.pulsar.client.impl.ClientCnx.checkRequestTimeout(ClientCnx.java:1422)
	at org.apache.pulsar.common.util.Runnables$CatchingAndLoggingRunnable.run(Runnables.java:54)
	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:162)
	at io.netty.util.concurrent.AbstractEventExecutor.runTask(AbstractEventExecutor.java:173)
	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:166)
	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:472)
	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:408)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

```
java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$TimeoutException: Lookup request timeout {'durationMs': '30000', 'reqId':'-559038730', 'remote':'localhost/127.0.0.1:34949', 'local':'/127.0.0.1:58160'}
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.broker.service.BrokerServiceTest.testLookupThrottlingForClientByClient(BrokerServiceTest.java:1141)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-01-14T12:44:36.2383511Z](https://github.com/apache/pulsar/actions/runs/12767331812/job/35586023240#step:11:1366)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$TimeoutException: Lookup request timeout {'durationMs': '30000', 'reqId':'-559038730', 'remote':'localhost/127.0.0.1:34949', 'local':'/127.0.0.1:58160'}
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.broker.service.BrokerServiceTest.testLookupThrottlingForClientByClient(BrokerServiceTest.java:1141)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)
Caused by: org.apache.pulsar.client.api.PulsarClientException$TimeoutException: Lookup request timeout {'durationMs': '30000', 'reqId':'-559038730', 'remote':'localhost/127.0.0.1:34949', 'local':'/127.0.0.1:58160'}
	at org.apache.pulsar.client.impl.ClientCnx.checkRequestTimeout(ClientCnx.java:1422)
	at org.apache.pulsar.common.util.Runnables$CatchingAndLoggingRunnable.run(Runnables.java:54)
	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:162)
	at io.netty.util.concurrent.AbstractEventExecutor.runTask(AbstractEventExecutor.java:173)
	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:166)
	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:472)
	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:408)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:997)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

