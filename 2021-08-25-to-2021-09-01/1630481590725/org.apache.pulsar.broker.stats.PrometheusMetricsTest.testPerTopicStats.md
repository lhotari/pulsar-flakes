        
Flaky-test: org.apache.pulsar.broker.stats.PrometheusMetricsTest.testPerTopicStats
Number of failures: 8

org.apache.pulsar.broker.stats.PrometheusMetricsTest is flaky. The testPerTopicStats test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:40.3214660Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2999)
[example failure 2021-08-28T02:15:19.0897257Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1996)
[example failure 2021-08-27T08:10:54.0069470Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2063)
[example failure 2021-08-27T08:04:12.9085661Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1988)
[example failure 2021-08-27T06:45:31.4653055Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1989)
[example failure 2021-08-26T08:59:45.9549674Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2698)
[example failure 2021-08-26T07:10:21.5640820Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2050)
[example failure 2021-08-25T09:11:46.0446847Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1982)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

