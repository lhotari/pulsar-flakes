        
Flaky-test: org.apache.pulsar.broker.service.RackAwareTest.testPlacement
Number of failures: 12

org.apache.pulsar.broker.service.RackAwareTest is flaky. The testPlacement test method fails sporadically.

```
java.lang.AssertionError: first bookie in rack 0 not included in ensemble expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.broker.service.RackAwareTest.testPlacement(RackAwareTest.java:144)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-02-02T20:50:48.0192198Z](https://github.com/apache/pulsar/runs/5042884373?check_suite_focus=true?check_suite_focus=true#step:9:295)  
[example failure 2022-02-02T02:30:44.8993147Z](https://github.com/apache/pulsar/runs/5031138214?check_suite_focus=true?check_suite_focus=true#step:9:295)  
[example failure 2022-01-30T11:09:35.6750537Z](https://github.com/apache/pulsar/runs/4996340846?check_suite_focus=true?check_suite_focus=true#step:9:295)  
[example failure 2022-01-30T10:23:16.6468139Z](https://github.com/apache/pulsar/runs/4996173817?check_suite_focus=true?check_suite_focus=true#step:9:295)  
[example failure 2022-01-29T05:38:44.1136071Z](https://github.com/apache/pulsar/runs/4989526517?check_suite_focus=true?check_suite_focus=true#step:9:307)  
[example failure 2022-01-29T04:31:36.9932064Z](https://github.com/apache/pulsar/runs/4989272961?check_suite_focus=true?check_suite_focus=true#step:9:249)  
[example failure 2022-01-28T12:07:36.1877113Z](https://github.com/apache/pulsar/runs/4980157601?check_suite_focus=true?check_suite_focus=true#step:9:293)  
[example failure 2022-01-28T10:32:37.8836639Z](https://github.com/apache/pulsar/runs/4978579988?check_suite_focus=true?check_suite_focus=true#step:9:291)  
[example failure 2022-01-27T18:30:58.6029528Z](https://github.com/apache/pulsar/runs/4970761502?check_suite_focus=true?check_suite_focus=true#step:9:289)  
[example failure 2022-01-27T11:18:25.6525106Z](https://github.com/apache/pulsar/runs/4964583087?check_suite_focus=true?check_suite_focus=true#step:9:301)  
[example failure 2022-01-27T09:37:36.5674813Z](https://github.com/apache/pulsar/runs/4964005789?check_suite_focus=true?check_suite_focus=true#step:9:289)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: first bookie in rack 0 not included in ensemble expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.broker.service.RackAwareTest.testPlacement(RackAwareTest.java:144)
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

```
java.lang.AssertionError: first bookie in rack 0 not included in ensemble expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.broker.service.RackAwareTest.testPlacement(RackAwareTest.java:135)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-02-01T21:03:17.7727542Z](https://github.com/apache/pulsar/runs/5027932245?check_suite_focus=true?check_suite_focus=true#step:9:291)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: first bookie in rack 0 not included in ensemble expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.broker.service.RackAwareTest.testPlacement(RackAwareTest.java:135)
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

