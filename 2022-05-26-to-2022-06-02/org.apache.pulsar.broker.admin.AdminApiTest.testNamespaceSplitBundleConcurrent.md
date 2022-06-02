        
Flaky-test: org.apache.pulsar.broker.admin.AdminApiTest.testNamespaceSplitBundleConcurrent
Number of failures: 1

org.apache.pulsar.broker.admin.AdminApiTest is flaky. The testNamespaceSplitBundleConcurrent test method fails sporadically.

```
java.lang.AssertionError: split bundle shouldn't have thrown exception
	at org.testng.Assert.fail(Assert.java:99)
	at org.apache.pulsar.broker.admin.AdminApiTest.testNamespaceSplitBundleConcurrent(AdminApiTest.java:1778)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-01T02:34:36.9255419Z](https://github.com/apache/pulsar/runs/6681847856?check_suite_focus=true#step:10:1222)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: split bundle shouldn't have thrown exception
	at org.testng.Assert.fail(Assert.java:99)
	at org.apache.pulsar.broker.admin.AdminApiTest.testNamespaceSplitBundleConcurrent(AdminApiTest.java:1778)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

