        
Flaky-test: org.apache.pulsar.client.api.TopicReaderTest.testHasMessageAvailableWithBatch
Number of failures: 9

org.apache.pulsar.client.api.TopicReaderTest is flaky. The testHasMessageAvailableWithBatch test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:42.7888811Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3759)
[example failure 2021-08-28T02:15:21.8397082Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2756)
[example failure 2021-08-28T00:15:30.0826884Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2124)
[example failure 2021-08-27T08:10:56.7902652Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2823)
[example failure 2021-08-27T08:04:16.5353739Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2748)
[example failure 2021-08-27T06:45:34.7704178Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2749)
[example failure 2021-08-26T08:59:49.1642949Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3458)
[example failure 2021-08-26T07:10:24.4911352Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2810)
[example failure 2021-08-25T09:11:49.1815445Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2716)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

