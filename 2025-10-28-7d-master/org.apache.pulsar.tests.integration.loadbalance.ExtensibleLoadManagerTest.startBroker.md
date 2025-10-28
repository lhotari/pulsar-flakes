        
Flaky-test: org.apache.pulsar.tests.integration.loadbalance.ExtensibleLoadManagerTest.startBroker
Number of failures: 2

org.apache.pulsar.tests.integration.loadbalance.ExtensibleLoadManagerTest is flaky. The startBroker test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Condition org.apache.pulsar.tests.integration.loadbalance.ExtensibleLoadManagerTest$$Lambda/0x0000000100725108 was not fulfilled within 2 minutes.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.tests.integration.loadbalance.ExtensibleLoadManagerTest.startBroker(ExtensibleLoadManagerTest.java:145)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-22T12:50:51.3447946Z](https://github.com/apache/pulsar/actions/runs/18715764552/job/53376572012#step:12:212)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition org.apache.pulsar.tests.integration.loadbalance.ExtensibleLoadManagerTest$$Lambda/0x0000000100725108 was not fulfilled within 2 minutes.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.tests.integration.loadbalance.ExtensibleLoadManagerTest.startBroker(ExtensibleLoadManagerTest.java:145)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
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
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:308)
	at org.apache.maven.surefire.testng.TestNGXmlTestSuite.execute(TestNGXmlTestSuite.java:71)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:113)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
Caused by: java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.FutureTask.get(FutureTask.java:204)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:101)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:81)
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:103)
	... 39 more

</pre></code>
</details>

```
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.tests.integration.loadbalance.ExtensibleLoadManagerTest was not fulfilled within 2 minutes.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.tests.integration.loadbalance.ExtensibleLoadManagerTest.startBroker(ExtensibleLoadManagerTest.java:145)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-25T06:48:01.8878590Z](https://github.com/apache/pulsar/actions/runs/18799108523/job/53644640088#step:12:199)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.tests.integration.loadbalance.ExtensibleLoadManagerTest was not fulfilled within 2 minutes.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.tests.integration.loadbalance.ExtensibleLoadManagerTest.startBroker(ExtensibleLoadManagerTest.java:145)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
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
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:308)
	at org.apache.maven.surefire.testng.TestNGXmlTestSuite.execute(TestNGXmlTestSuite.java:71)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:113)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
Caused by: java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.FutureTask.get(FutureTask.java:204)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:101)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:81)
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:103)
	... 41 more

</pre></code>
</details>

