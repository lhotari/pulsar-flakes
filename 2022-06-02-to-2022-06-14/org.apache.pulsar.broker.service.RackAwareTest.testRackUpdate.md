        
Flaky-test: org.apache.pulsar.broker.service.RackAwareTest.testRackUpdate
Number of failures: 8

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
[example failure 2022-06-10T05:19:22.7905794Z](https://github.com/apache/pulsar/runs/6825361690?check_suite_focus=true#step:9:773)  
[example failure 2022-06-08T23:45:19.0869112Z](https://github.com/apache/pulsar/runs/6803688910?check_suite_focus=true#step:10:757)  
[example failure 2022-06-08T14:56:12.2407047Z](https://github.com/apache/pulsar/runs/6796048099?check_suite_focus=true#step:10:756)  
[example failure 2022-06-08T07:56:24.8828570Z](https://github.com/apache/pulsar/runs/6789071152?check_suite_focus=true#step:10:756)  
[example failure 2022-06-07T13:40:49.7529429Z](https://github.com/apache/pulsar/runs/6775045602?check_suite_focus=true#step:9:769)  
[example failure 2022-06-07T06:43:58.4209042Z](https://github.com/apache/pulsar/runs/6768767726?check_suite_focus=true#step:10:756)  
[example failure 2022-06-06T12:07:50.3432293Z](https://github.com/apache/pulsar/runs/6755044805?check_suite_focus=true#step:10:756)  
[example failure 2022-06-06T05:12:13.1184268Z](https://github.com/apache/pulsar/runs/6750401483?check_suite_focus=true#step:10:658)  


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

