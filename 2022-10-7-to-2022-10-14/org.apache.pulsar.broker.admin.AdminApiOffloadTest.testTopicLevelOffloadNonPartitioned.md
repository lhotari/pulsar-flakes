        
Flaky-test: org.apache.pulsar.broker.admin.AdminApiOffloadTest.testTopicLevelOffloadNonPartitioned
Number of failures: 1

org.apache.pulsar.broker.admin.AdminApiOffloadTest is flaky. The testTopicLevelOffloadNonPartitioned test method fails sporadically.

```
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.admin.PulsarAdmin.topics()" because "this.admin" is null
	at org.apache.pulsar.broker.admin.AdminApiOffloadTest.testOffload(AdminApiOffloadTest.java:269)
	at org.apache.pulsar.broker.admin.AdminApiOffloadTest.testTopicLevelOffloadNonPartitioned(AdminApiOffloadTest.java:259)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-09T06:51:28.7378876Z](https://github.com/apache/pulsar/actions/runs/3210658081/jobs/5252712241#step:9:827)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.admin.PulsarAdmin.topics()" because "this.admin" is null
	at org.apache.pulsar.broker.admin.AdminApiOffloadTest.testOffload(AdminApiOffloadTest.java:269)
	at org.apache.pulsar.broker.admin.AdminApiOffloadTest.testTopicLevelOffloadNonPartitioned(AdminApiOffloadTest.java:259)
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

