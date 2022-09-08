        
Flaky-test: org.apache.pulsar.client.impl.schema.PrimitiveSchemaTest.allSchemasShouldRoundtripInput
Number of failures: 1

org.apache.pulsar.client.impl.schema.PrimitiveSchemaTest is flaky. The allSchemasShouldRoundtripInput test method fails sporadically.

```
java.lang.IllegalArgumentException: NPE when using schema org.apache.pulsar.client.impl.schema.StringSchema@5fc930f0 : null
	at org.apache.pulsar.client.impl.schema.PrimitiveSchemaTest.allSchemasShouldRoundtripInput(PrimitiveSchemaTest.java:145)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-07T10:17:05.2036213Z](https://github.com/apache/pulsar/runs/7231042288?check_suite_focus=true#step:10:11233)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.IllegalArgumentException: NPE when using schema org.apache.pulsar.client.impl.schema.StringSchema@5fc930f0 : null
	at org.apache.pulsar.client.impl.schema.PrimitiveSchemaTest.allSchemasShouldRoundtripInput(PrimitiveSchemaTest.java:145)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)
Caused by: java.lang.NullPointerException
	at java.base/java.lang.String.getBytes(String.java:1785)
	at org.apache.pulsar.client.impl.schema.StringSchema.encode(StringSchema.java:98)
	at org.apache.pulsar.client.impl.schema.StringSchema.encode(StringSchema.java:34)
	at org.apache.pulsar.client.impl.schema.PrimitiveSchemaTest.allSchemasShouldRoundtripInput(PrimitiveSchemaTest.java:140)
	... 12 more

</pre></code>
</details>

