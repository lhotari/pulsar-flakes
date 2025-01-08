        
Flaky-test: org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests.testWillCancelReadAfterExhaustingRetry
Number of failures: 4

org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests is flaky. The testWillCancelReadAfterExhaustingRetry test method fails sporadically.

```
java.lang.AssertionError: expected [8] but found [3]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1418)
	at org.testng.Assert.assertEquals(Assert.java:1382)
	at org.testng.Assert.assertEquals(Assert.java:1428)
	at org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests.testWillCancelReadAfterExhaustingRetry(StreamingEntryReaderTests.java:435)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-01-03T00:57:09.9638807Z](https://github.com/apache/pulsar/actions/runs/12580383908/job/35092745657#step:8:2158)  
[example failure 2025-01-02T15:45:27.3429818Z](https://github.com/apache/pulsar/actions/runs/12580383908/job/35074447249#step:8:2148)  
[example failure 2025-01-02T11:48:56.1781106Z](https://github.com/apache/pulsar/actions/runs/12580383908/job/35065749184#step:8:2158)  
[example failure 2025-01-02T10:06:07.3911850Z](https://github.com/apache/pulsar/actions/runs/12580383908/job/35062198288#step:8:2144)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [8] but found [3]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1418)
	at org.testng.Assert.assertEquals(Assert.java:1382)
	at org.testng.Assert.assertEquals(Assert.java:1428)
	at org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests.testWillCancelReadAfterExhaustingRetry(StreamingEntryReaderTests.java:435)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
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

