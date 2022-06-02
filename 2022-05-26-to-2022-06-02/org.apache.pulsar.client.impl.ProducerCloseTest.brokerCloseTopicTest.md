        
Flaky-test: org.apache.pulsar.client.impl.ProducerCloseTest.brokerCloseTopicTest
Number of failures: 3

org.apache.pulsar.client.impl.ProducerCloseTest is flaky. The brokerCloseTopicTest test method fails sporadically.

```
java.lang.AssertionError: expected [Connecting] but found [Ready]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.client.impl.ProducerCloseTest.brokerCloseTopicTest(ProducerCloseTest.java:140)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-01T10:52:45.6992235Z](https://github.com/apache/pulsar/runs/6686592082?check_suite_focus=true#step:10:2104)  
[example failure 2022-06-01T10:46:41.9701418Z](https://github.com/apache/pulsar/runs/6686592082?check_suite_focus=true#step:10:1142)  
[example failure 2022-05-31T09:20:30.5910573Z](https://github.com/apache/pulsar/runs/6667571661?check_suite_focus=true#step:9:1156)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [Connecting] but found [Ready]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.client.impl.ProducerCloseTest.brokerCloseTopicTest(ProducerCloseTest.java:140)
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

