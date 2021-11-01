        
Flaky-test: org.apache.pulsar.broker.admin.TopicPoliciesTest.testGetSetSubscribeRate
Number of failures: 23

org.apache.pulsar.broker.admin.TopicPoliciesTest is flaky. The testGetSetSubscribeRate test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.broker.admin.TopicPoliciesTest null within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.broker.admin.TopicPoliciesTest.testGetSetSubscribeRate(TopicPoliciesTest.java:1562)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-15T01:15:26.9888397Z](https://github.com/apache/pulsar/runs/3901311361?check_suite_focus=true?check_suite_focus=true#step:9:210)
[example failure 2021-10-14T13:09:10.7023068Z](https://github.com/apache/pulsar/runs/3894480721?check_suite_focus=true?check_suite_focus=true#step:9:8455)
[example failure 2021-10-14T12:40:39.2236157Z](https://github.com/apache/pulsar/runs/3894480721?check_suite_focus=true?check_suite_focus=true#step:9:208)
[example failure 2021-10-14T11:30:39.9300968Z](https://github.com/apache/pulsar/runs/3893867850?check_suite_focus=true?check_suite_focus=true#step:9:210)
[example failure 2021-10-14T02:49:35.5174595Z](https://github.com/apache/pulsar/runs/3889924017?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-13T15:41:04.6950938Z](https://github.com/apache/pulsar/runs/3884143127?check_suite_focus=true?check_suite_focus=true#step:9:8651)
[example failure 2021-10-13T15:19:56.1346469Z](https://github.com/apache/pulsar/runs/3884072644?check_suite_focus=true?check_suite_focus=true#step:9:4402)
[example failure 2021-10-13T01:13:31.3296193Z](https://github.com/apache/pulsar/runs/3877217335?check_suite_focus=true?check_suite_focus=true#step:9:208)
[example failure 2021-10-12T13:19:30.6962014Z](https://github.com/apache/pulsar/runs/3870600532?check_suite_focus=true?check_suite_focus=true#step:9:4437)
[example failure 2021-10-12T09:25:57.8043452Z](https://github.com/apache/pulsar/runs/3868468858?check_suite_focus=true?check_suite_focus=true#step:9:208)
[example failure 2021-10-12T08:13:27.4207906Z](https://github.com/apache/pulsar/runs/3867503794?check_suite_focus=true?check_suite_focus=true#step:9:8478)
[example failure 2021-10-12T07:44:55.7615489Z](https://github.com/apache/pulsar/runs/3867503794?check_suite_focus=true?check_suite_focus=true#step:9:208)
[example failure 2021-10-12T05:09:19.8295002Z](https://github.com/apache/pulsar/runs/3866428402?check_suite_focus=true?check_suite_focus=true#step:9:4468)
[example failure 2021-10-11T20:30:56.2450079Z](https://github.com/apache/pulsar/runs/3863161653?check_suite_focus=true?check_suite_focus=true#step:9:8241)
[example failure 2021-10-10T04:26:04.9132326Z](https://github.com/apache/pulsar/runs/3849622519?check_suite_focus=true?check_suite_focus=true#step:9:210)
[example failure 2021-10-08T13:19:08.4951456Z](https://github.com/apache/pulsar/runs/3838573672?check_suite_focus=true?check_suite_focus=true#step:9:8194)
[example failure 2021-10-08T09:20:14.4647168Z](https://github.com/apache/pulsar/runs/3836704105?check_suite_focus=true?check_suite_focus=true#step:9:208)
[example failure 2021-10-08T05:19:43.2558889Z](https://github.com/apache/pulsar/runs/3834932992?check_suite_focus=true?check_suite_focus=true#step:9:4446)
[example failure 2021-10-05T06:26:06.4092623Z](https://github.com/apache/pulsar/runs/3799834745?check_suite_focus=true?check_suite_focus=true#step:9:773)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.broker.admin.TopicPoliciesTest null within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.broker.admin.TopicPoliciesTest.testGetSetSubscribeRate(TopicPoliciesTest.java:1562)
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

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.broker.admin.TopicPoliciesTest null within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.broker.admin.TopicPoliciesTest.testGetSetSubscribeRate(TopicPoliciesTest.java:1564)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-18T04:39:26.8858576Z](https://github.com/apache/pulsar/runs/3922446283?check_suite_focus=true?check_suite_focus=true#step:9:208)
[example failure 2021-10-15T07:35:30.8247768Z](https://github.com/apache/pulsar/runs/3903179100?check_suite_focus=true?check_suite_focus=true#step:9:8431)
[example failure 2021-10-15T07:21:33.7101544Z](https://github.com/apache/pulsar/runs/3903179100?check_suite_focus=true?check_suite_focus=true#step:9:4447)
[example failure 2021-10-15T01:34:41.9288919Z](https://github.com/apache/pulsar/runs/3901276867?check_suite_focus=true?check_suite_focus=true#step:9:1891)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.broker.admin.TopicPoliciesTest null within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.broker.admin.TopicPoliciesTest.testGetSetSubscribeRate(TopicPoliciesTest.java:1564)
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

