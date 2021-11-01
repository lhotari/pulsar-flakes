        
Flaky-test: org.apache.pulsar.metadata.LocalMemoryMetadataStoreTest.testSharedInstance
Number of failures: 16

org.apache.pulsar.metadata.LocalMemoryMetadataStoreTest is flaky. The testSharedInstance test method fails sporadically.

```
java.lang.AssertionError: expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertFalse(Assert.java:67)
	at org.testng.Assert.assertFalse(Assert.java:77)
	at org.apache.pulsar.metadata.LocalMemoryMetadataStoreTest.testSharedInstance(LocalMemoryMetadataStoreTest.java:87)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-30T13:18:03.6369020Z](https://github.com/apache/pulsar/runs/4055188833?check_suite_focus=true?check_suite_focus=true#step:8:3112)
[example failure 2021-10-30T13:15:13.6085975Z](https://github.com/apache/pulsar/runs/4055188833?check_suite_focus=true?check_suite_focus=true#step:8:1424)
[example failure 2021-10-30T12:23:33.1097731Z](https://github.com/apache/pulsar/runs/4054904980?check_suite_focus=true?check_suite_focus=true#step:8:8409)
[example failure 2021-10-30T12:02:05.7287201Z](https://github.com/apache/pulsar/runs/4054904980?check_suite_focus=true?check_suite_focus=true#step:8:1440)
[example failure 2021-10-29T23:46:02.1180572Z](https://github.com/apache/pulsar/runs/4052232475?check_suite_focus=true?check_suite_focus=true#step:8:4654)
[example failure 2021-10-29T23:43:08.9913004Z](https://github.com/apache/pulsar/runs/4052232475?check_suite_focus=true?check_suite_focus=true#step:8:3042)
[example failure 2021-10-29T23:40:06.2898169Z](https://github.com/apache/pulsar/runs/4052232475?check_suite_focus=true?check_suite_focus=true#step:8:1430)
[example failure 2021-10-29T15:36:07.9491350Z](https://github.com/apache/pulsar/runs/4048378966?check_suite_focus=true?check_suite_focus=true#step:8:3058)
[example failure 2021-10-29T15:32:40.7163581Z](https://github.com/apache/pulsar/runs/4048378966?check_suite_focus=true?check_suite_focus=true#step:8:1446)
[example failure 2021-10-28T18:03:26.1082040Z](https://github.com/apache/pulsar/runs/4037997562?check_suite_focus=true?check_suite_focus=true#step:8:6785)
[example failure 2021-10-28T17:02:58.9217398Z](https://github.com/apache/pulsar/runs/4037573281?check_suite_focus=true?check_suite_focus=true#step:8:1446)
[example failure 2021-10-27T06:28:42.4948293Z](https://github.com/apache/pulsar/runs/4018551001?check_suite_focus=true?check_suite_focus=true#step:8:8515)
[example failure 2021-10-27T06:07:24.9571558Z](https://github.com/apache/pulsar/runs/4018551001?check_suite_focus=true?check_suite_focus=true#step:8:1428)
[example failure 2021-10-26T01:26:10.6829486Z](https://github.com/apache/pulsar/runs/4004149303?check_suite_focus=true?check_suite_focus=true#step:8:8423)
[example failure 2021-10-26T01:23:12.6681569Z](https://github.com/apache/pulsar/runs/4004149303?check_suite_focus=true?check_suite_focus=true#step:8:6795)
[example failure 2021-10-16T18:37:14.7611209Z](https://github.com/apache/pulsar/runs/3915265490?check_suite_focus=true?check_suite_focus=true#step:8:1424)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [false] but found [true]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertFalse(Assert.java:67)
	at org.testng.Assert.assertFalse(Assert.java:77)
	at org.apache.pulsar.metadata.LocalMemoryMetadataStoreTest.testSharedInstance(LocalMemoryMetadataStoreTest.java:87)
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

