        
Flaky-test: org.apache.pulsar.client.api.SimpleSchemaTest.newProducerForMessageSchemaOnTopicInitialWithNoSchema
Number of failures: 4

org.apache.pulsar.client.api.SimpleSchemaTest is flaky. The newProducerForMessageSchemaOnTopicInitialWithNoSchema test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T08:29:16.0198236Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:1054)
[example failure 2021-08-27T08:29:16.0131517Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:1050)
[example failure 2021-08-27T00:49:54.7062133Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:1050)
[example failure 2021-08-27T00:49:54.7010492Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:1046)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

