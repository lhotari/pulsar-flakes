        
Flaky-test: org.apache.pulsar.client.api.KeySharedSubscriptionTest.testSendAndReceiveWithHashRangeExclusiveStickyKeyConsumerSelector
Number of failures: 11

org.apache.pulsar.client.api.KeySharedSubscriptionTest is flaky. The testSendAndReceiveWithHashRangeExclusiveStickyKeyConsumerSelector test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:43.5668539Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3959)
[example failure 2021-08-30T15:30:20.6144863Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:1677)
[example failure 2021-08-28T02:15:22.0431187Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2956)
[example failure 2021-08-28T00:15:30.2306776Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2324)
[example failure 2021-08-27T08:10:56.9669744Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:3023)
[example failure 2021-08-27T08:04:16.7178417Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2948)
[example failure 2021-08-27T06:45:34.9267055Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2949)
[example failure 2021-08-26T08:59:49.3428256Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3658)
[example failure 2021-08-26T07:43:08.9666935Z](https://github.com/apache/pulsar/runs/3429972501?check_suite_focus=true#step:9:1646)
[example failure 2021-08-26T07:10:24.6738656Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:3010)
[example failure 2021-08-25T09:11:49.4773444Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2916)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

