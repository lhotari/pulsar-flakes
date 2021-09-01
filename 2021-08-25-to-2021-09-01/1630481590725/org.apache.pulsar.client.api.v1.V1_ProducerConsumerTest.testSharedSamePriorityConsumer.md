        
Flaky-test: org.apache.pulsar.client.api.v1.V1_ProducerConsumerTest.testSharedSamePriorityConsumer
Number of failures: 9

org.apache.pulsar.client.api.v1.V1_ProducerConsumerTest is flaky. The testSharedSamePriorityConsumer test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:42.5878364Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3707)
[example failure 2021-08-28T02:15:21.6147563Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2704)
[example failure 2021-08-28T00:15:29.8377424Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2072)
[example failure 2021-08-27T08:10:56.7607278Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2771)
[example failure 2021-08-27T08:04:16.2751619Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2696)
[example failure 2021-08-27T06:45:34.5076074Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2697)
[example failure 2021-08-26T08:59:48.9372140Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3406)
[example failure 2021-08-26T07:10:24.2563468Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2758)
[example failure 2021-08-25T09:11:48.9118976Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2664)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

