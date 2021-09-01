        
Flaky-test: org.apache.pulsar.client.api.SimpleSchemaTest.getSchemaVersionFromMessagesBatchingEnabled
Number of failures: 4

org.apache.pulsar.client.api.SimpleSchemaTest is flaky. The getSchemaVersionFromMessagesBatchingEnabled test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T08:29:15.9212461Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:982)
[example failure 2021-08-27T08:29:15.9167818Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:978)
[example failure 2021-08-27T00:49:54.5949784Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:978)
[example failure 2021-08-27T00:49:54.5940352Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:974)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

