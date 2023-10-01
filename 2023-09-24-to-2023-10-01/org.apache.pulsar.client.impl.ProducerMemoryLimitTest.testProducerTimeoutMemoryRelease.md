        
Flaky-test: org.apache.pulsar.client.impl.ProducerMemoryLimitTest.testProducerTimeoutMemoryRelease
Number of failures: 1

org.apache.pulsar.client.impl.ProducerMemoryLimitTest is flaky. The testProducerTimeoutMemoryRelease test method fails sporadically.

```
java.lang.AssertionError: expected [0] but found [11]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:979)
	at org.testng.Assert.assertEquals(Assert.java:955)
	at org.testng.Assert.assertEquals(Assert.java:989)
	at org.apache.pulsar.client.impl.ProducerMemoryLimitTest.testProducerTimeoutMemoryRelease(ProducerMemoryLimitTest.java:99)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-09-25T15:53:07.4467580Z](https://github.com/apache/pulsar/actions/runs/6298840062/job/17107400437#step:10:692)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [0] but found [11]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:979)
	at org.testng.Assert.assertEquals(Assert.java:955)
	at org.testng.Assert.assertEquals(Assert.java:989)
	at org.apache.pulsar.client.impl.ProducerMemoryLimitTest.testProducerTimeoutMemoryRelease(ProducerMemoryLimitTest.java:99)
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

