        
Flaky-test: org.apache.pulsar.metadata.MetadataStoreTest.testThreadSwitchOfZkMetadataStore
Number of failures: 1

org.apache.pulsar.metadata.MetadataStoreTest is flaky. The testThreadSwitchOfZkMetadataStore test method fails sporadically.

```
java.util.concurrent.CompletionException: java.lang.AssertionError: Expect to switch to thread 77df4d643d594e149f49b0fbb9ea5309, but currently it is thread TestNG-method=testThreadSwitchOfZkMetadataStore-1 expected [true] but found [false]
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-12-08T12:29:32.1583501Z](https://github.com/apache/pulsar/actions/runs/7141127384/job/19448168692#step:11:253)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: java.lang.AssertionError: Expect to switch to thread 77df4d643d594e149f49b0fbb9ea5309, but currently it is thread TestNG-method=testThreadSwitchOfZkMetadataStore-1 expected [true] but found [false]
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:315)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:320)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:994)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionallyStage(CompletableFuture.java:1008)
	at java.base/java.util.concurrent.CompletableFuture.exceptionally(CompletableFuture.java:2364)
	at org.apache.pulsar.metadata.MetadataStoreTest.testThreadSwitchOfZkMetadataStore(MetadataStoreTest.java:492)
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
Caused by: java.lang.AssertionError: Expect to switch to thread 77df4d643d594e149f49b0fbb9ea5309, but currently it is thread TestNG-method=testThreadSwitchOfZkMetadataStore-1 expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertTrue(Assert.java:56)
	at org.apache.pulsar.metadata.MetadataStoreTest.lambda$testThreadSwitchOfZkMetadataStore$2(MetadataStoreTest.java:460)
	at org.apache.pulsar.metadata.MetadataStoreTest.lambda$testThreadSwitchOfZkMetadataStore$9(MetadataStoreTest.java:493)
	at java.base/java.util.concurrent.CompletableFuture.uniExceptionally(CompletableFuture.java:990)
	... 15 more

</pre></code>
</details>

