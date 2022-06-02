        
Flaky-test: org.apache.pulsar.client.impl.ClientCnxTest.testClientCnxTimeout
Number of failures: 5

org.apache.pulsar.client.impl.ClientCnxTest is flaky. The testClientCnxTimeout test method fails sporadically.

```
java.lang.NoClassDefFoundError: Could not initialize class org.apache.pulsar.common.protocol.Commands
	at org.apache.pulsar.client.impl.ClientCnx.<init>(ClientCnx.java:209)
	at org.apache.pulsar.client.impl.ClientCnxTest.testClientCnxTimeout(ClientCnxTest.java:55)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-01T04:00:12.5747954Z](https://github.com/apache/pulsar/runs/6682553637?check_suite_focus=true#step:9:3387)  
[example failure 2022-06-01T02:53:51.1189734Z](https://github.com/apache/pulsar/runs/6682028994?check_suite_focus=true#step:9:4865)  
[example failure 2022-05-31T17:04:57.7207995Z](https://github.com/apache/pulsar/runs/6674573055?check_suite_focus=true#step:9:6479)  
[example failure 2022-05-31T15:45:19.6406105Z](https://github.com/apache/pulsar/runs/6673827333?check_suite_focus=true#step:9:3407)  
[example failure 2022-05-31T14:26:54.6265079Z](https://github.com/apache/pulsar/runs/6672385265?check_suite_focus=true#step:10:4939)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NoClassDefFoundError: Could not initialize class org.apache.pulsar.common.protocol.Commands
	at org.apache.pulsar.client.impl.ClientCnx.<init>(ClientCnx.java:209)
	at org.apache.pulsar.client.impl.ClientCnxTest.testClientCnxTimeout(ClientCnxTest.java:55)
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

