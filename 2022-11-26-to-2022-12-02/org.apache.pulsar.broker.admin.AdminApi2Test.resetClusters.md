        
Flaky-test: org.apache.pulsar.broker.admin.AdminApi2Test.resetClusters
Number of failures: 1

org.apache.pulsar.broker.admin.AdminApi2Test is flaky. The resetClusters test method fails sporadically.

```
org.testcontainers.shaded.org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest was not fulfilled within 5 seconds.
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceWithRetry(MockedPulsarServiceBaseTest.java:702)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceWithRetry(MockedPulsarServiceBaseTest.java:693)
	at org.apache.pulsar.broker.admin.AdminApi2Test.resetClusters(AdminApi2Test.java:167)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-11-29T02:30:50.6643048Z](https://github.com/apache/pulsar/actions/runs/3570321875/jobs/6001306039#step:10:1331)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testcontainers.shaded.org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest was not fulfilled within 5 seconds.
	at org.testcontainers.shaded.org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.testcontainers.shaded.org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.testcontainers.shaded.org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceWithRetry(MockedPulsarServiceBaseTest.java:702)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceWithRetry(MockedPulsarServiceBaseTest.java:693)
	at org.apache.pulsar.broker.admin.AdminApi2Test.resetClusters(AdminApi2Test.java:167)
	at jdk.internal.reflect.GeneratedMethodAccessor235.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:69)
	at org.testng.internal.invokers.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:361)
	at org.testng.internal.invokers.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:296)
	at org.testng.internal.invokers.TestInvoker.runConfigMethods(TestInvoker.java:816)
	at org.testng.internal.invokers.TestInvoker.runAfterConfigurations(TestInvoker.java:785)
	at org.testng.internal.invokers.TestInvoker.invokeMethod(TestInvoker.java:761)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethod(TestInvoker.java:221)
	at org.testng.internal.invokers.MethodRunner.runInSequence(MethodRunner.java:50)
	at org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:962)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:194)
	at org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:148)
	at org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:806)
	at org.testng.TestRunner.run(TestRunner.java:601)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:433)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:427)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:387)
	at org.testng.SuiteRunner.run(SuiteRunner.java:330)
	at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
	at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:95)
	at org.testng.TestNG.runSuitesSequentially(TestNG.java:1256)
	at org.testng.TestNG.runSuitesLocally(TestNG.java:1176)
	at org.testng.TestNG.runSuites(TestNG.java:1099)
	at org.testng.TestNG.run(TestNG.java:1067)
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

