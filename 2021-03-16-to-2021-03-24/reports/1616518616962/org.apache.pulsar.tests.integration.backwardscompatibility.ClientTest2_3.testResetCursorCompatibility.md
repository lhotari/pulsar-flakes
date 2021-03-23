        
Flaky-test: org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_3.testResetCursorCompatibility
Number of failures: 3

org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_3 is flaky. The testResetCursorCompatibility test method fails sporadically.

```
org.apache.pulsar.client.api.PulsarClientException$ConsumerBusyException: Exclusive consumer is already connected
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:991)
	at org.apache.pulsar.client.impl.ConsumerBuilderImpl.subscribe(ConsumerBuilderImpl.java:102)
	at org.apache.pulsar.tests.integration.topologies.ClientTestBase.resetCursorCompatibility(ClientTestBase.java:70)
	at org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_3.testResetCursorCompatibility(ClientTest2_3.java:32)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-19T03:09:40.0626398Z](https://github.com/apache/pulsar/runs/2144995169?check_suite_focus=true#step:13:11829)
[example failure 2021-03-17T18:27:44.2259553Z](https://github.com/apache/pulsar/runs/2133025287?check_suite_focus=true#step:13:11808)
[example failure 2021-03-16T19:25:05.9372964Z](https://github.com/apache/pulsar/runs/2122021073?check_suite_focus=true#step:13:18006)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$ConsumerBusyException: Exclusive consumer is already connected
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:991)
	at org.apache.pulsar.client.impl.ConsumerBuilderImpl.subscribe(ConsumerBuilderImpl.java:102)
	at org.apache.pulsar.tests.integration.topologies.ClientTestBase.resetCursorCompatibility(ClientTestBase.java:70)
	at org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_3.testResetCursorCompatibility(ClientTest2_3.java:32)
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

