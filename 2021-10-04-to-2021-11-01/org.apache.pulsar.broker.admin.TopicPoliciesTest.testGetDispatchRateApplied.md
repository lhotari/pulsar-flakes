        
Flaky-test: org.apache.pulsar.broker.admin.TopicPoliciesTest.testGetDispatchRateApplied
Number of failures: 38

org.apache.pulsar.broker.admin.TopicPoliciesTest is flaky. The testGetDispatchRateApplied test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.broker.admin.TopicPoliciesTest null within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.broker.admin.TopicPoliciesTest.testGetDispatchRateApplied(TopicPoliciesTest.java:808)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-15T01:27:32.1201103Z](https://github.com/apache/pulsar/runs/3901311361?check_suite_focus=true?check_suite_focus=true#step:9:4178)
[example failure 2021-10-14T12:53:30.4897943Z](https://github.com/apache/pulsar/runs/3894480721?check_suite_focus=true?check_suite_focus=true#step:9:4231)
[example failure 2021-10-14T09:43:49.2298615Z](https://github.com/apache/pulsar/runs/3892561604?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-13T23:48:07.0496572Z](https://github.com/apache/pulsar/runs/3888853715?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-13T16:22:51.0598182Z](https://github.com/apache/pulsar/runs/3884678567?check_suite_focus=true?check_suite_focus=true#step:9:8394)
[example failure 2021-10-13T16:09:26.7895818Z](https://github.com/apache/pulsar/runs/3884678567?check_suite_focus=true?check_suite_focus=true#step:9:4388)
[example failure 2021-10-13T15:56:13.4274281Z](https://github.com/apache/pulsar/runs/3884678567?check_suite_focus=true?check_suite_focus=true#step:9:196)
[example failure 2021-10-13T15:10:41.9072869Z](https://github.com/apache/pulsar/runs/3884143127?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-13T15:04:31.8107063Z](https://github.com/apache/pulsar/runs/3884072644?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-13T07:41:01.5084056Z](https://github.com/apache/pulsar/runs/3879303280?check_suite_focus=true?check_suite_focus=true#step:9:5922)
[example failure 2021-10-13T07:27:24.8656004Z](https://github.com/apache/pulsar/runs/3879303280?check_suite_focus=true?check_suite_focus=true#step:9:1710)
[example failure 2021-10-12T14:42:06.6005314Z](https://github.com/apache/pulsar/runs/3871545411?check_suite_focus=true?check_suite_focus=true#step:9:4427)
[example failure 2021-10-12T13:31:32.7764964Z](https://github.com/apache/pulsar/runs/3870600532?check_suite_focus=true?check_suite_focus=true#step:9:8507)
[example failure 2021-10-12T06:47:15.4823475Z](https://github.com/apache/pulsar/runs/3866940285?check_suite_focus=true?check_suite_focus=true#step:9:8598)
[example failure 2021-10-12T06:21:09.0197709Z](https://github.com/apache/pulsar/runs/3866940285?check_suite_focus=true?check_suite_focus=true#step:9:200)
[example failure 2021-10-12T05:23:09.9324358Z](https://github.com/apache/pulsar/runs/3866428402?check_suite_focus=true?check_suite_focus=true#step:9:8547)
[example failure 2021-10-11T02:19:33.4705299Z](https://github.com/apache/pulsar/runs/3854364389?check_suite_focus=true?check_suite_focus=true#step:9:8558)
[example failure 2021-10-11T02:06:18.7950123Z](https://github.com/apache/pulsar/runs/3854364389?check_suite_focus=true?check_suite_focus=true#step:9:4371)
[example failure 2021-10-11T01:59:04.8630922Z](https://github.com/apache/pulsar/runs/3854395704?check_suite_focus=true?check_suite_focus=true#step:9:196)
[example failure 2021-10-11T01:52:33.2637167Z](https://github.com/apache/pulsar/runs/3854364389?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-10T07:21:24.6190088Z](https://github.com/apache/pulsar/runs/3850227525?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-10T03:16:14.8669738Z](https://github.com/apache/pulsar/runs/3849391168?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-09T01:37:57.7022451Z](https://github.com/apache/pulsar/runs/3844243865?check_suite_focus=true?check_suite_focus=true#step:9:196)
[example failure 2021-10-08T19:52:14.3877232Z](https://github.com/apache/pulsar/runs/3842296785?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-08T12:52:07.3894998Z](https://github.com/apache/pulsar/runs/3838573672?check_suite_focus=true?check_suite_focus=true#step:9:204)
[example failure 2021-10-08T11:11:00.7855382Z](https://github.com/apache/pulsar/runs/3837385360?check_suite_focus=true?check_suite_focus=true#step:9:6645)
[example failure 2021-10-08T10:32:53.0467398Z](https://github.com/apache/pulsar/runs/3837385360?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-08T09:33:56.6384565Z](https://github.com/apache/pulsar/runs/3836704105?check_suite_focus=true?check_suite_focus=true#step:9:4186)
[example failure 2021-10-08T07:24:30.0859682Z](https://github.com/apache/pulsar/runs/3835764387?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-08T00:09:23.8095588Z](https://github.com/apache/pulsar/runs/3833183138?check_suite_focus=true?check_suite_focus=true#step:9:2459)
[example failure 2021-10-07T21:18:59.5155102Z](https://github.com/apache/pulsar/runs/3832187000?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-07T21:04:15.9554055Z](https://github.com/apache/pulsar/runs/3832038782?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-07T20:38:42.8685813Z](https://github.com/apache/pulsar/runs/3831586669?check_suite_focus=true?check_suite_focus=true#step:9:5233)
[example failure 2021-10-07T20:24:31.8783448Z](https://github.com/apache/pulsar/runs/3831586669?check_suite_focus=true?check_suite_focus=true#step:9:1016)
[example failure 2021-10-07T20:10:14.8348869Z](https://github.com/apache/pulsar/runs/3831586669?check_suite_focus=true?check_suite_focus=true#step:9:194)
[example failure 2021-10-05T08:34:10.8338629Z](https://github.com/apache/pulsar/runs/3800698763?check_suite_focus=true?check_suite_focus=true#step:9:3248)
[example failure 2021-10-05T07:36:16.2661270Z](https://github.com/apache/pulsar/runs/3800317380?check_suite_focus=true?check_suite_focus=true#step:9:6397)
[example failure 2021-10-05T04:49:42.9938261Z](https://github.com/apache/pulsar/runs/3799300996?check_suite_focus=true?check_suite_focus=true#step:9:724)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.broker.admin.TopicPoliciesTest null within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.broker.admin.TopicPoliciesTest.testGetDispatchRateApplied(TopicPoliciesTest.java:808)
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

