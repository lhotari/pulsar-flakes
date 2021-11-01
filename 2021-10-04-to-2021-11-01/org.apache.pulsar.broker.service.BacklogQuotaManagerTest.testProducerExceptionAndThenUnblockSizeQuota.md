        
Flaky-test: org.apache.pulsar.broker.service.BacklogQuotaManagerTest.testProducerExceptionAndThenUnblockSizeQuota
Number of failures: 1

org.apache.pulsar.broker.service.BacklogQuotaManagerTest is flaky. The testProducerExceptionAndThenUnblockSizeQuota test method fails sporadically.

```
java.lang.AssertionError: unable to publish due to org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic persistent://prop/quotahold/exceptandunblock within given timeout : createdAt 2001683940 ns ago, firstSentAt 860369494984 ns ago, lastSentAt 860369494984 ns ago, retryCount 0 expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertFalse(Assert.java:67)
	at org.apache.pulsar.broker.service.BacklogQuotaManagerTest.testProducerExceptionAndThenUnblockSizeQuota(BacklogQuotaManagerTest.java:1087)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-04T14:45:30.4491109Z](https://github.com/apache/pulsar/runs/3792268877?check_suite_focus=true?check_suite_focus=true#step:9:424)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: unable to publish due to org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic persistent://prop/quotahold/exceptandunblock within given timeout : createdAt 2001683940 ns ago, firstSentAt 860369494984 ns ago, lastSentAt 860369494984 ns ago, retryCount 0 expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertFalse(Assert.java:67)
	at org.apache.pulsar.broker.service.BacklogQuotaManagerTest.testProducerExceptionAndThenUnblockSizeQuota(BacklogQuotaManagerTest.java:1087)
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

