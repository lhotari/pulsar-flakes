        
Flaky-test: org.apache.pulsar.broker.admin.AdminApiTest.testNamespaceSplitBundleConcurrent
Number of failures: 6

org.apache.pulsar.broker.admin.AdminApiTest is flaky. The testNamespaceSplitBundleConcurrent test method fails sporadically.

```
java.lang.AssertionError: split bundle shouldn't have thrown exception
	at org.testng.Assert.fail(Assert.java:99)
	at org.apache.pulsar.broker.admin.AdminApiTest.testNamespaceSplitBundleConcurrent(AdminApiTest.java:1778)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-07T17:52:36.4190236Z](https://github.com/apache/pulsar/runs/6779510953?check_suite_focus=true#step:9:1246)  
[example failure 2022-06-07T07:26:57.8974039Z](https://github.com/apache/pulsar/runs/6768926999?check_suite_focus=true#step:9:2336)  
[example failure 2022-06-07T07:10:38.7749441Z](https://github.com/apache/pulsar/runs/6768926999?check_suite_focus=true#step:9:1246)  
[example failure 2022-06-06T12:20:59.0094623Z](https://github.com/apache/pulsar/runs/6755044604?check_suite_focus=true#step:9:1246)  
[example failure 2022-06-06T10:24:36.3889160Z](https://github.com/apache/pulsar/runs/6753585951?check_suite_focus=true#step:10:1225)  
[example failure 2022-06-06T05:34:21.9906829Z](https://github.com/apache/pulsar/runs/6750401277?check_suite_focus=true#step:10:3693)  


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

