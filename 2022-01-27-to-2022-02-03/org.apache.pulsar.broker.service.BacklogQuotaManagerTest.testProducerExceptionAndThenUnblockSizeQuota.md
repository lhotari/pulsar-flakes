        
Flaky-test: org.apache.pulsar.broker.service.BacklogQuotaManagerTest.testProducerExceptionAndThenUnblockSizeQuota
Number of failures: 4

org.apache.pulsar.broker.service.BacklogQuotaManagerTest is flaky. The testProducerExceptionAndThenUnblockSizeQuota test method fails sporadically.

```
java.lang.AssertionError: unable to publish due to org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic persistent://prop/quotahold/exceptandunblock within given timeout : createdAt 2.002 ns ago, firstSentAt 1421.618 ns ago, lastSentAt 1421.618 ns ago, retryCount 0 expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertFalse(Assert.java:67)
	at org.apache.pulsar.broker.service.BacklogQuotaManagerTest.testProducerExceptionAndThenUnblockSizeQuota(BacklogQuotaManagerTest.java:1135)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-30T02:10:26.8869924Z](https://github.com/apache/pulsar/runs/4994327531?check_suite_focus=true?check_suite_focus=true#step:9:540)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: unable to publish due to org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic persistent://prop/quotahold/exceptandunblock within given timeout : createdAt 2.002 ns ago, firstSentAt 1421.618 ns ago, lastSentAt 1421.618 ns ago, retryCount 0 expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertFalse(Assert.java:67)
	at org.apache.pulsar.broker.service.BacklogQuotaManagerTest.testProducerExceptionAndThenUnblockSizeQuota(BacklogQuotaManagerTest.java:1135)
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

```
java.lang.AssertionError: unable to publish due to org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic persistent://prop/quotahold/exceptandunblock within given timeout : createdAt 2.002 ns ago, firstSentAt 1971.806 ns ago, lastSentAt 1971.806 ns ago, retryCount 0 expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertFalse(Assert.java:67)
	at org.apache.pulsar.broker.service.BacklogQuotaManagerTest.testProducerExceptionAndThenUnblockSizeQuota(BacklogQuotaManagerTest.java:1135)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-29T18:29:19.1512000Z](https://github.com/apache/pulsar/runs/4992450750?check_suite_focus=true?check_suite_focus=true#step:9:3417)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: unable to publish due to org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic persistent://prop/quotahold/exceptandunblock within given timeout : createdAt 2.002 ns ago, firstSentAt 1971.806 ns ago, lastSentAt 1971.806 ns ago, retryCount 0 expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertFalse(Assert.java:67)
	at org.apache.pulsar.broker.service.BacklogQuotaManagerTest.testProducerExceptionAndThenUnblockSizeQuota(BacklogQuotaManagerTest.java:1135)
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

```
java.lang.AssertionError: unable to publish due to org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic persistent://prop/quotahold/exceptandunblock within given timeout : createdAt 2.002 ns ago, firstSentAt 1542.502 ns ago, lastSentAt 1542.502 ns ago, retryCount 0 expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertFalse(Assert.java:67)
	at org.apache.pulsar.broker.service.BacklogQuotaManagerTest.testProducerExceptionAndThenUnblockSizeQuota(BacklogQuotaManagerTest.java:1135)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-29T06:14:25.6874297Z](https://github.com/apache/pulsar/runs/4989586769?check_suite_focus=true?check_suite_focus=true#step:9:554)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: unable to publish due to org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic persistent://prop/quotahold/exceptandunblock within given timeout : createdAt 2.002 ns ago, firstSentAt 1542.502 ns ago, lastSentAt 1542.502 ns ago, retryCount 0 expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertFalse(Assert.java:67)
	at org.apache.pulsar.broker.service.BacklogQuotaManagerTest.testProducerExceptionAndThenUnblockSizeQuota(BacklogQuotaManagerTest.java:1135)
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

```
java.lang.AssertionError: unable to publish due to org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic persistent://prop/quotahold/exceptandunblock within given timeout : createdAt 2.002 ns ago, firstSentAt 1372.525 ns ago, lastSentAt 1372.525 ns ago, retryCount 0 expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertFalse(Assert.java:67)
	at org.apache.pulsar.broker.service.BacklogQuotaManagerTest.testProducerExceptionAndThenUnblockSizeQuota(BacklogQuotaManagerTest.java:1135)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-28T15:10:43.9521217Z](https://github.com/apache/pulsar/runs/4982125910?check_suite_focus=true?check_suite_focus=true#step:9:546)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: unable to publish due to org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic persistent://prop/quotahold/exceptandunblock within given timeout : createdAt 2.002 ns ago, firstSentAt 1372.525 ns ago, lastSentAt 1372.525 ns ago, retryCount 0 expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertFalse(Assert.java:67)
	at org.apache.pulsar.broker.service.BacklogQuotaManagerTest.testProducerExceptionAndThenUnblockSizeQuota(BacklogQuotaManagerTest.java:1135)
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

