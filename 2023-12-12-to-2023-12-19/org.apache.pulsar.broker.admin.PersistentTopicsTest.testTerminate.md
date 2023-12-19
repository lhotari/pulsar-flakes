        
Flaky-test: org.apache.pulsar.broker.admin.PersistentTopicsTest.testTerminate
Number of failures: 1

org.apache.pulsar.broker.admin.PersistentTopicsTest is flaky. The testTerminate test method fails sporadically.

```
org.mockito.exceptions.verification.TooManyActualInvocations:

asyncResponse.resume(
    <Capturing argument: Response>
);
Wanted 1 time:
-> at org.apache.pulsar.broker.admin.PersistentTopicsTest.testTerminate(PersistentTopicsTest.java:435)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-12-15T13:50:09.8129585Z](https://github.com/apache/pulsar/actions/runs/7222621311/job/19680223704#step:10:1571)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.verification.TooManyActualInvocations:

asyncResponse.resume(
    <Capturing argument: Response>
);
Wanted 1 time:
-> at org.apache.pulsar.broker.admin.PersistentTopicsTest.testTerminate(PersistentTopicsTest.java:435)
But was 2 times:
-> at org.apache.pulsar.broker.admin.v2.PersistentTopics.lambda$createNonPartitionedTopic$6(PersistentTopics.java:336)
-> at org.apache.pulsar.broker.admin.impl.PersistentTopicsBase.lambda$internalCreateSubscriptionForNonPartitionedTopic$237(PersistentTopicsBase.java:2385)


	at org.apache.pulsar.broker.admin.PersistentTopicsTest.testTerminate(PersistentTopicsTest.java:435)
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

</pre></code>
</details>

