        
Flaky-test: org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource
Number of failures: 8

org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest is flaky. The testDebeziumOracleDbSource test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource() didn't finish within the time-out 1800000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-02T05:38:20.1084810Z](https://github.com/apache/pulsar/actions/runs/4071192392/jobs/7013157364#step:12:33454)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource() didn't finish within the time-out 1800000
	at java.base@17.0.5/jdk.internal.misc.Unsafe.park(Native Method)
	at java.base@17.0.5/java.util.concurrent.locks.LockSupport.park(LockSupport.java:211)
	at java.base@17.0.5/java.util.concurrent.CompletableFuture$Signaller.block(CompletableFuture.java:1864)
	at java.base@17.0.5/java.util.concurrent.ForkJoinPool.unmanagedBlock(ForkJoinPool.java:3463)
	at java.base@17.0.5/java.util.concurrent.ForkJoinPool.managedBlock(ForkJoinPool.java:3434)
	at java.base@17.0.5/java.util.concurrent.CompletableFuture.waitingGet(CompletableFuture.java:1898)
	at java.base@17.0.5/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2072)
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
	at java.base@17.0.5/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base@17.0.5/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base@17.0.5/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base@17.0.5/java.lang.reflect.Method.invoke(Method.java:568)
	at app//org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at app//org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base@17.0.5/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base@17.0.5/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base@17.0.5/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base@17.0.5/java.lang.Thread.run(Thread.java:833)

2023-02-02T05:38:19,962 - INFO  - [TestNG-method=testDebeziumOracleDbSource-1:PulsarCluster@345] - Successfully stop external service debezium-oracledb-12c
2023-02-02T05:38:19,991 - INFO  - [TestNG-method=testDebeziumOracleDbSource-1:PulsarClientImpl@745] - Client closing. URL: pulsar://localhost:32784
</pre></code>
</details>

[example failure 2023-02-04T01:26:11.8789218Z](https://github.com/apache/pulsar/actions/runs/4088820717/jobs/7051450045#step:12:33549)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource() didn't finish within the time-out 1800000
	at java.base@17.0.6/java.lang.Thread.sleep(Native Method)
	at app//org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumOracleDbSourceTester.waitForOracleStatus(DebeziumOracleDbSourceTester.java:183)
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

2023-02-04T01:26:11,685 - INFO  - [TestNG-method=testDebeziumOracleDbSource-1:PulsarCluster@345] - Successfully stop external service debezium-oracledb-12c
2023-02-04T01:26:11,708 - INFO  - [TestNG-method=testDebeziumOracleDbSource-1:PulsarClientImpl@745] - Client closing. URL: pulsar://localhost:32784
</pre></code>
</details>

[example failure 2023-02-02T10:30:00.6620083Z](https://github.com/apache/pulsar/actions/runs/4072853701/jobs/7016895972#step:12:33728)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource() didn't finish within the time-out 1800000
	at java.base@17.0.6/java.lang.Thread.sleep(Native Method)
	at app//org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumOracleDbSourceTester.waitForOracleStatus(DebeziumOracleDbSourceTester.java:183)
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

2023-02-02T10:30:00,595 - INFO  - [TestNG-method=testDebeziumOracleDbSource-1:PulsarCluster@345] - Successfully stop external service debezium-oracledb-12c
2023-02-02T10:30:00,614 - INFO  - [TestNG-method=testDebeziumOracleDbSource-1:PulsarClientImpl@745] - Client closing. URL: pulsar://localhost:32784
</pre></code>
</details>

[example failure 2023-02-02T12:29:36.6030171Z](https://github.com/apache/pulsar/actions/runs/4073789302/jobs/7018948807#step:12:33752)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource() didn't finish within the time-out 1800000
	at java.base@17.0.6/java.lang.Thread.sleep(Native Method)
	at app//org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumOracleDbSourceTester.waitForOracleStatus(DebeziumOracleDbSourceTester.java:183)
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

2023-02-02T12:29:36,575 - INFO  - [TestNG-method=testDebeziumOracleDbSource-1:PulsarCluster@345] - Successfully stop external service debezium-oracledb-12c
2023-02-02T12:29:36,596 - INFO  - [TestNG-method=testDebeziumOracleDbSource-1:PulsarClientImpl@745] - Client closing. URL: pulsar://localhost:32784
</pre></code>
</details>

[example failure 2023-02-02T11:51:12.2784169Z](https://github.com/apache/pulsar/actions/runs/4073474341/jobs/7018322568#step:12:33828)  


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

2023-02-02T11:51:12,222 - INFO  - [TestNG-method=testDebeziumOracleDbSource-1:PulsarCluster@345] - Successfully stop external service debezium-oracledb-12c
2023-02-02T11:51:12,252 - INFO  - [TestNG-method=testDebeziumOracleDbSource-1:PulsarClientImpl@745] - Client closing. URL: pulsar://localhost:32784
</pre></code>
</details>

[example failure 2023-02-03T08:40:39.4782586Z](https://github.com/apache/pulsar/actions/runs/4081947710/jobs/7036340528#step:12:33801)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource() didn't finish within the time-out 1800000
	at java.base@17.0.6/java.lang.Thread.sleep(Native Method)
	at app//org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumOracleDbSourceTester.waitForOracleStatus(DebeziumOracleDbSourceTester.java:183)
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

2023-02-03T08:40:39,373 - INFO  - [TestNG-method=testDebeziumOracleDbSource-1:PulsarCluster@345] - Successfully stop external service debezium-oracledb-12c
2023-02-03T08:40:39,401 - INFO  - [TestNG-method=testDebeziumOracleDbSource-1:PulsarClientImpl@745] - Client closing. URL: pulsar://localhost:32784
</pre></code>
</details>

[example failure 2023-02-03T10:40:02.3964083Z](https://github.com/apache/pulsar/actions/runs/4082669774/jobs/7038145711#step:12:34041)  


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

2023-02-03T10:40:02,297 - INFO  - [TestNG-method=testDebeziumOracleDbSource-1:PulsarCluster@345] - Successfully stop external service debezium-oracledb-12c
2023-02-03T10:40:02,313 - INFO  - [TestNG-method=testDebeziumOracleDbSource-1:PulsarClientImpl@745] - Client closing. URL: pulsar://localhost:32784
</pre></code>
</details>

[example failure 2023-02-03T06:24:01.5386316Z](https://github.com/apache/pulsar/actions/runs/4081203873/jobs/7034879698#step:12:33240)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource() didn't finish within the time-out 1800000
	at java.base@17.0.6/java.lang.Thread.sleep(Native Method)
	at app//org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumOracleDbSourceTester.waitForOracleStatus(DebeziumOracleDbSourceTester.java:183)
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

</pre></code>
</details>

