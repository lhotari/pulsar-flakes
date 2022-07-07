        
Flaky-test: org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown
Number of failures: 35

org.apache.pulsar.functions.worker.PulsarFunctionTlsTest is flaky. The tearDown test method fails sporadically.

```
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.TimeoutException
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:574)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:374)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:182)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-09T15:48:02.0352047Z](https://github.com/apache/pulsar/runs/6815624220?check_suite_focus=true#step:9:2226)  
[example failure 2022-06-09T15:34:31.1727701Z](https://github.com/apache/pulsar/runs/6815624220?check_suite_focus=true#step:9:1240)  
[example failure 2022-06-07T11:12:24.9601776Z](https://github.com/apache/pulsar/runs/6772457383?check_suite_focus=true#step:10:2218)  
[example failure 2022-06-07T10:58:16.5055684Z](https://github.com/apache/pulsar/runs/6772457383?check_suite_focus=true#step:10:1226)  
[example failure 2022-06-06T05:30:28.4426440Z](https://github.com/apache/pulsar/runs/6750449828?check_suite_focus=true#step:10:1227)  
[example failure 2022-06-06T01:03:48.9587656Z](https://github.com/apache/pulsar/runs/6748368455?check_suite_focus=true#step:9:3210)  
[example failure 2022-06-06T00:48:57.9919365Z](https://github.com/apache/pulsar/runs/6748368455?check_suite_focus=true#step:9:2220)  
[example failure 2022-06-04T19:29:20.8489376Z](https://github.com/apache/pulsar/runs/6740218746?check_suite_focus=true#step:10:1221)  
[example failure 2022-06-03T01:20:54.2397925Z](https://github.com/apache/pulsar/runs/6718696587?check_suite_focus=true#step:9:1242)  
[example failure 2022-06-02T12:58:58.9465336Z](https://github.com/apache/pulsar/runs/6708538168?check_suite_focus=true#step:9:1242)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.TimeoutException
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:574)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:374)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:182)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.CompletableFuture.timedGet(CompletableFuture.java:1960)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2095)
	at org.apache.pulsar.metadata.coordination.impl.CoordinationServiceImpl.close(CoordinationServiceImpl.java:75)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:527)
	... 41 more

</pre></code>
</details>

```
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.TimeoutException
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:576)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:376)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:182)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-08T23:56:01.3713493Z](https://github.com/apache/pulsar/runs/6803688686?check_suite_focus=true#step:9:1246)  
[example failure 2022-06-08T08:23:09.1725036Z](https://github.com/apache/pulsar/runs/6789070745?check_suite_focus=true#step:10:3198)  
[example failure 2022-06-08T08:10:05.9663433Z](https://github.com/apache/pulsar/runs/6789070745?check_suite_focus=true#step:10:2213)  
[example failure 2022-06-08T07:54:49.5044414Z](https://github.com/apache/pulsar/runs/6789070745?check_suite_focus=true#step:10:1226)  
[example failure 2022-06-08T04:35:42.6579959Z](https://github.com/apache/pulsar/runs/6786847315?check_suite_focus=true#step:9:2232)  
[example failure 2022-06-08T04:22:26.0194516Z](https://github.com/apache/pulsar/runs/6786847315?check_suite_focus=true#step:9:1246)  
[example failure 2022-06-07T18:15:42.0281886Z](https://github.com/apache/pulsar/runs/6779510774?check_suite_focus=true#step:9:3203)  
[example failure 2022-06-07T18:02:00.6745082Z](https://github.com/apache/pulsar/runs/6779510774?check_suite_focus=true#step:9:2217)  
[example failure 2022-06-07T17:50:50.4123669Z](https://github.com/apache/pulsar/runs/6779510774?check_suite_focus=true#step:9:1232)  
[example failure 2022-06-07T13:47:28.5169436Z](https://github.com/apache/pulsar/runs/6775045013?check_suite_focus=true#step:10:1231)  
[example failure 2022-06-06T10:51:55.7645942Z](https://github.com/apache/pulsar/runs/6753816728?check_suite_focus=true#step:9:2226)  
[example failure 2022-06-06T10:39:44.6184123Z](https://github.com/apache/pulsar/runs/6753816728?check_suite_focus=true#step:9:1247)  
[example failure 2022-06-06T10:19:56.1397625Z](https://github.com/apache/pulsar/runs/6753585879?check_suite_focus=true#step:9:1246)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.TimeoutException
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:576)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:376)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:182)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.CompletableFuture.timedGet(CompletableFuture.java:1960)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2095)
	at org.apache.pulsar.metadata.coordination.impl.CoordinationServiceImpl.close(CoordinationServiceImpl.java:75)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:529)
	... 41 more

</pre></code>
</details>

```
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.TimeoutException
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:581)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:380)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:185)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-04T14:49:52.7333544Z](https://github.com/apache/pulsar/runs/7182606988?check_suite_focus=true#step:10:1268)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.TimeoutException
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:581)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:380)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:185)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.CompletableFuture.timedGet(CompletableFuture.java:1960)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2095)
	at org.apache.pulsar.metadata.coordination.impl.CoordinationServiceImpl.close(CoordinationServiceImpl.java:75)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:533)
	... 41 more

</pre></code>
</details>

```
   java.lang.Thread.State: WAITING (parking)
	at jdk.internal.misc.Unsafe.park(java.base@17.0.3/Native Method)
	- parking to wait for  <0x00000000e6158210> (a java.util.concurrent.CompletableFuture$Signaller)
	at java.util.concurrent.locks.LockSupport.park(java.base@17.0.3/LockSupport.java:211)
	at java.util.concurrent.CompletableFuture$Signaller.block(java.base@17.0.3/CompletableFuture.java:1864)
	at java.util.concurrent.ForkJoinPool.unmanagedBlock(java.base@17.0.3/ForkJoinPool.java:3463)
	at java.util.concurrent.ForkJoinPool.managedBlock(java.base@17.0.3/ForkJoinPool.java:3434)
	at java.util.concurrent.CompletableFuture.waitingGet(java.base@17.0.3/CompletableFuture.java:1898)
	at java.util.concurrent.CompletableFuture.join(java.base@17.0.3/CompletableFuture.java:2117)
	at org.apache.pulsar.metadata.coordination.impl.LockManagerImpl.close(LockManagerImpl.java:163)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerImpl.stop(ModularLoadManagerImpl.java:957)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerWrapper.stop(ModularLoadManagerWrapper.java:118)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:514)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:376)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:182)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-08T05:09:58.1265983Z](https://github.com/apache/pulsar/runs/6786847315?check_suite_focus=true#step:10:95)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
   java.lang.Thread.State: WAITING (parking)
	at jdk.internal.misc.Unsafe.park(java.base@17.0.3/Native Method)
	- parking to wait for  <0x00000000e6158210> (a java.util.concurrent.CompletableFuture$Signaller)
	at java.util.concurrent.locks.LockSupport.park(java.base@17.0.3/LockSupport.java:211)
	at java.util.concurrent.CompletableFuture$Signaller.block(java.base@17.0.3/CompletableFuture.java:1864)
	at java.util.concurrent.ForkJoinPool.unmanagedBlock(java.base@17.0.3/ForkJoinPool.java:3463)
	at java.util.concurrent.ForkJoinPool.managedBlock(java.base@17.0.3/ForkJoinPool.java:3434)
	at java.util.concurrent.CompletableFuture.waitingGet(java.base@17.0.3/CompletableFuture.java:1898)
	at java.util.concurrent.CompletableFuture.join(java.base@17.0.3/CompletableFuture.java:2117)
	at org.apache.pulsar.metadata.coordination.impl.LockManagerImpl.close(LockManagerImpl.java:163)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerImpl.stop(ModularLoadManagerImpl.java:957)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerWrapper.stop(ModularLoadManagerWrapper.java:118)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:514)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:376)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:182)
	at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(java.base@17.0.3/Native Method)
	at jdk.internal.reflect.NativeMethodAccessorImpl.invoke(java.base@17.0.3/NativeMethodAccessorImpl.java:77)
	at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(java.base@17.0.3/DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(java.base@17.0.3/Method.java:568)
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
	at org.testng.TestRunner$$Lambda$191/0x0000000800ddac48.accept(Unknown Source)
	at java.util.ArrayList.forEach(java.base@17.0.3/ArrayList.java:1511)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
</pre></code>
</details>

```
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.ExecutionException: java.lang.IllegalStateException: Metadata store is getting closed
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:576)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:376)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:182)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-08T14:48:40.0516447Z](https://github.com/apache/pulsar/runs/6795778949?check_suite_focus=true#step:10:1226)  
[example failure 2022-06-07T01:31:08.0201302Z](https://github.com/apache/pulsar/runs/6765945494?check_suite_focus=true#step:9:1240)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.ExecutionException: java.lang.IllegalStateException: Metadata store is getting closed
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:576)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:376)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:182)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: java.util.concurrent.ExecutionException: java.lang.IllegalStateException: Metadata store is getting closed
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2096)
	at org.apache.pulsar.metadata.coordination.impl.CoordinationServiceImpl.close(CoordinationServiceImpl.java:75)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:529)
	... 41 more
Caused by: java.lang.IllegalStateException: Metadata store is getting closed
	at org.apache.pulsar.metadata.impl.batching.AbstractBatchedMetadataStore.close(AbstractBatchedMetadataStore.java:77)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.close(ZKMetadataStore.java:412)
	at org.apache.pulsar.broker.PulsarService.closeMetadataServiceSession(PulsarService.java:370)
	at org.apache.pulsar.broker.PulsarService.shutdownNow(PulsarService.java:1745)
	at org.apache.pulsar.functions.worker.ErrorNotifierShutdownServiceImpl.triggerError(ErrorNotifierShutdownServiceImpl.java:37)
	at org.apache.pulsar.functions.worker.SchedulerManager.lambda$scheduleInternal$0(SchedulerManager.java:214)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

```
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.ExecutionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:574)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:374)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:182)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-06T00:36:17.4868390Z](https://github.com/apache/pulsar/runs/6748368455?check_suite_focus=true#step:9:1225)  
[example failure 2022-06-05T06:33:43.4022294Z](https://github.com/apache/pulsar/runs/6743227728?check_suite_focus=true#step:10:1222)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.ExecutionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:574)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:374)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:182)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2096)
	at org.apache.pulsar.metadata.coordination.impl.CoordinationServiceImpl.close(CoordinationServiceImpl.java:75)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:527)
	... 41 more
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:432)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$6(ZKMetadataStore.java:164)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:490)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:714)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:134)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:422)
	... 4 more

