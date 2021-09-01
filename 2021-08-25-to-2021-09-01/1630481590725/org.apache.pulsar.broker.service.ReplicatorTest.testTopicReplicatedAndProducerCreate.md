        
Flaky-test: org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate
Number of failures: 4

org.apache.pulsar.broker.service.ReplicatorTest is flaky. The testTopicReplicatedAndProducerCreate test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-31T10:16:38.1403143Z](https://github.com/apache/pulsar/runs/3471501156?check_suite_focus=true#step:10:1127)
[example failure 2021-08-30T23:13:45.2018287Z](https://github.com/apache/pulsar/runs/3467152431?check_suite_focus=true#step:9:375)
[example failure 2021-08-27T06:37:33.2735047Z](https://github.com/apache/pulsar/runs/3440411059?check_suite_focus=true#step:9:2283)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:40113 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:95)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1107)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T07:01:54.6190407Z](https://github.com/apache/pulsar/runs/3440456667?check_suite_focus=true#step:9:390)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:40113 after 30000 ms
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1074)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:95)
	at org.apache.pulsar.broker.service.ReplicatorTest.testTopicReplicatedAndProducerCreate(ReplicatorTest.java:1107)
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
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:40113 after 30000 ms
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:93)
	... 13 more
Caused by: org.apache.pulsar.client.api.PulsarClientException: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:40113 after 30000 ms
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
Caused by: java.util.concurrent.TimeoutException: Read timeout to localhost/127.0.0.1:40113 after 30000 ms
	... 7 more

</pre></code>
</details>

