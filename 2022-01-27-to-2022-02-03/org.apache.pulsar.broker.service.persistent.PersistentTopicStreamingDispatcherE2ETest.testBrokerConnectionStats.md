        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherE2ETest.testBrokerConnectionStats
Number of failures: 8

org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherE2ETest is flaky. The testBrokerConnectionStats test method fails sporadically.

```
java.lang.AssertionError: expected [0] but found [1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.broker.service.PersistentTopicE2ETest.testBrokerConnectionStats(PersistentTopicE2ETest.java:1549)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-02-02T16:17:09.3641038Z](https://github.com/apache/pulsar/runs/5039394782?check_suite_focus=true?check_suite_focus=true#step:9:295)  
[example failure 2022-02-01T16:52:17.6496016Z](https://github.com/apache/pulsar/runs/5024680443?check_suite_focus=true?check_suite_focus=true#step:9:295)  
[example failure 2022-01-28T16:15:20.8132804Z](https://github.com/apache/pulsar/runs/4983133475?check_suite_focus=true?check_suite_focus=true#step:9:295)  
[example failure 2022-01-28T10:32:43.4605254Z](https://github.com/apache/pulsar/runs/4978579988?check_suite_focus=true?check_suite_focus=true#step:9:532)  
[example failure 2022-01-28T09:03:57.1854190Z](https://github.com/apache/pulsar/runs/4978109347?check_suite_focus=true?check_suite_focus=true#step:9:293)  
[example failure 2022-01-27T18:31:06.4348510Z](https://github.com/apache/pulsar/runs/4970761502?check_suite_focus=true?check_suite_focus=true#step:9:696)  
[example failure 2022-01-27T09:56:24.1178104Z](https://github.com/apache/pulsar/runs/4964191798?check_suite_focus=true?check_suite_focus=true#step:9:289)  
[example failure 2022-01-27T09:37:37.5149151Z](https://github.com/apache/pulsar/runs/4964005789?check_suite_focus=true?check_suite_focus=true#step:9:322)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [0] but found [1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.broker.service.PersistentTopicE2ETest.testBrokerConnectionStats(PersistentTopicE2ETest.java:1549)
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

