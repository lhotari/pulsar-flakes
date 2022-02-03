        
Flaky-test: org.apache.pulsar.broker.service.BrokerBkEnsemblesTests.testCrashBrokerWithoutCursorLedgerLeak
Number of failures: 3

org.apache.pulsar.broker.service.BrokerBkEnsemblesTests is flaky. The testCrashBrokerWithoutCursorLedgerLeak test method fails sporadically.

```
java.lang.AssertionError:
expected [null] but found [108,121,1643374055222,1643374055372,2,0,0,0,247,0,108
]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.broker.service.BrokerBkEnsemblesTests.testCrashBrokerWithoutCursorLedgerLeak(BrokerBkEnsemblesTests.java:153)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-28T12:47:37.6375536Z](https://github.com/apache/pulsar/runs/4980343698?check_suite_focus=true?check_suite_focus=true#step:9:398)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError:
expected [null] but found [108,121,1643374055222,1643374055372,2,0,0,0,247,0,108
]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.broker.service.BrokerBkEnsemblesTests.testCrashBrokerWithoutCursorLedgerLeak(BrokerBkEnsemblesTests.java:153)
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

</pre></code>
</details>

```
java.lang.AssertionError:
expected [null] but found [108,121,1643399008184,1643399008319,2,0,0,0,247,0,108
]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.broker.service.BrokerBkEnsemblesTests.testCrashBrokerWithoutCursorLedgerLeak(BrokerBkEnsemblesTests.java:153)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-28T19:43:30.6320808Z](https://github.com/apache/pulsar/runs/4985338436?check_suite_focus=true?check_suite_focus=true#step:9:4334)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError:
expected [null] but found [108,121,1643399008184,1643399008319,2,0,0,0,247,0,108
]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.broker.service.BrokerBkEnsemblesTests.testCrashBrokerWithoutCursorLedgerLeak(BrokerBkEnsemblesTests.java:153)
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

</pre></code>
</details>

```
java.lang.AssertionError:
expected [null] but found [108,125,1643285443279,1643285443519,2,0,0,0,245,0,108
]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.broker.service.BrokerBkEnsemblesTests.testCrashBrokerWithoutCursorLedgerLeak(BrokerBkEnsemblesTests.java:153)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-01-27T12:10:45.7539804Z](https://github.com/apache/pulsar/runs/4965511644?check_suite_focus=true?check_suite_focus=true#step:9:398)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError:
expected [null] but found [108,125,1643285443279,1643285443519,2,0,0,0,245,0,108
]
	at org.testng.Assert.fail(Assert.java:99)
	at org.testng.Assert.failNotSame(Assert.java:1033)
	at org.testng.Assert.assertNull(Assert.java:965)
	at org.testng.Assert.assertNull(Assert.java:953)
	at org.apache.pulsar.broker.service.BrokerBkEnsemblesTests.testCrashBrokerWithoutCursorLedgerLeak(BrokerBkEnsemblesTests.java:153)
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

</pre></code>
</details>

