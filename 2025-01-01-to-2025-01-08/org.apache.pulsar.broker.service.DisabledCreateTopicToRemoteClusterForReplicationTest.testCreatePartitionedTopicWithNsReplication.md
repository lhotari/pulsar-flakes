        
Flaky-test: org.apache.pulsar.broker.service.DisabledCreateTopicToRemoteClusterForReplicationTest.testCreatePartitionedTopicWithNsReplication
Number of failures: 1

org.apache.pulsar.broker.service.DisabledCreateTopicToRemoteClusterForReplicationTest is flaky. The testCreatePartitionedTopicWithNsReplication test method fails sporadically.

```
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.api.Message.getValue()" because the return value of "org.apache.pulsar.client.api.Consumer.receive(int, java.util.concurrent.TimeUnit)" is null
	at org.apache.pulsar.broker.service.DisabledCreateTopicToRemoteClusterForReplicationTest.testCreatePartitionedTopicWithNsReplication(DisabledCreateTopicToRemoteClusterForReplicationTest.java:111)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-01-02T10:04:01.9336740Z](https://github.com/apache/pulsar/actions/runs/12580383927/job/35062462009#step:10:1316)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.api.Message.getValue()" because the return value of "org.apache.pulsar.client.api.Consumer.receive(int, java.util.concurrent.TimeUnit)" is null
	at org.apache.pulsar.broker.service.DisabledCreateTopicToRemoteClusterForReplicationTest.testCreatePartitionedTopicWithNsReplication(DisabledCreateTopicToRemoteClusterForReplicationTest.java:111)
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

