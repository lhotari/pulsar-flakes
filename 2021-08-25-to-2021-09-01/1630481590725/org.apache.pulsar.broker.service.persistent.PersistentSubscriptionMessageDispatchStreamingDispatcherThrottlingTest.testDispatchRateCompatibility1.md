        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentSubscriptionMessageDispatchStreamingDispatcherThrottlingTest.testDispatchRateCompatibility1
Number of failures: 4

org.apache.pulsar.broker.service.persistent.PersistentSubscriptionMessageDispatchStreamingDispatcherThrottlingTest is flaky. The testDispatchRateCompatibility1 test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-28T02:15:16.5268939Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1360)
[example failure 2021-08-27T08:10:49.6183372Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:1431)
[example failure 2021-08-26T07:10:18.8883292Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:1418)
[example failure 2021-08-25T09:11:42.3799211Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1362)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

