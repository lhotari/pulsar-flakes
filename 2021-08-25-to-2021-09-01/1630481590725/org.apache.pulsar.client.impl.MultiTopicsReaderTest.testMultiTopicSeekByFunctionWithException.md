        
Flaky-test: org.apache.pulsar.client.impl.MultiTopicsReaderTest.testMultiTopicSeekByFunctionWithException
Number of failures: 11

org.apache.pulsar.client.impl.MultiTopicsReaderTest is flaky. The testMultiTopicSeekByFunctionWithException test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:44.3914347Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:4247)
[example failure 2021-08-30T15:30:21.5065827Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:1861)
[example failure 2021-08-28T02:15:23.2970144Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:3244)
[example failure 2021-08-28T00:15:31.6720456Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2612)
[example failure 2021-08-27T08:10:58.4570582Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:3311)
[example failure 2021-08-27T08:04:18.1020587Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:3236)
[example failure 2021-08-27T06:45:36.4286909Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:3237)
[example failure 2021-08-26T08:59:51.3388037Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3946)
[example failure 2021-08-26T07:43:10.2711034Z](https://github.com/apache/pulsar/runs/3429972501?check_suite_focus=true#step:9:1868)
[example failure 2021-08-26T07:10:26.4103272Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:3298)
[example failure 2021-08-25T09:11:51.0274140Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:3202)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

