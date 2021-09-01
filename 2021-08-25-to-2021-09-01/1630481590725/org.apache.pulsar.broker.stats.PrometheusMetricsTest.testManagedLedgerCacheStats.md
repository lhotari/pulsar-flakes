        
Flaky-test: org.apache.pulsar.broker.stats.PrometheusMetricsTest.testManagedLedgerCacheStats
Number of failures: 8

org.apache.pulsar.broker.stats.PrometheusMetricsTest is flaky. The testManagedLedgerCacheStats test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:40.3057015Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2955)
[example failure 2021-08-28T02:15:19.0734730Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1952)
[example failure 2021-08-27T08:10:53.9812214Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2019)
[example failure 2021-08-27T08:04:12.8889206Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1944)
[example failure 2021-08-27T06:45:31.4451733Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1945)
[example failure 2021-08-26T08:59:45.9222523Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2654)
[example failure 2021-08-26T07:10:21.5470335Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2006)
[example failure 2021-08-25T09:11:46.0183366Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1938)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

