        
Flaky-test: org.apache.pulsar.client.api.ProducerQueueSizeTest.testRemoveMaxQueueLimit
Number of failures: 2

org.apache.pulsar.client.api.ProducerQueueSizeTest is flaky. The testRemoveMaxQueueLimit test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T07:52:25.0121866Z](https://github.com/apache/pulsar/runs/3440855061?check_suite_focus=true#step:9:1182)
[example failure 2021-08-26T07:04:23.7639112Z](https://github.com/apache/pulsar/runs/3429892062?check_suite_focus=true#step:9:1144)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

