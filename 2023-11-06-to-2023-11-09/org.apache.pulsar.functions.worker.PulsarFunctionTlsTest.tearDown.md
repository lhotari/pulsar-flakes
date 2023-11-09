        
Flaky-test: org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown
Number of failures: 1

org.apache.pulsar.functions.worker.PulsarFunctionTlsTest is flaky. The tearDown test method fails sporadically.

```
   java.lang.Thread.State: WAITING (parking)
	at jdk.internal.misc.Unsafe.park(java.base@17.0.9/Native Method)
	- parking to wait for  <0x000010002f450a60> (a java.util.concurrent.locks.ReentrantLock$FairSync)
	at java.util.concurrent.locks.LockSupport.park(java.base@17.0.9/LockSupport.java:211)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer.acquire(java.base@17.0.9/AbstractQueuedSynchronizer.java:715)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer.acquire(java.base@17.0.9/AbstractQueuedSynchronizer.java:938)
	at java.util.concurrent.locks.ReentrantLock$Sync.lock(java.base@17.0.9/ReentrantLock.java:153)
	at java.util.concurrent.locks.ReentrantLock.lock(java.base@17.0.9/ReentrantLock.java:322)
	at org.apache.pulsar.functions.worker.SchedulerManager.close(SchedulerManager.java:744)
	- locked <0x000010002f450990> (a org.apache.pulsar.functions.worker.SchedulerManager)
	at org.apache.pulsar.functions.worker.PulsarWorkerService.stop(PulsarWorkerService.java:623)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:198)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-11-07T08:02:39.0439664Z](https://github.com/apache/pulsar/actions/runs/6780990623/job/18430758078#step:12:573)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
   java.lang.Thread.State: WAITING (parking)
	at jdk.internal.misc.Unsafe.park(java.base@17.0.9/Native Method)
	- parking to wait for  <0x000010002f450a60> (a java.util.concurrent.locks.ReentrantLock$FairSync)
	at java.util.concurrent.locks.LockSupport.park(java.base@17.0.9/LockSupport.java:211)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer.acquire(java.base@17.0.9/AbstractQueuedSynchronizer.java:715)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer.acquire(java.base@17.0.9/AbstractQueuedSynchronizer.java:938)
	at java.util.concurrent.locks.ReentrantLock$Sync.lock(java.base@17.0.9/ReentrantLock.java:153)
	at java.util.concurrent.locks.ReentrantLock.lock(java.base@17.0.9/ReentrantLock.java:322)
	at org.apache.pulsar.functions.worker.SchedulerManager.close(SchedulerManager.java:744)
	- locked <0x000010002f450990> (a org.apache.pulsar.functions.worker.SchedulerManager)
	at org.apache.pulsar.functions.worker.PulsarWorkerService.stop(PulsarWorkerService.java:623)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:198)
	at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(java.base@17.0.9/Native Method)
	at jdk.internal.reflect.NativeMethodAccessorImpl.invoke(java.base@17.0.9/NativeMethodAccessorImpl.java:77)
	at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(java.base@17.0.9/DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(java.base@17.0.9/Method.java:568)
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
	at org.testng.TestRunner$$Lambda$261/0x00007fdbd023edf0.accept(Unknown Source)
	at java.util.ArrayList.forEach(java.base@17.0.9/ArrayList.java:1511)
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

