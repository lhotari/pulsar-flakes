        
Flaky-test: org.apache.pulsar.client.api.TopicReaderTest.testMultiReaderMessageAvailableAfterRestart
Number of failures: 9

org.apache.pulsar.client.api.TopicReaderTest is flaky. The testMultiReaderMessageAvailableAfterRestart test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:42.8058263Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3791)
[example failure 2021-08-28T02:15:21.8612412Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2788)
[example failure 2021-08-28T00:15:30.0947929Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2156)
[example failure 2021-08-27T08:10:56.7997394Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2855)
[example failure 2021-08-27T08:04:16.5554662Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2780)
[example failure 2021-08-27T06:45:34.7822928Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2781)
[example failure 2021-08-26T08:59:49.1786520Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3490)
[example failure 2021-08-26T07:10:24.5085425Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2842)
[example failure 2021-08-25T09:11:49.2096383Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2748)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

