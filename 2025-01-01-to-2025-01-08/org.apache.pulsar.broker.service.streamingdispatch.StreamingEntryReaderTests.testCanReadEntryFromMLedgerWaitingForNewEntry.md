        
Flaky-test: org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests.testCanReadEntryFromMLedgerWaitingForNewEntry
Number of failures: 4

org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests is flaky. The testCanReadEntryFromMLedgerWaitingForNewEntry test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests.testCanReadEntryFromMLedgerWaitingForNewEntry(StreamingEntryReaderTests.java:237)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-01-03T00:57:09.9613248Z](https://github.com/apache/pulsar/actions/runs/12580383908/job/35092745657#step:8:2137)  
[example failure 2025-01-02T15:45:27.3413114Z](https://github.com/apache/pulsar/actions/runs/12580383908/job/35074447249#step:8:2127)  
[example failure 2025-01-02T11:48:56.1756286Z](https://github.com/apache/pulsar/actions/runs/12580383908/job/35065749184#step:8:2137)  
[example failure 2025-01-02T10:06:07.3887665Z](https://github.com/apache/pulsar/actions/runs/12580383908/job/35062198288#step:8:2123)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests.testCanReadEntryFromMLedgerWaitingForNewEntry(StreamingEntryReaderTests.java:237)
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

</pre></code>
</details>

