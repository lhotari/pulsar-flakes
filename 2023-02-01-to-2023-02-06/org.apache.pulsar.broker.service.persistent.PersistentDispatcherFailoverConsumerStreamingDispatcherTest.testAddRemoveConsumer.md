        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentDispatcherFailoverConsumerStreamingDispatcherTest.testAddRemoveConsumer
Number of failures: 18

org.apache.pulsar.broker.service.persistent.PersistentDispatcherFailoverConsumerStreamingDispatcherTest is flaky. The testAddRemoveConsumer test method fails sporadically.

```
java.lang.AssertionError: expected object to not be null
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.assertNotNull(Assert.java:1319)
	at org.testng.Assert.assertNotNull(Assert.java:1303)
	at org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest.testAddRemoveConsumer(PersistentDispatcherFailoverConsumerTest.java:360)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-04T18:03:14.1423754Z](https://github.com/apache/pulsar/actions/runs/4092732000/jobs/7057666446#step:9:729)  
[example failure 2023-02-04T04:07:00.1467366Z](https://github.com/apache/pulsar/actions/runs/4076016338/jobs/7052833156#step:9:729)  
[example failure 2023-02-04T03:08:45.7211809Z](https://github.com/apache/pulsar/actions/runs/4089625311/jobs/7052464856#step:9:729)  
[example failure 2023-02-04T00:01:11.0816026Z](https://github.com/apache/pulsar/actions/runs/4088820724/jobs/7050875412#step:9:729)  
[example failure 2023-02-03T23:58:58.4095449Z](https://github.com/apache/pulsar/actions/runs/4088804123/jobs/7050842767#step:9:729)  
[example failure 2023-02-03T14:58:46.4573486Z](https://github.com/apache/pulsar/actions/runs/4085189227/jobs/7042838377#step:9:729)  
[example failure 2023-02-03T12:56:12.6283218Z](https://github.com/apache/pulsar/actions/runs/4084258072/jobs/7040754134#step:9:729)  
[example failure 2023-02-03T09:24:12.9878073Z](https://github.com/apache/pulsar/actions/runs/4082697666/jobs/7037358539#step:9:729)  
[example failure 2023-02-03T07:28:37.3640107Z](https://github.com/apache/pulsar/actions/runs/4081947717/jobs/7035828659#step:9:729)  
[example failure 2023-02-03T03:24:12.2930357Z](https://github.com/apache/pulsar/actions/runs/4080739803/jobs/7033499918#step:9:715)  
[example failure 2023-02-02T18:25:43.8241999Z](https://github.com/apache/pulsar/actions/runs/4077347643/jobs/7026262481#step:9:729)  
[example failure 2023-02-02T11:11:57.5479797Z](https://github.com/apache/pulsar/actions/runs/4073789290/jobs/7018144141#step:9:729)  
[example failure 2023-02-02T10:36:16.9672268Z](https://github.com/apache/pulsar/actions/runs/4073474352/jobs/7017462811#step:9:729)  
[example failure 2023-02-02T10:21:35.0513962Z](https://github.com/apache/pulsar/actions/runs/4073367802/jobs/7017221754#step:9:729)  
[example failure 2023-02-02T09:56:12.3757994Z](https://github.com/apache/pulsar/actions/runs/4073163727/jobs/7016760710#step:9:729)  
[example failure 2023-02-02T07:56:02.5078948Z](https://github.com/apache/pulsar/actions/runs/4072298561/jobs/7014911546#step:9:731)  
[example failure 2023-02-02T05:52:55.0096552Z](https://github.com/apache/pulsar/actions/runs/4069198762/jobs/7013586039#step:9:714)  
[example failure 2023-02-02T04:00:43.6035713Z](https://github.com/apache/pulsar/actions/runs/4071061634/jobs/7012507778#step:9:731)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected object to not be null
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.assertNotNull(Assert.java:1319)
	at org.testng.Assert.assertNotNull(Assert.java:1303)
	at org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest.testAddRemoveConsumer(PersistentDispatcherFailoverConsumerTest.java:360)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

