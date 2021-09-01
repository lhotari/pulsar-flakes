        
Flaky-test: org.apache.pulsar.client.impl.RawReaderTest.testBatchingRebatch
Number of failures: 11

org.apache.pulsar.client.impl.RawReaderTest is flaky. The testBatchingRebatch test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:43.6317248Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:4105)
[example failure 2021-08-30T15:30:21.4558494Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:1719)
[example failure 2021-08-28T02:15:22.8653588Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:3102)
[example failure 2021-08-28T00:15:31.0095998Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2470)
[example failure 2021-08-27T08:10:57.9163778Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:3169)
[example failure 2021-08-27T08:04:17.6569718Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:3094)
[example failure 2021-08-27T06:45:35.7819882Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:3095)
[example failure 2021-08-26T08:59:50.6416660Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3804)
[example failure 2021-08-26T07:43:10.1127644Z](https://github.com/apache/pulsar/runs/3429972501?check_suite_focus=true#step:9:1726)
[example failure 2021-08-26T07:10:25.6140300Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:3156)
[example failure 2021-08-25T09:11:50.5169718Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:3062)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

