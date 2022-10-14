        
Flaky-test: org.apache.pulsar.websocket.proxy.ProxyAuthenticationTest.authenticatedSocketTest
Number of failures: 2

org.apache.pulsar.websocket.proxy.ProxyAuthenticationTest is flaky. The authenticatedSocketTest test method fails sporadically.

```
java.lang.AssertionError: lists don't have the same size expected [0] but found [10]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:1089)
	at org.testng.Assert.assertEquals(Assert.java:1065)
	at org.apache.pulsar.websocket.proxy.ProxyAuthenticationTest.checkSocket(ProxyAuthenticationTest.java:146)
	at org.apache.pulsar.websocket.proxy.ProxyAuthenticationTest.authenticatedSocketTest(ProxyAuthenticationTest.java:151)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-10T01:08:08.9385705Z](https://github.com/apache/pulsar/actions/runs/3213481762/jobs/5257926197#step:9:477)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: lists don't have the same size expected [0] but found [10]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:1089)
	at org.testng.Assert.assertEquals(Assert.java:1065)
	at org.apache.pulsar.websocket.proxy.ProxyAuthenticationTest.checkSocket(ProxyAuthenticationTest.java:146)
	at org.apache.pulsar.websocket.proxy.ProxyAuthenticationTest.authenticatedSocketTest(ProxyAuthenticationTest.java:151)
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

```
java.lang.AssertionError: lists don't have the same size expected [8] but found [10]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:1089)
	at org.testng.Assert.assertEquals(Assert.java:1065)
	at org.apache.pulsar.websocket.proxy.ProxyAuthenticationTest.checkSocket(ProxyAuthenticationTest.java:146)
	at org.apache.pulsar.websocket.proxy.ProxyAuthenticationTest.authenticatedSocketTest(ProxyAuthenticationTest.java:151)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-09T09:28:47.7958322Z](https://github.com/apache/pulsar/actions/runs/3213605113/jobs/5253446775#step:9:477)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: lists don't have the same size expected [8] but found [10]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:1089)
	at org.testng.Assert.assertEquals(Assert.java:1065)
	at org.apache.pulsar.websocket.proxy.ProxyAuthenticationTest.checkSocket(ProxyAuthenticationTest.java:146)
	at org.apache.pulsar.websocket.proxy.ProxyAuthenticationTest.authenticatedSocketTest(ProxyAuthenticationTest.java:151)
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

