        
Flaky-test: org.apache.pulsar.client.api.BrokerServiceLookupTest.testConcurrentWriteBrokerData
Number of failures: 3

org.apache.pulsar.client.api.BrokerServiceLookupTest is flaky. The testConcurrentWriteBrokerData test method fails sporadically.

```
java.util.concurrent.ExecutionException: java.lang.RuntimeException: java.util.ConcurrentModificationException
	at java.base/java.util.concurrent.FutureTask.report(FutureTask.java:122)
	at java.base/java.util.concurrent.FutureTask.get(FutureTask.java:191)
	at org.apache.pulsar.client.api.BrokerServiceLookupTest.testConcurrentWriteBrokerData(BrokerServiceLookupTest.java:238)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-21T03:07:19.9447471Z](https://github.com/apache/pulsar/runs/3959210236?check_suite_focus=true?check_suite_focus=true#step:9:584)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.ExecutionException: java.lang.RuntimeException: java.util.ConcurrentModificationException
	at java.base/java.util.concurrent.FutureTask.report(FutureTask.java:122)
	at java.base/java.util.concurrent.FutureTask.get(FutureTask.java:191)
	at org.apache.pulsar.client.api.BrokerServiceLookupTest.testConcurrentWriteBrokerData(BrokerServiceLookupTest.java:238)
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
Caused by: java.lang.RuntimeException: java.util.ConcurrentModificationException
	at org.apache.pulsar.client.api.BrokerServiceLookupTest.lambda$testConcurrentWriteBrokerData$0(BrokerServiceLookupTest.java:226)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	... 4 more
Caused by: java.util.ConcurrentModificationException
	at java.base/java.util.HashMap$HashIterator.nextNode(HashMap.java:1493)
	at java.base/java.util.HashMap$KeyIterator.next(HashMap.java:1516)
	at org.apache.pulsar.policies.data.loadbalancer.LocalBrokerData.updateBundleData(LocalBrokerData.java:205)
	at org.apache.pulsar.policies.data.loadbalancer.LocalBrokerData.update(LocalBrokerData.java:159)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerImpl.updateLocalBrokerData(ModularLoadManagerImpl.java:916)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerWrapper.generateLoadReport(ModularLoadManagerWrapper.java:61)
	at org.apache.pulsar.client.api.BrokerServiceLookupTest.lambda$testConcurrentWriteBrokerData$0(BrokerServiceLookupTest.java:224)
	... 5 more

</pre></code>
</details>

[example failure 2021-10-13T13:29:42.0733303Z](https://github.com/apache/pulsar/runs/3882997418?check_suite_focus=true?check_suite_focus=true#step:9:580)
[example failure 2021-10-07T20:59:45.0307947Z](https://github.com/apache/pulsar/runs/3832038937?check_suite_focus=true?check_suite_focus=true#step:9:580)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.ExecutionException: java.lang.RuntimeException: java.util.ConcurrentModificationException
	at java.base/java.util.concurrent.FutureTask.report(FutureTask.java:122)
	at java.base/java.util.concurrent.FutureTask.get(FutureTask.java:191)
	at org.apache.pulsar.client.api.BrokerServiceLookupTest.testConcurrentWriteBrokerData(BrokerServiceLookupTest.java:238)
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
Caused by: java.lang.RuntimeException: java.util.ConcurrentModificationException
	at org.apache.pulsar.client.api.BrokerServiceLookupTest.lambda$testConcurrentWriteBrokerData$1(BrokerServiceLookupTest.java:233)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	... 4 more
Caused by: java.util.ConcurrentModificationException
	at java.base/java.util.HashMap$HashIterator.nextNode(HashMap.java:1493)
	at java.base/java.util.HashMap$KeyIterator.next(HashMap.java:1516)
	at org.apache.pulsar.policies.data.loadbalancer.LocalBrokerData.updateBundleData(LocalBrokerData.java:205)
	at org.apache.pulsar.policies.data.loadbalancer.LocalBrokerData.update(LocalBrokerData.java:159)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerImpl.updateLocalBrokerData(ModularLoadManagerImpl.java:917)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerImpl.writeBrokerDataOnZooKeeper(ModularLoadManagerImpl.java:964)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerImpl.writeBrokerDataOnZooKeeper(ModularLoadManagerImpl.java:957)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerWrapper.writeLoadReportOnZookeeper(ModularLoadManagerWrapper.java:112)
	at org.apache.pulsar.client.api.BrokerServiceLookupTest.lambda$testConcurrentWriteBrokerData$1(BrokerServiceLookupTest.java:231)
	... 5 more

</pre></code>
</details>

