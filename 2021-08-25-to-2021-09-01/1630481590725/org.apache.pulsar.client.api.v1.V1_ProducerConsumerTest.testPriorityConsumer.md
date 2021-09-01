        
Flaky-test: org.apache.pulsar.client.api.v1.V1_ProducerConsumerTest.testPriorityConsumer
Number of failures: 9

org.apache.pulsar.client.api.v1.V1_ProducerConsumerTest is flaky. The testPriorityConsumer test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:42.5836695Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3679)
[example failure 2021-08-28T02:15:21.6044328Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2676)
[example failure 2021-08-28T00:15:29.8287990Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2044)
[example failure 2021-08-27T08:10:56.7522159Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2743)
[example failure 2021-08-27T08:04:16.2642212Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2668)
[example failure 2021-08-27T06:45:34.4980727Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2669)
[example failure 2021-08-26T08:59:48.9323220Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3378)
[example failure 2021-08-26T07:10:24.2332104Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2730)
[example failure 2021-08-25T09:11:48.8857227Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2636)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

