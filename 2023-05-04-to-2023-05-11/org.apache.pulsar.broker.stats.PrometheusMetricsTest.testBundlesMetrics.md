        
Flaky-test: org.apache.pulsar.broker.stats.PrometheusMetricsTest.testBundlesMetrics
Number of failures: 6

org.apache.pulsar.broker.stats.PrometheusMetricsTest is flaky. The testBundlesMetrics test method fails sporadically.

```
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.broker.stats.PrometheusMetricsTest.testBundlesMetrics(PrometheusMetricsTest.java:579)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-05-10T09:27:26.5270600Z](https://github.com/apache/pulsar/actions/runs/4934042853/jobs/8821241975#step:9:6340)  
[example failure 2023-05-10T09:25:11.5675297Z](https://github.com/apache/pulsar/actions/runs/4934042853/jobs/8821241975#step:9:5378)  
[example failure 2023-05-10T09:22:56.3480707Z](https://github.com/apache/pulsar/actions/runs/4934042853/jobs/8821241975#step:9:1456)  
[example failure 2023-05-10T07:18:35.8095856Z](https://github.com/apache/pulsar/actions/runs/4934042853/jobs/8818616695#step:9:3220)  
[example failure 2023-05-10T07:16:45.2482419Z](https://github.com/apache/pulsar/actions/runs/4934042853/jobs/8818616695#step:9:2258)  
[example failure 2023-05-10T07:14:50.5690040Z](https://github.com/apache/pulsar/actions/runs/4934042853/jobs/8818616695#step:9:1296)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.broker.stats.PrometheusMetricsTest.testBundlesMetrics(PrometheusMetricsTest.java:579)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>

