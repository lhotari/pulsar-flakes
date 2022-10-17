        
Flaky-test: org.apache.pulsar.broker.service.ReplicatorTest.beforeMethod
Number of failures: 1

org.apache.pulsar.broker.service.ReplicatorTest is flaky. The beforeMethod test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException: java.lang.IllegalStateException: Client instance has been closed.
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:353)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.removeBacklogQuota(NamespacesImpl.java:661)
	at org.apache.pulsar.client.admin.Namespaces.removeBacklogQuota(Namespaces.java:1709)
	at org.apache.pulsar.broker.service.ReplicatorTest.beforeMethod(ReplicatorTest.java:122)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-13T23:39:45.9144979Z](https://github.com/apache/pulsar/actions/runs/3246245283/jobs/5324885656#step:9:1357)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException: java.lang.IllegalStateException: Client instance has been closed.
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:353)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.removeBacklogQuota(NamespacesImpl.java:661)
	at org.apache.pulsar.client.admin.Namespaces.removeBacklogQuota(Namespaces.java:1709)
	at org.apache.pulsar.broker.service.ReplicatorTest.beforeMethod(ReplicatorTest.java:122)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException: java.lang.IllegalStateException: Client instance has been closed.
		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:300)
		... 42 more
	Caused by: java.lang.IllegalStateException: Client instance has been closed.
		at org.glassfish.jersey.internal.guava.Preconditions.checkState(Preconditions.java:169)
		at org.glassfish.jersey.client.JerseyClient.checkNotClosed(JerseyClient.java:257)
		at org.glassfish.jersey.client.JerseyWebTarget.checkNotClosed(JerseyWebTarget.java:118)
		at org.glassfish.jersey.client.JerseyWebTarget.path(JerseyWebTarget.java:129)
		at org.glassfish.jersey.client.JerseyWebTarget.path(JerseyWebTarget.java:38)
		at org.apache.pulsar.client.admin.internal.NamespacesImpl.namespacePath(NamespacesImpl.java:1868)
		at org.apache.pulsar.client.admin.internal.NamespacesImpl.removeBacklogQuotaAsync(NamespacesImpl.java:680)
		at org.apache.pulsar.client.admin.internal.NamespacesImpl.lambda$removeBacklogQuota$47(NamespacesImpl.java:661)
		at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:341)
		... 41 more
Caused by: [CIRCULAR REFERENCE: java.lang.IllegalStateException: Client instance has been closed.]

</pre></code>
</details>

