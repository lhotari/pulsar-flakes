        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.testReceiveAsyncCompletedWhenClosing
Number of failures: 1

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The testReceiveAsyncCompletedWhenClosing test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.client.api.SimpleProducerConsumerTest.testReceiveAsyncCompletedWhenClosing() didn't finish within the time-out 10000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-10T06:32:59.1509753Z](https://github.com/apache/pulsar/actions/runs/18397879957/job/52421269342#step:11:1775)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.client.api.SimpleProducerConsumerTest.testReceiveAsyncCompletedWhenClosing() didn't finish within the time-out 10000
	at java.base@17.0.16/jdk.internal.misc.Unsafe.park(Native Method)
	at java.base@17.0.16/java.util.concurrent.locks.LockSupport.park(LockSupport.java:211)
	at java.base@17.0.16/java.util.concurrent.locks.AbstractQueuedSynchronizer.acquire(AbstractQueuedSynchronizer.java:715)
	at java.base@17.0.16/java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1047)
	at java.base@17.0.16/java.util.concurrent.CountDownLatch.await(CountDownLatch.java:230)
	at app//org.apache.pulsar.client.api.SimpleProducerConsumerTest.testReceiveAsyncCompletedWhenClosing(SimpleProducerConsumerTest.java:4049)
	at java.base@17.0.16/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base@17.0.16/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base@17.0.16/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base@17.0.16/java.lang.reflect.Method.invoke(Method.java:569)
	at app//org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base@17.0.16/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base@17.0.16/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base@17.0.16/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base@17.0.16/java.lang.Thread.run(Thread.java:840)

</pre></code>
</details>

