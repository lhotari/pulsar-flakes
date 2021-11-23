        
Flaky-test: org.apache.pulsar.broker.admin.PersistentTopicsTest.testSetReplicatedSubscriptionStatus
Number of failures: 1

org.apache.pulsar.broker.admin.PersistentTopicsTest is flaky. The testSetReplicatedSubscriptionStatus test method fails sporadically.

```
Wanted but not invoked:
asyncResponse.resume(<Capturing argument>);
-> at org.apache.pulsar.broker.admin.PersistentTopicsTest.testSetReplicatedSubscriptionStatus(PersistentTopicsTest.java:791)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-11-22T10:10:23.8434269Z](https://github.com/apache/pulsar/runs/4284301519?check_suite_focus=true?check_suite_focus=true#step:9:3595)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
Wanted but not invoked:
asyncResponse.resume(<Capturing argument>);
-> at org.apache.pulsar.broker.admin.PersistentTopicsTest.testSetReplicatedSubscriptionStatus(PersistentTopicsTest.java:791)
Actually, there were zero interactions with this mock.

	at org.apache.pulsar.broker.admin.PersistentTopicsTest.testSetReplicatedSubscriptionStatus(PersistentTopicsTest.java:791)
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

