        
Flaky-test: org.apache.pulsar.client.impl.RawReaderTest.testAcknowledgeWithProperties
Number of failures: 10

org.apache.pulsar.client.impl.RawReaderTest is flaky. The testAcknowledgeWithProperties test method fails sporadically.

```
java.lang.NullPointerException
	at org.apache.pulsar.client.impl.RawReaderTest.testAcknowledgeWithProperties(RawReaderTest.java:361)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-21T17:14:34.9469205Z](https://github.com/apache/pulsar/runs/2160502264?check_suite_focus=true#step:9:275)
[example failure 2021-03-19T22:29:24.8099967Z](https://github.com/apache/pulsar/runs/2151942105?check_suite_focus=true#step:9:1027)
[example failure 2021-03-17T22:27:28.0659585Z](https://github.com/apache/pulsar/runs/2134972808?check_suite_focus=true#step:9:356)
[example failure 2021-03-17T22:20:10.0944489Z](https://github.com/apache/pulsar/runs/2134972808?check_suite_focus=true#step:9:155)
[example failure 2021-03-17T12:10:53.6411690Z](https://github.com/apache/pulsar/runs/2129233072?check_suite_focus=true#step:9:255)
[example failure 2021-03-17T06:25:27.9582066Z](https://github.com/apache/pulsar/runs/2128012846?check_suite_focus=true#step:9:362)
[example failure 2021-03-17T04:01:52.7405171Z](https://github.com/apache/pulsar/runs/2127458208?check_suite_focus=true#step:9:555)
[example failure 2021-03-17T03:54:53.0423556Z](https://github.com/apache/pulsar/runs/2127458208?check_suite_focus=true#step:9:356)
[example failure 2021-03-17T03:43:09.5012074Z](https://github.com/apache/pulsar/runs/2127458208?check_suite_focus=true#step:9:157)
[example failure 2021-03-16T18:42:30.4878639Z](https://github.com/apache/pulsar/runs/2122021091?check_suite_focus=true#step:9:157)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException
	at org.apache.pulsar.client.impl.RawReaderTest.testAcknowledgeWithProperties(RawReaderTest.java:361)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

