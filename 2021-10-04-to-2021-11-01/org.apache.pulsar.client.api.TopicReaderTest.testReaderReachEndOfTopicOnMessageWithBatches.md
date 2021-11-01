        
Flaky-test: org.apache.pulsar.client.api.TopicReaderTest.testReaderReachEndOfTopicOnMessageWithBatches
Number of failures: 1

org.apache.pulsar.client.api.TopicReaderTest is flaky. The testReaderReachEndOfTopicOnMessageWithBatches test method fails sporadically.

```
java.lang.AssertionError: expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertFalse(Assert.java:67)
	at org.testng.Assert.assertFalse(Assert.java:77)
	at org.apache.pulsar.client.api.TopicReaderTest.testReaderReachEndOfTopicOnMessageWithBatches(TopicReaderTest.java:857)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T04:34:40.2612407Z](https://github.com/apache/pulsar/runs/3890534952?check_suite_focus=true?check_suite_focus=true#step:10:515)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertFalse(Assert.java:67)
	at org.testng.Assert.assertFalse(Assert.java:77)
	at org.apache.pulsar.client.api.TopicReaderTest.testReaderReachEndOfTopicOnMessageWithBatches(TopicReaderTest.java:857)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

