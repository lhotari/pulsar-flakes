        
Flaky-test: org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.stateCheck
Number of failures: 9

org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest is flaky. The stateCheck test method fails sporadically.

```
java.lang.RuntimeException: org.apache.pulsar.metadata.api.MetadataStoreException$AlreadyClosedException: The metadata store is closed
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.lambda$createPulsarTestContextBuilder$0(MockedPulsarServiceBaseTest.java:372)
	at org.apache.pulsar.broker.testcontext.PulsarTestContext$AbstractCustomBuilder.build(PulsarTestContext.java:526)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.createMainPulsarTestContext(MockedPulsarServiceBaseTest.java:341)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.startBroker(MockedPulsarServiceBaseTest.java:293)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.init(MockedPulsarServiceBaseTest.java:213)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalSetup(MockedPulsarServiceBaseTest.java:133)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalSetup(MockedPulsarServiceBaseTest.java:150)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.setup(ExtensibleLoadManagerImplTest.java:142)
	at org.apache.pulsar.tests.TestRetrySupport.stateCheck(TestRetrySupport.java:60)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-04-03T03:21:03.9454200Z](https://github.com/apache/pulsar/actions/runs/4581789147/jobs/8109642540#step:11:1046)  
[example failure 2023-04-01T10:49:07.9941758Z](https://github.com/apache/pulsar/actions/runs/4581789147/jobs/8093129861#step:11:1081)  
[example failure 2023-04-01T06:55:52.2885181Z](https://github.com/apache/pulsar/actions/runs/4581789147/jobs/8091658464#step:11:1081)  
[example failure 2023-03-30T16:42:35.7496085Z](https://github.com/apache/pulsar/actions/runs/4566657746/jobs/8059786428#step:10:1075)  
[example failure 2023-03-30T06:52:36.3374809Z](https://github.com/apache/pulsar/actions/runs/4560335861/jobs/8047329419#step:11:1063)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.RuntimeException: org.apache.pulsar.metadata.api.MetadataStoreException$AlreadyClosedException: The metadata store is closed
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.lambda$createPulsarTestContextBuilder$0(MockedPulsarServiceBaseTest.java:372)
	at org.apache.pulsar.broker.testcontext.PulsarTestContext$AbstractCustomBuilder.build(PulsarTestContext.java:526)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.createMainPulsarTestContext(MockedPulsarServiceBaseTest.java:341)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.startBroker(MockedPulsarServiceBaseTest.java:293)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.init(MockedPulsarServiceBaseTest.java:213)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalSetup(MockedPulsarServiceBaseTest.java:133)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalSetup(MockedPulsarServiceBaseTest.java:150)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.setup(ExtensibleLoadManagerImplTest.java:142)
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
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$AlreadyClosedException: The metadata store is closed
	at org.apache.pulsar.metadata.impl.AbstractMetadataStore.exists(AbstractMetadataStore.java:289)
	at org.apache.pulsar.metadata.cache.impl.MetadataCacheImpl.exists(MetadataCacheImpl.java:253)
	at org.apache.pulsar.broker.resources.BaseResources.exists(BaseResources.java:184)
	at org.apache.pulsar.broker.resources.TenantResources.tenantExists(TenantResources.java:58)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.createNamespaceIfNotExists(ExtensibleLoadManagerImplTest.java:183)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.beforePulsarStart(ExtensibleLoadManagerImplTest.java:173)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.lambda$createPulsarTestContextBuilder$0(MockedPulsarServiceBaseTest.java:370)
	... 46 more

</pre></code>
</details>

[example failure 2023-04-03T03:37:35.9550320Z](https://github.com/apache/pulsar/actions/runs/4581789147/jobs/8109762087#step:10:1201)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.RuntimeException: org.apache.pulsar.metadata.api.MetadataStoreException$AlreadyClosedException: The metadata store is closed
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.lambda$createPulsarTestContextBuilder$0(MockedPulsarServiceBaseTest.java:372)
	at org.apache.pulsar.broker.testcontext.PulsarTestContext$AbstractCustomBuilder.build(PulsarTestContext.java:526)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.createMainPulsarTestContext(MockedPulsarServiceBaseTest.java:341)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.startBroker(MockedPulsarServiceBaseTest.java:293)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.init(MockedPulsarServiceBaseTest.java:213)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalSetup(MockedPulsarServiceBaseTest.java:133)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalSetup(MockedPulsarServiceBaseTest.java:150)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.setup(ExtensibleLoadManagerImplTest.java:142)
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
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$AlreadyClosedException: The metadata store is closed
	at org.apache.pulsar.metadata.impl.AbstractMetadataStore.exists(AbstractMetadataStore.java:289)
	at org.apache.pulsar.metadata.cache.impl.MetadataCacheImpl.exists(MetadataCacheImpl.java:253)
	at org.apache.pulsar.broker.resources.BaseResources.exists(BaseResources.java:184)
	at org.apache.pulsar.broker.resources.TenantResources.tenantExists(TenantResources.java:58)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.createNamespaceIfNotExists(ExtensibleLoadManagerImplTest.java:183)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.beforePulsarStart(ExtensibleLoadManagerImplTest.java:173)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.lambda$createPulsarTestContextBuilder$0(MockedPulsarServiceBaseTest.java:370)
	... 46 more

</pre></code>
</details>

[example failure 2023-04-03T04:49:45.9964562Z](https://github.com/apache/pulsar/actions/runs/4581789147/jobs/8110475203#step:10:1203)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.RuntimeException: org.apache.pulsar.metadata.api.MetadataStoreException$AlreadyClosedException: The metadata store is closed
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.lambda$createPulsarTestContextBuilder$0(MockedPulsarServiceBaseTest.java:372)
	at org.apache.pulsar.broker.testcontext.PulsarTestContext$AbstractCustomBuilder.build(PulsarTestContext.java:526)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.createMainPulsarTestContext(MockedPulsarServiceBaseTest.java:341)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.startBroker(MockedPulsarServiceBaseTest.java:293)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.init(MockedPulsarServiceBaseTest.java:213)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalSetup(MockedPulsarServiceBaseTest.java:133)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalSetup(MockedPulsarServiceBaseTest.java:150)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.setup(ExtensibleLoadManagerImplTest.java:142)
	at org.apache.pulsar.tests.TestRetrySupport.stateCheck(TestRetrySupport.java:60)
	at jdk.internal.reflect.GeneratedMethodAccessor239.invoke(Unknown Source)
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
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$AlreadyClosedException: The metadata store is closed
	at org.apache.pulsar.metadata.impl.AbstractMetadataStore.exists(AbstractMetadataStore.java:289)
	at org.apache.pulsar.metadata.cache.impl.MetadataCacheImpl.exists(MetadataCacheImpl.java:253)
	at org.apache.pulsar.broker.resources.BaseResources.exists(BaseResources.java:184)
	at org.apache.pulsar.broker.resources.TenantResources.tenantExists(TenantResources.java:58)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.createNamespaceIfNotExists(ExtensibleLoadManagerImplTest.java:183)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.beforePulsarStart(ExtensibleLoadManagerImplTest.java:173)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.lambda$createPulsarTestContextBuilder$0(MockedPulsarServiceBaseTest.java:370)
	... 45 more

</pre></code>
</details>

[example failure 2023-03-29T17:42:52.9973196Z](https://github.com/apache/pulsar/actions/runs/4556073033/jobs/8036370729#step:11:1189)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.RuntimeException: org.apache.pulsar.metadata.api.MetadataStoreException$AlreadyClosedException: The metadata store is closed
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.lambda$createPulsarTestContextBuilder$0(MockedPulsarServiceBaseTest.java:372)
	at org.apache.pulsar.broker.testcontext.PulsarTestContext$AbstractCustomBuilder.build(PulsarTestContext.java:526)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.createMainPulsarTestContext(MockedPulsarServiceBaseTest.java:341)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.startBroker(MockedPulsarServiceBaseTest.java:293)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.init(MockedPulsarServiceBaseTest.java:213)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalSetup(MockedPulsarServiceBaseTest.java:133)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalSetup(MockedPulsarServiceBaseTest.java:150)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.setup(ExtensibleLoadManagerImplTest.java:142)
	at org.apache.pulsar.tests.TestRetrySupport.stateCheck(TestRetrySupport.java:60)
	at jdk.internal.reflect.GeneratedMethodAccessor238.invoke(Unknown Source)
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
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$AlreadyClosedException: The metadata store is closed
	at org.apache.pulsar.metadata.impl.AbstractMetadataStore.exists(AbstractMetadataStore.java:289)
	at org.apache.pulsar.metadata.cache.impl.MetadataCacheImpl.exists(MetadataCacheImpl.java:253)
	at org.apache.pulsar.broker.resources.BaseResources.exists(BaseResources.java:184)
	at org.apache.pulsar.broker.resources.TenantResources.tenantExists(TenantResources.java:58)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.createNamespaceIfNotExists(ExtensibleLoadManagerImplTest.java:183)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.beforePulsarStart(ExtensibleLoadManagerImplTest.java:173)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.lambda$createPulsarTestContextBuilder$0(MockedPulsarServiceBaseTest.java:370)
	... 45 more

</pre></code>
</details>

```
java.lang.RuntimeException: org.apache.pulsar.metadata.api.MetadataStoreException$AlreadyClosedException: The metadata store is closed
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.lambda$createPulsarTestContextBuilder$0(MockedPulsarServiceBaseTest.java:372)
	at org.apache.pulsar.broker.testcontext.PulsarTestContext$AbstractCustomBuilder.build(PulsarTestContext.java:526)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.createMainPulsarTestContext(MockedPulsarServiceBaseTest.java:341)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.startBroker(MockedPulsarServiceBaseTest.java:293)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.init(MockedPulsarServiceBaseTest.java:213)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalSetup(MockedPulsarServiceBaseTest.java:133)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalSetup(MockedPulsarServiceBaseTest.java:150)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.setup(ExtensibleLoadManagerImplTest.java:141)
	at org.apache.pulsar.tests.TestRetrySupport.stateCheck(TestRetrySupport.java:60)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-03-27T14:34:37.1175442Z](https://github.com/apache/pulsar/actions/runs/4531219616/jobs/7985423608#step:10:907)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.RuntimeException: org.apache.pulsar.metadata.api.MetadataStoreException$AlreadyClosedException: The metadata store is closed
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.lambda$createPulsarTestContextBuilder$0(MockedPulsarServiceBaseTest.java:372)
	at org.apache.pulsar.broker.testcontext.PulsarTestContext$AbstractCustomBuilder.build(PulsarTestContext.java:526)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.createMainPulsarTestContext(MockedPulsarServiceBaseTest.java:341)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.startBroker(MockedPulsarServiceBaseTest.java:293)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.init(MockedPulsarServiceBaseTest.java:213)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalSetup(MockedPulsarServiceBaseTest.java:133)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalSetup(MockedPulsarServiceBaseTest.java:150)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.setup(ExtensibleLoadManagerImplTest.java:141)
	at org.apache.pulsar.tests.TestRetrySupport.stateCheck(TestRetrySupport.java:60)
	at jdk.internal.reflect.GeneratedMethodAccessor121.invoke(Unknown Source)
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
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:135)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:112)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$AlreadyClosedException: The metadata store is closed
	at org.apache.pulsar.metadata.impl.AbstractMetadataStore.exists(AbstractMetadataStore.java:289)
	at org.apache.pulsar.metadata.cache.impl.MetadataCacheImpl.exists(MetadataCacheImpl.java:253)
	at org.apache.pulsar.broker.resources.BaseResources.exists(BaseResources.java:184)
	at org.apache.pulsar.broker.resources.TenantResources.tenantExists(TenantResources.java:58)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.createNamespaceIfNotExists(ExtensibleLoadManagerImplTest.java:181)
	at org.apache.pulsar.broker.loadbalance.extensions.ExtensibleLoadManagerImplTest.beforePulsarStart(ExtensibleLoadManagerImplTest.java:171)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.lambda$createPulsarTestContextBuilder$0(MockedPulsarServiceBaseTest.java:370)
	... 45 more

</pre></code>
</details>

