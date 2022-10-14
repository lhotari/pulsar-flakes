        
Flaky-test: org.apache.pulsar.client.api.TopicReaderTest.testReaderIsAbleToSeekWithTimeOnMiddleOfTopic
Number of failures: 1

org.apache.pulsar.client.api.TopicReaderTest is flaky. The testReaderIsAbleToSeekWithTimeOnMiddleOfTopic test method fails sporadically.

```
java.lang.AssertionError: Received message msg num 1 did not match the expected message msg num 6 expected [msg num 6] but found [msg num 1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.apache.pulsar.client.api.ProducerConsumerBase.testMessageOrderAndDuplicates(ProducerConsumerBase.java:64)
	at org.apache.pulsar.client.api.TopicReaderTest.testReaderIsAbleToSeekWithTimeOnMiddleOfTopic(TopicReaderTest.java:1372)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-12T06:56:30.1092477Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5292938796#step:8:1284)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: Received message msg num 1 did not match the expected message msg num 6 expected [msg num 6] but found [msg num 1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.apache.pulsar.client.api.ProducerConsumerBase.testMessageOrderAndDuplicates(ProducerConsumerBase.java:64)
	at org.apache.pulsar.client.api.TopicReaderTest.testReaderIsAbleToSeekWithTimeOnMiddleOfTopic(TopicReaderTest.java:1372)
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

