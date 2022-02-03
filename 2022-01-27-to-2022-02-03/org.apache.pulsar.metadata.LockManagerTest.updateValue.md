        
Flaky-test: org.apache.pulsar.metadata.LockManagerTest.updateValue
Number of failures: 6

org.apache.pulsar.metadata.LockManagerTest is flaky. The updateValue test method fails sporadically.

```
java.lang.AssertionError: expected [value-2] but found [lock-1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:629)
	at org.testng.Assert.assertEquals(Assert.java:639)
	at org.apache.pulsar.metadata.LockManagerTest.updateValue(LockManagerTest.java:152)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-31T08:43:50.8742741Z](https://github.com/apache/pulsar/runs/5002911603?check_suite_focus=true?check_suite_focus=true#step:8:6996)  
[example failure 2022-01-30T11:03:51.9583217Z](https://github.com/apache/pulsar/runs/4996340534?check_suite_focus=true?check_suite_focus=true#step:8:1495)  
[example failure 2022-01-29T01:50:10.0422954Z](https://github.com/apache/pulsar/runs/4988529705?check_suite_focus=true?check_suite_focus=true#step:8:1497)  
[example failure 2022-01-28T16:12:01.4091105Z](https://github.com/apache/pulsar/runs/4983133951?check_suite_focus=true?check_suite_focus=true#step:8:1495)  
[example failure 2022-01-28T12:23:34.6850146Z](https://github.com/apache/pulsar/runs/4980334625?check_suite_focus=true?check_suite_focus=true#step:8:1495)  
[example failure 2022-01-28T02:52:35.6827048Z](https://github.com/apache/pulsar/runs/4975404880?check_suite_focus=true?check_suite_focus=true#step:8:10562)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [value-2] but found [lock-1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:629)
	at org.testng.Assert.assertEquals(Assert.java:639)
	at org.apache.pulsar.metadata.LockManagerTest.updateValue(LockManagerTest.java:152)
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

