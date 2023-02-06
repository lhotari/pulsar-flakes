        
Flaky-test: org.apache.pulsar.broker.transaction.pendingack.PendingAckPersistentTest.testDeleteUselessLogDataWhenSubCursorMoved
Number of failures: 38

org.apache.pulsar.broker.transaction.pendingack.PendingAckPersistentTest is flaky. The testDeleteUselessLogDataWhenSubCursorMoved test method fails sporadically.

```
java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
	at java.base/java.util.Objects.checkIndex(Objects.java:359)
	at java.base/java.util.ArrayList.get(ArrayList.java:427)
	at org.apache.pulsar.broker.transaction.pendingack.PendingAckPersistentTest.testDeleteUselessLogDataWhenSubCursorMoved(PendingAckPersistentTest.java:449)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-06T10:21:20.4325039Z](https://github.com/apache/pulsar/actions/runs/4095494413/jobs/7075545639#step:9:927)  
[example failure 2023-02-05T14:32:05.3472208Z](https://github.com/apache/pulsar/actions/runs/4097007619/jobs/7065068697#step:9:927)  
[example failure 2023-02-05T06:22:56.5398723Z](https://github.com/apache/pulsar/actions/runs/4095273346/jobs/7062085428#step:9:927)  
[example failure 2023-02-04T18:05:05.3152628Z](https://github.com/apache/pulsar/actions/runs/4092732000/jobs/7057666446#step:9:946)  
[example failure 2023-02-04T04:08:33.3849018Z](https://github.com/apache/pulsar/actions/runs/4076016338/jobs/7052833156#step:9:948)  
[example failure 2023-02-04T03:10:32.9701430Z](https://github.com/apache/pulsar/actions/runs/4089625311/jobs/7052464856#step:9:948)  
[example failure 2023-02-04T00:02:45.3995352Z](https://github.com/apache/pulsar/actions/runs/4088820724/jobs/7050875412#step:9:948)  
[example failure 2023-02-04T00:00:26.5581322Z](https://github.com/apache/pulsar/actions/runs/4088804123/jobs/7050842767#step:9:946)  
[example failure 2023-02-03T22:54:38.1314386Z](https://github.com/apache/pulsar/actions/runs/4088378500/jobs/7050160241#step:9:929)  
[example failure 2023-02-03T21:56:27.5567115Z](https://github.com/apache/pulsar/actions/runs/4088105888/jobs/7049403463#step:9:929)  
[example failure 2023-02-03T15:00:21.1027020Z](https://github.com/apache/pulsar/actions/runs/4085189227/jobs/7042838377#step:9:967)  
[example failure 2023-02-03T13:02:14.3669969Z](https://github.com/apache/pulsar/actions/runs/4084265133/jobs/7040768534#step:9:948)  
[example failure 2023-02-03T12:57:53.8033692Z](https://github.com/apache/pulsar/actions/runs/4084258072/jobs/7040754134#step:9:948)  
[example failure 2023-02-03T11:20:44.2869338Z](https://github.com/apache/pulsar/actions/runs/4083557020/jobs/7039237038#step:9:929)  
[example failure 2023-02-03T09:25:50.9362374Z](https://github.com/apache/pulsar/actions/runs/4082697666/jobs/7037358539#step:9:967)  
[example failure 2023-02-03T09:22:17.7211781Z](https://github.com/apache/pulsar/actions/runs/4082669764/jobs/7037302972#step:9:948)  
[example failure 2023-02-03T08:41:29.7108975Z](https://github.com/apache/pulsar/actions/runs/4080739803/jobs/7036714224#step:9:948)  
[example failure 2023-02-03T07:30:19.3984523Z](https://github.com/apache/pulsar/actions/runs/4081947717/jobs/7035828659#step:9:948)  
[example failure 2023-02-03T06:37:32.3491516Z](https://github.com/apache/pulsar/actions/runs/4081522068/jobs/7035299641#step:9:929)  
[example failure 2023-02-03T05:03:24.5333609Z](https://github.com/apache/pulsar/actions/runs/4081203882/jobs/7034385174#step:9:929)  
[example failure 2023-02-03T03:25:55.4830187Z](https://github.com/apache/pulsar/actions/runs/4080739803/jobs/7033499918#step:9:953)  
[example failure 2023-02-02T19:58:58.3757349Z](https://github.com/apache/pulsar/actions/runs/4076880362/jobs/7027855755#step:9:929)  
[example failure 2023-02-02T18:27:26.3214576Z](https://github.com/apache/pulsar/actions/runs/4077347643/jobs/7026262481#step:9:967)  
[example failure 2023-02-02T13:44:11.4850046Z](https://github.com/apache/pulsar/actions/runs/4074944878/jobs/7020710170#step:9:929)  
[example failure 2023-02-02T12:45:44.3230240Z](https://github.com/apache/pulsar/actions/runs/4074476330/jobs/7019675054#step:9:929)  
[example failure 2023-02-02T11:13:33.0151925Z](https://github.com/apache/pulsar/actions/runs/4073789290/jobs/7018144141#step:9:967)  
[example failure 2023-02-02T10:37:55.9286666Z](https://github.com/apache/pulsar/actions/runs/4073474352/jobs/7017462811#step:9:967)  
[example failure 2023-02-02T10:23:22.9818797Z](https://github.com/apache/pulsar/actions/runs/4073367802/jobs/7017221754#step:9:948)  
[example failure 2023-02-02T09:57:54.5613309Z](https://github.com/apache/pulsar/actions/runs/4073163727/jobs/7016760710#step:9:948)  
[example failure 2023-02-02T09:16:17.1671605Z](https://github.com/apache/pulsar/actions/runs/4072853705/jobs/7016085784#step:9:929)  
[example failure 2023-02-02T08:21:35.9025752Z](https://github.com/apache/pulsar/actions/runs/4072430681/jobs/7015188660#step:9:929)  
[example failure 2023-02-02T07:57:34.5829889Z](https://github.com/apache/pulsar/actions/runs/4072298561/jobs/7014911546#step:9:950)  
[example failure 2023-02-02T07:22:31.9041104Z](https://github.com/apache/pulsar/actions/runs/4072071395/jobs/7014470524#step:9:917)  
[example failure 2023-02-02T05:54:29.8552870Z](https://github.com/apache/pulsar/actions/runs/4069198762/jobs/7013586039#step:9:933)  
[example failure 2023-02-02T04:27:14.0596433Z](https://github.com/apache/pulsar/actions/runs/4071192397/jobs/7012768344#step:9:931)  
[example failure 2023-02-02T04:02:25.6063587Z](https://github.com/apache/pulsar/actions/runs/4071061634/jobs/7012507778#step:9:950)  
[example failure 2023-02-02T03:06:01.4094954Z](https://github.com/apache/pulsar/actions/runs/4070796714/jobs/7012003670#step:9:916)  
[example failure 2023-02-01T18:30:08.2522148Z](https://github.com/apache/pulsar/actions/runs/4067388868/jobs/7004769615#step:9:931)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
	at java.base/java.util.Objects.checkIndex(Objects.java:359)
	at java.base/java.util.ArrayList.get(ArrayList.java:427)
	at org.apache.pulsar.broker.transaction.pendingack.PendingAckPersistentTest.testDeleteUselessLogDataWhenSubCursorMoved(PendingAckPersistentTest.java:449)
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

