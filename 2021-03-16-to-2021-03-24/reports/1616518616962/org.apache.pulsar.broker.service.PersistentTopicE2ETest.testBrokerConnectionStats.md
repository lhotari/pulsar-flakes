        
Flaky-test: org.apache.pulsar.broker.service.PersistentTopicE2ETest.testBrokerConnectionStats
Number of failures: 8

org.apache.pulsar.broker.service.PersistentTopicE2ETest is flaky. The testBrokerConnectionStats test method fails sporadically.

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
[example failure 2021-03-22T04:36:36.6854673Z](https://github.com/apache/pulsar/runs/2162901943?check_suite_focus=true#step:8:519)
[example failure 2021-03-21T18:38:25.2698052Z](https://github.com/apache/pulsar/runs/2160576546?check_suite_focus=true#step:9:1271)
[example failure 2021-03-21T17:23:28.4481028Z](https://github.com/apache/pulsar/runs/2160502264?check_suite_focus=true#step:9:535)
[example failure 2021-03-21T07:09:00.1359889Z](https://github.com/apache/pulsar/runs/2158568327?check_suite_focus=true#step:9:537)
[example failure 2021-03-20T14:22:59.4176170Z](https://github.com/apache/pulsar/runs/2155375988?check_suite_focus=true#step:9:1264)
[example failure 2021-03-20T11:07:26.2631030Z](https://github.com/apache/pulsar/runs/2154797882?check_suite_focus=true#step:9:1369)
[example failure 2021-03-19T18:09:08.8802146Z](https://github.com/apache/pulsar/runs/2150399099?check_suite_focus=true#step:9:497)
[example failure 2021-03-16T19:09:19.0141573Z](https://github.com/apache/pulsar/runs/2122020916?check_suite_focus=true#step:9:1019)


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

