        
Flaky-test: org.apache.pulsar.broker.stats.PrometheusMetricsTest.testParsingWithPositiveInfinityValue
Number of failures: 8

org.apache.pulsar.broker.stats.PrometheusMetricsTest is flaky. The testParsingWithPositiveInfinityValue test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:40.3137931Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2979)
[example failure 2021-08-28T02:15:19.0828511Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1976)
[example failure 2021-08-27T08:10:53.9882632Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2043)
[example failure 2021-08-27T08:04:12.8934020Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1968)
[example failure 2021-08-27T06:45:31.4510994Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1969)
[example failure 2021-08-26T08:59:45.9414214Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2678)
[example failure 2021-08-26T07:10:21.5554001Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2030)
[example failure 2021-08-25T09:11:46.0338401Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1962)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

