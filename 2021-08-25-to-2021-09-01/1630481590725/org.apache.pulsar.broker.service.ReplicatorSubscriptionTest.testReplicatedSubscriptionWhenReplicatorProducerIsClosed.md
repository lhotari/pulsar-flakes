        
Flaky-test: org.apache.pulsar.broker.service.ReplicatorSubscriptionTest.testReplicatedSubscriptionWhenReplicatorProducerIsClosed
Number of failures: 2

org.apache.pulsar.broker.service.ReplicatorSubscriptionTest is flaky. The testReplicatedSubscriptionWhenReplicatorProducerIsClosed test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T23:13:45.6506071Z](https://github.com/apache/pulsar/runs/3467152431?check_suite_focus=true#step:9:601)
[example failure 2021-08-27T06:37:34.0440837Z](https://github.com/apache/pulsar/runs/3440411059?check_suite_focus=true#step:9:2523)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

