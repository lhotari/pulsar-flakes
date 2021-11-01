        
Flaky-test: org.apache.pulsar.broker.admin.TopicPoliciesTest.testPolicyOverwrittenByNamespaceLevel
Number of failures: 5

org.apache.pulsar.broker.admin.TopicPoliciesTest is flaky. The testPolicyOverwrittenByNamespaceLevel test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.broker.admin.TopicPoliciesTest null within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.broker.admin.TopicPoliciesTest.testPolicyOverwrittenByNamespaceLevel(TopicPoliciesTest.java:1034)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-13T16:15:32.7802251Z](https://github.com/apache/pulsar/runs/3884836524?check_suite_focus=true?check_suite_focus=true#step:9:282)
[example failure 2021-10-13T13:49:39.1496991Z](https://github.com/apache/pulsar/runs/3882965931?check_suite_focus=true?check_suite_focus=true#step:9:3639)
[example failure 2021-10-12T09:58:16.6484585Z](https://github.com/apache/pulsar/runs/3868468858?check_suite_focus=true?check_suite_focus=true#step:9:8194)
[example failure 2021-10-07T21:13:04.3963728Z](https://github.com/apache/pulsar/runs/3831980230?check_suite_focus=true?check_suite_focus=true#step:9:1108)
[example failure 2021-10-07T10:03:28.8698729Z](https://github.com/apache/pulsar/runs/3825224562?check_suite_focus=true?check_suite_focus=true#step:9:5706)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.broker.admin.TopicPoliciesTest null within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.broker.admin.TopicPoliciesTest.testPolicyOverwrittenByNamespaceLevel(TopicPoliciesTest.java:1034)
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
	... 17 more

</pre></code>
</details>

