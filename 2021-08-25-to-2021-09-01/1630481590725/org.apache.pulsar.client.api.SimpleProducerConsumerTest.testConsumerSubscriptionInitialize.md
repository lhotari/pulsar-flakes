        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.testConsumerSubscriptionInitialize
Number of failures: 9

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The testConsumerSubscriptionInitialize test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:41.8178939Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3335)
[example failure 2021-08-28T02:15:20.6324287Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2332)
[example failure 2021-08-28T00:15:28.5773643Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:1700)
[example failure 2021-08-27T08:10:55.6913310Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2399)
[example failure 2021-08-27T08:04:14.7114553Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2324)
[example failure 2021-08-27T06:45:33.6363266Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2325)
[example failure 2021-08-26T08:59:47.9244934Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3034)
[example failure 2021-08-26T07:10:23.3327121Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2386)
[example failure 2021-08-25T09:11:47.3798854Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2296)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

