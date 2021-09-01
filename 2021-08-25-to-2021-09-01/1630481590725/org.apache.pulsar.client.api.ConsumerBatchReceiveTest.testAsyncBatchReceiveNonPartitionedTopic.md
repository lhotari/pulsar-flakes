        
Flaky-test: org.apache.pulsar.client.api.ConsumerBatchReceiveTest.testAsyncBatchReceiveNonPartitionedTopic
Number of failures: 18

org.apache.pulsar.client.api.ConsumerBatchReceiveTest is flaky. The testAsyncBatchReceiveNonPartitionedTopic test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-31T02:55:27.5010578Z](https://github.com/apache/pulsar/runs/3468534483?check_suite_focus=true#step:9:715)
[example failure 2021-08-30T23:01:46.2862376Z](https://github.com/apache/pulsar/runs/3467152590?check_suite_focus=true#step:9:723)
[example failure 2021-08-30T19:31:51.3915527Z](https://github.com/apache/pulsar/runs/3465551342?check_suite_focus=true#step:9:727)
[example failure 2021-08-30T15:05:39.4772614Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:715)
[example failure 2021-08-27T10:54:27.6637947Z](https://github.com/apache/pulsar/runs/3442314708?check_suite_focus=true#step:9:723)
[example failure 2021-08-27T08:28:43.5168273Z](https://github.com/apache/pulsar/runs/3441181162?check_suite_focus=true#step:9:715)
[example failure 2021-08-27T08:05:28.5443384Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:737)
[example failure 2021-08-27T07:57:00.3723242Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:715)
[example failure 2021-08-27T06:43:37.3021430Z](https://github.com/apache/pulsar/runs/3440456730?check_suite_focus=true#step:9:715)
[example failure 2021-08-27T06:38:47.7996704Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:712)
[example failure 2021-08-27T05:22:39.8909079Z](https://github.com/apache/pulsar/runs/3440010388?check_suite_focus=true#step:9:723)
[example failure 2021-08-27T00:47:04.7308483Z](https://github.com/apache/pulsar/runs/3438608599?check_suite_focus=true#step:9:715)
[example failure 2021-08-26T10:08:02.5807352Z](https://github.com/apache/pulsar/runs/3431383943?check_suite_focus=true#step:9:715)
[example failure 2021-08-26T09:15:10.5488920Z](https://github.com/apache/pulsar/runs/3430942268?check_suite_focus=true#step:9:720)
[example failure 2021-08-26T07:17:50.4241488Z](https://github.com/apache/pulsar/runs/3429972501?check_suite_focus=true#step:9:712)
[example failure 2021-08-26T07:04:01.3595637Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:720)
[example failure 2021-08-25T16:49:55.5574145Z](https://github.com/apache/pulsar/runs/3424390559?check_suite_focus=true#step:9:724)
[example failure 2021-08-25T09:05:44.4568406Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:676)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

