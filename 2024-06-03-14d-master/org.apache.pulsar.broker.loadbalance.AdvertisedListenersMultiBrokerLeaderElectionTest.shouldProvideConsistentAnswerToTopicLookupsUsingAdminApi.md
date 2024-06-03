        
Flaky-test: org.apache.pulsar.broker.loadbalance.AdvertisedListenersMultiBrokerLeaderElectionTest.shouldProvideConsistentAnswerToTopicLookupsUsingAdminApi
Number of failures: 3

org.apache.pulsar.broker.loadbalance.AdvertisedListenersMultiBrokerLeaderElectionTest is flaky. The shouldProvideConsistentAnswerToTopicLookupsUsingAdminApi test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.loadbalance.MultiBrokerLeaderElectionTest.shouldProvideConsistentAnswerToTopicLookupsUsingAdminApi() didn't finish within the time-out 120000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-05-31T12:46:08.9489902Z](https://github.com/apache/pulsar/actions/runs/9317898192/job/25649546819#step:10:1244)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.loadbalance.MultiBrokerLeaderElectionTest.shouldProvideConsistentAnswerToTopicLookupsUsingAdminApi() didn't finish within the time-out 120000
	at java.base@17.0.11/jdk.internal.misc.Unsafe.park(Native Method)
	at java.base@17.0.11/java.util.concurrent.locks.LockSupport.park(LockSupport.java:211)
	at java.base@17.0.11/java.util.concurrent.FutureTask.awaitDone(FutureTask.java:447)
	at java.base@17.0.11/java.util.concurrent.FutureTask.get(FutureTask.java:190)
	at app//org.apache.pulsar.broker.loadbalance.MultiBrokerLeaderElectionTest.shouldProvideConsistentAnswerToTopicLookupsUsingAdminApi(MultiBrokerLeaderElectionTest.java:135)
	at java.base@17.0.11/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base@17.0.11/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base@17.0.11/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base@17.0.11/java.lang.reflect.Method.invoke(Method.java:568)
	at app//org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base@17.0.11/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base@17.0.11/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base@17.0.11/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base@17.0.11/java.lang.Thread.run(Thread.java:840)

</pre></code>
</details>

[example failure 2024-05-31T06:38:18.6265327Z](https://github.com/apache/pulsar/actions/runs/9313641535/job/25636692794#step:11:1192)  
[example failure 2024-05-27T06:38:21.0820040Z](https://github.com/apache/pulsar/actions/runs/9249975382/job/25443012366#step:10:1209)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.loadbalance.MultiBrokerLeaderElectionTest.shouldProvideConsistentAnswerToTopicLookupsUsingAdminApi() didn't finish within the time-out 120000
	at java.base/jdk.internal.misc.Unsafe.park(Native Method)
	at java.base/java.util.concurrent.locks.LockSupport.park(LockSupport.java:221)
	at java.base/java.util.concurrent.FutureTask.awaitDone(FutureTask.java:500)
	at java.base/java.util.concurrent.FutureTask.get(FutureTask.java:190)
	at org.apache.pulsar.broker.loadbalance.MultiBrokerLeaderElectionTest.shouldProvideConsistentAnswerToTopicLookupsUsingAdminApi(MultiBrokerLeaderElectionTest.java:135)
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

