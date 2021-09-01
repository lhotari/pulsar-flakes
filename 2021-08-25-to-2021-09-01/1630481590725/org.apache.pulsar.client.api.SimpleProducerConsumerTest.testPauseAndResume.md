        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.testPauseAndResume
Number of failures: 9

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The testPauseAndResume test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:41.8563990Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3431)
[example failure 2021-08-28T02:15:20.6740190Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2428)
[example failure 2021-08-28T00:15:28.6123596Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:1796)
[example failure 2021-08-27T08:10:55.7564682Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2495)
[example failure 2021-08-27T08:04:14.8039246Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2420)
[example failure 2021-08-27T06:45:33.6699474Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2421)
[example failure 2021-08-26T08:59:47.9781397Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3130)
[example failure 2021-08-26T07:10:23.4356266Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2482)
[example failure 2021-08-25T09:11:47.4747833Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2388)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

