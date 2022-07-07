        
Flaky-test: org.apache.pulsar.client.impl.schema.SchemaInfoTest.testSchemaInfoToString
Number of failures: 2

org.apache.pulsar.client.impl.schema.SchemaInfoTest is flaky. The testSchemaInfoToString test method fails sporadically.

```
java.lang.NullPointerException: Cannot invoke "Object.toString()" because "si" is null
	at org.apache.pulsar.client.impl.schema.SchemaInfoTest.testSchemaInfoToString(SchemaInfoTest.java:284)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-05T04:30:24.7252874Z](https://github.com/apache/pulsar/runs/7189889044?check_suite_focus=true#step:9:3336)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "Object.toString()" because "si" is null
	at org.apache.pulsar.client.impl.schema.SchemaInfoTest.testSchemaInfoToString(SchemaInfoTest.java:284)
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

</pre></code>
</details>

```
java.lang.NullPointerException
	at org.apache.pulsar.client.impl.schema.SchemaInfoTest.testSchemaInfoToString(SchemaInfoTest.java:284)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-05T07:44:16.7687076Z](https://github.com/apache/pulsar/runs/7191875007?check_suite_focus=true#step:6:1795)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException
	at org.apache.pulsar.client.impl.schema.SchemaInfoTest.testSchemaInfoToString(SchemaInfoTest.java:284)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

