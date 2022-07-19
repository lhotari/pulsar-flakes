        
Flaky-test: org.apache.pulsar.client.impl.ClientCnxRequestTimeoutQueueTest.setupClientCnx
Number of failures: 2

org.apache.pulsar.client.impl.ClientCnxRequestTimeoutQueueTest is flaky. The setupClientCnx test method fails sporadically.

```
java.lang.NoClassDefFoundError: Could not initialize class org.apache.pulsar.common.protocol.Commands
	at org.apache.pulsar.client.impl.ClientCnx.<init>(ClientCnx.java:216)
	at org.apache.pulsar.client.impl.ClientCnxRequestTimeoutQueueTest.setupClientCnx(ClientCnxRequestTimeoutQueueTest.java:63)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-12T18:56:57.1645601Z](https://github.com/apache/pulsar/runs/7305439196?check_suite_focus=true#step:10:7080)  
[example failure 2022-07-12T18:50:42.8348157Z](https://github.com/apache/pulsar/runs/7305439196?check_suite_focus=true#step:10:3430)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NoClassDefFoundError: Could not initialize class org.apache.pulsar.common.protocol.Commands
	at org.apache.pulsar.client.impl.ClientCnx.<init>(ClientCnx.java:216)
	at org.apache.pulsar.client.impl.ClientCnxRequestTimeoutQueueTest.setupClientCnx(ClientCnxRequestTimeoutQueueTest.java:63)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.TestRunner.invokeTestConfigurations(TestRunner.java:617)
	at org.testng.TestRunner.beforeRun(TestRunner.java:607)
	at org.testng.TestRunner.run(TestRunner.java:578)
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

