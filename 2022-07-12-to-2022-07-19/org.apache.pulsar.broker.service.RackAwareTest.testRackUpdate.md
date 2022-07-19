        
Flaky-test: org.apache.pulsar.broker.service.RackAwareTest.testRackUpdate
Number of failures: 16

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

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a org.apache.pulsar.broker.service.RackAwareTest expected [2] but found [1] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.service.RackAwareTest.testRackUpdate(RackAwareTest.java:290)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-19T01:47:21.5797546Z](https://github.com/apache/pulsar/runs/7401074788?check_suite_focus=true#step:10:1269)  
[example failure 2022-07-18T05:34:03.0446491Z](https://github.com/apache/pulsar/runs/7383529318?check_suite_focus=true#step:10:1323)  
[example failure 2022-07-15T07:43:22.7169446Z](https://github.com/apache/pulsar/runs/7353790394?check_suite_focus=true#step:10:1300)  
[example failure 2022-07-15T06:35:35.7381243Z](https://github.com/apache/pulsar/runs/7353014476?check_suite_focus=true#step:10:1373)  
[example failure 2022-07-12T18:49:16.1891716Z](https://github.com/apache/pulsar/runs/7305440075?check_suite_focus=true#step:9:896)  
[example failure 2022-07-07T09:13:09.0235169Z](https://github.com/apache/pulsar/runs/7230287478?check_suite_focus=true#step:10:637)  
[example failure 2022-07-05T04:26:49.8961342Z](https://github.com/apache/pulsar/runs/7189889422?check_suite_focus=true#step:10:635)  
[example failure 2022-07-04T14:41:08.7998055Z](https://github.com/apache/pulsar/runs/7182607492?check_suite_focus=true#step:9:647)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a org.apache.pulsar.broker.service.RackAwareTest expected [2] but found [1] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:167)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.broker.service.RackAwareTest.testRackUpdate(RackAwareTest.java:290)
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
Caused by: java.lang.AssertionError: expected [2] but found [1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.broker.service.RackAwareTest.lambda$testRackUpdate$12(RackAwareTest.java:291)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:248)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:235)
	... 4 more

</pre></code>
</details>

