        
Flaky-test: org.apache.pulsar.broker.service.schema.KeyValueSchemaCompatibilityCheckTest.testCheckSchemaTypeAlwaysCompatibility
Number of failures: 3

org.apache.pulsar.broker.service.schema.KeyValueSchemaCompatibilityCheckTest is flaky. The testCheckSchemaTypeAlwaysCompatibility test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-31T10:16:39.9738414Z](https://github.com/apache/pulsar/runs/3471501156?check_suite_focus=true#step:10:1619)
[example failure 2021-08-30T23:13:46.3447577Z](https://github.com/apache/pulsar/runs/3467152431?check_suite_focus=true#step:9:879)
[example failure 2021-08-27T06:37:35.5273391Z](https://github.com/apache/pulsar/runs/3440411059?check_suite_focus=true#step:9:2801)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

