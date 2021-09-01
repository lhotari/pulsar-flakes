        
Flaky-test: org.apache.pulsar.broker.service.persistent.SimpleProducerConsumerTestStreamingDispatcherTest.testFailOverConsumerPriority
Number of failures: 8

org.apache.pulsar.broker.service.persistent.SimpleProducerConsumerTestStreamingDispatcherTest is flaky. The testFailOverConsumerPriority test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:37.8176535Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2499)
[example failure 2021-08-28T02:15:16.9520122Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1496)
[example failure 2021-08-27T08:10:50.2820884Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:1567)
[example failure 2021-08-27T08:04:09.6154548Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1492)
[example failure 2021-08-27T06:45:28.8938056Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1493)
[example failure 2021-08-26T08:59:43.4763038Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2202)
[example failure 2021-08-26T07:10:19.8633334Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:1554)
[example failure 2021-08-25T09:11:42.9296444Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1498)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

