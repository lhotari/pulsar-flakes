        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.testSendBigMessageSizeButCompressed
Number of failures: 9

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The testSendBigMessageSizeButCompressed test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:41.8706982Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3475)
[example failure 2021-08-28T02:15:20.6967886Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2472)
[example failure 2021-08-28T00:15:28.6482397Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:1840)
[example failure 2021-08-27T08:10:55.7661281Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2539)
[example failure 2021-08-27T08:04:14.8431064Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2464)
[example failure 2021-08-27T06:45:33.6813161Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2465)
[example failure 2021-08-26T08:59:47.9945623Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3174)
[example failure 2021-08-26T07:10:23.4759334Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2526)
[example failure 2021-08-25T09:11:47.5012419Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2432)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

