        
Flaky-test: org.apache.pulsar.broker.service.ServerCnxTest.testCreateProducerTimeout
Number of failures: 2

org.apache.pulsar.broker.service.ServerCnxTest is flaky. The testCreateProducerTimeout test method fails sporadically.

```
java.io.IOException: Failed to get response from socket within 10s
	at org.apache.pulsar.broker.service.ServerCnxTest.getResponse(ServerCnxTest.java:2908)
	at org.apache.pulsar.broker.service.ServerCnxTest.getResponse(ServerCnxTest.java:2884)
	at org.apache.pulsar.broker.service.ServerCnxTest.testCreateProducerTimeout(ServerCnxTest.java:2093)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-18T00:20:07.3789589Z](https://github.com/apache/pulsar/actions/runs/23222262279/job/67497998699#step:11:1038)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.service.ServerCnxTest.testCreateProducerTimeout -- Time elapsed: 10.10 s <<< FAILURE!
java.io.IOException: Failed to get response from socket within 10s
	at org.apache.pulsar.broker.service.ServerCnxTest.getResponse(ServerCnxTest.java:2908)
	at org.apache.pulsar.broker.service.ServerCnxTest.getResponse(ServerCnxTest.java:2884)
	at org.apache.pulsar.broker.service.ServerCnxTest.testCreateProducerTimeout(ServerCnxTest.java:2093)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

</pre></code>
</details>

```
java.lang.AssertionError: expected [class org.apache.pulsar.common.api.proto.CommandProducerSuccess] but found [class org.apache.pulsar.common.api.proto.CommandError]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:643)
	at org.apache.pulsar.broker.service.ServerCnxTest.testCreateProducerTimeout(ServerCnxTest.java:2094)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-20T17:09:08.9325950Z](https://github.com/apache/pulsar/actions/runs/23353263589/job/67938497035#step:11:1025)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.service.ServerCnxTest.testCreateProducerTimeout -- Time elapsed: 0.025 s <<< FAILURE!
java.lang.AssertionError: expected [class org.apache.pulsar.common.api.proto.CommandProducerSuccess] but found [class org.apache.pulsar.common.api.proto.CommandError]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:643)
	at org.apache.pulsar.broker.service.ServerCnxTest.testCreateProducerTimeout(ServerCnxTest.java:2094)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

</pre></code>
</details>

