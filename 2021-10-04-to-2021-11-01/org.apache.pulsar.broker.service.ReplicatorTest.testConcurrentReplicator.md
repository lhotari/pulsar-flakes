        
Flaky-test: org.apache.pulsar.broker.service.ReplicatorTest.testConcurrentReplicator
Number of failures: 7

org.apache.pulsar.broker.service.ReplicatorTest is flaky. The testConcurrentReplicator test method fails sporadically.

```
Wanted but not invoked:
pulsarClientImpl.createProducerAsync(
    <any org.apache.pulsar.client.impl.conf.ProducerConfigurationData>,
    <any org.apache.pulsar.client.api.Schema>,
    null
);
-> at org.apache.pulsar.broker.service.ReplicatorTest.testConcurrentReplicator(ReplicatorTest.java:291)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-10T02:18:44.4484732Z](https://github.com/apache/pulsar/runs/3849202717?check_suite_focus=true?check_suite_focus=true#step:9:282)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
Wanted but not invoked:
pulsarClientImpl.createProducerAsync(
    <any org.apache.pulsar.client.impl.conf.ProducerConfigurationData>,
    <any org.apache.pulsar.client.api.Schema>,
    null
);
-> at org.apache.pulsar.broker.service.ReplicatorTest.testConcurrentReplicator(ReplicatorTest.java:291)

However, there was exactly 1 interaction with this mock:
pulsarClientImpl.newProducer(
    org.apache.pulsar.client.impl.schema.AutoProduceBytesSchema@24d315fb
);
-> at org.apache.pulsar.broker.service.AbstractReplicator.<init>(AbstractReplicator.java:79)


	at org.apache.pulsar.broker.service.ReplicatorTest.testConcurrentReplicator(ReplicatorTest.java:291)
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

[example failure 2021-10-05T03:44:33.9001437Z](https://github.com/apache/pulsar/runs/3799039989?check_suite_focus=true?check_suite_focus=true#step:9:420)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
Wanted but not invoked:
pulsarClientImpl.createProducerAsync(
    <any org.apache.pulsar.client.impl.conf.ProducerConfigurationData>,
    <any org.apache.pulsar.client.api.Schema>,
    null
);
-> at org.apache.pulsar.broker.service.ReplicatorTest.testConcurrentReplicator(ReplicatorTest.java:291)

However, there was exactly 1 interaction with this mock:
pulsarClientImpl.newProducer(
    org.apache.pulsar.client.impl.schema.AutoProduceBytesSchema@397d7c16
);
-> at org.apache.pulsar.broker.service.AbstractReplicator.<init>(AbstractReplicator.java:79)


	at org.apache.pulsar.broker.service.ReplicatorTest.testConcurrentReplicator(ReplicatorTest.java:291)
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

[example failure 2021-10-04T15:12:21.0239634Z](https://github.com/apache/pulsar/runs/3792268877?check_suite_focus=true?check_suite_focus=true#step:9:7260)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
Wanted but not invoked:
pulsarClientImpl.createProducerAsync(
    <any org.apache.pulsar.client.impl.conf.ProducerConfigurationData>,
    <any org.apache.pulsar.client.api.Schema>,
    null
);
-> at org.apache.pulsar.broker.service.ReplicatorTest.testConcurrentReplicator(ReplicatorTest.java:291)

However, there was exactly 1 interaction with this mock:
pulsarClientImpl.newProducer(
    org.apache.pulsar.client.impl.schema.AutoProduceBytesSchema@599d271c
);
-> at org.apache.pulsar.broker.service.AbstractReplicator.<init>(AbstractReplicator.java:79)


	at org.apache.pulsar.broker.service.ReplicatorTest.testConcurrentReplicator(ReplicatorTest.java:291)
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

[example failure 2021-10-14T14:48:12.3364778Z](https://github.com/apache/pulsar/runs/3895861830?check_suite_focus=true?check_suite_focus=true#step:9:284)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
Wanted but not invoked:
pulsarClientImpl.createProducerAsync(
    <any org.apache.pulsar.client.impl.conf.ProducerConfigurationData>,
    <any org.apache.pulsar.client.api.Schema>,
    null
);
-> at org.apache.pulsar.broker.service.ReplicatorTest.testConcurrentReplicator(ReplicatorTest.java:291)

However, there was exactly 1 interaction with this mock:
pulsarClientImpl.newProducer(
    org.apache.pulsar.client.impl.schema.AutoProduceBytesSchema@323b7c90
);
-> at org.apache.pulsar.broker.service.AbstractReplicator.<init>(AbstractReplicator.java:79)


	at org.apache.pulsar.broker.service.ReplicatorTest.testConcurrentReplicator(ReplicatorTest.java:291)
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

[example failure 2021-10-05T05:45:30.2316260Z](https://github.com/apache/pulsar/runs/3799683536?check_suite_focus=true?check_suite_focus=true#step:9:412)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
Wanted but not invoked:
pulsarClientImpl.createProducerAsync(
    <any org.apache.pulsar.client.impl.conf.ProducerConfigurationData>,
    <any org.apache.pulsar.client.api.Schema>,
    null
);
-> at org.apache.pulsar.broker.service.ReplicatorTest.testConcurrentReplicator(ReplicatorTest.java:291)

However, there was exactly 1 interaction with this mock:
pulsarClientImpl.newProducer(
    org.apache.pulsar.client.impl.schema.AutoProduceBytesSchema@452101f7
);
-> at org.apache.pulsar.broker.service.AbstractReplicator.<init>(AbstractReplicator.java:79)


	at org.apache.pulsar.broker.service.ReplicatorTest.testConcurrentReplicator(ReplicatorTest.java:291)
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

[example failure 2021-10-14T02:07:58.1755857Z](https://github.com/apache/pulsar/runs/3889477087?check_suite_focus=true?check_suite_focus=true#step:9:6365)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
Wanted but not invoked:
pulsarClientImpl.createProducerAsync(
    <any org.apache.pulsar.client.impl.conf.ProducerConfigurationData>,
    <any org.apache.pulsar.client.api.Schema>,
    null
);
-> at org.apache.pulsar.broker.service.ReplicatorTest.testConcurrentReplicator(ReplicatorTest.java:291)

However, there was exactly 1 interaction with this mock:
pulsarClientImpl.newProducer(
    org.apache.pulsar.client.impl.schema.AutoProduceBytesSchema@246a67f5
);
-> at org.apache.pulsar.broker.service.AbstractReplicator.<init>(AbstractReplicator.java:79)


	at org.apache.pulsar.broker.service.ReplicatorTest.testConcurrentReplicator(ReplicatorTest.java:291)
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
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.ReplicatorTest.testConcurrentReplicator() didn't finish within the time-out 30000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T01:17:47.9056888Z](https://github.com/apache/pulsar/runs/3889474039?check_suite_focus=true?check_suite_focus=true#step:9:242)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.broker.service.ReplicatorTest.testConcurrentReplicator() didn't finish within the time-out 30000
	at org.testng.internal.MethodInvocationHelper.invokeWithTimeoutWithNewExecutor(MethodInvocationHelper.java:371)
	at org.testng.internal.MethodInvocationHelper.invokeWithTimeout(MethodInvocationHelper.java:282)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:605)
	at org.testng.internal.TestInvoker.retryFailed(TestInvoker.java:214)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:58)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.util.ArrayList.forEach(ArrayList.java:1257)
	at org.testng.TestRunner.privateRun(TestRunner.java:764)
	at org.testng.TestRunner.run(TestRunner.java:585)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:384)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:378)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:337)
	at org.testng.SuiteRunner.run(SuiteRunner.java:286)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:53)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:96)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1218)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1140)
	at org.testng.TestNG.runSuites(TestNG.java:1069)
	at org.testng.TestNG.run(TestNG.java:1037)
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:99)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)

</pre></code>
</details>

