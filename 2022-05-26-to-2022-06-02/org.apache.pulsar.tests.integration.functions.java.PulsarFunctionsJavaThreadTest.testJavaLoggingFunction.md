        
Flaky-test: org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaThreadTest.testJavaLoggingFunction
Number of failures: 32

org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaThreadTest is flaky. The testJavaLoggingFunction test method fails sporadically.

```
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.api.Message.getValue()" because "msg" is null
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.publishAndConsumeMessages(PulsarFunctionsTest.java:1583)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testLoggingFunction(PulsarFunctionsTest.java:1506)
	at org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testJavaLoggingFunction(PulsarFunctionsJavaTest.java:111)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-01T12:26:04.6515521Z](https://github.com/apache/pulsar/runs/6688102709?check_suite_focus=true#step:11:15423)  
[example failure 2022-06-01T05:29:16.8114941Z](https://github.com/apache/pulsar/runs/6683214151?check_suite_focus=true#step:11:15292)  
[example failure 2022-06-01T02:51:10.7681244Z](https://github.com/apache/pulsar/runs/6681840338?check_suite_focus=true#step:11:25916)  
[example failure 2022-06-01T02:37:52.2161847Z](https://github.com/apache/pulsar/runs/6681840338?check_suite_focus=true#step:11:15334)  
[example failure 2022-06-01T02:35:09.4801250Z](https://github.com/apache/pulsar/runs/6681828478?check_suite_focus=true#step:11:15545)  
[example failure 2022-05-31T22:47:58.4320584Z](https://github.com/apache/pulsar/runs/6679626610?check_suite_focus=true#step:11:15431)  
[example failure 2022-05-31T19:24:54.2565689Z](https://github.com/apache/pulsar/runs/6676697297?check_suite_focus=true#step:11:36321)  
[example failure 2022-05-31T19:13:28.0216490Z](https://github.com/apache/pulsar/runs/6676697297?check_suite_focus=true#step:11:25828)  
[example failure 2022-05-31T19:01:46.6331539Z](https://github.com/apache/pulsar/runs/6676697297?check_suite_focus=true#step:11:15355)  
[example failure 2022-05-31T17:21:50.0023420Z](https://github.com/apache/pulsar/runs/6674462885?check_suite_focus=true#step:11:37763)  
[example failure 2022-05-31T17:20:37.7425022Z](https://github.com/apache/pulsar/runs/6674352687?check_suite_focus=true#step:11:36737)  
[example failure 2022-05-31T17:10:13.9859543Z](https://github.com/apache/pulsar/runs/6674462885?check_suite_focus=true#step:11:27590)  
[example failure 2022-05-31T17:07:19.5537746Z](https://github.com/apache/pulsar/runs/6674352687?check_suite_focus=true#step:11:26138)  
[example failure 2022-05-31T16:58:36.6313592Z](https://github.com/apache/pulsar/runs/6674462885?check_suite_focus=true#step:11:17117)  
[example failure 2022-05-31T16:54:09.0119548Z](https://github.com/apache/pulsar/runs/6674352687?check_suite_focus=true#step:11:15560)  
[example failure 2022-05-31T12:45:25.0049264Z](https://github.com/apache/pulsar/runs/6670351872?check_suite_focus=true#step:11:25905)  
[example failure 2022-05-31T12:33:39.6514427Z](https://github.com/apache/pulsar/runs/6670351872?check_suite_focus=true#step:11:15517)  
[example failure 2022-05-31T11:48:05.5830464Z](https://github.com/apache/pulsar/runs/6669100532?check_suite_focus=true#step:11:36570)  
[example failure 2022-05-31T11:40:39.3301937Z](https://github.com/apache/pulsar/runs/6669314168?check_suite_focus=true#step:11:27509)  
[example failure 2022-05-31T11:35:20.3370184Z](https://github.com/apache/pulsar/runs/6669100532?check_suite_focus=true#step:11:26018)  
[example failure 2022-05-31T11:28:10.1630493Z](https://github.com/apache/pulsar/runs/6669314168?check_suite_focus=true#step:11:15388)  
[example failure 2022-05-31T11:22:32.7034407Z](https://github.com/apache/pulsar/runs/6669100532?check_suite_focus=true#step:11:15621)  
[example failure 2022-05-31T10:37:48.0359148Z](https://github.com/apache/pulsar/runs/6668100152?check_suite_focus=true#step:11:36022)  
[example failure 2022-05-31T10:26:04.8059765Z](https://github.com/apache/pulsar/runs/6668100152?check_suite_focus=true#step:11:25708)  
[example failure 2022-05-31T10:14:21.9913626Z](https://github.com/apache/pulsar/runs/6668100152?check_suite_focus=true#step:11:15383)  
[example failure 2022-05-27T13:20:03.7345763Z](https://github.com/apache/pulsar/runs/6625554986?check_suite_focus=true#step:11:38162)  
[example failure 2022-05-27T13:08:54.9452117Z](https://github.com/apache/pulsar/runs/6625554986?check_suite_focus=true#step:11:27924)  
[example failure 2022-05-27T12:57:44.5671942Z](https://github.com/apache/pulsar/runs/6625554986?check_suite_focus=true#step:11:17264)  
[example failure 2022-05-27T12:14:40.8794157Z](https://github.com/apache/pulsar/runs/6624264244?check_suite_focus=true#step:11:36625)  
[example failure 2022-05-27T12:01:41.3172511Z](https://github.com/apache/pulsar/runs/6624264244?check_suite_focus=true#step:11:26091)  
[example failure 2022-05-27T11:48:42.7197151Z](https://github.com/apache/pulsar/runs/6624264244?check_suite_focus=true#step:11:15495)  
[example failure 2022-05-27T11:42:54.4674352Z](https://github.com/apache/pulsar/runs/6624176507?check_suite_focus=true#step:11:15201)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.api.Message.getValue()" because "msg" is null
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.publishAndConsumeMessages(PulsarFunctionsTest.java:1583)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testLoggingFunction(PulsarFunctionsTest.java:1506)
	at org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testJavaLoggingFunction(PulsarFunctionsJavaTest.java:111)
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

