        
Flaky-test: org.apache.pulsar.client.api.KeySharedSubscriptionTest.testSendAndReceiveWithHashRangeAutoSplitStickyKeyConsumerSelector
Number of failures: 11

org.apache.pulsar.client.api.KeySharedSubscriptionTest is flaky. The testSendAndReceiveWithHashRangeAutoSplitStickyKeyConsumerSelector test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:43.5644554Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3955)
[example failure 2021-08-30T15:30:20.6101609Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:1673)
[example failure 2021-08-28T02:15:22.0399932Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2952)
[example failure 2021-08-28T00:15:30.2294207Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2320)
[example failure 2021-08-27T08:10:56.9660520Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:3019)
[example failure 2021-08-27T08:04:16.7148047Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2944)
[example failure 2021-08-27T06:45:34.9258019Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2945)
[example failure 2021-08-26T08:59:49.3391444Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3654)
[example failure 2021-08-26T07:43:08.9645444Z](https://github.com/apache/pulsar/runs/3429972501?check_suite_focus=true#step:9:1642)
[example failure 2021-08-26T07:10:24.6721586Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:3006)
[example failure 2021-08-25T09:11:49.4723798Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2912)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

