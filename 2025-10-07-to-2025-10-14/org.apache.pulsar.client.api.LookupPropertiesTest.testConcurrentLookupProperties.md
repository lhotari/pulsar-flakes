        
Flaky-test: org.apache.pulsar.client.api.LookupPropertiesTest.testConcurrentLookupProperties
Number of failures: 1

org.apache.pulsar.client.api.LookupPropertiesTest is flaky. The testConcurrentLookupProperties test method fails sporadically.

```
java.lang.AssertionError: Lists differ at element [0]: key-3 != key-0 expected [key-3] but found [key-0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:1643)
	at org.testng.Assert.assertEquals(Assert.java:1605)
	at org.apache.pulsar.client.api.LookupPropertiesTest.testConcurrentLookupProperties(LookupPropertiesTest.java:115)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-10T06:59:52.5303031Z](https://github.com/apache/pulsar/actions/runs/18398680856/job/52423315315#step:11:1638)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: Lists differ at element [0]: key-3 != key-0 expected [key-3] but found [key-0]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:1643)
	at org.testng.Assert.assertEquals(Assert.java:1605)
	at org.apache.pulsar.client.api.LookupPropertiesTest.testConcurrentLookupProperties(LookupPropertiesTest.java:115)
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

