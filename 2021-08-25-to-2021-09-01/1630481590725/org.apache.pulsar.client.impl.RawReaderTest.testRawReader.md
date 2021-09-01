        
Flaky-test: org.apache.pulsar.client.impl.RawReaderTest.testRawReader
Number of failures: 11

org.apache.pulsar.client.impl.RawReaderTest is flaky. The testRawReader test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:43.6374977Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:4117)
[example failure 2021-08-30T15:30:21.4576768Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:1731)
[example failure 2021-08-28T02:15:22.8681893Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:3114)
[example failure 2021-08-28T00:15:31.0193043Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2482)
[example failure 2021-08-27T08:10:57.9195371Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:3181)
[example failure 2021-08-27T08:04:17.6593401Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:3106)
[example failure 2021-08-27T06:45:35.7926302Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:3107)
[example failure 2021-08-26T08:59:50.6477672Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3816)
[example failure 2021-08-26T07:43:10.1179979Z](https://github.com/apache/pulsar/runs/3429972501?check_suite_focus=true#step:9:1738)
[example failure 2021-08-26T07:10:25.6227169Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:3168)
[example failure 2021-08-25T09:11:50.5225542Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:3074)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

