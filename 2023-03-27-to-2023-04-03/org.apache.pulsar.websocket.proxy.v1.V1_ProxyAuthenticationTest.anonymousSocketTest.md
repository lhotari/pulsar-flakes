        
Flaky-test: org.apache.pulsar.websocket.proxy.v1.V1_ProxyAuthenticationTest.anonymousSocketTest
Number of failures: 1

org.apache.pulsar.websocket.proxy.v1.V1_ProxyAuthenticationTest is flaky. The anonymousSocketTest test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.websocket.proxy.v1.V1_ProxyAuthenticationTest.anonymousSocketTest() didn't finish within the time-out 10000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-03-29T17:39:37.7499556Z](https://github.com/apache/pulsar/actions/runs/4556073033/jobs/8036370880#step:11:513)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.websocket.proxy.v1.V1_ProxyAuthenticationTest.anonymousSocketTest() didn't finish within the time-out 10000
	at java.base@17.0.6/java.lang.Thread.sleep(Native Method)
	at java.base@17.0.6/java.lang.Thread.sleep(Thread.java:337)
	at java.base@17.0.6/java.util.concurrent.TimeUnit.sleep(TimeUnit.java:446)
	at app//org.awaitility.core.Uninterruptibles.sleepUninterruptibly(Uninterruptibles.java:35)
	at app//org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:117)
	at app//org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at app//org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at app//org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at app//org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at app//org.apache.pulsar.websocket.proxy.v1.V1_ProxyAuthenticationTest.socketTest(V1_ProxyAuthenticationTest.java:137)
	at app//org.apache.pulsar.websocket.proxy.v1.V1_ProxyAuthenticationTest.anonymousSocketTest(V1_ProxyAuthenticationTest.java:150)
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

