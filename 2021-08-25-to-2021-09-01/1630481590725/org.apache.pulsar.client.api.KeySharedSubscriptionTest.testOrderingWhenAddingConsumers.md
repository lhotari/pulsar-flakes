        
Flaky-test: org.apache.pulsar.client.api.KeySharedSubscriptionTest.testOrderingWhenAddingConsumers
Number of failures: 9

org.apache.pulsar.client.api.KeySharedSubscriptionTest is flaky. The testOrderingWhenAddingConsumers test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:43.5521190Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3935)
[example failure 2021-08-28T02:15:22.0260011Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2932)
[example failure 2021-08-28T00:15:30.2198183Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2300)
[example failure 2021-08-27T08:10:56.9479262Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2999)
[example failure 2021-08-27T08:04:16.7027791Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2924)
[example failure 2021-08-27T06:45:34.9138788Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2925)
[example failure 2021-08-26T08:59:49.3265585Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3634)
[example failure 2021-08-26T07:10:24.6555811Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2986)
[example failure 2021-08-25T09:11:49.4475860Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2892)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

