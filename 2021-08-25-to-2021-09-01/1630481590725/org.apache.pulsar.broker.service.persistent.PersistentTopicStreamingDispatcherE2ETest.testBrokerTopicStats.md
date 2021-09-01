        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherE2ETest.testBrokerTopicStats
Number of failures: 8

org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherE2ETest is flaky. The testBrokerTopicStats test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:38.0098341Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2679)
[example failure 2021-08-28T02:15:17.1627086Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1676)
[example failure 2021-08-27T08:10:50.7350953Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:1747)
[example failure 2021-08-27T08:04:10.0394021Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1672)
[example failure 2021-08-27T06:45:29.0045371Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1673)
[example failure 2021-08-26T08:59:43.7462613Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2382)
[example failure 2021-08-26T07:10:19.9996184Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:1734)
[example failure 2021-08-25T09:11:43.5028177Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1674)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

