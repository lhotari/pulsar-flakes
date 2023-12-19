        
Flaky-test: org.apache.pulsar.tests.integration.loadbalance.ExtensibleLoadManagerTest.testIsolationPolicy
Number of failures: 9

org.apache.pulsar.tests.integration.loadbalance.ExtensibleLoadManagerTest is flaky. The testIsolationPolicy test method fails sporadically.

```
java.lang.AssertionError:

Expecting actual:
  "
 --- An unexpected error occurred in the server ---

Message: Failed to lookup broker:pulsar-broker-1:8080 for bundle:my-tenant/my-isolation-policy-anti-affinity-enabled/0x40000000_0x80000000, the broker has not been registered.

Stacktrace:

java.lang.IllegalStateException: Failed to lookup broker:pulsar-broker-1:8080 for bundle:my-tenant/my-isolation-policy-anti-affinity-enabled/0x40000000_0x80000000, the broker has not been registered.
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImpl.lambda$getBrokerLookupData$12(ExtensibleLoadManagerImpl.java:529)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1150)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-12-19T12:54:13.0086922Z](https://github.com/apache/pulsar/actions/runs/7260963469/job/19784220263#step:12:40658)  
[example failure 2023-12-19T11:37:37.1906871Z](https://github.com/apache/pulsar/actions/runs/7260963469/job/19781776490#step:12:25772)  
[example failure 2023-12-19T03:43:45.0148384Z](https://github.com/apache/pulsar/actions/runs/7256136432/job/19770138540#step:12:34921)  
[example failure 2023-12-19T01:59:03.6077173Z](https://github.com/apache/pulsar/actions/runs/7256136432/job/19768253535#step:12:27303)  
[example failure 2023-12-18T00:45:17.3660429Z](https://github.com/apache/pulsar/actions/runs/7228625557/job/19726928565#step:12:26080)  
[example failure 2023-12-17T03:17:41.3684741Z](https://github.com/apache/pulsar/actions/runs/7228625557/job/19714020084#step:12:30556)  
[example failure 2023-12-16T01:21:13.4187789Z](https://github.com/apache/pulsar/actions/runs/7228625557/job/19698674790#step:12:31352)  
[example failure 2023-12-15T17:37:02.9911952Z](https://github.com/apache/pulsar/actions/runs/7224935871/job/19687908920#step:12:39041)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError:

Expecting actual:
  "
 --- An unexpected error occurred in the server ---

Message: Failed to lookup broker:pulsar-broker-1:8080 for bundle:my-tenant/my-isolation-policy-anti-affinity-enabled/0x40000000_0x80000000, the broker has not been registered.

Stacktrace:

java.lang.IllegalStateException: Failed to lookup broker:pulsar-broker-1:8080 for bundle:my-tenant/my-isolation-policy-anti-affinity-enabled/0x40000000_0x80000000, the broker has not been registered.
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImpl.lambda$getBrokerLookupData$12(ExtensibleLoadManagerImpl.java:529)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1150)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleGetResult(ZKMetadataStore.java:269)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$5(ZKMetadataStore.java:219)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:840)
"
to contain at least one of the following elements:
</pre></code>
</details>

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.tests.integration.loadbalance.ExtensibleLoadManagerTest.testIsolationPolicy() didn't finish within the time-out 40000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-12-18T00:58:54.0587013Z](https://github.com/apache/pulsar/actions/runs/7222621311/job/19727179280#step:12:17571)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.tests.integration.loadbalance.ExtensibleLoadManagerTest.testIsolationPolicy() didn't finish within the time-out 40000
	at java.base@17.0.9/java.lang.Thread.sleep(Native Method)
	at app//org.apache.pulsar.tests.integration.suites.PulsarTestSuite.retryStrategically(PulsarTestSuite.java:59)
	at app//org.apache.pulsar.tests.integration.suites.PulsarTestSuite.retryStrategically(PulsarTestSuite.java:39)
	at app//org.apache.pulsar.tests.integration.loadbalance.ExtensibleLoadManagerTest.testIsolationPolicy(ExtensibleLoadManagerTest.java:351)
	at java.base@17.0.9/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base@17.0.9/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base@17.0.9/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base@17.0.9/java.lang.reflect.Method.invoke(Method.java:568)
	at app//org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base@17.0.9/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base@17.0.9/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base@17.0.9/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base@17.0.9/java.lang.Thread.run(Thread.java:840)

</pre></code>
</details>

