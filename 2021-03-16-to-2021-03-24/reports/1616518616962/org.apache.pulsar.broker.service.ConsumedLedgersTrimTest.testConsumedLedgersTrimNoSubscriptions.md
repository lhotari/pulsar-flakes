        
Flaky-test: org.apache.pulsar.broker.service.ConsumedLedgersTrimTest.testConsumedLedgersTrimNoSubscriptions
Number of failures: 3

org.apache.pulsar.broker.service.ConsumedLedgersTrimTest is flaky. The testConsumedLedgersTrimNoSubscriptions test method fails sporadically.

```
java.lang.AssertionError: expected [3:6:-1:0] but found [-1:-1:-1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.broker.service.ConsumedLedgersTrimTest.testConsumedLedgersTrimNoSubscriptions(ConsumedLedgersTrimTest.java:153)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-19T17:38:59.6901891Z](https://github.com/apache/pulsar/runs/2150398705?check_suite_focus=true#step:9:532)
[example failure 2021-03-19T15:42:28.4563268Z](https://github.com/apache/pulsar/runs/2148867428?check_suite_focus=true#step:8:532)
[example failure 2021-03-19T11:38:23.5859212Z](https://github.com/apache/pulsar/runs/2146893803?check_suite_focus=true#step:8:532)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [3:6:-1:0] but found [-1:-1:-1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.broker.service.ConsumedLedgersTrimTest.testConsumedLedgersTrimNoSubscriptions(ConsumedLedgersTrimTest.java:153)
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

