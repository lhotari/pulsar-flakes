        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.testActiveAndInActiveConsumerEntryCacheBehavior
Number of failures: 2

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The testActiveAndInActiveConsumerEntryCacheBehavior test method fails sporadically.

```
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testActiveAndInActiveConsumerEntryCacheBehavior(SimpleProducerConsumerTest.java:1038)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-23T02:02:06.5300488Z](https://github.com/apache/pulsar/runs/2171516877?check_suite_focus=true#step:8:125)
[example failure 2021-03-21T06:39:52.5087778Z](https://github.com/apache/pulsar/runs/2158568327?check_suite_focus=true#step:9:125)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.api.SimpleProducerConsumerTest.testActiveAndInActiveConsumerEntryCacheBehavior(SimpleProducerConsumerTest.java:1038)
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

