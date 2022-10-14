        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentDispatcherFailoverConsumerStreamingDispatcherTest.testAddRemoveConsumer
Number of failures: 27

org.apache.pulsar.broker.service.persistent.PersistentDispatcherFailoverConsumerStreamingDispatcherTest is flaky. The testAddRemoveConsumer test method fails sporadically.

```
java.lang.AssertionError: expected object to not be null
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.assertNotNull(Assert.java:942)
	at org.testng.Assert.assertNotNull(Assert.java:926)
	at org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest.testAddRemoveConsumer(PersistentDispatcherFailoverConsumerTest.java:442)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-08-31T01:58:36.7597790Z](https://github.com/apache/pulsar/runs/8105007570?check_suite_focus=true#step:10:778)  
[example failure 2022-08-30T03:17:22.1327888Z](https://github.com/apache/pulsar/runs/8083809184?check_suite_focus=true#step:10:778)  
[example failure 2022-08-27T18:44:48.2203714Z](https://github.com/apache/pulsar/runs/8052342843?check_suite_focus=true#step:10:779)  
[example failure 2022-08-27T17:24:01.1714728Z](https://github.com/apache/pulsar/runs/8051892086?check_suite_focus=true#step:10:778)  
[example failure 2022-08-27T06:22:01.1473417Z](https://github.com/apache/pulsar/runs/8048471818?check_suite_focus=true#step:9:791)  
[example failure 2022-08-27T05:34:04.5600719Z](https://github.com/apache/pulsar/runs/8048208334?check_suite_focus=true#step:9:791)  
[example failure 2022-08-27T05:00:54.4357823Z](https://github.com/apache/pulsar/runs/8048028449?check_suite_focus=true#step:10:778)  
[example failure 2022-08-27T01:35:41.1260071Z](https://github.com/apache/pulsar/runs/8046967481?check_suite_focus=true#step:10:778)  
[example failure 2022-08-26T03:31:51.6925178Z](https://github.com/apache/pulsar/runs/8029186715?check_suite_focus=true#step:10:778)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected object to not be null
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.assertNotNull(Assert.java:942)
	at org.testng.Assert.assertNotNull(Assert.java:926)
	at org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest.testAddRemoveConsumer(PersistentDispatcherFailoverConsumerTest.java:442)
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
java.lang.AssertionError: expected object to not be null
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.assertNotNull(Assert.java:942)
	at org.testng.Assert.assertNotNull(Assert.java:926)
	at org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest.testAddRemoveConsumer(PersistentDispatcherFailoverConsumerTest.java:430)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-09-06T11:03:27.9853950Z](https://github.com/apache/pulsar/runs/8203208822?check_suite_focus=true#step:9:796)  
[example failure 2022-09-06T00:17:27.5380472Z](https://github.com/apache/pulsar/runs/8197603062?check_suite_focus=true#step:10:783)  
[example failure 2022-09-01T05:04:14.9461269Z](https://github.com/apache/pulsar/runs/8127867601?check_suite_focus=true#step:10:782)  
[example failure 2022-08-31T23:26:38.0348329Z](https://github.com/apache/pulsar/runs/8124732086?check_suite_focus=true#step:10:781)  
[example failure 2022-08-31T17:55:18.6725325Z](https://github.com/apache/pulsar/runs/8119670527?check_suite_focus=true#step:10:781)  
[example failure 2022-08-31T14:37:25.5256252Z](https://github.com/apache/pulsar/runs/8115929202?check_suite_focus=true#step:10:781)  
[example failure 2022-08-31T12:24:47.5917322Z](https://github.com/apache/pulsar/runs/8113261653?check_suite_focus=true#step:10:781)  
[example failure 2022-08-31T12:03:18.6431774Z](https://github.com/apache/pulsar/runs/8112869070?check_suite_focus=true#step:9:794)  
[example failure 2022-08-31T11:50:50.4926108Z](https://github.com/apache/pulsar/runs/8112664142?check_suite_focus=true#step:10:778)  
[example failure 2022-08-31T10:53:34.6325948Z](https://github.com/apache/pulsar/runs/8111703401?check_suite_focus=true#step:10:781)  
[example failure 2022-08-31T08:39:28.7833735Z](https://github.com/apache/pulsar/runs/8109126255?check_suite_focus=true#step:9:791)  
[example failure 2022-08-31T05:55:36.7515990Z](https://github.com/apache/pulsar/runs/8107051523?check_suite_focus=true#step:10:778)  
[example failure 2022-08-31T04:18:57.6285805Z](https://github.com/apache/pulsar/runs/8106052057?check_suite_focus=true#step:10:773)  
[example failure 2022-08-31T01:25:28.4363605Z](https://github.com/apache/pulsar/runs/8104784434?check_suite_focus=true#step:9:791)  
[example failure 2022-08-30T23:29:14.0427782Z](https://github.com/apache/pulsar/runs/8103565132?check_suite_focus=true#step:9:791)  
[example failure 2022-08-30T23:13:05.9100074Z](https://github.com/apache/pulsar/runs/8103383049?check_suite_focus=true#step:10:778)  
[example failure 2022-08-30T07:29:21.9597290Z](https://github.com/apache/pulsar/runs/8086226143?check_suite_focus=true#step:10:778)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected object to not be null
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.assertNotNull(Assert.java:942)
	at org.testng.Assert.assertNotNull(Assert.java:926)
	at org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest.testAddRemoveConsumer(PersistentDispatcherFailoverConsumerTest.java:430)
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
java.lang.AssertionError: expected object to not be null
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.assertNotNull(Assert.java:942)
	at org.testng.Assert.assertNotNull(Assert.java:926)
	at org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest.testAddRemoveConsumer(PersistentDispatcherFailoverConsumerTest.java:406)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-08-27T02:00:41.9825297Z](https://github.com/apache/pulsar/runs/8047094589?check_suite_focus=true#step:10:779)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected object to not be null
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.assertNotNull(Assert.java:942)
	at org.testng.Assert.assertNotNull(Assert.java:926)
	at org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest.testAddRemoveConsumer(PersistentDispatcherFailoverConsumerTest.java:406)
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

