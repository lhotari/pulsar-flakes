        
Flaky-test: org.apache.pulsar.client.impl.RawReaderTest.testFlowControlBatch
Number of failures: 10

org.apache.pulsar.client.impl.RawReaderTest is flaky. The testFlowControlBatch test method fails sporadically.

```
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.impl.RawReaderTest.testFlowControlBatch(RawReaderTest.java:306)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-08-31T22:26:42.5292757Z](https://github.com/apache/pulsar/runs/8123742327?check_suite_focus=true#step:10:2135)  
[example failure 2022-08-31T18:11:27.6492933Z](https://github.com/apache/pulsar/runs/8119670527?check_suite_focus=true#step:10:2116)  
[example failure 2022-08-31T12:20:07.5065968Z](https://github.com/apache/pulsar/runs/8112869070?check_suite_focus=true#step:10:762)  
[example failure 2022-08-31T12:08:22.8073329Z](https://github.com/apache/pulsar/runs/8112664142?check_suite_focus=true#step:10:2110)  
[example failure 2022-08-31T11:15:04.1891432Z](https://github.com/apache/pulsar/runs/8111596966?check_suite_focus=true#step:10:762)  
[example failure 2022-08-31T01:41:25.9713303Z](https://github.com/apache/pulsar/runs/8104784434?check_suite_focus=true#step:10:756)  
[example failure 2022-08-30T20:27:11.6576083Z](https://github.com/apache/pulsar/runs/8100597555?check_suite_focus=true#step:10:759)  
[example failure 2022-08-27T06:38:28.9803501Z](https://github.com/apache/pulsar/runs/8048471818?check_suite_focus=true#step:10:759)  
[example failure 2022-08-27T01:53:38.5206157Z](https://github.com/apache/pulsar/runs/8046967481?check_suite_focus=true#step:10:2110)  
[example failure 2022-08-26T03:47:14.6140756Z](https://github.com/apache/pulsar/runs/8029186715?check_suite_focus=true#step:10:2263)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.client.impl.RawReaderTest.testFlowControlBatch(RawReaderTest.java:306)
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

