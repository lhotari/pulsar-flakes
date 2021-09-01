        
Flaky-test: org.apache.pulsar.client.api.KeySharedSubscriptionTest.testAttachKeyToMessageMetadata
Number of failures: 9

org.apache.pulsar.client.api.KeySharedSubscriptionTest is flaky. The testAttachKeyToMessageMetadata test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:43.5353451Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3887)
[example failure 2021-08-28T02:15:21.9940173Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2884)
[example failure 2021-08-28T00:15:30.2003498Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2252)
[example failure 2021-08-27T08:10:56.9245161Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2951)
[example failure 2021-08-27T08:04:16.6803284Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2876)
[example failure 2021-08-27T06:45:34.8969512Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2877)
[example failure 2021-08-26T08:59:49.2954264Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3586)
[example failure 2021-08-26T07:10:24.6177007Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2938)
[example failure 2021-08-25T09:11:49.3881577Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2844)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

