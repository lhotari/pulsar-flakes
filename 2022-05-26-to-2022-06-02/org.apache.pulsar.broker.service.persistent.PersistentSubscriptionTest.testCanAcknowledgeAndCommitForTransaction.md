        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentSubscriptionTest.testCanAcknowledgeAndCommitForTransaction
Number of failures: 1

org.apache.pulsar.broker.service.persistent.PersistentSubscriptionTest is flaky. The testCanAcknowledgeAndCommitForTransaction test method fails sporadically.

```
org.mockito.exceptions.misusing.UnfinishedStubbingException:

Unfinished stubbing detected here:
-> at org.apache.pulsar.broker.service.persistent.PersistentSubscriptionTest.testCanAcknowledgeAndCommitForTransaction(PersistentSubscriptionTest.java:259)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-05-27T14:45:02.2677123Z](https://github.com/apache/pulsar/runs/6627109560?check_suite_focus=true#step:10:773)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.misusing.UnfinishedStubbingException:

Unfinished stubbing detected here:
-> at org.apache.pulsar.broker.service.persistent.PersistentSubscriptionTest.testCanAcknowledgeAndCommitForTransaction(PersistentSubscriptionTest.java:259)

E.g. thenReturn() may be missing.
Examples of correct stubbing:
    when(mock.isOk()).thenReturn(true);
    when(mock.isOk()).thenThrow(exception);
    doThrow(exception).when(mock).someVoidMethod();
Hints:
 1. missing thenReturn()
 2. you are trying to stub a final method, which is not supported
 3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed

	at org.apache.bookkeeper.mledger.impl.ManagedCursorImpl.asyncMarkDelete(ManagedCursorImpl.java:1703)
	at org.apache.pulsar.broker.service.persistent.PersistentSubscriptionTest.testCanAcknowledgeAndCommitForTransaction(PersistentSubscriptionTest.java:264)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

