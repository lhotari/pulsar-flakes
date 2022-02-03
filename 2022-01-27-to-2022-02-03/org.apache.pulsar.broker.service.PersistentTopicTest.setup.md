        
Flaky-test: org.apache.pulsar.broker.service.PersistentTopicTest.setup
Number of failures: 14

org.apache.pulsar.broker.service.PersistentTopicTest is flaky. The setup test method fails sporadically.

```
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-27T18:45:10.0160327Z](https://github.com/apache/pulsar/runs/4970761292?check_suite_focus=true?check_suite_focus=true#step:9:478)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
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
Unable to create instance of 'ServerCnx$MockitoMock$514539480'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$1660960649] and executes cleanly.
	... 36 more
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
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$514539480.<init>(Unknown Source)
	... 56 more

</pre></code>
</details>

[example failure 2022-01-29T04:27:15.2851832Z](https://github.com/apache/pulsar/runs/4989220433?check_suite_focus=true?check_suite_focus=true#step:9:410)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
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
Unable to create instance of 'ServerCnx$MockitoMock$982660519'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$1433768303] and executes cleanly.
	... 36 more
Caused by: java.lang.reflect.InvocationTargetException
	at jdk.internal.reflect.GeneratedConstructorAccessor216.newInstance(Unknown Source)
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
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$982660519.<init>(Unknown Source)
	... 55 more

</pre></code>
</details>

[example failure 2022-01-27T19:04:53.0510079Z](https://github.com/apache/pulsar/runs/4970761292?check_suite_focus=true?check_suite_focus=true#step:9:1442)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
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
Unable to create instance of 'ServerCnx$MockitoMock$1229857264'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$1523512427] and executes cleanly.
	... 36 more
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
	at jdk.internal.reflect.GeneratedMethodAccessor218.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$1229857264.<init>(Unknown Source)
	... 54 more

</pre></code>
</details>

[example failure 2022-01-28T19:43:53.9533265Z](https://github.com/apache/pulsar/runs/4985338436?check_suite_focus=true?check_suite_focus=true#step:9:5240)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
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
Unable to create instance of 'ServerCnx$MockitoMock$578597108'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$867925683] and executes cleanly.
	... 36 more
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
	at jdk.internal.reflect.GeneratedMethodAccessor394.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$578597108.<init>(Unknown Source)
	... 54 more

</pre></code>
</details>

[example failure 2022-01-28T12:16:07.9509217Z](https://github.com/apache/pulsar/runs/4980157545?check_suite_focus=true?check_suite_focus=true#step:9:484)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
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
	... 36 more
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
	at jdk.internal.reflect.GeneratedMethodAccessor439.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$1015677965.<init>(Unknown Source)
	... 54 more

</pre></code>
</details>

[example failure 2022-01-28T11:25:27.2298340Z](https://github.com/apache/pulsar/runs/4979436344?check_suite_focus=true?check_suite_focus=true#step:9:1350)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
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
Unable to create instance of 'ServerCnx$MockitoMock$1030038839'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$677401315] and executes cleanly.
	... 36 more
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
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$1030038839.<init>(Unknown Source)
	... 55 more

</pre></code>
</details>

[example failure 2022-01-29T06:30:32.2474170Z](https://github.com/apache/pulsar/runs/4989586769?check_suite_focus=true?check_suite_focus=true#step:9:1280)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
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
Unable to create instance of 'ServerCnx$MockitoMock$1460201699'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$1874877148] and executes cleanly.
	... 36 more
Caused by: java.lang.reflect.InvocationTargetException
	at jdk.internal.reflect.GeneratedConstructorAccessor229.newInstance(Unknown Source)
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
	at jdk.internal.reflect.GeneratedMethodAccessor343.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$1460201699.<init>(Unknown Source)
	... 54 more

</pre></code>
</details>

[example failure 2022-01-29T03:19:20.7077098Z](https://github.com/apache/pulsar/runs/4988894638?check_suite_focus=true?check_suite_focus=true#step:9:476)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
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
	... 36 more
Caused by: java.lang.reflect.InvocationTargetException
	at jdk.internal.reflect.GeneratedConstructorAccessor292.newInstance(Unknown Source)
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
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$823228743.<init>(Unknown Source)
	... 55 more

</pre></code>
</details>

[example failure 2022-01-28T12:38:10.6876104Z](https://github.com/apache/pulsar/runs/4980334453?check_suite_focus=true?check_suite_focus=true#step:9:402)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
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
Unable to create instance of 'ServerCnx$MockitoMock$2120636344'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$1999893809] and executes cleanly.
	... 36 more
Caused by: java.lang.reflect.InvocationTargetException
	at jdk.internal.reflect.GeneratedConstructorAccessor228.newInstance(Unknown Source)
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
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$2120636344.<init>(Unknown Source)
	... 55 more

</pre></code>
</details>

[example failure 2022-01-28T09:42:31.2222746Z](https://github.com/apache/pulsar/runs/4978229090?check_suite_focus=true?check_suite_focus=true#step:9:5532)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
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
Unable to create instance of 'ServerCnx$MockitoMock$1551272622'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$1377540036] and executes cleanly.
	... 36 more
Caused by: java.lang.reflect.InvocationTargetException
	at jdk.internal.reflect.GeneratedConstructorAccessor235.newInstance(Unknown Source)
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
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$1551272622.<init>(Unknown Source)
	... 55 more

</pre></code>
</details>

[example failure 2022-01-28T11:09:08.4058023Z](https://github.com/apache/pulsar/runs/4979436344?check_suite_focus=true?check_suite_focus=true#step:9:402)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:211)
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
Unable to create instance of 'ServerCnx$MockitoMock$230021022'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$1952071305] and executes cleanly.
	... 36 more
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
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$230021022.<init>(Unknown Source)
	... 56 more

</pre></code>
</details>

```
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:210)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-27T10:25:25.6506815Z](https://github.com/apache/pulsar/runs/4964005942?check_suite_focus=true?check_suite_focus=true#step:9:4047)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:210)
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
Unable to create instance of 'ServerCnx$MockitoMock$684404639'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$688192225] and executes cleanly.
	... 36 more
