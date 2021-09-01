        
Flaky-test: org.apache.pulsar.broker.stats.PrometheusMetricsTest.testMetricsAvgMsgSize2
Number of failures: 8

org.apache.pulsar.broker.stats.PrometheusMetricsTest is flaky. The testMetricsAvgMsgSize2 test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:40.3069949Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2963)
[example failure 2021-08-28T02:15:19.0779814Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1960)
[example failure 2021-08-27T08:10:53.9851053Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2027)
[example failure 2021-08-27T08:04:12.8903059Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1952)
[example failure 2021-08-27T06:45:31.4468918Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1953)
[example failure 2021-08-26T08:59:45.9309579Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2662)
[example failure 2021-08-26T07:10:21.5484771Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2014)
[example failure 2021-08-25T09:11:46.0227453Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1946)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

