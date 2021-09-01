        
Flaky-test: org.apache.pulsar.compaction.CompactionTest.testEmptyCompactionLedger
Number of failures: 9

org.apache.pulsar.compaction.CompactionTest is flaky. The testEmptyCompactionLedger test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:40.6859848Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3117)
[example failure 2021-08-28T02:15:19.4923214Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2114)
[example failure 2021-08-27T08:10:54.4647352Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2181)
[example failure 2021-08-27T08:04:13.4906464Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2106)
[example failure 2021-08-27T06:45:32.2676017Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2107)
[example failure 2021-08-26T08:59:46.7145000Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2816)
[example failure 2021-08-26T07:10:21.9966296Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2168)
[example failure 2021-08-25T09:11:46.5105510Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2096)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@21a5b154]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.compaction.CompactionTest.testEmptyCompactionLedger(CompactionTest.java:1323)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-28T00:15:27.1503597Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:1466)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@21a5b154]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.compaction.CompactionTest.testEmptyCompactionLedger(CompactionTest.java:1323)
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

