        
Flaky-test: org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumSourcesTest.testDebeziumMsSqlSource
Number of failures: 1

org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumSourcesTest is flaky. The testDebeziumMsSqlSource test method fails sporadically.

```
org.testcontainers.containers.ContainerLaunchException: Container startup failed for image mcr.microsoft.com/mssql/server:2019-CU12-ubuntu-20.04
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:349)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at org.apache.pulsar.tests.integration.topologies.PulsarCluster.startService(PulsarCluster.java:396)
	at org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumMsSqlSourceTester.setServiceContainer(DebeziumMsSqlSourceTester.java:73)
	at org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumSourcesTest.testDebeziumMsSqlConnect(PulsarDebeziumSourcesTest.java:236)
	at org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumSourcesTest.testDebeziumMsSqlSource(PulsarDebeziumSourcesTest.java:79)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-09-19T06:58:48.6705459Z](https://github.com/apache/pulsar/actions/runs/10935303245/job/30358059841#step:12:20520)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testcontainers.containers.ContainerLaunchException: Container startup failed for image mcr.microsoft.com/mssql/server:2019-CU12-ubuntu-20.04
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:349)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:322)
	at org.apache.pulsar.tests.integration.topologies.PulsarCluster.startService(PulsarCluster.java:396)
	at org.apache.pulsar.tests.integration.io.sources.debezium.DebeziumMsSqlSourceTester.setServiceContainer(DebeziumMsSqlSourceTester.java:73)
	at org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumSourcesTest.testDebeziumMsSqlConnect(PulsarDebeziumSourcesTest.java:236)
	at org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumSourcesTest.testDebeziumMsSqlSource(PulsarDebeziumSourcesTest.java:79)
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
Caused by: org.rnorth.ducttape.RetryCountExceededException: Retry limit hit with exception
	at org.rnorth.ducttape.unreliables.Unreliables.retryUntilSuccess(Unreliables.java:88)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:334)
	... 15 more
Caused by: org.testcontainers.containers.ContainerLaunchException: Could not create/start container
	at org.testcontainers.containers.GenericContainer.tryStart(GenericContainer.java:553)
	at org.testcontainers.containers.GenericContainer.lambda$doStart$0(GenericContainer.java:344)
	at org.rnorth.ducttape.unreliables.Unreliables.retryUntilSuccess(Unreliables.java:81)
	... 16 more
Caused by: java.lang.IllegalStateException: Wait strategy failed. Container exited with code 1
	at org.testcontainers.containers.GenericContainer.tryStart(GenericContainer.java:523)
	... 18 more
Caused by: org.testcontainers.containers.ContainerLaunchException: Timed out waiting for log output matching '.*The tempdb database has .*'
	at org.testcontainers.containers.wait.strategy.LogMessageWaitStrategy.waitUntilReady(LogMessageWaitStrategy.java:47)
	at org.testcontainers.containers.wait.strategy.AbstractWaitStrategy.waitUntilReady(AbstractWaitStrategy.java:52)
	at org.testcontainers.containers.GenericContainer.waitUntilContainerStarted(GenericContainer.java:964)
	at org.testcontainers.containers.GenericContainer.tryStart(GenericContainer.java:490)
	... 18 more

</pre></code>
</details>

