        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.testGetStatsForPartitionedTopic
Number of failures: 9

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The testGetStatsForPartitionedTopic test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:41.8371854Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3391)
[example failure 2021-08-28T02:15:20.6559262Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2388)
[example failure 2021-08-28T00:15:28.5960874Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:1756)
[example failure 2021-08-27T08:10:55.7477937Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2455)
[example failure 2021-08-27T08:04:14.7641773Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2380)
[example failure 2021-08-27T06:45:33.6532394Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2381)
[example failure 2021-08-26T08:59:47.9633706Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3090)
[example failure 2021-08-26T07:10:23.3895816Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2442)
[example failure 2021-08-25T09:11:47.4406793Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2352)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

