        
Flaky-test: org.apache.pulsar.broker.service.CurrentLedgerRolloverIfFullTest.testCurrentLedgerRolloverIfFull
Number of failures: 1

org.apache.pulsar.broker.service.CurrentLedgerRolloverIfFullTest is flaky. The testCurrentLedgerRolloverIfFull test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T23:13:45.2341790Z](https://github.com/apache/pulsar/runs/3467152431?check_suite_focus=true#step:9:393)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

