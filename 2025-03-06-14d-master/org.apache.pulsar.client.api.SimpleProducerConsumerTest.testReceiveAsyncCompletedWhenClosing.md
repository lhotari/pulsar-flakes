        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.testReceiveAsyncCompletedWhenClosing
Number of failures: 1

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The testReceiveAsyncCompletedWhenClosing test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.client.api.SimpleProducerConsumerTest.testReceiveAsyncCompletedWhenClosing() didn't finish within the time-out 10000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-02-27T12:33:57.4370209Z](https://github.com/apache/pulsar/actions/runs/13566062537/job/37919822997#step:11:725)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.client.api.SimpleProducerConsumerTest.testReceiveAsyncCompletedWhenClosing() didn't finish within the time-out 10000
	at java.base/jdk.internal.misc.Unsafe.park(Native Method)
	at java.base/java.util.concurrent.locks.LockSupport.park(LockSupport.java:221)
	at java.base/java.util.concurrent.locks.AbstractQueuedSynchronizer.acquire(AbstractQueuedSynchronizer.java:754)
	at java.base/java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1099)
	at java.base/java.util.concurrent.CountDownLatch.await(CountDownLatch.java:230)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testReceiveAsyncCompletedWhenClosing(SimpleProducerConsumerTest.java:4030)
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

