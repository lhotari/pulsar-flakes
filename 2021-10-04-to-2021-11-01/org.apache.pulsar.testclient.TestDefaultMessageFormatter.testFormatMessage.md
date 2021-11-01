        
Flaky-test: org.apache.pulsar.testclient.TestDefaultMessageFormatter.testFormatMessage
Number of failures: 3

org.apache.pulsar.testclient.TestDefaultMessageFormatter is flaky. The testFormatMessage test method fails sporadically.

```
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.testclient.TestDefaultMessageFormatter.testFormatMessage(TestDefaultMessageFormatter.java:68)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-25T03:23:45.9325327Z](https://github.com/apache/pulsar/runs/3992255522?check_suite_focus=true?check_suite_focus=true#step:8:8713)
[example failure 2021-10-18T13:56:06.8204942Z](https://github.com/apache/pulsar/runs/3927055884?check_suite_focus=true?check_suite_focus=true#step:8:8705)
[example failure 2021-10-08T02:10:57.4204135Z](https://github.com/apache/pulsar/runs/3833881364?check_suite_focus=true?check_suite_focus=true#step:8:13844)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.testclient.TestDefaultMessageFormatter.testFormatMessage(TestDefaultMessageFormatter.java:68)
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

