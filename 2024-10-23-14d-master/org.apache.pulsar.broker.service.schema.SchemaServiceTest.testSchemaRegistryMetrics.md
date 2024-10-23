        
Flaky-test: org.apache.pulsar.broker.service.schema.SchemaServiceTest.testSchemaRegistryMetrics
Number of failures: 3

org.apache.pulsar.broker.service.schema.SchemaServiceTest is flaky. The testSchemaRegistryMetrics test method fails sporadically.

```
java.lang.AssertionError: expected [tenant/ns] but found [public/ns_73b1a31afce34671a5ddc48fe5ad7fc8]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:655)
	at org.testng.Assert.assertEquals(Assert.java:665)
	at org.apache.pulsar.broker.service.schema.SchemaServiceTest.testSchemaRegistryMetrics(SchemaServiceTest.java:184)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-10-17T12:41:27.1270104Z](https://github.com/apache/pulsar/actions/runs/11384644960/job/31673286731#step:11:1344)  
[example failure 2024-10-16T12:42:20.5090345Z](https://github.com/apache/pulsar/actions/runs/11365343825/job/31613848731#step:11:1405)  
[example failure 2024-10-15T13:51:18.3124157Z](https://github.com/apache/pulsar/actions/runs/11346710588/job/31557662313#step:11:1348)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [tenant/ns] but found [public/ns_73b1a31afce34671a5ddc48fe5ad7fc8]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:655)
	at org.testng.Assert.assertEquals(Assert.java:665)
	at org.apache.pulsar.broker.service.schema.SchemaServiceTest.testSchemaRegistryMetrics(SchemaServiceTest.java:184)
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

