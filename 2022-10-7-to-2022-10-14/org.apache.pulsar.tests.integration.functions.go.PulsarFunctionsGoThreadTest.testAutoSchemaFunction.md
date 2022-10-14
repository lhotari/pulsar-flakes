        
Flaky-test: org.apache.pulsar.tests.integration.functions.go.PulsarFunctionsGoThreadTest.testAutoSchemaFunction
Number of failures: 1

org.apache.pulsar.tests.integration.functions.go.PulsarFunctionsGoThreadTest is flaky. The testAutoSchemaFunction test method fails sporadically.

```
org.apache.pulsar.client.api.PulsarClientException$IncompatibleSchemaException: {"errorMsg":"Topic does not have schema to check","reqId":2136069200936963157, "remote":"localhost/127.0.0.1:49175", "local":"/127.0.0.1:47562"}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1014)
	at org.apache.pulsar.client.impl.ConsumerBuilderImpl.subscribe(ConsumerBuilderImpl.java:104)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.ensureSubscriptionCreated(PulsarFunctionsTest.java:936)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.submitFunction(PulsarFunctionsTest.java:859)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.submitFunction(PulsarFunctionsTest.java:796)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.submitFunction(PulsarFunctionsTest.java:786)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testAutoSchemaFunction(PulsarFunctionsTest.java:1272)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-08-31T08:47:42.8536998Z](https://github.com/apache/pulsar/runs/8109128978?check_suite_focus=true#step:11:7896)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$IncompatibleSchemaException: {"errorMsg":"Topic does not have schema to check","reqId":2136069200936963157, "remote":"localhost/127.0.0.1:49175", "local":"/127.0.0.1:47562"}
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1014)
	at org.apache.pulsar.client.impl.ConsumerBuilderImpl.subscribe(ConsumerBuilderImpl.java:104)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.ensureSubscriptionCreated(PulsarFunctionsTest.java:936)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.submitFunction(PulsarFunctionsTest.java:859)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.submitFunction(PulsarFunctionsTest.java:796)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.submitFunction(PulsarFunctionsTest.java:786)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testAutoSchemaFunction(PulsarFunctionsTest.java:1272)
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

