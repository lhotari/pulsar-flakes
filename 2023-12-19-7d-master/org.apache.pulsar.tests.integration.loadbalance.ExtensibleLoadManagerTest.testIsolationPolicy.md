        
Flaky-test: org.apache.pulsar.tests.integration.loadbalance.ExtensibleLoadManagerTest.testIsolationPolicy
Number of failures: 2

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
[example failure 2023-12-17T12:45:31.9552882Z](https://github.com/apache/pulsar/actions/runs/7238358549/job/19719288635#step:12:60924)  


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
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-12-16T06:33:50.6223790Z](https://github.com/apache/pulsar/actions/runs/7230181586/job/19702163172#step:12:43978)  


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
	at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2179)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleGetResult(ZKMetadataStore.java:269)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$5(ZKMetadataStore.java:219)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:572)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:1583)
"
to contain at least one of the following elements:
</pre></code>
</details>

