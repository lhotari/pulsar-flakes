        
Flaky-test: org.apache.pulsar.client.api.KeySharedSubscriptionTest.testRemoveFirstConsumer
Number of failures: 19

org.apache.pulsar.client.api.KeySharedSubscriptionTest is flaky. The testRemoveFirstConsumer test method fails sporadically.

```
java.lang.AssertionError: expected [0] but found [10]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.client.api.KeySharedSubscriptionTest.testRemoveFirstConsumer(KeySharedSubscriptionTest.java:698)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-22T15:13:37.9054687Z](https://github.com/apache/pulsar/runs/4287950608?check_suite_focus=true?check_suite_focus=true#step:9:4610)
[example failure 2021-11-22T12:11:59.5131420Z](https://github.com/apache/pulsar/runs/4285766977?check_suite_focus=true?check_suite_focus=true#step:9:6226)
[example failure 2021-11-22T11:50:52.2479731Z](https://github.com/apache/pulsar/runs/4285766977?check_suite_focus=true?check_suite_focus=true#step:9:4589)
[example failure 2021-11-20T15:30:18.6477526Z](https://github.com/apache/pulsar/runs/4273842509?check_suite_focus=true?check_suite_focus=true#step:9:1358)
[example failure 2021-11-18T17:06:01.0539376Z](https://github.com/apache/pulsar/runs/4253966591?check_suite_focus=true?check_suite_focus=true#step:9:3170)
[example failure 2021-11-18T16:14:52.1580332Z](https://github.com/apache/pulsar/runs/4253422122?check_suite_focus=true?check_suite_focus=true#step:9:5404)
[example failure 2021-11-18T13:26:27.8798489Z](https://github.com/apache/pulsar/runs/4251567744?check_suite_focus=true?check_suite_focus=true#step:9:1522)
[example failure 2021-11-18T11:20:12.1915184Z](https://github.com/apache/pulsar/runs/4249768965?check_suite_focus=true?check_suite_focus=true#step:9:4624)
[example failure 2021-11-18T10:59:13.8068181Z](https://github.com/apache/pulsar/runs/4249768965?check_suite_focus=true?check_suite_focus=true#step:9:2989)
[example failure 2021-11-18T10:38:43.2134894Z](https://github.com/apache/pulsar/runs/4249768965?check_suite_focus=true?check_suite_focus=true#step:9:1354)
[example failure 2021-11-17T22:03:46.4308594Z](https://github.com/apache/pulsar/runs/4243960241?check_suite_focus=true?check_suite_focus=true#step:9:2773)
[example failure 2021-11-17T21:55:07.9426628Z](https://github.com/apache/pulsar/runs/4243960241?check_suite_focus=true?check_suite_focus=true#step:9:1948)
[example failure 2021-11-17T21:46:21.5677558Z](https://github.com/apache/pulsar/runs/4243960241?check_suite_focus=true?check_suite_focus=true#step:9:1123)
[example failure 2021-11-17T20:47:31.5541255Z](https://github.com/apache/pulsar/runs/4243174441?check_suite_focus=true?check_suite_focus=true#step:9:2680)
[example failure 2021-11-17T20:38:11.0054490Z](https://github.com/apache/pulsar/runs/4243174441?check_suite_focus=true?check_suite_focus=true#step:9:1855)
[example failure 2021-11-17T20:27:43.3532658Z](https://github.com/apache/pulsar/runs/4243174441?check_suite_focus=true?check_suite_focus=true#step:9:1030)
[example failure 2021-11-17T11:06:50.5170184Z](https://github.com/apache/pulsar/runs/4236580815?check_suite_focus=true?check_suite_focus=true#step:9:2676)
[example failure 2021-11-17T10:58:11.3309259Z](https://github.com/apache/pulsar/runs/4236580815?check_suite_focus=true?check_suite_focus=true#step:9:1851)
[example failure 2021-11-17T01:13:23.1869987Z](https://github.com/apache/pulsar/runs/4232476879?check_suite_focus=true?check_suite_focus=true#step:9:1103)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [0] but found [10]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:907)
	at org.testng.Assert.assertEquals(Assert.java:917)
	at org.apache.pulsar.client.api.KeySharedSubscriptionTest.testRemoveFirstConsumer(KeySharedSubscriptionTest.java:698)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>

