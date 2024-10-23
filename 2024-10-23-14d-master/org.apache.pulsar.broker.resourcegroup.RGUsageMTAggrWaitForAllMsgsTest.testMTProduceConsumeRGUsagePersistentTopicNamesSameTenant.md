        
Flaky-test: org.apache.pulsar.broker.resourcegroup.RGUsageMTAggrWaitForAllMsgsTest.testMTProduceConsumeRGUsagePersistentTopicNamesSameTenant
Number of failures: 4

org.apache.pulsar.broker.resourcegroup.RGUsageMTAggrWaitForAllMsgsTest is flaky. The testMTProduceConsumeRGUsagePersistentTopicNamesSameTenant test method fails sporadically.

```
java.lang.AssertionError: expected [400] but found [0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1418)
	at org.testng.Assert.assertEquals(Assert.java:1382)
	at org.testng.Assert.assertEquals(Assert.java:1428)
	at org.apache.pulsar.broker.resourcegroup.RGUsageMTAggrWaitForAllMsgsTest.testProduceConsumeUsageOnRG(RGUsageMTAggrWaitForAllMsgsTest.java:463)
	at org.apache.pulsar.broker.resourcegroup.RGUsageMTAggrWaitForAllMsgsTest.testMTProduceConsumeRGUsagePersistentTopicNamesSameTenant(RGUsageMTAggrWaitForAllMsgsTest.java:98)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-10-21T06:36:31.0343794Z](https://github.com/apache/pulsar/actions/runs/11434164248/job/31807272307#step:9:2829)  
[example failure 2024-10-20T06:37:05.9732856Z](https://github.com/apache/pulsar/actions/runs/11423941453/job/31783692504#step:9:2624)  
[example failure 2024-10-13T06:30:53.6551731Z](https://github.com/apache/pulsar/actions/runs/11311923861/job/31458716812#step:9:2681)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [400] but found [0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1418)
	at org.testng.Assert.assertEquals(Assert.java:1382)
	at org.testng.Assert.assertEquals(Assert.java:1428)
	at org.apache.pulsar.broker.resourcegroup.RGUsageMTAggrWaitForAllMsgsTest.testProduceConsumeUsageOnRG(RGUsageMTAggrWaitForAllMsgsTest.java:463)
	at org.apache.pulsar.broker.resourcegroup.RGUsageMTAggrWaitForAllMsgsTest.testMTProduceConsumeRGUsagePersistentTopicNamesSameTenant(RGUsageMTAggrWaitForAllMsgsTest.java:98)
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

[example failure 2024-10-23T12:44:31.2601680Z](https://github.com/apache/pulsar/actions/runs/11479565457/job/31946148000#step:9:2634)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [400] but found [0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1418)
	at org.testng.Assert.assertEquals(Assert.java:1382)
	at org.testng.Assert.assertEquals(Assert.java:1428)
	at org.apache.pulsar.broker.resourcegroup.RGUsageMTAggrWaitForAllMsgsTest.testProduceConsumeUsageOnRG(RGUsageMTAggrWaitForAllMsgsTest.java:463)
	at org.apache.pulsar.broker.resourcegroup.RGUsageMTAggrWaitForAllMsgsTest.testMTProduceConsumeRGUsagePersistentTopicNamesSameTenant(RGUsageMTAggrWaitForAllMsgsTest.java:98)
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

