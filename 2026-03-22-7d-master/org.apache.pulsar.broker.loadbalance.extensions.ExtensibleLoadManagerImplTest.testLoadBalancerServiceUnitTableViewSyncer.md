        
Flaky-test: org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testLoadBalancerServiceUnitTableViewSyncer
Number of failures: 2

org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest is flaky. The testLoadBalancerServiceUnitTableViewSyncer test method fails sporadically.

```
java.lang.AssertionError: did not expect [pulsar://localhost:39275] but found [pulsar://localhost:39275]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failEquals(Assert.java:1581)
	at org.testng.Assert.assertNotEqualsImpl(Assert.java:156)
	at org.testng.Assert.assertNotEquals(Assert.java:2197)
	at org.testng.Assert.assertNotEquals(Assert.java:2219)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testLoadBalancerServiceUnitTableViewSyncer(ExtensibleLoadManagerImplTest.java:1477)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-22T06:51:28.8134780Z](https://github.com/apache/pulsar/actions/runs/23397197942/job/68062393406#step:9:2724)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testLoadBalancerServiceUnitTableViewSyncer -- Time elapsed: 5.621 s <<< FAILURE!
java.lang.AssertionError: did not expect [pulsar://localhost:39275] but found [pulsar://localhost:39275]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failEquals(Assert.java:1581)
	at org.testng.Assert.assertNotEqualsImpl(Assert.java:156)
	at org.testng.Assert.assertNotEquals(Assert.java:2197)
	at org.testng.Assert.assertNotEquals(Assert.java:2219)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testLoadBalancerServiceUnitTableViewSyncer(ExtensibleLoadManagerImplTest.java:1477)
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

```
java.lang.AssertionError: did not expect [pulsar://localhost:36095] but found [pulsar://localhost:36095]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failEquals(Assert.java:1581)
	at org.testng.Assert.assertNotEqualsImpl(Assert.java:156)
	at org.testng.Assert.assertNotEquals(Assert.java:2197)
	at org.testng.Assert.assertNotEquals(Assert.java:2219)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testLoadBalancerServiceUnitTableViewSyncer(ExtensibleLoadManagerImplTest.java:1470)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-20T06:53:08.3392092Z](https://github.com/apache/pulsar/actions/runs/23331518604/job/67863926438#step:9:2778)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testLoadBalancerServiceUnitTableViewSyncer -- Time elapsed: 5.678 s <<< FAILURE!
java.lang.AssertionError: did not expect [pulsar://localhost:36095] but found [pulsar://localhost:36095]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failEquals(Assert.java:1581)
	at org.testng.Assert.assertNotEqualsImpl(Assert.java:156)
	at org.testng.Assert.assertNotEquals(Assert.java:2197)
	at org.testng.Assert.assertNotEquals(Assert.java:2219)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testLoadBalancerServiceUnitTableViewSyncer(ExtensibleLoadManagerImplTest.java:1470)
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