</pre></code>
</details>

```
   java.lang.Thread.State: WAITING (parking)
	at jdk.internal.misc.Unsafe.park(java.base@17.0.3/Native Method)
	- parking to wait for  <0x00000000c5d00010> (a java.util.concurrent.CompletableFuture$Signaller)
	at java.util.concurrent.locks.LockSupport.park(java.base@17.0.3/LockSupport.java:211)
	at java.util.concurrent.CompletableFuture$Signaller.block(java.base@17.0.3/CompletableFuture.java:1864)
	at java.util.concurrent.ForkJoinPool.unmanagedBlock(java.base@17.0.3/ForkJoinPool.java:3463)
	at java.util.concurrent.ForkJoinPool.managedBlock(java.base@17.0.3/ForkJoinPool.java:3434)
	at java.util.concurrent.CompletableFuture.waitingGet(java.base@17.0.3/CompletableFuture.java:1898)
	at java.util.concurrent.CompletableFuture.join(java.base@17.0.3/CompletableFuture.java:2117)
	at org.apache.pulsar.metadata.coordination.impl.LockManagerImpl.close(LockManagerImpl.java:163)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerImpl.stop(ModularLoadManagerImpl.java:957)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerWrapper.stop(ModularLoadManagerWrapper.java:118)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:514)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:376)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:182)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-07T07:53:59.5586583Z](https://github.com/apache/pulsar/runs/6768926853?check_suite_focus=true#step:11:563)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
   java.lang.Thread.State: WAITING (parking)
	at jdk.internal.misc.Unsafe.park(java.base@17.0.3/Native Method)
	- parking to wait for  <0x00000000c5d00010> (a java.util.concurrent.CompletableFuture$Signaller)
	at java.util.concurrent.locks.LockSupport.park(java.base@17.0.3/LockSupport.java:211)
	at java.util.concurrent.CompletableFuture$Signaller.block(java.base@17.0.3/CompletableFuture.java:1864)
	at java.util.concurrent.ForkJoinPool.unmanagedBlock(java.base@17.0.3/ForkJoinPool.java:3463)
	at java.util.concurrent.ForkJoinPool.managedBlock(java.base@17.0.3/ForkJoinPool.java:3434)
	at java.util.concurrent.CompletableFuture.waitingGet(java.base@17.0.3/CompletableFuture.java:1898)
	at java.util.concurrent.CompletableFuture.join(java.base@17.0.3/CompletableFuture.java:2117)
	at org.apache.pulsar.metadata.coordination.impl.LockManagerImpl.close(LockManagerImpl.java:163)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerImpl.stop(ModularLoadManagerImpl.java:957)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerWrapper.stop(ModularLoadManagerWrapper.java:118)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:514)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:376)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:182)
	at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(java.base@17.0.3/Native Method)
	at jdk.internal.reflect.NativeMethodAccessorImpl.invoke(java.base@17.0.3/NativeMethodAccessorImpl.java:77)
	at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(java.base@17.0.3/DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(java.base@17.0.3/Method.java:568)
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
	at org.testng.TestRunner$$Lambda$192/0x0000000800dcb378.accept(Unknown Source)
	at java.util.ArrayList.forEach(java.base@17.0.3/ArrayList.java:1511)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
</pre></code>
</details>

```
   java.lang.Thread.State: WAITING (parking)
	at jdk.internal.misc.Unsafe.park(java.base@17.0.3/Native Method)
	- parking to wait for  <0x00000000c8aab210> (a java.util.concurrent.CompletableFuture$Signaller)
	at java.util.concurrent.locks.LockSupport.park(java.base@17.0.3/LockSupport.java:211)
	at java.util.concurrent.CompletableFuture$Signaller.block(java.base@17.0.3/CompletableFuture.java:1864)
	at java.util.concurrent.ForkJoinPool.unmanagedBlock(java.base@17.0.3/ForkJoinPool.java:3463)
	at java.util.concurrent.ForkJoinPool.managedBlock(java.base@17.0.3/ForkJoinPool.java:3434)
	at java.util.concurrent.CompletableFuture.waitingGet(java.base@17.0.3/CompletableFuture.java:1898)
	at java.util.concurrent.CompletableFuture.join(java.base@17.0.3/CompletableFuture.java:2117)
	at org.apache.pulsar.metadata.coordination.impl.LockManagerImpl.close(LockManagerImpl.java:163)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerImpl.stop(ModularLoadManagerImpl.java:957)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerWrapper.stop(ModularLoadManagerWrapper.java:118)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:508)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:374)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:182)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-01T13:44:20.8929121Z](https://github.com/apache/pulsar/runs/6688903389?check_suite_focus=true#step:11:84)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
   java.lang.Thread.State: WAITING (parking)
	at jdk.internal.misc.Unsafe.park(java.base@17.0.3/Native Method)
	- parking to wait for  <0x00000000c8aab210> (a java.util.concurrent.CompletableFuture$Signaller)
	at java.util.concurrent.locks.LockSupport.park(java.base@17.0.3/LockSupport.java:211)
	at java.util.concurrent.CompletableFuture$Signaller.block(java.base@17.0.3/CompletableFuture.java:1864)
	at java.util.concurrent.ForkJoinPool.unmanagedBlock(java.base@17.0.3/ForkJoinPool.java:3463)
	at java.util.concurrent.ForkJoinPool.managedBlock(java.base@17.0.3/ForkJoinPool.java:3434)
	at java.util.concurrent.CompletableFuture.waitingGet(java.base@17.0.3/CompletableFuture.java:1898)
	at java.util.concurrent.CompletableFuture.join(java.base@17.0.3/CompletableFuture.java:2117)
	at org.apache.pulsar.metadata.coordination.impl.LockManagerImpl.close(LockManagerImpl.java:163)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerImpl.stop(ModularLoadManagerImpl.java:957)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerWrapper.stop(ModularLoadManagerWrapper.java:118)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:508)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:374)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:182)
	at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(java.base@17.0.3/Native Method)
	at jdk.internal.reflect.NativeMethodAccessorImpl.invoke(java.base@17.0.3/NativeMethodAccessorImpl.java:77)
	at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(java.base@17.0.3/DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(java.base@17.0.3/Method.java:568)
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
	at org.testng.TestRunner$$Lambda$191/0x0000000800dce9b8.accept(Unknown Source)
	at java.util.ArrayList.forEach(java.base@17.0.3/ArrayList.java:1511)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
</pre></code>
</details>

```
   java.lang.Thread.State: WAITING (parking)
	at jdk.internal.misc.Unsafe.park(java.base@17.0.3/Native Method)
	- parking to wait for  <0x00000000c38000a0> (a java.util.concurrent.CompletableFuture$Signaller)
	at java.util.concurrent.locks.LockSupport.park(java.base@17.0.3/LockSupport.java:211)
	at java.util.concurrent.CompletableFuture$Signaller.block(java.base@17.0.3/CompletableFuture.java:1864)
	at java.util.concurrent.ForkJoinPool.unmanagedBlock(java.base@17.0.3/ForkJoinPool.java:3463)
	at java.util.concurrent.ForkJoinPool.managedBlock(java.base@17.0.3/ForkJoinPool.java:3434)
	at java.util.concurrent.CompletableFuture.waitingGet(java.base@17.0.3/CompletableFuture.java:1898)
	at java.util.concurrent.CompletableFuture.join(java.base@17.0.3/CompletableFuture.java:2117)
	at org.apache.pulsar.metadata.coordination.impl.LockManagerImpl.close(LockManagerImpl.java:163)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerImpl.stop(ModularLoadManagerImpl.java:957)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerWrapper.stop(ModularLoadManagerWrapper.java:118)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:508)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:374)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:182)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-02T13:22:29.2909724Z](https://github.com/apache/pulsar/runs/6708178534?check_suite_focus=true#step:10:545)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
   java.lang.Thread.State: WAITING (parking)
	at jdk.internal.misc.Unsafe.park(java.base@17.0.3/Native Method)
	- parking to wait for  <0x00000000c38000a0> (a java.util.concurrent.CompletableFuture$Signaller)
	at java.util.concurrent.locks.LockSupport.park(java.base@17.0.3/LockSupport.java:211)
	at java.util.concurrent.CompletableFuture$Signaller.block(java.base@17.0.3/CompletableFuture.java:1864)
	at java.util.concurrent.ForkJoinPool.unmanagedBlock(java.base@17.0.3/ForkJoinPool.java:3463)
	at java.util.concurrent.ForkJoinPool.managedBlock(java.base@17.0.3/ForkJoinPool.java:3434)
	at java.util.concurrent.CompletableFuture.waitingGet(java.base@17.0.3/CompletableFuture.java:1898)
	at java.util.concurrent.CompletableFuture.join(java.base@17.0.3/CompletableFuture.java:2117)
	at org.apache.pulsar.metadata.coordination.impl.LockManagerImpl.close(LockManagerImpl.java:163)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerImpl.stop(ModularLoadManagerImpl.java:957)
	at org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerWrapper.stop(ModularLoadManagerWrapper.java:118)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:508)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:374)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:182)
	at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(java.base@17.0.3/Native Method)
	at jdk.internal.reflect.NativeMethodAccessorImpl.invoke(java.base@17.0.3/NativeMethodAccessorImpl.java:77)
	at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(java.base@17.0.3/DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(java.base@17.0.3/Method.java:568)
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
	at org.testng.TestRunner$$Lambda$195/0x0000000800df4dd8.accept(Unknown Source)
	at java.util.ArrayList.forEach(java.base@17.0.3/ArrayList.java:1511)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
</pre></code>
</details>

```
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.TimeoutException
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:576)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:376)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:185)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-04T01:46:44.7568401Z](https://github.com/apache/pulsar/runs/7172840444?check_suite_focus=true#step:10:1259)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.TimeoutException
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:576)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:376)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:185)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.CompletableFuture.timedGet(CompletableFuture.java:1960)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2095)
	at org.apache.pulsar.metadata.coordination.impl.CoordinationServiceImpl.close(CoordinationServiceImpl.java:75)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:529)
	... 41 more

