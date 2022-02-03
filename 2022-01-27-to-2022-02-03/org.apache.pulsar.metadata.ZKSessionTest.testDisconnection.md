        
Flaky-test: org.apache.pulsar.metadata.ZKSessionTest.testDisconnection
Number of failures: 12

org.apache.pulsar.metadata.ZKSessionTest is flaky. The testDisconnection test method fails sporadically.

```
java.lang.AssertionError: expected [Reconnected] but found [SessionLost]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testDisconnection(ZKSessionTest.java:64)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-02-02T18:03:34.2646392Z](https://github.com/apache/pulsar/runs/5040108112?check_suite_focus=true?check_suite_focus=true#step:8:19478)  
[example failure 2022-01-31T09:31:13.1261554Z](https://github.com/apache/pulsar/runs/5002911603?check_suite_focus=true?check_suite_focus=true#step:8:25101)  
[example failure 2022-01-29T18:48:54.8675001Z](https://github.com/apache/pulsar/runs/4992450896?check_suite_focus=true?check_suite_focus=true#step:8:17798)  
[example failure 2022-01-29T08:10:50.2950447Z](https://github.com/apache/pulsar/runs/4989955788?check_suite_focus=true?check_suite_focus=true#step:8:17794)  
[example failure 2022-01-29T06:19:31.6848681Z](https://github.com/apache/pulsar/runs/4989526396?check_suite_focus=true?check_suite_focus=true#step:8:17798)  
[example failure 2022-01-29T05:10:39.9707606Z](https://github.com/apache/pulsar/runs/4989272846?check_suite_focus=true?check_suite_focus=true#step:8:17794)  
[example failure 2022-01-29T02:36:28.6307957Z](https://github.com/apache/pulsar/runs/4988529705?check_suite_focus=true?check_suite_focus=true#step:8:19474)  
[example failure 2022-01-28T17:05:55.8979442Z](https://github.com/apache/pulsar/runs/4983133951?check_suite_focus=true?check_suite_focus=true#step:8:19574)  
[example failure 2022-01-28T13:15:47.7901608Z](https://github.com/apache/pulsar/runs/4980324970?check_suite_focus=true?check_suite_focus=true#step:8:17794)  
[example failure 2022-01-28T13:06:49.5755984Z](https://github.com/apache/pulsar/runs/4980343449?check_suite_focus=true?check_suite_focus=true#step:8:17794)  
[example failure 2022-01-28T04:05:30.3562473Z](https://github.com/apache/pulsar/runs/4975741291?check_suite_focus=true?check_suite_focus=true#step:8:17788)  
[example failure 2022-01-27T10:05:10.0735802Z](https://github.com/apache/pulsar/runs/4963815160?check_suite_focus=true?check_suite_focus=true#step:8:17788)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [Reconnected] but found [SessionLost]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.metadata.ZKSessionTest.testDisconnection(ZKSessionTest.java:64)
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

