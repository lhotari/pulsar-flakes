        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest
Number of failures: 87

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The rest test method fails sporadically.

```
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.broker.PulsarService.getConfiguration()" because "this.pulsar" is null
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:138)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-14T10:56:02.8684247Z](https://github.com/apache/pulsar/actions/runs/3249033200/jobs/5331341219#step:8:269)  
[example failure 2022-10-14T09:56:58.9897355Z](https://github.com/apache/pulsar/actions/runs/3246419630/jobs/5330528404#step:8:269)  
[example failure 2022-10-14T09:31:02.8171692Z](https://github.com/apache/pulsar/actions/runs/3246245282/jobs/5329887234#step:8:179)  
[example failure 2022-10-14T08:32:32.2265543Z](https://github.com/apache/pulsar/actions/runs/3248340819/jobs/5329581715#step:8:167)  
[example failure 2022-10-14T06:51:22.2896215Z](https://github.com/apache/pulsar/actions/runs/3247045561/jobs/5328555438#step:8:179)  
[example failure 2022-10-14T02:55:58.9793188Z](https://github.com/apache/pulsar/actions/runs/3247045561/jobs/5326591310#step:8:269)  
[example failure 2022-10-14T02:40:17.0280341Z](https://github.com/apache/pulsar/actions/runs/3247018079/jobs/5326486248#step:8:187)  
[example failure 2022-10-14T01:55:24.4374931Z](https://github.com/apache/pulsar/actions/runs/3246868915/jobs/5326162456#step:8:269)  
[example failure 2022-10-14T01:36:47.3637153Z](https://github.com/apache/pulsar/actions/runs/3246245282/jobs/5326011276#step:8:258)  
[example failure 2022-10-13T23:09:04.3571484Z](https://github.com/apache/pulsar/actions/runs/3246245282/jobs/5324775355#step:8:269)  
[example failure 2022-10-13T18:15:45.3398214Z](https://github.com/apache/pulsar/actions/runs/3244617454/jobs/5321036631#step:8:187)  
[example failure 2022-10-13T14:42:08.9765136Z](https://github.com/apache/pulsar/actions/runs/3240577012/jobs/5317352775#step:8:187)  
[example failure 2022-10-13T14:33:10.6488744Z](https://github.com/apache/pulsar/actions/runs/3240610250/jobs/5317309475#step:8:187)  
[example failure 2022-10-13T08:46:41.9410627Z](https://github.com/apache/pulsar/actions/runs/3240659858/jobs/5311876562#step:8:187)  
[example failure 2022-10-13T08:42:16.6263118Z](https://github.com/apache/pulsar/actions/runs/3240623988/jobs/5311736002#step:8:187)  
[example failure 2022-10-13T08:39:25.0561994Z](https://github.com/apache/pulsar/actions/runs/3240610250/jobs/5311712964#step:8:179)  
[example failure 2022-10-13T08:35:46.4302481Z](https://github.com/apache/pulsar/actions/runs/3240577012/jobs/5311589455#step:8:187)  
[example failure 2022-10-13T05:27:18.5198849Z](https://github.com/apache/pulsar/actions/runs/3239849062/jobs/5309746036#step:8:187)  
[example failure 2022-10-13T03:13:48.4222895Z](https://github.com/apache/pulsar/actions/runs/3233318834/jobs/5308618418#step:8:169)  
[example failure 2022-10-13T01:41:56.1991357Z](https://github.com/apache/pulsar/actions/runs/3239067534/jobs/5308020214#step:8:179)  
[example failure 2022-10-13T00:42:54.0060654Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5307507702#step:8:183)  
[example failure 2022-10-12T23:57:31.8727827Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5307118618#step:8:172)  
[example failure 2022-10-12T18:15:04.6708976Z](https://github.com/apache/pulsar/actions/runs/3236801789/jobs/5303181996#step:8:187)  
[example failure 2022-10-12T17:42:38.3553374Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5302462647#step:8:180)  
[example failure 2022-10-12T16:13:56.8878317Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5300997885#step:8:179)  
[example failure 2022-10-12T15:27:15.6578892Z](https://github.com/apache/pulsar/actions/runs/3235740231/jobs/5300674445#step:8:175)  
[example failure 2022-10-12T15:15:02.2733200Z](https://github.com/apache/pulsar/actions/runs/3235705916/jobs/5300569342#step:8:187)  
[example failure 2022-10-12T14:40:34.2075008Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5299947306#step:8:183)  
[example failure 2022-10-12T12:28:42.5634598Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5297070111#step:8:183)  
[example failure 2022-10-12T11:56:10.3754686Z](https://github.com/apache/pulsar/actions/runs/3233318834/jobs/5296016020#step:8:187)  
[example failure 2022-10-12T08:57:21.4081821Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5294318373#step:8:175)  
[example failure 2022-10-12T06:54:56.3210764Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5292938796#step:8:183)  
[example failure 2022-10-12T05:04:34.5188894Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5292392548#step:8:183)  
[example failure 2022-10-12T02:18:34.4514755Z](https://github.com/apache/pulsar/actions/runs/3227865814/jobs/5291100978#step:8:183)  
[example failure 2022-10-12T01:57:04.4201493Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5290991996#step:8:183)  
[example failure 2022-10-12T01:46:07.5508838Z](https://github.com/apache/pulsar/actions/runs/3231410501/jobs/5290909090#step:8:179)  
[example failure 2022-10-11T19:58:34.1300176Z](https://github.com/apache/pulsar/actions/runs/3229794672/jobs/5287496883#step:8:187)  
[example failure 2022-10-11T13:19:48.7503258Z](https://github.com/apache/pulsar/actions/runs/3224852740/jobs/5281004691#step:8:183)  
[example failure 2022-10-11T11:16:46.8681394Z](https://github.com/apache/pulsar/actions/runs/3225447109/jobs/5278912457#step:8:175)  
[example failure 2022-10-11T10:41:16.3773448Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5278497616#step:8:183)  
[example failure 2022-10-11T07:47:29.6707802Z](https://github.com/apache/pulsar/actions/runs/3224912721/jobs/5276607749#step:8:183)  
[example failure 2022-10-11T07:34:15.8751936Z](https://github.com/apache/pulsar/actions/runs/3224852740/jobs/5276534790#step:8:183)  
[example failure 2022-10-11T06:22:09.6054484Z](https://github.com/apache/pulsar/actions/runs/3224531076/jobs/5275758632#step:8:164)  
[example failure 2022-10-11T05:12:43.7727887Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5275189880#step:8:175)  
[example failure 2022-10-11T04:15:10.8761452Z](https://github.com/apache/pulsar/actions/runs/3223919371/jobs/5274707393#step:8:175)  
[example failure 2022-10-11T03:48:07.4912689Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5274485969#step:8:183)  
[example failure 2022-10-10T12:21:50.9103856Z](https://github.com/apache/pulsar/actions/runs/3219150517/jobs/5264205064#step:8:183)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.broker.PulsarService.getConfiguration()" because "this.pulsar" is null
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:138)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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

```
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.service.BrokerTestBase was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:177)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-13T14:50:15.4871627Z](https://github.com/apache/pulsar/actions/runs/3240577012/jobs/5317352775#step:8:1683)  
[example failure 2022-10-13T14:42:15.2897785Z](https://github.com/apache/pulsar/actions/runs/3240610250/jobs/5317309475#step:8:1438)  
[example failure 2022-10-13T08:43:52.2541699Z](https://github.com/apache/pulsar/actions/runs/3240577012/jobs/5311589455#step:8:1615)  
[example failure 2022-10-13T00:05:44.1503437Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5307118618#step:8:1498)  
[example failure 2022-10-12T17:50:18.5744020Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5302462647#step:8:1501)  
[example failure 2022-10-12T15:23:40.9071491Z](https://github.com/apache/pulsar/actions/runs/3235705916/jobs/5300569342#step:8:1516)  
[example failure 2022-10-12T14:48:07.7598365Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5299947306#step:8:1440)  
[example failure 2022-10-12T12:36:59.9183811Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5297070111#step:8:1606)  
[example failure 2022-10-12T09:07:27.7525683Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5294318373#step:8:1650)  
[example failure 2022-10-12T05:12:14.3157113Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5292392548#step:8:1440)  
[example failure 2022-10-12T01:54:53.9461384Z](https://github.com/apache/pulsar/actions/runs/3231410501/jobs/5290909090#step:8:1613)  
[example failure 2022-10-11T03:56:43.2707236Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5274485969#step:8:1509)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.service.BrokerTestBase was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:177)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor102.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:548)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
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

[example failure 2022-10-14T01:56:15.6082393Z](https://github.com/apache/pulsar/actions/runs/3246245282/jobs/5326011276#step:8:1760)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.service.BrokerTestBase was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:177)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor322.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:548)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
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
Caused by: java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.FutureTask.get(FutureTask.java:204)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:101)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:81)
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:103)
	... 45 more

</pre></code>
</details>

```
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.service.BrokerTestBase was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:233)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:150)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:676)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-14T11:11:40.2813177Z](https://github.com/apache/pulsar/actions/runs/3249033200/jobs/5331341219#step:8:1704)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.service.BrokerTestBase was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:233)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:150)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:676)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor322.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:548)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
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

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-13T00:05:44.1149321Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5307118618#step:8:1319)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.zookeeper.MockZooKeeper.multi(MockZooKeeper.java:1006)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.batchOperation(ZKMetadataStore.java:165)
	at org.apache.pulsar.metadata.impl.batching.AbstractBatchedMetadataStore.flush(AbstractBatchedMetadataStore.java:117)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 12 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 12 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor102.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.zookeeper.MockZooKeeper.multi(MockZooKeeper.java:1006)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.batchOperation(ZKMetadataStore.java:165)
	at org.apache.pulsar.metadata.impl.batching.AbstractBatchedMetadataStore.flush(AbstractBatchedMetadataStore.java:117)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 12 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 12 more

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:272)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:863)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:229)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:173)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:173)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.asynchttpclient.netty.NettyResponseFuture.loadContent(NettyResponseFuture.java:222)
		at org.asynchttpclient.netty.NettyResponseFuture.done(NettyResponseFuture.java:257)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.finishUpdate(AsyncHttpClientHandler.java:241)
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:114)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:143)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
		at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
		at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
		at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:722)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:584)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:496)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:995)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 ? --- An unexpected error occurred in the server ---??Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1??Stacktrace:??org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1?Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1?	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)?	at
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:960)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 ? --- An unexpected error occurred in the server ---??Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1??Stacktrace:??org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1?Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic1?	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)?	at]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665588119191

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665588119191
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665588119191
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-12T15:23:40.8451003Z](https://github.com/apache/pulsar/actions/runs/3235705916/jobs/5300569342#step:8:1337)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665588119191

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665588119191
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665588119191
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.zookeeper.MockZooKeeper.multi(MockZooKeeper.java:1006)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.batchOperation(ZKMetadataStore.java:165)
	at org.apache.pulsar.metadata.impl.batching.AbstractBatchedMetadataStore.flush(AbstractBatchedMetadataStore.java:117)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665588119191
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 12 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665588119191
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 12 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor102.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665588119191

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665588119191
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665588119191
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.zookeeper.MockZooKeeper.multi(MockZooKeeper.java:1006)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.batchOperation(ZKMetadataStore.java:165)
	at org.apache.pulsar.metadata.impl.batching.AbstractBatchedMetadataStore.flush(AbstractBatchedMetadataStore.java:117)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665588119191
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 12 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665588119191
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 12 more

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:272)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:863)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:229)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:173)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:173)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.asynchttpclient.netty.NettyResponseFuture.loadContent(NettyResponseFuture.java:222)
		at org.asynchttpclient.netty.NettyResponseFuture.done(NettyResponseFuture.java:257)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.finishUpdate(AsyncHttpClientHandler.java:241)
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:114)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:143)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
		at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
		at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
		at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:722)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:584)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:496)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:995)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 ? --- An unexpected error occurred in the server ---??Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665588119191??Stacktrace:??org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665588119191?Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665588119191?	at java.base/java.util.concurrent.CompletableFutu
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:960)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 ? --- An unexpected error occurred in the server ---??Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665588119191??Stacktrace:??org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665588119191?Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1-1665588119191?	at java.base/java.util.concurrent.CompletableFutu]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ConflictException: Cannot delete non empty bundle
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-13T14:42:15.2734498Z](https://github.com/apache/pulsar/actions/runs/3240610250/jobs/5317309475#step:8:1327)  
[example failure 2022-10-13T08:48:38.7759255Z](https://github.com/apache/pulsar/actions/runs/3240610250/jobs/5311712964#step:8:1315)  
[example failure 2022-10-13T08:43:52.2257831Z](https://github.com/apache/pulsar/actions/runs/3240577012/jobs/5311589455#step:8:1504)  
[example failure 2022-10-12T18:22:38.1180424Z](https://github.com/apache/pulsar/actions/runs/3236801789/jobs/5303181996#step:8:1325)  
[example failure 2022-10-12T12:36:59.8977820Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5297070111#step:8:1495)  
[example failure 2022-10-12T12:05:24.1609173Z](https://github.com/apache/pulsar/actions/runs/3233318834/jobs/5296016020#step:8:1337)  
[example failure 2022-10-12T01:54:53.9170749Z](https://github.com/apache/pulsar/actions/runs/3231410501/jobs/5290909090#step:8:1502)  
[example failure 2022-10-11T10:48:46.4863637Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5278497616#step:8:1330)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ConflictException: Cannot delete non empty bundle
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor102.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ConflictException: Cannot delete non empty bundle
		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:287)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:863)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:229)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:173)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:173)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.asynchttpclient.netty.NettyResponseFuture.loadContent(NettyResponseFuture.java:222)
		at org.asynchttpclient.netty.NettyResponseFuture.done(NettyResponseFuture.java:257)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.finishUpdate(AsyncHttpClientHandler.java:241)
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:114)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:143)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
		at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
		at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
		at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:722)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:584)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:496)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:995)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.ClientErrorException: HTTP 409 Cannot delete non empty bundle
		at org.glassfish.jersey.client.JerseyInvocation.createExceptionForFamily(JerseyInvocation.java:985)
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:967)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.ClientErrorException: HTTP 409 Cannot delete non empty bundle]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ConflictException: Cannot delete non empty bundle
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:674)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-14T02:48:09.5018874Z](https://github.com/apache/pulsar/actions/runs/3247018079/jobs/5326486248#step:8:1339)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ConflictException: Cannot delete non empty bundle
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:674)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor102.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ConflictException: Cannot delete non empty bundle
		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:287)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:863)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:229)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:173)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:173)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.asynchttpclient.netty.NettyResponseFuture.loadContent(NettyResponseFuture.java:222)
		at org.asynchttpclient.netty.NettyResponseFuture.done(NettyResponseFuture.java:257)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.finishUpdate(AsyncHttpClientHandler.java:241)
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:114)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:143)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
		at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
		at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
		at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:722)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:584)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:496)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:995)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.ClientErrorException: HTTP 409 Cannot delete non empty bundle
		at org.glassfish.jersey.client.JerseyInvocation.createExceptionForFamily(JerseyInvocation.java:985)
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:967)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.ClientErrorException: HTTP 409 Cannot delete non empty bundle]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ConflictException: Cannot delete non empty bundle
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:270)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:150)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:676)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-14T07:00:35.7004985Z](https://github.com/apache/pulsar/actions/runs/3247045561/jobs/5328555438#step:8:1315)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ConflictException: Cannot delete non empty bundle
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:270)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:150)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:676)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor102.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ConflictException: Cannot delete non empty bundle
		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:287)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:863)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:229)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:173)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:173)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.asynchttpclient.netty.NettyResponseFuture.loadContent(NettyResponseFuture.java:222)
		at org.asynchttpclient.netty.NettyResponseFuture.done(NettyResponseFuture.java:257)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.finishUpdate(AsyncHttpClientHandler.java:241)
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:114)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:143)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
		at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
		at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
		at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:722)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:584)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:496)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:995)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.ClientErrorException: HTTP 409 Cannot delete non empty bundle
		at org.glassfish.jersey.client.JerseyInvocation.createExceptionForFamily(JerseyInvocation.java:985)
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:967)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.ClientErrorException: HTTP 409 Cannot delete non empty bundle]

</pre></code>
</details>

[example failure 2022-10-14T11:11:40.2608325Z](https://github.com/apache/pulsar/actions/runs/3249033200/jobs/5331341219#step:8:1592)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ConflictException: Cannot delete non empty bundle
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:270)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:150)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:676)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor322.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ConflictException: Cannot delete non empty bundle
		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:287)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:863)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:229)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:173)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:173)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.asynchttpclient.netty.NettyResponseFuture.loadContent(NettyResponseFuture.java:222)
		at org.asynchttpclient.netty.NettyResponseFuture.done(NettyResponseFuture.java:257)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.finishUpdate(AsyncHttpClientHandler.java:241)
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:114)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:143)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
		at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
		at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
		at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:722)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:584)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:496)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:995)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.ClientErrorException: HTTP 409 Cannot delete non empty bundle
		at org.glassfish.jersey.client.JerseyInvocation.createExceptionForFamily(JerseyInvocation.java:985)
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:967)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.ClientErrorException: HTTP 409 Cannot delete non empty bundle]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$NotFoundException: Topic persistent://my-property/my-ns/my-topic3 not found
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-12T14:48:07.7468082Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5299947306#step:8:1330)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$NotFoundException: Topic persistent://my-property/my-ns/my-topic3 not found
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor102.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$NotFoundException: Topic persistent://my-property/my-ns/my-topic3 not found
		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:283)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:863)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:229)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:173)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:173)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.asynchttpclient.netty.NettyResponseFuture.loadContent(NettyResponseFuture.java:222)
		at org.asynchttpclient.netty.NettyResponseFuture.done(NettyResponseFuture.java:257)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.finishUpdate(AsyncHttpClientHandler.java:241)
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:114)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:143)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
		at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
		at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
		at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:722)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:584)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:496)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:995)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.NotFoundException: HTTP 404 Topic persistent://my-property/my-ns/my-topic3 not found
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:948)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.NotFoundException: HTTP 404 Topic persistent://my-property/my-ns/my-topic3 not found]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$NotFoundException:
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:156)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-12T18:22:38.1434251Z](https://github.com/apache/pulsar/actions/runs/3236801789/jobs/5303181996#step:8:1436)  
[example failure 2022-10-11T10:48:46.5021009Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5278497616#step:8:1441)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$NotFoundException:
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:156)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor102.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:548)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$NotFoundException:
		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:283)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:863)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:229)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:173)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:173)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.asynchttpclient.netty.NettyResponseFuture.loadContent(NettyResponseFuture.java:222)
		at org.asynchttpclient.netty.NettyResponseFuture.done(NettyResponseFuture.java:257)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.finishUpdate(AsyncHttpClientHandler.java:241)
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:114)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:143)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
		at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
		at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
		at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:722)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:584)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:496)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:995)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.NotFoundException: HTTP 404
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:948)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.NotFoundException: HTTP 404 ]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$NotFoundException: Topic persistent://my-property/my-ns/my-topic4 not found
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-12T05:12:14.2865981Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5292392548#step:8:1330)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$NotFoundException: Topic persistent://my-property/my-ns/my-topic4 not found
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor102.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$NotFoundException: Topic persistent://my-property/my-ns/my-topic4 not found
		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:283)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:863)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:229)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:173)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:173)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.asynchttpclient.netty.NettyResponseFuture.loadContent(NettyResponseFuture.java:222)
		at org.asynchttpclient.netty.NettyResponseFuture.done(NettyResponseFuture.java:257)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.finishUpdate(AsyncHttpClientHandler.java:241)
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:114)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:143)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
		at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
		at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
		at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:722)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:584)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:496)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:995)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.NotFoundException: HTTP 404 Topic persistent://my-property/my-ns/my-topic4 not found
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:948)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.NotFoundException: HTTP 404 Topic persistent://my-property/my-ns/my-topic4 not found]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665712314282

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665712314282
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665712314282
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-14T01:56:15.5635099Z](https://github.com/apache/pulsar/actions/runs/3246245282/jobs/5326011276#step:8:1581)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665712314282

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665712314282
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665712314282
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.zookeeper.MockZooKeeper.multi(MockZooKeeper.java:1006)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.batchOperation(ZKMetadataStore.java:165)
	at org.apache.pulsar.metadata.impl.batching.AbstractBatchedMetadataStore.flush(AbstractBatchedMetadataStore.java:117)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665712314282
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 12 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665712314282
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 12 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor322.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665712314282

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665712314282
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665712314282
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.zookeeper.MockZooKeeper.multi(MockZooKeeper.java:1006)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.batchOperation(ZKMetadataStore.java:165)
	at org.apache.pulsar.metadata.impl.batching.AbstractBatchedMetadataStore.flush(AbstractBatchedMetadataStore.java:117)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665712314282
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 12 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665712314282
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 12 more

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:272)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:863)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:229)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:173)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:173)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.asynchttpclient.netty.NettyResponseFuture.loadContent(NettyResponseFuture.java:222)
		at org.asynchttpclient.netty.NettyResponseFuture.done(NettyResponseFuture.java:257)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.finishUpdate(AsyncHttpClientHandler.java:241)
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:114)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:143)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
		at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
		at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
		at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:722)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:584)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:496)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:995)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 ? --- An unexpected error occurred in the server ---??Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665712314282??Stacktrace:??org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665712314282?Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665712314282?	at java.base/java.util.concurrent.Completab
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:960)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 ? --- An unexpected error occurred in the server ---??Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665712314282??Stacktrace:??org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665712314282?Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myecdsa-topic1-1665712314282?	at java.base/java.util.concurrent.Completab]

</pre></code>
</details>

```
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.service.BrokerTestBase was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:177)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:674)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-14T08:41:04.0111571Z](https://github.com/apache/pulsar/actions/runs/3248340819/jobs/5329581715#step:8:1607)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition with org.apache.pulsar.broker.service.BrokerTestBase was not fulfilled within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:78)
	at org.awaitility.core.CallableCondition.await(CallableCondition.java:26)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:954)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:177)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:674)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor102.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:548)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
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
Caused by: java.util.concurrent.TimeoutException
	at java.base/java.util.concurrent.FutureTask.get(FutureTask.java:204)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:101)
	at org.awaitility.core.Uninterruptibles.getUninterruptibly(Uninterruptibles.java:81)
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:103)
	... 45 more

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-14T08:41:03.9878290Z](https://github.com/apache/pulsar/actions/runs/3248340819/jobs/5329581715#step:8:1426)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.zookeeper.MockZooKeeper.multi(MockZooKeeper.java:1006)
	at org.apache.zookeeper.MockZooKeeperSession.multi(MockZooKeeperSession.java:184)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.batchOperation(ZKMetadataStore.java:165)
	at org.apache.pulsar.metadata.impl.batching.AbstractBatchedMetadataStore.flush(AbstractBatchedMetadataStore.java:117)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 13 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 13 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:674)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor102.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.zookeeper.MockZooKeeper.multi(MockZooKeeper.java:1006)
	at org.apache.zookeeper.MockZooKeeperSession.multi(MockZooKeeperSession.java:184)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.batchOperation(ZKMetadataStore.java:165)
	at org.apache.pulsar.metadata.impl.batching.AbstractBatchedMetadataStore.flush(AbstractBatchedMetadataStore.java:117)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 13 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 13 more

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:272)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:863)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:229)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:173)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:173)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.asynchttpclient.netty.NettyResponseFuture.loadContent(NettyResponseFuture.java:222)
		at org.asynchttpclient.netty.NettyResponseFuture.done(NettyResponseFuture.java:257)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.finishUpdate(AsyncHttpClientHandler.java:241)
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:114)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:143)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
		at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
		at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
		at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:722)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:584)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:496)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:995)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 ? --- An unexpected error occurred in the server ---??Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1??Stacktrace:??org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1?Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1?	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:960)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 ? --- An unexpected error occurred in the server ---??Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1??Stacktrace:??org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1?Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/myrsa-topic1?	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /admin/policies/my-property/my-ns
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:156)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:674)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-14T02:48:09.5140853Z](https://github.com/apache/pulsar/actions/runs/3247018079/jobs/5326486248#step:8:1450)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /admin/policies/my-property/my-ns
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:156)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:674)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor102.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:548)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /admin/policies/my-property/my-ns
		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:283)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:863)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:229)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:173)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:173)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.asynchttpclient.netty.NettyResponseFuture.loadContent(NettyResponseFuture.java:222)
		at org.asynchttpclient.netty.NettyResponseFuture.done(NettyResponseFuture.java:257)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.finishUpdate(AsyncHttpClientHandler.java:241)
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:114)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:143)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
		at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
		at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
		at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:722)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:584)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:496)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:995)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.NotFoundException: HTTP 404 org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /admin/policies/my-property/my-ns
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:948)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.NotFoundException: HTTP 404 org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /admin/policies/my-property/my-ns]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/cache-topic

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/cache-topic
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/cache-topic
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-12T09:07:27.7145765Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5294318373#step:8:1471)  
[example failure 2022-10-11T03:56:43.2200944Z](https://github.com/apache/pulsar/actions/runs/3223890090/jobs/5274485969#step:8:1330)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/cache-topic

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/cache-topic
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/cache-topic
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.zookeeper.MockZooKeeper.multi(MockZooKeeper.java:1006)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.batchOperation(ZKMetadataStore.java:165)
	at org.apache.pulsar.metadata.impl.batching.AbstractBatchedMetadataStore.flush(AbstractBatchedMetadataStore.java:117)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/cache-topic
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 12 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/cache-topic
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 12 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor102.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/cache-topic

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/cache-topic
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/cache-topic
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.zookeeper.MockZooKeeper.multi(MockZooKeeper.java:1006)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.batchOperation(ZKMetadataStore.java:165)
	at org.apache.pulsar.metadata.impl.batching.AbstractBatchedMetadataStore.flush(AbstractBatchedMetadataStore.java:117)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/cache-topic
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 12 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/cache-topic
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 12 more

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:272)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:863)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:229)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:173)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:173)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.asynchttpclient.netty.NettyResponseFuture.loadContent(NettyResponseFuture.java:222)
		at org.asynchttpclient.netty.NettyResponseFuture.done(NettyResponseFuture.java:257)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.finishUpdate(AsyncHttpClientHandler.java:241)
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:114)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:143)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
		at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
		at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
		at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:722)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:584)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:496)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:995)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 ? --- An unexpected error occurred in the server ---??Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/cache-topic??Stacktrace:??org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/cache-topic?Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/cache-topic?	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:960)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 ? --- An unexpected error occurred in the server ---??Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/cache-topic??Stacktrace:??org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/cache-topic?Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/cache-topic?	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic3

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic3
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic3
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-12T17:50:18.5525686Z](https://github.com/apache/pulsar/actions/runs/3225080636/jobs/5302462647#step:8:1330)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic3

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic3
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic3
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$internalStoreDelete$11(ZKMetadataStore.java:352)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic3
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 8 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic3
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 8 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor102.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic3

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic3
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic3
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$internalStoreDelete$11(ZKMetadataStore.java:352)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:304)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic3
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 8 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic3
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 8 more

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:272)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:863)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:229)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:173)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:173)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.asynchttpclient.netty.NettyResponseFuture.loadContent(NettyResponseFuture.java:222)
		at org.asynchttpclient.netty.NettyResponseFuture.done(NettyResponseFuture.java:257)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.finishUpdate(AsyncHttpClientHandler.java:241)
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:114)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:143)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
		at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
		at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
		at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:722)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:584)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:496)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:995)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 ? --- An unexpected error occurred in the server ---??Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic3??Stacktrace:??org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic3?Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic3?	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)?	at
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:960)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 ? --- An unexpected error occurred in the server ---??Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic3??Stacktrace:??org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic3?Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/my-topic3?	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)?	at]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/testGetLastDisconnectedTimestampForPartitionedTopic-partition-2

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/testGetLastDisconnectedTimestampForPartitionedTopic-partition-2
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/testGetLastDisconnectedTimestampForPartitionedTopic-partition-2
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-13T14:50:15.4564625Z](https://github.com/apache/pulsar/actions/runs/3240577012/jobs/5317352775#step:8:1504)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:

 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/testGetLastDisconnectedTimestampForPartitionedTopic-partition-2

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/testGetLastDisconnectedTimestampForPartitionedTopic-partition-2
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/testGetLastDisconnectedTimestampForPartitionedTopic-partition-2
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.zookeeper.MockZooKeeper.multi(MockZooKeeper.java:1006)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.batchOperation(ZKMetadataStore.java:165)
	at org.apache.pulsar.metadata.impl.batching.AbstractBatchedMetadataStore.flush(AbstractBatchedMetadataStore.java:117)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/testGetLastDisconnectedTimestampForPartitionedTopic-partition-2
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 12 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/testGetLastDisconnectedTimestampForPartitionedTopic-partition-2
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 12 more

	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:212)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor102.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$ServerSideErrorException:
 --- An unexpected error occurred in the server ---

Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/testGetLastDisconnectedTimestampForPartitionedTopic-partition-2

