        
Flaky-test: org.apache.pulsar.broker.web.plugin.servlet.AdditionalServletsTest.testEmptyStringAsExtractionDirectory
Number of failures: 1

org.apache.pulsar.broker.web.plugin.servlet.AdditionalServletsTest is flaky. The testEmptyStringAsExtractionDirectory test method fails sporadically.

```
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.broker.web.plugin.servlet.AdditionalServletDefinitions.servlets()" because "definitions" is null
	at org.apache.pulsar.broker.web.plugin.servlet.AdditionalServlets.load(AdditionalServlets.java:89)
	at org.apache.pulsar.broker.web.plugin.servlet.AdditionalServletsTest.testEmptyStringAsExtractionDirectory(AdditionalServletsTest.java:64)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-11-24T19:48:58.2192730Z](https://github.com/apache/pulsar/actions/runs/3541254304/jobs/5949597405#step:10:2818)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.broker.web.plugin.servlet.AdditionalServletDefinitions.servlets()" because "definitions" is null
	at org.apache.pulsar.broker.web.plugin.servlet.AdditionalServlets.load(AdditionalServlets.java:89)
	at org.apache.pulsar.broker.web.plugin.servlet.AdditionalServletsTest.testEmptyStringAsExtractionDirectory(AdditionalServletsTest.java:64)
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

