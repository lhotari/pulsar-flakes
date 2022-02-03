        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.testRedeliveryOfFailedMessages
Number of failures: 1

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The testRedeliveryOfFailedMessages test method fails sporadically.

```
java.lang.AssertionError: reading message index #86 failed expected object to not be null
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.assertNotNull(Assert.java:942)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testRedeliveryOfFailedMessages(SimpleProducerConsumerTest.java:2874)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-28T14:58:39.8969693Z](https://github.com/apache/pulsar/runs/4982126255?check_suite_focus=true?check_suite_focus=true#step:9:675)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: reading message index #86 failed expected object to not be null
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.assertNotNull(Assert.java:942)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testRedeliveryOfFailedMessages(SimpleProducerConsumerTest.java:2874)
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

