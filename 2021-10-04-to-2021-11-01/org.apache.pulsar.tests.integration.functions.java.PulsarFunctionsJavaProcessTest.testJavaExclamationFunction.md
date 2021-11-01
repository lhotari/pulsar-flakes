        
Flaky-test: org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaProcessTest.testJavaExclamationFunction
Number of failures: 8

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
[example failure 2021-10-30T12:50:24.5190627Z](https://github.com/apache/pulsar/runs/4054904869?check_suite_focus=true?check_suite_focus=true#step:13:11357)
[example failure 2021-10-25T17:27:12.9102700Z](https://github.com/apache/pulsar/runs/3999589903?check_suite_focus=true?check_suite_focus=true#step:13:15214)
[example failure 2021-10-25T17:09:01.6479765Z](https://github.com/apache/pulsar/runs/3999589903?check_suite_focus=true?check_suite_focus=true#step:13:5092)
[example failure 2021-10-25T04:07:34.0964624Z](https://github.com/apache/pulsar/runs/3992255544?check_suite_focus=true?check_suite_focus=true#step:13:14529)
[example failure 2021-10-25T03:48:28.7480245Z](https://github.com/apache/pulsar/runs/3992255544?check_suite_focus=true?check_suite_focus=true#step:13:4742)


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
Caused by: java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.FutureTask.get(FutureTask.java:204)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:101)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:81)
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	... 19 more

</pre></code>
</details>

[example failure 2021-10-27T01:37:16.1084293Z](https://github.com/apache/pulsar/runs/4016762363?check_suite_focus=true?check_suite_focus=true#step:13:5292)
[example failure 2021-10-25T17:18:05.1683238Z](https://github.com/apache/pulsar/runs/3999589903?check_suite_focus=true?check_suite_focus=true#step:13:10074)


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

[example failure 2021-10-25T03:57:54.7466089Z](https://github.com/apache/pulsar/runs/3992255544?check_suite_focus=true?check_suite_focus=true#step:13:9608)


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
Caused by: java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.FutureTask.get(FutureTask.java:204)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:101)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:81)
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:101)
	... 19 more

2021-10-25 03:57:54,654 - INFO  - [docker-java-stream-2083147610:DockerUtils$2@252] - DOCKER.exec(PulsarFunctionsJavaProcessTest-hgard-pulsar-functions-worker-process-rnjyp-1:/pulsar/bin/pulsar-admin functions status --tenant public --namespace default --name test-exclamation-fn-jzoyrvmb): STDOUT: {
  "numInstances" : 2,
  "numRunning" : 2,
  "instances" : [ {
    "instanceId" : 0,
    "status" : {
      "running" : true,
      "error" : "",
      "numRestarts" : 0,
      "numReceived" : 0,
      "numSuccessfullyProcessed" : 0,
      "numUserExceptions" : 0,
      "latestUserExceptions" : [ ],
      "numSystemExceptions" : 0,
      "latestSystemExceptions" : [ ],
      "averageLatency" : 0.0,
      "lastInvocationTime" : 0,
      "workerId" : "pulsar-functions-worker-process-rnjyp-1"
    }
  }, {
    "instanceId" : 1,
    "status" : {
      "running" : true,
      "error" : "",
      "numRestarts" : 0,
      "numReceived" : 0,
      "numSuccessfullyProcessed" : 0,
      "numUserExceptions" : 0,
      "latestUserExceptions" : [ ],
      "numSystemExceptions" : 0,
      "latestSystemExceptions" : [ ],
      "averageLatency" : 0.0,
      "lastInvocationTime" : 0,
      "workerId" : "pulsar-functions-worker-process-rnjyp-0"
    }
  } ]
}
2021-10-25 03:57:54,656 - INFO  - [docker-java-stream-2083147610:DockerUtils$2@252] - DOCKER.exec(PulsarFunctionsJavaProcessTest-hgard-pulsar-functions-worker-process-rnjyp-1:/pulsar/bin/pulsar-admin functions status --tenant public --namespace default --name test-exclamation-fn-jzoyrvmb): STDOUT:
</pre></code>
</details>

