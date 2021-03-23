        
Flaky-test: org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName
Number of failures: 18

org.apache.pulsar.client.api.DeadLetterTopicTest is flaky. The testDeadLetterTopicByCustomTopicName test method fails sporadically.

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@44f193ab]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-20T07:57:37.5801738Z](https://github.com/apache/pulsar/runs/2154437815?check_suite_focus=true#step:9:175)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@44f193ab]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
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

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@5a3c9070]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-22T05:11:52.1430911Z](https://github.com/apache/pulsar/runs/2162901943?check_suite_focus=true#step:8:950)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@5a3c9070]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
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

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@4f1eefb0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-17T06:08:35.3855147Z](https://github.com/apache/pulsar/runs/2127869324?check_suite_focus=true#step:9:551)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@4f1eefb0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
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

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@7c30bae7]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-22T17:27:59.8624234Z](https://github.com/apache/pulsar/runs/2167097018?check_suite_focus=true#step:8:950)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@7c30bae7]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
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

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@4492c08c]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-23T03:04:24.1939678Z](https://github.com/apache/pulsar/runs/2171516877?check_suite_focus=true#step:8:924)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@4492c08c]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
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

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@5f20f405]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-20T01:03:54.2977930Z](https://github.com/apache/pulsar/runs/2152924540?check_suite_focus=true#step:9:931)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@5f20f405]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
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

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@43f64366]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-19T10:17:18.0339612Z](https://github.com/apache/pulsar/runs/2146721748?check_suite_focus=true#step:9:175)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@43f64366]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
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

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@27955b5]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-21T06:54:02.0265579Z](https://github.com/apache/pulsar/runs/2158568327?check_suite_focus=true#step:9:195)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@27955b5]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
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

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@17ac7552]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-20T10:27:17.9469611Z](https://github.com/apache/pulsar/runs/2154861769?check_suite_focus=true#step:9:175)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@17ac7552]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
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

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@44586173]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-20T10:07:19.8976580Z](https://github.com/apache/pulsar/runs/2154797882?check_suite_focus=true#step:9:175)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@44586173]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
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

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@5d3f7c94]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-17T05:57:03.1890979Z](https://github.com/apache/pulsar/runs/2127869324?check_suite_focus=true#step:9:336)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@5d3f7c94]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
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

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@280e605a]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-20T18:54:39.4265801Z](https://github.com/apache/pulsar/runs/2156478842?check_suite_focus=true#step:9:175)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@280e605a]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
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

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@180aef52]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-20T13:16:30.9010267Z](https://github.com/apache/pulsar/runs/2155375988?check_suite_focus=true#step:9:175)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@180aef52]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
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

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@689b45be]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-17T03:53:42.3703870Z](https://github.com/apache/pulsar/runs/2127458203?check_suite_focus=true#step:9:336)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@689b45be]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
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

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@785bedc5]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-19T22:23:37.3229038Z](https://github.com/apache/pulsar/runs/2151942105?check_suite_focus=true#step:9:927)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@785bedc5]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
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

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@31f962e0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-22T16:29:58.1349929Z](https://github.com/apache/pulsar/runs/2167097018?check_suite_focus=true#step:8:175)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@31f962e0]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
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

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@8f9c725]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-23T01:19:48.2428709Z](https://github.com/apache/pulsar/runs/2171252743?check_suite_focus=true#step:8:175)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@8f9c725]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
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

```
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@6c184aaa]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-20T10:52:57.7668419Z](https://github.com/apache/pulsar/runs/2154797882?check_suite_focus=true#step:9:1007)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError: expected [null] but found [org.apache.pulsar.client.impl.MessageImpl@6c184aaa]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.client.api.DeadLetterTopicTest.testDeadLetterTopicByCustomTopicName(DeadLetterTopicTest.java:398)
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

