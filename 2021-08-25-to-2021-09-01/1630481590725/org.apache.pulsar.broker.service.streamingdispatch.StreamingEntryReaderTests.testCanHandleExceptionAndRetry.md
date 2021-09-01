        
Flaky-test: org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests.testCanHandleExceptionAndRetry
Number of failures: 8

org.apache.pulsar.broker.service.streamingdispatch.StreamingEntryReaderTests is flaky. The testCanHandleExceptionAndRetry test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:38.7941652Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2857)
[example failure 2021-08-28T02:15:17.5507813Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1854)
[example failure 2021-08-27T08:10:51.9262147Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:1921)
[example failure 2021-08-27T08:04:10.6379643Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1846)
[example failure 2021-08-27T06:45:29.6053974Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1847)
[example failure 2021-08-26T08:59:44.3684725Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2556)
[example failure 2021-08-26T07:10:20.1017808Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:1908)
[example failure 2021-08-25T09:11:44.2275095Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1842)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

