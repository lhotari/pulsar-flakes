        
Flaky-test: org.apache.pulsar.broker.admin.v1.V1_AdminApiTest.testCompactionStatus
Number of failures: 1

org.apache.pulsar.broker.admin.v1.V1_AdminApiTest is flaky. The testCompactionStatus test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T06:37:26.2063447Z](https://github.com/apache/pulsar/runs/3440411059?check_suite_focus=true#step:9:791)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

