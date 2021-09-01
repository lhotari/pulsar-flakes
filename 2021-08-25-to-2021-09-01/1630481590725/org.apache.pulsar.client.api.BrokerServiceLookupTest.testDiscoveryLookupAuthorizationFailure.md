        
Flaky-test: org.apache.pulsar.client.api.BrokerServiceLookupTest.testDiscoveryLookupAuthorizationFailure
Number of failures: 2

org.apache.pulsar.client.api.BrokerServiceLookupTest is flaky. The testDiscoveryLookupAuthorizationFailure test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T08:29:14.8691357Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:838)
[example failure 2021-08-27T00:49:52.8352555Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:834)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