Stacktrace:

org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/testGetLastDisconnectedTimestampForPartitionedTopic-partition-2
Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/testGetLastDisconnectedTimestampForPartitionedTopic-partition-2
	at java.base/java.util.concurrent.CompletableFuture.encodeThrowable(CompletableFuture.java:332)
	at java.base/java.util.concurrent.CompletableFuture.completeThrowable(CompletableFuture.java:347)
	at java.base/java.util.concurrent.CompletableFuture$UniRun.tryFire(CompletableFuture.java:781)
	at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
	at java.base/java.util.concurrent.CompletableFuture.completeExceptionally(CompletableFuture.java:2162)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.handleDeleteResult(ZKMetadataStore.java:279)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.lambda$batchOperation$7(ZKMetadataStore.java:191)
	at org.apache.zookeeper.MockZooKeeper.multi(MockZooKeeper.java:1006)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.batchOperation(ZKMetadataStore.java:165)
	at org.apache.pulsar.metadata.impl.batching.AbstractBatchedMetadataStore.flush(AbstractBatchedMetadataStore.java:117)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:539)
	at java.base/java.util.concurrent.FutureTask.runAndReset(FutureTask.java:305)
	at java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:305)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/testGetLastDisconnectedTimestampForPartitionedTopic-partition-2
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:445)
	... 12 more
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/testGetLastDisconnectedTimestampForPartitionedTopic-partition-2
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:118)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:54)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.getException(ZKMetadataStore.java:439)
	... 12 more

		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:272)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:863)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:229)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:173)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:173)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.asynchttpclient.netty.NettyResponseFuture.loadContent(NettyResponseFuture.java:222)
		at org.asynchttpclient.netty.NettyResponseFuture.done(NettyResponseFuture.java:257)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.finishUpdate(AsyncHttpClientHandler.java:241)
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:114)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:143)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
		at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
		at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
		at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:722)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:584)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:496)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:995)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.InternalServerErrorException: HTTP 500 ? --- An unexpected error occurred in the server ---??Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/testGetLastDisconnectedTimestampForPartitionedTopic-partition-2??Stacktrace:??org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/testGetLastDisconnectedTimestampForPartitionedTopic-partition-2?Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/tes
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:960)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.InternalServerErrorException: HTTP 500 ? --- An unexpected error occurred in the server ---??Message: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/testGetLastDisconnectedTimestampForPartitionedTopic-partition-2??Stacktrace:??org.apache.bookkeeper.mledger.ManagedLedgerException$MetaStoreException: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/testGetLastDisconnectedTimestampForPartitionedTopic-partition-2?Caused by: java.util.concurrent.CompletionException: org.apache.pulsar.metadata.api.MetadataStoreException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /managed-ledgers/my-property/my-ns/persistent/tes]

