        
Flaky-test: org.apache.pulsar.client.api.KeySharedSubscriptionTest.testConsumerCrashSendAndReceiveWithHashRangeAutoSplitStickyKeyConsumerSelector
Number of failures: 9

org.apache.pulsar.client.api.KeySharedSubscriptionTest is flaky. The testConsumerCrashSendAndReceiveWithHashRangeAutoSplitStickyKeyConsumerSelector test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:43.5369342Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3895)
[example failure 2021-08-28T02:15:21.9994649Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2892)
[example failure 2021-08-28T00:15:30.2024276Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2260)
[example failure 2021-08-27T08:10:56.9310351Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2959)
[example failure 2021-08-27T08:04:16.6824783Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2884)
[example failure 2021-08-27T06:45:34.8991897Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2885)
[example failure 2021-08-26T08:59:49.2999816Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3594)
[example failure 2021-08-26T07:10:24.6218431Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2946)
[example failure 2021-08-25T09:11:49.3978980Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2852)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

