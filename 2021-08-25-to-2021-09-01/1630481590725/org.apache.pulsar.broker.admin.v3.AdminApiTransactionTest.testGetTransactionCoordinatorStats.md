        
Flaky-test: org.apache.pulsar.broker.admin.v3.AdminApiTransactionTest.testGetTransactionCoordinatorStats
Number of failures: 1

org.apache.pulsar.broker.admin.v3.AdminApiTransactionTest is flaky. The testGetTransactionCoordinatorStats test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T07:52:05.7675956Z](https://github.com/apache/pulsar/runs/3440855061?check_suite_focus=true#step:9:352)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

