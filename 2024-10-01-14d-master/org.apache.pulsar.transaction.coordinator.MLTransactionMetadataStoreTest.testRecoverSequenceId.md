        
Flaky-test: org.apache.pulsar.transaction.coordinator.MLTransactionMetadataStoreTest.testRecoverSequenceId
Number of failures: 1

org.apache.pulsar.transaction.coordinator.MLTransactionMetadataStoreTest is flaky. The testRecoverSequenceId test method fails sporadically.

```
java.lang.NullPointerException: Cannot invoke "org.apache.bookkeeper.mledger.ManagedLedger.asyncClose(org.apache.bookkeeper.mledger.AsyncCallbacks$CloseCallback, Object)" because "this.managedLedger" is null
	at org.apache.pulsar.transaction.coordinator.impl.MLTransactionLogImpl.closeAsync(MLTransactionLogImpl.java:166)
	at org.apache.pulsar.transaction.coordinator.MLTransactionMetadataStoreTest.testRecoverSequenceId(MLTransactionMetadataStoreTest.java:181)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-09-20T12:38:03.7807674Z](https://github.com/apache/pulsar/actions/runs/10958970668/job/30430830543#step:11:7264)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.bookkeeper.mledger.ManagedLedger.asyncClose(org.apache.bookkeeper.mledger.AsyncCallbacks$CloseCallback, Object)" because "this.managedLedger" is null
	at org.apache.pulsar.transaction.coordinator.impl.MLTransactionLogImpl.closeAsync(MLTransactionLogImpl.java:166)
	at org.apache.pulsar.transaction.coordinator.MLTransactionMetadataStoreTest.testRecoverSequenceId(MLTransactionMetadataStoreTest.java:181)
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

