        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup
Number of failures: 8

org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest is flaky. The setup test method fails sporadically.

```
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:226)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-06T08:17:17.0380723Z](https://github.com/apache/pulsar/runs/7210683170?check_suite_focus=true#step:10:554)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:226)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
	at jdk.internal.reflect.GeneratedMethodAccessor295.invoke(Unknown Source)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: org.mockito.creation.instance.InstantiationException:
Unable to create instance of 'ServerCnx'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService] and executes cleanly.
	... 40 more
Caused by: java.lang.reflect.InvocationTargetException
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:198)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:161)
	at org.mockito.internal.util.reflection.ModuleMemberAccessor.newInstance(ModuleMemberAccessor.java:42)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.invokeConstructor(ConstructorInstantiator.java:70)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.withParams(ConstructorInstantiator.java:53)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.newInstance(ConstructorInstantiator.java:39)
	at org.mockito.internal.creation.bytebuddy.InlineDelegateByteBuddyMockMaker.doCreateMock(InlineDelegateByteBuddyMockMaker.java:360)
	at org.mockito.internal.creation.bytebuddy.InlineDelegateByteBuddyMockMaker.createMock(InlineDelegateByteBuddyMockMaker.java:330)
	at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMock(InlineByteBuddyMockMaker.java:58)
	at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:53)
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:84)
	at org.mockito.Mockito.mock(Mockito.java:1964)
	... 40 more
Caused by: java.lang.ClassCastException: class org.apache.pulsar.broker.service.BrokerService cannot be cast to class org.apache.pulsar.broker.resources.PulsarResources (org.apache.pulsar.broker.service.BrokerService and org.apache.pulsar.broker.resources.PulsarResources are in unnamed module of loader 'app')
	at org.apache.pulsar.broker.PulsarService.getPulsarResources(PulsarService.java:265)
	at org.apache.pulsar.broker.service.TopicListService.<init>(TopicListService.java:103)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:279)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:239)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$liW34rtq.invokeWithArguments(Unknown Source)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.lambda$newInstance$0(InstrumentationMemberAccessor.java:191)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:188)
	... 51 more

</pre></code>
</details>

[example failure 2022-07-05T05:17:17.5902925Z](https://github.com/apache/pulsar/runs/7190355410?check_suite_focus=true#step:10:552)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:226)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
	at jdk.internal.reflect.GeneratedMethodAccessor603.invoke(Unknown Source)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: org.mockito.creation.instance.InstantiationException:
Unable to create instance of 'ServerCnx'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService] and executes cleanly.
	... 40 more
Caused by: java.lang.reflect.InvocationTargetException
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:198)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:161)
	at org.mockito.internal.util.reflection.ModuleMemberAccessor.newInstance(ModuleMemberAccessor.java:42)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.invokeConstructor(ConstructorInstantiator.java:70)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.withParams(ConstructorInstantiator.java:53)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.newInstance(ConstructorInstantiator.java:39)
	at org.mockito.internal.creation.bytebuddy.InlineDelegateByteBuddyMockMaker.doCreateMock(InlineDelegateByteBuddyMockMaker.java:360)
	at org.mockito.internal.creation.bytebuddy.InlineDelegateByteBuddyMockMaker.createMock(InlineDelegateByteBuddyMockMaker.java:330)
	at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMock(InlineByteBuddyMockMaker.java:58)
	at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:53)
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:84)
	at org.mockito.Mockito.mock(Mockito.java:1964)
	... 40 more
Caused by: java.lang.ClassCastException: class org.apache.pulsar.broker.service.BrokerService cannot be cast to class org.apache.pulsar.broker.resources.PulsarResources (org.apache.pulsar.broker.service.BrokerService and org.apache.pulsar.broker.resources.PulsarResources are in unnamed module of loader 'app')
	at org.apache.pulsar.broker.PulsarService.getPulsarResources(PulsarService.java:265)
	at org.apache.pulsar.broker.service.TopicListService.<init>(TopicListService.java:103)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:279)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:239)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$sOxkfbdj.invokeWithArguments(Unknown Source)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.lambda$newInstance$0(InstrumentationMemberAccessor.java:191)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:188)
	... 51 more

</pre></code>
</details>

[example failure 2022-07-06T02:28:49.6512989Z](https://github.com/apache/pulsar/runs/7207285576?check_suite_focus=true#step:10:570)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:226)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
	at jdk.internal.reflect.GeneratedMethodAccessor274.invoke(Unknown Source)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: org.mockito.creation.instance.InstantiationException:
Unable to create instance of 'ServerCnx'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService] and executes cleanly.
	... 40 more
Caused by: java.lang.reflect.InvocationTargetException
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:198)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:161)
	at org.mockito.internal.util.reflection.ModuleMemberAccessor.newInstance(ModuleMemberAccessor.java:42)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.invokeConstructor(ConstructorInstantiator.java:70)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.withParams(ConstructorInstantiator.java:53)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.newInstance(ConstructorInstantiator.java:39)
	at org.mockito.internal.creation.bytebuddy.InlineDelegateByteBuddyMockMaker.doCreateMock(InlineDelegateByteBuddyMockMaker.java:360)
	at org.mockito.internal.creation.bytebuddy.InlineDelegateByteBuddyMockMaker.createMock(InlineDelegateByteBuddyMockMaker.java:330)
	at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMock(InlineByteBuddyMockMaker.java:58)
	at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:53)
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:84)
	at org.mockito.Mockito.mock(Mockito.java:1964)
	... 40 more
Caused by: java.lang.ClassCastException: class org.apache.pulsar.broker.service.BrokerService cannot be cast to class org.apache.pulsar.broker.resources.PulsarResources (org.apache.pulsar.broker.service.BrokerService and org.apache.pulsar.broker.resources.PulsarResources are in unnamed module of loader 'app')
	at org.apache.pulsar.broker.PulsarService.getPulsarResources(PulsarService.java:265)
	at org.apache.pulsar.broker.service.TopicListService.<init>(TopicListService.java:103)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:279)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:239)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$8hgjkF6g.invokeWithArguments(Unknown Source)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.lambda$newInstance$0(InstrumentationMemberAccessor.java:191)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:188)
	... 51 more

</pre></code>
</details>

[example failure 2022-07-12T18:58:35.8702677Z](https://github.com/apache/pulsar/runs/7305439308?check_suite_focus=true#step:9:854)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:226)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: org.mockito.creation.instance.InstantiationException:
Unable to create instance of 'ServerCnx'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService] and executes cleanly.
	... 41 more
Caused by: java.lang.reflect.InvocationTargetException
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:198)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:161)
	at org.mockito.internal.util.reflection.ModuleMemberAccessor.newInstance(ModuleMemberAccessor.java:42)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.invokeConstructor(ConstructorInstantiator.java:70)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.withParams(ConstructorInstantiator.java:53)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.newInstance(ConstructorInstantiator.java:39)
	at org.mockito.internal.creation.bytebuddy.InlineDelegateByteBuddyMockMaker.doCreateMock(InlineDelegateByteBuddyMockMaker.java:360)
	at org.mockito.internal.creation.bytebuddy.InlineDelegateByteBuddyMockMaker.createMock(InlineDelegateByteBuddyMockMaker.java:330)
	at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMock(InlineByteBuddyMockMaker.java:58)
	at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:53)
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:84)
	at org.mockito.Mockito.mock(Mockito.java:1964)
	... 41 more
Caused by: java.lang.ClassCastException: class org.apache.pulsar.broker.service.BrokerService cannot be cast to class org.apache.pulsar.broker.resources.PulsarResources (org.apache.pulsar.broker.service.BrokerService and org.apache.pulsar.broker.resources.PulsarResources are in unnamed module of loader 'app')
	at org.apache.pulsar.broker.PulsarService.getPulsarResources(PulsarService.java:265)
	at org.apache.pulsar.broker.service.TopicListService.<init>(TopicListService.java:103)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:279)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:239)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$8tmVRUzZ.invokeWithArguments(Unknown Source)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.lambda$newInstance$0(InstrumentationMemberAccessor.java:191)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:188)
	... 52 more

</pre></code>
</details>

[example failure 2022-07-05T05:38:11.6182097Z](https://github.com/apache/pulsar/runs/7190355410?check_suite_focus=true#step:10:1654)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:226)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: org.mockito.creation.instance.InstantiationException:
Unable to create instance of 'ServerCnx'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService] and executes cleanly.
	... 41 more
Caused by: java.lang.reflect.InvocationTargetException
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:198)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:161)
	at org.mockito.internal.util.reflection.ModuleMemberAccessor.newInstance(ModuleMemberAccessor.java:42)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.invokeConstructor(ConstructorInstantiator.java:70)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.withParams(ConstructorInstantiator.java:53)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.newInstance(ConstructorInstantiator.java:39)
	at org.mockito.internal.creation.bytebuddy.InlineDelegateByteBuddyMockMaker.doCreateMock(InlineDelegateByteBuddyMockMaker.java:360)
	at org.mockito.internal.creation.bytebuddy.InlineDelegateByteBuddyMockMaker.createMock(InlineDelegateByteBuddyMockMaker.java:330)
	at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMock(InlineByteBuddyMockMaker.java:58)
	at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:53)
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:84)
	at org.mockito.Mockito.mock(Mockito.java:1964)
	... 41 more
Caused by: java.lang.ClassCastException: class org.apache.pulsar.broker.service.BrokerService cannot be cast to class org.apache.pulsar.broker.resources.PulsarResources (org.apache.pulsar.broker.service.BrokerService and org.apache.pulsar.broker.resources.PulsarResources are in unnamed module of loader 'app')
	at org.apache.pulsar.broker.PulsarService.getPulsarResources(PulsarService.java:265)
	at org.apache.pulsar.broker.service.TopicListService.<init>(TopicListService.java:103)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:279)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:239)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$Fihb9yi4.invokeWithArguments(Unknown Source)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.lambda$newInstance$0(InstrumentationMemberAccessor.java:191)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:188)
	... 52 more

</pre></code>
</details>

[example failure 2022-07-07T09:16:42.0518375Z](https://github.com/apache/pulsar/runs/7230286918?check_suite_focus=true#step:10:552)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:226)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
	at jdk.internal.reflect.GeneratedMethodAccessor352.invoke(Unknown Source)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: org.mockito.creation.instance.InstantiationException:
Unable to create instance of 'ServerCnx'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService] and executes cleanly.
	... 40 more
Caused by: java.lang.reflect.InvocationTargetException
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:198)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:161)
	at org.mockito.internal.util.reflection.ModuleMemberAccessor.newInstance(ModuleMemberAccessor.java:42)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.invokeConstructor(ConstructorInstantiator.java:70)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.withParams(ConstructorInstantiator.java:53)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.newInstance(ConstructorInstantiator.java:39)
	at org.mockito.internal.creation.bytebuddy.InlineDelegateByteBuddyMockMaker.doCreateMock(InlineDelegateByteBuddyMockMaker.java:360)
	at org.mockito.internal.creation.bytebuddy.InlineDelegateByteBuddyMockMaker.createMock(InlineDelegateByteBuddyMockMaker.java:330)
	at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMock(InlineByteBuddyMockMaker.java:58)
	at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:53)
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:84)
	at org.mockito.Mockito.mock(Mockito.java:1964)
	... 40 more
Caused by: java.lang.ClassCastException: class org.apache.pulsar.broker.service.BrokerService cannot be cast to class org.apache.pulsar.broker.resources.PulsarResources (org.apache.pulsar.broker.service.BrokerService and org.apache.pulsar.broker.resources.PulsarResources are in unnamed module of loader 'app')
	at org.apache.pulsar.broker.PulsarService.getPulsarResources(PulsarService.java:265)
	at org.apache.pulsar.broker.service.TopicListService.<init>(TopicListService.java:103)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:279)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:239)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$4zG8btrX.invokeWithArguments(Unknown Source)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.lambda$newInstance$0(InstrumentationMemberAccessor.java:191)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:188)
	... 51 more

</pre></code>
</details>

```
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:229)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-17T13:10:32.0491075Z](https://github.com/apache/pulsar/runs/7377722043?check_suite_focus=true#step:10:807)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:229)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
	at jdk.internal.reflect.GeneratedMethodAccessor350.invoke(Unknown Source)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: org.mockito.creation.instance.InstantiationException:
Unable to create instance of 'ServerCnx'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService] and executes cleanly.
	... 40 more
