        
Flaky-test: org.apache.pulsar.testclient.PerformanceProducerTest.testMsgKey
Number of failures: 7

org.apache.pulsar.testclient.PerformanceProducerTest is flaky. The testMsgKey test method fails sporadically.

```
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.testclient.PerformanceProducerTest.testMsgKey(PerformanceProducerTest.java:112)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-02-02T21:16:42.4991826Z](https://github.com/apache/pulsar/runs/5042884600?check_suite_focus=true?check_suite_focus=true#step:8:12493)  
[example failure 2022-02-02T16:30:30.8850426Z](https://github.com/apache/pulsar/runs/5039395056?check_suite_focus=true?check_suite_focus=true#step:8:10731)  
[example failure 2022-01-28T19:40:50.0902072Z](https://github.com/apache/pulsar/runs/4985338703?check_suite_focus=true?check_suite_focus=true#step:8:8891)  
[example failure 2022-01-28T11:01:09.2268741Z](https://github.com/apache/pulsar/runs/4978580453?check_suite_focus=true?check_suite_focus=true#step:8:10690)  
[example failure 2022-01-28T10:05:44.8564584Z](https://github.com/apache/pulsar/runs/4978229523?check_suite_focus=true?check_suite_focus=true#step:8:14404)  
[example failure 2022-01-28T02:42:07.3486434Z](https://github.com/apache/pulsar/runs/4975404880?check_suite_focus=true?check_suite_focus=true#step:8:8891)  
[example failure 2022-01-27T10:28:46.9291619Z](https://github.com/apache/pulsar/runs/4964192518?check_suite_focus=true?check_suite_focus=true#step:8:8910)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.testclient.PerformanceProducerTest.testMsgKey(PerformanceProducerTest.java:112)
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

