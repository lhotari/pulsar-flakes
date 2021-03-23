        
Flaky-test: org.apache.pulsar.broker.service.persistent.SimpleProducerConsumerTestStreamingDispatcherTest.testRedeliveryFailOverConsumer
Number of failures: 17

org.apache.pulsar.broker.service.persistent.SimpleProducerConsumerTestStreamingDispatcherTest is flaky. The testRedeliveryFailOverConsumer test method fails sporadically.

```
java.lang.AssertionError: expected [12] but found [11]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testRedeliveryFailOverConsumer(SimpleProducerConsumerTest.java:2411)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-23T01:37:28.5276488Z](https://github.com/apache/pulsar/runs/2170893771?check_suite_focus=true#step:8:1356)
[example failure 2021-03-21T18:47:02.3731151Z](https://github.com/apache/pulsar/runs/2160576546?check_suite_focus=true#step:9:1329)
[example failure 2021-03-21T18:23:34.3613912Z](https://github.com/apache/pulsar/runs/2160502264?check_suite_focus=true#step:9:1369)
[example failure 2021-03-21T17:57:48.0986955Z](https://github.com/apache/pulsar/runs/2160576546?check_suite_focus=true#step:9:553)
[example failure 2021-03-21T14:40:22.9328191Z](https://github.com/apache/pulsar/runs/2159917385?check_suite_focus=true#step:8:555)
[example failure 2021-03-20T21:33:19.4269496Z](https://github.com/apache/pulsar/runs/2156885416?check_suite_focus=true#step:9:553)
[example failure 2021-03-20T17:38:01.2364614Z](https://github.com/apache/pulsar/runs/2155937742?check_suite_focus=true#step:9:1379)
[example failure 2021-03-20T11:47:05.3098037Z](https://github.com/apache/pulsar/runs/2154861769?check_suite_focus=true#step:9:1328)
[example failure 2021-03-20T11:47:05.2958408Z](https://github.com/apache/pulsar/runs/2154861769?check_suite_focus=true#step:9:1306)
[example failure 2021-03-20T09:08:09.4821079Z](https://github.com/apache/pulsar/runs/2154437815?check_suite_focus=true#step:9:1302)
[example failure 2021-03-20T09:08:09.4714335Z](https://github.com/apache/pulsar/runs/2154437815?check_suite_focus=true#step:9:1280)
[example failure 2021-03-20T02:14:14.0943171Z](https://github.com/apache/pulsar/runs/2153280068?check_suite_focus=true#step:9:555)
[example failure 2021-03-20T02:14:14.0850136Z](https://github.com/apache/pulsar/runs/2153280068?check_suite_focus=true#step:9:533)
[example failure 2021-03-20T01:29:19.2035213Z](https://github.com/apache/pulsar/runs/2152924540?check_suite_focus=true#step:9:1309)
[example failure 2021-03-20T00:38:28.2121791Z](https://github.com/apache/pulsar/runs/2152924540?check_suite_focus=true#step:9:533)
[example failure 2021-03-19T10:40:18.4318978Z](https://github.com/apache/pulsar/runs/2146721748?check_suite_focus=true#step:9:553)
[example failure 2021-03-18T23:21:28.6988319Z](https://github.com/apache/pulsar/runs/2142615003?check_suite_focus=true#step:9:1306)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [12] but found [11]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testRedeliveryFailOverConsumer(SimpleProducerConsumerTest.java:2411)
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

