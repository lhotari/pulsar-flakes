        
Flaky-test: org.apache.pulsar.compaction.CompactionTest.testBatchAndNonBatchEndOfEmptyPayload
Number of failures: 8

org.apache.pulsar.compaction.CompactionTest is flaky. The testBatchAndNonBatchEndOfEmptyPayload test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:40.6627117Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3049)
[example failure 2021-08-28T02:15:19.4414203Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2046)
[example failure 2021-08-27T08:10:54.4359413Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2113)
[example failure 2021-08-27T08:04:13.4261041Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2038)
[example failure 2021-08-27T06:45:32.1440088Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2039)
[example failure 2021-08-26T08:59:46.6319430Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2748)
[example failure 2021-08-26T07:10:21.9587414Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2100)
[example failure 2021-08-25T09:11:46.4521691Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2028)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

