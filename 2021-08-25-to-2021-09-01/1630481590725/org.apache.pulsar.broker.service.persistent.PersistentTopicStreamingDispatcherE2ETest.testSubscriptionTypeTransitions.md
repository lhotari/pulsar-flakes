        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherE2ETest.testSubscriptionTypeTransitions
Number of failures: 8

org.apache.pulsar.broker.service.persistent.PersistentTopicStreamingDispatcherE2ETest is flaky. The testSubscriptionTypeTransitions test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:38.1446205Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2799)
[example failure 2021-08-28T02:15:17.2317418Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1796)
[example failure 2021-08-27T08:10:50.8887999Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:1863)
[example failure 2021-08-27T08:04:10.1521929Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1788)
[example failure 2021-08-27T06:45:29.0758799Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1789)
[example failure 2021-08-26T08:59:43.7929533Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2498)
[example failure 2021-08-26T07:10:20.0672703Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:1850)
[example failure 2021-08-25T09:11:43.6459555Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1786)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

