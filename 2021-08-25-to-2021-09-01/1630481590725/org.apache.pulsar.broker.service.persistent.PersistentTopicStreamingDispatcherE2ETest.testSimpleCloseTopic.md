        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherE2ETest.testSimpleCloseTopic
Number of failures: 8

org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherE2ETest is flaky. The testSimpleCloseTopic test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:38.1208138Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2783)
[example failure 2021-08-28T02:15:17.2093408Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1780)
[example failure 2021-08-27T08:10:50.8671058Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:1847)
[example failure 2021-08-27T08:04:10.1369333Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1772)
[example failure 2021-08-27T06:45:29.0578362Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1773)
[example failure 2021-08-26T08:59:43.7885722Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2482)
[example failure 2021-08-26T07:10:20.0518982Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:1834)
[example failure 2021-08-25T09:11:43.6258109Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1770)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

