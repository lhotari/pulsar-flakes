        
Flaky-test: org.apache.pulsar.tests.integration.cli.ClusterMetadataTearDownTest.stateCheck
Number of failures: 1

org.apache.pulsar.tests.integration.cli.ClusterMetadataTearDownTest is flaky. The stateCheck test method fails sporadically.

```
org.apache.bookkeeper.meta.exceptions.MetadataException: Failed to initialized ledger manager factory
	at org.apache.bookkeeper.meta.zk.ZKMetadataDriverBase.getLedgerManagerFactory(ZKMetadataDriverBase.java:262)
	at org.apache.pulsar.tests.integration.cli.ClusterMetadataTearDownTest.setup(ClusterMetadataTearDownTest.java:107)
	at org.apache.pulsar.tests.TestRetrySupport.stateCheck(TestRetrySupport.java:60)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-11-08T11:17:47.4757439Z](https://github.com/apache/pulsar/actions/runs/6797173293/job/18479363687#step:12:6417)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.bookkeeper.meta.exceptions.MetadataException: Failed to initialized ledger manager factory
	at org.apache.bookkeeper.meta.zk.ZKMetadataDriverBase.getLedgerManagerFactory(ZKMetadataDriverBase.java:262)
	at org.apache.pulsar.tests.integration.cli.ClusterMetadataTearDownTest.setup(ClusterMetadataTearDownTest.java:107)
	at org.apache.pulsar.tests.TestRetrySupport.stateCheck(TestRetrySupport.java:60)
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
	at org.testng.internal.invokers.TestInvoker.retryFailed(TestInvoker.java:263)
	at org.testng.internal.invokers.MethodRunner.runInSequence(MethodRunner.java:62)
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
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:308)
	at org.apache.maven.surefire.testng.TestNGXmlTestSuite.execute(TestNGXmlTestSuite.java:71)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:113)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
Caused by: java.io.IOException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /ledgers/LAYOUT
	at org.apache.bookkeeper.meta.ZkLayoutManager.storeLedgerLayout(ZkLayoutManager.java:86)
	at org.apache.bookkeeper.meta.AbstractZkLedgerManagerFactory.createNewLMFactory(AbstractZkLedgerManagerFactory.java:337)
	at org.apache.bookkeeper.meta.AbstractZkLedgerManagerFactory.newLedgerManagerFactory(AbstractZkLedgerManagerFactory.java:180)
	at org.apache.bookkeeper.meta.zk.ZKMetadataDriverBase.getLedgerManagerFactory(ZKMetadataDriverBase.java:258)
	... 38 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /ledgers/LAYOUT
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.zookeeper.ZooKeeper.create(ZooKeeper.java:1347)
	at org.apache.bookkeeper.zookeeper.ZooKeeperClient.access$1901(ZooKeeperClient.java:70)
	at org.apache.bookkeeper.zookeeper.ZooKeeperClient$9.call(ZooKeeperClient.java:714)
	at org.apache.bookkeeper.zookeeper.ZooKeeperClient$9.call(ZooKeeperClient.java:708)
	at org.apache.bookkeeper.zookeeper.ZooWorker.syncCallWithRetries(ZooWorker.java:140)
	at org.apache.bookkeeper.zookeeper.ZooKeeperClient.create(ZooKeeperClient.java:708)
	at org.apache.bookkeeper.meta.ZkLayoutManager.storeLedgerLayout(ZkLayoutManager.java:81)
	... 41 more

</pre></code>
</details>

