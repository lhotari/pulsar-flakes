        
Flaky-test: org.apache.pulsar.broker.admin.PersistentTopicsTest.testUpdatePartitionedTopicHavingProperties
Number of failures: 1

org.apache.pulsar.broker.admin.PersistentTopicsTest is flaky. The testUpdatePartitionedTopicHavingProperties test method fails sporadically.

```
java.lang.ClassCastException: class org.glassfish.jersey.message.internal.OutboundJaxrsResponse cannot be cast to class org.apache.pulsar.common.partition.PartitionedTopicMetadata (org.glassfish.jersey.message.internal.OutboundJaxrsResponse and org.apache.pulsar.common.partition.PartitionedTopicMetadata are in unnamed module of loader 'app')
	at org.apache.pulsar.broker.admin.PersistentTopicsTest.lambda$testUpdatePartitionedTopicHavingProperties$7(PersistentTopicsTest.java:669)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-11-29T04:34:14.4407758Z](https://github.com/apache/pulsar/actions/runs/3570321875/jobs/6002511268#step:10:1283)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.ClassCastException: class org.glassfish.jersey.message.internal.OutboundJaxrsResponse cannot be cast to class org.apache.pulsar.common.partition.PartitionedTopicMetadata (org.glassfish.jersey.message.internal.OutboundJaxrsResponse and org.apache.pulsar.common.partition.PartitionedTopicMetadata are in unnamed module of loader 'app')
	at org.apache.pulsar.broker.admin.PersistentTopicsTest.lambda$testUpdatePartitionedTopicHavingProperties$7(PersistentTopicsTest.java:669)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

