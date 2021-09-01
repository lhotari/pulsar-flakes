        
Flaky-test: org.apache.pulsar.compaction.CompactionTest.testCompactionWithReader
Number of failures: 8

org.apache.pulsar.compaction.CompactionTest is flaky. The testCompactionWithReader test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:40.6836240Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3109)
[example failure 2021-08-28T02:15:19.4853074Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2106)
[example failure 2021-08-27T08:10:54.4612300Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2173)
[example failure 2021-08-27T08:04:13.4842750Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2098)
[example failure 2021-08-27T06:45:32.2466184Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2099)
[example failure 2021-08-26T08:59:46.7076437Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2808)
[example failure 2021-08-26T07:10:21.9918851Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2160)
[example failure 2021-08-25T09:11:46.5042660Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2088)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

