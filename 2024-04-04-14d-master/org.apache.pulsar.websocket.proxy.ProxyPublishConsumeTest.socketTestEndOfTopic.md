        
Flaky-test: org.apache.pulsar.websocket.proxy.ProxyPublishConsumeTest.socketTestEndOfTopic
Number of failures: 1

org.apache.pulsar.websocket.proxy.ProxyPublishConsumeTest is flaky. The socketTestEndOfTopic test method fails sporadically.

```
java.lang.AssertionError: expected [{"endOfTopic":true}] but found [{"endOfTopic":false}]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:655)
	at org.testng.Assert.assertEquals(Assert.java:665)
	at org.apache.pulsar.websocket.proxy.ProxyPublishConsumeTest.socketTestEndOfTopic(ProxyPublishConsumeTest.java:256)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-03-28T12:33:23.6037670Z](https://github.com/apache/pulsar/actions/runs/8467015713/job/23197487754#step:11:1298)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [{"endOfTopic":true}] but found [{"endOfTopic":false}]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:655)
	at org.testng.Assert.assertEquals(Assert.java:665)
	at org.apache.pulsar.websocket.proxy.ProxyPublishConsumeTest.socketTestEndOfTopic(ProxyPublishConsumeTest.java:256)
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

