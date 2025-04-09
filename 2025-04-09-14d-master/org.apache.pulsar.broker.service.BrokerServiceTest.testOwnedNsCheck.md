        
Flaky-test: org.apache.pulsar.broker.service.BrokerServiceTest.testOwnedNsCheck
Number of failures: 3

org.apache.pulsar.broker.service.BrokerServiceTest is flaky. The testOwnedNsCheck test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.BrokerServiceTest.testOwnedNsCheck() didn't finish within the time-out 300000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-08T12:49:13.8355044Z](https://github.com/apache/pulsar/actions/runs/14333178015/job/40174245633#step:11:1085)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.BrokerServiceTest.testOwnedNsCheck() didn't finish within the time-out 300000
	at java.base/jdk.internal.misc.Unsafe.park(Native Method)
	at java.base/java.util.concurrent.locks.LockSupport.park(LockSupport.java:221)
	at java.base/java.util.concurrent.locks.AbstractQueuedSynchronizer.acquire(AbstractQueuedSynchronizer.java:754)
	at java.base/java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1099)
	at java.base/java.util.concurrent.CountDownLatch.await(CountDownLatch.java:230)
	at org.apache.pulsar.broker.service.BrokerServiceTest.testOwnedNsCheck(BrokerServiceTest.java:216)
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

[example failure 2025-04-04T06:39:35.9181346Z](https://github.com/apache/pulsar/actions/runs/14259036143/job/39967069141#step:11:1313)  
[example failure 2025-04-02T06:42:02.0975185Z](https://github.com/apache/pulsar/actions/runs/14212605378/job/39822769310#step:10:1353)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.BrokerServiceTest.testOwnedNsCheck() didn't finish within the time-out 300000
	at java.base@17.0.14/jdk.internal.misc.Unsafe.park(Native Method)
	at java.base@17.0.14/java.util.concurrent.locks.LockSupport.park(LockSupport.java:211)
	at java.base@17.0.14/java.util.concurrent.locks.AbstractQueuedSynchronizer.acquire(AbstractQueuedSynchronizer.java:715)
	at java.base@17.0.14/java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(AbstractQueuedSynchronizer.java:1047)
	at java.base@17.0.14/java.util.concurrent.CountDownLatch.await(CountDownLatch.java:230)
	at app//org.apache.pulsar.broker.service.BrokerServiceTest.testOwnedNsCheck(BrokerServiceTest.java:216)
	at java.base@17.0.14/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base@17.0.14/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base@17.0.14/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base@17.0.14/java.lang.reflect.Method.invoke(Method.java:569)
	at app//org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base@17.0.14/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base@17.0.14/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base@17.0.14/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base@17.0.14/java.lang.Thread.run(Thread.java:840)

</pre></code>
</details>

