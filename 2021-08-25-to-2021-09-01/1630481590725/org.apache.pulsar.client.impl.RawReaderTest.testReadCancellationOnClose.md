        
Flaky-test: org.apache.pulsar.client.impl.RawReaderTest.testReadCancellationOnClose
Number of failures: 11

org.apache.pulsar.client.impl.RawReaderTest is flaky. The testReadCancellationOnClose test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:43.6380903Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:4121)
[example failure 2021-08-30T15:30:21.4582748Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:1735)
[example failure 2021-08-28T02:15:22.8692262Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:3118)
[example failure 2021-08-28T00:15:31.0226630Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2486)
[example failure 2021-08-27T08:10:57.9203229Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:3185)
[example failure 2021-08-27T08:04:17.6600415Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:3110)
[example failure 2021-08-27T06:45:35.7955513Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:3111)
[example failure 2021-08-26T08:59:50.6484929Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3820)
[example failure 2021-08-26T07:43:10.1214482Z](https://github.com/apache/pulsar/runs/3429972501?check_suite_focus=true#step:9:1742)
[example failure 2021-08-26T07:10:25.6243458Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:3172)
[example failure 2021-08-25T09:11:50.5238532Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:3078)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

