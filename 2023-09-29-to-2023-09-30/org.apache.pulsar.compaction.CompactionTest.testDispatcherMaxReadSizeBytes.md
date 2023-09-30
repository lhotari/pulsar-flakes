        
Flaky-test: org.apache.pulsar.compaction.CompactionTest.testDispatcherMaxReadSizeBytes
Number of failures: 2

org.apache.pulsar.compaction.CompactionTest is flaky. The testDispatcherMaxReadSizeBytes test method fails sporadically.

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
[example failure 2023-09-30T06:30:59.2955689Z](https://github.com/apache/pulsar/actions/runs/6354520087/job/17274931692#step:10:755)  
[example failure 2023-09-29T19:23:12.4282155Z](https://github.com/apache/pulsar/actions/runs/6354520087/job/17265229573#step:10:750)  


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

