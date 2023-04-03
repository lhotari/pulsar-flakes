        
Flaky-test: org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testAssign
Number of failures: 2

org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest is flaky. The testAssign test method fails sporadically.

```
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.broker.PulsarService.getNamespaceService()" because "pulsar" is null
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.getBundleAsync(ExtensibleLoadManagerImplTest.java:852)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testAssign(ExtensibleLoadManagerImplTest.java:234)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-04-01T10:49:08.2164095Z](https://github.com/apache/pulsar/actions/runs/4581789147/jobs/8093129861#step:11:1140)  
[example failure 2023-04-01T06:55:52.3326772Z](https://github.com/apache/pulsar/actions/runs/4581789147/jobs/8091658464#step:11:1140)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.broker.PulsarService.getNamespaceService()" because "pulsar" is null
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.getBundleAsync(ExtensibleLoadManagerImplTest.java:852)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testAssign(ExtensibleLoadManagerImplTest.java:234)
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

