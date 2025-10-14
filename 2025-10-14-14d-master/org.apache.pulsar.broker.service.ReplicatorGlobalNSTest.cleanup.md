        
Flaky-test: org.apache.pulsar.broker.service.ReplicatorGlobalNSTest.cleanup
Number of failures: 1

org.apache.pulsar.broker.service.ReplicatorGlobalNSTest is flaky. The cleanup test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.ReplicatorGlobalNSTest.cleanup() didn't finish within the time-out 300000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-01T16:16:24.0117481Z](https://github.com/apache/pulsar/actions/runs/18156259802/job/51716044165#step:11:1476)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.ReplicatorGlobalNSTest.cleanup() didn't finish within the time-out 300000
	at java.base/java.lang.Object.wait0(Native Method)
	at java.base/java.lang.Object.wait(Object.java:366)
	at java.base/java.lang.Object.wait(Object.java:339)
	at io.netty.util.concurrent.DefaultPromise.awaitUninterruptibly(DefaultPromise.java:289)
	at io.netty.channel.DefaultChannelPromise.awaitUninterruptibly(DefaultChannelPromise.java:137)
	at io.netty.channel.DefaultChannelPromise.awaitUninterruptibly(DefaultChannelPromise.java:30)
	at org.apache.bookkeeper.proto.PerChannelBookieClient.closeInternal(PerChannelBookieClient.java:1127)
	at org.apache.bookkeeper.proto.PerChannelBookieClient.close(PerChannelBookieClient.java:1109)
	at org.apache.bookkeeper.proto.DefaultPerChannelBookieClientPool.close(DefaultPerChannelBookieClientPool.java:156)
	at org.apache.bookkeeper.proto.BookieClientImpl.close(BookieClientImpl.java:610)
	at org.apache.bookkeeper.client.BookKeeper.close(BookKeeper.java:1450)
	at org.apache.pulsar.broker.ManagedLedgerClientFactory.close(ManagedLedgerClientFactory.java:228)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:611)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:494)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:465)
	at org.apache.pulsar.broker.service.ReplicatorTestBase.cleanup(ReplicatorTestBase.java:455)
	at org.apache.pulsar.broker.service.ReplicatorGlobalNSTest.cleanup(ReplicatorGlobalNSTest.java:84)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

</pre></code>
</details>

