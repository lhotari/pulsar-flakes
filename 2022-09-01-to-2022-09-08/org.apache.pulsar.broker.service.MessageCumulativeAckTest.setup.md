        
Flaky-test: org.apache.pulsar.broker.service.MessageCumulativeAckTest.setup
Number of failures: 3

org.apache.pulsar.broker.service.MessageCumulativeAckTest is flaky. The setup test method fails sporadically.

```
java.lang.ClassCastException: class org.apache.pulsar.broker.service.BrokerService cannot be cast to class org.apache.pulsar.broker.resources.PulsarResources (org.apache.pulsar.broker.service.BrokerService and org.apache.pulsar.broker.resources.PulsarResources are in unnamed module of loader 'app')
	at org.apache.pulsar.broker.PulsarService.getPulsarResources(PulsarService.java:262)
	at org.apache.pulsar.broker.service.persistent.DispatchRateLimiter.getPolicies(DispatchRateLimiter.java:366)
	at org.apache.pulsar.broker.service.persistent.DispatchRateLimiter.isDispatchRateNeeded(DispatchRateLimiter.java:217)
	at org.apache.pulsar.broker.service.persistent.PersistentTopic.initializeRateLimiterIfNeeded(PersistentTopic.java:374)
	at org.apache.pulsar.broker.service.persistent.PersistentTopic.<init>(PersistentTopic.java:263)
	at org.apache.pulsar.broker.service.MessageCumulativeAckTest.setup(MessageCumulativeAckTest.java:113)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-13T16:29:49.7698417Z](https://github.com/apache/pulsar/runs/7323465977?check_suite_focus=true#step:9:3782)  
[example failure 2022-07-13T16:11:02.4586673Z](https://github.com/apache/pulsar/runs/7323465977?check_suite_focus=true#step:9:2848)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.ClassCastException: class org.apache.pulsar.broker.service.BrokerService cannot be cast to class org.apache.pulsar.broker.resources.PulsarResources (org.apache.pulsar.broker.service.BrokerService and org.apache.pulsar.broker.resources.PulsarResources are in unnamed module of loader 'app')
	at org.apache.pulsar.broker.PulsarService.getPulsarResources(PulsarService.java:262)
	at org.apache.pulsar.broker.service.persistent.DispatchRateLimiter.getPolicies(DispatchRateLimiter.java:366)
	at org.apache.pulsar.broker.service.persistent.DispatchRateLimiter.isDispatchRateNeeded(DispatchRateLimiter.java:217)
	at org.apache.pulsar.broker.service.persistent.PersistentTopic.initializeRateLimiterIfNeeded(PersistentTopic.java:374)
	at org.apache.pulsar.broker.service.persistent.PersistentTopic.<init>(PersistentTopic.java:263)
	at org.apache.pulsar.broker.service.MessageCumulativeAckTest.setup(MessageCumulativeAckTest.java:113)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
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
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
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

```
java.lang.ClassCastException: class org.apache.pulsar.broker.service.BrokerService cannot be cast to class org.apache.pulsar.broker.resources.PulsarResources (org.apache.pulsar.broker.service.BrokerService and org.apache.pulsar.broker.resources.PulsarResources are in unnamed module of loader 'app')
	at org.apache.pulsar.broker.PulsarService.getPulsarResources(PulsarService.java:260)
	at org.apache.pulsar.broker.service.persistent.DispatchRateLimiter.getPolicies(DispatchRateLimiter.java:363)
	at org.apache.pulsar.broker.service.persistent.DispatchRateLimiter.isDispatchRateNeeded(DispatchRateLimiter.java:214)
	at org.apache.pulsar.broker.service.persistent.PersistentTopic.initializeRateLimiterIfNeeded(PersistentTopic.java:378)
	at org.apache.pulsar.broker.service.persistent.PersistentTopic.<init>(PersistentTopic.java:267)
	at org.apache.pulsar.broker.service.MessageCumulativeAckTest.setup(MessageCumulativeAckTest.java:113)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-10T12:21:35.2837116Z](https://github.com/apache/pulsar/runs/6830378408?check_suite_focus=true#step:9:268)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.ClassCastException: class org.apache.pulsar.broker.service.BrokerService cannot be cast to class org.apache.pulsar.broker.resources.PulsarResources (org.apache.pulsar.broker.service.BrokerService and org.apache.pulsar.broker.resources.PulsarResources are in unnamed module of loader 'app')
	at org.apache.pulsar.broker.PulsarService.getPulsarResources(PulsarService.java:260)
	at org.apache.pulsar.broker.service.persistent.DispatchRateLimiter.getPolicies(DispatchRateLimiter.java:363)
	at org.apache.pulsar.broker.service.persistent.DispatchRateLimiter.isDispatchRateNeeded(DispatchRateLimiter.java:214)
	at org.apache.pulsar.broker.service.persistent.PersistentTopic.initializeRateLimiterIfNeeded(PersistentTopic.java:378)
	at org.apache.pulsar.broker.service.persistent.PersistentTopic.<init>(PersistentTopic.java:267)
	at org.apache.pulsar.broker.service.MessageCumulativeAckTest.setup(MessageCumulativeAckTest.java:113)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
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
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
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

