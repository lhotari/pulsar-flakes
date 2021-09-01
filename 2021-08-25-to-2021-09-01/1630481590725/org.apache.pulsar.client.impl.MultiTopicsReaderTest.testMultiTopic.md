        
Flaky-test: org.apache.pulsar.client.impl.MultiTopicsReaderTest.testMultiTopic
Number of failures: 11

org.apache.pulsar.client.impl.MultiTopicsReaderTest is flaky. The testMultiTopic test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:44.3825807Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:4239)
[example failure 2021-08-30T15:30:21.5028436Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:1853)
[example failure 2021-08-28T02:15:23.2934852Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:3236)
[example failure 2021-08-28T00:15:31.6679896Z](https://github.com/apache/pulsar/runs/3447917315?check_suite_focus=true#step:9:2604)
[example failure 2021-08-27T08:10:58.4452925Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:3303)
[example failure 2021-08-27T08:04:18.1001509Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:3228)
[example failure 2021-08-27T06:45:36.4214353Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:3229)
[example failure 2021-08-26T08:59:51.3340538Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:3938)
[example failure 2021-08-26T07:43:10.2676990Z](https://github.com/apache/pulsar/runs/3429972501?check_suite_focus=true#step:9:1860)
[example failure 2021-08-26T07:10:26.4086196Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:3290)
[example failure 2021-08-25T09:11:51.0221803Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:3194)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

