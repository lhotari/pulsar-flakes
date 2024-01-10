        
Flaky-test: org.apache.pulsar.broker.service.plugin.FilterEntryTest.testFilter
Number of failures: 2

org.apache.pulsar.broker.service.plugin.FilterEntryTest is flaky. The testFilter test method fails sporadically.

```
java.lang.AssertionError: expected:<10> but was:<5>
	at org.testng.AssertJUnit.fail(AssertJUnit.java:65)
	at org.testng.AssertJUnit.failNotEquals(AssertJUnit.java:467)
	at org.testng.AssertJUnit.assertEquals(AssertJUnit.java:88)
	at org.testng.AssertJUnit.assertEquals(AssertJUnit.java:318)
	at org.testng.AssertJUnit.assertEquals(AssertJUnit.java:328)
	at org.apache.pulsar.broker.service.plugin.FilterEntryTest.testFilter(FilterEntryTest.java:267)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-01-10T12:46:30.8045038Z](https://github.com/apache/pulsar/actions/runs/7419301554/job/20341789548#step:11:1211)  
[example failure 2024-01-04T12:41:52.4795441Z](https://github.com/apache/pulsar/actions/runs/7409287235/job/20159531089#step:11:1266)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected:<10> but was:<5>
	at org.testng.AssertJUnit.fail(AssertJUnit.java:65)
	at org.testng.AssertJUnit.failNotEquals(AssertJUnit.java:467)
	at org.testng.AssertJUnit.assertEquals(AssertJUnit.java:88)
	at org.testng.AssertJUnit.assertEquals(AssertJUnit.java:318)
	at org.testng.AssertJUnit.assertEquals(AssertJUnit.java:328)
	at org.apache.pulsar.broker.service.plugin.FilterEntryTest.testFilter(FilterEntryTest.java:267)
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

