        
Flaky-test: org.apache.pulsar.broker.service.PersistentTopicE2ETest.testMessageExpiryWithTopicMessageTTL
Number of failures: 2

org.apache.pulsar.broker.service.PersistentTopicE2ETest is flaky. The testMessageExpiryWithTopicMessageTTL test method fails sporadically.

```
java.lang.AssertionError: expected [500] but found [412]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.broker.service.PersistentTopicE2ETest.testMessageExpiryWithTopicMessageTTL(PersistentTopicE2ETest.java:1036)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-22T02:33:00.4525839Z](https://github.com/apache/pulsar/runs/4281697313?check_suite_focus=true?check_suite_focus=true#step:9:3575)
[example failure 2021-11-18T11:47:35.6763794Z](https://github.com/apache/pulsar/runs/4250703767?check_suite_focus=true?check_suite_focus=true#step:9:1131)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [500] but found [412]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.broker.service.PersistentTopicE2ETest.testMessageExpiryWithTopicMessageTTL(PersistentTopicE2ETest.java:1036)
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

