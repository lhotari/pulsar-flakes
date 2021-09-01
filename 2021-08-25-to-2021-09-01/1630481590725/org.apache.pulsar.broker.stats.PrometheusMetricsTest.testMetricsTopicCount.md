        
Flaky-test: org.apache.pulsar.broker.stats.PrometheusMetricsTest.testMetricsTopicCount
Number of failures: 8

org.apache.pulsar.broker.stats.PrometheusMetricsTest is flaky. The testMetricsTopicCount test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:40.3097050Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2967)
[example failure 2021-08-28T02:15:19.0788783Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1964)
[example failure 2021-08-27T08:10:53.9858914Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2031)
[example failure 2021-08-27T08:04:12.8910892Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1956)
[example failure 2021-08-27T06:45:31.4478535Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1957)
[example failure 2021-08-26T08:59:45.9390283Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2666)
[example failure 2021-08-26T07:10:21.5501718Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2018)
[example failure 2021-08-25T09:11:46.0248977Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1950)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

