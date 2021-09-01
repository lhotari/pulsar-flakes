        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.testBackoffAndReconnect
Number of failures: 9

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The testBackoffAndReconnect test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:41.7971400Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3307)
[example failure 2021-08-28T02:15:20.6244068Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2304)
[example failure 2021-08-28T00:15:28.5621184Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:1672)
[example failure 2021-08-27T08:10:55.6612371Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2371)
[example failure 2021-08-27T08:04:14.6854126Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2296)
[example failure 2021-08-27T06:45:33.6199040Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2297)
[example failure 2021-08-26T08:59:47.9096677Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3006)
[example failure 2021-08-26T07:10:23.2994954Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2358)
[example failure 2021-08-25T09:11:47.3425411Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2268)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

