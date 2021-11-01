        
Flaky-test: org.apache.pulsar.broker.service.PersistentTopicE2ETest.testBrokerConnectionStats
Number of failures: 22

org.apache.pulsar.broker.service.PersistentTopicE2ETest is flaky. The testBrokerConnectionStats test method fails sporadically.

```
java.lang.AssertionError: expected [0] but found [1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.broker.service.PersistentTopicE2ETest.testBrokerConnectionStats(PersistentTopicE2ETest.java:1549)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-27T01:00:55.5399435Z](https://github.com/apache/pulsar/runs/4016762268?check_suite_focus=true?check_suite_focus=true#step:9:337)
[example failure 2021-10-26T10:42:53.4397406Z](https://github.com/apache/pulsar/runs/4008473683?check_suite_focus=true?check_suite_focus=true#step:9:337)
[example failure 2021-10-26T01:14:15.0111466Z](https://github.com/apache/pulsar/runs/4004188537?check_suite_focus=true?check_suite_focus=true#step:9:337)
[example failure 2021-10-25T16:31:59.8488187Z](https://github.com/apache/pulsar/runs/3999590399?check_suite_focus=true?check_suite_focus=true#step:9:337)
[example failure 2021-10-24T14:30:33.9206835Z](https://github.com/apache/pulsar/runs/3989262029?check_suite_focus=true?check_suite_focus=true#step:9:337)
[example failure 2021-10-22T05:54:15.8271464Z](https://github.com/apache/pulsar/runs/3972294522?check_suite_focus=true?check_suite_focus=true#step:9:337)
[example failure 2021-10-20T01:39:09.8462558Z](https://github.com/apache/pulsar/runs/3946371460?check_suite_focus=true?check_suite_focus=true#step:9:337)
[example failure 2021-10-19T11:34:03.1328373Z](https://github.com/apache/pulsar/runs/3938419363?check_suite_focus=true?check_suite_focus=true#step:9:337)
[example failure 2021-10-19T08:46:39.3269495Z](https://github.com/apache/pulsar/runs/3936710318?check_suite_focus=true?check_suite_focus=true#step:9:337)
[example failure 2021-10-18T22:08:56.5429885Z](https://github.com/apache/pulsar/runs/3932392486?check_suite_focus=true?check_suite_focus=true#step:9:337)
[example failure 2021-10-14T19:59:48.8885400Z](https://github.com/apache/pulsar/runs/3899065545?check_suite_focus=true?check_suite_focus=true#step:9:337)
[example failure 2021-10-14T17:32:21.3696174Z](https://github.com/apache/pulsar/runs/3897711134?check_suite_focus=true?check_suite_focus=true#step:9:337)
[example failure 2021-10-14T10:07:18.3132732Z](https://github.com/apache/pulsar/runs/3893041314?check_suite_focus=true?check_suite_focus=true#step:9:333)
[example failure 2021-10-14T06:57:48.5601946Z](https://github.com/apache/pulsar/runs/3891419074?check_suite_focus=true?check_suite_focus=true#step:9:333)
[example failure 2021-10-13T20:19:15.7347643Z](https://github.com/apache/pulsar/runs/3887306167?check_suite_focus=true?check_suite_focus=true#step:9:333)
[example failure 2021-10-13T13:24:13.7631791Z](https://github.com/apache/pulsar/runs/3882965793?check_suite_focus=true?check_suite_focus=true#step:9:333)
[example failure 2021-10-12T09:15:42.1123088Z](https://github.com/apache/pulsar/runs/3868468816?check_suite_focus=true?check_suite_focus=true#step:9:333)
[example failure 2021-10-12T03:16:52.2437753Z](https://github.com/apache/pulsar/runs/3865935074?check_suite_focus=true?check_suite_focus=true#step:9:333)
[example failure 2021-10-08T15:01:37.2036332Z](https://github.com/apache/pulsar/runs/3839908944?check_suite_focus=true?check_suite_focus=true#step:9:333)
[example failure 2021-10-08T09:13:36.9226708Z](https://github.com/apache/pulsar/runs/3836736202?check_suite_focus=true?check_suite_focus=true#step:9:333)
[example failure 2021-10-07T23:36:36.8377461Z](https://github.com/apache/pulsar/runs/3833183326?check_suite_focus=true?check_suite_focus=true#step:9:333)
[example failure 2021-10-07T20:56:19.0070449Z](https://github.com/apache/pulsar/runs/3832038876?check_suite_focus=true?check_suite_focus=true#step:9:333)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [0] but found [1]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotEquals(Assert.java:1037)
	at org.testng.Assert.assertEqualsImpl(Assert.java:140)
	at org.testng.Assert.assertEquals(Assert.java:122)
	at org.testng.Assert.assertEquals(Assert.java:797)
	at org.testng.Assert.assertEquals(Assert.java:807)
	at org.apache.pulsar.broker.service.PersistentTopicE2ETest.testBrokerConnectionStats(PersistentTopicE2ETest.java:1549)
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

