        
Flaky-test: org.apache.pulsar.compaction.StrategicCompactionTest.testDispatcherMaxReadSizeBytes
Number of failures: 7

org.apache.pulsar.compaction.StrategicCompactionTest is flaky. The testDispatcherMaxReadSizeBytes test method fails sporadically.

```
Wanted but not invoked:
pulsarTopicCompactionService.readCompactedEntries(
    <any>,
    same(1)
);
-> at org.apache.pulsar.compaction.PulsarTopicCompactionService.readCompactedEntries(PulsarTopicCompactionService.java:69)
Actually, there were zero interactions with this mock.

	at org.apache.pulsar.compaction.PulsarTopicCompactionService.readCompactedEntries(PulsarTopicCompactionService.java:69)
	at org.apache.pulsar.compaction.CompactionTest.testDispatcherMaxReadSizeBytes(CompactionTest.java:1917)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-09-29T21:29:57.9211789Z](https://github.com/apache/pulsar/actions/runs/6354520087/job/17268211341#step:10:768)  
[example failure 2023-09-27T08:28:10.0360901Z](https://github.com/apache/pulsar/actions/runs/6323018541/job/17170129864#step:10:1521)  
[example failure 2023-09-27T08:25:04.0716479Z](https://github.com/apache/pulsar/actions/runs/6322046709/job/17169919138#step:8:1401)  
[example failure 2023-09-26T08:24:11.5409803Z](https://github.com/apache/pulsar/actions/runs/6308905483/job/17130028682#step:8:2341)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
Wanted but not invoked:
pulsarTopicCompactionService.readCompactedEntries(
    <any>,
    same(1)
);
-> at org.apache.pulsar.compaction.PulsarTopicCompactionService.readCompactedEntries(PulsarTopicCompactionService.java:69)
Actually, there were zero interactions with this mock.

	at org.apache.pulsar.compaction.PulsarTopicCompactionService.readCompactedEntries(PulsarTopicCompactionService.java:69)
	at org.apache.pulsar.compaction.CompactionTest.testDispatcherMaxReadSizeBytes(CompactionTest.java:1917)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

```
org.mockito.exceptions.verification.TooManyActualInvocations:

pulsarTopicCompactionService.readCompactedEntries(
    <any>,
    same(1)
);
Wanted 1 time:
-> at org.apache.pulsar.compaction.PulsarTopicCompactionService.readCompactedEntries(PulsarTopicCompactionService.java:69)
But was 2 times:
-> at org.apache.pulsar.compaction.CompactedTopicUtils.lambda$asyncReadCompactedEntries$1(CompactedTopicUtils.java:83)
-> at org.apache.pulsar.compaction.CompactedTopicUtils.lambda$asyncReadCompactedEntries$1(CompactedTopicUtils.java:83)


	at org.apache.pulsar.compaction.PulsarTopicCompactionService.readCompactedEntries(PulsarTopicCompactionService.java:69)
	at org.apache.pulsar.compaction.CompactionTest.testDispatcherMaxReadSizeBytes(CompactionTest.java:1917)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-09-29T21:10:57.5514180Z](https://github.com/apache/pulsar/actions/runs/6354520087/job/17267763026#step:10:778)  
[example failure 2023-09-29T17:01:46.6873071Z](https://github.com/apache/pulsar/actions/runs/6354520087/job/17261402832#step:9:777)  
[example failure 2023-09-27T06:38:50.7103566Z](https://github.com/apache/pulsar/actions/runs/6322046709/job/17166994570#step:8:2358)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.verification.TooManyActualInvocations:

pulsarTopicCompactionService.readCompactedEntries(
    <any>,
    same(1)
);
Wanted 1 time:
-> at org.apache.pulsar.compaction.PulsarTopicCompactionService.readCompactedEntries(PulsarTopicCompactionService.java:69)
But was 2 times:
-> at org.apache.pulsar.compaction.CompactedTopicUtils.lambda$asyncReadCompactedEntries$1(CompactedTopicUtils.java:83)
-> at org.apache.pulsar.compaction.CompactedTopicUtils.lambda$asyncReadCompactedEntries$1(CompactedTopicUtils.java:83)


	at org.apache.pulsar.compaction.PulsarTopicCompactionService.readCompactedEntries(PulsarTopicCompactionService.java:69)
	at org.apache.pulsar.compaction.CompactionTest.testDispatcherMaxReadSizeBytes(CompactionTest.java:1917)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

