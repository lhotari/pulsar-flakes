        
Flaky-test: org.apache.pulsar.websocket.proxy.ProxyConfigurationTest.configTest
Number of failures: 2

org.apache.pulsar.websocket.proxy.ProxyConfigurationTest is flaky. The configTest test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T14:25:01.5016162Z](https://github.com/apache/pulsar/runs/3462661639?check_suite_focus=true#step:9:597)
[example failure 2021-08-27T07:52:14.5178165Z](https://github.com/apache/pulsar/runs/3440855061?check_suite_focus=true#step:9:610)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

