        
Flaky-test: org.apache.pulsar.compaction.CompactionTest.testFirstMessageRetained
Number of failures: 9

org.apache.pulsar.compaction.CompactionTest is flaky. The testFirstMessageRetained test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:40.6915064Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3133)
[example failure 2021-08-28T02:15:19.5051404Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2130)
[example failure 2021-08-28T00:15:27.1702658Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:1498)
[example failure 2021-08-27T08:10:54.4737139Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2197)
[example failure 2021-08-27T08:04:13.5176910Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2122)
[example failure 2021-08-27T06:45:32.2798663Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2123)
[example failure 2021-08-26T08:59:46.7292065Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2832)
[example failure 2021-08-26T07:10:22.0042732Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2184)
[example failure 2021-08-25T09:11:46.5168923Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2112)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

