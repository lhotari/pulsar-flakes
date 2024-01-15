        
Flaky-test: org.apache.pulsar.functions.worker.FunctionAssignmentTailerTest.testErrorNotifier
Number of failures: 1

org.apache.pulsar.functions.worker.FunctionAssignmentTailerTest is flaky. The testErrorNotifier test method fails sporadically.

```
org.mockito.exceptions.misusing.UnfinishedStubbingException:

Unfinished stubbing detected here:
-> at org.apache.pulsar.functions.worker.FunctionAssignmentTailerTest.testErrorNotifier(FunctionAssignmentTailerTest.java:161)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-01-14T06:24:27.7443935Z](https://github.com/apache/pulsar/actions/runs/7517340777/job/20463557049#step:11:6685)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.misusing.UnfinishedStubbingException:

Unfinished stubbing detected here:
-> at org.apache.pulsar.functions.worker.FunctionAssignmentTailerTest.testErrorNotifier(FunctionAssignmentTailerTest.java:161)

E.g. thenReturn() may be missing.
Examples of correct stubbing:
    when(mock.isOk()).thenReturn(true);
    when(mock.isOk()).thenThrow(exception);
    doThrow(exception).when(mock).someVoidMethod();
Hints:
 1. missing thenReturn()
 2. you are trying to stub a final method, which is not supported
 3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed

	at org.apache.pulsar.functions.worker.FunctionRuntimeManager.processAssignmentMessage(FunctionRuntimeManager.java:682)
	at org.apache.pulsar.functions.worker.FunctionAssignmentTailerTest.testErrorNotifier(FunctionAssignmentTailerTest.java:161)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

</pre></code>
</details>

