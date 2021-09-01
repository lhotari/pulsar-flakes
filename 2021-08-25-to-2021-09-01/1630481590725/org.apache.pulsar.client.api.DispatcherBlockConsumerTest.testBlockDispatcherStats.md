        
Flaky-test: org.apache.pulsar.client.api.DispatcherBlockConsumerTest.testBlockDispatcherStats
Number of failures: 9

org.apache.pulsar.client.api.DispatcherBlockConsumerTest is flaky. The testBlockDispatcherStats test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:41.5816803Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3273)
[example failure 2021-08-28T02:15:20.4218096Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2270)
[example failure 2021-08-28T00:15:28.2948020Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:1638)
[example failure 2021-08-27T08:10:55.4677307Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2337)
[example failure 2021-08-27T08:04:14.4453344Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2262)
[example failure 2021-08-27T06:45:33.4614828Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2263)
[example failure 2021-08-26T08:59:47.7455253Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2972)
[example failure 2021-08-26T07:10:23.1201611Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2324)
[example failure 2021-08-25T09:11:47.1571274Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2234)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

