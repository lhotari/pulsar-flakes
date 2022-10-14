        
Flaky-test: org.apache.pulsar.broker.service.ServerCnxTest.testHandleAuthResponseWithoutClientVersion
Number of failures: 2

org.apache.pulsar.broker.service.ServerCnxTest is flaky. The testHandleAuthResponseWithoutClientVersion test method fails sporadically.

```
org.mockito.exceptions.base.MockitoException:

Cannot mock/spy class org.apache.pulsar.common.api.proto.CommandAuthResponse
Mockito cannot mock/spy because :
 - final class
	at org.apache.pulsar.broker.service.ServerCnxTest.testHandleAuthResponseWithoutClientVersion(ServerCnxTest.java:1968)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-08-25T22:46:03.3679777Z](https://github.com/apache/pulsar/runs/8023652494?check_suite_focus=true#step:1:4157)  
[example failure 2022-08-25T22:28:58.2310456Z](https://github.com/apache/pulsar/runs/8023652494?check_suite_focus=true#step:1:1008)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.base.MockitoException:

Cannot mock/spy class org.apache.pulsar.common.api.proto.CommandAuthResponse
Mockito cannot mock/spy because :
 - final class
	at org.apache.pulsar.broker.service.ServerCnxTest.testHandleAuthResponseWithoutClientVersion(ServerCnxTest.java:1968)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>

