        
Flaky-test: org.apache.pulsar.broker.stats.PrometheusMetricsTest.testDuplicateMetricTypeDefinitions
Number of failures: 22

org.apache.pulsar.broker.stats.PrometheusMetricsTest is flaky. The testDuplicateMetricTypeDefinitions test method fails sporadically.

```
java.lang.AssertionError: Metric pulsar_txn_pending_ack_store_bufferedwriter_batch_record_count_count does not have a corresponding summary type definition
	at org.testng.Assert.fail(Assert.java:99)
	at org.apache.pulsar.broker.stats.PrometheusMetricsTest.testDuplicateMetricTypeDefinitions(PrometheusMetricsTest.java:842)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-14T11:20:18.5422517Z](https://github.com/apache/pulsar/actions/runs/3249033200/jobs/5331341219#step:8:2184)  
[example failure 2022-10-14T10:23:33.6320325Z](https://github.com/apache/pulsar/actions/runs/3246419630/jobs/5330528404#step:8:2092)  
[example failure 2022-10-14T07:15:49.1305728Z](https://github.com/apache/pulsar/actions/runs/3247045561/jobs/5328555438#step:8:1887)  
[example failure 2022-10-14T03:24:06.5899093Z](https://github.com/apache/pulsar/actions/runs/3247045561/jobs/5326591310#step:8:2022)  
[example failure 2022-10-14T02:21:48.1096948Z](https://github.com/apache/pulsar/actions/runs/3246868915/jobs/5326162456#step:8:1857)  
[example failure 2022-10-14T02:07:06.9776119Z](https://github.com/apache/pulsar/actions/runs/3246245282/jobs/5326011276#step:8:2245)  
[example failure 2022-10-13T23:34:37.3473794Z](https://github.com/apache/pulsar/actions/runs/3246245282/jobs/5324775355#step:8:1927)  
[example failure 2022-10-13T15:07:29.3103609Z](https://github.com/apache/pulsar/actions/runs/3240577012/jobs/5317352775#step:8:2192)  
[example failure 2022-10-13T15:03:19.2306439Z](https://github.com/apache/pulsar/actions/runs/3240610250/jobs/5317309475#step:8:2013)  
[example failure 2022-10-13T09:05:01.0425219Z](https://github.com/apache/pulsar/actions/runs/3240610250/jobs/5311712964#step:8:1756)  
[example failure 2022-10-13T03:38:49.9189359Z](https://github.com/apache/pulsar/actions/runs/3233318834/jobs/5308618418#step:8:1779)  
[example failure 2022-10-13T00:22:52.2968741Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5307118618#step:8:1877)  
[example failure 2022-10-12T18:41:20.8466572Z](https://github.com/apache/pulsar/actions/runs/3236801789/jobs/5303181996#step:8:2018)  
[example failure 2022-10-12T18:05:44.3758389Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5302462647#step:8:1880)  
[example failure 2022-10-12T15:40:57.6197442Z](https://github.com/apache/pulsar/actions/runs/3235705916/jobs/5300569342#step:8:2025)  
[example failure 2022-10-12T15:03:13.2712184Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5299947306#step:8:1819)  
[example failure 2022-10-12T12:53:26.5315945Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5297070111#step:8:1985)  
[example failure 2022-10-12T12:23:35.8244030Z](https://github.com/apache/pulsar/actions/runs/3233318834/jobs/5296016020#step:8:1888)  
[example failure 2022-10-12T05:27:52.2904416Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5292392548#step:8:1819)  
[example failure 2022-10-12T02:11:34.4332277Z](https://github.com/apache/pulsar/actions/runs/3231410501/jobs/5290909090#step:8:1992)  
[example failure 2022-10-11T11:04:25.4895507Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5278497616#step:8:1881)  
[example failure 2022-10-11T04:13:31.3116679Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5274485969#step:8:1888)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: Metric pulsar_txn_pending_ack_store_bufferedwriter_batch_record_count_count does not have a corresponding summary type definition
	at org.testng.Assert.fail(Assert.java:99)
	at org.apache.pulsar.broker.stats.PrometheusMetricsTest.testDuplicateMetricTypeDefinitions(PrometheusMetricsTest.java:842)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

