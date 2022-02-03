        
Flaky-test: org.apache.pulsar.metadata.LockManagerTest.updateValueWhenKeyDisappears
Number of failures: 2

org.apache.pulsar.metadata.LockManagerTest is flaky. The updateValueWhenKeyDisappears test method fails sporadically.

```
java.lang.AssertionError: expected [value-2] but found [lock-1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:629)
	at org.testng.Assert.assertEquals(Assert.java:639)
	at org.apache.pulsar.metadata.LockManagerTest.updateValueWhenKeyDisappears(LockManagerTest.java:205)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-27T14:33:27.3084804Z](https://github.com/apache/pulsar/runs/4967565169?check_suite_focus=true?check_suite_focus=true#step:8:1497)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [value-2] but found [lock-1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:629)
	at org.testng.Assert.assertEquals(Assert.java:639)
	at org.apache.pulsar.metadata.LockManagerTest.updateValueWhenKeyDisappears(LockManagerTest.java:205)
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

```
java.util.NoSuchElementException: No value present
	at java.base/java.util.Optional.get(Optional.java:148)
	at org.apache.pulsar.metadata.LockManagerTest.updateValueWhenKeyDisappears(LockManagerTest.java:206)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-30T11:28:03.6361101Z](https://github.com/apache/pulsar/runs/4996340534?check_suite_focus=true?check_suite_focus=true#step:8:8970)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.util.NoSuchElementException: No value present
	at java.base/java.util.Optional.get(Optional.java:148)
	at org.apache.pulsar.metadata.LockManagerTest.updateValueWhenKeyDisappears(LockManagerTest.java:206)
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

