        
Flaky-test: org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_4.testResetCursorCompatibility
Number of failures: 15

org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_4 is flaky. The testResetCursorCompatibility test method fails sporadically.

```
org.apache.pulsar.client.api.PulsarClientException$ConsumerBusyException: Exclusive consumer is already connected
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:991)
	at org.apache.pulsar.client.impl.ConsumerBuilderImpl.subscribe(ConsumerBuilderImpl.java:102)
	at org.apache.pulsar.tests.integration.topologies.ClientTestBase.resetCursorCompatibility(ClientTestBase.java:70)
	at org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_4.testResetCursorCompatibility(ClientTest2_4.java:32)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-22T15:05:25.6002752Z](https://github.com/apache/pulsar/runs/2166599722?check_suite_focus=true#step:12:6103)
[example failure 2021-03-22T14:51:56.7655536Z](https://github.com/apache/pulsar/runs/2166172714?check_suite_focus=true#step:12:17753)
[example failure 2021-03-22T14:48:55.0931474Z](https://github.com/apache/pulsar/runs/2166172714?check_suite_focus=true#step:12:11778)
[example failure 2021-03-19T22:25:03.6604811Z](https://github.com/apache/pulsar/runs/2152159431?check_suite_focus=true#step:13:17770)
[example failure 2021-03-19T22:21:39.0892996Z](https://github.com/apache/pulsar/runs/2152159431?check_suite_focus=true#step:13:11792)
[example failure 2021-03-19T20:34:57.1716203Z](https://github.com/apache/pulsar/runs/2151449597?check_suite_focus=true#step:13:12070)
[example failure 2021-03-19T20:31:52.5617287Z](https://github.com/apache/pulsar/runs/2151449597?check_suite_focus=true#step:13:6102)
[example failure 2021-03-19T17:35:28.4842118Z](https://github.com/apache/pulsar/runs/2150254175?check_suite_focus=true#step:13:11796)
[example failure 2021-03-19T16:14:02.5841119Z](https://github.com/apache/pulsar/runs/2148867318?check_suite_focus=true#step:12:6105)
[example failure 2021-03-19T12:28:48.4975287Z](https://github.com/apache/pulsar/runs/2146893914?check_suite_focus=true#step:12:6110)
[example failure 2021-03-19T03:06:18.7693827Z](https://github.com/apache/pulsar/runs/2144995169?check_suite_focus=true#step:13:5812)
[example failure 2021-03-17T18:30:59.2591705Z](https://github.com/apache/pulsar/runs/2133025287?check_suite_focus=true#step:13:17508)
[example failure 2021-03-17T18:24:26.3763492Z](https://github.com/apache/pulsar/runs/2133025287?check_suite_focus=true#step:13:6102)
[example failure 2021-03-16T19:25:05.9493185Z](https://github.com/apache/pulsar/runs/2122021073?check_suite_focus=true#step:13:18025)
[example failure 2021-03-16T09:38:57.9447438Z](https://github.com/apache/pulsar/runs/2119427201?check_suite_focus=true#step:13:6092)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$ConsumerBusyException: Exclusive consumer is already connected
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:991)
	at org.apache.pulsar.client.impl.ConsumerBuilderImpl.subscribe(ConsumerBuilderImpl.java:102)
	at org.apache.pulsar.tests.integration.topologies.ClientTestBase.resetCursorCompatibility(ClientTestBase.java:70)
	at org.apache.pulsar.tests.integration.backwardscompatibility.ClientTest2_4.testResetCursorCompatibility(ClientTest2_4.java:32)
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

