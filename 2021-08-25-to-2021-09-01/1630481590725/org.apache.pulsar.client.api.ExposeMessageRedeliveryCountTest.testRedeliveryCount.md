        
Flaky-test: org.apache.pulsar.client.api.ExposeMessageRedeliveryCountTest.testRedeliveryCount
Number of failures: 1

org.apache.pulsar.client.api.ExposeMessageRedeliveryCountTest is flaky. The testRedeliveryCount test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T08:29:11.6780111Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:648)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

