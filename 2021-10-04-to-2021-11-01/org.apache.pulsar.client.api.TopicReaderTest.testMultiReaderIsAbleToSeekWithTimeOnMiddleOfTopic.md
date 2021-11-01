        
Flaky-test: org.apache.pulsar.client.api.TopicReaderTest.testMultiReaderIsAbleToSeekWithTimeOnMiddleOfTopic
Number of failures: 3

org.apache.pulsar.client.api.TopicReaderTest is flaky. The testMultiReaderIsAbleToSeekWithTimeOnMiddleOfTopic test method fails sporadically.

```
java.lang.AssertionError: Received duplicate message msg num 5 expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.client.api.TopicReaderTest.testMultiReaderIsAbleToSeekWithTimeOnMiddleOfTopic(TopicReaderTest.java:1404)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-08T15:23:43.1218762Z](https://github.com/apache/pulsar/runs/3839908944?check_suite_focus=true?check_suite_focus=true#step:9:1779)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: Received duplicate message msg num 5 expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.client.api.TopicReaderTest.testMultiReaderIsAbleToSeekWithTimeOnMiddleOfTopic(TopicReaderTest.java:1404)
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
java.lang.AssertionError: Received duplicate message msg num 8 expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.client.api.TopicReaderTest.testMultiReaderIsAbleToSeekWithTimeOnMiddleOfTopic(TopicReaderTest.java:1404)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-30T00:37:46.2659774Z](https://github.com/apache/pulsar/runs/4052347466?check_suite_focus=true?check_suite_focus=true#step:9:1478)
[example failure 2021-10-08T07:32:33.0407667Z](https://github.com/apache/pulsar/runs/3835731054?check_suite_focus=true?check_suite_focus=true#step:9:1590)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: Received duplicate message msg num 8 expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.client.api.TopicReaderTest.testMultiReaderIsAbleToSeekWithTimeOnMiddleOfTopic(TopicReaderTest.java:1404)
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

