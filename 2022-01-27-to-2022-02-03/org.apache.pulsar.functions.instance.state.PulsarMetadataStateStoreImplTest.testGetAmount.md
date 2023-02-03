        
Flaky-test: org.apache.pulsar.functions.instance.state.PulsarMetadataStateStoreImplTest.testGetAmount
Number of failures: 3

org.apache.pulsar.functions.instance.state.PulsarMetadataStateStoreImplTest is flaky. The testGetAmount test method fails sporadically.

```
java.lang.AssertionError: expected [10] but found [0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.functions.instance.state.PulsarMetadataStateStoreImplTest.testGetAmount(PulsarMetadataStateStoreImplTest.java:96)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-30T11:14:46.6351647Z](https://github.com/apache/pulsar/runs/4996340534?check_suite_focus=true?check_suite_focus=true#step:8:7014)  
[example failure 2022-01-28T14:58:52.2449525Z](https://github.com/apache/pulsar/runs/4982126215?check_suite_focus=true?check_suite_focus=true#step:8:5224)  
[example failure 2022-01-28T11:00:20.1395347Z](https://github.com/apache/pulsar/runs/4979436155?check_suite_focus=true?check_suite_focus=true#step:8:5228)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [10] but found [0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.functions.instance.state.PulsarMetadataStateStoreImplTest.testGetAmount(PulsarMetadataStateStoreImplTest.java:96)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>
