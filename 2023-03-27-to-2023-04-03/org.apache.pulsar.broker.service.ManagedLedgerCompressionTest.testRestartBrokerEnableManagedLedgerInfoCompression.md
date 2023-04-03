        
Flaky-test: org.apache.pulsar.broker.service.ManagedLedgerCompressionTest.testRestartBrokerEnableManagedLedgerInfoCompression
Number of failures: 1

org.apache.pulsar.broker.service.ManagedLedgerCompressionTest is flaky. The testRestartBrokerEnableManagedLedgerInfoCompression test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.ManagedLedgerCompressionTest.testRestartBrokerEnableManagedLedgerInfoCompression() didn't finish within the time-out 30000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-03-30T04:10:53.4024387Z](https://github.com/apache/pulsar/actions/runs/4560335861/jobs/8045375335#step:11:941)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.ManagedLedgerCompressionTest.testRestartBrokerEnableManagedLedgerInfoCompression() didn't finish within the time-out 30000
	at java.base@17.0.6/jdk.internal.misc.Unsafe.park(Native Method)
	at java.base@17.0.6/java.util.concurrent.locks.LockSupport.park(LockSupport.java:211)
	at java.base@17.0.6/java.util.concurrent.CompletableFuture$Signaller.block(CompletableFuture.java:1864)
	at java.base@17.0.6/java.util.concurrent.ForkJoinPool.unmanagedBlock(ForkJoinPool.java:3463)
	at java.base@17.0.6/java.util.concurrent.ForkJoinPool.managedBlock(ForkJoinPool.java:3434)
	at java.base@17.0.6/java.util.concurrent.CompletableFuture.waitingGet(CompletableFuture.java:1898)
	at java.base@17.0.6/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2072)
	at app//org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:88)
	at app//org.apache.pulsar.broker.service.ManagedLedgerCompressionTest.produceAndConsume(ManagedLedgerCompressionTest.java:100)
	at app//org.apache.pulsar.broker.service.ManagedLedgerCompressionTest.testRestartBrokerEnableManagedLedgerInfoCompression(ManagedLedgerCompressionTest.java:94)
	at java.base@17.0.6/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base@17.0.6/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base@17.0.6/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base@17.0.6/java.lang.reflect.Method.invoke(Method.java:568)
	at app//org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base@17.0.6/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base@17.0.6/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base@17.0.6/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base@17.0.6/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

