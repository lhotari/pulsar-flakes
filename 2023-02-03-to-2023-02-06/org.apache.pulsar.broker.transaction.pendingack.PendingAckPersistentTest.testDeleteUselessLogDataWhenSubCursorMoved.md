        
Flaky-test: org.apache.pulsar.broker.transaction.pendingack.PendingAckPersistentTest.testDeleteUselessLogDataWhenSubCursorMoved
Number of failures: 10

org.apache.pulsar.broker.transaction.pendingack.PendingAckPersistentTest is flaky. The testDeleteUselessLogDataWhenSubCursorMoved test method fails sporadically.

```
java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
	at java.base/java.util.Objects.checkIndex(Objects.java:359)
	at java.base/java.util.ArrayList.get(ArrayList.java:427)
	at org.apache.pulsar.broker.transaction.pendingack.PendingAckPersistentTest.testDeleteUselessLogDataWhenSubCursorMoved(PendingAckPersistentTest.java:449)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-06T10:21:20.4325039Z](https://github.com/apache/pulsar/actions/runs/4095494413/jobs/7075545639#step:9:927)  
[example failure 2023-02-05T14:32:05.3472208Z](https://github.com/apache/pulsar/actions/runs/4097007619/jobs/7065068697#step:9:927)  
[example failure 2023-02-05T06:22:56.5398723Z](https://github.com/apache/pulsar/actions/runs/4095273346/jobs/7062085428#step:9:927)  
[example failure 2023-02-04T18:05:05.3152628Z](https://github.com/apache/pulsar/actions/runs/4092732000/jobs/7057666446#step:9:946)  
[example failure 2023-02-04T04:08:33.3849018Z](https://github.com/apache/pulsar/actions/runs/4076016338/jobs/7052833156#step:9:948)  
[example failure 2023-02-04T03:10:32.9701430Z](https://github.com/apache/pulsar/actions/runs/4089625311/jobs/7052464856#step:9:948)  
[example failure 2023-02-04T00:02:45.3995352Z](https://github.com/apache/pulsar/actions/runs/4088820724/jobs/7050875412#step:9:948)  
[example failure 2023-02-04T00:00:26.5581322Z](https://github.com/apache/pulsar/actions/runs/4088804123/jobs/7050842767#step:9:946)  
[example failure 2023-02-03T22:54:38.1314386Z](https://github.com/apache/pulsar/actions/runs/4088378500/jobs/7050160241#step:9:929)  
[example failure 2023-02-03T21:56:27.5567115Z](https://github.com/apache/pulsar/actions/runs/4088105888/jobs/7049403463#step:9:929)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
	at java.base/java.util.Objects.checkIndex(Objects.java:359)
	at java.base/java.util.ArrayList.get(ArrayList.java:427)
	at org.apache.pulsar.broker.transaction.pendingack.PendingAckPersistentTest.testDeleteUselessLogDataWhenSubCursorMoved(PendingAckPersistentTest.java:449)
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

