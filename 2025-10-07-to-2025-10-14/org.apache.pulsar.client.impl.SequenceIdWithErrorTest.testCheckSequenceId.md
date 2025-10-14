        
Flaky-test: org.apache.pulsar.client.impl.SequenceIdWithErrorTest.testCheckSequenceId
Number of failures: 13

org.apache.pulsar.client.impl.SequenceIdWithErrorTest is flaky. The testCheckSequenceId test method fails sporadically.

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic prop/my-test/my-topic within given timeout : createdAt 30.001 seconds ago, firstSentAt 30.0 seconds ago, lastSentAt 30.0 seconds ago, retryCount 1
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1072)
	at org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:114)
	at org.apache.pulsar.client.impl.ProducerBase.send(ProducerBase.java:61)
	at org.apache.pulsar.client.impl.SequenceIdWithErrorTest.testCheckSequenceId(SequenceIdWithErrorTest.java:74)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-08T02:41:39.6548730Z](https://github.com/apache/pulsar/actions/runs/18331835227/job/52208082089#step:9:1381)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic prop/my-test/my-topic within given timeout : createdAt 30.001 seconds ago, firstSentAt 30.0 seconds ago, lastSentAt 30.0 seconds ago, retryCount 1
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1072)
	at org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:114)
	at org.apache.pulsar.client.impl.ProducerBase.send(ProducerBase.java:61)
	at org.apache.pulsar.client.impl.SequenceIdWithErrorTest.testCheckSequenceId(SequenceIdWithErrorTest.java:74)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic prop/my-test/my-topic within given timeout : createdAt 30.002 seconds ago, firstSentAt 30.002 seconds ago, lastSentAt 30.002 seconds ago, retryCount 1
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1072)
	at org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:114)
	at org.apache.pulsar.client.impl.ProducerBase.send(ProducerBase.java:61)
	at org.apache.pulsar.client.impl.SequenceIdWithErrorTest.testCheckSequenceId(SequenceIdWithErrorTest.java:74)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-09T16:04:28.3881299Z](https://github.com/apache/pulsar/actions/runs/18362818376/job/52367584213#step:9:1383)  
[example failure 2025-10-08T16:04:04.5263713Z](https://github.com/apache/pulsar/actions/runs/18350345896/job/52268328837#step:9:1381)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic prop/my-test/my-topic within given timeout : createdAt 30.002 seconds ago, firstSentAt 30.002 seconds ago, lastSentAt 30.002 seconds ago, retryCount 1
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1072)
	at org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:114)
	at org.apache.pulsar.client.impl.ProducerBase.send(ProducerBase.java:61)
	at org.apache.pulsar.client.impl.SequenceIdWithErrorTest.testCheckSequenceId(SequenceIdWithErrorTest.java:74)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic prop/my-test/my-topic within given timeout : createdAt 30.001 seconds ago, firstSentAt 30.001 seconds ago, lastSentAt 30.001 seconds ago, retryCount 1
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1072)
	at org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:114)
	at org.apache.pulsar.client.impl.ProducerBase.send(ProducerBase.java:61)
	at org.apache.pulsar.client.impl.SequenceIdWithErrorTest.testCheckSequenceId(SequenceIdWithErrorTest.java:74)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-08T07:57:08.8275928Z](https://github.com/apache/pulsar/actions/runs/18337461630/job/52224640113#step:9:1381)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic prop/my-test/my-topic within given timeout : createdAt 30.001 seconds ago, firstSentAt 30.001 seconds ago, lastSentAt 30.001 seconds ago, retryCount 1
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1072)
	at org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:114)
	at org.apache.pulsar.client.impl.ProducerBase.send(ProducerBase.java:61)
	at org.apache.pulsar.client.impl.SequenceIdWithErrorTest.testCheckSequenceId(SequenceIdWithErrorTest.java:74)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic prop/my-test/my-topic within given timeout : createdAt 30.002 seconds ago, firstSentAt 30.002 seconds ago, lastSentAt 30.002 seconds ago, retryCount 1
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1072)
	at org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:118)
	at org.apache.pulsar.client.impl.ProducerBase.send(ProducerBase.java:61)
	at org.apache.pulsar.client.impl.SequenceIdWithErrorTest.testCheckSequenceId(SequenceIdWithErrorTest.java:74)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-10T06:58:39.6129571Z](https://github.com/apache/pulsar/actions/runs/18398680814/job/52422910622#step:9:1383)  
[example failure 2025-10-09T08:05:33.0874907Z](https://github.com/apache/pulsar/actions/runs/18369320174/job/52328588761#step:9:1381)  
[example failure 2025-10-09T02:16:21.7275218Z](https://github.com/apache/pulsar/actions/runs/18363177274/job/52310700632#step:9:1381)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic prop/my-test/my-topic within given timeout : createdAt 30.002 seconds ago, firstSentAt 30.002 seconds ago, lastSentAt 30.002 seconds ago, retryCount 1
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1072)
	at org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:118)
	at org.apache.pulsar.client.impl.ProducerBase.send(ProducerBase.java:61)
	at org.apache.pulsar.client.impl.SequenceIdWithErrorTest.testCheckSequenceId(SequenceIdWithErrorTest.java:74)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic prop/my-test/my-topic within given timeout : createdAt 30.002 seconds ago, firstSentAt 30.001 seconds ago, lastSentAt 30.001 seconds ago, retryCount 1
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1072)
	at org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:114)
	at org.apache.pulsar.client.impl.ProducerBase.send(ProducerBase.java:61)
	at org.apache.pulsar.client.impl.SequenceIdWithErrorTest.testCheckSequenceId(SequenceIdWithErrorTest.java:74)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-08T13:33:50.6807355Z](https://github.com/apache/pulsar/actions/runs/18344190289/job/52252666650#step:9:1381)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic prop/my-test/my-topic within given timeout : createdAt 30.002 seconds ago, firstSentAt 30.001 seconds ago, lastSentAt 30.001 seconds ago, retryCount 1
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1072)
	at org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:114)
	at org.apache.pulsar.client.impl.ProducerBase.send(ProducerBase.java:61)
	at org.apache.pulsar.client.impl.SequenceIdWithErrorTest.testCheckSequenceId(SequenceIdWithErrorTest.java:74)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic prop/my-test/my-topic within given timeout : createdAt 30.002 seconds ago, firstSentAt 30.001 seconds ago, lastSentAt 30.001 seconds ago, retryCount 1
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1072)
	at org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:118)
	at org.apache.pulsar.client.impl.ProducerBase.send(ProducerBase.java:61)
	at org.apache.pulsar.client.impl.SequenceIdWithErrorTest.testCheckSequenceId(SequenceIdWithErrorTest.java:74)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-13T16:54:31.1785175Z](https://github.com/apache/pulsar/actions/runs/18472389946/job/52629162697#step:9:1444)  
[example failure 2025-10-13T11:24:41.4375013Z](https://github.com/apache/pulsar/actions/runs/18463783819/job/52600985886#step:9:1383)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic prop/my-test/my-topic within given timeout : createdAt 30.002 seconds ago, firstSentAt 30.001 seconds ago, lastSentAt 30.001 seconds ago, retryCount 1
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1072)
	at org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:118)
	at org.apache.pulsar.client.impl.ProducerBase.send(ProducerBase.java:61)
	at org.apache.pulsar.client.impl.SequenceIdWithErrorTest.testCheckSequenceId(SequenceIdWithErrorTest.java:74)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic prop/my-test/my-topic within given timeout : createdAt 30.001 seconds ago, firstSentAt 30.001 seconds ago, lastSentAt 30.001 seconds ago, retryCount 1
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1072)
	at org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:118)
	at org.apache.pulsar.client.impl.ProducerBase.send(ProducerBase.java:61)
	at org.apache.pulsar.client.impl.SequenceIdWithErrorTest.testCheckSequenceId(SequenceIdWithErrorTest.java:74)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-09T16:59:01.8784174Z](https://github.com/apache/pulsar/actions/runs/18382798363/job/52373487854#step:9:1381)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic prop/my-test/my-topic within given timeout : createdAt 30.001 seconds ago, firstSentAt 30.001 seconds ago, lastSentAt 30.001 seconds ago, retryCount 1
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1072)
	at org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:118)
	at org.apache.pulsar.client.impl.ProducerBase.send(ProducerBase.java:61)
	at org.apache.pulsar.client.impl.SequenceIdWithErrorTest.testCheckSequenceId(SequenceIdWithErrorTest.java:74)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic prop/my-test/my-topic within given timeout : createdAt 30.003 seconds ago, firstSentAt 30.002 seconds ago, lastSentAt 30.002 seconds ago, retryCount 1
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1072)
	at org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:114)
	at org.apache.pulsar.client.impl.ProducerBase.send(ProducerBase.java:61)
	at org.apache.pulsar.client.impl.SequenceIdWithErrorTest.testCheckSequenceId(SequenceIdWithErrorTest.java:74)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-07T17:58:36.7673302Z](https://github.com/apache/pulsar/actions/runs/18321028965/job/52174596692#step:9:1381)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic prop/my-test/my-topic within given timeout : createdAt 30.003 seconds ago, firstSentAt 30.002 seconds ago, lastSentAt 30.002 seconds ago, retryCount 1
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1072)
	at org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:114)
	at org.apache.pulsar.client.impl.ProducerBase.send(ProducerBase.java:61)
	at org.apache.pulsar.client.impl.SequenceIdWithErrorTest.testCheckSequenceId(SequenceIdWithErrorTest.java:74)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

