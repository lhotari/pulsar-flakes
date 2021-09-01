        
Flaky-test: org.apache.pulsar.client.api.ConsumerBatchReceiveTest.testBatchReceiveNonPartitionedTopic
Number of failures: 18

org.apache.pulsar.client.api.ConsumerBatchReceiveTest is flaky. The testBatchReceiveNonPartitionedTopic test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-31T02:55:27.5128926Z](https://github.com/apache/pulsar/runs/3468534483?check_suite_focus=true#step:9:731)
[example failure 2021-08-30T23:01:46.2899413Z](https://github.com/apache/pulsar/runs/3467152590?check_suite_focus=true#step:9:739)
[example failure 2021-08-30T19:31:51.4149034Z](https://github.com/apache/pulsar/runs/3465551342?check_suite_focus=true#step:9:743)
[example failure 2021-08-30T15:05:39.4940908Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:731)
[example failure 2021-08-27T10:54:27.6737327Z](https://github.com/apache/pulsar/runs/3442314708?check_suite_focus=true#step:9:739)
[example failure 2021-08-27T08:28:43.5247518Z](https://github.com/apache/pulsar/runs/3441181162?check_suite_focus=true#step:9:731)
[example failure 2021-08-27T08:05:28.5642654Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:753)
[example failure 2021-08-27T07:57:00.3788854Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:731)
[example failure 2021-08-27T06:43:37.3150249Z](https://github.com/apache/pulsar/runs/3440456730?check_suite_focus=true#step:9:731)
[example failure 2021-08-27T06:38:47.8036558Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:728)
[example failure 2021-08-27T05:22:39.8982377Z](https://github.com/apache/pulsar/runs/3440010388?check_suite_focus=true#step:9:739)
[example failure 2021-08-27T00:47:04.7382495Z](https://github.com/apache/pulsar/runs/3438608599?check_suite_focus=true#step:9:731)
[example failure 2021-08-26T10:08:02.5886711Z](https://github.com/apache/pulsar/runs/3431383943?check_suite_focus=true#step:9:731)
[example failure 2021-08-26T09:15:10.5628335Z](https://github.com/apache/pulsar/runs/3430942268?check_suite_focus=true#step:9:736)
[example failure 2021-08-26T07:17:50.4348215Z](https://github.com/apache/pulsar/runs/3429972501?check_suite_focus=true#step:9:728)
[example failure 2021-08-26T07:04:01.3858908Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:736)
[example failure 2021-08-25T16:49:55.5677588Z](https://github.com/apache/pulsar/runs/3424390559?check_suite_focus=true#step:9:740)
[example failure 2021-08-25T09:05:44.4719545Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:692)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

