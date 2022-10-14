        
Flaky-test: org.apache.pulsar.packages.management.storage.bookkeeper.BookKeeperPackagesStorageTest.setUp
Number of failures: 1

org.apache.pulsar.packages.management.storage.bookkeeper.BookKeeperPackagesStorageTest is flaky. The setUp test method fails sporadically.

```
org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:102)
	at org.apache.bookkeeper.zookeeper.ZooKeeperWatcherBase.waitForConnection(ZooKeeperWatcherBase.java:159)
	at org.apache.bookkeeper.zookeeper.ZooKeeperClient$Builder.build(ZooKeeperClient.java:260)
	at org.apache.bookkeeper.test.ZooKeeperUtil.restartCluster(ZooKeeperUtil.java:133)
	at org.apache.bookkeeper.test.ZooKeeperUtil.startCluster(ZooKeeperUtil.java:104)
	at org.apache.pulsar.packages.management.storage.bookkeeper.bookkeeper.test.BookKeeperClusterTestCase.startZKCluster(BookKeeperClusterTestCase.java:238)
	at org.apache.pulsar.packages.management.storage.bookkeeper.bookkeeper.test.BookKeeperClusterTestCase.setUp(BookKeeperClusterTestCase.java:178)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-08-30T07:57:13.1356044Z](https://github.com/apache/pulsar/runs/8086225409?check_suite_focus=true#step:9:9655)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:102)
	at org.apache.bookkeeper.zookeeper.ZooKeeperWatcherBase.waitForConnection(ZooKeeperWatcherBase.java:159)
	at org.apache.bookkeeper.zookeeper.ZooKeeperClient$Builder.build(ZooKeeperClient.java:260)
	at org.apache.bookkeeper.test.ZooKeeperUtil.restartCluster(ZooKeeperUtil.java:133)
	at org.apache.bookkeeper.test.ZooKeeperUtil.startCluster(ZooKeeperUtil.java:104)
	at org.apache.pulsar.packages.management.storage.bookkeeper.bookkeeper.test.BookKeeperClusterTestCase.startZKCluster(BookKeeperClusterTestCase.java:238)
	at org.apache.pulsar.packages.management.storage.bookkeeper.bookkeeper.test.BookKeeperClusterTestCase.setUp(BookKeeperClusterTestCase.java:178)
	at org.apache.pulsar.packages.management.storage.bookkeeper.bookkeeper.test.BookKeeperClusterTestCase.setUp(BookKeeperClusterTestCase.java:166)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:527)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:99)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)

</pre></code>
</details>

