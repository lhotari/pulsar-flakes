        
Flaky-test: org.apache.pulsar.broker.admin.TransactionAndSchemaAuthZTest.testSchemaAndTransactionAuthorization
Number of failures: 1

org.apache.pulsar.broker.admin.TransactionAndSchemaAuthZTest is flaky. The testSchemaAndTransactionAuthorization test method fails sporadically.

```
java.lang.RuntimeException: java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.admin.PulsarAdmin.topics()" because "this.superUserAdmin" is null
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethodNoCheckedException(MethodInvocationHelper.java:57)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeDataProvider(MethodInvocationHelper.java:157)
	at org.testng.internal.Parameters.handleParameters(Parameters.java:803)
	at org.testng.internal.Parameters.handleParameters(Parameters.java:728)
	at org.testng.internal.invokers.ParameterHandler.handleParameters(ParameterHandler.java:72)
	at org.testng.internal.invokers.ParameterHandler.createParameters(ParameterHandler.java:51)
	at org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:924)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:194)
	at org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:148)
	at org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at org.testng.TestRunner.privateRun(TestRunner.java:829)
	at org.testng.TestRunner.run(TestRunner.java:602)
	at org.testng.SuiteRunner.runTest(SuiteRunner.java:437)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-08-12T09:18:02.0542046Z](https://github.com/apache/pulsar/actions/runs/10348585328/job/28642618561#step:11:1064)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.RuntimeException: java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.admin.PulsarAdmin.topics()" because "this.superUserAdmin" is null
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethodNoCheckedException(MethodInvocationHelper.java:57)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeDataProvider(MethodInvocationHelper.java:157)
	at org.testng.internal.Parameters.handleParameters(Parameters.java:803)
	at org.testng.internal.Parameters.handleParameters(Parameters.java:728)
	at org.testng.internal.invokers.ParameterHandler.handleParameters(ParameterHandler.java:72)
	at org.testng.internal.invokers.ParameterHandler.createParameters(ParameterHandler.java:51)
	at org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:924)
	at org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:194)
	at org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:148)
	at org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:128)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
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
Caused by: java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.admin.PulsarAdmin.topics()" because "this.superUserAdmin" is null
	at org.apache.pulsar.broker.admin.AuthZTest.createTopic(AuthZTest.java:117)
	at org.apache.pulsar.broker.admin.TransactionAndSchemaAuthZTest.authFunction(TransactionAndSchemaAuthZTest.java:127)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:84)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethodNoCheckedException(MethodInvocationHelper.java:53)
	... 31 more

</pre></code>
</details>

