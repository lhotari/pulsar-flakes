        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.testSendCompressedWithDeferredSchemaSetup
Number of failures: 9

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The testSendCompressedWithDeferredSchemaSetup test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:41.8737844Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3487)
[example failure 2021-08-28T02:15:20.7007401Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2484)
[example failure 2021-08-28T00:15:28.6541842Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:1852)
[example failure 2021-08-27T08:10:55.7686218Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2551)
[example failure 2021-08-27T08:04:14.8530892Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2476)
[example failure 2021-08-27T06:45:33.6836798Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2477)
[example failure 2021-08-26T08:59:48.0027344Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3186)
[example failure 2021-08-26T07:10:23.4883666Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2538)
[example failure 2021-08-25T09:11:47.5037217Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2444)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

