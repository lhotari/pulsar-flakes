        
Flaky-test: org.apache.pulsar.client.impl.RawReaderTest.testPauseAndResumeWithUnloading
Number of failures: 1

org.apache.pulsar.client.impl.RawReaderTest is flaky. The testPauseAndResumeWithUnloading test method fails sporadically.

```
java.lang.AssertionError: Timed out waiting for message listener acks expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertTrue(Assert.java:56)
	at org.apache.pulsar.client.impl.RawReaderTest.testPauseAndResumeWithUnloading(RawReaderTest.java:731)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-18T21:33:17.2165606Z](https://github.com/apache/pulsar/actions/runs/23267341051/job/67652591173#step:11:740)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.client.impl.RawReaderTest.testPauseAndResumeWithUnloading -- Time elapsed: 20.18 s <<< FAILURE!
java.lang.AssertionError: Timed out waiting for message listener acks expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertTrue(Assert.java:56)
	at org.apache.pulsar.client.impl.RawReaderTest.testPauseAndResumeWithUnloading(RawReaderTest.java:731)
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

