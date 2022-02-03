        
Flaky-test: org.apache.pulsar.client.api.MultiTopicsConsumerTest.testShouldMaintainOrderForIndividualTopicInMultiTopicsConsumer
Number of failures: 2

org.apache.pulsar.client.api.MultiTopicsConsumerTest is flaky. The testShouldMaintainOrderForIndividualTopicInMultiTopicsConsumer test method fails sporadically.

```
java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.CompletableFuture.timedGet(CompletableFuture.java:1886)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2021)
	at org.apache.pulsar.client.api.MultiTopicsConsumerTest.testShouldMaintainOrderForIndividualTopicInMultiTopicsConsumer(MultiTopicsConsumerTest.java:188)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-31T08:45:30.8311598Z](https://github.com/apache/pulsar/runs/5002911404?check_suite_focus=true?check_suite_focus=true#step:9:818)  
[example failure 2022-01-29T02:29:09.9386457Z](https://github.com/apache/pulsar/runs/4988541970?check_suite_focus=true?check_suite_focus=true#step:9:2445)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.CompletableFuture.timedGet(CompletableFuture.java:1886)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2021)
	at org.apache.pulsar.client.api.MultiTopicsConsumerTest.testShouldMaintainOrderForIndividualTopicInMultiTopicsConsumer(MultiTopicsConsumerTest.java:188)
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