</pre></code>
</details>

```
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic prop/my-test/my-topic within given timeout : createdAt 30.0 seconds ago, firstSentAt 30.0 seconds ago, lastSentAt 30.0 seconds ago, retryCount 1
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1072)
	at org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:118)
	at org.apache.pulsar.client.impl.ProducerBase.send(ProducerBase.java:61)
	at org.apache.pulsar.client.impl.SequenceIdWithErrorTest.testCheckSequenceId(SequenceIdWithErrorTest.java:74)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2025-10-10T09:12:09.9034305Z](https://github.com/apache/pulsar/actions/runs/18398680814/job/52432058597#step:9:1383)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.api.PulsarClientException$TimeoutException: The producer usc-0-0 can not send message to the topic prop/my-test/my-topic within given timeout : createdAt 30.0 seconds ago, firstSentAt 30.0 seconds ago, lastSentAt 30.0 seconds ago, retryCount 1
	at org.apache.pulsar.client.api.PulsarClientException.unwrap(PulsarClientException.java:1072)
	at org.apache.pulsar.client.impl.TypedMessageBuilderImpl.send(TypedMessageBuilderImpl.java:118)
	at org.apache.pulsar.client.impl.ProducerBase.send(ProducerBase.java:61)
	at org.apache.pulsar.client.impl.SequenceIdWithErrorTest.testCheckSequenceId(SequenceIdWithErrorTest.java:74)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:317)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1144)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:642)
	at java.base/java.lang.Thread.run(Thread.java:1583)

</pre></code>
</details>

