        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentStreamingDispatcherBlockConsumerTest.testBlockDispatcherStats
Number of failures: 4

org.apache.pulsar.broker.service.persistent.PersistentStreamingDispatcherBlockConsumerTest is flaky. The testBlockDispatcherStats test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-28T02:15:16.0655110Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1330)
[example failure 2021-08-27T08:10:48.6069599Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:1401)
[example failure 2021-08-26T07:10:17.5652284Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:1388)
[example failure 2021-08-25T09:11:41.3448783Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1332)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

