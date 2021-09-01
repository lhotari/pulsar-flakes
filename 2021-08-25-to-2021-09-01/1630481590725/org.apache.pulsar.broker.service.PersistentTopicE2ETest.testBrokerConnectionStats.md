        
Flaky-test: org.apache.pulsar.broker.service.PersistentTopicE2ETest.testBrokerConnectionStats
Number of failures: 5

org.apache.pulsar.broker.service.PersistentTopicE2ETest is flaky. The testBrokerConnectionStats test method fails sporadically.

```
java.lang.AssertionError: expected [0] but found [1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.broker.service.PersistentTopicE2ETest.testBrokerConnectionStats(PersistentTopicE2ETest.java:1549)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-31T10:05:41.4056776Z](https://github.com/apache/pulsar/runs/3471560824?check_suite_focus=true#step:9:377)
[example failure 2021-08-30T19:31:46.2657890Z](https://github.com/apache/pulsar/runs/3465551342?check_suite_focus=true#step:9:377)
[example failure 2021-08-26T08:28:14.3107560Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:374)
[example failure 2021-08-25T16:49:49.8064639Z](https://github.com/apache/pulsar/runs/3424390559?check_suite_focus=true#step:9:374)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [0] but found [1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.broker.service.PersistentTopicE2ETest.testBrokerConnectionStats(PersistentTopicE2ETest.java:1549)
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
java.lang.AssertionError: expected [0] but found [1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.broker.service.PersistentTopicE2ETest.testBrokerConnectionStats(PersistentTopicE2ETest.java:1521)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-31T09:57:58.2950440Z](https://github.com/apache/pulsar/runs/3471501132?check_suite_focus=true#step:10:364)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [0] but found [1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.broker.service.PersistentTopicE2ETest.testBrokerConnectionStats(PersistentTopicE2ETest.java:1521)
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

