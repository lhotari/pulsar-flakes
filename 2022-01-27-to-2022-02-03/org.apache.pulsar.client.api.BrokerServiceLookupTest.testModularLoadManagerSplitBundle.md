        
Flaky-test: org.apache.pulsar.client.api.BrokerServiceLookupTest.testModularLoadManagerSplitBundle
Number of failures: 21

org.apache.pulsar.client.api.BrokerServiceLookupTest is flaky. The testModularLoadManagerSplitBundle test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.client.api.BrokerServiceLookupTest that uses org.apache.pulsar.broker.PulsarService, org.apache.pulsar.broker.PulsarServiceorg.apache.pulsar.common.naming.TopicName, org.apache.pulsar.common.naming.TopicNameorg.apache.pulsar.common.naming.NamespaceBundle did not expect [my-property/my-ns/0x00000000_0xffffffff] but found [my-property/my-ns/0x00000000_0xffffffff] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.client.api.BrokerServiceLookupTest.testModularLoadManagerSplitBundle(BrokerServiceLookupTest.java:741)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-02-02T21:34:40.1145658Z](https://github.com/apache/pulsar/runs/5043311550?check_suite_focus=true?check_suite_focus=true#step:9:696)  
[example failure 2022-02-02T13:12:22.8486499Z](https://github.com/apache/pulsar/runs/5036754876?check_suite_focus=true?check_suite_focus=true#step:9:696)  
[example failure 2022-01-30T11:30:51.2394877Z](https://github.com/apache/pulsar/runs/4996340804?check_suite_focus=true?check_suite_focus=true#step:9:2577)  
[example failure 2022-01-30T11:14:46.8380839Z](https://github.com/apache/pulsar/runs/4996340804?check_suite_focus=true?check_suite_focus=true#step:9:696)  
[example failure 2022-01-29T08:15:40.7395787Z](https://github.com/apache/pulsar/runs/4990091307?check_suite_focus=true?check_suite_focus=true#step:9:696)  
[example failure 2022-01-29T07:35:40.7291943Z](https://github.com/apache/pulsar/runs/4989955736?check_suite_focus=true?check_suite_focus=true#step:9:696)  
[example failure 2022-01-29T05:54:01.0408213Z](https://github.com/apache/pulsar/runs/4989526422?check_suite_focus=true?check_suite_focus=true#step:9:1603)  
[example failure 2022-01-29T05:45:59.0254072Z](https://github.com/apache/pulsar/runs/4989526422?check_suite_focus=true?check_suite_focus=true#step:9:696)  
[example failure 2022-01-29T04:33:01.6422025Z](https://github.com/apache/pulsar/runs/4989247387?check_suite_focus=true?check_suite_focus=true#step:9:696)  
[example failure 2022-01-29T02:19:31.8758323Z](https://github.com/apache/pulsar/runs/4988541875?check_suite_focus=true?check_suite_focus=true#step:9:2480)  
[example failure 2022-01-29T02:10:57.6870990Z](https://github.com/apache/pulsar/runs/4988541875?check_suite_focus=true?check_suite_focus=true#step:9:1603)  
[example failure 2022-01-29T02:02:31.9467895Z](https://github.com/apache/pulsar/runs/4988541875?check_suite_focus=true?check_suite_focus=true#step:9:696)  
[example failure 2022-01-28T15:02:31.4447971Z](https://github.com/apache/pulsar/runs/4982125668?check_suite_focus=true?check_suite_focus=true#step:9:694)  
[example failure 2022-01-28T12:36:11.5858799Z](https://github.com/apache/pulsar/runs/4980324943?check_suite_focus=true?check_suite_focus=true#step:9:1675)  
[example failure 2022-01-28T12:28:41.8739151Z](https://github.com/apache/pulsar/runs/4980324943?check_suite_focus=true?check_suite_focus=true#step:9:694)  
[example failure 2022-01-27T12:01:43.9274821Z](https://github.com/apache/pulsar/runs/4965379069?check_suite_focus=true?check_suite_focus=true#step:9:690)  
[example failure 2022-01-27T11:30:17.5526067Z](https://github.com/apache/pulsar/runs/4964582918?check_suite_focus=true?check_suite_focus=true#step:9:1591)  
[example failure 2022-01-27T11:21:40.6579047Z](https://github.com/apache/pulsar/runs/4964582918?check_suite_focus=true?check_suite_focus=true#step:9:690)  
[example failure 2022-01-27T10:12:22.1195195Z](https://github.com/apache/pulsar/runs/4964191908?check_suite_focus=true?check_suite_focus=true#step:9:2462)  
[example failure 2022-01-27T10:05:24.7002426Z](https://github.com/apache/pulsar/runs/4964191908?check_suite_focus=true?check_suite_focus=true#step:9:1591)  
[example failure 2022-01-27T09:58:21.2149315Z](https://github.com/apache/pulsar/runs/4964191908?check_suite_focus=true?check_suite_focus=true#step:9:690)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Assertion condition defined as a lambda expression in org.apache.pulsar.client.api.BrokerServiceLookupTest that uses org.apache.pulsar.broker.PulsarService, org.apache.pulsar.broker.PulsarServiceorg.apache.pulsar.common.naming.TopicName, org.apache.pulsar.common.naming.TopicNameorg.apache.pulsar.common.naming.NamespaceBundle did not expect [my-property/my-ns/0x00000000_0xffffffff] but found [my-property/my-ns/0x00000000_0xffffffff] within 10 seconds.
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:165)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:895)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:679)
	at org.apache.pulsar.client.api.BrokerServiceLookupTest.testModularLoadManagerSplitBundle(BrokerServiceLookupTest.java:741)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.lang.AssertionError: did not expect [my-property/my-ns/0x00000000_0xffffffff] but found [my-property/my-ns/0x00000000_0xffffffff]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failEquals(Assert.java:1041)
	at org.testng.Assert.assertNotEqualsImpl(Assert.java:147)
	at org.testng.Assert.assertNotEquals(Assert.java:1531)
	at org.testng.Assert.assertNotEquals(Assert.java:1535)
	at org.apache.pulsar.client.api.BrokerServiceLookupTest.lambda$testModularLoadManagerSplitBundle$5(BrokerServiceLookupTest.java:742)
	at org.awaitility.core.AssertionCondition.lambda$new$0(AssertionCondition.java:53)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:222)
	at org.awaitility.core.ConditionAwaiter$ConditionPoller.call(ConditionAwaiter.java:209)
	... 4 more

</pre></code>
</details>

