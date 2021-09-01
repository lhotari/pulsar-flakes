        
Flaky-test: org.apache.pulsar.client.api.TopicReaderTest.testTopicStats
Number of failures: 9

org.apache.pulsar.client.api.TopicReaderTest is flaky. The testTopicStats test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:42.8386807Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3879)
[example failure 2021-08-28T02:15:21.9218885Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2876)
[example failure 2021-08-28T00:15:30.1345949Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2244)
[example failure 2021-08-27T08:10:56.8394123Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2943)
[example failure 2021-08-27T08:04:16.5913532Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2868)
[example failure 2021-08-27T06:45:34.8126794Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2869)
[example failure 2021-08-26T08:59:49.2149289Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3578)
[example failure 2021-08-26T07:10:24.5527332Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2930)
[example failure 2021-08-25T09:11:49.2871138Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2836)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

