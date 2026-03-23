        
Flaky-test: org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource
Number of failures: 2

org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest is flaky. The testDebeziumOracleDbSource test method fails sporadically.

```
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource() didn't finish within the time-out 1800000
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2026-03-18T00:56:09.2919087Z](https://github.com/apache/pulsar/actions/runs/23222262279/job/67498872431#step:12:5487)  
[example failure 2026-03-17T23:58:08.6868173Z](https://github.com/apache/pulsar/actions/runs/23220417973/job/67493623822#step:12:5487)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
[ERROR] org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource -- Time elapsed: 1800 s <<< FAILURE!
org.testng.internal.thread.ThreadTimeoutException: Method org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource() didn't finish within the time-out 1800000
	at java.base/java.lang.Thread.sleep0(Native Method)
	at java.base/java.lang.Thread.sleep(Thread.java:509)
	at org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumOracleDbSourceTester.waitForOracleStatus(DebeziumOracleDbSourceTester.java:196)
	at org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumOracleDbSourceTester.retryCommand(DebeziumOracleDbSourceTester.java:207)
	at org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumOracleDbSourceTester.prepareSource(DebeziumOracleDbSourceTester.java:153)
	at org.apache.pulsar.tests.integration.io.sources.PulsarIOSourceRunner.prepareSource(PulsarIOSourceRunner.java:113)
	at org.apache.pulsar.tests.integration.io.sources.debezium.PulsarIODebeziumSourceRunner.internalTestSource(PulsarIODebeziumSourceRunner.java:75)
	at org.apache.pulsar.tests.integration.io.sources.debezium.PulsarIODebeziumSourceRunner.testSource(PulsarIODebeziumSourceRunner.java:66)
	at org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbConnect(PulsarDebeziumOracleSourceTest.java:86)
	at org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource(PulsarDebeziumOracleSourceTest.java:47)
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

</pre></code>
</details>

