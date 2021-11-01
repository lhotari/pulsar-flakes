        
Flaky-test: org.apache.pulsar.broker.service.PeerReplicatorTest.testPeerClusterInReplicationClusterListChange
Number of failures: 1

org.apache.pulsar.broker.service.PeerReplicatorTest is flaky. The testPeerClusterInReplicationClusterListChange test method fails sporadically.

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: 2 lookup request timedout after ms 30000
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:916)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:94)
	at org.apache.pulsar.broker.service.PeerReplicatorTest.testPeerClusterInReplicationClusterListChange(PeerReplicatorTest.java:215)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-13T13:58:54.7793516Z](https://github.com/apache/pulsar/runs/3883077769?check_suite_focus=true?check_suite_focus=true#step:12:602)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: 2 lookup request timedout after ms 30000
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:916)
	at org.apache.pulsar.client.impl.ProducerBuilderImpl.create(ProducerBuilderImpl.java:94)
	at org.apache.pulsar.broker.service.PeerReplicatorTest.testPeerClusterInReplicationClusterListChange(PeerReplicatorTest.java:215)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

