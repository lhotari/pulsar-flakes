        
Flaky-test: org.apache.pulsar.client.api.v1.V1_ProducerConsumerTest.testActiveAndInActiveConsumerEntryCacheBehavior
Number of failures: 79

org.apache.pulsar.client.api.v1.V1_ProducerConsumerTest is flaky. The testActiveAndInActiveConsumerEntryCacheBehavior test method fails sporadically.

```
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.api.v1.V1_ProducerConsumerTest.testActiveAndInActiveConsumerEntryCacheBehavior(V1_ProducerConsumerTest.java:723)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-10T15:30:53.4519022Z](https://github.com/apache/pulsar/actions/runs/3214320846/jobs/5267224685#step:8:183)  
[example failure 2022-10-10T14:44:28.7673181Z](https://github.com/apache/pulsar/actions/runs/3214320846/jobs/5266457427#step:8:183)  
[example failure 2022-10-10T13:54:46.3145731Z](https://github.com/apache/pulsar/actions/runs/3214320846/jobs/5265621520#step:8:183)  
[example failure 2022-10-10T05:25:58.9996445Z](https://github.com/apache/pulsar/actions/runs/3197586939/jobs/5259543501#step:8:183)  
[example failure 2022-10-10T04:52:04.6231492Z](https://github.com/apache/pulsar/actions/runs/3212721140/jobs/5259321925#step:8:183)  
[example failure 2022-10-10T03:53:51.1259224Z](https://github.com/apache/pulsar/actions/runs/3212721140/jobs/5258920079#step:8:183)  
[example failure 2022-10-10T02:34:47.7457051Z](https://github.com/apache/pulsar/actions/runs/3213481763/jobs/5258443612#step:8:183)  
[example failure 2022-10-10T01:56:46.3236845Z](https://github.com/apache/pulsar/actions/runs/3198977339/jobs/5258187188#step:8:183)  
[example failure 2022-10-10T01:50:30.8868639Z](https://github.com/apache/pulsar/actions/runs/3216344708/jobs/5258146130#step:8:183)  
[example failure 2022-10-10T01:13:08.9043750Z](https://github.com/apache/pulsar/actions/runs/3213481763/jobs/5257926051#step:8:173)  
[example failure 2022-10-09T14:33:43.1417784Z](https://github.com/apache/pulsar/actions/runs/3214320846/jobs/5254851479#step:8:183)  
[example failure 2022-10-09T13:46:34.3736422Z](https://github.com/apache/pulsar/actions/runs/3214320846/jobs/5254631673#step:8:183)  
[example failure 2022-10-09T12:12:41.6754873Z](https://github.com/apache/pulsar/actions/runs/3213453710/jobs/5254181590#step:8:183)  
[example failure 2022-10-09T11:48:45.5992594Z](https://github.com/apache/pulsar/actions/runs/3210437931/jobs/5254080828#step:8:183)  
[example failure 2022-10-09T11:18:07.7818356Z](https://github.com/apache/pulsar/actions/runs/3210625834/jobs/5253933821#step:8:183)  
[example failure 2022-10-09T10:55:33.3776333Z](https://github.com/apache/pulsar/actions/runs/3213453710/jobs/5253826613#step:8:183)  
[example failure 2022-10-09T10:46:04.2057078Z](https://github.com/apache/pulsar/actions/runs/3213605116/jobs/5253792638#step:8:183)  
[example failure 2022-10-09T09:30:11.0123598Z](https://github.com/apache/pulsar/actions/runs/3210625834/jobs/5253428797#step:8:183)  
[example failure 2022-10-09T09:23:26.8793476Z](https://github.com/apache/pulsar/actions/runs/3213605116/jobs/5253399150#step:8:183)  
[example failure 2022-10-09T08:39:25.3727327Z](https://github.com/apache/pulsar/actions/runs/3213481763/jobs/5253186221#step:8:183)  
[example failure 2022-10-09T06:44:13.6891395Z](https://github.com/apache/pulsar/actions/runs/3210658082/jobs/5252664717#step:8:183)  
[example failure 2022-10-09T06:18:33.3448394Z](https://github.com/apache/pulsar/actions/runs/3210625834/jobs/5252538407#step:8:183)  
[example failure 2022-10-08T04:48:58.3859146Z](https://github.com/apache/pulsar/actions/runs/3208988001/jobs/5245634980#step:8:183)  
[example failure 2022-10-08T03:51:18.0718795Z](https://github.com/apache/pulsar/actions/runs/3208988001/jobs/5245356719#step:8:183)  
[example failure 2022-10-08T00:27:08.3783167Z](https://github.com/apache/pulsar/actions/runs/3208420698/jobs/5244258152#step:8:183)  
[example failure 2022-10-07T12:21:40.1948133Z](https://github.com/apache/pulsar/actions/runs/3204577024/jobs/5236145010#step:8:172)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.api.v1.V1_ProducerConsumerTest.testActiveAndInActiveConsumerEntryCacheBehavior(V1_ProducerConsumerTest.java:723)
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

```
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.api.v1.V1_ProducerConsumerTest.testActiveAndInActiveConsumerEntryCacheBehavior(V1_ProducerConsumerTest.java:724)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
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
[example failure 2022-10-11T17:58:27.0067275Z](https://github.com/apache/pulsar/actions/runs/3225955522/jobs/5285842677#step:8:1067)  
[example failure 2022-10-11T15:53:26.6329308Z](https://github.com/apache/pulsar/actions/runs/3225447109/jobs/5284149796#step:8:1189)  
[example failure 2022-10-11T14:27:49.9586409Z](https://github.com/apache/pulsar/actions/runs/3225955522/jobs/5282662964#step:8:1067)  
[example failure 2022-10-11T14:18:29.5372479Z](https://github.com/apache/pulsar/actions/runs/3225447109/jobs/5282441312#step:8:1067)  
[example failure 2022-10-11T13:20:26.6007958Z](https://github.com/apache/pulsar/actions/runs/3224852740/jobs/5281004691#step:8:1067)  
[example failure 2022-10-11T10:41:50.3960163Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5278497616#step:8:1067)  
[example failure 2022-10-11T09:59:34.6874672Z](https://github.com/apache/pulsar/actions/runs/3225093491/jobs/5277654575#step:8:1199)  
[example failure 2022-10-11T07:48:00.2139793Z](https://github.com/apache/pulsar/actions/runs/3224912721/jobs/5276607749#step:8:1199)  
[example failure 2022-10-11T07:34:49.1432965Z](https://github.com/apache/pulsar/actions/runs/3224852740/jobs/5276534790#step:8:1067)  
[example failure 2022-10-11T06:22:42.5682096Z](https://github.com/apache/pulsar/actions/runs/3224531076/jobs/5275758632#step:8:1188)  
[example failure 2022-10-11T05:13:25.0036530Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5275189880#step:8:1199)  
[example failure 2022-10-11T04:24:32.8420549Z](https://github.com/apache/pulsar/actions/runs/3224027943/jobs/5274806839#step:8:1067)  
[example failure 2022-10-11T03:48:47.6982693Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5274485969#step:8:1067)  
[example failure 2022-10-11T02:26:22.4265443Z](https://github.com/apache/pulsar/actions/runs/3218251417/jobs/5273968044#step:8:172)  
[example failure 2022-10-10T13:50:38.7893240Z](https://github.com/apache/pulsar/actions/runs/3217598692/jobs/5265543777#step:8:183)  
[example failure 2022-10-10T12:22:31.8587913Z](https://github.com/apache/pulsar/actions/runs/3219150517/jobs/5264205064#step:8:1067)  
[example failure 2022-10-10T09:55:34.0562228Z](https://github.com/apache/pulsar/actions/runs/3217598692/jobs/5262371795#step:8:183)  
[example failure 2022-10-10T08:22:08.8375931Z](https://github.com/apache/pulsar/actions/runs/3216792245/jobs/5261185394#step:8:183)  
[example failure 2022-10-10T06:14:57.0573185Z](https://github.com/apache/pulsar/actions/runs/3216792245/jobs/5259871584#step:8:183)  
[example failure 2022-10-10T01:52:10.9775225Z](https://github.com/apache/pulsar/actions/runs/3209406941/jobs/5258176046#step:8:183)  
[example failure 2022-10-09T10:46:15.6955582Z](https://github.com/apache/pulsar/actions/runs/3209406941/jobs/5253787615#step:8:183)  


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

```
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.api.v1.V1_ProducerConsumerTest.testActiveAndInActiveConsumerEntryCacheBehavior(V1_ProducerConsumerTest.java:706)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-09-07T23:05:11.5015183Z](https://github.com/apache/pulsar/runs/8238428932?check_suite_focus=true#step:10:1292)  
[example failure 2022-08-31T22:08:41.5765861Z](https://github.com/apache/pulsar/runs/8123742327?check_suite_focus=true#step:10:1289)  
[example failure 2022-08-31T21:05:55.0704705Z](https://github.com/apache/pulsar/runs/8122844849?check_suite_focus=true#step:9:1304)  
[example failure 2022-08-31T10:55:44.2779884Z](https://github.com/apache/pulsar/runs/8111596966?check_suite_focus=true#step:9:1304)  
[example failure 2022-08-31T10:30:20.3909248Z](https://github.com/apache/pulsar/runs/8110828963?check_suite_focus=true#step:10:1288)  
[example failure 2022-08-31T08:06:05.8368125Z](https://github.com/apache/pulsar/runs/8108548686?check_suite_focus=true#step:9:1301)  
[example failure 2022-08-31T07:15:18.4443842Z](https://github.com/apache/pulsar/runs/8108061748?check_suite_focus=true#step:9:1304)  
[example failure 2022-08-31T07:14:45.0013925Z](https://github.com/apache/pulsar/runs/8108057154?check_suite_focus=true#step:10:1284)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.api.v1.V1_ProducerConsumerTest.testActiveAndInActiveConsumerEntryCacheBehavior(V1_ProducerConsumerTest.java:706)
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

