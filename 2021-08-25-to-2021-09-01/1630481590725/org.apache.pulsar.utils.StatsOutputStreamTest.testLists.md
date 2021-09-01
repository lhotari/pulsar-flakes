        
Flaky-test: org.apache.pulsar.utils.StatsOutputStreamTest.testLists
Number of failures: 3

org.apache.pulsar.utils.StatsOutputStreamTest is flaky. The testLists test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T14:25:04.7763328Z](https://github.com/apache/pulsar/runs/3462661639?check_suite_focus=true#step:9:1051)
[example failure 2021-08-27T07:52:17.9265068Z](https://github.com/apache/pulsar/runs/3440855061?check_suite_focus=true#step:9:1064)
[example failure 2021-08-26T07:04:21.7909436Z](https://github.com/apache/pulsar/runs/3429892062?check_suite_focus=true#step:9:1024)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

