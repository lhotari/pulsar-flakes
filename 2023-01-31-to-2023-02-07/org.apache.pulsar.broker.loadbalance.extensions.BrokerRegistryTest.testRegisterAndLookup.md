        
Flaky-test: org.apache.pulsar.broker.loadbalance.extensions.BrokerRegistryTest.testRegisterAndLookup
Number of failures: 2

org.apache.pulsar.broker.loadbalance.extensions.BrokerRegistryTest is flaky. The testRegisterAndLookup test method fails sporadically.

```
java.lang.AssertionError: expected [2] but found [3]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1413)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1240)
	at org.testng.Assert.assertEquals(Assert.java:1274)
	at org.apache.pulsar.broker.loadbalance.extensions.BrokerRegistryTest.testRegisterAndLookup(BrokerRegistryTest.java:277)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-02T12:34:50.8192661Z](https://github.com/apache/pulsar/actions/runs/4073367805/jobs/7019320477#step:10:1394)  
[example failure 2023-02-02T12:31:54.1436383Z](https://github.com/apache/pulsar/actions/runs/4073474341/jobs/7019289431#step:11:1396)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [2] but found [3]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1413)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1240)
	at org.testng.Assert.assertEquals(Assert.java:1274)
	at org.apache.pulsar.broker.loadbalance.extensions.BrokerRegistryTest.testRegisterAndLookup(BrokerRegistryTest.java:277)
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

