        
Flaky-test: org.apache.pulsar.bookie.rackawareness.IsolatedBookieEnsemblePlacementPolicyTest.testSecondaryIsolationGroupsBookies
Number of failures: 1

org.apache.pulsar.bookie.rackawareness.IsolatedBookieEnsemblePlacementPolicyTest is flaky. The testSecondaryIsolationGroupsBookies test method fails sporadically.

```
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertTrue(Assert.java:56)
	at org.testng.Assert.assertTrue(Assert.java:66)
	at org.apache.pulsar.bookie.rackawareness.IsolatedBookieEnsemblePlacementPolicyTest.testSecondaryIsolationGroupsBookies(IsolatedBookieEnsemblePlacementPolicyTest.java:558)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-19T02:01:56.4469623Z](https://github.com/apache/pulsar/actions/runs/23275934973/job/67679482459#step:11:2057)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.bookie.rackawareness.IsolatedBookieEnsemblePlacementPolicyTest.testSecondaryIsolationGroupsBookies -- Time elapsed: 0.016 s <<< FAILURE!
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertTrue(Assert.java:56)
	at org.testng.Assert.assertTrue(Assert.java:66)
	at org.apache.pulsar.bookie.rackawareness.IsolatedBookieEnsemblePlacementPolicyTest.testSecondaryIsolationGroupsBookies(IsolatedBookieEnsemblePlacementPolicyTest.java:558)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

[WARNING] Tests run: 6, Failures: 0, Errors: 0, Skipped: 6, Time elapsed: 1.155 s -- in org.apache.pulsar.broker.BitRateUnitTest
</pre></code>
</details>

