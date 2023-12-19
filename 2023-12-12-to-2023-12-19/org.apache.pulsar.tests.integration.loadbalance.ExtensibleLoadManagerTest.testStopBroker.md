        
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
[example failure 2023-12-13T08:17:28.0743369Z](https://github.com/apache/pulsar/actions/runs/7192184824/job/19588652045#step:12:18740)  


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
	at java.base/java.lang.Thread.run(Thread.java:840)

</pre></code>
</details>

