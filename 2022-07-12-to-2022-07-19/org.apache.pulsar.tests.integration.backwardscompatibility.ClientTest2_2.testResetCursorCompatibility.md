        
Flaky-test: org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_2.testResetCursorCompatibility
Number of failures: 2

org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_2 is flaky. The testResetCursorCompatibility test method fails sporadically.

```
org.apache.pulsar.client.api.PulsarClientException$ConsumerBusyException: Exclusive consumer is already connected
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:946)
	at org.apache.pulsar.client.impl.ConsumerBuilderImpl.subscribe(ConsumerBuilderImpl.java:102)
	at org.apache.pulsar.tests.integration.topologies.ClientTestBase.resetCursorCompatibility(ClientTestBase.java:71)
	at org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_2.testResetCursorCompatibility(ClientTest2_2.java:32)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-05T09:13:50.6164633Z](https://github.com/apache/pulsar/runs/7192246329?check_suite_focus=true#step:12:17223)  
[example failure 2022-07-05T09:08:58.1391394Z](https://github.com/apache/pulsar/runs/7192246329?check_suite_focus=true#step:12:5791)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$ConsumerBusyException: Exclusive consumer is already connected
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:946)
	at org.apache.pulsar.client.impl.ConsumerBuilderImpl.subscribe(ConsumerBuilderImpl.java:102)
	at org.apache.pulsar.tests.integration.topologies.ClientTestBase.resetCursorCompatibility(ClientTestBase.java:71)
	at org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_2.testResetCursorCompatibility(ClientTest2_2.java:32)
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
	at java.lang.Thread.run(Thread.java:750)

</pre></code>
</details>

