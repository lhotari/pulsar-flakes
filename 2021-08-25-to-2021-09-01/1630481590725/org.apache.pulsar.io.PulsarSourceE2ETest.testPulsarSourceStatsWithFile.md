        
Flaky-test: org.apache.pulsar.io.PulsarSourceE2ETest.testPulsarSourceStatsWithFile
Number of failures: 3

org.apache.pulsar.io.PulsarSourceE2ETest is flaky. The testPulsarSourceStatsWithFile test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T14:25:02.1054352Z](https://github.com/apache/pulsar/runs/3462661639?check_suite_focus=true#step:9:729)
[example failure 2021-08-27T07:52:15.8572255Z](https://github.com/apache/pulsar/runs/3440855061?check_suite_focus=true#step:9:742)
[example failure 2021-08-26T07:04:20.9556121Z](https://github.com/apache/pulsar/runs/3429892062?check_suite_focus=true#step:9:702)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

