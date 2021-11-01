        
Flaky-test: org.apache.pulsar.broker.service.persistent.SimpleProducerConsumerTestStreamingDispatcherTest.testConcurrentConsumerReceiveWhileReconnect
Number of failures: 48

org.apache.pulsar.broker.service.persistent.SimpleProducerConsumerTestStreamingDispatcherTest is flaky. The testConcurrentConsumerReceiveWhileReconnect test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.client.api.SimpleProducerConsumerTest that uses org.apache.pulsar.client.impl.ConsumerImpl expected [10] but found [0] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testConcurrentConsumerReceiveWhileReconnect(SimpleProducerConsumerTest.java:786)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-30T12:06:40.2425834Z](https://github.com/apache/pulsar/runs/4054904881?check_suite_focus=true?check_suite_focus=true#step:9:429)
[example failure 2021-10-29T23:45:48.2596229Z](https://github.com/apache/pulsar/runs/4052232273?check_suite_focus=true?check_suite_focus=true#step:9:429)
[example failure 2021-10-29T15:38:44.0798601Z](https://github.com/apache/pulsar/runs/4048378672?check_suite_focus=true?check_suite_focus=true#step:9:429)
[example failure 2021-10-28T17:49:17.5389657Z](https://github.com/apache/pulsar/runs/4037997436?check_suite_focus=true?check_suite_focus=true#step:9:429)
[example failure 2021-10-27T01:01:06.9701788Z](https://github.com/apache/pulsar/runs/4016762268?check_suite_focus=true?check_suite_focus=true#step:9:794)
[example failure 2021-10-26T10:43:05.4967669Z](https://github.com/apache/pulsar/runs/4008473683?check_suite_focus=true?check_suite_focus=true#step:9:862)
[example failure 2021-10-26T01:14:27.7057253Z](https://github.com/apache/pulsar/runs/4004188537?check_suite_focus=true?check_suite_focus=true#step:9:794)
[example failure 2021-10-26T01:09:17.7316916Z](https://github.com/apache/pulsar/runs/4004149676?check_suite_focus=true?check_suite_focus=true#step:9:429)
[example failure 2021-10-25T15:09:45.7054027Z](https://github.com/apache/pulsar/runs/3998605619?check_suite_focus=true?check_suite_focus=true#step:9:429)
[example failure 2021-10-24T14:30:52.4400585Z](https://github.com/apache/pulsar/runs/3989262029?check_suite_focus=true?check_suite_focus=true#step:9:794)
[example failure 2021-10-24T13:36:58.2375039Z](https://github.com/apache/pulsar/runs/3989058071?check_suite_focus=true?check_suite_focus=true#step:9:429)
[example failure 2021-10-22T08:46:13.7214976Z](https://github.com/apache/pulsar/runs/3973602196?check_suite_focus=true?check_suite_focus=true#step:9:429)
[example failure 2021-10-22T05:54:34.8118078Z](https://github.com/apache/pulsar/runs/3972294522?check_suite_focus=true?check_suite_focus=true#step:9:794)
[example failure 2021-10-22T02:18:21.6671831Z](https://github.com/apache/pulsar/runs/3971119685?check_suite_focus=true?check_suite_focus=true#step:9:429)
[example failure 2021-10-21T04:47:00.5255925Z](https://github.com/apache/pulsar/runs/3959780441?check_suite_focus=true?check_suite_focus=true#step:9:429)
[example failure 2021-10-20T07:56:14.9942985Z](https://github.com/apache/pulsar/runs/3948723858?check_suite_focus=true?check_suite_focus=true#step:9:794)
[example failure 2021-10-20T04:17:37.6879323Z](https://github.com/apache/pulsar/runs/3947247899?check_suite_focus=true?check_suite_focus=true#step:9:429)
[example failure 2021-10-20T01:39:23.1777667Z](https://github.com/apache/pulsar/runs/3946371460?check_suite_focus=true?check_suite_focus=true#step:9:862)
[example failure 2021-10-19T11:34:16.0076524Z](https://github.com/apache/pulsar/runs/3938419363?check_suite_focus=true?check_suite_focus=true#step:9:794)
[example failure 2021-10-19T07:44:24.9673921Z](https://github.com/apache/pulsar/runs/3936090549?check_suite_focus=true?check_suite_focus=true#step:9:429)
[example failure 2021-10-19T07:24:21.5047615Z](https://github.com/apache/pulsar/runs/3935901205?check_suite_focus=true?check_suite_focus=true#step:9:794)
[example failure 2021-10-18T22:09:09.4141825Z](https://github.com/apache/pulsar/runs/3932392486?check_suite_focus=true?check_suite_focus=true#step:9:794)
[example failure 2021-10-18T06:14:46.7745691Z](https://github.com/apache/pulsar/runs/3923005897?check_suite_focus=true?check_suite_focus=true#step:9:429)
[example failure 2021-10-17T07:47:24.9611988Z](https://github.com/apache/pulsar/runs/3917749472?check_suite_focus=true?check_suite_focus=true#step:9:794)
[example failure 2021-10-15T10:53:38.0853581Z](https://github.com/apache/pulsar/runs/3905107650?check_suite_focus=true?check_suite_focus=true#step:9:429)
[example failure 2021-10-15T02:40:32.2245701Z](https://github.com/apache/pulsar/runs/3901845693?check_suite_focus=true?check_suite_focus=true#step:9:429)
[example failure 2021-10-15T01:39:52.2701736Z](https://github.com/apache/pulsar/runs/3901517532?check_suite_focus=true?check_suite_focus=true#step:9:792)
[example failure 2021-10-14T21:26:08.2232514Z](https://github.com/apache/pulsar/runs/3899815109?check_suite_focus=true?check_suite_focus=true#step:9:429)
[example failure 2021-10-14T20:00:01.3025963Z](https://github.com/apache/pulsar/runs/3899065545?check_suite_focus=true?check_suite_focus=true#step:9:860)
[example failure 2021-10-14T15:25:27.5039553Z](https://github.com/apache/pulsar/runs/3896418193?check_suite_focus=true?check_suite_focus=true#step:9:429)
[example failure 2021-10-14T10:07:30.0989114Z](https://github.com/apache/pulsar/runs/3893041314?check_suite_focus=true?check_suite_focus=true#step:9:856)
[example failure 2021-10-14T02:19:17.3910052Z](https://github.com/apache/pulsar/runs/3889806188?check_suite_focus=true?check_suite_focus=true#step:9:425)
[example failure 2021-10-13T20:19:28.6017114Z](https://github.com/apache/pulsar/runs/3887306167?check_suite_focus=true?check_suite_focus=true#step:9:788)
[example failure 2021-10-13T13:24:32.4913867Z](https://github.com/apache/pulsar/runs/3882965793?check_suite_focus=true?check_suite_focus=true#step:9:788)
[example failure 2021-10-12T09:15:54.2470005Z](https://github.com/apache/pulsar/runs/3868468816?check_suite_focus=true?check_suite_focus=true#step:9:856)
[example failure 2021-10-12T02:38:52.2932061Z](https://github.com/apache/pulsar/runs/3865758930?check_suite_focus=true?check_suite_focus=true#step:9:425)
[example failure 2021-10-11T01:44:48.5204566Z](https://github.com/apache/pulsar/runs/3854364463?check_suite_focus=true?check_suite_focus=true#step:9:425)
[example failure 2021-10-08T15:01:57.6328534Z](https://github.com/apache/pulsar/runs/3839908944?check_suite_focus=true?check_suite_focus=true#step:9:856)
[example failure 2021-10-08T09:13:54.8529484Z](https://github.com/apache/pulsar/runs/3836736202?check_suite_focus=true?check_suite_focus=true#step:9:788)
[example failure 2021-10-08T07:12:30.1515049Z](https://github.com/apache/pulsar/runs/3835731054?check_suite_focus=true?check_suite_focus=true#step:9:425)
[example failure 2021-10-08T04:01:19.2403797Z](https://github.com/apache/pulsar/runs/3834640404?check_suite_focus=true?check_suite_focus=true#step:9:425)
[example failure 2021-10-07T20:56:38.3171766Z](https://github.com/apache/pulsar/runs/3832038876?check_suite_focus=true?check_suite_focus=true#step:9:856)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.client.api.SimpleProducerConsumerTest that uses org.apache.pulsar.client.impl.ConsumerImpl expected [10] but found [0] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testConcurrentConsumerReceiveWhileReconnect(SimpleProducerConsumerTest.java:786)
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
Caused by: java.lang.AssertionError: expected [10] but found [0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.lambda$testConcurrentConsumerReceiveWhileReconnect$4(SimpleProducerConsumerTest.java:788)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:222)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:209)
	... 4 more

</pre></code>
</details>

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.client.api.SimpleProducerConsumerTest that uses org.apache.pulsar.client.impl.ConsumerImpl expected [10] but found [0] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testConcurrentConsumerReceiveWhileReconnect(SimpleProducerConsumerTest.java:834)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-25T16:32:11.1874487Z](https://github.com/apache/pulsar/runs/3999590399?check_suite_focus=true?check_suite_focus=true#step:9:862)
[example failure 2021-10-20T19:06:01.8004138Z](https://github.com/apache/pulsar/runs/3955676720?check_suite_focus=true?check_suite_focus=true#step:9:429)
[example failure 2021-10-19T08:46:50.7990138Z](https://github.com/apache/pulsar/runs/3936710318?check_suite_focus=true?check_suite_focus=true#step:9:794)
[example failure 2021-10-18T02:15:20.0464603Z](https://github.com/apache/pulsar/runs/3921750858?check_suite_focus=true?check_suite_focus=true#step:9:429)
[example failure 2021-10-14T09:28:52.2651993Z](https://github.com/apache/pulsar/runs/3892561299?check_suite_focus=true?check_suite_focus=true#step:9:425)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.client.api.SimpleProducerConsumerTest that uses org.apache.pulsar.client.impl.ConsumerImpl expected [10] but found [0] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testConcurrentConsumerReceiveWhileReconnect(SimpleProducerConsumerTest.java:834)
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
Caused by: java.lang.AssertionError: expected [10] but found [0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.lambda$testConcurrentConsumerReceiveWhileReconnect$9(SimpleProducerConsumerTest.java:836)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:222)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:209)
	... 4 more

</pre></code>
</details>

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.client.api.SimpleProducerConsumerTest that uses org.apache.pulsar.client.impl.ConsumerImpl expected [0] but found [1] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testConcurrentConsumerReceiveWhileReconnect(SimpleProducerConsumerTest.java:816)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-25T03:09:35.9381116Z](https://github.com/apache/pulsar/runs/3992255636?check_suite_focus=true?check_suite_focus=true#step:9:429)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.client.api.SimpleProducerConsumerTest that uses org.apache.pulsar.client.impl.ConsumerImpl expected [0] but found [1] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testConcurrentConsumerReceiveWhileReconnect(SimpleProducerConsumerTest.java:816)
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
Caused by: java.lang.AssertionError: expected [0] but found [1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.lambda$testConcurrentConsumerReceiveWhileReconnect$7(SimpleProducerConsumerTest.java:818)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:222)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:209)
	... 4 more

</pre></code>
</details>

