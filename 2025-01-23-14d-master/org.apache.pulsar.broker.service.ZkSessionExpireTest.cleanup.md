        
Flaky-test: org.apache.pulsar.broker.service.ZkSessionExpireTest.cleanup
Number of failures: 2

org.apache.pulsar.broker.service.ZkSessionExpireTest is flaky. The cleanup test method fails sporadically.

```
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$8(ZKMetadataStore.java:221)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$11(ZKMetadataStore.java:221)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:512)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:703)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:542)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:496)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$11(ZKMetadataStore.java:220)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-01-16T06:28:39.7723607Z](https://github.com/apache/pulsar/actions/runs/12803056997/job/35695140103#step:9:2236)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2194)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$8(ZKMetadataStore.java:221)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$11(ZKMetadataStore.java:221)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$3$1.processResult(PulsarZooKeeperClient.java:512)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:703)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:542)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:496)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$11(ZKMetadataStore.java:220)
	... 3 more
Caused by: org.apache.zookeeper.KeeperException$SessionExpiredException: KeeperErrorCode = Session expired
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:133)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:486)
	... 4 more

</pre></code>
</details>

```
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.TimeoutException
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:761)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:484)
	at org.apache.pulsar.broker.service.NetworkErrorTestBase.cleanup(NetworkErrorTestBase.java:215)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-01-21T12:34:42.2894992Z](https://github.com/apache/pulsar/actions/runs/12886647448/job/35928189485#step:11:1224)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.broker.PulsarServerException: java.util.concurrent.TimeoutException
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:761)
	at org.apache.pulsar.broker.PulsarService.close(PulsarService.java:484)
	at org.apache.pulsar.broker.service.NetworkErrorTestBase.cleanup(NetworkErrorTestBase.java:215)
	at org.apache.pulsar.broker.service.ZkSessionExpireTest.cleanup(ZkSessionExpireTest.java:51)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
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
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
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
Caused by: java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.CompletableFuture.timedGet(CompletableFuture.java:1960)
	at java.base/java.util.concurrent.CompletableFuture.get(CompletableFuture.java:2095)
	at org.apache.pulsar.metadata.coordination.impl.CoordinationServiceImpl.close(CoordinationServiceImpl.java:86)
	at org.apache.pulsar.broker.PulsarService.closeAsync(PulsarService.java:673)
	... 40 more

</pre></code>
</details>

