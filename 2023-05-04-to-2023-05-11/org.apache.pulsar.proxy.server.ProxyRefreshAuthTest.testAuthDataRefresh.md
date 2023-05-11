        
Flaky-test: org.apache.pulsar.proxy.server.ProxyRefreshAuthTest.testAuthDataRefresh
Number of failures: 1

org.apache.pulsar.proxy.server.ProxyRefreshAuthTest is flaky. The testAuthDataRefresh test method fails sporadically.

```
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.broker.PulsarService.getConfiguration()" because "this.pulsar" is null
	at org.apache.pulsar.proxy.server.ProxyRefreshAuthTest.startProxy(ProxyRefreshAuthTest.java:140)
	at org.apache.pulsar.proxy.server.ProxyRefreshAuthTest.testAuthDataRefresh(ProxyRefreshAuthTest.java:154)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-05-08T04:04:45.7988205Z](https://github.com/apache/pulsar/actions/runs/4911179401/jobs/8769101590#step:10:481)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.broker.PulsarService.getConfiguration()" because "this.pulsar" is null
	at org.apache.pulsar.proxy.server.ProxyRefreshAuthTest.startProxy(ProxyRefreshAuthTest.java:140)
	at org.apache.pulsar.proxy.server.ProxyRefreshAuthTest.testAuthDataRefresh(ProxyRefreshAuthTest.java:154)
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

