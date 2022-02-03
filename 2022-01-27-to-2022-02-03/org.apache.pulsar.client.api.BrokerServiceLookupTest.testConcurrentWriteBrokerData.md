        
Flaky-test: org.apache.pulsar.client.api.BrokerServiceLookupTest.testConcurrentWriteBrokerData
Number of failures: 1

org.apache.pulsar.client.api.BrokerServiceLookupTest is flaky. The testConcurrentWriteBrokerData test method fails sporadically.

```
org.mockito.exceptions.misusing.WrongTypeOfReturnValue:

BrokerService$MockitoMock$1293626806 cannot be returned by getConfiguration()
getConfiguration() should return ServiceConfiguration
***
If you're unsure why you're getting above error read on.
Due to the nature of the syntax above problem might occur because:
1. This exception *might* occur in wrongly written multi-threaded tests.
   Please refer to Mockito FAQ on limitations of concurrency testing.
2. A spy is stubbed using when(spy.foo()).then() syntax. It is safer to stub spies -
   - with doReturn|Throw() family of methods. More in javadocs for Mockito.spy() method.

	at org.apache.pulsar.client.api.BrokerServiceLookupTest.testConcurrentWriteBrokerData(BrokerServiceLookupTest.java:211)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-02-02T13:54:52.6053907Z](https://github.com/apache/pulsar/runs/5037287825?check_suite_focus=true?check_suite_focus=true#step:9:692)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.mockito.exceptions.misusing.WrongTypeOfReturnValue:

BrokerService$MockitoMock$1293626806 cannot be returned by getConfiguration()
getConfiguration() should return ServiceConfiguration
***
If you're unsure why you're getting above error read on.
Due to the nature of the syntax above problem might occur because:
1. This exception *might* occur in wrongly written multi-threaded tests.
   Please refer to Mockito FAQ on limitations of concurrency testing.
2. A spy is stubbed using when(spy.foo()).then() syntax. It is safer to stub spies -
   - with doReturn|Throw() family of methods. More in javadocs for Mockito.spy() method.

	at org.apache.pulsar.client.api.BrokerServiceLookupTest.testConcurrentWriteBrokerData(BrokerServiceLookupTest.java:211)
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

