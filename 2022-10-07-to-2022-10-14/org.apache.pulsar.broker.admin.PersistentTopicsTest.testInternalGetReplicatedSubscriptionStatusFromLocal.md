        
Flaky-test: org.apache.pulsar.broker.admin.PersistentTopicsTest.testInternalGetReplicatedSubscriptionStatusFromLocal
Number of failures: 1

org.apache.pulsar.broker.admin.PersistentTopicsTest is flaky. The testInternalGetReplicatedSubscriptionStatusFromLocal test method fails sporadically.

```
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.admin.PulsarAdmin.topics()" because "this.admin" is null
	at org.apache.pulsar.broker.admin.PersistentTopicsTest.testInternalGetReplicatedSubscriptionStatusFromLocal(PersistentTopicsTest.java:1627)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-10T12:47:11.5257725Z](https://github.com/apache/pulsar/actions/runs/3219150517/jobs/5264205064#step:8:1677)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.admin.PulsarAdmin.topics()" because "this.admin" is null
	at org.apache.pulsar.broker.admin.PersistentTopicsTest.testInternalGetReplicatedSubscriptionStatusFromLocal(PersistentTopicsTest.java:1627)
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

