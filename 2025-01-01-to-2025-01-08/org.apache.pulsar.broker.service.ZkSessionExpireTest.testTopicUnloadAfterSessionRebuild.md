        
Flaky-test: org.apache.pulsar.broker.service.ZkSessionExpireTest.testTopicUnloadAfterSessionRebuild
Number of failures: 9

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
[example failure 2025-01-03T04:12:50.6666422Z](https://github.com/apache/pulsar/actions/runs/12592458125/job/35097250464#step:11:1698)  
[example failure 2025-01-02T05:18:46.9114098Z](https://github.com/apache/pulsar/actions/runs/12577747526/job/35055701632#step:11:1597)  
[example failure 2025-01-02T03:52:38.5378956Z](https://github.com/apache/pulsar/actions/runs/12571759057/job/35054316332#step:10:1509)  
[example failure 2025-01-02T02:19:17.2292840Z](https://github.com/apache/pulsar/actions/runs/12571759057/job/35052675399#step:11:1577)  
[example failure 2025-01-01T15:20:12.7209904Z](https://github.com/apache/pulsar/actions/runs/12571759057/job/35043177848#step:11:1489)  


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
[example failure 2025-01-07T15:22:42.8239694Z](https://github.com/apache/pulsar/actions/runs/12635032267/job/35259900211#step:9:2204)  
[example failure 2025-01-07T10:57:07.9219094Z](https://github.com/apache/pulsar/actions/runs/12635032267/job/35247032761#step:9:2225)  
[example failure 2025-01-05T12:25:39.1459425Z](https://github.com/apache/pulsar/actions/runs/12619305257/job/35163685808#step:9:2225)  
[example failure 2025-01-03T19:11:50.5489361Z](https://github.com/apache/pulsar/actions/runs/12602408792/job/35125429343#step:9:2225)  


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

