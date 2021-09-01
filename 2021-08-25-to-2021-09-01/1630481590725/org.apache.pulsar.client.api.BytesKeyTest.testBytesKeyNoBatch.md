        
Flaky-test: org.apache.pulsar.client.api.BytesKeyTest.testBytesKeyNoBatch
Number of failures: 1

org.apache.pulsar.client.api.BytesKeyTest is flaky. The testBytesKeyNoBatch test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T00:49:48.3545513Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:624)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

