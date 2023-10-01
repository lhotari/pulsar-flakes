        
Flaky-test: org.apache.pulsar.metadata.bookkeeper.EndToEndTest.testBasic
Number of failures: 2

org.apache.pulsar.metadata.bookkeeper.EndToEndTest is flaky. The testBasic test method fails sporadically.

```
java.lang.IllegalArgumentException: Unknown backend metadata-store
	at org.apache.bookkeeper.meta.MetadataDrivers.getBookieDriver(MetadataDrivers.java:281)
	at org.apache.bookkeeper.meta.MetadataDrivers.getBookieDriver(MetadataDrivers.java:304)
	at org.apache.bookkeeper.bookie.BookieResources.createMetadataDriver(BookieResources.java:56)
	at org.apache.bookkeeper.server.EmbeddedServer$Builder.build(EmbeddedServer.java:306)
	at org.apache.bookkeeper.server.Main.buildBookieServer(Main.java:277)
	at org.apache.pulsar.metadata.bookkeeper.BKCluster.startBookie(BKCluster.java:318)
	at org.apache.pulsar.metadata.bookkeeper.BKCluster.startNewBookie(BKCluster.java:302)
	at org.apache.pulsar.metadata.bookkeeper.BKCluster.startBKCluster(BKCluster.java:188)
	at org.apache.pulsar.metadata.bookkeeper.BKCluster.<init>(BKCluster.java:141)
	at org.apache.pulsar.metadata.bookkeeper.BKCluster$BKClusterConf.build(BKCluster.java:118)
	at org.apache.pulsar.metadata.bookkeeper.EndToEndTest.testBasic(EndToEndTest.java:46)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-09-25T12:48:26.0068335Z](https://github.com/apache/pulsar/actions/runs/6298312472/job/17100451833#step:9:1845)  
[example failure 2023-09-25T11:10:56.6117908Z](https://github.com/apache/pulsar/actions/runs/6298312472/job/17097394001#step:10:1832)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.IllegalArgumentException: Unknown backend metadata-store
	at org.apache.bookkeeper.meta.MetadataDrivers.getBookieDriver(MetadataDrivers.java:281)
	at org.apache.bookkeeper.meta.MetadataDrivers.getBookieDriver(MetadataDrivers.java:304)
	at org.apache.bookkeeper.bookie.BookieResources.createMetadataDriver(BookieResources.java:56)
	at org.apache.bookkeeper.server.EmbeddedServer$Builder.build(EmbeddedServer.java:306)
	at org.apache.bookkeeper.server.Main.buildBookieServer(Main.java:277)
	at org.apache.pulsar.metadata.bookkeeper.BKCluster.startBookie(BKCluster.java:318)
	at org.apache.pulsar.metadata.bookkeeper.BKCluster.startNewBookie(BKCluster.java:302)
	at org.apache.pulsar.metadata.bookkeeper.BKCluster.startBKCluster(BKCluster.java:188)
	at org.apache.pulsar.metadata.bookkeeper.BKCluster.<init>(BKCluster.java:141)
	at org.apache.pulsar.metadata.bookkeeper.BKCluster$BKClusterConf.build(BKCluster.java:118)
	at org.apache.pulsar.metadata.bookkeeper.EndToEndTest.testBasic(EndToEndTest.java:46)
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

