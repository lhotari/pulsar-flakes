        
Flaky-test: org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.setup
Number of failures: 1

org.apache.pulsar.functions.worker.PulsarFunctionTlsTest is flaky. The setup test method fails sporadically.

```
org.apache.pulsar.broker.PulsarServerException: java.io.IOException: Failed to bind Pulsar broker on /0.0.0.0:42725
	at org.apache.pulsar.broker.PulsarServerException.from(PulsarServerException.java:56)
	at org.apache.pulsar.broker.PulsarService.start(PulsarService.java:1100)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.setup(PulsarFunctionTlsTest.java:170)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-17T23:39:46.2596264Z](https://github.com/apache/pulsar/actions/runs/23221222844/job/67494863930#step:11:576)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.setup -- Time elapsed: 2.982 s <<< FAILURE!
org.apache.pulsar.broker.PulsarServerException: java.io.IOException: Failed to bind Pulsar broker on /0.0.0.0:42725
	at org.apache.pulsar.broker.PulsarServerException.from(PulsarServerException.java:56)
	at org.apache.pulsar.broker.PulsarService.start(PulsarService.java:1100)
	at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.setup(PulsarFunctionTlsTest.java:170)
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
	at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:155)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:102)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:117)
	at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:86)
	at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:137)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
Caused by: java.io.IOException: Failed to bind Pulsar broker on /0.0.0.0:42725
	at org.apache.pulsar.broker.service.BrokerService.start(BrokerService.java:649)
	at org.apache.pulsar.broker.PulsarService.start(PulsarService.java:951)
	... 37 more
Caused by: io.netty.channel.unix.Errors$NativeIoException: bind(..) failed with error(-98): Address already in use
	Suppressed: java.lang.RuntimeException: Rethrowing promise failure cause
		at io.netty.util.concurrent.DefaultPromise.rethrowIfFailed(DefaultPromise.java:686)
		at io.netty.util.concurrent.DefaultPromise.sync(DefaultPromise.java:420)
		at io.netty.channel.DefaultChannelPromise.sync(DefaultChannelPromise.java:119)
		at io.netty.channel.DefaultChannelPromise.sync(DefaultChannelPromise.java:30)
		at org.apache.pulsar.broker.service.BrokerService.start(BrokerService.java:630)
		at org.apache.pulsar.broker.PulsarService.start(PulsarService.java:951)
		at org.apache.pulsar.functions.worker.PulsarFunctionTlsTest.setup(PulsarFunctionTlsTest.java:170)
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
		at org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:155)
		at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeSingleClass(TestNGDirectoryTestSuite.java:102)
		at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.executeLazy(TestNGDirectoryTestSuite.java:117)
		at org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:86)
		at org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:137)
		at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
		at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
		at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
		at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)

</pre></code>
</details>

