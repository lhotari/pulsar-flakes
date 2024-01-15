        
Flaky-test: org.apache.pulsar.broker.SLAMonitoringTest.testUnloadIfBrokerCrashes
Number of failures: 1

org.apache.pulsar.broker.SLAMonitoringTest is flaky. The testUnloadIfBrokerCrashes test method fails sporadically.

```
java.lang.AssertionError: The broker should be able to start without exception
	at org.testng.Assert.fail(Assert.java:110)
	at org.apache.pulsar.broker.SLAMonitoringTest.testUnloadIfBrokerCrashes(SLAMonitoringTest.java:229)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-01-14T06:19:41.5013169Z](https://github.com/apache/pulsar/actions/runs/7517340777/job/20463557090#step:10:707)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: The broker should be able to start without exception
	at org.testng.Assert.fail(Assert.java:110)
	at org.apache.pulsar.broker.SLAMonitoringTest.testUnloadIfBrokerCrashes(SLAMonitoringTest.java:229)
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

