        
Flaky-test: org.apache.pulsar.broker.stats.PrometheusMetricsTest.testPerNamespaceStats
Number of failures: 8

org.apache.pulsar.broker.stats.PrometheusMetricsTest is flaky. The testPerNamespaceStats test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:40.3171998Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2987)
[example failure 2021-08-28T02:15:19.0860403Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1984)
[example failure 2021-08-27T08:10:53.9898422Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2051)
[example failure 2021-08-27T08:04:12.9032429Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1976)
[example failure 2021-08-27T06:45:31.4527776Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1977)
[example failure 2021-08-26T08:59:45.9427860Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2686)
[example failure 2021-08-26T07:10:21.5586294Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2038)
[example failure 2021-08-25T09:11:46.0391858Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1970)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

