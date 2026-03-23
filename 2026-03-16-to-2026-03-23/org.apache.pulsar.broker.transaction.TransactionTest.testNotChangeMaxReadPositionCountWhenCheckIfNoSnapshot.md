        
Flaky-test: org.apache.pulsar.broker.transaction.TransactionTest.testNotChangeMaxReadPositionCountWhenCheckIfNoSnapshot
Number of failures: 1

org.apache.pulsar.broker.transaction.TransactionTest is flaky. The testNotChangeMaxReadPositionCountWhenCheckIfNoSnapshot test method fails sporadically.

```
java.util.concurrent.ExecutionException: org.apache.pulsar.broker.service.BrokerServiceException$ServiceUnitNotReadyException: Namespace bundle (tnx/ns1/0x80000000_0xc0000000) for topic (persistent://tnx/ns1/changeMaxReadPositionCountdb047643-eca4-442b-8bb3-c8fdeb33aa94) not served by this instance:localhost:38821. Please redo the lookup.
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.broker.transaction.TransactionTest.testNotChangeMaxReadPositionCountWhenCheckIfNoSnapshot(TransactionTest.java:1161)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-19T08:28:51.2868118Z](https://github.com/apache/pulsar/actions/runs/23275934973/job/67707309302#step:11:1670)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.transaction.TransactionTest.testNotChangeMaxReadPositionCountWhenCheckIfNoSnapshot -- Time elapsed: 0.011 s <<< FAILURE!
java.util.concurrent.ExecutionException: org.apache.pulsar.broker.service.BrokerServiceException$ServiceUnitNotReadyException: Namespace bundle (tnx/ns1/0x80000000_0xc0000000) for topic (persistent://tnx/ns1/changeMaxReadPositionCountdb047643-eca4-442b-8bb3-c8fdeb33aa94) not served by this instance:localhost:38821. Please redo the lookup.
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2073)
	at org.apache.pulsar.broker.transaction.TransactionTest.testNotChangeMaxReadPositionCountWhenCheckIfNoSnapshot(TransactionTest.java:1161)
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
Caused by: org.apache.pulsar.broker.service.BrokerServiceException$ServiceUnitNotReadyException: Namespace bundle (tnx/ns1/0x80000000_0xc0000000) for topic (persistent://tnx/ns1/changeMaxReadPositionCountdb047643-eca4-442b-8bb3-c8fdeb33aa94) not served by this instance:localhost:38821. Please redo the lookup.
	at org.apache.pulsar.broker.service.BrokerService.lambda$checkTopicNsOwnership$119(BrokerService.java:2447)
	at java.base/java.util.concurrent.CompletableFuture.uniComposeStage(CompletableFuture.java:1187)
	at java.base/java.util.concurrent.CompletableFuture.thenCompose(CompletableFuture.java:2341)
	at org.apache.pulsar.broker.service.BrokerService.lambda$checkTopicNsOwnership$120(BrokerService.java:2440)
	at java.base/java.util.concurrent.CompletableFuture.uniComposeStage(CompletableFuture.java:1187)
	at java.base/java.util.concurrent.CompletableFuture.thenCompose(CompletableFuture.java:2341)
	at org.apache.pulsar.broker.service.BrokerService.checkTopicNsOwnership(BrokerService.java:2439)
	at org.apache.pulsar.broker.service.BrokerService.loadOrCreatePersistentTopic(BrokerService.java:1731)
	at org.apache.pulsar.broker.service.BrokerService.lambda$getTopic$39(BrokerService.java:1229)
	at java.base/java.util.concurrent.ConcurrentHashMap.computeIfAbsent(ConcurrentHashMap.java:1708)
	at org.apache.pulsar.broker.service.BrokerService.lambda$getTopic$41(BrokerService.java:1227)
	at java.base/java.util.concurrent.CompletableFuture.uniRunNow(CompletableFuture.java:819)
	at java.base/java.util.concurrent.CompletableFuture.uniRunStage(CompletableFuture.java:803)
	at java.base/java.util.concurrent.CompletableFuture.thenRun(CompletableFuture.java:2227)
	at org.apache.pulsar.broker.service.BrokerService.lambda$getTopic$44(BrokerService.java:1225)
	at java.base/java.util.concurrent.CompletableFuture.uniAcceptNow(CompletableFuture.java:757)
	at java.base/java.util.concurrent.CompletableFuture.uniAcceptStage(CompletableFuture.java:735)
	at java.base/java.util.concurrent.CompletableFuture.thenAccept(CompletableFuture.java:2214)
	at org.apache.pulsar.broker.service.BrokerService.getTopic(BrokerService.java:1217)
	at org.apache.pulsar.broker.service.BrokerService.getTopic(BrokerService.java:1101)
	at org.apache.pulsar.broker.service.BrokerService.getTopic(BrokerService.java:1096)
	at org.apache.pulsar.broker.transaction.TransactionTest.testNotChangeMaxReadPositionCountWhenCheckIfNoSnapshot(TransactionTest.java:1160)
	... 10 more

</pre></code>
</details>

