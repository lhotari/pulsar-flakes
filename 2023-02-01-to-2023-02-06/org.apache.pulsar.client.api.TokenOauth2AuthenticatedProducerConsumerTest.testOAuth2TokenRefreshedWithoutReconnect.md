        
Flaky-test: org.apache.pulsar.client.api.TokenOauth2AuthenticatedProducerConsumerTest.testOAuth2TokenRefreshedWithoutReconnect
Number of failures: 1

org.apache.pulsar.client.api.TokenOauth2AuthenticatedProducerConsumerTest is flaky. The testOAuth2TokenRefreshedWithoutReconnect test method fails sporadically.

```
org.awaitility.core.ConditionTimeoutException: Condition was evaluated in 9 seconds 8 milliseconds which is earlier than expected minimum timeout 10 seconds
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:172)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.client.api.TokenOauth2AuthenticatedProducerConsumerTest.testOAuth2TokenRefreshedWithoutReconnect(TokenOauth2AuthenticatedProducerConsumerTest.java:219)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-04T00:08:15.8100068Z](https://github.com/apache/pulsar/actions/runs/4088820717/jobs/7050986329#step:11:636)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.awaitility.core.ConditionTimeoutException: Condition was evaluated in 9 seconds 8 milliseconds which is earlier than expected minimum timeout 10 seconds
	at org.awaitility.core.ConditionAwaiter.await(ConditionAwaiter.java:172)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:119)
	at org.awaitility.core.AssertionCondition.await(AssertionCondition.java:31)
	at org.awaitility.core.ConditionFactory.until(ConditionFactory.java:985)
	at org.awaitility.core.ConditionFactory.untilAsserted(ConditionFactory.java:769)
	at org.apache.pulsar.client.api.TokenOauth2AuthenticatedProducerConsumerTest.testOAuth2TokenRefreshedWithoutReconnect(TokenOauth2AuthenticatedProducerConsumerTest.java:219)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

