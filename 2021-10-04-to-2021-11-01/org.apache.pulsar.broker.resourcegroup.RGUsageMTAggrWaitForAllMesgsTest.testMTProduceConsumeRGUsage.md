        
Flaky-test: org.apache.pulsar.broker.resourcegroup.RGUsageMTAggrWaitForAllMesgsTest.testMTProduceConsumeRGUsage
Number of failures: 3

org.apache.pulsar.broker.resourcegroup.RGUsageMTAggrWaitForAllMesgsTest is flaky. The testMTProduceConsumeRGUsage test method fails sporadically.

```
java.lang.AssertionError: expected [400] but found [0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.broker.resourcegroup.RGUsageMTAggrWaitForAllMesgsTest.testProduceConsumeUsageOnRG(RGUsageMTAggrWaitForAllMesgsTest.java:470)
	at org.apache.pulsar.broker.resourcegroup.RGUsageMTAggrWaitForAllMesgsTest.testMTProduceConsumeRGUsage(RGUsageMTAggrWaitForAllMesgsTest.java:111)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-20T04:17:26.5508377Z](https://github.com/apache/pulsar/runs/3947248111?check_suite_focus=true?check_suite_focus=true#step:9:138)
[example failure 2021-10-18T09:05:30.5338698Z](https://github.com/apache/pulsar/runs/3924433478?check_suite_focus=true?check_suite_focus=true#step:9:140)
[example failure 2021-10-07T07:11:33.9533421Z](https://github.com/apache/pulsar/runs/3824011886?check_suite_focus=true?check_suite_focus=true#step:9:660)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [400] but found [0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.broker.resourcegroup.RGUsageMTAggrWaitForAllMesgsTest.testProduceConsumeUsageOnRG(RGUsageMTAggrWaitForAllMesgsTest.java:470)
	at org.apache.pulsar.broker.resourcegroup.RGUsageMTAggrWaitForAllMesgsTest.testMTProduceConsumeRGUsage(RGUsageMTAggrWaitForAllMesgsTest.java:111)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>

