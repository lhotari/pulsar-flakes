        
Flaky-test: org.apache.pulsar.io.rabbitmq.sink.RabbitMQSinkTest.TestOpenAndWriteSink
Number of failures: 6

org.apache.pulsar.io.rabbitmq.sink.RabbitMQSinkTest is flaky. The TestOpenAndWriteSink test method fails sporadically.

```
java.net.ConnectException: Connection refused (Connection refused)
	at java.net.PlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:607)
	at com.rabbitmq.client.impl.SocketFrameHandlerFactory.create(SocketFrameHandlerFactory.java:60)
	at com.rabbitmq.client.impl.recovery.RecoveryAwareAMQConnectionFactory.newConnection(RecoveryAwareAMQConnectionFactory.java:62)
	at com.rabbitmq.client.impl.recovery.AutorecoveringConnection.init(AutorecoveringConnection.java:99)
	at com.rabbitmq.client.ConnectionFactory.newConnection(ConnectionFactory.java:948)
	at com.rabbitmq.client.ConnectionFactory.newConnection(ConnectionFactory.java:907)
	at com.rabbitmq.client.ConnectionFactory.newConnection(ConnectionFactory.java:1034)
	at org.apache.pulsar.io.rabbitmq.RabbitMQSink.open(RabbitMQSink.java:61)
	at org.apache.pulsar.io.rabbitmq.sink.RabbitMQSinkTest.TestOpenAndWriteSink(RabbitMQSinkTest.java:68)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T04:37:53.0767481Z](https://github.com/apache/pulsar/runs/3890534270?check_suite_focus=true?check_suite_focus=true#step:6:8092)
[example failure 2021-10-14T02:13:14.7601757Z](https://github.com/apache/pulsar/runs/3889715492?check_suite_focus=true?check_suite_focus=true#step:6:8092)
[example failure 2021-10-14T01:47:44.7821929Z](https://github.com/apache/pulsar/runs/3889473970?check_suite_focus=true?check_suite_focus=true#step:6:19175)
[example failure 2021-10-14T01:32:58.9750975Z](https://github.com/apache/pulsar/runs/3889473970?check_suite_focus=true?check_suite_focus=true#step:6:11317)
[example failure 2021-10-13T15:26:55.6587347Z](https://github.com/apache/pulsar/runs/3884026927?check_suite_focus=true?check_suite_focus=true#step:6:18147)
[example failure 2021-10-13T14:33:07.7922515Z](https://github.com/apache/pulsar/runs/3883077518?check_suite_focus=true?check_suite_focus=true#step:6:24524)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.net.ConnectException: Connection refused (Connection refused)
	at java.net.PlainSocketImpl.socketConnect(Native Method)
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350)
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206)
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188)
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392)
	at java.net.Socket.connect(Socket.java:607)
	at com.rabbitmq.client.impl.SocketFrameHandlerFactory.create(SocketFrameHandlerFactory.java:60)
	at com.rabbitmq.client.impl.recovery.RecoveryAwareAMQConnectionFactory.newConnection(RecoveryAwareAMQConnectionFactory.java:62)
	at com.rabbitmq.client.impl.recovery.AutorecoveringConnection.init(AutorecoveringConnection.java:99)
	at com.rabbitmq.client.ConnectionFactory.newConnection(ConnectionFactory.java:948)
	at com.rabbitmq.client.ConnectionFactory.newConnection(ConnectionFactory.java:907)
	at com.rabbitmq.client.ConnectionFactory.newConnection(ConnectionFactory.java:1034)
	at org.apache.pulsar.io.rabbitmq.RabbitMQSink.open(RabbitMQSink.java:61)
	at org.apache.pulsar.io.rabbitmq.sink.RabbitMQSinkTest.TestOpenAndWriteSink(RabbitMQSinkTest.java:68)
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

