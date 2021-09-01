        
Flaky-test: org.apache.pulsar.client.api.TopicReaderTest.testHasMessageAvailableOnEmptyTopic
Number of failures: 9

org.apache.pulsar.client.api.TopicReaderTest is flaky. The testHasMessageAvailableOnEmptyTopic test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:42.7877244Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3755)
[example failure 2021-08-28T02:15:21.8372200Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2752)
[example failure 2021-08-28T00:15:30.0818197Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2120)
[example failure 2021-08-27T08:10:56.7895606Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2819)
[example failure 2021-08-27T08:04:16.5346411Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2744)
[example failure 2021-08-27T06:45:34.7697428Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2745)
[example failure 2021-08-26T08:59:49.1634999Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3454)
[example failure 2021-08-26T07:10:24.4903834Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2806)
[example failure 2021-08-25T09:11:49.1782556Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2712)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

