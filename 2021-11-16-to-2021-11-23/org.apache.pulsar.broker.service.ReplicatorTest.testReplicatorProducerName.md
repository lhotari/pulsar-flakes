        
Flaky-test: org.apache.pulsar.broker.service.ReplicatorTest.testReplicatorProducerName
Number of failures: 6

org.apache.pulsar.broker.service.ReplicatorTest is flaky. The testReplicatorProducerName test method fails sporadically.

```
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.broker.service.ReplicatorTest.testReplicatorProducerName(ReplicatorTest.java:730)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-19T02:48:42.8034639Z](https://github.com/apache/pulsar/runs/4259433812?check_suite_focus=true?check_suite_focus=true#step:9:3752)
[example failure 2021-11-19T02:25:07.2490089Z](https://github.com/apache/pulsar/runs/4259433812?check_suite_focus=true?check_suite_focus=true#step:9:302)
[example failure 2021-11-18T12:16:23.8012245Z](https://github.com/apache/pulsar/runs/4250910150?check_suite_focus=true?check_suite_focus=true#step:9:286)
[example failure 2021-11-18T09:04:42.8684787Z](https://github.com/apache/pulsar/runs/4248742376?check_suite_focus=true?check_suite_focus=true#step:9:5676)
[example failure 2021-11-17T20:33:56.3244500Z](https://github.com/apache/pulsar/runs/4243173818?check_suite_focus=true?check_suite_focus=true#step:9:640)
[example failure 2021-11-17T10:40:25.7155054Z](https://github.com/apache/pulsar/runs/4236581504?check_suite_focus=true?check_suite_focus=true#step:9:652)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.testng.Assert.assertTrue(Assert.java:55)
	at org.apache.pulsar.broker.service.ReplicatorTest.testReplicatorProducerName(ReplicatorTest.java:730)
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

