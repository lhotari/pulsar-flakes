        
Flaky-test: org.apache.pulsar.broker.admin.PersistentTopicsTest.testTerminate
Number of failures: 2

org.apache.pulsar.broker.admin.PersistentTopicsTest is flaky. The testTerminate test method fails sporadically.

```
java.lang.AssertionError: expected [3:-1:-1] but found [4:-1:-1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.broker.admin.PersistentTopicsTest.testTerminate(PersistentTopicsTest.java:405)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-06T05:16:28.3280325Z](https://github.com/apache/pulsar/runs/6750401277?check_suite_focus=true#step:10:517)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [3:-1:-1] but found [4:-1:-1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:617)
	at org.apache.pulsar.broker.admin.PersistentTopicsTest.testTerminate(PersistentTopicsTest.java:405)
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
org.mockito.exceptions.verification.TooManyActualInvocations:

asyncResponse.resume(<Capturing argument>);
Wanted 1 time:
-> at org.apache.pulsar.broker.admin.PersistentTopicsTest.testTerminate(PersistentTopicsTest.java:400)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-15T05:53:24.5503521Z](https://github.com/apache/pulsar/runs/7352154161?check_suite_focus=true#step:10:1280)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.verification.TooManyActualInvocations:

asyncResponse.resume(<Capturing argument>);
Wanted 1 time:
-> at org.apache.pulsar.broker.admin.PersistentTopicsTest.testTerminate(PersistentTopicsTest.java:400)
But was 2 times:
-> at org.apache.pulsar.broker.admin.v2.PersistentTopics.lambda$createNonPartitionedTopic$6(PersistentTopics.java:364)
-> at org.apache.pulsar.broker.admin.impl.PersistentTopicsBase.lambda$internalCreateSubscriptionForNonPartitionedTopic$232(PersistentTopicsBase.java:2286)


	at org.apache.pulsar.broker.admin.PersistentTopicsTest.testTerminate(PersistentTopicsTest.java:400)
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

