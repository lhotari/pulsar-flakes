        
Flaky-test: org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource
Number of failures: 4

org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest is flaky. The testDebeziumOracleDbSource test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource() didn't finish within the time-out 1800000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-09-27T08:43:02.5947747Z](https://github.com/apache/pulsar/actions/runs/6322046701/job/17169924273#step:11:33912)  
[example failure 2023-09-25T12:16:32.6791302Z](https://github.com/apache/pulsar/actions/runs/6298312472/job/17098271297#step:11:34560)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource() didn't finish within the time-out 1800000
	at java.base@17.0.8.1/java.lang.Thread.sleep(Native Method)
	at app//org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumOracleDbSourceTester.waitForOracleStatus(DebeziumOracleDbSourceTester.java:183)
	at app//org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumOracleDbSourceTester.prepareSource(DebeziumOracleDbSourceTester.java:155)
	at app//org.apache.pulsar.tests.integration.io.sources.PulsarIOSourceRunner.prepareSource(PulsarIOSourceRunner.java:117)
	at app//org.apache.pulsar.tests.integration.io.sources.debezium.PulsarIODebeziumSourceRunner.internalTestSource(PulsarIODebeziumSourceRunner.java:75)
	at app//org.apache.pulsar.tests.integration.io.sources.debezium.PulsarIODebeziumSourceRunner.testSource(PulsarIODebeziumSourceRunner.java:66)
	at app//org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbConnect(PulsarDebeziumOracleSourceTest.java:85)
	at app//org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource(PulsarDebeziumOracleSourceTest.java:48)
	at java.base@17.0.8.1/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base@17.0.8.1/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base@17.0.8.1/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base@17.0.8.1/java.lang.reflect.Method.invoke(Method.java:568)
	at app//org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base@17.0.8.1/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base@17.0.8.1/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base@17.0.8.1/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base@17.0.8.1/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

[example failure 2023-09-27T07:38:58.8769703Z](https://github.com/apache/pulsar/actions/runs/6322046701/job/17168158528#step:11:33029)  
[example failure 2023-09-25T10:58:32.1241463Z](https://github.com/apache/pulsar/actions/runs/6297507751/job/17095981215#step:11:34045)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource() didn't finish within the time-out 1800000
	at java.base@17.0.8.1/jdk.internal.misc.Unsafe.park(Native Method)
	at java.base@17.0.8.1/java.util.concurrent.locks.LockSupport.park(LockSupport.java:211)
	at java.base@17.0.8.1/java.util.concurrent.CompletableFuture$Signaller.block(CompletableFuture.java:1864)
	at java.base@17.0.8.1/java.util.concurrent.ForkJoinPool.unmanagedBlock(ForkJoinPool.java:3465)
	at java.base@17.0.8.1/java.util.concurrent.ForkJoinPool.managedBlock(ForkJoinPool.java:3436)
	at java.base@17.0.8.1/java.util.concurrent.CompletableFuture.waitingGet(CompletableFuture.java:1898)
	at java.base@17.0.8.1/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2072)
	at app//org.apache.pulsar.tests.integration.utils.DockerUtils.runCommandAsUser(DockerUtils.java:195)
	at app//org.apache.pulsar.tests.integration.containers.ChaosContainer.execCmdAsUser(ChaosContainer.java:98)
	at app//org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumOracleDbSourceTester.runSqlCmd(DebeziumOracleDbSourceTester.java:191)
	at app//org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumOracleDbSourceTester.waitForOracleStatus(DebeziumOracleDbSourceTester.java:178)
	at app//org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumOracleDbSourceTester.prepareSource(DebeziumOracleDbSourceTester.java:155)
	at app//org.apache.pulsar.tests.integration.io.sources.PulsarIOSourceRunner.prepareSource(PulsarIOSourceRunner.java:117)
	at app//org.apache.pulsar.tests.integration.io.sources.debezium.PulsarIODebeziumSourceRunner.internalTestSource(PulsarIODebeziumSourceRunner.java:75)
	at app//org.apache.pulsar.tests.integration.io.sources.debezium.PulsarIODebeziumSourceRunner.testSource(PulsarIODebeziumSourceRunner.java:66)
	at app//org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbConnect(PulsarDebeziumOracleSourceTest.java:85)
	at app//org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource(PulsarDebeziumOracleSourceTest.java:48)
	at java.base@17.0.8.1/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base@17.0.8.1/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base@17.0.8.1/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base@17.0.8.1/java.lang.reflect.Method.invoke(Method.java:568)
	at app//org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base@17.0.8.1/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base@17.0.8.1/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base@17.0.8.1/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base@17.0.8.1/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

