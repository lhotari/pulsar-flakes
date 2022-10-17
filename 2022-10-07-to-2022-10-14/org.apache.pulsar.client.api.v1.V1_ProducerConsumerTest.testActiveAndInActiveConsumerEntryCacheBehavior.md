        
Flaky-test: org.apache.pulsar.client.api.v1.V1_ProducerConsumerTest.testActiveAndInActiveConsumerEntryCacheBehavior
Number of failures: 40

org.apache.pulsar.client.api.v1.V1_ProducerConsumerTest is flaky. The testActiveAndInActiveConsumerEntryCacheBehavior test method fails sporadically.

```
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.api.v1.V1_ProducerConsumerTest.testActiveAndInActiveConsumerEntryCacheBehavior(V1_ProducerConsumerTest.java:724)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-14T10:56:38.0825410Z](https://github.com/apache/pulsar/actions/runs/3249033200/jobs/5331341219#step:8:1205)  
[example failure 2022-10-14T09:57:36.4143119Z](https://github.com/apache/pulsar/actions/runs/3246419630/jobs/5330528404#step:8:1205)  
[example failure 2022-10-14T09:31:48.4092430Z](https://github.com/apache/pulsar/actions/runs/3246245282/jobs/5329887234#step:8:1073)  
[example failure 2022-10-14T02:56:48.1709608Z](https://github.com/apache/pulsar/actions/runs/3247045561/jobs/5326591310#step:8:1205)  
[example failure 2022-10-14T02:40:58.5600861Z](https://github.com/apache/pulsar/actions/runs/3247018079/jobs/5326486248#step:8:1073)  
[example failure 2022-10-14T01:56:10.1961205Z](https://github.com/apache/pulsar/actions/runs/3246868915/jobs/5326162456#step:8:1073)  
[example failure 2022-10-14T01:37:31.4233367Z](https://github.com/apache/pulsar/actions/runs/3246245282/jobs/5326011276#step:8:1194)  
[example failure 2022-10-13T23:09:41.1539982Z](https://github.com/apache/pulsar/actions/runs/3246245282/jobs/5324775355#step:8:1073)  
[example failure 2022-10-13T18:16:33.6323269Z](https://github.com/apache/pulsar/actions/runs/3244617454/jobs/5321036631#step:8:1073)  
[example failure 2022-10-13T14:42:50.3137714Z](https://github.com/apache/pulsar/actions/runs/3240577012/jobs/5317352775#step:8:1205)  
[example failure 2022-10-13T14:34:02.1391017Z](https://github.com/apache/pulsar/actions/runs/3240610250/jobs/5317309475#step:8:1073)  
[example failure 2022-10-13T08:47:35.4902069Z](https://github.com/apache/pulsar/actions/runs/3240659858/jobs/5311876562#step:8:1205)  
[example failure 2022-10-13T08:43:04.2134342Z](https://github.com/apache/pulsar/actions/runs/3240623988/jobs/5311736002#step:8:1205)  
[example failure 2022-10-13T08:36:29.3057111Z](https://github.com/apache/pulsar/actions/runs/3240577012/jobs/5311589455#step:8:1205)  
[example failure 2022-10-13T05:28:06.6922400Z](https://github.com/apache/pulsar/actions/runs/3239849062/jobs/5309746036#step:8:1073)  
[example failure 2022-10-13T03:14:32.4174016Z](https://github.com/apache/pulsar/actions/runs/3233318834/jobs/5308618418#step:8:1053)  
[example failure 2022-10-13T01:42:40.6298531Z](https://github.com/apache/pulsar/actions/runs/3239067534/jobs/5308020214#step:8:1071)  
[example failure 2022-10-13T00:43:35.4736733Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5307507702#step:8:1067)  
[example failure 2022-10-12T23:58:11.5935518Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5307118618#step:8:1056)  
[example failure 2022-10-12T18:15:49.1462779Z](https://github.com/apache/pulsar/actions/runs/3236801789/jobs/5303181996#step:8:1071)  
[example failure 2022-10-12T17:43:11.9102394Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5302462647#step:8:1067)  
[example failure 2022-10-12T15:28:00.4536433Z](https://github.com/apache/pulsar/actions/runs/3235740231/jobs/5300674445#step:8:1059)  
[example failure 2022-10-12T15:15:48.8200816Z](https://github.com/apache/pulsar/actions/runs/3235705916/jobs/5300569342#step:8:1071)  
[example failure 2022-10-12T14:41:06.8738157Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5299947306#step:8:1067)  
[example failure 2022-10-12T12:29:18.3560987Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5297070111#step:8:1199)  
[example failure 2022-10-12T11:57:03.1705598Z](https://github.com/apache/pulsar/actions/runs/3233318834/jobs/5296016020#step:8:1071)  
[example failure 2022-10-12T06:55:28.4158871Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5292938796#step:8:1067)  
[example failure 2022-10-12T05:05:07.7258253Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5292392548#step:8:1067)  
[example failure 2022-10-12T02:19:10.4231932Z](https://github.com/apache/pulsar/actions/runs/3227865814/jobs/5291100978#step:8:1067)  
[example failure 2022-10-12T01:57:34.4517148Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5290991996#step:8:1067)  
[example failure 2022-10-12T01:46:58.0310095Z](https://github.com/apache/pulsar/actions/runs/3231410501/jobs/5290909090#step:8:1203)  
[example failure 2022-10-11T19:59:17.1649940Z](https://github.com/apache/pulsar/actions/runs/3229794672/jobs/5287496883#step:8:1071)  
[example failure 2022-10-11T13:20:26.6007958Z](https://github.com/apache/pulsar/actions/runs/3224852740/jobs/5281004691#step:8:1067)  
[example failure 2022-10-11T10:41:50.3960163Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5278497616#step:8:1067)  
[example failure 2022-10-11T07:48:00.2139793Z](https://github.com/apache/pulsar/actions/runs/3224912721/jobs/5276607749#step:8:1199)  
[example failure 2022-10-11T07:34:49.1432965Z](https://github.com/apache/pulsar/actions/runs/3224852740/jobs/5276534790#step:8:1067)  
[example failure 2022-10-11T06:22:42.5682096Z](https://github.com/apache/pulsar/actions/runs/3224531076/jobs/5275758632#step:8:1188)  
[example failure 2022-10-11T05:13:25.0036530Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5275189880#step:8:1199)  
[example failure 2022-10-11T03:48:47.6982693Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5274485969#step:8:1067)  
[example failure 2022-10-10T12:22:31.8587913Z](https://github.com/apache/pulsar/actions/runs/3219150517/jobs/5264205064#step:8:1067)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.api.v1.V1_ProducerConsumerTest.testActiveAndInActiveConsumerEntryCacheBehavior(V1_ProducerConsumerTest.java:724)
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

