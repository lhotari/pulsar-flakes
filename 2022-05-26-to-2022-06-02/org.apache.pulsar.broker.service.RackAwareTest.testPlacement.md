        
Flaky-test: org.apache.pulsar.broker.service.RackAwareTest.testPlacement
Number of failures: 5

org.apache.pulsar.broker.service.RackAwareTest is flaky. The testPlacement test method fails sporadically.

```
java.lang.AssertionError: first bookie in rack 0 not included in ensemble expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.broker.service.RackAwareTest.testPlacement(RackAwareTest.java:142)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-01T02:22:11.0397115Z](https://github.com/apache/pulsar/runs/6681848134?check_suite_focus=true#step:10:764)  
[example failure 2022-06-01T01:57:17.2878175Z](https://github.com/apache/pulsar/runs/6681608899?check_suite_focus=true#step:10:764)  
[example failure 2022-05-31T10:28:50.2100582Z](https://github.com/apache/pulsar/runs/6668333058?check_suite_focus=true#step:10:764)  
[example failure 2022-05-31T09:17:28.4993732Z](https://github.com/apache/pulsar/runs/6667571764?check_suite_focus=true#step:10:764)  
[example failure 2022-05-27T09:32:53.6989198Z](https://github.com/apache/pulsar/runs/6623222495?check_suite_focus=true#step:10:762)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: first bookie in rack 0 not included in ensemble expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.broker.service.RackAwareTest.testPlacement(RackAwareTest.java:142)
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

