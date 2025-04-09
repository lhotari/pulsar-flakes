        
Flaky-test: org.apache.pulsar.broker.service.BrokerServiceTest.testLookupThrottlingForClientByClient
Number of failures: 3

org.apache.pulsar.broker.service.BrokerServiceTest is flaky. The testLookupThrottlingForClientByClient test method fails sporadically.

```
java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$TimeoutException: Lookup request timeout {'durationMs': '30000', 'reqId':'-559038730', 'remote':'localhost/127.0.0.1:35633', 'local':'/127.0.0.1:37882'}
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.broker.service.BrokerServiceTest.testLookupThrottlingForClientByClient(BrokerServiceTest.java:1144)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-04T06:39:35.9146920Z](https://github.com/apache/pulsar/actions/runs/14259036143/job/39967069141#step:11:1282)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$TimeoutException: Lookup request timeout {'durationMs': '30000', 'reqId':'-559038730', 'remote':'localhost/127.0.0.1:35633', 'local':'/127.0.0.1:37882'}
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.broker.service.BrokerServiceTest.testLookupThrottlingForClientByClient(BrokerServiceTest.java:1144)
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
Caused by: org.apache.pulsar.client.api.PulsarClientException$TimeoutException: Lookup request timeout {'durationMs': '30000', 'reqId':'-559038730', 'remote':'localhost/127.0.0.1:35633', 'local':'/127.0.0.1:37882'}
	at org.apache.pulsar.client.impl.ClientCnx.checkRequestTimeout(ClientCnx.java:1431)
	at org.apache.pulsar.common.util.Runnables$CatchingAndLoggingRunnable.run(Runnables.java:54)
	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:162)
	at io.netty.util.concurrent.AbstractEventExecutor.runTask(AbstractEventExecutor.java:173)
	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:166)
	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:472)
	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:408)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

```
java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$TimeoutException: Lookup request timeout {'durationMs': '30000', 'reqId':'-559038730', 'remote':'localhost/127.0.0.1:34257', 'local':'/127.0.0.1:55118'}
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.broker.service.BrokerServiceTest.testLookupThrottlingForClientByClient(BrokerServiceTest.java:1144)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-02T06:42:02.0930832Z](https://github.com/apache/pulsar/actions/runs/14212605378/job/39822769310#step:10:1322)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$TimeoutException: Lookup request timeout {'durationMs': '30000', 'reqId':'-559038730', 'remote':'localhost/127.0.0.1:34257', 'local':'/127.0.0.1:55118'}
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.broker.service.BrokerServiceTest.testLookupThrottlingForClientByClient(BrokerServiceTest.java:1144)
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
Caused by: org.apache.pulsar.client.api.PulsarClientException$TimeoutException: Lookup request timeout {'durationMs': '30000', 'reqId':'-559038730', 'remote':'localhost/127.0.0.1:34257', 'local':'/127.0.0.1:55118'}
	at org.apache.pulsar.client.impl.ClientCnx.checkRequestTimeout(ClientCnx.java:1431)
	at org.apache.pulsar.common.util.Runnables$CatchingAndLoggingRunnable.run(Runnables.java:54)
	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:162)
	at io.netty.util.concurrent.AbstractEventExecutor.runTask(AbstractEventExecutor.java:173)
	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:166)
	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:472)
	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:408)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

```
java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$TimeoutException: Lookup request timeout {'durationMs': '30000', 'reqId':'-559038730', 'remote':'localhost/127.0.0.1:46743', 'local':'/127.0.0.1:47004'}
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.broker.service.BrokerServiceTest.testLookupThrottlingForClientByClient(BrokerServiceTest.java:1144)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-08T12:49:13.8288350Z](https://github.com/apache/pulsar/actions/runs/14333178015/job/40174245633#step:11:1056)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException$TimeoutException: Lookup request timeout {'durationMs': '30000', 'reqId':'-559038730', 'remote':'localhost/127.0.0.1:46743', 'local':'/127.0.0.1:47004'}
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.broker.service.BrokerServiceTest.testLookupThrottlingForClientByClient(BrokerServiceTest.java:1144)
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
Caused by: org.apache.pulsar.client.api.PulsarClientException$TimeoutException: Lookup request timeout {'durationMs': '30000', 'reqId':'-559038730', 'remote':'localhost/127.0.0.1:46743', 'local':'/127.0.0.1:47004'}
	at org.apache.pulsar.client.impl.ClientCnx.checkRequestTimeout(ClientCnx.java:1431)
	at org.apache.pulsar.common.util.Runnables$CatchingAndLoggingRunnable.run(Runnables.java:54)
	at io.netty.util.concurrent.PromiseTask.runTask(PromiseTask.java:98)
	at io.netty.util.concurrent.ScheduledFutureTask.run(ScheduledFutureTask.java:162)
	at io.netty.util.concurrent.AbstractEventExecutor.runTask(AbstractEventExecutor.java:173)
	at io.netty.util.concurrent.AbstractEventExecutor.safeExecute(AbstractEventExecutor.java:166)
	at io.netty.util.concurrent.SingleThreadEventExecutor.runAllTasks(SingleThreadEventExecutor.java:472)
	at io.netty.channel.epoll.EpollEventLoop.run(EpollEventLoop.java:408)
	at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:998)
	at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	... 1 more

</pre></code>
</details>

