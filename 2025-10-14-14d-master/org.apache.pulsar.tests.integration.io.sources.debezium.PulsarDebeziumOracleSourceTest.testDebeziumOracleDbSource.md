        
Flaky-test: org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource
Number of failures: 3

org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest is flaky. The testDebeziumOracleDbSource test method fails sporadically.

```
java.lang.IllegalStateException: Oracle did not initialize properly
	at org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumOracleDbSourceTester.waitForOracleStatus(DebeziumOracleDbSourceTester.java:188)
	at org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumOracleDbSourceTester.prepareSource(DebeziumOracleDbSourceTester.java:157)
	at org.apache.pulsar.tests.integration.io.sources.PulsarIOSourceRunner.prepareSource(PulsarIOSourceRunner.java:113)
	at org.apache.pulsar.tests.integration.io.sources.debezium.PulsarIODebeziumSourceRunner.internalTestSource(PulsarIODebeziumSourceRunner.java:75)
	at org.apache.pulsar.tests.integration.io.sources.debezium.PulsarIODebeziumSourceRunner.testSource(PulsarIODebeziumSourceRunner.java:66)
	at org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbConnect(PulsarDebeziumOracleSourceTest.java:86)
	at org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource(PulsarDebeziumOracleSourceTest.java:47)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-11T13:18:31.7335973Z](https://github.com/apache/pulsar/actions/runs/18429196827/job/52515137975#step:12:5490)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.IllegalStateException: Oracle did not initialize properly
	at org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumOracleDbSourceTester.waitForOracleStatus(DebeziumOracleDbSourceTester.java:188)
	at org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumOracleDbSourceTester.prepareSource(DebeziumOracleDbSourceTester.java:157)
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

[example failure 2025-10-08T07:30:35.5681892Z](https://github.com/apache/pulsar/actions/runs/18335314137/job/52221466827#step:12:5471)  
[example failure 2025-10-06T07:23:18.4506908Z](https://github.com/apache/pulsar/actions/runs/18271517544/job/52017367107#step:12:5475)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.IllegalStateException: Oracle did not initialize properly
	at org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumOracleDbSourceTester.waitForOracleStatus(DebeziumOracleDbSourceTester.java:188)
	at org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumOracleDbSourceTester.prepareSource(DebeziumOracleDbSourceTester.java:157)
	at org.apache.pulsar.tests.integration.io.sources.PulsarIOSourceRunner.prepareSource(PulsarIOSourceRunner.java:113)
	at org.apache.pulsar.tests.integration.io.sources.debezium.PulsarIODebeziumSourceRunner.internalTestSource(PulsarIODebeziumSourceRunner.java:75)
	at org.apache.pulsar.tests.integration.io.sources.debezium.PulsarIODebeziumSourceRunner.testSource(PulsarIODebeziumSourceRunner.java:66)
	at org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbConnect(PulsarDebeziumOracleSourceTest.java:86)
	at org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource(PulsarDebeziumOracleSourceTest.java:47)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:569)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:840)

</pre></code>
</details>