Caused by: java.lang.reflect.InvocationTargetException
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:198)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:161)
	at org.mockito.internal.util.reflection.ModuleMemberAccessor.newInstance(ModuleMemberAccessor.java:42)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.invokeConstructor(ConstructorInstantiator.java:70)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.withParams(ConstructorInstantiator.java:53)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.newInstance(ConstructorInstantiator.java:39)
	at org.mockito.internal.creation.bytebuddy.InlineDelegateByteBuddyMockMaker.doCreateMock(InlineDelegateByteBuddyMockMaker.java:360)
	at org.mockito.internal.creation.bytebuddy.InlineDelegateByteBuddyMockMaker.createMock(InlineDelegateByteBuddyMockMaker.java:330)
	at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMock(InlineByteBuddyMockMaker.java:58)
	at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:53)
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:84)
	at org.mockito.Mockito.mock(Mockito.java:1964)
	... 40 more
Caused by: java.lang.ClassCastException: class org.apache.pulsar.broker.service.BrokerService cannot be cast to class org.apache.pulsar.broker.resources.PulsarResources (org.apache.pulsar.broker.service.BrokerService and org.apache.pulsar.broker.resources.PulsarResources are in unnamed module of loader 'app')
	at org.apache.pulsar.broker.PulsarService.getPulsarResources(PulsarService.java:265)
	at org.apache.pulsar.broker.service.TopicListService.<init>(TopicListService.java:103)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:279)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:239)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$LJMmckv7.invokeWithArguments(Unknown Source)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.lambda$newInstance$0(InstrumentationMemberAccessor.java:191)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:188)
	... 51 more