</pre></code>
</details>

```
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.ExecutionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:576)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:376)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:182)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-06T12:16:46.4966180Z](https://github.com/apache/pulsar/runs/6755044529?check_suite_focus=true#step:9:1240)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.ExecutionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:576)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:376)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:182)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: java.util.concurrent.ExecutionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at java.base/java.util.concurrent.CompletableFuture.reportGet(CompletableFuture.java:396)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2096)
	at org.apache.pulsar.metadata.coordination.impl.CoordinationServiceImpl.close(CoordinationServiceImpl.java:75)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:529)
	... 41 more
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:432)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$6(ZKMetadataStore.java:164)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:490)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:714)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:553)
Caused by: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:134)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:422)
	... 4 more

</pre></code>
</details>

```
   java.lang.Thread.State: WAITING (parking)
	at jdk.internal.misc.Unsafe.park(java.base@17.0.3/Native Method)
	- parking to wait for  <0x00000000db880030> (a java.util.concurrent.CountDownLatch$Sync)
	at java.util.concurrent.locks.LockSupport.park(java.base@17.0.3/LockSupport.java:211)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer.acquire(java.base@17.0.3/AbstractQueuedSynchronizer.java:715)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(java.base@17.0.3/AbstractQueuedSynchronizer.java:1047)
	at java.util.concurrent.CountDownLatch.await(java.base@17.0.3/CountDownLatch.java:230)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerFactoryImpl.shutdown(ManagedLedgerFactoryImpl.java:635)
	at org.apache.pulsar.broker.ManagedLedgerClientFactory.close(ManagedLedgerClientFactory.java:134)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:460)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:374)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:182)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-06T06:09:41.3227564Z](https://github.com/apache/pulsar/runs/6750401232?check_suite_focus=true#step:10:545)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
   java.lang.Thread.State: WAITING (parking)
	at jdk.internal.misc.Unsafe.park(java.base@17.0.3/Native Method)
	- parking to wait for  <0x00000000db880030> (a java.util.concurrent.CountDownLatch$Sync)
	at java.util.concurrent.locks.LockSupport.park(java.base@17.0.3/LockSupport.java:211)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer.acquire(java.base@17.0.3/AbstractQueuedSynchronizer.java:715)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer.acquireSharedInterruptibly(java.base@17.0.3/AbstractQueuedSynchronizer.java:1047)
	at java.util.concurrent.CountDownLatch.await(java.base@17.0.3/CountDownLatch.java:230)
	at org.apache.bookkeeper.mledger.impl.ManagedLedgerFactoryImpl.shutdown(ManagedLedgerFactoryImpl.java:635)
	at org.apache.pulsar.broker.ManagedLedgerClientFactory.close(ManagedLedgerClientFactory.java:134)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:460)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:374)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.tearDown(PulsarFunctionTlsTest.java:182)
	at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(java.base@17.0.3/Native Method)
	at jdk.internal.reflect.NativeMethodAccessorImpl.invoke(java.base@17.0.3/NativeMethodAccessorImpl.java:77)
	at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(java.base@17.0.3/DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(java.base@17.0.3/Method.java:568)
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
	at org.testng.TestRunner$$Lambda$195/0x0000000800df47a8.accept(Unknown Source)
	at java.util.ArrayList.forEach(java.base@17.0.3/ArrayList.java:1511)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
</pre></code>
</details>

