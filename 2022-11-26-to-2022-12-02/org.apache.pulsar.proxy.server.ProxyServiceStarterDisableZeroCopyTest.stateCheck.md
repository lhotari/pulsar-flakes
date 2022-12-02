        
Flaky-test: org.apache.pulsar.proxy.server.ProxyServiceStarterDisableZeroCopyTest.stateCheck
Number of failures: 1

org.apache.pulsar.proxy.server.ProxyServiceStarterDisableZeroCopyTest is flaky. The stateCheck test method fails sporadically.

```
java.lang.IllegalArgumentException: Failed to register Collector of type Gauge: jvm_memory_direct_bytes_used is already in use by another Collector of type Gauge
	at io.prometheus.client.CollectorRegistry.register(CollectorRegistry.java:57)
	at io.prometheus.client.Collector.register(Collector.java:307)
	at org.apache.pulsar.proxy.server.ProxyServiceStarter.start(ProxyServiceStarter.java:220)
	at org.apache.pulsar.proxy.server.ProxyServiceStarterDisableZeroCopyTest.setup(ProxyServiceStarterDisableZeroCopyTest.java:38)
	at org.apache.pulsar.tests.TestRetrySupport.stateCheck(TestRetrySupport.java:60)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-11-28T01:33:38.0701800Z](https://github.com/apache/pulsar/actions/runs/3560857647/jobs/5981340120#step:10:423)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.IllegalArgumentException: Failed to register Collector of type Gauge: jvm_memory_direct_bytes_used is already in use by another Collector of type Gauge
	at io.prometheus.client.CollectorRegistry.register(CollectorRegistry.java:57)
	at io.prometheus.client.Collector.register(Collector.java:307)
	at org.apache.pulsar.proxy.server.ProxyServiceStarter.start(ProxyServiceStarter.java:220)
	at org.apache.pulsar.proxy.server.ProxyServiceStarterDisableZeroCopyTest.setup(ProxyServiceStarterDisableZeroCopyTest.java:38)
	at org.apache.pulsar.tests.TestRetrySupport.stateCheck(TestRetrySupport.java:60)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:69)
	at org.testng.internal.invokers.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:361)
	at org.testng.internal.invokers.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:296)
	at org.testng.internal.invokers.TestInvoker.runConfigMethods(TestInvoker.java:816)
	at org.testng.internal.invokers.TestInvoker.invokeMethod(TestInvoker.java:590)
	at org.testng.internal.invokers.TestInvoker.retryFailed(TestInvoker.java:263)
	at org.testng.internal.invokers.MethodRunner.runInSequence(MethodRunner.java:62)
	at org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:962)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:194)
	at org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:148)
	at org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:806)
	at org.testng.TestRunner.run(TestRunner.java:601)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:433)
	at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:427)
	at org.testng.SuiteRunner.privateRun(SuiteRunner.java:387)
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

</pre></code>
</details>

