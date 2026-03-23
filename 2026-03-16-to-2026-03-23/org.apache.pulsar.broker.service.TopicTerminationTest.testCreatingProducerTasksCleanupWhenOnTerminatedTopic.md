        
Flaky-test: org.apache.pulsar.broker.service.TopicTerminationTest.testCreatingProducerTasksCleanupWhenOnTerminatedTopic
Number of failures: 16

org.apache.pulsar.broker.service.TopicTerminationTest is flaky. The testCreatingProducerTasksCleanupWhenOnTerminatedTopic test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition expected [0] but found [12] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.service.TopicTerminationTest.testCreatingProducerTasksCleanupWhenOnTerminatedTopic(TopicTerminationTest.java:123)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-17T23:28:19.0178884Z](https://github.com/apache/pulsar/actions/runs/23220634967/job/67493010739#step:11:1100)  
[example failure 2026-03-17T20:16:46.5604487Z](https://github.com/apache/pulsar/actions/runs/23209702798/job/67469829888#step:11:1091)  
[example failure 2026-03-17T05:01:05.0171941Z](https://github.com/apache/pulsar/actions/runs/23173173743/job/67347472632#step:11:1083)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.service.TopicTerminationTest.testCreatingProducerTasksCleanupWhenOnTerminatedTopic -- Time elapsed: 10.05 s <<< FAILURE!
org.awaitility.core.ConditionTimeoutException: Assertion condition expected [0] but found [12] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.service.TopicTerminationTest.testCreatingProducerTasksCleanupWhenOnTerminatedTopic(TopicTerminationTest.java:123)
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
Caused by: java.lang.AssertionError: expected [0] but found [12]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:979)
	at org.testng.Assert.assertEquals(Assert.java:955)
	at org.testng.Assert.assertEquals(Assert.java:989)
	at org.apache.pulsar.broker.service.TopicTerminationTest.lambda$testCreatingProducerTasksCleanupWhenOnTerminatedTopic$0(TopicTerminationTest.java:123)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	... 4 more

</pre></code>
</details>

[example failure 2026-03-18T14:13:11.2957072Z](https://github.com/apache/pulsar/actions/runs/23221035406/job/67583373847#step:11:1116)  
[example failure 2026-03-17T23:25:24.0458005Z](https://github.com/apache/pulsar/actions/runs/23220563144/job/67492721500#step:11:1108)  
[example failure 2026-03-17T01:13:36.1625197Z](https://github.com/apache/pulsar/actions/runs/23173173743/job/67330162537#step:11:1087)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.service.TopicTerminationTest.testCreatingProducerTasksCleanupWhenOnTerminatedTopic -- Time elapsed: 10.06 s <<< FAILURE!
org.awaitility.core.ConditionTimeoutException: Assertion condition expected [0] but found [12] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.service.TopicTerminationTest.testCreatingProducerTasksCleanupWhenOnTerminatedTopic(TopicTerminationTest.java:123)
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
Caused by: java.lang.AssertionError: expected [0] but found [12]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:979)
	at org.testng.Assert.assertEquals(Assert.java:955)
	at org.testng.Assert.assertEquals(Assert.java:989)
	at org.apache.pulsar.broker.service.TopicTerminationTest.lambda$testCreatingProducerTasksCleanupWhenOnTerminatedTopic$0(TopicTerminationTest.java:123)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	... 4 more

</pre></code>
</details>

[example failure 2026-03-16T18:40:42.3599067Z](https://github.com/apache/pulsar/actions/runs/23155382308/job/67283453551#step:11:1093)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.service.TopicTerminationTest.testCreatingProducerTasksCleanupWhenOnTerminatedTopic -- Time elapsed: 10.08 s <<< FAILURE!
org.awaitility.core.ConditionTimeoutException: Assertion condition expected [0] but found [12] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.service.TopicTerminationTest.testCreatingProducerTasksCleanupWhenOnTerminatedTopic(TopicTerminationTest.java:123)
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
Caused by: java.lang.AssertionError: expected [0] but found [12]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:979)
	at org.testng.Assert.assertEquals(Assert.java:955)
	at org.testng.Assert.assertEquals(Assert.java:989)
	at org.apache.pulsar.broker.service.TopicTerminationTest.lambda$testCreatingProducerTasksCleanupWhenOnTerminatedTopic$0(TopicTerminationTest.java:123)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	... 4 more

</pre></code>
</details>

[example failure 2026-03-18T02:19:45.9615786Z](https://github.com/apache/pulsar/actions/runs/23221035406/job/67507824571#step:11:1108)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.service.TopicTerminationTest.testCreatingProducerTasksCleanupWhenOnTerminatedTopic -- Time elapsed: 10.07 s <<< FAILURE!
org.awaitility.core.ConditionTimeoutException: Assertion condition expected [0] but found [12] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.service.TopicTerminationTest.testCreatingProducerTasksCleanupWhenOnTerminatedTopic(TopicTerminationTest.java:123)
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
Caused by: java.lang.AssertionError: expected [0] but found [12]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:979)
	at org.testng.Assert.assertEquals(Assert.java:955)
	at org.testng.Assert.assertEquals(Assert.java:989)
	at org.apache.pulsar.broker.service.TopicTerminationTest.lambda$testCreatingProducerTasksCleanupWhenOnTerminatedTopic$0(TopicTerminationTest.java:123)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	... 4 more

</pre></code>
</details>

```
org.awaitility.core.ConditionTimeoutException: Assertion condition expected [0] but found [6] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.service.TopicTerminationTest.testCreatingProducerTasksCleanupWhenOnTerminatedTopic(TopicTerminationTest.java:123)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-18T05:58:30.5052433Z](https://github.com/apache/pulsar/actions/runs/23220417973/job/67524275976#step:11:1084)  
[example failure 2026-03-18T04:52:07.6964565Z](https://github.com/apache/pulsar/actions/runs/23225329790/job/67519258989#step:11:1108)  
[example failure 2026-03-18T00:31:20.8549613Z](https://github.com/apache/pulsar/actions/runs/23220417973/job/67498799396#step:11:1106)  
[example failure 2026-03-17T23:40:17.4945484Z](https://github.com/apache/pulsar/actions/runs/23221035406/job/67494178383#step:11:1108)  
[example failure 2026-03-17T23:23:47.0810050Z](https://github.com/apache/pulsar/actions/runs/23220417973/job/67492524733#step:11:1102)  
[example failure 2026-03-16T17:25:45.0334570Z](https://github.com/apache/pulsar/actions/runs/23155382308/job/67269812062#step:11:1099)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.service.TopicTerminationTest.testCreatingProducerTasksCleanupWhenOnTerminatedTopic -- Time elapsed: 10.06 s <<< FAILURE!
org.awaitility.core.ConditionTimeoutException: Assertion condition expected [0] but found [6] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.service.TopicTerminationTest.testCreatingProducerTasksCleanupWhenOnTerminatedTopic(TopicTerminationTest.java:123)
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
Caused by: java.lang.AssertionError: expected [0] but found [6]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:979)
	at org.testng.Assert.assertEquals(Assert.java:955)
	at org.testng.Assert.assertEquals(Assert.java:989)
	at org.apache.pulsar.broker.service.TopicTerminationTest.lambda$testCreatingProducerTasksCleanupWhenOnTerminatedTopic$0(TopicTerminationTest.java:123)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	... 4 more

</pre></code>
</details>

[example failure 2026-03-18T19:50:45.1826635Z](https://github.com/apache/pulsar/actions/runs/23220417973/job/67637998457#step:11:1110)  
[example failure 2026-03-18T00:37:14.8523167Z](https://github.com/apache/pulsar/actions/runs/23222691249/job/67499313627#step:11:1108)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.service.TopicTerminationTest.testCreatingProducerTasksCleanupWhenOnTerminatedTopic -- Time elapsed: 10.07 s <<< FAILURE!
org.awaitility.core.ConditionTimeoutException: Assertion condition expected [0] but found [6] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.service.TopicTerminationTest.testCreatingProducerTasksCleanupWhenOnTerminatedTopic(TopicTerminationTest.java:123)
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
Caused by: java.lang.AssertionError: expected [0] but found [6]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:979)
	at org.testng.Assert.assertEquals(Assert.java:955)
	at org.testng.Assert.assertEquals(Assert.java:989)
	at org.apache.pulsar.broker.service.TopicTerminationTest.lambda$testCreatingProducerTasksCleanupWhenOnTerminatedTopic$0(TopicTerminationTest.java:123)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	... 4 more

</pre></code>
</details>

