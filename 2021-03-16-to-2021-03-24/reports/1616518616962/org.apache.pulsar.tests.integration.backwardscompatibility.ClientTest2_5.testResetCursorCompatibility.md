        
Flaky-test: org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_5.testResetCursorCompatibility
Number of failures: 26

org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_5 is flaky. The testResetCursorCompatibility test method fails sporadically.

```
org.apache.pulsar.client.api.PulsarClientException$ConsumerBusyException: Exclusive consumer is already connected
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:991)
	at org.apache.pulsar.client.impl.ConsumerBuilderImpl.subscribe(ConsumerBuilderImpl.java:102)
	at org.apache.pulsar.tests.integration.topologies.ClientTestBase.resetCursorCompatibility(ClientTestBase.java:70)
	at org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_5.testResetCursorCompatibility(ClientTest2_5.java:32)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-22T23:12:25.4673147Z](https://github.com/apache/pulsar/runs/2170427496?check_suite_focus=true#step:12:5809)
[example failure 2021-03-22T14:45:50.4399137Z](https://github.com/apache/pulsar/runs/2166172714?check_suite_focus=true#step:12:5807)
[example failure 2021-03-20T19:24:48.6705174Z](https://github.com/apache/pulsar/runs/2156478753?check_suite_focus=true#step:13:5510)
[example failure 2021-03-20T10:52:23.1380103Z](https://github.com/apache/pulsar/runs/2154861837?check_suite_focus=true#step:13:11478)
[example failure 2021-03-20T10:49:16.3277225Z](https://github.com/apache/pulsar/runs/2154861837?check_suite_focus=true#step:13:5810)
[example failure 2021-03-20T10:29:46.8861503Z](https://github.com/apache/pulsar/runs/2154797663?check_suite_focus=true#step:13:5507)
[example failure 2021-03-20T00:59:36.7489857Z](https://github.com/apache/pulsar/runs/2152924746?check_suite_focus=true#step:13:6401)
[example failure 2021-03-19T22:18:11.2771804Z](https://github.com/apache/pulsar/runs/2152159431?check_suite_focus=true#step:13:5814)
[example failure 2021-03-19T20:38:00.8926110Z](https://github.com/apache/pulsar/runs/2151449597?check_suite_focus=true#step:13:17740)
[example failure 2021-03-19T17:32:05.4276881Z](https://github.com/apache/pulsar/runs/2150254175?check_suite_focus=true#step:13:6113)
[example failure 2021-03-19T12:35:31.7445597Z](https://github.com/apache/pulsar/runs/2146893914?check_suite_focus=true#step:12:18126)
[example failure 2021-03-19T12:32:10.9073434Z](https://github.com/apache/pulsar/runs/2146893914?check_suite_focus=true#step:12:11832)
[example failure 2021-03-19T12:28:48.5027295Z](https://github.com/apache/pulsar/runs/2146893914?check_suite_focus=true#step:12:6129)
[example failure 2021-03-19T03:09:40.0737665Z](https://github.com/apache/pulsar/runs/2144995169?check_suite_focus=true#step:13:11848)
[example failure 2021-03-19T03:06:18.7830852Z](https://github.com/apache/pulsar/runs/2144995169?check_suite_focus=true#step:13:5831)
[example failure 2021-03-17T23:17:22.4685826Z](https://github.com/apache/pulsar/runs/2134973513?check_suite_focus=true#step:13:6366)
[example failure 2021-03-17T18:27:44.2334833Z](https://github.com/apache/pulsar/runs/2133025287?check_suite_focus=true#step:13:11827)
[example failure 2021-03-17T18:24:26.3915986Z](https://github.com/apache/pulsar/runs/2133025287?check_suite_focus=true#step:13:6121)
[example failure 2021-03-17T12:07:32.8993628Z](https://github.com/apache/pulsar/runs/2129232343?check_suite_focus=true#step:13:17480)
[example failure 2021-03-17T12:04:22.0320018Z](https://github.com/apache/pulsar/runs/2129232343?check_suite_focus=true#step:13:11194)
[example failure 2021-03-17T12:01:08.3426680Z](https://github.com/apache/pulsar/runs/2129232343?check_suite_focus=true#step:13:5811)
[example failure 2021-03-16T19:21:36.2214892Z](https://github.com/apache/pulsar/runs/2122021073?check_suite_focus=true#step:13:12052)
[example failure 2021-03-16T19:18:07.5955029Z](https://github.com/apache/pulsar/runs/2122021073?check_suite_focus=true#step:13:6099)
[example failure 2021-03-16T09:45:10.8863519Z](https://github.com/apache/pulsar/runs/2119427201?check_suite_focus=true#step:13:17718)
[example failure 2021-03-16T09:42:06.6905142Z](https://github.com/apache/pulsar/runs/2119427201?check_suite_focus=true#step:13:11768)
[example failure 2021-03-16T09:38:57.9565967Z](https://github.com/apache/pulsar/runs/2119427201?check_suite_focus=true#step:13:6111)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$ConsumerBusyException: Exclusive consumer is already connected
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:991)
	at org.apache.pulsar.client.impl.ConsumerBuilderImpl.subscribe(ConsumerBuilderImpl.java:102)
	at org.apache.pulsar.tests.integration.topologies.ClientTestBase.resetCursorCompatibility(ClientTestBase.java:70)
	at org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_5.testResetCursorCompatibility(ClientTest2_5.java:32)
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

