        
Flaky-test: org.apache.pulsar.client.impl.ConnectionTimeoutTest.testLowTimeout
Number of failures: 4

org.apache.pulsar.client.impl.ConnectionTimeoutTest is flaky. The testLowTimeout test method fails sporadically.

```
java.lang.AssertionError: expected [class io.netty.channel.ConnectTimeoutException] but found [class io.netty.channel.StacklessClosedChannelException]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.client.impl.ConnectionTimeoutTest.testLowTimeout(ConnectionTimeoutTest.java:44)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-01T03:00:00.8819244Z](https://github.com/apache/pulsar/runs/6682028994?check_suite_focus=true#step:9:8648)  
[example failure 2022-05-31T22:06:15.5642711Z](https://github.com/apache/pulsar/runs/6679252126?check_suite_focus=true#step:10:3443)  
[example failure 2022-05-31T16:10:54.0449701Z](https://github.com/apache/pulsar/runs/6673922451?check_suite_focus=true#step:10:3452)  
[example failure 2022-05-27T14:39:43.7705113Z](https://github.com/apache/pulsar/runs/6627109437?check_suite_focus=true#step:9:3487)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [class io.netty.channel.ConnectTimeoutException] but found [class io.netty.channel.StacklessClosedChannelException]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.client.impl.ConnectionTimeoutTest.testLowTimeout(ConnectionTimeoutTest.java:44)
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

