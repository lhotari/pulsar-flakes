        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.testGetStats
Number of failures: 9

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The testGetStats test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:41.8361378Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3387)
[example failure 2021-08-28T02:15:20.6551657Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2384)
[example failure 2021-08-28T00:15:28.5952937Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:1752)
[example failure 2021-08-27T08:10:55.7469576Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2451)
[example failure 2021-08-27T08:04:14.7606169Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2376)
[example failure 2021-08-27T06:45:33.6517106Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2377)
[example failure 2021-08-26T08:59:47.9615353Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3086)
[example failure 2021-08-26T07:10:23.3848419Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2438)
[example failure 2021-08-25T09:11:47.4370708Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2348)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

