        
Flaky-test: org.apache.pulsar.broker.stats.PrometheusMetricsTest.testDuplicateMetricTypeDefinitions
Number of failures: 32

org.apache.pulsar.broker.stats.PrometheusMetricsTest is flaky. The testDuplicateMetricTypeDefinitions test method fails sporadically.

```
java.lang.AssertionError: Metric pulsar_txn_pending_ack_store_bufferedwriter_batch_record_count_count does not have a corresponding summary type definition
	at org.testng.Assert.fail(Assert.java:99)
	at org.apache.pulsar.broker.stats.PrometheusMetricsTest.testDuplicateMetricTypeDefinitions(PrometheusMetricsTest.java:842)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
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
[example failure 2022-10-12T01:45:26.1328197Z](https://github.com/apache/pulsar/actions/runs/3225955522/jobs/5290732556#step:8:1791)  
[example failure 2022-10-11T18:20:41.3048169Z](https://github.com/apache/pulsar/actions/runs/3225955522/jobs/5285842677#step:8:1820)  
[example failure 2022-10-11T16:27:04.0436304Z](https://github.com/apache/pulsar/actions/runs/3225955522/jobs/5284328569#step:8:2027)  
[example failure 2022-10-11T16:18:41.2421981Z](https://github.com/apache/pulsar/actions/runs/3225447109/jobs/5284149796#step:8:1945)  
[example failure 2022-10-11T14:43:25.3504747Z](https://github.com/apache/pulsar/actions/runs/3225447109/jobs/5282441312#step:8:1982)  
[example failure 2022-10-11T11:04:25.4895507Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5278497616#step:8:1881)  
[example failure 2022-10-11T04:13:31.3116679Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5274485969#step:8:1888)  
[example failure 2022-10-10T15:12:56.6302423Z](https://github.com/apache/pulsar/actions/runs/3214320846/jobs/5266457427#step:8:1721)  
[example failure 2022-10-10T14:24:09.0870903Z](https://github.com/apache/pulsar/actions/runs/3214320846/jobs/5265621520#step:8:1876)  
[example failure 2022-10-10T10:21:01.6338672Z](https://github.com/apache/pulsar/actions/runs/3217598692/jobs/5262371795#step:8:1721)  
[example failure 2022-10-10T08:49:31.6434611Z](https://github.com/apache/pulsar/actions/runs/3216792245/jobs/5261185394#step:8:1721)  
[example failure 2022-10-10T04:20:04.6830838Z](https://github.com/apache/pulsar/actions/runs/3212721140/jobs/5258920079#step:8:1721)  
[example failure 2022-10-10T03:01:07.6606061Z](https://github.com/apache/pulsar/actions/runs/3213481763/jobs/5258443612#step:8:1876)  
[example failure 2022-10-10T02:23:57.8243984Z](https://github.com/apache/pulsar/actions/runs/3198977339/jobs/5258187188#step:8:1876)  
[example failure 2022-10-09T14:15:21.1782807Z](https://github.com/apache/pulsar/actions/runs/3214320846/jobs/5254631673#step:8:1876)  
[example failure 2022-10-09T12:14:54.4484337Z](https://github.com/apache/pulsar/actions/runs/3210437931/jobs/5254080828#step:8:1721)  
[example failure 2022-10-09T11:21:10.9295505Z](https://github.com/apache/pulsar/actions/runs/3213453710/jobs/5253826613#step:8:1721)  
[example failure 2022-10-09T11:16:11.4352400Z](https://github.com/apache/pulsar/actions/runs/3209406941/jobs/5253787615#step:8:1591)  
[example failure 2022-10-09T09:56:31.1670121Z](https://github.com/apache/pulsar/actions/runs/3210625834/jobs/5253428797#step:8:1721)  


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

