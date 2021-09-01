        
Flaky-test: org.apache.pulsar.client.impl.MultiTopicsReaderTest.testRemoveSubscriptionForReaderNeedRemoveCursor
Number of failures: 11

org.apache.pulsar.client.impl.MultiTopicsReaderTest is flaky. The testRemoveSubscriptionForReaderNeedRemoveCursor test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:44.4161451Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:4271)
[example failure 2021-08-30T15:30:21.5150622Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:1885)
[example failure 2021-08-28T02:15:23.3042649Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:3268)
[example failure 2021-08-28T00:15:31.6823705Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2636)
[example failure 2021-08-27T08:10:58.4675808Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:3335)
[example failure 2021-08-27T08:04:18.1081792Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:3260)
[example failure 2021-08-27T06:45:36.4508240Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:3261)
[example failure 2021-08-26T08:59:51.3518604Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3970)
[example failure 2021-08-26T07:43:10.2823768Z](https://github.com/apache/pulsar/runs/3429972501?check_suite_focus=true#step:9:1892)
[example failure 2021-08-26T07:10:26.4182613Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:3322)
[example failure 2021-08-25T09:11:51.0428735Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:3226)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

