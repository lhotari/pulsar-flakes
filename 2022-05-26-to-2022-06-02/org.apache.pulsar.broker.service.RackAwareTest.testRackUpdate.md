        
Flaky-test: org.apache.pulsar.broker.service.RackAwareTest.testRackUpdate
Number of failures: 6

org.apache.pulsar.broker.service.RackAwareTest is flaky. The testRackUpdate test method fails sporadically.

```
org.apache.bookkeeper.client.BKException$BKNotEnoughBookiesException: Not enough non-faulty bookies available
	at org.apache.bookkeeper.client.SyncCallbackUtils.finish(SyncCallbackUtils.java:83)
	at org.apache.bookkeeper.client.SyncCallbackUtils$SyncCreateCallback.createComplete(SyncCallbackUtils.java:106)
	at org.apache.bookkeeper.client.LedgerCreateOp.createComplete(LedgerCreateOp.java:275)
	at org.apache.bookkeeper.client.LedgerCreateOp.initiate(LedgerCreateOp.java:168)
	at org.apache.bookkeeper.client.BookKeeper.asyncCreateLedger(BookKeeper.java:879)
	at org.apache.bookkeeper.client.BookKeeper.createLedger(BookKeeper.java:963)
	at org.apache.bookkeeper.client.BookKeeper.createLedger(BookKeeper.java:918)
	at org.apache.pulsar.broker.service.RackAwareTest.testRackUpdate(RackAwareTest.java:282)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-05-31T23:07:39.3281362Z](https://github.com/apache/pulsar/runs/6679957868?check_suite_focus=true#step:9:815)  
[example failure 2022-05-31T19:39:37.9073737Z](https://github.com/apache/pulsar/runs/6677421706?check_suite_focus=true#step:10:801)  
[example failure 2022-05-31T15:33:11.8958611Z](https://github.com/apache/pulsar/runs/6673760480?check_suite_focus=true#step:10:801)  
[example failure 2022-05-27T14:35:50.7384867Z](https://github.com/apache/pulsar/runs/6627110093?check_suite_focus=true#step:9:811)  
[example failure 2022-05-27T11:13:02.3203332Z](https://github.com/apache/pulsar/runs/6623892998?check_suite_focus=true#step:10:790)  
[example failure 2022-05-27T10:20:41.5351960Z](https://github.com/apache/pulsar/runs/6623845665?check_suite_focus=true#step:10:800)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.bookkeeper.client.BKException$BKNotEnoughBookiesException: Not enough non-faulty bookies available
	at org.apache.bookkeeper.client.SyncCallbackUtils.finish(SyncCallbackUtils.java:83)
	at org.apache.bookkeeper.client.SyncCallbackUtils$SyncCreateCallback.createComplete(SyncCallbackUtils.java:106)
	at org.apache.bookkeeper.client.LedgerCreateOp.createComplete(LedgerCreateOp.java:275)
	at org.apache.bookkeeper.client.LedgerCreateOp.initiate(LedgerCreateOp.java:168)
	at org.apache.bookkeeper.client.BookKeeper.asyncCreateLedger(BookKeeper.java:879)
	at org.apache.bookkeeper.client.BookKeeper.createLedger(BookKeeper.java:963)
	at org.apache.bookkeeper.client.BookKeeper.createLedger(BookKeeper.java:918)
	at org.apache.pulsar.broker.service.RackAwareTest.testRackUpdate(RackAwareTest.java:282)
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

