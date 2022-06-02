        
Flaky-test: org.apache.pulsar.client.api.PartitionedProducerConsumerTest.testPartitionedTopicInterceptor
Number of failures: 1

org.apache.pulsar.client.api.PartitionedProducerConsumerTest is flaky. The testPartitionedTopicInterceptor test method fails sporadically.

```
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: The client is not connected to the broker when unsubscribing the subscription my-partitioned-subscriber of the topic persistent://my-property/my-ns/interceptor-partitionedtopic1-1654048906155-partition-5
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ConsumerBase.unsubscribe(ConsumerBase.java:673)
	at org.apache.pulsar.client.api.PartitionedProducerConsumerTest.testPartitionedTopicInterceptor(PartitionedProducerConsumerTest.java:1029)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-01T02:01:47.6028737Z](https://github.com/apache/pulsar/runs/6681603926?check_suite_focus=true#step:10:1049)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: The client is not connected to the broker when unsubscribing the subscription my-partitioned-subscriber of the topic persistent://my-property/my-ns/interceptor-partitionedtopic1-1654048906155-partition-5
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ConsumerBase.unsubscribe(ConsumerBase.java:673)
	at org.apache.pulsar.client.api.PartitionedProducerConsumerTest.testPartitionedTopicInterceptor(PartitionedProducerConsumerTest.java:1029)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: The client is not connected to the broker when unsubscribing the subscription my-partitioned-subscriber of the topic persistent://my-property/my-ns/interceptor-partitionedtopic1-1654048906155-partition-5
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.client.impl.ConsumerBase.unsubscribe(ConsumerBase.java:668)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException: The client is not connected to the broker when unsubscribing the subscription my-partitioned-subscriber of the topic persistent://my-property/my-ns/interceptor-partitionedtopic1-1654048906155-partition-5
	at org.apache.pulsar.client.impl.ConsumerImpl.unsubscribeAsync(ConsumerImpl.java:413)
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
	at java.base/java.util.concurrent.ConcurrentHashMap$ValueSpliterator.forEachRemaining(ConcurrentHashMap.java:3612)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
	at org.apache.pulsar.client.impl.MultiTopicsConsumerImpl.unsubscribeAsync(MultiTopicsConsumerImpl.java:600)
	... 14 more

</pre></code>
</details>

