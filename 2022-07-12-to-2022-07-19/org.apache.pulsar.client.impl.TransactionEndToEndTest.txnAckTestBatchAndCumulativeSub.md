        
Flaky-test: org.apache.pulsar.client.impl.TransactionEndToEndTest.txnAckTestBatchAndCumulativeSub
Number of failures: 3

org.apache.pulsar.client.impl.TransactionEndToEndTest is flaky. The txnAckTestBatchAndCumulativeSub test method fails sporadically.

```
java.lang.AssertionError: expected object to not be null
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.assertNotNull(Assert.java:942)
	at org.testng.Assert.assertNotNull(Assert.java:926)
	at org.apache.pulsar.client.impl.TransactionEndToEndTest.txnCumulativeAckTest(TransactionEndToEndTest.java:612)
	at org.apache.pulsar.client.impl.TransactionEndToEndTest.txnAckTestBatchAndCumulativeSub(TransactionEndToEndTest.java:540)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-15T09:53:25.7872152Z](https://github.com/apache/pulsar/runs/7355242399?check_suite_focus=true#step:10:2281)  
[example failure 2022-07-14T09:47:35.9361534Z](https://github.com/apache/pulsar/runs/7336978540?check_suite_focus=true#step:10:2282)  
[example failure 2022-07-13T13:22:33.5176577Z](https://github.com/apache/pulsar/runs/7320944455?check_suite_focus=true#step:10:3392)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected object to not be null
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.assertNotNull(Assert.java:942)
	at org.testng.Assert.assertNotNull(Assert.java:926)
	at org.apache.pulsar.client.impl.TransactionEndToEndTest.txnCumulativeAckTest(TransactionEndToEndTest.java:612)
	at org.apache.pulsar.client.impl.TransactionEndToEndTest.txnAckTestBatchAndCumulativeSub(TransactionEndToEndTest.java:540)
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

