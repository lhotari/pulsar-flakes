        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherE2ETest.testGetTopicIfExists
Number of failures: 8

org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherE2ETest is flaky. The testGetTopicIfExists test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:38.0677423Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2723)
[example failure 2021-08-28T02:15:17.1832354Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1720)
[example failure 2021-08-27T08:10:50.7908611Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:1791)
[example failure 2021-08-27T08:04:10.0789315Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1716)
[example failure 2021-08-27T06:45:29.0272516Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1717)
[example failure 2021-08-26T08:59:43.7735670Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2426)
[example failure 2021-08-26T07:10:20.0226001Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:1778)
[example failure 2021-08-25T09:11:43.5456137Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1714)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

