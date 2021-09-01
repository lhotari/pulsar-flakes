        
Flaky-test: org.apache.pulsar.client.api.ClientDeduplicationTest.testProducerDeduplicationWithDiscontinuousSequenceId
Number of failures: 9

org.apache.pulsar.client.api.ClientDeduplicationTest is flaky. The testProducerDeduplicationWithDiscontinuousSequenceId test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:41.3541592Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3249)
[example failure 2021-08-28T02:15:20.2884476Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2246)
[example failure 2021-08-28T00:15:28.1711543Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:1614)
[example failure 2021-08-27T08:10:55.3572574Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2313)
[example failure 2021-08-27T08:04:14.3146043Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2238)
[example failure 2021-08-27T06:45:33.3466912Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2239)
[example failure 2021-08-26T08:59:47.5936910Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2948)
[example failure 2021-08-26T07:10:22.9821033Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2300)
[example failure 2021-08-25T09:11:47.0655758Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2210)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

