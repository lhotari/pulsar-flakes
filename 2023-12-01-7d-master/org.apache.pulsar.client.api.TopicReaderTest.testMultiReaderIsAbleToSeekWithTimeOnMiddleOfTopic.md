        
Flaky-test: org.apache.pulsar.client.api.TopicReaderTest.testMultiReaderIsAbleToSeekWithTimeOnMiddleOfTopic
Number of failures: 2

org.apache.pulsar.client.api.TopicReaderTest is flaky. The testMultiReaderIsAbleToSeekWithTimeOnMiddleOfTopic test method fails sporadically.

```
java.lang.AssertionError: Received duplicate message msg num 8 expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertTrue(Assert.java:56)
	at org.apache.pulsar.client.api.TopicReaderTest.testMultiReaderIsAbleToSeekWithTimeOnMiddleOfTopic(TopicReaderTest.java:1407)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-11-29T12:26:57.3592151Z](https://github.com/apache/pulsar/actions/runs/7032302456/job/19135765495#step:9:2247)  
[example failure 2023-11-26T12:24:56.5390736Z](https://github.com/apache/pulsar/actions/runs/6995421087/job/19030255302#step:9:2239)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: Received duplicate message msg num 8 expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertTrue(Assert.java:56)
	at org.apache.pulsar.client.api.TopicReaderTest.testMultiReaderIsAbleToSeekWithTimeOnMiddleOfTopic(TopicReaderTest.java:1407)
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

