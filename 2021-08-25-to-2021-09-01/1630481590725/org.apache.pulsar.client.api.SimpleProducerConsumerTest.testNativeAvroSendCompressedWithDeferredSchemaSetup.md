        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.testNativeAvroSendCompressedWithDeferredSchemaSetup
Number of failures: 8

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The testNativeAvroSendCompressedWithDeferredSchemaSetup test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:41.8520219Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3419)
[example failure 2021-08-28T02:15:20.6683776Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2416)
[example failure 2021-08-28T00:15:28.6066966Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:1784)
[example failure 2021-08-27T08:10:55.7540012Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2483)
[example failure 2021-08-27T08:04:14.7931306Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2408)
[example failure 2021-08-27T06:45:33.6653178Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2409)
[example failure 2021-08-26T08:59:47.9713055Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3118)
[example failure 2021-08-26T07:10:23.4195781Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2470)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

