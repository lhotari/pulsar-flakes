        
Flaky-test: org.apache.pulsar.broker.stats.PrometheusMetricsTest.testBrokerConnection
Number of failures: 8

org.apache.pulsar.broker.stats.PrometheusMetricsTest is flaky. The testBrokerConnection test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:40.3005146Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2927)
[example failure 2021-08-28T02:15:19.0639934Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1924)
[example failure 2021-08-27T08:10:53.9653044Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:1991)
[example failure 2021-08-27T08:04:12.8817452Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1916)
[example failure 2021-08-27T06:45:31.4210533Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1917)
[example failure 2021-08-26T08:59:45.8864547Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2626)
[example failure 2021-08-26T07:10:21.5355372Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:1978)
[example failure 2021-08-25T09:11:46.0096887Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1910)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

