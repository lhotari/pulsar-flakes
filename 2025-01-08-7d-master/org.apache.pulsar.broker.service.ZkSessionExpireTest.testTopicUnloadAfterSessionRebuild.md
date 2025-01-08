        
Flaky-test: org.apache.pulsar.broker.service.ZkSessionExpireTest.testTopicUnloadAfterSessionRebuild
Number of failures: 11

org.apache.pulsar.broker.service.ZkSessionExpireTest is flaky. The testTopicUnloadAfterSessionRebuild test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition expected [true] but found [false] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.service.ZkSessionExpireTest.testTopicUnloadAfterSessionRebuild(ZkSessionExpireTest.java:161)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-01-07T06:28:01.5238522Z](https://github.com/apache/pulsar/actions/runs/12646109266/job/35236294708#step:9:2251)  
[example failure 2025-01-06T06:28:36.9239706Z](https://github.com/apache/pulsar/actions/runs/12627438315/job/35182043148#step:9:2236)  
[example failure 2025-01-05T06:27:42.6675697Z](https://github.com/apache/pulsar/actions/runs/12617083368/job/35158983581#step:9:2236)  
[example failure 2025-01-04T06:27:21.6946387Z](https://github.com/apache/pulsar/actions/runs/12608077303/job/35140160762#step:9:2251)  
[example failure 2025-01-02T12:34:40.2102783Z](https://github.com/apache/pulsar/actions/runs/12582208709/job/35067737534#step:11:1254)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition expected [true] but found [false] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.service.ZkSessionExpireTest.testTopicUnloadAfterSessionRebuild(ZkSessionExpireTest.java:161)
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
Caused by: java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertTrue(Assert.java:56)
	at org.testng.Assert.assertTrue(Assert.java:66)
	at org.apache.pulsar.broker.service.ZkSessionExpireTest.lambda$testTopicUnloadAfterSessionRebuild$5(ZkSessionExpireTest.java:163)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	... 4 more

</pre></code>
</details>

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a org.apache.pulsar.broker.service.ZkSessionExpireTest expected [true] but found [false] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.service.ZkSessionExpireTest.testTopicUnloadAfterSessionRebuild(ZkSessionExpireTest.java:161)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-01-08T12:36:19.4842315Z](https://github.com/apache/pulsar/actions/runs/12670284829/job/35309639630#step:9:2236)  
[example failure 2025-01-06T12:36:04.7645553Z](https://github.com/apache/pulsar/actions/runs/12632253057/job/35195582456#step:9:2236)  
[example failure 2025-01-05T12:34:20.6297667Z](https://github.com/apache/pulsar/actions/runs/12619365473/job/35163830553#step:9:2236)  
[example failure 2025-01-04T12:34:43.5695623Z](https://github.com/apache/pulsar/actions/runs/12610311507/job/35144764399#step:9:2236)  
[example failure 2025-01-03T06:26:39.3223484Z](https://github.com/apache/pulsar/actions/runs/12593491450/job/35099833653#step:11:1210)  
[example failure 2025-01-02T06:26:13.0823326Z](https://github.com/apache/pulsar/actions/runs/12578233912/job/35056893586#step:11:1248)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a org.apache.pulsar.broker.service.ZkSessionExpireTest expected [true] but found [false] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.service.ZkSessionExpireTest.testTopicUnloadAfterSessionRebuild(ZkSessionExpireTest.java:161)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:840)
Caused by: java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertTrue(Assert.java:56)
	at org.testng.Assert.assertTrue(Assert.java:66)
	at org.apache.pulsar.broker.service.ZkSessionExpireTest.lambda$testTopicUnloadAfterSessionRebuild$5(ZkSessionExpireTest.java:163)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	... 4 more

</pre></code>
</details>

