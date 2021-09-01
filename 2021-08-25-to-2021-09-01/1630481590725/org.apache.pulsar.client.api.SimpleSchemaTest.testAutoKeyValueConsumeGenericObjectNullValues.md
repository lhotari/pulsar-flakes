        
Flaky-test: org.apache.pulsar.client.api.SimpleSchemaTest.testAutoKeyValueConsumeGenericObjectNullValues
Number of failures: 4

org.apache.pulsar.client.api.SimpleSchemaTest is flaky. The testAutoKeyValueConsumeGenericObjectNullValues test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T08:29:16.1186252Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:1150)
[example failure 2021-08-27T08:29:16.1092224Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:1146)
[example failure 2021-08-27T00:49:54.8039183Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:1146)
[example failure 2021-08-27T00:49:54.7998470Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:1142)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

