        
Flaky-test: org.apache.pulsar.broker.stats.TransactionMetricsTest.testTransactionCoordinatorRateMetrics
Number of failures: 1

org.apache.pulsar.broker.stats.TransactionMetricsTest is flaky. The testTransactionCoordinatorRateMetrics test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T14:25:00.8601992Z](https://github.com/apache/pulsar/runs/3462661639?check_suite_focus=true#step:9:519)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

