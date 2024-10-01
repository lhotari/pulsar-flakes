        
Flaky-test: org.apache.pulsar.broker.service.ClusterMigrationTest.testClusterMigrationWithReplicationBacklog
Number of failures: 1

org.apache.pulsar.broker.service.ClusterMigrationTest is flaky. The testClusterMigrationWithReplicationBacklog test method fails sporadically.

```
java.lang.AssertionError: expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertFalse(Assert.java:78)
	at org.testng.Assert.assertFalse(Assert.java:88)
	at org.apache.pulsar.broker.service.ClusterMigrationTest.testClusterMigrationWithReplicationBacklog(ClusterMigrationTest.java:522)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-09-24T06:28:34.5911792Z](https://github.com/apache/pulsar/actions/runs/11007913223/job/30565001678#step:11:1673)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertFalse(Assert.java:78)
	at org.testng.Assert.assertFalse(Assert.java:88)
	at org.apache.pulsar.broker.service.ClusterMigrationTest.testClusterMigrationWithReplicationBacklog(ClusterMigrationTest.java:522)
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

