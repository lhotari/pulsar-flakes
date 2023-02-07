        
Flaky-test: org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest.testAddRemoveConsumer
Number of failures: 11

org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest is flaky. The testAddRemoveConsumer test method fails sporadically.

```
java.lang.AssertionError: expected object to not be null
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.assertNotNull(Assert.java:1319)
	at org.testng.Assert.assertNotNull(Assert.java:1303)
	at org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest.testAddRemoveConsumer(PersistentDispatcherFailoverConsumerTest.java:360)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-07T06:45:28.9481113Z](https://github.com/apache/pulsar/actions/runs/4111179593/jobs/7094697114#step:9:820)  
[example failure 2023-02-03T14:59:13.8556388Z](https://github.com/apache/pulsar/actions/runs/4085189227/jobs/7042838377#step:9:822)  
[example failure 2023-02-03T13:01:12.8922937Z](https://github.com/apache/pulsar/actions/runs/4084265133/jobs/7040768534#step:9:817)  
[example failure 2023-02-03T09:24:40.3238087Z](https://github.com/apache/pulsar/actions/runs/4082697666/jobs/7037358539#step:9:822)  
[example failure 2023-02-03T09:21:14.0070617Z](https://github.com/apache/pulsar/actions/runs/4082669764/jobs/7037302972#step:9:817)  
[example failure 2023-02-03T08:40:34.2151148Z](https://github.com/apache/pulsar/actions/runs/4080739803/jobs/7036714224#step:9:817)  
[example failure 2023-02-03T03:24:40.6351632Z](https://github.com/apache/pulsar/actions/runs/4080739803/jobs/7033499918#step:9:808)  
[example failure 2023-02-02T18:26:11.2101259Z](https://github.com/apache/pulsar/actions/runs/4077347643/jobs/7026262481#step:9:822)  
[example failure 2023-02-02T11:12:24.9642583Z](https://github.com/apache/pulsar/actions/runs/4073789290/jobs/7018144141#step:9:822)  
[example failure 2023-02-02T10:36:45.1471614Z](https://github.com/apache/pulsar/actions/runs/4073474352/jobs/7017462811#step:9:822)  
[example failure 2023-02-01T06:29:58.2266744Z](https://github.com/apache/pulsar/actions/runs/4061536056/jobs/6991657250#step:9:808)  


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

