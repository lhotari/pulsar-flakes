        
Flaky-test: org.apache.pulsar.client.api.TopicReaderTest.testMultiReaderIsAbleToSeekWithTimeOnMiddleOfTopic
Number of failures: 2

org.apache.pulsar.client.api.TopicReaderTest is flaky. The testMultiReaderIsAbleToSeekWithTimeOnMiddleOfTopic test method fails sporadically.

```
java.lang.AssertionError: Received duplicate message msg num 5 expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1413)
	at org.testng.Assert.assertTrue(Assert.java:56)
	at org.apache.pulsar.client.api.TopicReaderTest.testMultiReaderIsAbleToSeekWithTimeOnMiddleOfTopic(TopicReaderTest.java:1407)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-05-08T09:34:07.6146611Z](https://github.com/apache/pulsar/actions/runs/4913318667/jobs/8773604047#step:8:1464)  
[example failure 2023-05-05T15:26:19.7410700Z](https://github.com/apache/pulsar/actions/runs/4894688425/jobs/8739261866#step:8:1492)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: Received duplicate message msg num 5 expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1413)
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
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

