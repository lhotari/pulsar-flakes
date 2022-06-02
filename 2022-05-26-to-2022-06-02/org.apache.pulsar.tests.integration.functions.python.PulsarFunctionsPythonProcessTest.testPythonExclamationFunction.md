        
Flaky-test: org.apache.pulsar.tests.integration.functions.python.PulsarFunctionsPythonProcessTest.testPythonExclamationFunction
Number of failures: 8

org.apache.pulsar.tests.integration.functions.python.PulsarFunctionsPythonProcessTest is flaky. The testPythonExclamationFunction test method fails sporadically.

```
java.lang.NullPointerException
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.publishAndConsumeMessagesBytes(PulsarFunctionsTest.java:1237)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testExclamationFunction(PulsarFunctionsTest.java:711)
	at org.apache.pulsar.tests.integration.functions.python.PulsarFunctionsPythonTest.testPythonExclamationFunction(PulsarFunctionsPythonTest.java:49)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-05-26T14:48:14.7219900Z](https://github.com/apache/pulsar/runs/6610163053?check_suite_focus=true#step:13:35514)  
[example failure 2022-05-26T14:31:55.2775165Z](https://github.com/apache/pulsar/runs/6610163053?check_suite_focus=true#step:13:23582)  
[example failure 2022-05-26T14:15:37.4274762Z](https://github.com/apache/pulsar/runs/6610163053?check_suite_focus=true#step:13:11725)  
[example failure 2022-05-26T12:15:48.8538171Z](https://github.com/apache/pulsar/runs/6608184441?check_suite_focus=true#step:13:35713)  
[example failure 2022-05-26T11:58:47.4454589Z](https://github.com/apache/pulsar/runs/6608184441?check_suite_focus=true#step:13:23872)  
[example failure 2022-05-26T11:41:24.0894744Z](https://github.com/apache/pulsar/runs/6608184441?check_suite_focus=true#step:13:11744)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.publishAndConsumeMessagesBytes(PulsarFunctionsTest.java:1237)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testExclamationFunction(PulsarFunctionsTest.java:711)
	at org.apache.pulsar.tests.integration.functions.python.PulsarFunctionsPythonTest.testPythonExclamationFunction(PulsarFunctionsPythonTest.java:49)
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

```
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.api.Message.getValue()" because "msg" is null
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.publishAndConsumeMessagesBytes(PulsarFunctionsTest.java:1239)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testExclamationFunction(PulsarFunctionsTest.java:713)
	at org.apache.pulsar.tests.integration.functions.python.PulsarFunctionsPythonTest.testPythonExclamationFunction(PulsarFunctionsPythonTest.java:49)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-05-31T00:04:14.8400235Z](https://github.com/apache/pulsar/runs/6662114544?check_suite_focus=true#step:11:41921)  
[example failure 2022-05-30T23:40:36.8271909Z](https://github.com/apache/pulsar/runs/6662114544?check_suite_focus=true#step:11:23781)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.api.Message.getValue()" because "msg" is null
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.publishAndConsumeMessagesBytes(PulsarFunctionsTest.java:1239)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testExclamationFunction(PulsarFunctionsTest.java:713)
	at org.apache.pulsar.tests.integration.functions.python.PulsarFunctionsPythonTest.testPythonExclamationFunction(PulsarFunctionsPythonTest.java:49)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

