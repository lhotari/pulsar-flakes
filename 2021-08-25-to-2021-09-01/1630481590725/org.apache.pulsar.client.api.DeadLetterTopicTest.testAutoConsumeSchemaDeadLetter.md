        
Flaky-test: org.apache.pulsar.client.api.DeadLetterTopicTest.testAutoConsumeSchemaDeadLetter
Number of failures: 10

org.apache.pulsar.client.api.DeadLetterTopicTest is flaky. The testAutoConsumeSchemaDeadLetter test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:43.6058475Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:4055)
[example failure 2021-08-28T02:15:22.5271339Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:3052)
[example failure 2021-08-28T00:15:30.6342970Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2420)
[example failure 2021-08-27T08:10:57.4316910Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:3119)
[example failure 2021-08-27T08:04:17.2740558Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:3044)
[example failure 2021-08-27T06:45:35.3970602Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:3045)
[example failure 2021-08-26T08:59:50.1128412Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3754)
[example failure 2021-08-26T07:43:09.4324011Z](https://github.com/apache/pulsar/runs/3429972501?check_suite_focus=true#step:9:1676)
[example failure 2021-08-26T07:10:25.2884383Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:3106)
[example failure 2021-08-25T09:11:50.0287646Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:3012)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

