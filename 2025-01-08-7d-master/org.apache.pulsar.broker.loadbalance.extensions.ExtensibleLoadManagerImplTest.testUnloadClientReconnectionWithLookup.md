        
Flaky-test: org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testUnloadClientReconnectionWithLookup
Number of failures: 1

org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest is flaky. The testUnloadClientReconnectionWithLookup test method fails sporadically.

```
java.lang.NullPointerException: Cannot invoke "org.apache.commons.lang3.tuple.Pair.getLeft()" because "lookup" is null
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testUnloadClientReconnectionWithLookup(ExtensibleLoadManagerImplTest.java:733)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-01-06T06:35:09.9201156Z](https://github.com/apache/pulsar/actions/runs/12627438315/job/35182043148#step:9:2912)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.commons.lang3.tuple.Pair.getLeft()" because "lookup" is null
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testUnloadClientReconnectionWithLookup(ExtensibleLoadManagerImplTest.java:733)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testUnloadClientReconnectionWithLookup(ExtensibleLoadManagerImplTest.java:650)
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

