        
Flaky-test: org.apache.pulsar.bookie.rackawareness.IsolatedBookieEnsemblePlacementPolicyTest.testMetadataStoreCases
Number of failures: 1

org.apache.pulsar.bookie.rackawareness.IsolatedBookieEnsemblePlacementPolicyTest is flaky. The testMetadataStoreCases test method fails sporadically.

```
java.lang.AssertionError: expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertFalse(Assert.java:78)
	at org.testng.Assert.assertFalse(Assert.java:88)
	at org.apache.pulsar.bookie.rackawareness.IsolatedBookieEnsemblePlacementPolicyTest.testMetadataStoreCases(IsolatedBookieEnsemblePlacementPolicyTest.java:211)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-11-20T12:25:55.7076153Z](https://github.com/apache/pulsar/actions/runs/6929862398/job/18848730368#step:11:3319)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertFalse(Assert.java:78)
	at org.testng.Assert.assertFalse(Assert.java:88)
	at org.apache.pulsar.bookie.rackawareness.IsolatedBookieEnsemblePlacementPolicyTest.testMetadataStoreCases(IsolatedBookieEnsemblePlacementPolicyTest.java:211)
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

