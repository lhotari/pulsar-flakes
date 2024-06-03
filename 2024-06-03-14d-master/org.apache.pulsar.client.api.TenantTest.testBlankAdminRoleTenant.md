        
Flaky-test: org.apache.pulsar.client.api.TenantTest.testBlankAdminRoleTenant
Number of failures: 1

org.apache.pulsar.client.api.TenantTest is flaky. The testBlankAdminRoleTenant test method fails sporadically.

```
java.lang.AssertionError: null
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.fail(Assert.java:115)
	at org.apache.pulsar.client.api.TenantTest.testBlankAdminRoleTenant(TenantTest.java:83)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-05-24T04:06:01.2298530Z](https://github.com/apache/pulsar/actions/runs/9172277968/job/25361906067#step:10:1448)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: null
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.fail(Assert.java:115)
	at org.apache.pulsar.client.api.TenantTest.testBlankAdminRoleTenant(TenantTest.java:83)
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

