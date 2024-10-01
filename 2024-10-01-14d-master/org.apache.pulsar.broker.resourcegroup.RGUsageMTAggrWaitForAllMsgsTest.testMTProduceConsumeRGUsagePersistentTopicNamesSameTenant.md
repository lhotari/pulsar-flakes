        
Flaky-test: org.apache.pulsar.broker.resourcegroup.RGUsageMTAggrWaitForAllMsgsTest.testMTProduceConsumeRGUsagePersistentTopicNamesSameTenant
Number of failures: 6

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
[example failure 2024-09-23T12:37:30.2021413Z](https://github.com/apache/pulsar/actions/runs/10993960424/job/30521570268#step:9:11391)  


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

[example failure 2024-09-30T06:27:21.7428694Z](https://github.com/apache/pulsar/actions/runs/11100325924/job/30835967439#step:9:2126)  
[example failure 2024-09-23T06:31:42.5538047Z](https://github.com/apache/pulsar/actions/runs/10988544957/job/30505128546#step:9:11697)  
[example failure 2024-09-22T06:30:05.6447870Z](https://github.com/apache/pulsar/actions/runs/10978774099/job/30482320501#step:9:11389)  
[example failure 2024-09-21T06:27:32.3839459Z](https://github.com/apache/pulsar/actions/runs/10970210670/job/30463806936#step:9:2122)  
[example failure 2024-09-19T06:28:15.2935940Z](https://github.com/apache/pulsar/actions/runs/10935339357/job/30356920910#step:9:2152)  


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

