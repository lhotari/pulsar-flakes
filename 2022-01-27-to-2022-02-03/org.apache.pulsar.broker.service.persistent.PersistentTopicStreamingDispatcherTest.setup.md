        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup
Number of failures: 12

org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest is flaky. The setup test method fails sporadically.

```
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-28T11:38:20.6805936Z](https://github.com/apache/pulsar/runs/4979436344?check_suite_focus=true?check_suite_focus=true#step:9:2168)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
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
Caused by: org.mockito.creation.instance.InstantiationException:
Unable to create instance of 'ServerCnx$MockitoMock$220343311'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$1313291560] and executes cleanly.
	... 37 more
Caused by: java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.lambda$newInstance$0(ReflectionMemberAccessor.java:29)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.newInstance(ReflectionMemberAccessor.java:29)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.newInstance(ReflectionMemberAccessor.java:20)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.invokeConstructor(ConstructorInstantiator.java:70)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.withParams(ConstructorInstantiator.java:53)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.newInstance(ConstructorInstantiator.java:39)
	at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.createMock(SubclassByteBuddyMockMaker.java:48)
	at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.createMock(ByteBuddyMockMaker.java:43)
	at org.powermock.api.mockito.mockmaker.PowerMockMaker.createMock(PowerMockMaker.java:41)
	at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:53)
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:84)
	at org.mockito.Mockito.mock(Mockito.java:1964)
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$220343311.<init>(Unknown Source)
	... 57 more

</pre></code>
</details>

[example failure 2022-01-28T19:40:17.7077660Z](https://github.com/apache/pulsar/runs/4985338436?check_suite_focus=true?check_suite_focus=true#step:9:4154)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
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
Caused by: org.mockito.creation.instance.InstantiationException:
Unable to create instance of 'ServerCnx$MockitoMock$522057507'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$287677600] and executes cleanly.
	... 37 more
Caused by: java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.lambda$newInstance$0(ReflectionMemberAccessor.java:29)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.newInstance(ReflectionMemberAccessor.java:29)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.newInstance(ReflectionMemberAccessor.java:20)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.invokeConstructor(ConstructorInstantiator.java:70)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.withParams(ConstructorInstantiator.java:53)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.newInstance(ConstructorInstantiator.java:39)
	at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.createMock(SubclassByteBuddyMockMaker.java:48)
	at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.createMock(ByteBuddyMockMaker.java:43)
	at org.powermock.api.mockito.mockmaker.PowerMockMaker.createMock(PowerMockMaker.java:41)
	at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:53)
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:84)
	at org.mockito.Mockito.mock(Mockito.java:1964)
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$522057507.<init>(Unknown Source)
	... 57 more

</pre></code>
</details>

[example failure 2022-01-28T12:56:35.9599091Z](https://github.com/apache/pulsar/runs/4980584137?check_suite_focus=true?check_suite_focus=true#step:9:4134)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
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
Caused by: org.mockito.creation.instance.InstantiationException:
Unable to create instance of 'ServerCnx$MockitoMock$1711379521'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$1517600639] and executes cleanly.
	... 37 more
Caused by: java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.lambda$newInstance$0(ReflectionMemberAccessor.java:29)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.newInstance(ReflectionMemberAccessor.java:29)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.newInstance(ReflectionMemberAccessor.java:20)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.invokeConstructor(ConstructorInstantiator.java:70)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.withParams(ConstructorInstantiator.java:53)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.newInstance(ConstructorInstantiator.java:39)
	at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.createMock(SubclassByteBuddyMockMaker.java:48)
	at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.createMock(ByteBuddyMockMaker.java:43)
	at org.powermock.api.mockito.mockmaker.PowerMockMaker.createMock(PowerMockMaker.java:41)
	at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:53)
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:84)
	at org.mockito.Mockito.mock(Mockito.java:1964)
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$1711379521.<init>(Unknown Source)
	... 57 more

</pre></code>
</details>

[example failure 2022-01-28T12:49:55.7237499Z](https://github.com/apache/pulsar/runs/4980324517?check_suite_focus=true?check_suite_focus=true#step:9:4071)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
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
Caused by: org.mockito.creation.instance.InstantiationException:
Unable to create instance of 'ServerCnx$MockitoMock$884747649'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$1292032359] and executes cleanly.
	... 37 more
Caused by: java.lang.reflect.InvocationTargetException
	at jdk.internal.reflect.GeneratedConstructorAccessor212.newInstance(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.lambda$newInstance$0(ReflectionMemberAccessor.java:29)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.newInstance(ReflectionMemberAccessor.java:29)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.newInstance(ReflectionMemberAccessor.java:20)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.invokeConstructor(ConstructorInstantiator.java:70)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.withParams(ConstructorInstantiator.java:53)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.newInstance(ConstructorInstantiator.java:39)
	at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.createMock(SubclassByteBuddyMockMaker.java:48)
	at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.createMock(ByteBuddyMockMaker.java:43)
	at org.powermock.api.mockito.mockmaker.PowerMockMaker.createMock(PowerMockMaker.java:41)
	at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:53)
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:84)
	at org.mockito.Mockito.mock(Mockito.java:1964)
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
	at jdk.internal.reflect.GeneratedMethodAccessor332.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$884747649.<init>(Unknown Source)
	... 55 more

</pre></code>
</details>

[example failure 2022-01-27T19:58:05.2126968Z](https://github.com/apache/pulsar/runs/4971515684?check_suite_focus=true?check_suite_focus=true#step:9:1174)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
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
Caused by: org.mockito.creation.instance.InstantiationException:
Unable to create instance of 'ServerCnx$MockitoMock$1367826524'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$839678705] and executes cleanly.
	... 37 more
Caused by: java.lang.reflect.InvocationTargetException
	at jdk.internal.reflect.GeneratedConstructorAccessor225.newInstance(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.lambda$newInstance$0(ReflectionMemberAccessor.java:29)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.newInstance(ReflectionMemberAccessor.java:29)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.newInstance(ReflectionMemberAccessor.java:20)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.invokeConstructor(ConstructorInstantiator.java:70)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.withParams(ConstructorInstantiator.java:53)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.newInstance(ConstructorInstantiator.java:39)
	at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.createMock(SubclassByteBuddyMockMaker.java:48)
	at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.createMock(ByteBuddyMockMaker.java:43)
	at org.powermock.api.mockito.mockmaker.PowerMockMaker.createMock(PowerMockMaker.java:41)
	at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:53)
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:84)
	at org.mockito.Mockito.mock(Mockito.java:1964)
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
	at jdk.internal.reflect.GeneratedMethodAccessor341.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$1367826524.<init>(Unknown Source)
	... 55 more

</pre></code>
</details>

[example failure 2022-01-28T12:13:10.8403211Z](https://github.com/apache/pulsar/runs/4980157545?check_suite_focus=true?check_suite_focus=true#step:9:308)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
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
Caused by: org.mockito.creation.instance.InstantiationException:
Unable to create instance of 'ServerCnx$MockitoMock$1015677965'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$1160941992] and executes cleanly.
	... 37 more
Caused by: java.lang.reflect.InvocationTargetException
	at jdk.internal.reflect.GeneratedConstructorAccessor233.newInstance(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.lambda$newInstance$0(ReflectionMemberAccessor.java:29)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.newInstance(ReflectionMemberAccessor.java:29)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.newInstance(ReflectionMemberAccessor.java:20)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.invokeConstructor(ConstructorInstantiator.java:70)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.withParams(ConstructorInstantiator.java:53)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.newInstance(ConstructorInstantiator.java:39)
	at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.createMock(SubclassByteBuddyMockMaker.java:48)
	at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.createMock(ByteBuddyMockMaker.java:43)
	at org.powermock.api.mockito.mockmaker.PowerMockMaker.createMock(PowerMockMaker.java:41)
	at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:53)
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:84)
	at org.mockito.Mockito.mock(Mockito.java:1964)
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
	at jdk.internal.reflect.GeneratedMethodAccessor216.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$1015677965.<init>(Unknown Source)
	... 55 more

</pre></code>
</details>

[example failure 2022-01-29T02:04:24.6274679Z](https://github.com/apache/pulsar/runs/4988541970?check_suite_focus=true?check_suite_focus=true#step:9:308)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
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
Caused by: org.mockito.creation.instance.InstantiationException:
Unable to create instance of 'ServerCnx$MockitoMock$1902068617'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$1974733822] and executes cleanly.
	... 37 more
Caused by: java.lang.reflect.InvocationTargetException
	at jdk.internal.reflect.GeneratedConstructorAccessor241.newInstance(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.lambda$newInstance$0(ReflectionMemberAccessor.java:29)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.newInstance(ReflectionMemberAccessor.java:29)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.newInstance(ReflectionMemberAccessor.java:20)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.invokeConstructor(ConstructorInstantiator.java:70)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.withParams(ConstructorInstantiator.java:53)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.newInstance(ConstructorInstantiator.java:39)
	at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.createMock(SubclassByteBuddyMockMaker.java:48)
	at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.createMock(ByteBuddyMockMaker.java:43)
	at org.powermock.api.mockito.mockmaker.PowerMockMaker.createMock(PowerMockMaker.java:41)
	at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:53)
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:84)
	at org.mockito.Mockito.mock(Mockito.java:1964)
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
	at jdk.internal.reflect.GeneratedMethodAccessor396.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$1902068617.<init>(Unknown Source)
	... 55 more

</pre></code>
</details>

[example failure 2022-01-27T18:40:32.2566599Z](https://github.com/apache/pulsar/runs/4970761292?check_suite_focus=true?check_suite_focus=true#step:9:294)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
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
Caused by: org.mockito.creation.instance.InstantiationException:
Unable to create instance of 'ServerCnx$MockitoMock$1600847418'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$2042859908] and executes cleanly.
	... 37 more
Caused by: java.lang.reflect.InvocationTargetException
	at jdk.internal.reflect.GeneratedConstructorAccessor239.newInstance(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.lambda$newInstance$0(ReflectionMemberAccessor.java:29)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.newInstance(ReflectionMemberAccessor.java:29)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.newInstance(ReflectionMemberAccessor.java:20)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.invokeConstructor(ConstructorInstantiator.java:70)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.withParams(ConstructorInstantiator.java:53)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.newInstance(ConstructorInstantiator.java:39)
	at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.createMock(SubclassByteBuddyMockMaker.java:48)
	at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.createMock(ByteBuddyMockMaker.java:43)
	at org.powermock.api.mockito.mockmaker.PowerMockMaker.createMock(PowerMockMaker.java:41)
	at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:53)
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:84)
	at org.mockito.Mockito.mock(Mockito.java:1964)
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
	at jdk.internal.reflect.GeneratedMethodAccessor393.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$1600847418.<init>(Unknown Source)
	... 55 more

</pre></code>
</details>

[example failure 2022-01-29T03:16:01.6195330Z](https://github.com/apache/pulsar/runs/4988894638?check_suite_focus=true?check_suite_focus=true#step:9:290)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
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
Caused by: org.mockito.creation.instance.InstantiationException:
Unable to create instance of 'ServerCnx$MockitoMock$823228743'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$1521715690] and executes cleanly.
	... 37 more
Caused by: java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.lambda$newInstance$0(ReflectionMemberAccessor.java:29)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.newInstance(ReflectionMemberAccessor.java:29)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.newInstance(ReflectionMemberAccessor.java:20)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.invokeConstructor(ConstructorInstantiator.java:70)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.withParams(ConstructorInstantiator.java:53)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.newInstance(ConstructorInstantiator.java:39)
	at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.createMock(SubclassByteBuddyMockMaker.java:48)
	at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.createMock(ByteBuddyMockMaker.java:43)
	at org.powermock.api.mockito.mockmaker.PowerMockMaker.createMock(PowerMockMaker.java:41)
	at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:53)
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:84)
	at org.mockito.Mockito.mock(Mockito.java:1964)
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$823228743.<init>(Unknown Source)
	... 57 more

</pre></code>
</details>

[example failure 2022-01-28T09:24:01.0457343Z](https://github.com/apache/pulsar/runs/4978229090?check_suite_focus=true?check_suite_focus=true#step:9:4155)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
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
Caused by: org.mockito.creation.instance.InstantiationException:
Unable to create instance of 'ServerCnx$MockitoMock$545060609'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$613369066] and executes cleanly.
	... 37 more
Caused by: java.lang.reflect.InvocationTargetException
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
	at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
	at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.lambda$newInstance$0(ReflectionMemberAccessor.java:29)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.newInstance(ReflectionMemberAccessor.java:29)
	at org.mockito.internal.util.reflection.ReflectionMemberAccessor.newInstance(ReflectionMemberAccessor.java:20)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.invokeConstructor(ConstructorInstantiator.java:70)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.withParams(ConstructorInstantiator.java:53)
	at org.mockito.internal.creation.instance.ConstructorInstantiator.newInstance(ConstructorInstantiator.java:39)
	at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.createMock(SubclassByteBuddyMockMaker.java:48)
	at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.createMock(ByteBuddyMockMaker.java:43)
	at org.powermock.api.mockito.mockmaker.PowerMockMaker.createMock(PowerMockMaker.java:41)
	at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:53)
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:84)
	at org.mockito.Mockito.mock(Mockito.java:1964)
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$545060609.<init>(Unknown Source)
	... 57 more

</pre></code>
</details>

```
org.mockito.exceptions.misusing.WrongTypeOfReturnValue:

