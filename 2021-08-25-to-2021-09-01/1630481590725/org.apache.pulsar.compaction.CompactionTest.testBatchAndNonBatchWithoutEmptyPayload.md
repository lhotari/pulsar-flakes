        
Flaky-test: org.apache.pulsar.compaction.CompactionTest.testBatchAndNonBatchWithoutEmptyPayload
Number of failures: 8

org.apache.pulsar.compaction.CompactionTest is flaky. The testBatchAndNonBatchWithoutEmptyPayload test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:40.6645352Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3057)
[example failure 2021-08-28T02:15:19.4471040Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2054)
[example failure 2021-08-27T08:10:54.4436066Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2121)
[example failure 2021-08-27T08:04:13.4344893Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2046)
[example failure 2021-08-27T06:45:32.1547631Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2047)
[example failure 2021-08-26T08:59:46.6490863Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2756)
[example failure 2021-08-26T07:10:21.9614656Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2108)
[example failure 2021-08-25T09:11:46.4557517Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2036)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

