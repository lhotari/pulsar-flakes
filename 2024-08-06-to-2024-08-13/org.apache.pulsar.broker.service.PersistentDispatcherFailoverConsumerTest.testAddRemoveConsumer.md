        
Flaky-test: org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest.testAddRemoveConsumer
Number of failures: 5

org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest is flaky. The testAddRemoveConsumer test method fails sporadically.

```
java.lang.AssertionError: expected object to not be null
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.assertNotNull(Assert.java:1483)
	at org.testng.Assert.assertNotNull(Assert.java:1467)
	at org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest.testAddRemoveConsumer(PersistentDispatcherFailoverConsumerTest.java:379)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-08-12T09:07:27.7408489Z](https://github.com/apache/pulsar/actions/runs/10348585329/job/28642157095#step:9:260)  
[example failure 2024-08-12T09:06:57.9752609Z](https://github.com/apache/pulsar/actions/runs/10348879443/job/28642143308#step:9:260)  
[example failure 2024-08-10T06:50:13.6782019Z](https://github.com/apache/pulsar/actions/runs/10329704223/job/28597820267#step:9:260)  
[example failure 2024-08-09T06:02:39.2387029Z](https://github.com/apache/pulsar/actions/runs/10310182161/job/28552683736#step:9:260)  
[example failure 2024-08-08T11:59:57.8564839Z](https://github.com/apache/pulsar/actions/runs/10301530026/job/28513289986#step:9:260)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected object to not be null
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.assertNotNull(Assert.java:1483)
	at org.testng.Assert.assertNotNull(Assert.java:1467)
	at org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest.testAddRemoveConsumer(PersistentDispatcherFailoverConsumerTest.java:379)
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