BrokerService$MockitoMock$1108624928 cannot be returned by getPulsarResources()
getPulsarResources() should return PulsarResources
***
If you're unsure why you're getting above error read on.
Due to the nature of the syntax above problem might occur because:
1. This exception *might* occur in wrongly written multi-threaded tests.
   Please refer to Mockito FAQ on limitations of concurrency testing.
2. A spy is stubbed using when(spy.foo()).then() syntax. It is safer to stub spies -
   - with doReturn|Throw() family of methods. More in javadocs for Mockito.spy() method.

	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:209)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-29T02:21:34.9887481Z](https://github.com/apache/pulsar/runs/4988541970?check_suite_focus=true?check_suite_focus=true#step:9:1225)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.misusing.WrongTypeOfReturnValue:

BrokerService$MockitoMock$1108624928 cannot be returned by getPulsarResources()
getPulsarResources() should return PulsarResources
***
If you're unsure why you're getting above error read on.
Due to the nature of the syntax above problem might occur because:
1. This exception *might* occur in wrongly written multi-threaded tests.
   Please refer to Mockito FAQ on limitations of concurrency testing.
2. A spy is stubbed using when(spy.foo()).then() syntax. It is safer to stub spies -
   - with doReturn|Throw() family of methods. More in javadocs for Mockito.spy() method.

	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:209)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
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
org.mockito.exceptions.misusing.WrongTypeOfReturnValue:

