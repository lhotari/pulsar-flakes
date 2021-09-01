        
Flaky-test: org.apache.pulsar.client.impl.MultiTopicsReaderTest.testReadMessageWithBatching
Number of failures: 11

org.apache.pulsar.client.impl.MultiTopicsReaderTest is flaky. The testReadMessageWithBatching test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:44.3945770Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:4251)
[example failure 2021-08-30T15:30:21.5072470Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:1865)
[example failure 2021-08-28T02:15:23.2977708Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:3248)
[example failure 2021-08-28T00:15:31.6730569Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2616)
[example failure 2021-08-27T08:10:58.4588559Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:3315)
[example failure 2021-08-27T08:04:18.1028081Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:3240)
[example failure 2021-08-27T06:45:36.4326342Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:3241)
[example failure 2021-08-26T08:59:51.3404263Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3950)
[example failure 2021-08-26T07:43:10.2746217Z](https://github.com/apache/pulsar/runs/3429972501?check_suite_focus=true#step:9:1872)
[example failure 2021-08-26T07:10:26.4110148Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:3302)
[example failure 2021-08-25T09:11:51.0298493Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:3206)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

