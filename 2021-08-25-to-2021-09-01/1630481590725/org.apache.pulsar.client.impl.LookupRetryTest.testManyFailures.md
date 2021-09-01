        
Flaky-test: org.apache.pulsar.client.impl.LookupRetryTest.testManyFailures
Number of failures: 3

org.apache.pulsar.client.impl.LookupRetryTest is flaky. The testManyFailures test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T14:25:12.6497948Z](https://github.com/apache/pulsar/runs/3462661639?check_suite_focus=true#step:9:1313)
[example failure 2021-08-27T07:52:29.1219634Z](https://github.com/apache/pulsar/runs/3440855061?check_suite_focus=true#step:9:1310)
[example failure 2021-08-26T07:04:25.1909887Z](https://github.com/apache/pulsar/runs/3429892062?check_suite_focus=true#step:9:1270)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