Caused by: java.lang.reflect.InvocationTargetException
	at jdk.internal.reflect.GeneratedConstructorAccessor224.newInstance(Unknown Source)
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
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:210)
	at jdk.internal.reflect.GeneratedMethodAccessor435.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$684404639.<init>(Unknown Source)
	... 54 more

</pre></code>
</details>

[example failure 2022-01-27T09:54:23.8905417Z](https://github.com/apache/pulsar/runs/4964005942?check_suite_focus=true?check_suite_focus=true#step:9:410)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException: Unable to create mock instance of type 'ServerCnx'
	at org.apache.pulsar.broker.BrokerTestUtil.spyWithClassAndConstructorArgs(BrokerTestUtil.java:43)
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:210)
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
Unable to create instance of 'ServerCnx$MockitoMock$539832160'.
Please ensure the target class has a constructor that matches these argument types: [org.apache.pulsar.broker.PulsarService$MockitoMock$307495366] and executes cleanly.
	... 36 more
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
	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:210)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	... 34 more
Caused by: java.lang.NullPointerException
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:234)
	at org.apache.pulsar.broker.service.ServerCnx.<init>(ServerCnx.java:230)
	at org.apache.pulsar.broker.service.ServerCnx$MockitoMock$539832160.<init>(Unknown Source)
	... 56 more

</pre></code>
</details>

```
org.mockito.exceptions.misusing.WrongTypeOfReturnValue:

BrokerService$MockitoMock$1342305961 cannot be returned by getPulsarResources()
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
[example failure 2022-02-02T13:26:08.1655050Z](https://github.com/apache/pulsar/runs/5036755113?check_suite_focus=true?check_suite_focus=true#step:9:1321)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.misusing.WrongTypeOfReturnValue:

BrokerService$MockitoMock$1342305961 cannot be returned by getPulsarResources()
getPulsarResources() should return PulsarResources
***
If you're unsure why you're getting above error read on.
Due to the nature of the syntax above problem might occur because:
1. This exception *might* occur in wrongly written multi-threaded tests.
   Please refer to Mockito FAQ on limitations of concurrency testing.
2. A spy is stubbed using when(spy.foo()).then() syntax. It is safer to stub spies -
   - with doReturn|Throw() family of methods. More in javadocs for Mockito.spy() method.

	at org.apache.pulsar.broker.service.PersistentTopicTest.setup(PersistentTopicTest.java:209)
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

