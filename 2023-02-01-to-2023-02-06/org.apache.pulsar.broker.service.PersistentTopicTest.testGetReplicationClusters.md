        
Flaky-test: org.apache.pulsar.broker.service.PersistentTopicTest.testGetReplicationClusters
Number of failures: 4

org.apache.pulsar.broker.service.PersistentTopicTest is flaky. The testGetReplicationClusters test method fails sporadically.

```
java.lang.AssertionError: lists don't have the same size expected [1] but found [0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1413)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1240)
	at org.testng.Assert.assertEquals(Assert.java:1465)
	at org.testng.Assert.assertEquals(Assert.java:1441)
	at org.apache.pulsar.broker.service.PersistentTopicTest.testGetReplicationClusters(PersistentTopicTest.java:2266)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-03T09:35:52.2291968Z](https://github.com/apache/pulsar/actions/runs/4082669774/jobs/7037548851#step:11:1138)  
[example failure 2023-02-03T09:33:38.5151935Z](https://github.com/apache/pulsar/actions/runs/4081522085/jobs/7037515497#step:11:1105)  
[example failure 2023-02-03T08:39:41.1363390Z](https://github.com/apache/pulsar/actions/runs/4081522085/jobs/7036688126#step:11:1105)  
[example failure 2023-02-03T06:52:42.1123896Z](https://github.com/apache/pulsar/actions/runs/4081522085/jobs/7035431254#step:10:1151)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: lists don't have the same size expected [1] but found [0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1413)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1240)
	at org.testng.Assert.assertEquals(Assert.java:1465)
	at org.testng.Assert.assertEquals(Assert.java:1441)
	at org.apache.pulsar.broker.service.PersistentTopicTest.testGetReplicationClusters(PersistentTopicTest.java:2266)
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

