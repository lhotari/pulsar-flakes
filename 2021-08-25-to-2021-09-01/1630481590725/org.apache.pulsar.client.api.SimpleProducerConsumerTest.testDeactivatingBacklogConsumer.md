        
Flaky-test: org.apache.pulsar.client.api.SimpleProducerConsumerTest.testDeactivatingBacklogConsumer
Number of failures: 9

org.apache.pulsar.client.api.SimpleProducerConsumerTest is flaky. The testDeactivatingBacklogConsumer test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:41.8185605Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:3339)
[example failure 2021-08-28T02:15:20.6345718Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:2336)
[example failure 2021-08-28T00:15:28.5781862Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:1704)
[example failure 2021-08-27T08:10:55.6941131Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:2403)
[example failure 2021-08-27T08:04:14.7144738Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:2328)
[example failure 2021-08-27T06:45:33.6375256Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:2329)
[example failure 2021-08-26T08:59:47.9274893Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3038)
[example failure 2021-08-26T07:10:23.3375905Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:2390)
[example failure 2021-08-25T09:11:47.3857920Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:2300)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

