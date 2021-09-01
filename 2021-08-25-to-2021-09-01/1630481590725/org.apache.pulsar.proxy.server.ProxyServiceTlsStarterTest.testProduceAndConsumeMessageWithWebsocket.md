        
Flaky-test: org.apache.pulsar.proxy.server.ProxyServiceTlsStarterTest.testProduceAndConsumeMessageWithWebsocket
Number of failures: 2

org.apache.pulsar.proxy.server.ProxyServiceTlsStarterTest is flaky. The testProduceAndConsumeMessageWithWebsocket test method fails sporadically.

```
java.util.concurrent.ExecutionException: java.net.ConnectException: Connection refused
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.proxy.server.ProxyServiceTlsStarterTest.testProduceAndConsumeMessageWithWebsocket(ProxyServiceTlsStarterTest.java:122)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T10:55:32.1121211Z](https://github.com/apache/pulsar/runs/3442314873?check_suite_focus=true#step:9:270)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.ExecutionException: java.net.ConnectException: Connection refused
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:395)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:1999)
	at org.apache.pulsar.proxy.server.ProxyServiceTlsStarterTest.testProduceAndConsumeMessageWithWebsocket(ProxyServiceTlsStarterTest.java:122)
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
Caused by: java.net.ConnectException: Connection refused
	at java.base/sun.nio.ch.SocketChannelImpl.checkConnect(Native Method)
	at java.base/sun.nio.ch.SocketChannelImpl.finishConnect(SocketChannelImpl.java:777)
	at org.eclipse.jetty.io.SelectorManager.doFinishConnect(SelectorManager.java:355)
	at org.eclipse.jetty.io.ManagedSelector.processConnect(ManagedSelector.java:347)
	at org.eclipse.jetty.io.ManagedSelector.access$1700(ManagedSelector.java:65)
	at org.eclipse.jetty.io.ManagedSelector$SelectorProducer.processSelected(ManagedSelector.java:676)
	at org.eclipse.jetty.io.ManagedSelector$SelectorProducer.produce(ManagedSelector.java:535)
	at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.produceTask(EatWhatYouKill.java:362)
	at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.doProduce(EatWhatYouKill.java:186)
	at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.tryProduce(EatWhatYouKill.java:173)
	at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.produce(EatWhatYouKill.java:137)
	at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:883)
	at org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1034)
	... 1 more

</pre></code>
</details>

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-26T10:08:03.8842122Z](https://github.com/apache/pulsar/runs/3431383334?check_suite_focus=true#step:9:258)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

