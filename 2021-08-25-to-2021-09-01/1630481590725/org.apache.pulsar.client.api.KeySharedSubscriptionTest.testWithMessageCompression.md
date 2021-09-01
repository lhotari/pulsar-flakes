        
Flaky-test: org.apache.pulsar.client.api.KeySharedSubscriptionTest.testWithMessageCompression
Number of failures: 11

org.apache.pulsar.client.api.KeySharedSubscriptionTest is flaky. The testWithMessageCompression test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:43.5675832Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3963)
[example failure 2021-08-30T15:30:20.6175169Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:1681)
[example failure 2021-08-28T02:15:22.0461509Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2960)
[example failure 2021-08-28T00:15:30.2316284Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2328)
[example failure 2021-08-27T08:10:56.9678830Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:3027)
[example failure 2021-08-27T08:04:16.7205222Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2952)
[example failure 2021-08-27T06:45:34.9276876Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2953)
[example failure 2021-08-26T08:59:49.3464374Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3662)
[example failure 2021-08-26T07:43:08.9709742Z](https://github.com/apache/pulsar/runs/3429972501?check_suite_focus=true#step:9:1650)
[example failure 2021-08-26T07:10:24.6753961Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:3014)
[example failure 2021-08-25T09:11:49.4826751Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2920)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

