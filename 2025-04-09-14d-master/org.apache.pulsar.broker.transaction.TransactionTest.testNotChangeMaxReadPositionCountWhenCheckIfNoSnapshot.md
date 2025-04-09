        
Flaky-test: org.apache.pulsar.broker.transaction.TransactionTest.testNotChangeMaxReadPositionCountWhenCheckIfNoSnapshot
Number of failures: 1

org.apache.pulsar.broker.transaction.TransactionTest is flaky. The testNotChangeMaxReadPositionCountWhenCheckIfNoSnapshot test method fails sporadically.

```
java.util.concurrent.ExecutionException: org.apache.pulsar.broker.service.BrokerServiceException$ServiceUnitNotReadyException: Namespace bundle for topic (persistent://tnx/ns1/changeMaxReadPositionCountbae4ee05-d455-402a-a312-323e9d44e1de) not served by this instance:localhost:36659. Please redo the lookup. Request is denied: namespace=tnx/ns1
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.broker.transaction.TransactionTest.testNotChangeMaxReadPositionCountWhenCheckIfNoSnapshot(TransactionTest.java:1120)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-07T06:43:21.1303715Z](https://github.com/apache/pulsar/actions/runs/14301942628/job/40078132389#step:11:1434)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.ExecutionException: org.apache.pulsar.broker.service.BrokerServiceException$ServiceUnitNotReadyException: Namespace bundle for topic (persistent://tnx/ns1/changeMaxReadPositionCountbae4ee05-d455-402a-a312-323e9d44e1de) not served by this instance:localhost:36659. Please redo the lookup. Request is denied: namespace=tnx/ns1
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.broker.transaction.TransactionTest.testNotChangeMaxReadPositionCountWhenCheckIfNoSnapshot(TransactionTest.java:1120)
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
Caused by: org.apache.pulsar.broker.service.BrokerServiceException$ServiceUnitNotReadyException: Namespace bundle for topic (persistent://tnx/ns1/changeMaxReadPositionCountbae4ee05-d455-402a-a312-323e9d44e1de) not served by this instance:localhost:36659. Please redo the lookup. Request is denied: namespace=tnx/ns1
	at org.apache.pulsar.broker.service.BrokerService.lambda$checkTopicNsOwnership$111(BrokerService.java:2345)
	at java.base/java.util.concurrent.CompletableFuture.uniComposeStage(CompletableFuture.java:1187)
	at java.base/java.util.concurrent.CompletableFuture.thenCompose(CompletableFuture.java:2309)
	at org.apache.pulsar.broker.service.BrokerService.checkTopicNsOwnership(BrokerService.java:2337)
	at org.apache.pulsar.broker.service.BrokerService.loadOrCreatePersistentTopic(BrokerService.java:1659)
	at org.apache.pulsar.broker.service.BrokerService.lambda$getTopic$34(BrokerService.java:1175)
	at java.base/java.util.concurrent.ConcurrentHashMap.computeIfAbsent(ConcurrentHashMap.java:1740)
	at org.apache.pulsar.broker.service.BrokerService.lambda$getTopic$35(BrokerService.java:1174)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1150)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.postFire(CompletableFuture.java:614)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1163)
	at java.base/java.util.concurrent.CompletableFuture$Completion.exec(CompletableFuture.java:483)
	at java.base/java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:373)
	at java.base/java.util.concurrent.ForkJoinPool$WorkQueue.topLevelExec(ForkJoinPool.java:1182)
	at java.base/java.util.concurrent.ForkJoinPool.scan(ForkJoinPool.java:1655)
	at java.base/java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1622)
	at java.base/java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:165)

</pre></code>
</details>

