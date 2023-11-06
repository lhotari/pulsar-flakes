        
Flaky-test: org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicWithInitialSubscriptionAndMultiConsumers
Number of failures: 1

org.apache.pulsar.client.api.DeadLetterTopicTest is flaky. The testDeadLetterTopicWithInitialSubscriptionAndMultiConsumers test method fails sporadically.

```
java.lang.AssertionError: Dead letter consumer can not receive messages. expected object to not be null
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.assertNotNull(Assert.java:1483)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicWithInitialSubscriptionAndMultiConsumers(DeadLetterTopicTest.java:881)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-11-03T05:58:32.8388443Z](https://github.com/apache/pulsar/actions/runs/6727221755/job/18326690181#step:11:1534)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: Dead letter consumer can not receive messages. expected object to not be null
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.assertNotNull(Assert.java:1483)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicWithInitialSubscriptionAndMultiConsumers(DeadLetterTopicTest.java:881)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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

