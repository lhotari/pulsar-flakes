        
Flaky-test: org.apache.pulsar.client.impl.ProducerCloseTest.brokerCloseTopicTest
Number of failures: 9

org.apache.pulsar.client.impl.ProducerCloseTest is flaky. The brokerCloseTopicTest test method fails sporadically.

```
java.lang.AssertionError: expected [Connecting] but found [Ready]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.client.impl.ProducerCloseTest.brokerCloseTopicTest(ProducerCloseTest.java:140)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-10T11:37:34.3886402Z](https://github.com/apache/pulsar/runs/6830068108?check_suite_focus=true#step:10:1050)  
[example failure 2022-06-10T02:26:44.6299964Z](https://github.com/apache/pulsar/runs/6823969879?check_suite_focus=true#step:9:1070)  
[example failure 2022-06-09T16:50:54.1875192Z](https://github.com/apache/pulsar/runs/6817106987?check_suite_focus=true#step:9:1068)  
[example failure 2022-06-08T04:14:37.2533790Z](https://github.com/apache/pulsar/runs/6786847461?check_suite_focus=true#step:9:1064)  
[example failure 2022-06-07T06:45:29.8985250Z](https://github.com/apache/pulsar/runs/6768767664?check_suite_focus=true#step:10:1045)  
[example failure 2022-06-06T12:10:18.3467222Z](https://github.com/apache/pulsar/runs/6755044727?check_suite_focus=true#step:9:1048)  
[example failure 2022-06-06T10:10:33.3922268Z](https://github.com/apache/pulsar/runs/6753586118?check_suite_focus=true#step:9:1066)  
[example failure 2022-06-02T12:52:11.1846577Z](https://github.com/apache/pulsar/runs/6708538529?check_suite_focus=true#step:10:1049)  
[example failure 2022-06-01T12:51:31.7650394Z](https://github.com/apache/pulsar/runs/6688903767?check_suite_focus=true#step:10:1144)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [Connecting] but found [Ready]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.client.impl.ProducerCloseTest.brokerCloseTopicTest(ProducerCloseTest.java:140)
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

