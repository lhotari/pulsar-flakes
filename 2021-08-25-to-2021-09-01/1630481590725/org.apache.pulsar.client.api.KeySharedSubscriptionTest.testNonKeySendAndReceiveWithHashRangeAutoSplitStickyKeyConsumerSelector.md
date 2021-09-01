        
Flaky-test: org.apache.pulsar.client.api.KeySharedSubscriptionTest.testNonKeySendAndReceiveWithHashRangeAutoSplitStickyKeyConsumerSelector
Number of failures: 9

org.apache.pulsar.client.api.KeySharedSubscriptionTest is flaky. The testNonKeySendAndReceiveWithHashRangeAutoSplitStickyKeyConsumerSelector test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:43.5437245Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3919)
[example failure 2021-08-28T02:15:22.0141326Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2916)
[example failure 2021-08-28T00:15:30.2116176Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2284)
[example failure 2021-08-27T08:10:56.9413056Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2983)
[example failure 2021-08-27T08:04:16.6924952Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2908)
[example failure 2021-08-27T06:45:34.9065976Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2909)
[example failure 2021-08-26T08:59:49.3122009Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3618)
[example failure 2021-08-26T07:10:24.6395487Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2970)
[example failure 2021-08-25T09:11:49.4254139Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2876)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

