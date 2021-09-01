        
Flaky-test: org.apache.pulsar.client.api.KeySharedSubscriptionTest.testSendAndReceiveWithBatching
Number of failures: 11

org.apache.pulsar.client.api.KeySharedSubscriptionTest is flaky. The testSendAndReceiveWithBatching test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:43.5624730Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3951)
[example failure 2021-08-30T15:30:20.6059147Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:1669)
[example failure 2021-08-28T02:15:22.0365573Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2948)
[example failure 2021-08-28T00:15:30.2278477Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2316)
[example failure 2021-08-27T08:10:56.9651395Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:3015)
[example failure 2021-08-27T08:04:16.7139599Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2940)
[example failure 2021-08-27T06:45:34.9208630Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2941)
[example failure 2021-08-26T08:59:49.3354201Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3650)
[example failure 2021-08-26T07:43:08.9610169Z](https://github.com/apache/pulsar/runs/3429972501?check_suite_focus=true#step:9:1638)
[example failure 2021-08-26T07:10:24.6705139Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:3002)
[example failure 2021-08-25T09:11:49.4670508Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2908)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

