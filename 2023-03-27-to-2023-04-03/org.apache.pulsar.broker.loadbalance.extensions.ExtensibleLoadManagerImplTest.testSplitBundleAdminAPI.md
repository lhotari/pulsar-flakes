        
Flaky-test: org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testSplitBundleAdminAPI
Number of failures: 4

org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest is flaky. The testSplitBundleAdminAPI test method fails sporadically.

```
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.admin.PulsarAdmin.topics()" because "this.admin" is null
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testSplitBundleAdminAPI(ExtensibleLoadManagerImplTest.java:382)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-04-03T03:21:03.9763770Z](https://github.com/apache/pulsar/actions/runs/4581789147/jobs/8109642540#step:11:1105)  
[example failure 2023-03-30T16:42:35.7568409Z](https://github.com/apache/pulsar/actions/runs/4566657746/jobs/8059786428#step:10:1134)  
[example failure 2023-03-30T06:52:36.3690593Z](https://github.com/apache/pulsar/actions/runs/4560335861/jobs/8047329419#step:11:1122)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.admin.PulsarAdmin.topics()" because "this.admin" is null
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testSplitBundleAdminAPI(ExtensibleLoadManagerImplTest.java:382)
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

```
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.admin.PulsarAdmin.topics()" because "this.admin" is null
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testSplitBundleAdminAPI(ExtensibleLoadManagerImplTest.java:380)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-03-27T14:34:37.1353205Z](https://github.com/apache/pulsar/actions/runs/4531219616/jobs/7985423608#step:10:965)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.admin.PulsarAdmin.topics()" because "this.admin" is null
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.testSplitBundleAdminAPI(ExtensibleLoadManagerImplTest.java:380)
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

