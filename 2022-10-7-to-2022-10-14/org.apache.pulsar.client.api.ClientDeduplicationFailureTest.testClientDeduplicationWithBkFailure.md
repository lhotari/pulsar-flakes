        
Flaky-test: org.apache.pulsar.client.api.ClientDeduplicationFailureTest.testClientDeduplicationWithBkFailure
Number of failures: 11

org.apache.pulsar.client.api.ClientDeduplicationFailureTest is flaky. The testClientDeduplicationWithBkFailure test method fails sporadically.

```
java.lang.ClassCastException: class org.apache.pulsar.client.impl.MessageIdImpl cannot be cast to class org.apache.pulsar.client.impl.BatchMessageIdImpl (org.apache.pulsar.client.impl.MessageIdImpl and org.apache.pulsar.client.impl.BatchMessageIdImpl are in unnamed module of loader 'app')
	at org.apache.pulsar.client.api.ClientDeduplicationFailureTest.testClientDeduplicationWithBkFailure(ClientDeduplicationFailureTest.java:418)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-08-31T22:10:56.4175064Z](https://github.com/apache/pulsar/runs/8123742327?check_suite_focus=true#step:10:1322)  
[example failure 2022-08-31T21:08:09.9677233Z](https://github.com/apache/pulsar/runs/8122844849?check_suite_focus=true#step:9:1337)  
[example failure 2022-08-31T10:57:59.3459374Z](https://github.com/apache/pulsar/runs/8111596966?check_suite_focus=true#step:9:1337)  
[example failure 2022-08-31T10:32:40.7203026Z](https://github.com/apache/pulsar/runs/8110828963?check_suite_focus=true#step:10:1321)  
[example failure 2022-08-31T08:08:24.1563982Z](https://github.com/apache/pulsar/runs/8108548686?check_suite_focus=true#step:9:1334)  
[example failure 2022-08-31T07:17:39.0577939Z](https://github.com/apache/pulsar/runs/8108061748?check_suite_focus=true#step:9:1337)  
[example failure 2022-08-31T07:17:03.4491155Z](https://github.com/apache/pulsar/runs/8108057154?check_suite_focus=true#step:10:1317)  
[example failure 2022-08-31T04:16:32.0981397Z](https://github.com/apache/pulsar/runs/8106045360?check_suite_focus=true#step:9:1314)  
[example failure 2022-08-30T20:10:03.0135374Z](https://github.com/apache/pulsar/runs/8100597555?check_suite_focus=true#step:9:1314)  
[example failure 2022-08-27T01:02:28.7229148Z](https://github.com/apache/pulsar/runs/8046740752?check_suite_focus=true#step:10:1303)  
[example failure 2022-08-25T20:25:11.1988795Z](https://github.com/apache/pulsar/runs/8016062867?check_suite_focus=true#step:10:1291)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.ClassCastException: class org.apache.pulsar.client.impl.MessageIdImpl cannot be cast to class org.apache.pulsar.client.impl.BatchMessageIdImpl (org.apache.pulsar.client.impl.MessageIdImpl and org.apache.pulsar.client.impl.BatchMessageIdImpl are in unnamed module of loader 'app')
	at org.apache.pulsar.client.api.ClientDeduplicationFailureTest.testClientDeduplicationWithBkFailure(ClientDeduplicationFailureTest.java:418)
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

