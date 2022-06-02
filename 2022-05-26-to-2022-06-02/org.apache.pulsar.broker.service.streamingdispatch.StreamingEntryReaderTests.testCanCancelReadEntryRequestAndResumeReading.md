        
Flaky-test: org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests.testCanCancelReadEntryRequestAndResumeReading
Number of failures: 1

org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests is flaky. The testCanCancelReadEntryRequestAndResumeReading test method fails sporadically.

```
org.mockito.exceptions.misusing.UnfinishedStubbingException:

Unfinished stubbing detected here:
-> at org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests.testCanCancelReadEntryRequestAndResumeReading(StreamingEntryReaderTests.java:288)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-01T14:36:36.2134840Z](https://github.com/apache/pulsar/runs/6691177368?check_suite_focus=true#step:10:1785)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.misusing.UnfinishedStubbingException:

Unfinished stubbing detected here:
-> at org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests.testCanCancelReadEntryRequestAndResumeReading(StreamingEntryReaderTests.java:288)

E.g. thenReturn() may be missing.
Examples of correct stubbing:
    when(mock.isOk()).thenReturn(true);
    when(mock.isOk()).thenThrow(exception);
    doThrow(exception).when(mock).someVoidMethod();
Hints:
 1. missing thenReturn()
 2. you are trying to stub a final method, which is not supported
 3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed

	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.asyncReadEntry(ManagedLedgerImpl.java:1887)
	at org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests.testCanCancelReadEntryRequestAndResumeReading(StreamingEntryReaderTests.java:301)
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

