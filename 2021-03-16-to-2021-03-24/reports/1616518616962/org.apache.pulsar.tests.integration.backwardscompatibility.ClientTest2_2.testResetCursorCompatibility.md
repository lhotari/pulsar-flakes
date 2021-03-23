        
Flaky-test: org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_2.testResetCursorCompatibility
Number of failures: 7

org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_2 is flaky. The testResetCursorCompatibility test method fails sporadically.

```
org.apache.pulsar.client.api.PulsarClientException$ConsumerBusyException: Exclusive consumer is already connected
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:991)
	at org.apache.pulsar.client.impl.ConsumerBuilderImpl.subscribe(ConsumerBuilderImpl.java:102)
	at org.apache.pulsar.tests.integration.topologies.ClientTestBase.resetCursorCompatibility(ClientTestBase.java:70)
	at org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_2.testResetCursorCompatibility(ClientTest2_2.java:32)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-19T17:38:50.0109644Z](https://github.com/apache/pulsar/runs/2150254175?check_suite_focus=true#step:13:17480)
[example failure 2021-03-19T12:35:31.7287537Z](https://github.com/apache/pulsar/runs/2146893914?check_suite_focus=true#step:12:18107)
[example failure 2021-03-19T12:32:10.9026041Z](https://github.com/apache/pulsar/runs/2146893914?check_suite_focus=true#step:12:11813)
[example failure 2021-03-19T03:09:40.0513550Z](https://github.com/apache/pulsar/runs/2144995169?check_suite_focus=true#step:13:11810)
[example failure 2021-03-17T12:07:32.8822496Z](https://github.com/apache/pulsar/runs/2129232343?check_suite_focus=true#step:13:17461)
[example failure 2021-03-16T19:18:07.5789022Z](https://github.com/apache/pulsar/runs/2122021073?check_suite_focus=true#step:13:6080)
[example failure 2021-03-16T09:38:57.9293736Z](https://github.com/apache/pulsar/runs/2119427201?check_suite_focus=true#step:13:6073)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$ConsumerBusyException: Exclusive consumer is already connected
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:991)
	at org.apache.pulsar.client.impl.ConsumerBuilderImpl.subscribe(ConsumerBuilderImpl.java:102)
	at org.apache.pulsar.tests.integration.topologies.ClientTestBase.resetCursorCompatibility(ClientTestBase.java:70)
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
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

