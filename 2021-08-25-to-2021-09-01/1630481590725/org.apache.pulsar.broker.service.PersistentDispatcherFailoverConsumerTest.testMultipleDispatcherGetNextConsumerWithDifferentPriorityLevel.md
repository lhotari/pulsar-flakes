        
Flaky-test: org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest.testMultipleDispatcherGetNextConsumerWithDifferentPriorityLevel
Number of failures: 3

org.apache.pulsar.broker.service.PersistentDispatcherFailoverConsumerTest is flaky. The testMultipleDispatcherGetNextConsumerWithDifferentPriorityLevel test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-31T10:16:38.3715004Z](https://github.com/apache/pulsar/runs/3471501156?check_suite_focus=true#step:10:1189)
[example failure 2021-08-30T23:13:45.3543857Z](https://github.com/apache/pulsar/runs/3467152431?check_suite_focus=true#step:9:445)
[example failure 2021-08-27T06:37:33.5730393Z](https://github.com/apache/pulsar/runs/3440411059?check_suite_focus=true#step:9:2367)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>
