        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerStatTest.testSendTimeout
Number of failures: 2

org.apache.pulsar.client.api.SimpleProducerConsumerStatTest is flaky. The testSendTimeout test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T08:29:17.6079830Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:1430)
[example failure 2021-08-27T00:49:56.4468680Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:1426)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

