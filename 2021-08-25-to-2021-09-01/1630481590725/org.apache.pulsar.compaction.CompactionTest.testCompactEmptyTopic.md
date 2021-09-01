        
Flaky-test: org.apache.pulsar.compaction.CompactionTest.testCompactEmptyTopic
Number of failures: 8

org.apache.pulsar.compaction.CompactionTest is flaky. The testCompactEmptyTopic test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:40.6734204Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3077)
[example failure 2021-08-28T02:15:19.4621321Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2074)
[example failure 2021-08-27T08:10:54.4516510Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2141)
[example failure 2021-08-27T08:04:13.4566468Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2066)
[example failure 2021-08-27T06:45:32.1963625Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2067)
[example failure 2021-08-26T08:59:46.6755468Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2776)
[example failure 2021-08-26T07:10:21.9757913Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2128)
[example failure 2021-08-25T09:11:46.4684721Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2056)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

