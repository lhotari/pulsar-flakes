        
Flaky-test: org.apache.pulsar.client.api.DeadLetterTopicTest.testDuplicatedMessageSendToDeadLetterTopic
Number of failures: 10

org.apache.pulsar.client.api.DeadLetterTopicTest is flaky. The testDuplicatedMessageSendToDeadLetterTopic test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:43.6153606Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:4067)
[example failure 2021-08-28T02:15:22.5345507Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:3064)
[example failure 2021-08-28T00:15:30.6379411Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2432)
[example failure 2021-08-27T08:10:57.4349840Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:3131)
[example failure 2021-08-27T08:04:17.2854448Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:3056)
[example failure 2021-08-27T06:45:35.4041225Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:3057)
[example failure 2021-08-26T08:59:50.1260708Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3766)
[example failure 2021-08-26T07:43:09.4441404Z](https://github.com/apache/pulsar/runs/3429972501?check_suite_focus=true#step:9:1688)
[example failure 2021-08-26T07:10:25.2923139Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:3118)
[example failure 2021-08-25T09:11:50.0316525Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:3024)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

