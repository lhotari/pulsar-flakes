        
Flaky-test: org.apache.pulsar.client.api.ClientErrorsTest.testProducerReconnect
Number of failures: 20

org.apache.pulsar.client.api.ClientErrorsTest is flaky. The testProducerReconnect test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-27T08:29:17.3415734Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:1388)
[example failure 2021-08-27T08:29:17.3357272Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:1384)
[example failure 2021-08-27T08:29:17.3312580Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:1380)
[example failure 2021-08-27T08:29:17.3270133Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:1376)
[example failure 2021-08-27T08:29:17.3197583Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:1372)
[example failure 2021-08-27T08:29:17.3090243Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:1368)
[example failure 2021-08-27T08:29:17.3058682Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:1364)
[example failure 2021-08-27T08:29:17.2990099Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:1360)
[example failure 2021-08-27T08:29:17.2957558Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:1356)
[example failure 2021-08-27T08:29:17.2923832Z](https://github.com/apache/pulsar/runs/3441181143?check_suite_focus=true#step:9:1352)
[example failure 2021-08-27T00:49:56.1990094Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:1384)
[example failure 2021-08-27T00:49:56.1912279Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:1380)
[example failure 2021-08-27T00:49:56.1829820Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:1376)
[example failure 2021-08-27T00:49:56.1762335Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:1372)
[example failure 2021-08-27T00:49:56.1698593Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:1368)
[example failure 2021-08-27T00:49:56.1655338Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:1364)
[example failure 2021-08-27T00:49:56.1585336Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:1360)
[example failure 2021-08-27T00:49:56.1564596Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:1356)
[example failure 2021-08-27T00:49:56.1557065Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:1352)
[example failure 2021-08-27T00:49:56.1549813Z](https://github.com/apache/pulsar/runs/3438608157?check_suite_focus=true#step:9:1348)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

