        
Flaky-test: org.apache.pulsar.broker.service.ExclusiveProducerTest.exclusiveWithConsumers
Number of failures: 2

org.apache.pulsar.broker.service.ExclusiveProducerTest is flaky. The exclusiveWithConsumers test method fails sporadically.

```
java.util.concurrent.ExecutionException: io.netty.channel.StacklessClosedChannelException
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.broker.service.ExclusiveProducerTest.simpleTest(ExclusiveProducerTest.java:215)
	at org.apache.pulsar.broker.service.ExclusiveProducerTest.exclusiveWithConsumers(ExclusiveProducerTest.java:423)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-11-28T22:40:38.6738558Z](https://github.com/apache/pulsar/actions/runs/12076063420/job/33677065208#step:10:1198)  
[example failure 2024-11-26T21:16:26.3249055Z](https://github.com/apache/pulsar/actions/runs/12023175603/job/33566078982#step:11:1240)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.ExecutionException: io.netty.channel.StacklessClosedChannelException
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.broker.service.ExclusiveProducerTest.simpleTest(ExclusiveProducerTest.java:215)
	at org.apache.pulsar.broker.service.ExclusiveProducerTest.exclusiveWithConsumers(ExclusiveProducerTest.java:423)
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
Caused by: io.netty.channel.StacklessClosedChannelException
	at io.netty.channel.AbstractChannel$AbstractUnsafe.write(Object, ChannelPromise)(Unknown Source)

</pre></code>
</details>

