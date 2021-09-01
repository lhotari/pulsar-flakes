        
Flaky-test: org.apache.pulsar.client.api.v1.V1_ProducerConsumerTest.testInvalidSequence
Number of failures: 9

org.apache.pulsar.client.api.v1.V1_ProducerConsumerTest is flaky. The testInvalidSequence test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:42.5781012Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3667)
[example failure 2021-08-28T02:15:21.6025877Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2664)
[example failure 2021-08-28T00:15:29.8229371Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2032)
[example failure 2021-08-27T08:10:56.7498644Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2731)
[example failure 2021-08-27T08:04:16.2596619Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2656)
[example failure 2021-08-27T06:45:34.4939252Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2657)
[example failure 2021-08-26T08:59:48.9300620Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3366)
[example failure 2021-08-26T07:10:24.2219278Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2718)
[example failure 2021-08-25T09:11:48.8753992Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2624)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

