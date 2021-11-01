        
Flaky-test: org.apache.pulsar.client.api.TopicReaderTest.testMessageAvailableAfterRestart
Number of failures: 3

org.apache.pulsar.client.api.TopicReaderTest is flaky. The testMessageAvailableAfterRestart test method fails sporadically.

```
java.lang.AssertionError: expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertFalse(Assert.java:67)
	at org.testng.Assert.assertFalse(Assert.java:77)
	at org.apache.pulsar.client.api.TopicReaderTest.testMessageAvailableAfterRestart(TopicReaderTest.java:944)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T04:34:40.2532753Z](https://github.com/apache/pulsar/runs/3890534952?check_suite_focus=true?check_suite_focus=true#step:10:495)
[example failure 2021-10-14T01:28:41.9801399Z](https://github.com/apache/pulsar/runs/3889474041?check_suite_focus=true?check_suite_focus=true#step:10:517)
[example failure 2021-10-13T14:05:44.4010179Z](https://github.com/apache/pulsar/runs/3883321671?check_suite_focus=true?check_suite_focus=true#step:10:495)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertFalse(Assert.java:67)
	at org.testng.Assert.assertFalse(Assert.java:77)
	at org.apache.pulsar.client.api.TopicReaderTest.testMessageAvailableAfterRestart(TopicReaderTest.java:944)
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

