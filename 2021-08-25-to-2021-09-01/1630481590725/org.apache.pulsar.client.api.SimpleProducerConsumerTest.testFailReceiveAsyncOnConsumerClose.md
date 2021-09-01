        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.testFailReceiveAsyncOnConsumerClose
Number of failures: 9

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The testFailReceiveAsyncOnConsumerClose test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:41.8290799Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3367)
[example failure 2021-08-28T02:15:20.6454694Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2364)
[example failure 2021-08-28T00:15:28.5893754Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:1732)
[example failure 2021-08-27T08:10:55.7400211Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2431)
[example failure 2021-08-27T08:04:14.7405845Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2356)
[example failure 2021-08-27T06:45:33.6441839Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2357)
[example failure 2021-08-26T08:59:47.9449008Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3066)
[example failure 2021-08-26T07:10:23.3650270Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2418)
[example failure 2021-08-25T09:11:47.4173015Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2328)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

