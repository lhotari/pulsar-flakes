        
Flaky-test: org.apache.pulsar.broker.service.persistent.PersistentDispatcherFailoverConsumerStreamingDispatcherTest.shutdown
Number of failures: 1

org.apache.pulsar.broker.service.persistent.PersistentDispatcherFailoverConsumerStreamingDispatcherTest is flaky. The shutdown test method fails sporadically.

```
org.apache.pulsar.broker.PulsarServerException:
org.mockito.exceptions.misusing.WrongTypeOfReturnValue:
BrokerService cannot be returned by getConfiguration()
getConfiguration() should return ServiceConfiguration
***
If you're unsure why you're getting above error read on.
Due to the nature of the syntax above problem might occur because:
1. This exception *might* occur in wrongly written multi-threaded tests.
   Please refer to Mockito FAQ on limitations of concurrency testing.
2. A spy is stubbed using when(spy.foo()).then() syntax. It is safer to stub spies -
   - with doReturn|Throw() family of methods. More in javadocs for Mockito.spy() method.

	at org.apache.pulsar.broker.service.BrokerService.close(BrokerService.java:696)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-09T14:19:48.8615959Z](https://github.com/apache/pulsar/runs/6814328645?check_suite_focus=true#step:10:653)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.broker.PulsarServerException:
org.mockito.exceptions.misusing.WrongTypeOfReturnValue:
BrokerService cannot be returned by getConfiguration()
getConfiguration() should return ServiceConfiguration
***
If you're unsure why you're getting above error read on.
Due to the nature of the syntax above problem might occur because:
1. This exception *might* occur in wrongly written multi-threaded tests.
   Please refer to Mockito FAQ on limitations of concurrency testing.
2. A spy is stubbed using when(spy.foo()).then() syntax. It is safer to stub spies -
   - with doReturn|Throw() family of methods. More in javadocs for Mockito.spy() method.

	at org.apache.pulsar.broker.service.BrokerService.close(BrokerService.java:696)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)
Caused by: org.mockito.exceptions.misusing.WrongTypeOfReturnValue:
BrokerService cannot be returned by getConfiguration()
getConfiguration() should return ServiceConfiguration
***
If you're unsure why you're getting above error read on.
Due to the nature of the syntax above problem might occur because:
1. This exception *might* occur in wrongly written multi-threaded tests.
   Please refer to Mockito FAQ on limitations of concurrency testing.
2. A spy is stubbed using when(spy.foo()).then() syntax. It is safer to stub spies -
   - with doReturn|Throw() family of methods. More in javadocs for Mockito.spy() method.

	at org.apache.pulsar.broker.PulsarService.getConfiguration(PulsarService.java:608)
	at org.apache.pulsar.broker.service.BrokerService.shutdownEventLoopGracefully(BrokerService.java:857)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.apache.pulsar.broker.service.BrokerService.shutdownEventLoopGracefully(BrokerService.java:857)
	at org.apache.pulsar.broker.service.BrokerService.closeAsync(BrokerService.java:768)
	at java.base/java.lang.invoke.MethodHandle.invokeWithArguments(MethodHandle.java:732)
	at org.apache.pulsar.broker.service.BrokerService.closeAsync(BrokerService.java:731)
	at org.apache.pulsar.broker.service.BrokerService.close(BrokerService.java:691)
	... 2 more

</pre></code>
</details>