</pre></code>
</details>

```
org.apache.pulsar.client.admin.PulsarAdminException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /admin/policies/my-property/my-ns
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:156)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-10-12T12:05:24.2318726Z](https://github.com/apache/pulsar/actions/runs/3233318834/jobs/5296016020#step:8:1448)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /admin/policies/my-property/my-ns
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:351)
	at org.apache.pulsar.client.admin.internal.NamespacesImpl.deleteNamespace(NamespacesImpl.java:231)
	at org.apache.pulsar.broker.service.BrokerTestBase.deleteNamespaceGraceFully(BrokerTestBase.java:156)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.deleteNamespaceGraceFully(MockedPulsarServiceBaseTest.java:673)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.rest(SimpleProducerConsumerTest.java:143)
	at jdk.internal.reflect.GeneratedMethodAccessor102.invoke(Unknown Source)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.MethodInvocationHelper.invokeMethodConsideringTimeout(MethodInvocationHelper.java:61)
	at org.testng.internal.ConfigInvoker.invokeConfigurationMethod(ConfigInvoker.java:366)
	at org.testng.internal.ConfigInvoker.invokeConfigurations(ConfigInvoker.java:320)
	at org.testng.internal.TestInvoker.runConfigMethods(TestInvoker.java:701)
	at org.testng.internal.TestInvoker.runAfterGroupsConfigurations(TestInvoker.java:677)
	at org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:548)
	at org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:174)
	at org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException$NotFoundException: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /admin/policies/my-property/my-ns
		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:283)
		at org.apache.pulsar.client.admin.internal.BaseResource$4.failed(BaseResource.java:237)
		at org.glassfish.jersey.client.JerseyInvocation$1.failed(JerseyInvocation.java:882)
		at org.glassfish.jersey.client.JerseyInvocation$1.completed(JerseyInvocation.java:863)
		at org.glassfish.jersey.client.ClientRuntime.processResponse(ClientRuntime.java:229)
		at org.glassfish.jersey.client.ClientRuntime.access$200(ClientRuntime.java:62)
		at org.glassfish.jersey.client.ClientRuntime$2.lambda$response$0(ClientRuntime.java:173)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:248)
		at org.glassfish.jersey.internal.Errors$1.call(Errors.java:244)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:292)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:274)
		at org.glassfish.jersey.internal.Errors.process(Errors.java:244)
		at org.glassfish.jersey.process.internal.RequestScope.runInScope(RequestScope.java:288)
		at org.glassfish.jersey.client.ClientRuntime$2.response(ClientRuntime.java:173)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$apply$1(AsyncHttpConnector.java:251)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.apache.pulsar.client.admin.internal.http.AsyncHttpConnector.lambda$retryOperation$4(AsyncHttpConnector.java:293)
		at java.base/java.util.concurrent.CompletableFuture.uniWhenComplete(CompletableFuture.java:863)
		at java.base/java.util.concurrent.CompletableFuture$UniWhenComplete.tryFire(CompletableFuture.java:841)
		at java.base/java.util.concurrent.CompletableFuture.postComplete(CompletableFuture.java:510)
		at java.base/java.util.concurrent.CompletableFuture.complete(CompletableFuture.java:2147)
		at org.asynchttpclient.netty.NettyResponseFuture.loadContent(NettyResponseFuture.java:222)
		at org.asynchttpclient.netty.NettyResponseFuture.done(NettyResponseFuture.java:257)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.finishUpdate(AsyncHttpClientHandler.java:241)
		at org.asynchttpclient.netty.handler.HttpHandler.handleChunk(HttpHandler.java:114)
		at org.asynchttpclient.netty.handler.HttpHandler.handleRead(HttpHandler.java:143)
		at org.asynchttpclient.netty.handler.AsyncHttpClientHandler.channelRead(AsyncHttpClientHandler.java:78)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.handler.codec.MessageToMessageDecoder.channelRead(MessageToMessageDecoder.java:103)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:436)
		at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:327)
		at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:299)
		at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:251)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:357)
		at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1410)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:379)
		at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:365)
		at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:919)
		at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:166)
		at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:722)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:658)
		at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:584)
		at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:496)
		at io.netty.util.concurrent.SingleThreadEventExecutor$4.run(SingleThreadEventExecutor.java:995)
		at io.netty.util.internal.ThreadExecutorMap$2.run(ThreadExecutorMap.java:74)
		at io.netty.util.concurrent.FastThreadLocalRunnable.run(FastThreadLocalRunnable.java:30)
		at java.base/java.lang.Thread.run(Thread.java:833)
	Caused by: javax.ws.rs.NotFoundException: HTTP 404 org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /admin/policies/my-property/my-ns
		at org.glassfish.jersey.client.JerseyInvocation.convertToException(JerseyInvocation.java:948)
		at org.glassfish.jersey.client.JerseyInvocation.access$700(JerseyInvocation.java:82)
		... 54 more
Caused by: [CIRCULAR REFERENCE: javax.ws.rs.NotFoundException: HTTP 404 org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /admin/policies/my-property/my-ns]

</pre></code>
</details>

