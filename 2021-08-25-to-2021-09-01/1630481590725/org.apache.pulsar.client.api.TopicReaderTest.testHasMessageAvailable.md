        
Flaky-test: org.apache.pulsar.client.api.TopicReaderTest.testHasMessageAvailable
Number of failures: 9

org.apache.pulsar.client.api.TopicReaderTest is flaky. The testHasMessageAvailable test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:42.7869513Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3751)
[example failure 2021-08-28T02:15:21.8342119Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2748)
[example failure 2021-08-28T00:15:30.0806681Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2116)
[example failure 2021-08-27T08:10:56.7888717Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2815)
[example failure 2021-08-27T08:04:16.5339251Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2740)
[example failure 2021-08-27T06:45:34.7691337Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2741)
[example failure 2021-08-26T08:59:49.1610950Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3450)
[example failure 2021-08-26T07:10:24.4897036Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2802)
[example failure 2021-08-25T09:11:49.1750223Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2708)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

