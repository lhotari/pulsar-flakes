        
Flaky-test: org.apache.pulsar.broker.service.CurrentLedgerRolloverIfFullTest.cleanup
Number of failures: 1

org.apache.pulsar.broker.service.CurrentLedgerRolloverIfFullTest is flaky. The cleanup test method fails sporadically.

```
   java.lang.Thread.State: WAITING (on object monitor)
	at java.lang.Object.wait(java.base@11.0.15/Native Method)
	- waiting on <no object reference available>
	at java.lang.Object.wait(java.base@11.0.15/Object.java:328)
	at io.netty.util.concurrent.DefaultPromise.await(DefaultPromise.java:253)
	- waiting to re-lock in wait() <0x00000000cfe74048> (a io.netty.util.concurrent.DefaultPromise)
	at io.netty.util.concurrent.DefaultPromise.get(DefaultPromise.java:337)
	at org.apache.pulsar.client.impl.PulsarClientImpl.shutdownEventLoopGroup(PulsarClientImpl.java:782)
	at org.apache.pulsar.client.impl.PulsarClientImpl.shutdown(PulsarClientImpl.java:728)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalCleanup(MockedPulsarServiceBaseTest.java:208)
	at org.apache.pulsar.broker.service.CurrentLedgerRolloverIfFullTest.cleanup(CurrentLedgerRolloverIfFullTest.java:49)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-10T17:39:50.6555211Z](https://github.com/apache/pulsar/runs/6834700300?check_suite_focus=true#step:10:16713)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
   java.lang.Thread.State: WAITING (on object monitor)
	at java.lang.Object.wait(java.base@11.0.15/Native Method)
	- waiting on <no object reference available>
	at java.lang.Object.wait(java.base@11.0.15/Object.java:328)
	at io.netty.util.concurrent.DefaultPromise.await(DefaultPromise.java:253)
	- waiting to re-lock in wait() <0x00000000cfe74048> (a io.netty.util.concurrent.DefaultPromise)
	at io.netty.util.concurrent.DefaultPromise.get(DefaultPromise.java:337)
	at org.apache.pulsar.client.impl.PulsarClientImpl.shutdownEventLoopGroup(PulsarClientImpl.java:782)
	at org.apache.pulsar.client.impl.PulsarClientImpl.shutdown(PulsarClientImpl.java:728)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalCleanup(MockedPulsarServiceBaseTest.java:208)
	at org.apache.pulsar.broker.service.CurrentLedgerRolloverIfFullTest.cleanup(CurrentLedgerRolloverIfFullTest.java:49)
	at jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(java.base@11.0.15/Native Method)
	at jdk.internal.reflect.NativeMethodAccessorImpl.invoke(java.base@11.0.15/NativeMethodAccessorImpl.java:62)
	at jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(java.base@11.0.15/DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(java.base@11.0.15/Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestMethodWorker.invokeAfterClassMethods(TestMethodWorker.java:217)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:130)
	at org.testng.TestRunner$$Lambda$159/0x000000010025d440.accept(Unknown Source)
	at java.util.ArrayList.forEach(java.base@11.0.15/ArrayList.java:1541)
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

