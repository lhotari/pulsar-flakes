        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.testReceiveAsyncCompletedWhenClosing
Number of failures: 9

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The testReceiveAsyncCompletedWhenClosing test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:41.8645090Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3459)
[example failure 2021-08-28T02:15:20.6899433Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2456)
[example failure 2021-08-28T00:15:28.6364199Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:1824)
[example failure 2021-08-27T08:10:55.7629313Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2523)
[example failure 2021-08-27T08:04:14.8285250Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2448)
[example failure 2021-08-27T06:45:33.6783582Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2449)
[example failure 2021-08-26T08:59:47.9856625Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3158)
[example failure 2021-08-26T07:10:23.4605078Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2510)
[example failure 2021-08-25T09:11:47.4979029Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2416)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

