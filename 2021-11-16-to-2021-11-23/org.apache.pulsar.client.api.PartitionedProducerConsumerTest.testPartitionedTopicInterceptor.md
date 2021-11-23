        
Flaky-test: org.apache.pulsar.client.api.PartitionedProducerConsumerTest.testPartitionedTopicInterceptor
Number of failures: 2

org.apache.pulsar.client.api.PartitionedProducerConsumerTest is flaky. The testPartitionedTopicInterceptor test method fails sporadically.

```
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: The client is not connected to the broker when unsubscribing the subscription my-partitioned-subscriber of the topic persistent://my-property/my-ns/interceptor-partitionedtopic1-1637136506143-partition-7
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ConsumerBase.unsubscribe(ConsumerBase.java:586)
	at org.apache.pulsar.client.api.PartitionedProducerConsumerTest.testPartitionedTopicInterceptor(PartitionedProducerConsumerTest.java:1029)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-17T08:08:27.6191881Z](https://github.com/apache/pulsar/runs/4235193648?check_suite_focus=true?check_suite_focus=true#step:9:2108)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: The client is not connected to the broker when unsubscribing the subscription my-partitioned-subscriber of the topic persistent://my-property/my-ns/interceptor-partitionedtopic1-1637136506143-partition-7
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ConsumerBase.unsubscribe(ConsumerBase.java:586)
	at org.apache.pulsar.client.api.PartitionedProducerConsumerTest.testPartitionedTopicInterceptor(PartitionedProducerConsumerTest.java:1029)
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
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: The client is not connected to the broker when unsubscribing the subscription my-partitioned-subscriber of the topic persistent://my-property/my-ns/interceptor-partitionedtopic1-1637136506143-partition-7
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.ConsumerBase.unsubscribe(ConsumerBase.java:581)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException: The client is not connected to the broker when unsubscribing the subscription my-partitioned-subscriber of the topic persistent://my-property/my-ns/interceptor-partitionedtopic1-1637136506143-partition-7
	at org.apache.pulsar.client.impl.ConsumerImpl.unsubscribeAsync(ConsumerImpl.java:402)
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
	at java.base/java.util.concurrent.ConcurrentHashMap$ValueSpliterator.forEachRemaining(ConcurrentHashMap.java:3605)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
	at org.apache.pulsar.client.impl.MultiTopicsConsumerImpl.unsubscribeAsync(MultiTopicsConsumerImpl.java:545)
	... 14 more

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: The client is not connected to the broker when unsubscribing the subscription my-partitioned-subscriber of the topic persistent://my-property/my-ns/interceptor-partitionedtopic1-1637574275476-partition-4
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ConsumerBase.unsubscribe(ConsumerBase.java:586)
	at org.apache.pulsar.client.api.PartitionedProducerConsumerTest.testPartitionedTopicInterceptor(PartitionedProducerConsumerTest.java:1029)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-22T09:44:38.1580558Z](https://github.com/apache/pulsar/runs/4284338845?check_suite_focus=true?check_suite_focus=true#step:9:548)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: The client is not connected to the broker when unsubscribing the subscription my-partitioned-subscriber of the topic persistent://my-property/my-ns/interceptor-partitionedtopic1-1637574275476-partition-4
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ConsumerBase.unsubscribe(ConsumerBase.java:586)
	at org.apache.pulsar.client.api.PartitionedProducerConsumerTest.testPartitionedTopicInterceptor(PartitionedProducerConsumerTest.java:1029)
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
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: The client is not connected to the broker when unsubscribing the subscription my-partitioned-subscriber of the topic persistent://my-property/my-ns/interceptor-partitionedtopic1-1637574275476-partition-4
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.ConsumerBase.unsubscribe(ConsumerBase.java:581)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException: The client is not connected to the broker when unsubscribing the subscription my-partitioned-subscriber of the topic persistent://my-property/my-ns/interceptor-partitionedtopic1-1637574275476-partition-4
	at org.apache.pulsar.client.impl.ConsumerImpl.unsubscribeAsync(ConsumerImpl.java:403)
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)
	at java.base/java.util.concurrent.ConcurrentHashMap$ValueSpliterator.forEachRemaining(ConcurrentHashMap.java:3605)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
	at org.apache.pulsar.client.impl.MultiTopicsConsumerImpl.unsubscribeAsync(MultiTopicsConsumerImpl.java:545)
	... 14 more

</pre></code>
</details>

