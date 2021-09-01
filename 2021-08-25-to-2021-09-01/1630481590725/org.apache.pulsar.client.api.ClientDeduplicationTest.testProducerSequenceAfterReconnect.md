        
Flaky-test: org.apache.pulsar.client.api.ClientDeduplicationTest.testProducerSequenceAfterReconnect
Number of failures: 9

org.apache.pulsar.client.api.ClientDeduplicationTest is flaky. The testProducerSequenceAfterReconnect test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:41.3548955Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3253)
[example failure 2021-08-28T02:15:20.2921840Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2250)
[example failure 2021-08-28T00:15:28.1729883Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:1618)
[example failure 2021-08-27T08:10:55.3582363Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2317)
[example failure 2021-08-27T08:04:14.3163081Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2242)
[example failure 2021-08-27T06:45:33.3501016Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2243)
[example failure 2021-08-26T08:59:47.5958973Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2952)
[example failure 2021-08-26T07:10:22.9859132Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2304)
[example failure 2021-08-25T09:11:47.0664950Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2214)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

