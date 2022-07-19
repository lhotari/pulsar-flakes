        
Flaky-test: org.apache.pulsar.io.AbstractPulsarE2ETest.shutdown
Number of failures: 1

org.apache.pulsar.io.AbstractPulsarE2ETest is flaky. The shutdown test method fails sporadically.

```
   java.lang.Thread.State: WAITING (parking)
	at jdk.internal.misc.Unsafe.park(java.base@11.0.15/Native Method)
	- parking to wait for  <0x00000000cb596ad8> (a java.util.concurrent.CompletableFuture$Signaller)
	at java.util.concurrent.locks.LockSupport.park(java.base@11.0.15/LockSupport.java:194)
	at java.util.concurrent.CompletableFuture$Signaller.block(java.base@11.0.15/CompletableFuture.java:1796)
	at java.util.concurrent.ForkJoinPool.managedBlock(java.base@11.0.15/ForkJoinPool.java:3128)
	at java.util.concurrent.CompletableFuture.waitingGet(java.base@11.0.15/CompletableFuture.java:1823)
	at java.util.concurrent.CompletableFuture.get(java.base@11.0.15/CompletableFuture.java:1998)
	at org.apache.pulsar.client.impl.PulsarClientImpl.close(PulsarClientImpl.java:710)
	at org.apache.pulsar.io.AbstractPulsarE2ETest.shutdown(AbstractPulsarE2ETest.java:229)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-15T04:58:51.8840791Z](https://github.com/apache/pulsar/runs/7351540734?check_suite_focus=true#step:9:60)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
   java.lang.Thread.State: WAITING (parking)
	at jdk.internal.misc.Unsafe.park(java.base@11.0.15/Native Method)
	- parking to wait for  <0x00000000cb596ad8> (a java.util.concurrent.CompletableFuture$Signaller)
	at java.util.concurrent.locks.LockSupport.park(java.base@11.0.15/LockSupport.java:194)
	at java.util.concurrent.CompletableFuture$Signaller.block(java.base@11.0.15/CompletableFuture.java:1796)
	at java.util.concurrent.ForkJoinPool.managedBlock(java.base@11.0.15/ForkJoinPool.java:3128)
	at java.util.concurrent.CompletableFuture.waitingGet(java.base@11.0.15/CompletableFuture.java:1823)
	at java.util.concurrent.CompletableFuture.get(java.base@11.0.15/CompletableFuture.java:1998)
	at org.apache.pulsar.client.impl.PulsarClientImpl.close(PulsarClientImpl.java:710)
	at org.apache.pulsar.io.AbstractPulsarE2ETest.shutdown(AbstractPulsarE2ETest.java:229)
	at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(java.base@11.0.15/Native Method)
	at jdk.internal.reflect.NativeMethodAccessorImpl.invoke(java.base@11.0.15/NativeMethodAccessorImpl.java:62)
	at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(java.base@11.0.15/DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(java.base@11.0.15/Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:661)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
	at org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:822)
	at org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:147)
	at org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)
	at org.testng.TestRunner$$Lambda$162/0x0000000100264040.accept(Unknown Source)
	at java.util.ArrayList.forEach(java.base@11.0.15/ArrayList.java:1541)
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

