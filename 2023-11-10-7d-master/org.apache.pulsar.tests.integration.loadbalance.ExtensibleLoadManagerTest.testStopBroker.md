        
Flaky-test: org.apache.pulsar.tests.integration.loadbalance.ExtensibleLoadManagerTest.testStopBroker
Number of failures: 1

org.apache.pulsar.tests.integration.loadbalance.ExtensibleLoadManagerTest is flaky. The testStopBroker test method fails sporadically.

```
java.lang.AssertionError: did not expect [pulsar://pulsar-broker-0:6650] but found [pulsar://pulsar-broker-0:6650]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failEquals(Assert.java:1581)
	at org.testng.Assert.assertNotEqualsImpl(Assert.java:156)
	at org.testng.Assert.assertNotEquals(Assert.java:2197)
	at org.testng.Assert.assertNotEquals(Assert.java:2219)
	at org.apache.pulsar.tests.integration.loadbalance.ExtensibleLoadManagerTest.testStopBroker(ExtensibleLoadManagerTest.java:271)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-11-06T06:47:12.1657116Z](https://github.com/apache/pulsar/actions/runs/6766900442/job/18389187067#step:12:26496)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: did not expect [pulsar://pulsar-broker-0:6650] but found [pulsar://pulsar-broker-0:6650]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failEquals(Assert.java:1581)
	at org.testng.Assert.assertNotEqualsImpl(Assert.java:156)
	at org.testng.Assert.assertNotEquals(Assert.java:2197)
	at org.testng.Assert.assertNotEquals(Assert.java:2219)
	at org.apache.pulsar.tests.integration.loadbalance.ExtensibleLoadManagerTest.testStopBroker(ExtensibleLoadManagerTest.java:271)
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