BrokerService$MockitoMock$1710504057 cannot be returned by getPulsarResources()
getPulsarResources() should return PulsarResources
***
If you're unsure why you're getting above error read on.
Due to the nature of the syntax above problem might occur because:
1. This exception *might* occur in wrongly written multi-threaded tests.
   Please refer to Mockito FAQ on limitations of concurrency testing.
2. A spy is stubbed using when(spy.foo()).then() syntax. It is safer to stub spies -
   - with doReturn|Throw() family of methods. More in javadocs for Mockito.spy() method.

	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:209)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-31T15:41:11.4743732Z](https://github.com/apache/pulsar/runs/5008094073?check_suite_focus=true?check_suite_focus=true#step:9:294)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.misusing.WrongTypeOfReturnValue:

BrokerService$MockitoMock$1710504057 cannot be returned by getPulsarResources()
getPulsarResources() should return PulsarResources
***
If you're unsure why you're getting above error read on.
Due to the nature of the syntax above problem might occur because:
1. This exception *might* occur in wrongly written multi-threaded tests.
   Please refer to Mockito FAQ on limitations of concurrency testing.
2. A spy is stubbed using when(spy.foo()).then() syntax. It is safer to stub spies -
   - with doReturn|Throw() family of methods. More in javadocs for Mockito.spy() method.

	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:209)
	at org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherTest.setup(PersistentTopicStreamingDispatcherTest.java:34)
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

