        
Flaky-test: org.apache.pulsar.broker.admin.TopicsTest.cleanup
Number of failures: 1

org.apache.pulsar.broker.admin.TopicsTest is flaky. The cleanup test method fails sporadically.

```
java.lang.ClassCastException: class org.apache.pulsar.broker.namespace.NamespaceService cannot be cast to class org.apache.pulsar.broker.ServiceConfiguration (org.apache.pulsar.broker.namespace.NamespaceService and org.apache.pulsar.broker.ServiceConfiguration are in unnamed module of loader 'app')
	at org.apache.pulsar.broker.PulsarService.getConfiguration(PulsarService.java:604)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.stopBroker(MockedPulsarServiceBaseTest.java:299)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalCleanup(MockedPulsarServiceBaseTest.java:239)
	at org.apache.pulsar.broker.admin.TopicsTest.cleanup(TopicsTest.java:124)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-05-27T11:13:49.9838780Z](https://github.com/apache/pulsar/runs/6623892679?check_suite_focus=true#step:10:755)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.ClassCastException: class org.apache.pulsar.broker.namespace.NamespaceService cannot be cast to class org.apache.pulsar.broker.ServiceConfiguration (org.apache.pulsar.broker.namespace.NamespaceService and org.apache.pulsar.broker.ServiceConfiguration are in unnamed module of loader 'app')
	at org.apache.pulsar.broker.PulsarService.getConfiguration(PulsarService.java:604)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.stopBroker(MockedPulsarServiceBaseTest.java:299)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalCleanup(MockedPulsarServiceBaseTest.java:239)
	at org.apache.pulsar.broker.admin.TopicsTest.cleanup(TopicsTest.java:124)
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

</pre></code>
</details>

