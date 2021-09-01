        
Flaky-test: org.apache.pulsar.broker.service.persistent.SimpleProducerConsumerTestStreamingDispatcherTest.testNativeAvroSendCompressedWithDeferredSchemaSetup
Number of failures: 7

org.apache.pulsar.broker.service.persistent.SimpleProducerConsumerTestStreamingDispatcherTest is flaky. The testNativeAvroSendCompressedWithDeferredSchemaSetup test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:37.8518099Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2555)
[example failure 2021-08-28T02:15:16.9715849Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1552)
[example failure 2021-08-27T08:10:50.3175346Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:1623)
[example failure 2021-08-27T08:04:09.6650432Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1548)
[example failure 2021-08-27T06:45:28.9316257Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1549)
[example failure 2021-08-26T08:59:43.5156619Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2258)
[example failure 2021-08-26T07:10:19.8966843Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:1610)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

