        
Flaky-test: org.apache.pulsar.broker.stats.PrometheusMetricsTest.testParsingWithNegativeInfinityValue
Number of failures: 8

org.apache.pulsar.broker.stats.PrometheusMetricsTest is flaky. The testParsingWithNegativeInfinityValue test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:40.3120491Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2975)
[example failure 2021-08-28T02:15:19.0814475Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1972)
[example failure 2021-08-27T08:10:53.9874345Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2039)
[example failure 2021-08-27T08:04:12.8925695Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1964)
[example failure 2021-08-27T06:45:31.4495563Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1965)
[example failure 2021-08-26T08:59:45.9405915Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2674)
[example failure 2021-08-26T07:10:21.5540357Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2026)
[example failure 2021-08-25T09:11:46.0304550Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1958)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

