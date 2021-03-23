        
Flaky-test: org.apache.pulsar.broker.service.CurrentLedgerRolloverIfFullTest.testCurrentLedgerRolloverIfFull
Number of failures: 1

org.apache.pulsar.broker.service.CurrentLedgerRolloverIfFullTest is flaky. The testCurrentLedgerRolloverIfFull test method fails sporadically.

```
java.lang.RuntimeException: broker already started!
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.startBroker(MockedPulsarServiceBaseTest.java:251)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.init(MockedPulsarServiceBaseTest.java:177)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalSetup(MockedPulsarServiceBaseTest.java:109)
	at org.apache.pulsar.broker.service.BrokerTestBase.baseSetup(BrokerTestBase.java:43)
	at org.apache.pulsar.broker.service.CurrentLedgerRolloverIfFullTest.testCurrentLedgerRolloverIfFull(CurrentLedgerRolloverIfFullTest.java:45)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-17T05:00:07.8578279Z](https://github.com/apache/pulsar/runs/2127653400?check_suite_focus=true#step:9:655)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.RuntimeException: broker already started!
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.startBroker(MockedPulsarServiceBaseTest.java:251)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.init(MockedPulsarServiceBaseTest.java:177)
	at org.apache.pulsar.broker.auth.MockedPulsarServiceBaseTest.internalSetup(MockedPulsarServiceBaseTest.java:109)
	at org.apache.pulsar.broker.service.BrokerTestBase.baseSetup(BrokerTestBase.java:43)
	at org.apache.pulsar.broker.service.CurrentLedgerRolloverIfFullTest.testCurrentLedgerRolloverIfFull(CurrentLedgerRolloverIfFullTest.java:45)
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

