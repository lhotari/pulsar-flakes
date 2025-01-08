        
Flaky-test: org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests.testCanCancelReadEntryRequestAndResumeReading
Number of failures: 4

org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests is flaky. The testCanCancelReadEntryRequestAndResumeReading test method fails sporadically.

```
org.mockito.exceptions.misusing.UnfinishedStubbingException:

Unfinished stubbing detected here:
-> at org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests.testCanCancelReadEntryRequestAndResumeReading(StreamingEntryReaderTests.java:286)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-01-03T00:57:09.9537893Z](https://github.com/apache/pulsar/actions/runs/12580383908/job/35092745657#step:8:2062)  
[example failure 2025-01-02T11:48:56.1680995Z](https://github.com/apache/pulsar/actions/runs/12580383908/job/35065749184#step:8:2062)  
[example failure 2025-01-02T10:06:07.3802629Z](https://github.com/apache/pulsar/actions/runs/12580383908/job/35062198288#step:8:2048)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.misusing.UnfinishedStubbingException:

Unfinished stubbing detected here:
-> at org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests.testCanCancelReadEntryRequestAndResumeReading(StreamingEntryReaderTests.java:286)

E.g. thenReturn() may be missing.
Examples of correct stubbing:
    when(mock.isOk()).thenReturn(true);
    when(mock.isOk()).thenThrow(exception);
    doThrow(exception).when(mock).someVoidMethod();
Hints:
 1. missing thenReturn()
 2. you are trying to stub a final method, which is not supported
 3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed

	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.asyncReadEntry(ManagedLedgerImpl.java:2033)
	at org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests.testCanCancelReadEntryRequestAndResumeReading(StreamingEntryReaderTests.java:299)
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

```
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests.testCanCancelReadEntryRequestAndResumeReading(StreamingEntryReaderTests.java:311)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-01-02T15:45:27.3358300Z](https://github.com/apache/pulsar/actions/runs/12580383908/job/35074447249#step:8:2062)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests.testCanCancelReadEntryRequestAndResumeReading(StreamingEntryReaderTests.java:311)
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

