        
Flaky-test: org.apache.pulsar.broker.service.ZkSessionExpireTest.cleanup
Number of failures: 1

org.apache.pulsar.broker.service.ZkSessionExpireTest is flaky. The cleanup test method fails sporadically.

```
   java.lang.Thread.State: WAITING (parking)
	at jdk.internal.misc.Unsafe.park(java.base@17.0.12/Native Method)
	- parking to wait for  <0x0000100511406888> (a java.util.concurrent.CompletableFuture$Signaller)
	at java.util.concurrent.locks.LockSupport.park(java.base@17.0.12/LockSupport.java:211)
	at java.util.concurrent.CompletableFuture$Signaller.block(java.base@17.0.12/CompletableFuture.java:1864)
	at java.util.concurrent.ForkJoinPool.unmanagedBlock(java.base@17.0.12/ForkJoinPool.java:3465)
	at java.util.concurrent.ForkJoinPool.managedBlock(java.base@17.0.12/ForkJoinPool.java:3436)
	at java.util.concurrent.CompletableFuture.waitingGet(java.base@17.0.12/CompletableFuture.java:1898)
	at java.util.concurrent.CompletableFuture.join(java.base@17.0.12/CompletableFuture.java:2117)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerImpl.disableBroker(ModularLoadManagerImpl.java:603)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerWrapper.disableBroker(ModularLoadManagerWrapper.java:47)
	at org.apache.pulsar.broker.service.BrokerService.unloadNamespaceBundlesGracefully(BrokerService.java:949)
	at org.apache.pulsar.broker.service.BrokerService.unloadNamespaceBundlesGracefully(BrokerService.java:936)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:517)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:479)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-09-25T13:22:11.4872708Z](https://github.com/apache/pulsar/actions/runs/11032710627/job/30642834088#step:12:634)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
   java.lang.Thread.State: WAITING (parking)
	at jdk.internal.misc.Unsafe.park(java.base@17.0.12/Native Method)
	- parking to wait for  <0x0000100511406888> (a java.util.concurrent.CompletableFuture$Signaller)
	at java.util.concurrent.locks.LockSupport.park(java.base@17.0.12/LockSupport.java:211)
	at java.util.concurrent.CompletableFuture$Signaller.block(java.base@17.0.12/CompletableFuture.java:1864)
	at java.util.concurrent.ForkJoinPool.unmanagedBlock(java.base@17.0.12/ForkJoinPool.java:3465)
	at java.util.concurrent.ForkJoinPool.managedBlock(java.base@17.0.12/ForkJoinPool.java:3436)
	at java.util.concurrent.CompletableFuture.waitingGet(java.base@17.0.12/CompletableFuture.java:1898)
	at java.util.concurrent.CompletableFuture.join(java.base@17.0.12/CompletableFuture.java:2117)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerImpl.disableBroker(ModularLoadManagerImpl.java:603)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerWrapper.disableBroker(ModularLoadManagerWrapper.java:47)
	at org.apache.pulsar.broker.service.BrokerService.unloadNamespaceBundlesGracefully(BrokerService.java:949)
	at org.apache.pulsar.broker.service.BrokerService.unloadNamespaceBundlesGracefully(BrokerService.java:936)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:517)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:479)
	at org.apache.pulsar.broker.service.NetworkErrorTestBase.cleanup(NetworkErrorTestBase.java:215)
	at org.apache.pulsar.broker.service.ZkSessionExpireTest.cleanup(ZkSessionExpireTest.java:50)
	at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(java.base@17.0.12/Native Method)
	at jdk.internal.reflect.NativeMethodAccessorImpl.invoke(java.base@17.0.12/NativeMethodAccessorImpl.java:77)
	at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(java.base@17.0.12/DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(java.base@17.0.12/Method.java:569)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:69)
	at org.testng.internal.invokers.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:361)
	at org.testng.internal.invokers.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:296)
	at org.testng.internal.invokers.TestInvoker.runConfigMethods(TestInvoker.java:823)
	at org.testng.internal.invokers.TestInvoker.runAfterConfigurations(TestInvoker.java:792)
	at org.testng.internal.invokers.TestInvoker.invokeMethod(TestInvoker.java:768)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethod(TestInvoker.java:221)
	at org.testng.internal.invokers.MethodRunner.runInSequence(MethodRunner.java:50)
	at org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:969)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:194)
	at org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:148)
	at org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:128)
	at org.testng.TestRunner$$Lambda$309/0x00007f535c292228.accept(Unknown Source)
	at java.util.ArrayList.forEach(java.base@17.0.12/ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:829)
	at org.testng.TestRunner.run(TestRunner.java:602)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:437)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:431)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:391)
	at org.testng.SuiteRunner.run(SuiteRunner.java:330)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:95)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1256)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1176)
	at org.testng.TestNG.runSuites(TestNG.java:1099)
	at org.testng.TestNG.run(TestNG.java:1067)
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:155)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:102)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:117)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:86)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:137)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
</pre></code>
</details>

