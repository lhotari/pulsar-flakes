        
Flaky-test: org.apache.pulsar.proxy.server.ProxyServiceStarterDisableZeroCopyTest.stateCheck
Number of failures: 1

org.apache.pulsar.proxy.server.ProxyServiceStarterDisableZeroCopyTest is flaky. The stateCheck test method fails sporadically.

```
java.lang.IllegalArgumentException: Collector already registered that provides name: jvm_memory_direct_bytes_used
	at io.prometheus.client.CollectorRegistry.register(CollectorRegistry.java:54)
	at io.prometheus.client.Collector.register(Collector.java:139)
	at org.apache.pulsar.proxy.server.ProxyServiceStarter.start(ProxyServiceStarter.java:226)
	at org.apache.pulsar.proxy.server.ProxyServiceStarterDisableZeroCopyTest.setup(ProxyServiceStarterDisableZeroCopyTest.java:38)
	at org.apache.pulsar.tests.TestRetrySupport.stateCheck(TestRetrySupport.java:60)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-06T11:34:35.2337107Z](https://github.com/apache/pulsar/runs/7213753036?check_suite_focus=true#step:10:380)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.IllegalArgumentException: Collector already registered that provides name: jvm_memory_direct_bytes_used
	at io.prometheus.client.CollectorRegistry.register(CollectorRegistry.java:54)
	at io.prometheus.client.Collector.register(Collector.java:139)
	at org.apache.pulsar.proxy.server.ProxyServiceStarter.start(ProxyServiceStarter.java:226)
	at org.apache.pulsar.proxy.server.ProxyServiceStarterDisableZeroCopyTest.setup(ProxyServiceStarterDisableZeroCopyTest.java:38)
	at org.apache.pulsar.tests.TestRetrySupport.stateCheck(TestRetrySupport.java:60)
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
	at org.testng.internal.TestInvoker.retryFailed(TestInvoker.java:214)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:58)
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

</pre></code>
</details>

