        
Flaky-test: org.apache.bookkeeper.mledger.impl.ManagedLedgerBkTest.setUp
Number of failures: 1

org.apache.bookkeeper.mledger.impl.ManagedLedgerBkTest is flaky. The setUp test method fails sporadically.

```
java.io.IOException: Failed to initialize metadata client driver
	at org.apache.bookkeeper.client.BookKeeper.<init>(BookKeeper.java:464)
	at org.apache.bookkeeper.client.BookKeeperTestClient.<init>(BookKeeperTestClient.java:45)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startBKCluster(BookKeeperClusterTestCase.java:262)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.setUp(BookKeeperClusterTestCase.java:166)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-05T02:29:24.1388789Z](https://github.com/apache/pulsar/runs/7189141988?check_suite_focus=true#step:9:1744)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.io.IOException: Failed to initialize metadata client driver
	at org.apache.bookkeeper.client.BookKeeper.<init>(BookKeeper.java:464)
	at org.apache.bookkeeper.client.BookKeeperTestClient.<init>(BookKeeperTestClient.java:45)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startBKCluster(BookKeeperClusterTestCase.java:262)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.setUp(BookKeeperClusterTestCase.java:166)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.setUp(BookKeeperClusterTestCase.java:150)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.TestRunner.invokeTestConfigurations(TestRunner.java:617)
	at org.testng.TestRunner.beforeRun(TestRunner.java:607)
	at org.testng.TestRunner.run(TestRunner.java:578)
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
Caused by: org.apache.bookkeeper.meta.exceptions.MetadataException: Failed to create zookeeper client to localhost:43763
	at org.apache.bookkeeper.meta.zk.ZKMetadataDriverBase.initialize(ZKMetadataDriverBase.java:236)
	at org.apache.bookkeeper.meta.zk.ZKMetadataClientDriver.initialize(ZKMetadataClientDriver.java:63)
	at org.apache.bookkeeper.client.BookKeeper.<init>(BookKeeper.java:454)
	... 34 more
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:102)
	at org.apache.bookkeeper.zookeeper.ZooKeeperWatcherBase.waitForConnection(ZooKeeperWatcherBase.java:159)
	at org.apache.bookkeeper.zookeeper.ZooKeeperClient$Builder.build(ZooKeeperClient.java:260)
	at org.apache.bookkeeper.meta.zk.ZKMetadataDriverBase.initialize(ZKMetadataDriverBase.java:216)
	... 36 more

</pre></code>
</details>

