        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherE2ETest.testBrokerConnectionStats
Number of failures: 11

org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherE2ETest is flaky. The testBrokerConnectionStats test method fails sporadically.

```
java.lang.AssertionError: expected [0] but found [1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.broker.service.PersistentTopicE2ETest.testBrokerConnectionStats(PersistentTopicE2ETest.java:1506)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-23T00:32:13.2150940Z](https://github.com/apache/pulsar/runs/2170893771?check_suite_focus=true#step:8:527)
[example failure 2021-03-22T16:50:36.5597034Z](https://github.com/apache/pulsar/runs/2167097018?check_suite_focus=true#step:8:527)
[example failure 2021-03-22T05:27:56.1333823Z](https://github.com/apache/pulsar/runs/2162901943?check_suite_focus=true#step:8:1300)
[example failure 2021-03-21T14:33:55.7093488Z](https://github.com/apache/pulsar/runs/2159917385?check_suite_focus=true#step:8:505)
[example failure 2021-03-20T19:56:28.2142173Z](https://github.com/apache/pulsar/runs/2156478842?check_suite_focus=true#step:9:1304)
[example failure 2021-03-20T19:08:12.4772921Z](https://github.com/apache/pulsar/runs/2156478842?check_suite_focus=true#step:9:547)
[example failure 2021-03-20T10:42:27.6293312Z](https://github.com/apache/pulsar/runs/2154861769?check_suite_focus=true#step:9:525)
[example failure 2021-03-20T10:21:27.4090782Z](https://github.com/apache/pulsar/runs/2154797882?check_suite_focus=true#step:9:576)
[example failure 2021-03-19T11:24:38.2528949Z](https://github.com/apache/pulsar/runs/2146721748?check_suite_focus=true#step:9:1279)
[example failure 2021-03-18T22:24:39.3715798Z](https://github.com/apache/pulsar/runs/2142615003?check_suite_focus=true#step:9:525)
[example failure 2021-03-16T18:54:46.6538050Z](https://github.com/apache/pulsar/runs/2122020916?check_suite_focus=true#step:9:663)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [0] but found [1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.broker.service.PersistentTopicE2ETest.testBrokerConnectionStats(PersistentTopicE2ETest.java:1506)
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

