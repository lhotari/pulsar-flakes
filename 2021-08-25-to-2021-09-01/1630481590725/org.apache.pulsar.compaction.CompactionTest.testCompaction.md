        
Flaky-test: org.apache.pulsar.compaction.CompactionTest.testCompaction
Number of failures: 9

org.apache.pulsar.compaction.CompactionTest is flaky. The testCompaction test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:40.6812984Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3101)
[example failure 2021-08-28T02:15:19.4790937Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2098)
[example failure 2021-08-27T08:10:54.4596388Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2165)
[example failure 2021-08-27T08:04:13.4777366Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2090)
[example failure 2021-08-27T06:45:32.2373945Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2091)
[example failure 2021-08-26T08:59:46.7012295Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2800)
[example failure 2021-08-26T07:10:21.9881372Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2152)
[example failure 2021-08-25T09:11:46.4984283Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2080)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

```
java.lang.AssertionError: expected [-1] but found [9]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.compaction.CompactionTest.testCompaction(CompactionTest.java:139)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T05:37:33.4967096Z](https://github.com/apache/pulsar/runs/3440010388?check_suite_focus=true#step:9:1507)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [-1] but found [9]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.compaction.CompactionTest.testCompaction(CompactionTest.java:139)
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

