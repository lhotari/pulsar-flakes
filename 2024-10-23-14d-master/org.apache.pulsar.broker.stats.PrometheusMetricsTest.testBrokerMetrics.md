        
Flaky-test: org.apache.pulsar.broker.stats.PrometheusMetricsTest.testBrokerMetrics
Number of failures: 1

org.apache.pulsar.broker.stats.PrometheusMetricsTest is flaky. The testBrokerMetrics test method fails sporadically.

```
java.lang.AssertionError: expected [195.0] but found [0.0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEquals(Assert.java:727)
	at org.testng.Assert.assertEquals(Assert.java:774)
	at org.apache.pulsar.broker.stats.PrometheusMetricsTest.testBrokerMetrics(PrometheusMetricsTest.java:315)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-10-16T06:17:24.5458814Z](https://github.com/apache/pulsar/actions/runs/11359810245/job/31596806195#step:11:1141)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [195.0] but found [0.0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEquals(Assert.java:727)
	at org.testng.Assert.assertEquals(Assert.java:774)
	at org.apache.pulsar.broker.stats.PrometheusMetricsTest.testBrokerMetrics(PrometheusMetricsTest.java:315)
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
