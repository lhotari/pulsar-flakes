        
Flaky-test: org.apache.pulsar.client.api.ClientDeduplicationTest.testNamespaceDeduplicationApi
Number of failures: 9

org.apache.pulsar.client.api.ClientDeduplicationTest is flaky. The testNamespaceDeduplicationApi test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:41.3505715Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3237)
[example failure 2021-08-28T02:15:20.2776440Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2234)
[example failure 2021-08-28T00:15:28.1616385Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:1602)
[example failure 2021-08-27T08:10:55.3542453Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2301)
[example failure 2021-08-27T08:04:14.3086492Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2226)
[example failure 2021-08-27T06:45:33.3343598Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2227)
[example failure 2021-08-26T08:59:47.5874340Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2936)
[example failure 2021-08-26T07:10:22.9698802Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2288)
[example failure 2021-08-25T09:11:47.0625371Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2198)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

