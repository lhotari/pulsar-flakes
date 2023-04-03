        
Flaky-test: org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource
Number of failures: 1

org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest is flaky. The testDebeziumOracleDbSource test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource() didn't finish within the time-out 1800000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-03-28T07:47:57.9007388Z](https://github.com/apache/pulsar/actions/runs/4539796914/jobs/8000868074#step:12:33499)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource() didn't finish within the time-out 1800000
	at java.base@17.0.6/jdk.internal.misc.Unsafe.park(Native Method)
	at java.base@17.0.6/java.util.concurrent.locks.LockSupport.park(LockSupport.java:211)
	at java.base@17.0.6/java.util.concurrent.CompletableFuture$Signaller.block(CompletableFuture.java:1864)
	at java.base@17.0.6/java.util.concurrent.ForkJoinPool.unmanagedBlock(ForkJoinPool.java:3463)
	at java.base@17.0.6/java.util.concurrent.ForkJoinPool.managedBlock(ForkJoinPool.java:3434)
	at java.base@17.0.6/java.util.concurrent.CompletableFuture.waitingGet(CompletableFuture.java:1898)
	at java.base@17.0.6/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2072)
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
	at java.base@17.0.6/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base@17.0.6/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base@17.0.6/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base@17.0.6/java.lang.reflect.Method.invoke(Method.java:568)
	at app//org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base@17.0.6/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base@17.0.6/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base@17.0.6/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base@17.0.6/java.lang.Thread.run(Thread.java:833)

2023-03-28T07:47:57,641 - INFO  - [TestNG-method=testDebeziumOracleDbSource-1:PulsarCluster@345] - Successfully stop external service debezium-oracledb-12c
2023-03-28T07:47:57,667 - INFO  - [TestNG-method=testDebeziumOracleDbSource-1:PulsarClientImpl@729] - Client closing. URL: pulsar://localhost:32785
</pre></code>
</details>

