        
Flaky-test: org.apache.pulsar.broker.service.ClusterMigrationTest.testClusterMigrationWithReplicationBacklog
Number of failures: 2

org.apache.pulsar.broker.service.ClusterMigrationTest is flaky. The testClusterMigrationWithReplicationBacklog test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition expected [false] but found [true] within 1 minutes.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.service.ClusterMigrationTest.testClusterMigrationWithReplicationBacklog(ClusterMigrationTest.java:522)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-20T22:03:43.7222697Z](https://github.com/apache/pulsar/actions/runs/23363938332/job/67974397012#step:11:1810)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.service.ClusterMigrationTest.testClusterMigrationWithReplicationBacklog -- Time elapsed: 75.77 s <<< FAILURE!
org.awaitility.core.ConditionTimeoutException: Assertion condition expected [false] but found [true] within 1 minutes.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.service.ClusterMigrationTest.testClusterMigrationWithReplicationBacklog(ClusterMigrationTest.java:522)
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
Caused by: java.lang.AssertionError: expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertFalse(Assert.java:78)
	at org.testng.Assert.assertFalse(Assert.java:88)
	at org.apache.pulsar.broker.service.ClusterMigrationTest.lambda$testClusterMigrationWithReplicationBacklog$21(ClusterMigrationTest.java:522)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	... 4 more

</pre></code>
</details>

```
java.lang.AssertionError: expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertFalse(Assert.java:78)
	at org.testng.Assert.assertFalse(Assert.java:88)
	at org.apache.pulsar.broker.service.ClusterMigrationTest.testClusterMigrationWithReplicationBacklog(ClusterMigrationTest.java:525)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-17T23:57:49.4393935Z](https://github.com/apache/pulsar/actions/runs/23221716233/job/67496336632#step:11:1807)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.broker.service.ClusterMigrationTest.testClusterMigrationWithReplicationBacklog -- Time elapsed: 60.36 s <<< FAILURE!
java.lang.AssertionError: expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertFalse(Assert.java:78)
	at org.testng.Assert.assertFalse(Assert.java:88)
	at org.apache.pulsar.broker.service.ClusterMigrationTest.testClusterMigrationWithReplicationBacklog(ClusterMigrationTest.java:525)
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

