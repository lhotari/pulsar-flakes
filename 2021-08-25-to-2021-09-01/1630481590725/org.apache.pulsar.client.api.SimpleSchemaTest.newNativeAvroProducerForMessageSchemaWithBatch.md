        
Flaky-test: org.apache.pulsar.client.api.SimpleSchemaTest.newNativeAvroProducerForMessageSchemaWithBatch
Number of failures: 4

org.apache.pulsar.client.api.SimpleSchemaTest is flaky. The newNativeAvroProducerForMessageSchemaWithBatch test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T08:29:15.9935217Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:1038)
[example failure 2021-08-27T08:29:15.9872545Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:1034)
[example failure 2021-08-27T00:49:54.6797455Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:1034)
[example failure 2021-08-27T00:49:54.6767519Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:1030)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

