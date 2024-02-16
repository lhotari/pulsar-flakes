        
Flaky-test: org.apache.bookkeeper.replication.AuditorBookieTest.testBookieClusterRestart
Number of failures: 1

org.apache.bookkeeper.replication.AuditorBookieTest is flaky. The testBookieClusterRestart test method fails sporadically.

```
java.lang.AssertionError: Auditor elector is not running!
	at org.testng.AssertJUnit.fail(AssertJUnit.java:65)
	at org.testng.AssertJUnit.assertTrue(AssertJUnit.java:23)
	at org.apache.bookkeeper.replication.AuditorBookieTest.testBookieClusterRestart(AuditorBookieTest.java:138)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-02-07T12:28:36.8294415Z](https://github.com/apache/pulsar/actions/runs/7814493953/job/21316283399#step:11:259)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: Auditor elector is not running!
	at org.testng.AssertJUnit.fail(AssertJUnit.java:65)
	at org.testng.AssertJUnit.assertTrue(AssertJUnit.java:23)
	at org.apache.bookkeeper.replication.AuditorBookieTest.testBookieClusterRestart(AuditorBookieTest.java:138)
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

