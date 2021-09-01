        
Flaky-test: org.apache.pulsar.websocket.proxy.v1.V1_ProxyAuthenticationTest.unauthenticatedSocketTest
Number of failures: 3

org.apache.pulsar.websocket.proxy.v1.V1_ProxyAuthenticationTest is flaky. The unauthenticatedSocketTest test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T14:25:01.5628406Z](https://github.com/apache/pulsar/runs/3462661639?check_suite_focus=true#step:9:615)
[example failure 2021-08-27T07:52:14.7278452Z](https://github.com/apache/pulsar/runs/3440855061?check_suite_focus=true#step:9:628)
[example failure 2021-08-26T07:04:19.9928816Z](https://github.com/apache/pulsar/runs/3429892062?check_suite_focus=true#step:9:588)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

