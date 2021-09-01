        
Flaky-test: org.apache.pulsar.broker.service.persistent.SimpleProducerConsumerTestStreamingDispatcherTest.testRedeliveryOfFailedMessages
Number of failures: 2

org.apache.pulsar.broker.service.persistent.SimpleProducerConsumerTestStreamingDispatcherTest is flaky. The testRedeliveryOfFailedMessages test method fails sporadically.

```
java.lang.AssertionError: reading message index #87 failed expected object to not be null
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.assertNotNull(Assert.java:942)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testRedeliveryOfFailedMessages(SimpleProducerConsumerTest.java:2841)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-28T02:10:28.4627613Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:780)
[example failure 2021-08-27T08:05:27.1574834Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:637)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: reading message index #87 failed expected object to not be null
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.assertNotNull(Assert.java:942)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testRedeliveryOfFailedMessages(SimpleProducerConsumerTest.java:2841)
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

