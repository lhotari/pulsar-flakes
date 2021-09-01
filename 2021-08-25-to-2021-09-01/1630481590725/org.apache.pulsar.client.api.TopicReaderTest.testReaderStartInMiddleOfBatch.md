        
Flaky-test: org.apache.pulsar.client.api.TopicReaderTest.testReaderStartInMiddleOfBatch
Number of failures: 9

org.apache.pulsar.client.api.TopicReaderTest is flaky. The testReaderStartInMiddleOfBatch test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:42.8310512Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3855)
[example failure 2021-08-28T02:15:21.9064703Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2852)
[example failure 2021-08-28T00:15:30.1237201Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2220)
[example failure 2021-08-27T08:10:56.8268847Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2919)
[example failure 2021-08-27T08:04:16.5871158Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2844)
[example failure 2021-08-27T06:45:34.8079768Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2845)
[example failure 2021-08-26T08:59:49.2054887Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3554)
[example failure 2021-08-26T07:10:24.5442586Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2906)
[example failure 2021-08-25T09:11:49.2658082Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2812)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