</pre></code>
</details>

[example failure 2022-07-16T03:35:01.6128521Z](https://github.com/apache/pulsar/runs/7367834109?check_suite_focus=true#step:9:862)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:229)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
	at jdk.internal.reflect.GeneratedMethodAccessor625.invoke(Unknown Source)
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
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:123)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:90)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:146)
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: org.mockito.creation.instance.InstantiationException:
Unable to create instance of 'ServerCnx'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService] and executes cleanly.
	... 40 more
Caused by: java.lang.reflect.InvocationTargetException
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:198)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:161)
	at org.mockito.internal.util.reflection.ModuleMemberAccessor.newInstance(ModuleMemberAccessor.java:42)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.invokeConstructor(ConstructorInstantiator.java:70)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.withParams(ConstructorInstantiator.java:53)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.newInstance(ConstructorInstantiator.java:39)
	at org.mockito.internal.creation.bytebuddy.InlineDelegateByteBuddyMockMaker.doCreateMock(InlineDelegateByteBuddyMockMaker.java:360)
	at org.mockito.internal.creation.bytebuddy.InlineDelegateByteBuddyMockMaker.createMock(InlineDelegateByteBuddyMockMaker.java:330)
	at org.mockito.internal.creation.bytebuddy.InlineByteBuddyMockMaker.createMock(InlineByteBuddyMockMaker.java:58)
	at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:53)
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:84)
	at org.mockito.Mockito.mock(Mockito.java:1964)
	... 40 more
Caused by: java.lang.ClassCastException: class org.apache.pulsar.broker.service.BrokerService cannot be cast to class org.apache.pulsar.broker.resources.PulsarResources (org.apache.pulsar.broker.service.BrokerService and org.apache.pulsar.broker.resources.PulsarResources are in unnamed module of loader 'app')
	at org.apache.pulsar.broker.PulsarService.getPulsarResources(PulsarService.java:265)
	at org.apache.pulsar.broker.service.TopicListService.<init>(TopicListService.java:103)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:279)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:239)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor$Dispatcher$ByteBuddy$RrQ4rYIx.invokeWithArguments(Unknown Source)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.lambda$newInstance$0(InstrumentationMemberAccessor.java:191)
	at org.mockito.internal.util.reflection.InstrumentationMemberAccessor.newInstance(InstrumentationMemberAccessor.java:188)
	... 51 more

</pre></code>
</details>

