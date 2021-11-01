        
Flaky-test: org.apache.pulsar.broker.admin.TopicPoliciesTest.testGetSubscribeRateApplied
Number of failures: 22

org.apache.pulsar.broker.admin.TopicPoliciesTest is flaky. The testGetSubscribeRateApplied test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.broker.admin.TopicPoliciesTest null within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.broker.admin.TopicPoliciesTest.testGetSubscribeRateApplied(TopicPoliciesTest.java:1621)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T16:03:46.7879907Z](https://github.com/apache/pulsar/runs/3896418757?check_suite_focus=true?check_suite_focus=true#step:9:1902)
[example failure 2021-10-14T15:48:36.5322252Z](https://github.com/apache/pulsar/runs/3896418757?check_suite_focus=true?check_suite_focus=true#step:9:1042)
[example failure 2021-10-14T08:24:13.6525449Z](https://github.com/apache/pulsar/runs/3892043531?check_suite_focus=true?check_suite_focus=true#step:9:240)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.broker.admin.TopicPoliciesTest null within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.broker.admin.TopicPoliciesTest.testGetSubscribeRateApplied(TopicPoliciesTest.java:1621)
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
	at org.apache.pulsar.broker.admin.TopicPoliciesTest.testGetSubscribeRateApplied(TopicPoliciesTest.java:1619)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-15T02:19:27.0215286Z](https://github.com/apache/pulsar/runs/3901661442?check_suite_focus=true?check_suite_focus=true#step:9:208)
[example failure 2021-10-14T16:27:46.9097340Z](https://github.com/apache/pulsar/runs/3897028014?check_suite_focus=true?check_suite_focus=true#step:9:248)
[example failure 2021-10-14T15:13:55.4628032Z](https://github.com/apache/pulsar/runs/3895861830?check_suite_focus=true?check_suite_focus=true#step:9:4898)
[example failure 2021-10-14T15:00:27.2123819Z](https://github.com/apache/pulsar/runs/3895861830?check_suite_focus=true?check_suite_focus=true#step:9:1076)
[example failure 2021-10-14T01:51:03.6807973Z](https://github.com/apache/pulsar/runs/3889477087?check_suite_focus=true?check_suite_focus=true#step:9:2568)
[example failure 2021-10-13T14:01:50.2310494Z](https://github.com/apache/pulsar/runs/3882965931?check_suite_focus=true?check_suite_focus=true#step:9:7169)
[example failure 2021-10-13T13:35:05.0336883Z](https://github.com/apache/pulsar/runs/3882965931?check_suite_focus=true?check_suite_focus=true#step:9:260)
[example failure 2021-10-13T06:05:47.4866190Z](https://github.com/apache/pulsar/runs/3878891779?check_suite_focus=true?check_suite_focus=true#step:9:252)
[example failure 2021-10-13T05:21:19.6263680Z](https://github.com/apache/pulsar/runs/3878517864?check_suite_focus=true?check_suite_focus=true#step:9:2520)
[example failure 2021-10-12T09:40:42.8479434Z](https://github.com/apache/pulsar/runs/3868468858?check_suite_focus=true?check_suite_focus=true#step:9:4150)
[example failure 2021-10-11T20:17:44.1875761Z](https://github.com/apache/pulsar/runs/3863161653?check_suite_focus=true?check_suite_focus=true#step:9:4457)
[example failure 2021-10-10T07:37:01.0405602Z](https://github.com/apache/pulsar/runs/3850227525?check_suite_focus=true?check_suite_focus=true#step:9:4346)
[example failure 2021-10-10T02:30:55.3490364Z](https://github.com/apache/pulsar/runs/3849202717?check_suite_focus=true?check_suite_focus=true#step:9:3629)
[example failure 2021-10-09T10:50:10.3839106Z](https://github.com/apache/pulsar/runs/3846135669?check_suite_focus=true?check_suite_focus=true#step:9:252)
[example failure 2021-10-09T06:46:42.6445568Z](https://github.com/apache/pulsar/runs/3845303776?check_suite_focus=true?check_suite_focus=true#step:9:226)
[example failure 2021-10-09T01:25:50.0123031Z](https://github.com/apache/pulsar/runs/3844189021?check_suite_focus=true?check_suite_focus=true#step:9:210)
[example failure 2021-10-08T20:24:00.6341120Z](https://github.com/apache/pulsar/runs/3842296785?check_suite_focus=true?check_suite_focus=true#step:9:8659)
[example failure 2021-10-08T13:06:54.6313587Z](https://github.com/apache/pulsar/runs/3838573672?check_suite_focus=true?check_suite_focus=true#step:9:4387)
[example failure 2021-10-07T15:21:57.9660234Z](https://github.com/apache/pulsar/runs/3828444600?check_suite_focus=true?check_suite_focus=true#step:9:5310)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.broker.admin.TopicPoliciesTest null within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.broker.admin.TopicPoliciesTest.testGetSubscribeRateApplied(TopicPoliciesTest.java:1619)
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

