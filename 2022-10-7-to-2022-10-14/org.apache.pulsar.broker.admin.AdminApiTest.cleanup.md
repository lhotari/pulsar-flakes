        
Flaky-test: org.apache.pulsar.broker.admin.AdminApiTest.cleanup
Number of failures: 1

org.apache.pulsar.broker.admin.AdminApiTest is flaky. The cleanup test method fails sporadically.

```
   java.lang.Thread.State: WAITING (on object monitor)
	at java.lang.Object.wait(java.base@11.0.16/Native Method)
	- waiting on <no object reference available>
	at java.lang.Object.wait(java.base@11.0.16/Object.java:328)
	at io.netty.util.concurrent.DefaultPromise.await(DefaultPromise.java:253)
	- waiting to re-lock in wait() <0x00000000d5968670> (a io.netty.util.concurrent.DefaultPromise)
	at io.netty.util.concurrent.DefaultPromise.get(DefaultPromise.java:337)
	at org.apache.pulsar.client.impl.PulsarClientImpl.shutdownEventLoopGroup(PulsarClientImpl.java:782)
	at org.apache.pulsar.client.impl.PulsarClientImpl.shutdown(PulsarClientImpl.java:728)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalCleanup(MockedPulsarServiceBaseTest.java:208)
	at org.apache.pulsar.broker.admin.AdminApiTest$MockedPulsarService.cleanup(AdminApiTest.java:2653)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-08-25T23:06:34.1194562Z](https://github.com/apache/pulsar/runs/8023652494?check_suite_focus=true#step:1:14211)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
   java.lang.Thread.State: WAITING (on object monitor)
	at java.lang.Object.wait(java.base@11.0.16/Native Method)
	- waiting on <no object reference available>
	at java.lang.Object.wait(java.base@11.0.16/Object.java:328)
	at io.netty.util.concurrent.DefaultPromise.await(DefaultPromise.java:253)
	- waiting to re-lock in wait() <0x00000000d5968670> (a io.netty.util.concurrent.DefaultPromise)
	at io.netty.util.concurrent.DefaultPromise.get(DefaultPromise.java:337)
	at org.apache.pulsar.client.impl.PulsarClientImpl.shutdownEventLoopGroup(PulsarClientImpl.java:782)
	at org.apache.pulsar.client.impl.PulsarClientImpl.shutdown(PulsarClientImpl.java:728)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalCleanup(MockedPulsarServiceBaseTest.java:208)
	at org.apache.pulsar.broker.admin.AdminApiTest$MockedPulsarService.cleanup(AdminApiTest.java:2653)
	at org.apache.pulsar.broker.admin.AdminApiTest.cleanup(AdminApiTest.java:201)
	at jdk.internal.reflect.GeneratedMethodAccessor454.invoke(Unknown Source)
	at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(java.base@11.0.16/DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(java.base@11.0.16/Method.java:566)
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
	at org.testng.TestRunner$$Lambda$198/0x00000001002c6040.accept(Unknown Source)
	at java.util.ArrayList.forEach(java.base@11.0.16/ArrayList.java:1541)
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

