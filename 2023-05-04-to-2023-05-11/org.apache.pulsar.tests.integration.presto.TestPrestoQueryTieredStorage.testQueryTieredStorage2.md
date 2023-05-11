        
Flaky-test: org.apache.pulsar.tests.integration.presto.TestPrestoQueryTieredStorage.testQueryTieredStorage2
Number of failures: 1

org.apache.pulsar.tests.integration.presto.TestPrestoQueryTieredStorage is flaky. The testQueryTieredStorage2 test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.tests.integration.presto.TestPulsarSQLBase null within 15 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.tests.integration.presto.TestPulsarSQLBase.validateData(TestPulsarSQLBase.java:184)
	at org.apache.pulsar.tests.integration.presto.TestPulsarSQLBase.pulsarSQLBasicTest(TestPulsarSQLBase.java:70)
	at org.apache.pulsar.tests.integration.presto.TestPrestoQueryTieredStorage.testQueryTieredStorage2(TestPrestoQueryTieredStorage.java:126)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-05-07T02:08:58.5234089Z](https://github.com/apache/pulsar/actions/runs/4901334931/jobs/8757747103#step:12:20556)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.tests.integration.presto.TestPulsarSQLBase null within 15 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.tests.integration.presto.TestPulsarSQLBase.validateData(TestPulsarSQLBase.java:184)
	at org.apache.pulsar.tests.integration.presto.TestPulsarSQLBase.pulsarSQLBasicTest(TestPulsarSQLBase.java:70)
	at org.apache.pulsar.tests.integration.presto.TestPrestoQueryTieredStorage.testQueryTieredStorage2(TestPrestoQueryTieredStorage.java:126)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.FutureTask.get(FutureTask.java:204)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:101)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:81)
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	... 19 more

</pre></code>
</details>

