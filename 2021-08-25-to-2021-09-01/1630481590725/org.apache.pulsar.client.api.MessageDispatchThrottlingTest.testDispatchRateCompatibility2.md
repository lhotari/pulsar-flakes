        
Flaky-test: org.apache.pulsar.client.api.MessageDispatchThrottlingTest.testDispatchRateCompatibility2
Number of failures: 9

org.apache.pulsar.client.api.MessageDispatchThrottlingTest is flaky. The testDispatchRateCompatibility2 test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:43.5833027Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3997)
[example failure 2021-08-28T02:15:22.1772826Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2994)
[example failure 2021-08-28T00:15:30.3331844Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2362)
[example failure 2021-08-27T08:10:57.0768514Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:3061)
[example failure 2021-08-27T08:04:16.8467424Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2986)
[example failure 2021-08-27T06:45:35.0259416Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2987)
[example failure 2021-08-26T08:59:49.5595200Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3696)
[example failure 2021-08-26T07:10:24.7998255Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:3048)
[example failure 2021-08-25T09:11:49.6325267Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2954)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

