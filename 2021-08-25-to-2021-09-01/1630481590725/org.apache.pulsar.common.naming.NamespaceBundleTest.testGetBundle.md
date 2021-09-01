        
Flaky-test: org.apache.pulsar.common.naming.NamespaceBundleTest.testGetBundle
Number of failures: 3

org.apache.pulsar.common.naming.NamespaceBundleTest is flaky. The testGetBundle test method fails sporadically.

```
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-30T14:25:03.0511642Z](https://github.com/apache/pulsar/runs/3462661639?check_suite_focus=true#step:9:849)
[example failure 2021-08-27T07:52:17.5966257Z](https://github.com/apache/pulsar/runs/3440855061?check_suite_focus=true#step:9:862)
[example failure 2021-08-26T07:04:21.2473683Z](https://github.com/apache/pulsar/runs/3429892062?check_suite_focus=true#step:9:822)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.FailFastNotifier$FailFastSkipException: Skipped after failure since testFailFast system property is set.
	at org.apache.pulsar.tests.FailFastNotifier.beforeInvocation(FailFastNotifier.java:88)

</pre></code>
</details>

