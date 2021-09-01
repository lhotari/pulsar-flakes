        
Flaky-test: org.apache.pulsar.broker.service.persistent.SimpleProducerConsumerTestStreamingDispatcherTest.testGetStatsForPartitionedTopic
Number of failures: 8

org.apache.pulsar.broker.service.persistent.SimpleProducerConsumerTestStreamingDispatcherTest is flaky. The testGetStatsForPartitionedTopic test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:37.8296492Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2527)
[example failure 2021-08-28T02:15:16.9633244Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1524)
[example failure 2021-08-27T08:10:50.2975935Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:1595)
[example failure 2021-08-27T08:04:09.6393215Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1520)
[example failure 2021-08-27T06:45:28.9079789Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1521)
[example failure 2021-08-26T08:59:43.4924831Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2230)
[example failure 2021-08-26T07:10:19.8808943Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:1582)
[example failure 2021-08-25T09:11:42.9650367Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1526)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

