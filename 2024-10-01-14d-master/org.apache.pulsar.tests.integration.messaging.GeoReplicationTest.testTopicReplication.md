        
Flaky-test: org.apache.pulsar.tests.integration.messaging.GeoReplicationTest.testTopicReplication
Number of failures: 1

org.apache.pulsar.tests.integration.messaging.GeoReplicationTest is flaky. The testTopicReplication test method fails sporadically.

```
java.lang.AssertionError: expected object to not be null
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.assertNotNull(Assert.java:1483)
	at org.testng.Assert.assertNotNull(Assert.java:1467)
	at org.apache.pulsar.tests.integration.messaging.GeoReplicationTest.testTopicReplication(GeoReplicationTest.java:124)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-09-18T06:58:03.7745933Z](https://github.com/apache/pulsar/actions/runs/10916432767/job/30298472934#step:12:30866)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected object to not be null
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.assertNotNull(Assert.java:1483)
	at org.testng.Assert.assertNotNull(Assert.java:1467)
	at org.apache.pulsar.tests.integration.messaging.GeoReplicationTest.testTopicReplication(GeoReplicationTest.java:124)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

</pre></code>
</details>

