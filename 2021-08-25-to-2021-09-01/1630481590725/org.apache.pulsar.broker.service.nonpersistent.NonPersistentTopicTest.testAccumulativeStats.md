        
Flaky-test: org.apache.pulsar.broker.service.nonpersistent.NonPersistentTopicTest.testAccumulativeStats
Number of failures: 2

org.apache.pulsar.broker.service.nonpersistent.NonPersistentTopicTest is flaky. The testAccumulativeStats test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-31T10:16:44.4182736Z](https://github.com/apache/pulsar/runs/3471501156?check_suite_focus=true#step:10:2571)
[example failure 2021-08-30T23:13:50.4564766Z](https://github.com/apache/pulsar/runs/3467152431?check_suite_focus=true#step:9:1891)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

