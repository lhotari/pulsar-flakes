        
Flaky-test: org.apache.pulsar.broker.service.persistent.SimpleProducerConsumerTestStreamingDispatcherTest.testSharedSamePriorityConsumer
Number of failures: 8

org.apache.pulsar.broker.service.persistent.SimpleProducerConsumerTestStreamingDispatcherTest is flaky. The testSharedSamePriorityConsumer test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:37.9151081Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2639)
[example failure 2021-08-28T02:15:17.0031057Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1636)
[example failure 2021-08-27T08:10:50.3958927Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:1707)
[example failure 2021-08-27T08:04:09.7221445Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1632)
[example failure 2021-08-27T06:45:28.9822426Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1633)
[example failure 2021-08-26T08:59:43.5939025Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2342)
[example failure 2021-08-26T07:10:19.9650688Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:1694)
[example failure 2021-08-25T09:11:43.0750082Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1634)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

