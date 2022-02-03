        
Flaky-test: org.apache.pulsar.broker.service.PersistentTopicE2ETest.testBrokerConnectionStats
Number of failures: 11

org.apache.pulsar.broker.service.PersistentTopicE2ETest is flaky. The testBrokerConnectionStats test method fails sporadically.

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
[example failure 2022-01-31T03:34:15.9880199Z](https://github.com/apache/pulsar/runs/5000907330?check_suite_focus=true?check_suite_focus=true#step:9:249)  
[example failure 2022-01-29T18:06:01.9475596Z](https://github.com/apache/pulsar/runs/4992450728?check_suite_focus=true?check_suite_focus=true#step:9:249)  
[example failure 2022-01-29T09:54:10.1368754Z](https://github.com/apache/pulsar/runs/4990505468?check_suite_focus=true?check_suite_focus=true#step:9:249)  
[example failure 2022-01-29T07:31:14.1314372Z](https://github.com/apache/pulsar/runs/4989955851?check_suite_focus=true?check_suite_focus=true#step:9:249)  
[example failure 2022-01-29T04:52:50.1558884Z](https://github.com/apache/pulsar/runs/4989344447?check_suite_focus=true?check_suite_focus=true#step:9:249)  
[example failure 2022-01-29T04:24:45.2750850Z](https://github.com/apache/pulsar/runs/4989247172?check_suite_focus=true?check_suite_focus=true#step:9:249)  
[example failure 2022-01-28T12:30:25.2347297Z](https://github.com/apache/pulsar/runs/4980343526?check_suite_focus=true?check_suite_focus=true#step:9:247)  
[example failure 2022-01-28T12:25:16.1869943Z](https://github.com/apache/pulsar/runs/4980325179?check_suite_focus=true?check_suite_focus=true#step:9:247)  
[example failure 2022-01-28T09:19:58.4188493Z](https://github.com/apache/pulsar/runs/4978229337?check_suite_focus=true?check_suite_focus=true#step:9:245)  
[example failure 2022-01-28T02:28:49.6469327Z](https://github.com/apache/pulsar/runs/4975404925?check_suite_focus=true?check_suite_focus=true#step:9:245)  
[example failure 2022-01-27T15:30:30.7044609Z](https://github.com/apache/pulsar/runs/4968337145?check_suite_focus=true?check_suite_focus=true#step:9:245)  


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

