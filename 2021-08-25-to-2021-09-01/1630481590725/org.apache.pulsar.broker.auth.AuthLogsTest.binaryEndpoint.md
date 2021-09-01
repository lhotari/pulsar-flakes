        
Flaky-test: org.apache.pulsar.broker.auth.AuthLogsTest.binaryEndpoint
Number of failures: 8

org.apache.pulsar.broker.auth.AuthLogsTest is flaky. The binaryEndpoint test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:40.5290309Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3027)
[example failure 2021-08-28T02:15:19.3073408Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2024)
[example failure 2021-08-27T08:10:54.2383810Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2091)
[example failure 2021-08-27T08:04:13.1837637Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2016)
[example failure 2021-08-27T06:45:31.8665884Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2017)
[example failure 2021-08-26T08:59:46.3021998Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2726)
[example failure 2021-08-26T07:10:21.7715761Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2078)
[example failure 2021-08-25T09:11:46.3367429Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2010)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

