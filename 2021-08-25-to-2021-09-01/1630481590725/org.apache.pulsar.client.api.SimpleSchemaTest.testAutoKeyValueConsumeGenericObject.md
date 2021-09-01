        
Flaky-test: org.apache.pulsar.client.api.SimpleSchemaTest.testAutoKeyValueConsumeGenericObject
Number of failures: 4

org.apache.pulsar.client.api.SimpleSchemaTest is flaky. The testAutoKeyValueConsumeGenericObject test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T08:29:16.1084705Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:1142)
[example failure 2021-08-27T08:29:16.1077336Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:1138)
[example failure 2021-08-27T00:49:54.7990637Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:1138)
[example failure 2021-08-27T00:49:54.7935841Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:1134)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

