        
Flaky-test: org.apache.pulsar.tests.integration.functions.PulsarFunctionsProcessTest.testJavaExclamationTopicPatternFunction
Number of failures: 48

org.apache.pulsar.tests.integration.functions.PulsarFunctionsProcessTest is flaky. The testJavaExclamationTopicPatternFunction test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest null within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testExclamationFunction(PulsarFunctionsTest.java:1646)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testJavaExclamationTopicPatternFunction(PulsarFunctionsTest.java:1564)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-22T15:22:02.3827296Z](https://github.com/apache/pulsar/runs/2166599627?check_suite_focus=true#step:12:39779)
[example failure 2021-03-22T15:05:28.8396350Z](https://github.com/apache/pulsar/runs/2166599627?check_suite_focus=true#step:12:19462)
[example failure 2021-03-21T15:26:39.8651934Z](https://github.com/apache/pulsar/runs/2159917312?check_suite_focus=true#step:12:60070)
[example failure 2021-03-21T15:10:03.9264746Z](https://github.com/apache/pulsar/runs/2159917312?check_suite_focus=true#step:12:40273)
[example failure 2021-03-20T16:08:19.6076776Z](https://github.com/apache/pulsar/runs/2155747532?check_suite_focus=true#step:13:39567)
[example failure 2021-03-20T14:38:46.0760849Z](https://github.com/apache/pulsar/runs/2155419526?check_suite_focus=true#step:13:60038)
[example failure 2021-03-20T14:04:56.9356982Z](https://github.com/apache/pulsar/runs/2155419526?check_suite_focus=true#step:13:19858)
[example failure 2021-03-20T09:02:41.9489484Z](https://github.com/apache/pulsar/runs/2154437752?check_suite_focus=true#step:13:58737)
[example failure 2021-03-20T08:45:51.0675315Z](https://github.com/apache/pulsar/runs/2154437752?check_suite_focus=true#step:13:39417)
[example failure 2021-03-20T08:29:13.6112032Z](https://github.com/apache/pulsar/runs/2154437752?check_suite_focus=true#step:13:19347)
[example failure 2021-03-20T02:50:41.6356494Z](https://github.com/apache/pulsar/runs/2153280066?check_suite_focus=true#step:13:60009)
[example failure 2021-03-20T02:32:10.2956457Z](https://github.com/apache/pulsar/runs/2153280066?check_suite_focus=true#step:13:40068)
[example failure 2021-03-19T18:25:14.8579958Z](https://github.com/apache/pulsar/runs/2150254851?check_suite_focus=true#step:13:45161)
[example failure 2021-03-19T18:08:20.5975203Z](https://github.com/apache/pulsar/runs/2150254851?check_suite_focus=true#step:13:25645)
[example failure 2021-03-18T23:31:13.0614791Z](https://github.com/apache/pulsar/runs/2142615119?check_suite_focus=true#step:13:118439)
[example failure 2021-03-17T23:43:11.2690510Z](https://github.com/apache/pulsar/runs/2134973171?check_suite_focus=true#step:13:38999)
[example failure 2021-03-17T23:26:26.4589274Z](https://github.com/apache/pulsar/runs/2134973171?check_suite_focus=true#step:13:19258)
[example failure 2021-03-17T04:31:37.2419989Z](https://github.com/apache/pulsar/runs/2127458264?check_suite_focus=true#step:13:19171)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest null within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testExclamationFunction(PulsarFunctionsTest.java:1646)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testJavaExclamationTopicPatternFunction(PulsarFunctionsTest.java:1564)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: java.util.concurrent.TimeoutException
	at java.util.concurrent.FutureTask.get(FutureTask.java:205)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:101)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:81)
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	... 18 more

</pre></code>
</details>

[example failure 2021-03-23T01:16:56.6875384Z](https://github.com/apache/pulsar/runs/2170893800?check_suite_focus=true#step:12:57998)
[example failure 2021-03-22T18:03:34.0276900Z](https://github.com/apache/pulsar/runs/2167270584?check_suite_focus=true#step:12:20168)
[example failure 2021-03-22T05:09:11.4044328Z](https://github.com/apache/pulsar/runs/2162901945?check_suite_focus=true#step:12:39945)
[example failure 2021-03-18T23:14:25.3250817Z](https://github.com/apache/pulsar/runs/2142615119?check_suite_focus=true#step:13:98526)
[example failure 2021-03-18T13:57:01.5718288Z](https://github.com/apache/pulsar/runs/2138106794?check_suite_focus=true#step:13:59162)
[example failure 2021-03-18T13:25:11.4582028Z](https://github.com/apache/pulsar/runs/2138106794?check_suite_focus=true#step:13:19410)
[example failure 2021-03-13T01:15:40.6829418Z](https://github.com/apache/pulsar/runs/2099584204?check_suite_focus=true#step:12:39878)
[example failure 2021-03-12T08:49:26.6649783Z](https://github.com/apache/pulsar/runs/2093101149?check_suite_focus=true#step:12:19698)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest null within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testExclamationFunction(PulsarFunctionsTest.java:1646)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testJavaExclamationTopicPatternFunction(PulsarFunctionsTest.java:1564)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
java.lang.NullPointerException
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.publishAndConsumeMessages(PulsarFunctionsTest.java:2084)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testExclamationFunction(PulsarFunctionsTest.java:1628)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testJavaExclamationTopicPatternFunction(PulsarFunctionsTest.java:1564)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-12T09:20:40.3938081Z](https://github.com/apache/pulsar/runs/2093101149?check_suite_focus=true#step:12:58597)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.publishAndConsumeMessages(PulsarFunctionsTest.java:2084)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testExclamationFunction(PulsarFunctionsTest.java:1628)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testJavaExclamationTopicPatternFunction(PulsarFunctionsTest.java:1564)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest expected [2] but found [1] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testExclamationFunction(PulsarFunctionsTest.java:1646)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testJavaExclamationTopicPatternFunction(PulsarFunctionsTest.java:1564)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-22T18:20:05.2976176Z](https://github.com/apache/pulsar/runs/2167270584?check_suite_focus=true#step:12:39952)
[example failure 2021-03-22T05:25:30.1594536Z](https://github.com/apache/pulsar/runs/2162901945?check_suite_focus=true#step:12:59387)
[example failure 2021-03-21T14:53:17.9712693Z](https://github.com/apache/pulsar/runs/2159917312?check_suite_focus=true#step:12:20480)
[example failure 2021-03-20T16:25:25.1987713Z](https://github.com/apache/pulsar/runs/2155747532?check_suite_focus=true#step:13:59652)
[example failure 2021-03-20T14:21:56.9247714Z](https://github.com/apache/pulsar/runs/2155419526?check_suite_focus=true#step:13:40406)
[example failure 2021-03-19T18:41:52.6395465Z](https://github.com/apache/pulsar/runs/2150254851?check_suite_focus=true#step:13:65672)
[example failure 2021-03-19T18:20:50.3007091Z](https://github.com/apache/pulsar/runs/2150398488?check_suite_focus=true#step:13:19809)
[example failure 2021-03-18T22:52:53.6482733Z](https://github.com/apache/pulsar/runs/2142615119?check_suite_focus=true#step:13:19693)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest expected [2] but found [1] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testExclamationFunction(PulsarFunctionsTest.java:1646)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testJavaExclamationTopicPatternFunction(PulsarFunctionsTest.java:1564)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: java.lang.AssertionError: expected [2] but found [1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.getFunctionStatus(PulsarFunctionsTest.java:2008)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.lambda$testExclamationFunction$9(PulsarFunctionsTest.java:1648)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:222)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:209)
	... 4 more

</pre></code>
</details>

[example failure 2021-03-22T23:37:48.7201393Z](https://github.com/apache/pulsar/runs/2170427551?check_suite_focus=true#step:12:40006)
[example failure 2021-03-22T23:22:18.7181910Z](https://github.com/apache/pulsar/runs/2170427551?check_suite_focus=true#step:12:20429)
[example failure 2021-03-22T12:48:44.1871171Z](https://github.com/apache/pulsar/runs/2165370460?check_suite_focus=true#step:12:18512)
[example failure 2021-03-22T04:51:43.6177165Z](https://github.com/apache/pulsar/runs/2162901945?check_suite_focus=true#step:12:18565)
[example failure 2021-03-21T16:37:14.3615943Z](https://github.com/apache/pulsar/runs/2160288992?check_suite_focus=true#step:12:18951)
[example failure 2021-03-19T21:43:59.3671558Z](https://github.com/apache/pulsar/runs/2151941960?check_suite_focus=true#step:13:18864)
[example failure 2021-03-17T05:36:17.1979702Z](https://github.com/apache/pulsar/runs/2127653434?check_suite_focus=true#step:13:18786)
[example failure 2021-03-16T19:37:36.9483757Z](https://github.com/apache/pulsar/runs/2122021298?check_suite_focus=true#step:13:20358)
[example failure 2021-03-13T01:00:31.2615491Z](https://github.com/apache/pulsar/runs/2099584204?check_suite_focus=true#step:12:20788)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest expected [2] but found [1] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testExclamationFunction(PulsarFunctionsTest.java:1646)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testJavaExclamationTopicPatternFunction(PulsarFunctionsTest.java:1564)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: java.util.concurrent.TimeoutException
	at java.util.concurrent.FutureTask.get(FutureTask.java:205)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:101)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:81)
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	... 18 more

</pre></code>
</details>

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest expected [2] but found [0] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testExclamationFunction(PulsarFunctionsTest.java:1646)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testJavaExclamationTopicPatternFunction(PulsarFunctionsTest.java:1564)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-20T15:50:51.3208974Z](https://github.com/apache/pulsar/runs/2155747532?check_suite_focus=true#step:13:19337)
[example failure 2021-03-20T02:15:34.7325321Z](https://github.com/apache/pulsar/runs/2153280066?check_suite_focus=true#step:13:20438)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest expected [2] but found [0] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testExclamationFunction(PulsarFunctionsTest.java:1646)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testJavaExclamationTopicPatternFunction(PulsarFunctionsTest.java:1564)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: java.lang.AssertionError: expected [2] but found [0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.getFunctionStatus(PulsarFunctionsTest.java:2008)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.lambda$testExclamationFunction$9(PulsarFunctionsTest.java:1648)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:222)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:209)
	... 4 more

</pre></code>
</details>

[example failure 2021-03-20T04:52:36.8598340Z](https://github.com/apache/pulsar/runs/2153840016?check_suite_focus=true#step:13:19097)
[example failure 2021-03-18T23:45:23.5392411Z](https://github.com/apache/pulsar/runs/2144027146?check_suite_focus=true#step:13:18786)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest expected [2] but found [0] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testExclamationFunction(PulsarFunctionsTest.java:1646)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testJavaExclamationTopicPatternFunction(PulsarFunctionsTest.java:1564)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: java.util.concurrent.TimeoutException
	at java.util.concurrent.FutureTask.get(FutureTask.java:205)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:101)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:81)
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	... 18 more

</pre></code>
</details>

