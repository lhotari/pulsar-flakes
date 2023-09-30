        
Flaky-test: org.apache.bookkeeper.replication.AuditorBookieTest.setUp
Number of failures: 2

org.apache.bookkeeper.replication.AuditorBookieTest is flaky. The setUp test method fails sporadically.

```
java.io.IOException: Failed to initialize metadata client driver
	at org.apache.bookkeeper.client.BookKeeper.<init>(BookKeeper.java:460)
	at org.apache.bookkeeper.client.BookKeeperTestClient.<init>(BookKeeperTestClient.java:48)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startBKCluster(BookKeeperClusterTestCase.java:258)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.setUp(BookKeeperClusterTestCase.java:177)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-09-29T21:13:00.4526019Z](https://github.com/apache/pulsar/actions/runs/6354520087/job/17267761930#step:9:1918)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.io.IOException: Failed to initialize metadata client driver
	at org.apache.bookkeeper.client.BookKeeper.<init>(BookKeeper.java:460)
	at org.apache.bookkeeper.client.BookKeeperTestClient.<init>(BookKeeperTestClient.java:48)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startBKCluster(BookKeeperClusterTestCase.java:258)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.setUp(BookKeeperClusterTestCase.java:177)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.setUp(BookKeeperClusterTestCase.java:162)
	at org.apache.bookkeeper.replication.AuditorBookieTest.setUp(AuditorBookieTest.java:67)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:69)
	at org.testng.internal.invokers.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:361)
	at org.testng.internal.invokers.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:296)
	at org.testng.internal.invokers.TestInvoker.runConfigMethods(TestInvoker.java:823)
	at org.testng.internal.invokers.TestInvoker.invokeMethod(TestInvoker.java:590)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethod(TestInvoker.java:221)
	at org.testng.internal.invokers.MethodRunner.runInSequence(MethodRunner.java:50)
	at org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:969)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:194)
	at org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:148)
	at org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
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
Caused by: org.apache.bookkeeper.meta.exceptions.MetadataException: Failed to create zookeeper client to localhost:38465
	at org.apache.bookkeeper.meta.zk.ZKMetadataDriverBase.initialize(ZKMetadataDriverBase.java:235)
	at org.apache.bookkeeper.meta.zk.ZKMetadataClientDriver.initialize(ZKMetadataClientDriver.java:61)
	at org.apache.bookkeeper.client.BookKeeper.<init>(BookKeeper.java:450)
	... 43 more
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:102)
	at org.apache.bookkeeper.zookeeper.ZooKeeperWatcherBase.waitForConnection(ZooKeeperWatcherBase.java:159)
	at org.apache.bookkeeper.zookeeper.ZooKeeperClient$Builder.build(ZooKeeperClient.java:260)
	at org.apache.bookkeeper.meta.zk.ZKMetadataDriverBase.initialize(ZKMetadataDriverBase.java:215)
	... 45 more

</pre></code>
</details>

```
org.apache.bookkeeper.replication.ReplicationException$UnavailableException: Failed to create bookkeeper client
	at org.apache.bookkeeper.replication.Auditor.createBookKeeperClientThrowUnavailableException(Auditor.java:114)
	at org.apache.bookkeeper.replication.AuditorElector.<init>(AuditorElector.java:82)
	at org.apache.bookkeeper.replication.AuditorBookieTest.startAuditorElector(AuditorBookieTest.java:212)
	at org.apache.bookkeeper.replication.AuditorBookieTest.startAuditorElectors(AuditorBookieTest.java:223)
	at org.apache.bookkeeper.replication.AuditorBookieTest.setUp(AuditorBookieTest.java:72)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-09-29T17:01:37.6831643Z](https://github.com/apache/pulsar/actions/runs/6354520087/job/17261402005#step:10:1901)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.bookkeeper.replication.ReplicationException$UnavailableException: Failed to create bookkeeper client
	at org.apache.bookkeeper.replication.Auditor.createBookKeeperClientThrowUnavailableException(Auditor.java:114)
	at org.apache.bookkeeper.replication.AuditorElector.<init>(AuditorElector.java:82)
	at org.apache.bookkeeper.replication.AuditorBookieTest.startAuditorElector(AuditorBookieTest.java:212)
	at org.apache.bookkeeper.replication.AuditorBookieTest.startAuditorElectors(AuditorBookieTest.java:223)
	at org.apache.bookkeeper.replication.AuditorBookieTest.setUp(AuditorBookieTest.java:72)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:69)
	at org.testng.internal.invokers.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:361)
	at org.testng.internal.invokers.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:296)
	at org.testng.internal.invokers.TestInvoker.runConfigMethods(TestInvoker.java:823)
	at org.testng.internal.invokers.TestInvoker.invokeMethod(TestInvoker.java:590)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethod(TestInvoker.java:221)
	at org.testng.internal.invokers.MethodRunner.runInSequence(MethodRunner.java:50)
	at org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:969)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:194)
	at org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:148)
	at org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
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
Caused by: java.io.IOException: Failed to initialize metadata client driver
	at org.apache.bookkeeper.client.BookKeeper.<init>(BookKeeper.java:460)
	at org.apache.bookkeeper.client.BookKeeper$Builder.build(BookKeeper.java:303)
	at org.apache.bookkeeper.replication.Auditor.createBookKeeperClient(Auditor.java:100)
	at org.apache.bookkeeper.replication.Auditor.createBookKeeperClient(Auditor.java:92)
	at org.apache.bookkeeper.replication.Auditor.createBookKeeperClientThrowUnavailableException(Auditor.java:109)
	... 42 more
Caused by: org.apache.bookkeeper.meta.exceptions.MetadataException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.pulsar.metadata.bookkeeper.AbstractMetadataDriver.createMetadataStore(AbstractMetadataDriver.java:124)
	at org.apache.pulsar.metadata.bookkeeper.AbstractMetadataDriver.initialize(AbstractMetadataDriver.java:59)
	at org.apache.pulsar.metadata.bookkeeper.PulsarMetadataClientDriver.initialize(PulsarMetadataClientDriver.java:49)
	at org.apache.bookkeeper.client.BookKeeper.<init>(BookKeeper.java:450)
	... 46 more
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.<init>(ZKMetadataStore.java:111)
	at org.apache.pulsar.metadata.impl.ZkMetadataStoreProvider.create(ZKMetadataStore.java:634)
	at org.apache.pulsar.metadata.impl.MetadataStoreFactoryImpl.newInstance(MetadataStoreFactoryImpl.java:61)
	at org.apache.pulsar.metadata.impl.MetadataStoreFactoryImpl.createExtended(MetadataStoreFactoryImpl.java:48)
	at org.apache.pulsar.metadata.api.extended.MetadataStoreExtended.create(MetadataStoreExtended.java:42)
	at org.apache.pulsar.metadata.bookkeeper.AbstractMetadataDriver.createMetadataStore(AbstractMetadataDriver.java:117)
	... 49 more
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:102)
	at org.apache.bookkeeper.zookeeper.ZooKeeperWatcherBase.waitForConnection(ZooKeeperWatcherBase.java:159)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$Builder.build(PulsarZooKeeperClient.java:258)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.<init>(ZKMetadataStore.java:103)
	... 54 more

</pre></code>
</details>

