        
Flaky-test: org.apache.pulsar.client.api.DispatcherBlockConsumerTest.testBrokerSubscriptionRecovery
Number of failures: 9

org.apache.pulsar.client.api.DispatcherBlockConsumerTest is flaky. The testBrokerSubscriptionRecovery test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:41.5862825Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3281)
[example failure 2021-08-28T02:15:20.4280797Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2278)
[example failure 2021-08-28T00:15:28.3023289Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:1646)
[example failure 2021-08-27T08:10:55.4695494Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2345)
[example failure 2021-08-27T08:04:14.4509359Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2270)
[example failure 2021-08-27T06:45:33.4692706Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2271)
[example failure 2021-08-26T08:59:47.7501148Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2980)
[example failure 2021-08-26T07:10:23.1386262Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2332)
[example failure 2021-08-25T09:11:47.1604451Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2242)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

