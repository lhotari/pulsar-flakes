        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.testSyncProducerAndConsumer
Number of failures: 9

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The testSyncProducerAndConsumer test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:41.8856190Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3515)
[example failure 2021-08-28T02:15:20.7113793Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2512)
[example failure 2021-08-28T00:15:28.6683590Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:1880)
[example failure 2021-08-27T08:10:56.6907851Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2579)
[example failure 2021-08-27T08:04:14.8803955Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2504)
[example failure 2021-08-27T06:45:33.6997090Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2505)
[example failure 2021-08-26T08:59:48.0159455Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3214)
[example failure 2021-08-26T07:10:23.5133108Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2566)
[example failure 2021-08-25T09:11:47.5096562Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2472)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

