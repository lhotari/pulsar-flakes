        
Flaky-test: org.apache.pulsar.broker.service.persistent.SimpleProducerConsumerTestStreamingDispatcherTest.testGetStats
Number of failures: 8

org.apache.pulsar.broker.service.persistent.SimpleProducerConsumerTestStreamingDispatcherTest is flaky. The testGetStats test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:37.8286690Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2523)
[example failure 2021-08-28T02:15:16.9625362Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1520)
[example failure 2021-08-27T08:10:50.2954567Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:1591)
[example failure 2021-08-27T08:04:09.6358364Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1516)
[example failure 2021-08-27T06:45:28.9055999Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1517)
[example failure 2021-08-26T08:59:43.4913417Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2226)
[example failure 2021-08-26T07:10:19.8786129Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:1578)
[example failure 2021-08-25T09:11:42.9575479Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1522)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

