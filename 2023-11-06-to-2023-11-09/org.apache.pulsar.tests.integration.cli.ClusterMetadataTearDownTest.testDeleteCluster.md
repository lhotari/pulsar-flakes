        
Flaky-test: org.apache.pulsar.tests.integration.cli.ClusterMetadataTearDownTest.testDeleteCluster
Number of failures: 1

org.apache.pulsar.tests.integration.cli.ClusterMetadataTearDownTest is flaky. The testDeleteCluster test method fails sporadically.

```
org.apache.pulsar.client.admin.PulsarAdminException: java.lang.IllegalStateException: Client instance has been closed.
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:354)
	at org.apache.pulsar.client.admin.internal.TenantsImpl.createTenant(TenantsImpl.java:66)
	at org.apache.pulsar.tests.integration.cli.ClusterMetadataTearDownTest.testDeleteCluster(ClusterMetadataTearDownTest.java:147)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-11-08T11:17:47.4824139Z](https://github.com/apache/pulsar/actions/runs/6797173293/job/18479363687#step:12:6476)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.client.admin.PulsarAdminException: java.lang.IllegalStateException: Client instance has been closed.
	at org.apache.pulsar.client.admin.PulsarAdminException.wrap(PulsarAdminException.java:252)
	at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:354)
	at org.apache.pulsar.client.admin.internal.TenantsImpl.createTenant(TenantsImpl.java:66)
	at org.apache.pulsar.tests.integration.cli.ClusterMetadataTearDownTest.testDeleteCluster(ClusterMetadataTearDownTest.java:147)
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
	Suppressed: org.apache.pulsar.client.admin.PulsarAdminException: java.lang.IllegalStateException: Client instance has been closed.
		at org.apache.pulsar.client.admin.internal.BaseResource.getApiException(BaseResource.java:300)
		... 15 more
	Caused by: java.lang.IllegalStateException: Client instance has been closed.
		at org.glassfish.jersey.internal.guava.Preconditions.checkState(Preconditions.java:169)
		at org.glassfish.jersey.client.JerseyClient.checkNotClosed(JerseyClient.java:257)
		at org.glassfish.jersey.client.JerseyWebTarget.checkNotClosed(JerseyWebTarget.java:118)
		at org.glassfish.jersey.client.JerseyWebTarget.path(JerseyWebTarget.java:129)
		at org.glassfish.jersey.client.JerseyWebTarget.path(JerseyWebTarget.java:38)
		at org.apache.pulsar.client.admin.internal.TenantsImpl.createTenantAsync(TenantsImpl.java:71)
		at org.apache.pulsar.client.admin.internal.TenantsImpl.lambda$createTenant$3(TenantsImpl.java:66)
		at org.apache.pulsar.client.admin.internal.BaseResource.sync(BaseResource.java:342)
		... 14 more
Caused by: [CIRCULAR REFERENCE: java.lang.IllegalStateException: Client instance has been closed.]

</pre></code>
</details>

