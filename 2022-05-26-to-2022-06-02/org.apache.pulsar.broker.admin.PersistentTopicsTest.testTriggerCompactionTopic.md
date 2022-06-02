        
Flaky-test: org.apache.pulsar.broker.admin.PersistentTopicsTest.testTriggerCompactionTopic
Number of failures: 7

org.apache.pulsar.broker.admin.PersistentTopicsTest is flaky. The testTriggerCompactionTopic test method fails sporadically.

```
org.mockito.exceptions.verification.TooManyActualInvocations:

asyncResponse.resume(<Capturing argument>);
Wanted 1 time:
-> at org.apache.pulsar.broker.admin.PersistentTopicsTest.testTriggerCompactionTopic(PersistentTopicsTest.java:907)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-01T02:01:43.4754992Z](https://github.com/apache/pulsar/runs/6681608749?check_suite_focus=true#step:10:517)  
[example failure 2022-06-01T01:59:58.9873368Z](https://github.com/apache/pulsar/runs/6681603884?check_suite_focus=true#step:10:658)  
[example failure 2022-05-31T10:42:42.6503392Z](https://github.com/apache/pulsar/runs/6668795856?check_suite_focus=true#step:10:657)  
[example failure 2022-05-27T14:41:22.2287567Z](https://github.com/apache/pulsar/runs/6627109742?check_suite_focus=true#step:9:662)  
[example failure 2022-05-27T00:49:07.0858054Z](https://github.com/apache/pulsar/runs/6618473213?check_suite_focus=true#step:9:3905)  
[example failure 2022-05-27T00:34:23.1248973Z](https://github.com/apache/pulsar/runs/6618473213?check_suite_focus=true#step:9:2942)  
[example failure 2022-05-27T00:19:26.6685823Z](https://github.com/apache/pulsar/runs/6618473213?check_suite_focus=true#step:9:674)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.verification.TooManyActualInvocations:

asyncResponse.resume(<Capturing argument>);
Wanted 1 time:
-> at org.apache.pulsar.broker.admin.PersistentTopicsTest.testTriggerCompactionTopic(PersistentTopicsTest.java:907)
But was 2 times:
-> at org.apache.pulsar.broker.admin.impl.PersistentTopicsBase.lambda$internalTriggerCompactionNonPartitionedTopic$309(PersistentTopicsBase.java:3804)
-> at org.apache.pulsar.broker.admin.v2.PersistentTopics.lambda$createNonPartitionedTopic$2(PersistentTopics.java:352)


	at org.apache.pulsar.broker.admin.PersistentTopicsTest.testTriggerCompactionTopic(PersistentTopicsTest.java:907)
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

