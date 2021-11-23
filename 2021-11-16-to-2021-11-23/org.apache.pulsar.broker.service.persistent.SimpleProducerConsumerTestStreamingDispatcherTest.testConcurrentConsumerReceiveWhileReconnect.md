        
Flaky-test: org.apache.pulsar.broker.service.persistent.SimpleProducerConsumerTestStreamingDispatcherTest.testConcurrentConsumerReceiveWhileReconnect
Number of failures: 28

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
[example failure 2021-11-22T09:17:08.4695366Z](https://github.com/apache/pulsar/runs/4284014543?check_suite_focus=true?check_suite_focus=true#step:9:894)
[example failure 2021-11-21T03:48:48.9505301Z](https://github.com/apache/pulsar/runs/4276524230?check_suite_focus=true?check_suite_focus=true#step:9:263)
[example failure 2021-11-20T15:22:10.3381968Z](https://github.com/apache/pulsar/runs/4273902089?check_suite_focus=true?check_suite_focus=true#step:9:810)
[example failure 2021-11-19T20:49:30.0423967Z](https://github.com/apache/pulsar/runs/4269009977?check_suite_focus=true?check_suite_focus=true#step:9:263)
[example failure 2021-11-19T18:35:28.6077855Z](https://github.com/apache/pulsar/runs/4267806531?check_suite_focus=true?check_suite_focus=true#step:9:894)
[example failure 2021-11-19T14:40:38.0270289Z](https://github.com/apache/pulsar/runs/4265349892?check_suite_focus=true?check_suite_focus=true#step:9:263)
[example failure 2021-11-19T08:57:37.3353344Z](https://github.com/apache/pulsar/runs/4262032089?check_suite_focus=true?check_suite_focus=true#step:9:892)
[example failure 2021-11-19T03:06:27.4194388Z](https://github.com/apache/pulsar/runs/4259782607?check_suite_focus=true?check_suite_focus=true#step:9:896)
[example failure 2021-11-18T19:28:35.1277750Z](https://github.com/apache/pulsar/runs/4255938036?check_suite_focus=true?check_suite_focus=true#step:9:892)
[example failure 2021-11-18T18:15:02.9687770Z](https://github.com/apache/pulsar/runs/4255135606?check_suite_focus=true?check_suite_focus=true#step:9:263)
[example failure 2021-11-18T15:45:37.2063748Z](https://github.com/apache/pulsar/runs/4253422122?check_suite_focus=true?check_suite_focus=true#step:9:808)
[example failure 2021-11-18T15:23:47.5651687Z](https://github.com/apache/pulsar/runs/4253132939?check_suite_focus=true?check_suite_focus=true#step:9:896)
[example failure 2021-11-18T14:52:08.2398519Z](https://github.com/apache/pulsar/runs/4252741387?check_suite_focus=true?check_suite_focus=true#step:9:263)
[example failure 2021-11-18T13:41:09.8164248Z](https://github.com/apache/pulsar/runs/4251894101?check_suite_focus=true?check_suite_focus=true#step:9:263)
[example failure 2021-11-18T13:10:14.7995903Z](https://github.com/apache/pulsar/runs/4251567744?check_suite_focus=true?check_suite_focus=true#step:9:263)
[example failure 2021-11-18T12:08:42.9622943Z](https://github.com/apache/pulsar/runs/4250910575?check_suite_focus=true?check_suite_focus=true#step:9:263)
[example failure 2021-11-18T11:44:42.3371887Z](https://github.com/apache/pulsar/runs/4250703767?check_suite_focus=true?check_suite_focus=true#step:9:808)
[example failure 2021-11-18T09:29:34.3867740Z](https://github.com/apache/pulsar/runs/4249214270?check_suite_focus=true?check_suite_focus=true#step:9:263)


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
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testConcurrentConsumerReceiveWhileReconnect(SimpleProducerConsumerTest.java:782)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-22T12:12:21.8398978Z](https://github.com/apache/pulsar/runs/4286190786?check_suite_focus=true?check_suite_focus=true#step:9:744)
[example failure 2021-11-22T11:38:42.3954744Z](https://github.com/apache/pulsar/runs/4285858767?check_suite_focus=true?check_suite_focus=true#step:9:744)
[example failure 2021-11-22T10:55:16.2287156Z](https://github.com/apache/pulsar/runs/4285386039?check_suite_focus=true?check_suite_focus=true#step:9:744)
[example failure 2021-11-22T10:27:13.0898458Z](https://github.com/apache/pulsar/runs/4285064651?check_suite_focus=true?check_suite_focus=true#step:9:816)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.client.api.SimpleProducerConsumerTest that uses org.apache.pulsar.client.impl.ConsumerImpl expected [10] but found [0] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testConcurrentConsumerReceiveWhileReconnect(SimpleProducerConsumerTest.java:782)
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
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.lambda$testConcurrentConsumerReceiveWhileReconnect$2(SimpleProducerConsumerTest.java:784)
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
[example failure 2021-11-23T07:11:52.3909911Z](https://github.com/apache/pulsar/runs/4296072720?check_suite_focus=true?check_suite_focus=true#step:9:263)
[example failure 2021-11-22T10:21:37.5872452Z](https://github.com/apache/pulsar/runs/4284726558?check_suite_focus=true?check_suite_focus=true#step:9:894)
[example failure 2021-11-22T02:29:18.6745806Z](https://github.com/apache/pulsar/runs/4281697313?check_suite_focus=true?check_suite_focus=true#step:9:263)
[example failure 2021-11-18T16:29:12.5428346Z](https://github.com/apache/pulsar/runs/4253966591?check_suite_focus=true?check_suite_focus=true#step:9:263)


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
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.client.api.SimpleProducerConsumerTest that uses org.apache.pulsar.client.impl.ConsumerImpl expected [10] but found [2] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testConcurrentConsumerReceiveWhileReconnect(SimpleProducerConsumerTest.java:786)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-19T19:57:38.5094007Z](https://github.com/apache/pulsar/runs/4268539104?check_suite_focus=true?check_suite_focus=true#step:9:810)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.client.api.SimpleProducerConsumerTest that uses org.apache.pulsar.client.impl.ConsumerImpl expected [10] but found [2] within 10 seconds.
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
Caused by: java.lang.AssertionError: expected [10] but found [2]
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
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testConcurrentConsumerReceiveWhileReconnect(SimpleProducerConsumerTest.java:830)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-22T09:39:58.6174086Z](https://github.com/apache/pulsar/runs/4284301214?check_suite_focus=true?check_suite_focus=true#step:9:816)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.client.api.SimpleProducerConsumerTest that uses org.apache.pulsar.client.impl.ConsumerImpl expected [10] but found [0] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testConcurrentConsumerReceiveWhileReconnect(SimpleProducerConsumerTest.java:830)
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
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.lambda$testConcurrentConsumerReceiveWhileReconnect$7(SimpleProducerConsumerTest.java:832)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:222)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:209)
	... 4 more

</pre></code>
</details>

