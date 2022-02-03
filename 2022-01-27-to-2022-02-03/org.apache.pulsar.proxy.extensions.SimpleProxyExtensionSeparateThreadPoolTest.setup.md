        
Flaky-test: org.apache.pulsar.proxy.extensions.SimpleProxyExtensionSeparateThreadPoolTest.setup
Number of failures: 1

org.apache.pulsar.proxy.extensions.SimpleProxyExtensionSeparateThreadPoolTest is flaky. The setup test method fails sporadically.

```
java.lang.RuntimeException: Failed to bind extension `test` on /0.0.0.0:15001
	at org.apache.pulsar.proxy.server.ProxyService.lambda$startProxyExtensions$3(ProxyService.java:257)
	at java.base/java.util.Collections$SingletonMap.forEach(Collections.java:4948)
	at org.apache.pulsar.proxy.server.ProxyService.lambda$startProxyExtensions$4(ProxyService.java:252)
	at java.base/java.util.HashMap.forEach(HashMap.java:1337)
	at org.apache.pulsar.proxy.server.ProxyService.startProxyExtensions(ProxyService.java:251)
	at org.apache.pulsar.proxy.server.ProxyService.start(ProxyService.java:244)
	at org.apache.pulsar.proxy.extensions.SimpleProxyExtensionTestBase.setup(SimpleProxyExtensionTestBase.java:141)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-27T09:17:36.9671710Z](https://github.com/apache/pulsar/runs/4963814538?check_suite_focus=true?check_suite_focus=true#step:9:200)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.RuntimeException: Failed to bind extension `test` on /0.0.0.0:15001
	at org.apache.pulsar.proxy.server.ProxyService.lambda$startProxyExtensions$3(ProxyService.java:257)
	at java.base/java.util.Collections$SingletonMap.forEach(Collections.java:4948)
	at org.apache.pulsar.proxy.server.ProxyService.lambda$startProxyExtensions$4(ProxyService.java:252)
	at java.base/java.util.HashMap.forEach(HashMap.java:1337)
	at org.apache.pulsar.proxy.server.ProxyService.startProxyExtensions(ProxyService.java:251)
	at org.apache.pulsar.proxy.server.ProxyService.start(ProxyService.java:244)
	at org.apache.pulsar.proxy.extensions.SimpleProxyExtensionTestBase.setup(SimpleProxyExtensionTestBase.java:141)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestMethodWorker.invokeBeforeClassMethods(TestMethodWorker.java:176)
	at org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:122)
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
Caused by: io.netty.channel.unix.Errors$NativeIoException: bind(..) failed: Address already in use

</pre></code>
</details>

