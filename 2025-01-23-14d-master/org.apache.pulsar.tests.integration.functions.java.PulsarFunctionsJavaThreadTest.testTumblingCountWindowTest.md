        
Flaky-test: org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaThreadTest.testTumblingCountWindowTest
Number of failures: 1

org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaThreadTest is flaky. The testTumblingCountWindowTest test method fails sporadically.

```
java.lang.AssertionError: expected [1] but found [3]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:979)
	at org.testng.Assert.assertEquals(Assert.java:955)
	at org.testng.Assert.assertEquals(Assert.java:989)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testWindowFunction(PulsarFunctionsTest.java:334)
	at org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testTumblingCountWindowTest(PulsarFunctionsJavaTest.java:138)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-01-13T13:11:02.1877578Z](https://github.com/apache/pulsar/actions/runs/12746935686/job/35525645266#step:12:23480)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [1] but found [3]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:979)
	at org.testng.Assert.assertEquals(Assert.java:955)
	at org.testng.Assert.assertEquals(Assert.java:989)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testWindowFunction(PulsarFunctionsTest.java:334)
	at org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testTumblingCountWindowTest(PulsarFunctionsJavaTest.java:138)
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

