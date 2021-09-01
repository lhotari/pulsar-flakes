        
Flaky-test: org.apache.pulsar.broker.BrokerAdditionalServletTest.test
Number of failures: 3

org.apache.pulsar.broker.BrokerAdditionalServletTest is flaky. The test test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-31T10:16:45.6830132Z](https://github.com/apache/pulsar/runs/3471501156?check_suite_focus=true#step:10:2651)
[example failure 2021-08-30T23:13:51.3680485Z](https://github.com/apache/pulsar/runs/3467152431?check_suite_focus=true#step:9:1973)
[example failure 2021-08-27T06:37:43.1814270Z](https://github.com/apache/pulsar/runs/3440411059?check_suite_focus=true#step:9:3891)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

