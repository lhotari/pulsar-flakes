        
Flaky-test: org.apache.pulsar.metadata.MetadataCacheTest.insertionDeletion
Number of failures: 5

org.apache.pulsar.metadata.MetadataCacheTest is flaky. The insertionDeletion test method fails sporadically.

```
java.lang.AssertionError: expected [Optional[MetadataCacheTest.MyClass(a=a, b=2)]] but found [Optional[MetadataCacheTest.MyClass(a=a, b=1)]]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.MetadataCacheTest.insertionDeletion(MetadataCacheTest.java:271)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-02-02T13:10:02.6320957Z](https://github.com/apache/pulsar/runs/5036755143?check_suite_focus=true?check_suite_focus=true#step:8:3190)  
[example failure 2022-02-02T02:27:09.5294661Z](https://github.com/apache/pulsar/runs/5031138385?check_suite_focus=true?check_suite_focus=true#step:8:1502)  
[example failure 2022-01-28T13:28:12.7298674Z](https://github.com/apache/pulsar/runs/4981110712?check_suite_focus=true?check_suite_focus=true#step:8:1501)  
[example failure 2022-01-27T18:29:36.8915345Z](https://github.com/apache/pulsar/runs/4970761706?check_suite_focus=true?check_suite_focus=true#step:8:1502)  
[example failure 2022-01-27T10:57:28.1933754Z](https://github.com/apache/pulsar/runs/4964192518?check_suite_focus=true?check_suite_focus=true#step:8:16048)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [Optional[MetadataCacheTest.MyClass(a=a, b=2)]] but found [Optional[MetadataCacheTest.MyClass(a=a, b=1)]]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.MetadataCacheTest.insertionDeletion(MetadataCacheTest.java:271)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>

