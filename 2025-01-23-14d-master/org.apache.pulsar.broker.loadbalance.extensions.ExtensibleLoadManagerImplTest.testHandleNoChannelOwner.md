        
Flaky-test: org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testHandleNoChannelOwner
Number of failures: 1

org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest is flaky. The testHandleNoChannelOwner test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testHandleNoChannelOwner() didn't finish within the time-out 30000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-01-13T12:42:17.8121513Z](https://github.com/apache/pulsar/actions/runs/12746934915/job/35524005314#step:9:2649)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testHandleNoChannelOwner() didn't finish within the time-out 30000
	at java.base@17.0.13/java.lang.Thread.sleep(Native Method)
	at java.base@17.0.13/java.lang.Thread.sleep(Thread.java:344)
	at java.base@17.0.13/java.util.concurrent.TimeUnit.sleep(TimeUnit.java:446)
	at app//org.awaitility.core.Uninterruptibles.sleepUninterruptibly(Uninterruptibles.java:35)
	at app//org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:117)
	at app//org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at app//org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at app//org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at app//org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at app//org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testHandleNoChannelOwner(ExtensibleLoadManagerImplTest.java:1629)
	at java.base@17.0.13/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base@17.0.13/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base@17.0.13/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base@17.0.13/java.lang.reflect.Method.invoke(Method.java:569)
	at app//org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base@17.0.13/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base@17.0.13/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base@17.0.13/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base@17.0.13/java.lang.Thread.run(Thread.java:840)

</pre></code>
</details>

