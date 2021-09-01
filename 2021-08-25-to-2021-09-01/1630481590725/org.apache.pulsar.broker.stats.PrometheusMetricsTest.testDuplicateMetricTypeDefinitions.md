        
Flaky-test: org.apache.pulsar.broker.stats.PrometheusMetricsTest.testDuplicateMetricTypeDefinitions
Number of failures: 16

org.apache.pulsar.broker.stats.PrometheusMetricsTest is flaky. The testDuplicateMetricTypeDefinitions test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T15:35:40.3020759Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2935)
[example failure 2021-08-30T15:35:40.3012437Z](https://github.com/apache/pulsar/runs/3463119398?check_suite_focus=true#step:9:2931)
[example failure 2021-08-28T02:15:19.0667723Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1932)
[example failure 2021-08-28T02:15:19.0650811Z](https://github.com/apache/pulsar/runs/3448473880?check_suite_focus=true#step:9:1928)
[example failure 2021-08-27T08:10:53.9756650Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:1999)
[example failure 2021-08-27T08:10:53.9746764Z](https://github.com/apache/pulsar/runs/3440980370?check_suite_focus=true#step:9:1995)
[example failure 2021-08-27T08:04:12.8834709Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1924)
[example failure 2021-08-27T08:04:12.8824968Z](https://github.com/apache/pulsar/runs/3440855241?check_suite_focus=true#step:9:1920)
[example failure 2021-08-27T06:45:31.4277894Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1925)
[example failure 2021-08-27T06:45:31.4245112Z](https://github.com/apache/pulsar/runs/3440411158?check_suite_focus=true#step:9:1921)
[example failure 2021-08-26T08:59:45.8903729Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2634)
[example failure 2021-08-26T08:59:45.8885617Z](https://github.com/apache/pulsar/runs/3430539961?check_suite_focus=true#step:9:2630)
[example failure 2021-08-26T07:10:21.5373982Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:1986)
[example failure 2021-08-26T07:10:21.5362750Z](https://github.com/apache/pulsar/runs/3429892136?check_suite_focus=true#step:9:1982)
[example failure 2021-08-25T09:11:46.0116800Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1918)
[example failure 2021-08-25T09:11:46.0107892Z](https://github.com/apache/pulsar/runs/3420085427?check_suite_focus=true#step:10:1914)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

