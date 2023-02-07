        
Flaky-test: org.apache.pulsar.broker.transaction.pendingack.PendingAckPersistentTest.testDeleteUselessLogDataWhenSubCursorMoved
Number of failures: 2

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
[example failure 2023-02-07T06:46:35.4664771Z](https://github.com/apache/pulsar/actions/runs/4111179593/jobs/7094697114#step:9:965)  
[example failure 2023-02-06T10:21:20.4325039Z](https://github.com/apache/pulsar/actions/runs/4095494413/jobs/7075545639#step:9:927)  


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

