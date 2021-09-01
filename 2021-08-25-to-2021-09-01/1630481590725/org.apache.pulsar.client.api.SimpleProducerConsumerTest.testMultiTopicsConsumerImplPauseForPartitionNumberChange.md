        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.testMultiTopicsConsumerImplPauseForPartitionNumberChange
Number of failures: 9

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The testMultiTopicsConsumerImplPauseForPartitionNumberChange test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:41.8434358Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3411)
[example failure 2021-08-28T02:15:20.6643693Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2408)
[example failure 2021-08-28T00:15:28.6032909Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:1776)
[example failure 2021-08-27T08:10:55.7521091Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2475)
[example failure 2021-08-27T08:04:14.7852634Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2400)
[example failure 2021-08-27T06:45:33.6615489Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2401)
[example failure 2021-08-26T08:59:47.9674579Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3110)
[example failure 2021-08-26T07:10:23.4109162Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2462)
[example failure 2021-08-25T09:11:47.4593409Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2372)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

