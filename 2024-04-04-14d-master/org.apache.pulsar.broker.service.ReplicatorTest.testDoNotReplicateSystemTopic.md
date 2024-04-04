        
Flaky-test: org.apache.pulsar.broker.service.ReplicatorTest.testDoNotReplicateSystemTopic
Number of failures: 1

org.apache.pulsar.broker.service.ReplicatorTest is flaky. The testDoNotReplicateSystemTopic test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.ReplicatorTest.testDoNotReplicateSystemTopic() didn't finish within the time-out 300000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-03-22T12:43:03.1586469Z](https://github.com/apache/pulsar/actions/runs/8390033768/job/22977866079#step:11:1019)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.ReplicatorTest.testDoNotReplicateSystemTopic() didn't finish within the time-out 300000
	at java.base@17.0.10/jdk.internal.misc.Unsafe.park(Native Method)
	at java.base@17.0.10/java.util.concurrent.locks.LockSupport.park(LockSupport.java:211)
	at java.base@17.0.10/java.util.concurrent.locks.AbstractQueuedSynchronizer.acquire(AbstractQueuedSynchronizer.java:715)
	at java.base@17.0.10/java.util.concurrent.locks.AbstractQueuedSynchronizer.acquire(AbstractQueuedSynchronizer.java:938)
	at java.base@17.0.10/java.util.concurrent.locks.ReentrantLock$Sync.lock(ReentrantLock.java:153)
	at java.base@17.0.10/java.util.concurrent.locks.ReentrantLock.lock(ReentrantLock.java:322)
	at app//org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:440)
	at app//org.apache.pulsar.broker.PulsarService.close(PulsarService.java:415)
	at app//org.apache.pulsar.broker.service.ReplicatorTestBase.cleanup(ReplicatorTestBase.java:394)
	at app//org.apache.pulsar.broker.service.ReplicatorTest.cleanup(ReplicatorTest.java:147)
	at app//org.apache.pulsar.broker.service.ReplicatorTest.testDoNotReplicateSystemTopic(ReplicatorTest.java:1563)
	at java.base@17.0.10/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base@17.0.10/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base@17.0.10/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base@17.0.10/java.lang.reflect.Method.invoke(Method.java:568)
	at app//org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base@17.0.10/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base@17.0.10/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base@17.0.10/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base@17.0.10/java.lang.Thread.run(Thread.java:840)

</pre></code>
</details>

