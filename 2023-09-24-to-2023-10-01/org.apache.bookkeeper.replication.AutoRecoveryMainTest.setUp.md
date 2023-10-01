        
Flaky-test: org.apache.bookkeeper.replication.AutoRecoveryMainTest.setUp
Number of failures: 2

org.apache.bookkeeper.replication.AutoRecoveryMainTest is flaky. The setUp test method fails sporadically.

```
java.net.BindException: Address already in use
	at java.base/sun.nio.ch.Net.bind0(Native Method)
	at java.base/sun.nio.ch.Net.bind(Net.java:555)
	at java.base/sun.nio.ch.ServerSocketChannelImpl.netBind(ServerSocketChannelImpl.java:337)
	at java.base/sun.nio.ch.ServerSocketChannelImpl.bind(ServerSocketChannelImpl.java:294)
	at java.base/sun.nio.ch.ServerSocketAdaptor.bind(ServerSocketAdaptor.java:89)
	at java.base/sun.nio.ch.ServerSocketAdaptor.bind(ServerSocketAdaptor.java:81)
	at org.apache.zookeeper.server.NIOServerCnxnFactory.configure(NIOServerCnxnFactory.java:662)
	at org.apache.zookeeper.server.ServerCnxnFactory.configure(ServerCnxnFactory.java:109)
	at org.apache.zookeeper.server.ServerCnxnFactory.configure(ServerCnxnFactory.java:105)
	at org.apache.bookkeeper.test.ZooKeeperUtil.restartCluster(ZooKeeperUtil.java:116)
	at org.apache.bookkeeper.test.ZooKeeperUtil.startCluster(ZooKeeperUtil.java:105)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startZKCluster(BookKeeperClusterTestCase.java:234)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.setUp(BookKeeperClusterTestCase.java:174)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-09-28T06:43:58.3300124Z](https://github.com/apache/pulsar/actions/runs/6335274338/job/17206522108#step:9:1890)  
[example failure 2023-09-25T13:51:37.1244626Z](https://github.com/apache/pulsar/actions/runs/6298312472/job/17102701263#step:9:1857)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.net.BindException: Address already in use
	at java.base/sun.nio.ch.Net.bind0(Native Method)
	at java.base/sun.nio.ch.Net.bind(Net.java:555)
	at java.base/sun.nio.ch.ServerSocketChannelImpl.netBind(ServerSocketChannelImpl.java:337)
	at java.base/sun.nio.ch.ServerSocketChannelImpl.bind(ServerSocketChannelImpl.java:294)
	at java.base/sun.nio.ch.ServerSocketAdaptor.bind(ServerSocketAdaptor.java:89)
	at java.base/sun.nio.ch.ServerSocketAdaptor.bind(ServerSocketAdaptor.java:81)
	at org.apache.zookeeper.server.NIOServerCnxnFactory.configure(NIOServerCnxnFactory.java:662)
	at org.apache.zookeeper.server.ServerCnxnFactory.configure(ServerCnxnFactory.java:109)
	at org.apache.zookeeper.server.ServerCnxnFactory.configure(ServerCnxnFactory.java:105)
	at org.apache.bookkeeper.test.ZooKeeperUtil.restartCluster(ZooKeeperUtil.java:116)
	at org.apache.bookkeeper.test.ZooKeeperUtil.startCluster(ZooKeeperUtil.java:105)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.startZKCluster(BookKeeperClusterTestCase.java:234)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.setUp(BookKeeperClusterTestCase.java:174)
	at org.apache.bookkeeper.test.BookKeeperClusterTestCase.setUp(BookKeeperClusterTestCase.java:162)
	at org.apache.bookkeeper.replication.AutoRecoveryMainTest.setUp(AutoRecoveryMainTest.java:55)
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

