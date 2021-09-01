        
Flaky-test: org.apache.pulsar.client.api.TopicReaderTest.testReaderOnSpecificMessage
Number of failures: 9

org.apache.pulsar.client.api.TopicReaderTest is flaky. The testReaderOnSpecificMessage test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:42.8268944Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3843)
[example failure 2021-08-28T02:15:21.8983114Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2840)
[example failure 2021-08-28T00:15:30.1192389Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2208)
[example failure 2021-08-27T08:10:56.8239263Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2907)
[example failure 2021-08-27T08:04:16.5851402Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2832)
[example failure 2021-08-27T06:45:34.8023380Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2833)
[example failure 2021-08-26T08:59:49.2000058Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3542)
[example failure 2021-08-26T07:10:24.5401422Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2894)
[example failure 2021-08-25T09:11:49.2546672Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2800)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

