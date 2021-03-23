        
Flaky-test: org.apache.pulsar.tests.integration.cli.CLITest.testSetInfiniteRetention
Number of failures: 5

org.apache.pulsar.tests.integration.cli.CLITest is flaky. The testSetInfiniteRetention test method fails sporadically.

```
java.lang.AssertionError:
null
 expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.tests.integration.cli.CLITest.testSetInfiniteRetention(CLITest.java:215)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-19T20:03:02.5812129Z](https://github.com/apache/pulsar/runs/2150562963?check_suite_focus=true#step:13:57866)
[example failure 2021-03-17T23:20:35.3870207Z](https://github.com/apache/pulsar/runs/2134972963?check_suite_focus=true#step:13:56814)
[example failure 2021-03-16T15:27:28.0444771Z](https://github.com/apache/pulsar/runs/2120491059?check_suite_focus=true#step:13:57244)
[example failure 2021-03-13T01:02:48.1504938Z](https://github.com/apache/pulsar/runs/2099584434?check_suite_focus=true#step:12:60859)
[example failure 2021-03-12T08:55:30.0979453Z](https://github.com/apache/pulsar/runs/2093100946?check_suite_focus=true#step:12:60558)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError:
null
 expected [true] but found [false]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertTrue(Assert.java:45)
	at org.apache.pulsar.tests.integration.cli.CLITest.testSetInfiniteRetention(CLITest.java:215)
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

