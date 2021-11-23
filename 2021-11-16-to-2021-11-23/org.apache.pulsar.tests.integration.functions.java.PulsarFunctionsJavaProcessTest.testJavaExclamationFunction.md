        
Flaky-test: org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaProcessTest.testJavaExclamationFunction
Number of failures: 2

org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaProcessTest is flaky. The testJavaExclamationFunction test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest null within 15 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.getFunctionStatus(PulsarFunctionsTest.java:1091)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testExclamationFunction(PulsarFunctionsTest.java:724)
	at org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testJavaExclamationFunction(PulsarFunctionsJavaTest.java:101)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-22T03:25:04.4541755Z](https://github.com/apache/pulsar/runs/4281697423?check_suite_focus=true?check_suite_focus=true#step:13:103355)
[example failure 2021-11-22T03:15:26.9209998Z](https://github.com/apache/pulsar/runs/4281697423?check_suite_focus=true?check_suite_focus=true#step:13:51811)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest null within 15 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.getFunctionStatus(PulsarFunctionsTest.java:1091)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testExclamationFunction(PulsarFunctionsTest.java:724)
	at org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testJavaExclamationFunction(PulsarFunctionsJavaTest.java:101)
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

</pre></code>
</details>

