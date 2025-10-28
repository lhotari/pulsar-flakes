        
Flaky-test: org.apache.pulsar.client.api.NonPersistentTopicTest.testMsgDropStat
Number of failures: 1

org.apache.pulsar.client.api.NonPersistentTopicTest is flaky. The testMsgDropStat test method fails sporadically.

```
[ERROR] org.apache.pulsar.client.api.NonPersistentTopicTest.testMsgDropStat -- Time elapsed: 7.101 s <<< FAILURE!
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-23T12:38:03.0147328Z](https://github.com/apache/pulsar/actions/runs/18747937935/job/53480679625#step:11:1392)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.client.api.NonPersistentTopicTest.testMsgDropStat -- Time elapsed: 7.101 s <<< FAILURE!
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertTrue(Assert.java:56)
	at org.testng.Assert.assertTrue(Assert.java:66)
	at org.apache.pulsar.client.api.NonPersistentTopicTest.testMsgDropStat(NonPersistentTopicTest.java:905)
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

