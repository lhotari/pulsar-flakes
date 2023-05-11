        
Flaky-test: org.apache.pulsar.broker.resourcegroup.ResourceGroupUsageAggregationTest.testProduceConsumeUsageOnRG
Number of failures: 2

org.apache.pulsar.broker.resourcegroup.ResourceGroupUsageAggregationTest is flaky. The testProduceConsumeUsageOnRG test method fails sporadically.

```
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.broker.resourcegroup.ResourceGroupUsageAggregationTest.verfyStats(ResourceGroupUsageAggregationTest.java:210)
	at org.apache.pulsar.broker.resourcegroup.ResourceGroupUsageAggregationTest.testProduceConsumeUsageOnRG(ResourceGroupUsageAggregationTest.java:179)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-05-07T13:25:51.3947492Z](https://github.com/apache/pulsar/actions/runs/4907231741/jobs/8762230223#step:9:1042)  
[example failure 2023-05-07T12:53:15.1401766Z](https://github.com/apache/pulsar/actions/runs/4907231741/jobs/8762230223#step:9:125)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.broker.resourcegroup.ResourceGroupUsageAggregationTest.verfyStats(ResourceGroupUsageAggregationTest.java:210)
	at org.apache.pulsar.broker.resourcegroup.ResourceGroupUsageAggregationTest.testProduceConsumeUsageOnRG(ResourceGroupUsageAggregationTest.java:179)
	at org.apache.pulsar.broker.resourcegroup.ResourceGroupUsageAggregationTest.testProduceConsumeUsageOnRG(ResourceGroupUsageAggregationTest.java:85)
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

