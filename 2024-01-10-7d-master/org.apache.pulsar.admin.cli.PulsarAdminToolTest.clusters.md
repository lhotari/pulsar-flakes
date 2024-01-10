        
Flaky-test: org.apache.pulsar.admin.cli.PulsarAdminToolTest.clusters
Number of failures: 1

org.apache.pulsar.admin.cli.PulsarAdminToolTest is flaky. The clusters test method fails sporadically.

```
Wanted but not invoked:
clusters.deleteCluster("use");
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-01-10T12:41:26.2980497Z](https://github.com/apache/pulsar/actions/runs/7419301554/job/20341789304#step:11:8712)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
Wanted but not invoked:
clusters.deleteCluster("use");
-> at org.apache.pulsar.admin.cli.PulsarAdminToolTest.clusters(PulsarAdminToolTest.java:229)

However, there were exactly 4 interactions with this mock:
clusters.getClusters();
-> at org.apache.pulsar.admin.cli.CmdClusters$List.run(CmdClusters.java:53)

clusters.getCluster("use");
-> at org.apache.pulsar.admin.cli.CmdClusters$Get.run(CmdClusters.java:69)

clusters.createCluster(
    "use",
    ClusterDataImpl(serviceUrl=http://my-service.url:8080, serviceUrlTls=null, brokerServiceUrl=null, brokerServiceUrlTls=null, proxyServiceUrl=null, authenticationPlugin=null, authenticationParameters=null, proxyProtocol=null, peerClusterNames=null, brokerClientTlsEnabled=false, tlsAllowInsecureConnection=false, brokerClientTlsEnabledWithKeyStore=false, brokerClientTlsTrustStoreType=JKS, brokerClientTlsTrustStore=null, brokerClientTlsTrustStorePassword=null, brokerClientTlsKeyStoreType=JKS, brokerClientTlsKeyStore=null, brokerClientTlsKeyStorePassword=null, brokerClientTrustCertsFilePath=null, brokerClientKeyFilePath=null, brokerClientCertificateFilePath=null, listenerName=null)
);
-> at org.apache.pulsar.admin.cli.CmdClusters$Create.runCmd(CmdClusters.java:79)

clusters.updateCluster(
    "use",
    ClusterDataImpl(serviceUrl=http://my-service.url:8080, serviceUrlTls=null, brokerServiceUrl=null, brokerServiceUrlTls=null, proxyServiceUrl=null, authenticationPlugin=null, authenticationParameters=null, proxyProtocol=null, peerClusterNames=null, brokerClientTlsEnabled=false, tlsAllowInsecureConnection=false, brokerClientTlsEnabledWithKeyStore=false, brokerClientTlsTrustStoreType=JKS, brokerClientTlsTrustStore=null, brokerClientTlsTrustStorePassword=null, brokerClientTlsKeyStoreType=JKS, brokerClientTlsKeyStore=null, brokerClientTlsKeyStorePassword=null, brokerClientTrustCertsFilePath=null, brokerClientKeyFilePath=null, brokerClientCertificateFilePath=null, listenerName=null)
);
-> at org.apache.pulsar.admin.cli.CmdClusters$Update.runCmd(CmdClusters.java:104)


	at org.apache.pulsar.admin.cli.PulsarAdminToolTest.clusters(PulsarAdminToolTest.java:229)
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
	at java.base/java.lang.Thread.run(Thread.java:840)

</pre></code>
</details>

