        
Flaky-test: org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testTransferClientReconnectionWithoutLookup
Number of failures: 1

org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest is flaky. The testTransferClientReconnectionWithoutLookup test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testTransferClientReconnectionWithoutLookup() didn't finish within the time-out 30000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-01-22T06:19:19.3242186Z](https://github.com/apache/pulsar/actions/runs/7590748798/job/20714158218#step:11:977)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testTransferClientReconnectionWithoutLookup() didn't finish within the time-out 30000
	at java.base@17.0.9/jdk.internal.misc.Unsafe.park(Native Method)
	at java.base@17.0.9/java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:252)
	at java.base@17.0.9/java.util.concurrent.FutureTask.awaitDone(FutureTask.java:444)
	at java.base@17.0.9/java.util.concurrent.FutureTask.get(FutureTask.java:203)
	at app//org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:101)
	at app//org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:81)
	at app//org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:103)
	at app//org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at app//org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at app//org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at app//org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at app//org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testTransferClientReconnectionWithoutLookup(ExtensibleLoadManagerImplTest.java:559)
	at java.base@17.0.9/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base@17.0.9/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base@17.0.9/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base@17.0.9/java.lang.reflect.Method.invoke(Method.java:568)
	at app//org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base@17.0.9/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base@17.0.9/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base@17.0.9/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base@17.0.9/java.lang.Thread.run(Thread.java:840)

</pre></code>
</details>

