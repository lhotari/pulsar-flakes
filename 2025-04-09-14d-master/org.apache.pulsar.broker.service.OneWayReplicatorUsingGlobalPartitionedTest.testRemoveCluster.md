        
Flaky-test: org.apache.pulsar.broker.service.OneWayReplicatorUsingGlobalPartitionedTest.testRemoveCluster
Number of failures: 21

org.apache.pulsar.broker.service.OneWayReplicatorUsingGlobalPartitionedTest is flaky. The testRemoveCluster test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.OneWayReplicatorUsingGlobalPartitionedTest.testRemoveCluster() didn't finish within the time-out 60000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-04-07T12:36:12.2727493Z](https://github.com/apache/pulsar/actions/runs/14308845069/job/40099356034#step:10:749)  
[example failure 2025-04-06T12:34:46.9018126Z](https://github.com/apache/pulsar/actions/runs/14292369657/job/40055414621#step:10:884)  
[example failure 2025-04-05T12:33:49.3992167Z](https://github.com/apache/pulsar/actions/runs/14281742340/job/40032243094#step:11:866)  
[example failure 2025-04-04T12:35:35.7207077Z](https://github.com/apache/pulsar/actions/runs/14265049113/job/39985351136#step:11:908)  
[example failure 2025-04-03T12:35:45.7443462Z](https://github.com/apache/pulsar/actions/runs/14242635902/job/39916463224#step:11:729)  
[example failure 2025-04-02T12:39:45.9064779Z](https://github.com/apache/pulsar/actions/runs/14219287597/job/39843681687#step:11:901)  
[example failure 2025-04-01T12:40:06.4086427Z](https://github.com/apache/pulsar/actions/runs/14195268210/job/39769420818#step:11:861)  
[example failure 2025-03-31T12:36:03.8115901Z](https://github.com/apache/pulsar/actions/runs/14171235180/job/39695829953#step:11:866)  
[example failure 2025-03-30T12:34:50.7665338Z](https://github.com/apache/pulsar/actions/runs/14155876693/job/39655234413#step:10:886)  
[example failure 2025-03-29T12:34:18.4543015Z](https://github.com/apache/pulsar/actions/runs/14145474244/job/39632430972#step:11:866)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.OneWayReplicatorUsingGlobalPartitionedTest.testRemoveCluster() didn't finish within the time-out 60000
	at java.base/java.lang.Thread.sleep0(Native Method)
	at java.base/java.lang.Thread.sleep(Thread.java:558)
	at java.base/java.util.concurrent.TimeUnit.sleep(TimeUnit.java:446)
	at org.awaitility.core.Uninterruptibles.sleepUninterruptibly(Uninterruptibles.java:35)
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:117)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.service.OneWayReplicatorUsingGlobalPartitionedTest.testRemoveCluster(OneWayReplicatorUsingGlobalPartitionedTest.java:191)
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

[example failure 2025-04-07T06:25:35.6188721Z](https://github.com/apache/pulsar/actions/runs/14301942628/job/40078132389#step:11:873)  
[example failure 2025-04-06T06:24:29.1610740Z](https://github.com/apache/pulsar/actions/runs/14289613290/job/40049266407#step:11:873)  
[example failure 2025-04-05T06:24:25.8542628Z](https://github.com/apache/pulsar/actions/runs/14279053943/job/40026464918#step:11:873)  
[example failure 2025-04-04T06:24:48.5538521Z](https://github.com/apache/pulsar/actions/runs/14259036143/job/39967069141#step:11:873)  
[example failure 2025-04-03T06:24:30.5180910Z](https://github.com/apache/pulsar/actions/runs/14236028883/job/39895728158#step:11:910)  
[example failure 2025-04-02T06:28:19.8068575Z](https://github.com/apache/pulsar/actions/runs/14212605378/job/39822769310#step:10:926)  
[example failure 2025-04-01T06:25:01.2068174Z](https://github.com/apache/pulsar/actions/runs/14188344572/job/39747969893#step:10:893)  
[example failure 2025-03-31T06:26:21.8402085Z](https://github.com/apache/pulsar/actions/runs/14165086378/job/39677144414#step:11:734)  
[example failure 2025-03-30T06:24:25.3186966Z](https://github.com/apache/pulsar/actions/runs/14153207832/job/39649261913#step:11:873)  
[example failure 2025-03-29T06:24:59.6402509Z](https://github.com/apache/pulsar/actions/runs/14142843129/job/39626718346#step:11:724)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.OneWayReplicatorUsingGlobalPartitionedTest.testRemoveCluster() didn't finish within the time-out 60000
	at java.base@17.0.14/java.lang.Thread.sleep(Native Method)
	at java.base@17.0.14/java.lang.Thread.sleep(Thread.java:344)
	at java.base@17.0.14/java.util.concurrent.TimeUnit.sleep(TimeUnit.java:446)
	at app//org.awaitility.core.Uninterruptibles.sleepUninterruptibly(Uninterruptibles.java:35)
	at app//org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:117)
	at app//org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at app//org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at app//org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at app//org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at app//org.apache.pulsar.broker.service.OneWayReplicatorUsingGlobalPartitionedTest.testRemoveCluster(OneWayReplicatorUsingGlobalPartitionedTest.java:191)
	at java.base@17.0.14/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base@17.0.14/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base@17.0.14/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base@17.0.14/java.lang.reflect.Method.invoke(Method.java:569)
	at app//org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base@17.0.14/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base@17.0.14/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base@17.0.14/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base@17.0.14/java.lang.Thread.run(Thread.java:840)

</pre></code>
</details>

[example failure 2025-04-08T06:19:00.5265510Z](https://github.com/apache/pulsar/actions/runs/14326297985/job/40152304116#step:9:2011)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.OneWayReplicatorUsingGlobalPartitionedTest.testRemoveCluster() didn't finish within the time-out 60000
	at java.base/java.lang.Thread.sleep0(Native Method)
	at java.base/java.lang.Thread.sleep(Thread.java:558)
	at java.base/java.util.concurrent.TimeUnit.sleep(TimeUnit.java:446)
	at org.awaitility.core.Uninterruptibles.sleepUninterruptibly(Uninterruptibles.java:35)
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:117)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.service.OneWayReplicatorUsingGlobalPartitionedTest.testRemoveCluster(OneWayReplicatorUsingGlobalPartitionedTest.java:193)
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

