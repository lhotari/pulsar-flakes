        
Flaky-test: org.apache.bookkeeper.replication.TestReplicationWorker.setUp
Number of failures: 3

org.apache.bookkeeper.replication.TestReplicationWorker is flaky. The setUp test method fails sporadically.

```
org.apache.bookkeeper.bookie.BookieException$MetadataStoreException: Failed to initialize metadata bookie driver
	at org.apache.bookkeeper.bookie.BookieResources.createMetadataDriver(BookieResources.java:61)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase$ServerTester.<init>(BookKeeperClusterTestCase.java:848)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startBookie(BookKeeperClusterTestCase.java:673)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startAndAddBookie(BookKeeperClusterTestCase.java:653)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startNewBookieAndReturnAddress(BookKeeperClusterTestCase.java:642)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startNewBookie(BookKeeperClusterTestCase.java:635)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startBKCluster(BookKeeperClusterTestCase.java:263)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.setUp(BookKeeperClusterTestCase.java:177)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-09-29T17:04:18.4709789Z](https://github.com/apache/pulsar/actions/runs/6354520087/job/17261402005#step:10:1985)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.bookkeeper.bookie.BookieException$MetadataStoreException: Failed to initialize metadata bookie driver
	at org.apache.bookkeeper.bookie.BookieResources.createMetadataDriver(BookieResources.java:61)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase$ServerTester.<init>(BookKeeperClusterTestCase.java:848)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startBookie(BookKeeperClusterTestCase.java:673)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startAndAddBookie(BookKeeperClusterTestCase.java:653)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startNewBookieAndReturnAddress(BookKeeperClusterTestCase.java:642)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startNewBookie(BookKeeperClusterTestCase.java:635)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startBKCluster(BookKeeperClusterTestCase.java:263)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.setUp(BookKeeperClusterTestCase.java:177)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.setUp(BookKeeperClusterTestCase.java:162)
	at org.apache.bookkeeper.replication.TestReplicationWorker.setUp(TestReplicationWorker.java:143)
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
Caused by: org.apache.bookkeeper.meta.exceptions.MetadataException: Failed to create zookeeper client to localhost:43833
	at org.apache.bookkeeper.meta.zk.ZKMetadataDriverBase.initialize(ZKMetadataDriverBase.java:235)
	at org.apache.bookkeeper.meta.zk.ZKMetadataBookieDriver.initialize(ZKMetadataBookieDriver.java:55)
	at org.apache.bookkeeper.bookie.BookieResources.createMetadataDriver(BookieResources.java:58)
	... 47 more
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:102)
	at org.apache.bookkeeper.zookeeper.ZooKeeperWatcherBase.waitForConnection(ZooKeeperWatcherBase.java:159)
	at org.apache.bookkeeper.zookeeper.ZooKeeperClient$Builder.build(ZooKeeperClient.java:260)
	at org.apache.bookkeeper.meta.zk.ZKMetadataDriverBase.initialize(ZKMetadataDriverBase.java:215)
	... 49 more

</pre></code>
</details>

[example failure 2023-09-29T19:39:24.4928987Z](https://github.com/apache/pulsar/actions/runs/6354862390/job/17265470750#step:9:1926)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.bookkeeper.bookie.BookieException$MetadataStoreException: Failed to initialize metadata bookie driver
	at org.apache.bookkeeper.bookie.BookieResources.createMetadataDriver(BookieResources.java:61)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase$ServerTester.<init>(BookKeeperClusterTestCase.java:848)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startBookie(BookKeeperClusterTestCase.java:673)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startAndAddBookie(BookKeeperClusterTestCase.java:653)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startNewBookieAndReturnAddress(BookKeeperClusterTestCase.java:642)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startNewBookie(BookKeeperClusterTestCase.java:635)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startBKCluster(BookKeeperClusterTestCase.java:263)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.setUp(BookKeeperClusterTestCase.java:177)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.setUp(BookKeeperClusterTestCase.java:162)
	at org.apache.bookkeeper.replication.TestReplicationWorker.setUp(TestReplicationWorker.java:143)
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
Caused by: org.apache.bookkeeper.meta.exceptions.MetadataException: Failed to create zookeeper client to localhost:40745
	at org.apache.bookkeeper.meta.zk.ZKMetadataDriverBase.initialize(ZKMetadataDriverBase.java:235)
	at org.apache.bookkeeper.meta.zk.ZKMetadataBookieDriver.initialize(ZKMetadataBookieDriver.java:55)
	at org.apache.bookkeeper.bookie.BookieResources.createMetadataDriver(BookieResources.java:58)
	... 47 more
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:102)
	at org.apache.bookkeeper.zookeeper.ZooKeeperWatcherBase.waitForConnection(ZooKeeperWatcherBase.java:159)
	at org.apache.bookkeeper.zookeeper.ZooKeeperClient$Builder.build(ZooKeeperClient.java:260)
	at org.apache.bookkeeper.meta.zk.ZKMetadataDriverBase.initialize(ZKMetadataDriverBase.java:215)
	... 49 more

</pre></code>
</details>

```
org.apache.bookkeeper.meta.exceptions.MetadataException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.pulsar.metadata.bookkeeper.AbstractMetadataDriver.createMetadataStore(AbstractMetadataDriver.java:124)
	at org.apache.pulsar.metadata.bookkeeper.AbstractMetadataDriver.initialize(AbstractMetadataDriver.java:59)
	at org.apache.pulsar.metadata.bookkeeper.PulsarMetadataBookieDriver.initialize(PulsarMetadataBookieDriver.java:45)
	at org.apache.bookkeeper.replication.TestReplicationWorker.setUp(TestReplicationWorker.java:162)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-09-29T17:41:57.9814902Z](https://github.com/apache/pulsar/actions/runs/6354862390/job/17262448535#step:9:1920)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.bookkeeper.meta.exceptions.MetadataException: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.pulsar.metadata.bookkeeper.AbstractMetadataDriver.createMetadataStore(AbstractMetadataDriver.java:124)
	at org.apache.pulsar.metadata.bookkeeper.AbstractMetadataDriver.initialize(AbstractMetadataDriver.java:59)
	at org.apache.pulsar.metadata.bookkeeper.PulsarMetadataBookieDriver.initialize(PulsarMetadataBookieDriver.java:45)
	at org.apache.bookkeeper.replication.TestReplicationWorker.setUp(TestReplicationWorker.java:162)
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
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.<init>(ZKMetadataStore.java:111)
	at org.apache.pulsar.metadata.impl.ZkMetadataStoreProvider.create(ZKMetadataStore.java:634)
	at org.apache.pulsar.metadata.impl.MetadataStoreFactoryImpl.newInstance(MetadataStoreFactoryImpl.java:61)
	at org.apache.pulsar.metadata.impl.MetadataStoreFactoryImpl.createExtended(MetadataStoreFactoryImpl.java:48)
	at org.apache.pulsar.metadata.api.extended.MetadataStoreExtended.create(MetadataStoreExtended.java:42)
	at org.apache.pulsar.metadata.bookkeeper.AbstractMetadataDriver.createMetadataStore(AbstractMetadataDriver.java:117)
	... 41 more
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:102)
	at org.apache.bookkeeper.zookeeper.ZooKeeperWatcherBase.waitForConnection(ZooKeeperWatcherBase.java:159)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$Builder.build(PulsarZooKeeperClient.java:258)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.<init>(ZKMetadataStore.java:103)
	... 46 more

</pre></code>
</details>

