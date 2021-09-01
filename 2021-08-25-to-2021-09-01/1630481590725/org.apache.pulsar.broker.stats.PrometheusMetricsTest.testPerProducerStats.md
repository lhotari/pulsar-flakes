        
Flaky-test: org.apache.pulsar.broker.stats.PrometheusMetricsTest.testPerProducerStats
Number of failures: 8

org.apache.pulsar.broker.stats.PrometheusMetricsTest is flaky. The testPerProducerStats test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:40.3185296Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2991)
[example failure 2021-08-28T02:15:19.0879015Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1988)
[example failure 2021-08-27T08:10:54.0038137Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2055)
[example failure 2021-08-27T08:04:12.9049562Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1980)
[example failure 2021-08-27T06:45:31.4639250Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1981)
[example failure 2021-08-26T08:59:45.9434980Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2690)
[example failure 2021-08-26T07:10:21.5606354Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2042)
[example failure 2021-08-25T09:11:46.0409425Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1974)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

