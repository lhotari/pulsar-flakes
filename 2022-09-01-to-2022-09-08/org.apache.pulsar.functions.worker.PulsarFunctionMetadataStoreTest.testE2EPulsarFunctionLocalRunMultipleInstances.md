        
Flaky-test: org.apache.pulsar.functions.worker.PulsarFunctionMetadataStoreTest.testE2EPulsarFunctionLocalRunMultipleInstances
Number of failures: 1

org.apache.pulsar.functions.worker.PulsarFunctionMetadataStoreTest is flaky. The testE2EPulsarFunctionLocalRunMultipleInstances test method fails sporadically.

```
java.lang.AssertionError: expected [my-message-1!] but found [my-message-3!]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:629)
	at org.testng.Assert.assertEquals(Assert.java:639)
	at org.apache.pulsar.functions.worker.PulsarFunctionLocalRunTest.testE2EPulsarFunctionLocalRun(PulsarFunctionLocalRunTest.java:509)
	at org.apache.pulsar.functions.worker.PulsarFunctionLocalRunTest.lambda$testE2EPulsarFunctionLocalRunMultipleInstances$11(PulsarFunctionLocalRunTest.java:750)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-18T15:49:25.5547397Z](https://github.com/apache/pulsar/runs/7392673037?check_suite_focus=true#step:10:1948)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [my-message-1!] but found [my-message-3!]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:629)
	at org.testng.Assert.assertEquals(Assert.java:639)
	at org.apache.pulsar.functions.worker.PulsarFunctionLocalRunTest.testE2EPulsarFunctionLocalRun(PulsarFunctionLocalRunTest.java:509)
	at org.apache.pulsar.functions.worker.PulsarFunctionLocalRunTest.lambda$testE2EPulsarFunctionLocalRunMultipleInstances$11(PulsarFunctionLocalRunTest.java:750)
	at org.apache.pulsar.functions.worker.PulsarFunctionLocalRunTest.runWithPulsarFunctionsClassLoader(PulsarFunctionLocalRunTest.java:1182)
	at org.apache.pulsar.functions.worker.PulsarFunctionLocalRunTest.testE2EPulsarFunctionLocalRunMultipleInstances(PulsarFunctionLocalRunTest.java:750)
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

