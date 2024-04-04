        
Flaky-test: org.apache.pulsar.broker.service.PersistentMessageFinderTest.testMessageExpiryWithTimestampNonRecoverableException
Number of failures: 5

org.apache.pulsar.broker.service.PersistentMessageFinderTest is flaky. The testMessageExpiryWithTimestampNonRecoverableException test method fails sporadically.

```
java.lang.AssertionError: expected [5] but found [6]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1418)
	at org.testng.Assert.assertEquals(Assert.java:1382)
	at org.testng.Assert.assertEquals(Assert.java:1428)
	at org.apache.pulsar.broker.service.PersistentMessageFinderTest.testMessageExpiryWithTimestampNonRecoverableException(PersistentMessageFinderTest.java:409)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-04-04T05:23:46.0766596Z](https://github.com/apache/pulsar/actions/runs/8549523859/job/23425217811#step:10:800)  
[example failure 2024-04-03T14:26:41.0788393Z](https://github.com/apache/pulsar/actions/runs/8540082190/job/23397010640#step:11:781)  
[example failure 2024-03-31T15:17:48.9573376Z](https://github.com/apache/pulsar/actions/runs/8485068669/job/23279492932#step:11:781)  
[example failure 2024-03-30T22:58:48.9744098Z](https://github.com/apache/pulsar/actions/runs/8485068669/job/23268420057#step:11:781)  
[example failure 2024-03-29T17:45:21.6752104Z](https://github.com/apache/pulsar/actions/runs/8483679771/job/23245517658#step:11:781)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [5] but found [6]
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.failNotEquals(Assert.java:1577)
	at org.testng.Assert.assertEqualsImpl(Assert.java:149)
	at org.testng.Assert.assertEquals(Assert.java:131)
	at org.testng.Assert.assertEquals(Assert.java:1418)
	at org.testng.Assert.assertEquals(Assert.java:1382)
	at org.testng.Assert.assertEquals(Assert.java:1428)
	at org.apache.pulsar.broker.service.PersistentMessageFinderTest.testMessageExpiryWithTimestampNonRecoverableException(PersistentMessageFinderTest.java:409)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:840)

</pre></code>
</details>

