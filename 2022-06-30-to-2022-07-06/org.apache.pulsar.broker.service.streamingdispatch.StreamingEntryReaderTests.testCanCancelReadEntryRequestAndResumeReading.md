        
Flaky-test: org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests.testCanCancelReadEntryRequestAndResumeReading
Number of failures: 1

org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests is flaky. The testCanCancelReadEntryRequestAndResumeReading test method fails sporadically.

```
java.lang.AssertionError
	at org.mockito.internal.stubbing.InvocationContainerImpl.setMethodForStubbing(InvocationContainerImpl.java:123)
	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:55)
	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.asyncReadEntry(ManagedLedgerImpl.java:1900)
	at org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests.testCanCancelReadEntryRequestAndResumeReading(StreamingEntryReaderTests.java:301)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-07T06:53:36.5766114Z](https://github.com/apache/pulsar/runs/6768767726?check_suite_focus=true#step:10:1606)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError
	at org.mockito.internal.stubbing.InvocationContainerImpl.setMethodForStubbing(InvocationContainerImpl.java:123)
	at org.mockito.internal.handler.MockHandlerImpl.handle(MockHandlerImpl.java:55)
	at org.mockito.internal.handler.NullResultGuardian.handle(NullResultGuardian.java:29)
	at org.mockito.internal.handler.InvocationNotifierHandler.handle(InvocationNotifierHandler.java:34)
	at org.mockito.internal.creation.bytebuddy.MockMethodInterceptor.doIntercept(MockMethodInterceptor.java:82)
	at org.mockito.internal.creation.bytebuddy.MockMethodAdvice.handle(MockMethodAdvice.java:151)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerImpl.asyncReadEntry(ManagedLedgerImpl.java:1900)
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

