        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.testConcurrentConsumerReceiveWhileReconnect
Number of failures: 47

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The testConcurrentConsumerReceiveWhileReconnect test method fails sporadically.

```
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.api.PulsarClient.newConsumer()" because "this.pulsarClient" is null
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testConcurrentConsumerReceiveWhileReconnect(SimpleProducerConsumerTest.java:880)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-14T10:56:02.8789717Z](https://github.com/apache/pulsar/actions/runs/3249033200/jobs/5331341219#step:8:312)  
[example failure 2022-10-14T09:56:58.9925049Z](https://github.com/apache/pulsar/actions/runs/3246419630/jobs/5330528404#step:8:312)  
[example failure 2022-10-14T09:31:02.8198266Z](https://github.com/apache/pulsar/actions/runs/3246245282/jobs/5329887234#step:8:222)  
[example failure 2022-10-14T08:32:32.2333833Z](https://github.com/apache/pulsar/actions/runs/3248340819/jobs/5329581715#step:8:210)  
[example failure 2022-10-14T06:51:22.2924518Z](https://github.com/apache/pulsar/actions/runs/3247045561/jobs/5328555438#step:8:222)  
[example failure 2022-10-14T02:55:58.9826798Z](https://github.com/apache/pulsar/actions/runs/3247045561/jobs/5326591310#step:8:312)  
[example failure 2022-10-14T02:40:17.0310793Z](https://github.com/apache/pulsar/actions/runs/3247018079/jobs/5326486248#step:8:230)  
[example failure 2022-10-14T01:55:24.4479457Z](https://github.com/apache/pulsar/actions/runs/3246868915/jobs/5326162456#step:8:312)  
[example failure 2022-10-14T01:36:47.3679511Z](https://github.com/apache/pulsar/actions/runs/3246245282/jobs/5326011276#step:8:301)  
[example failure 2022-10-13T23:09:04.3613507Z](https://github.com/apache/pulsar/actions/runs/3246245282/jobs/5324775355#step:8:312)  
[example failure 2022-10-13T18:15:45.3434494Z](https://github.com/apache/pulsar/actions/runs/3244617454/jobs/5321036631#step:8:230)  
[example failure 2022-10-13T14:42:08.9785515Z](https://github.com/apache/pulsar/actions/runs/3240577012/jobs/5317352775#step:8:230)  
[example failure 2022-10-13T14:33:10.6517752Z](https://github.com/apache/pulsar/actions/runs/3240610250/jobs/5317309475#step:8:230)  
[example failure 2022-10-13T08:46:41.9466059Z](https://github.com/apache/pulsar/actions/runs/3240659858/jobs/5311876562#step:8:230)  
[example failure 2022-10-13T08:42:16.6295677Z](https://github.com/apache/pulsar/actions/runs/3240623988/jobs/5311736002#step:8:230)  
[example failure 2022-10-13T08:39:25.0616090Z](https://github.com/apache/pulsar/actions/runs/3240610250/jobs/5311712964#step:8:222)  
[example failure 2022-10-13T08:35:46.4325804Z](https://github.com/apache/pulsar/actions/runs/3240577012/jobs/5311589455#step:8:230)  
[example failure 2022-10-13T05:27:18.5222363Z](https://github.com/apache/pulsar/actions/runs/3239849062/jobs/5309746036#step:8:230)  
[example failure 2022-10-13T03:13:48.4248688Z](https://github.com/apache/pulsar/actions/runs/3233318834/jobs/5308618418#step:8:212)  
[example failure 2022-10-13T01:41:56.2027097Z](https://github.com/apache/pulsar/actions/runs/3239067534/jobs/5308020214#step:8:222)  
[example failure 2022-10-13T00:42:54.0330836Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5307507702#step:8:226)  
[example failure 2022-10-12T23:57:31.8770935Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5307118618#step:8:215)  
[example failure 2022-10-12T18:15:04.6750304Z](https://github.com/apache/pulsar/actions/runs/3236801789/jobs/5303181996#step:8:230)  
[example failure 2022-10-12T17:42:38.3577379Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5302462647#step:8:223)  
[example failure 2022-10-12T16:13:56.8917239Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5300997885#step:8:222)  
[example failure 2022-10-12T15:27:15.6604606Z](https://github.com/apache/pulsar/actions/runs/3235740231/jobs/5300674445#step:8:218)  
[example failure 2022-10-12T15:15:02.2826557Z](https://github.com/apache/pulsar/actions/runs/3235705916/jobs/5300569342#step:8:230)  
[example failure 2022-10-12T14:40:34.2096886Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5299947306#step:8:226)  
[example failure 2022-10-12T12:28:42.5671488Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5297070111#step:8:226)  
[example failure 2022-10-12T11:56:10.3790394Z](https://github.com/apache/pulsar/actions/runs/3233318834/jobs/5296016020#step:8:230)  
[example failure 2022-10-12T08:57:21.4119076Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5294318373#step:8:218)  
[example failure 2022-10-12T06:54:56.3378310Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5292938796#step:8:226)  
[example failure 2022-10-12T05:04:34.5212344Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5292392548#step:8:226)  
[example failure 2022-10-12T02:18:34.4709955Z](https://github.com/apache/pulsar/actions/runs/3227865814/jobs/5291100978#step:8:226)  
[example failure 2022-10-12T01:57:04.4222506Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5290991996#step:8:226)  
[example failure 2022-10-12T01:46:07.5577658Z](https://github.com/apache/pulsar/actions/runs/3231410501/jobs/5290909090#step:8:222)  
[example failure 2022-10-11T19:58:34.1723661Z](https://github.com/apache/pulsar/actions/runs/3229794672/jobs/5287496883#step:8:230)  
[example failure 2022-10-11T13:19:48.7800943Z](https://github.com/apache/pulsar/actions/runs/3224852740/jobs/5281004691#step:8:226)  
[example failure 2022-10-11T11:16:46.8949434Z](https://github.com/apache/pulsar/actions/runs/3225447109/jobs/5278912457#step:8:218)  
[example failure 2022-10-11T10:41:16.3798019Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5278497616#step:8:226)  
[example failure 2022-10-11T07:47:29.6734013Z](https://github.com/apache/pulsar/actions/runs/3224912721/jobs/5276607749#step:8:226)  
[example failure 2022-10-11T07:34:15.8774244Z](https://github.com/apache/pulsar/actions/runs/3224852740/jobs/5276534790#step:8:226)  
[example failure 2022-10-11T06:22:09.6227731Z](https://github.com/apache/pulsar/actions/runs/3224531076/jobs/5275758632#step:8:207)  
[example failure 2022-10-11T05:12:43.7991113Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5275189880#step:8:218)  
[example failure 2022-10-11T04:15:10.8962095Z](https://github.com/apache/pulsar/actions/runs/3223919371/jobs/5274707393#step:8:218)  
[example failure 2022-10-11T03:48:07.5156587Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5274485969#step:8:226)  
[example failure 2022-10-10T12:21:50.9207980Z](https://github.com/apache/pulsar/actions/runs/3219150517/jobs/5264205064#step:8:226)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.api.PulsarClient.newConsumer()" because "this.pulsarClient" is null
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testConcurrentConsumerReceiveWhileReconnect(SimpleProducerConsumerTest.java:880)
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

