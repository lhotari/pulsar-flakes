        
Flaky-test: org.apache.pulsar.tests.integration.io.sources.AvroKafkaSourceTest.test
Number of failures: 1

org.apache.pulsar.tests.integration.io.sources.AvroKafkaSourceTest is flaky. The test test method fails sporadically.

```
org.testcontainers.containers.ContainerLaunchException: Container startup failed
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-26T17:33:50.5464970Z](https://github.com/apache/pulsar/runs/4012151213?check_suite_focus=true?check_suite_focus=true#step:13:10641)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.testcontainers.containers.ContainerLaunchException: Container startup failed
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:330)
	at org.testcontainers.containers.GenericContainer.start(GenericContainer.java:311)
	at org.apache.pulsar.tests.integration.topologies.PulsarCluster.startService(PulsarCluster.java:290)
	at org.apache.pulsar.tests.integration.io.sources.AvroKafkaSourceTest.startKafkaContainers(AvroKafkaSourceTest.java:119)
	at org.apache.pulsar.tests.integration.io.sources.AvroKafkaSourceTest.test(AvroKafkaSourceTest.java:101)
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
Caused by: org.testcontainers.containers.ContainerFetchException: Can't get Docker image: RemoteDockerImage(imageName=confluentinc/cp-schema-registry:6.0.1, imagePullPolicy=DefaultPullPolicy())
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1286)
	at org.testcontainers.containers.GenericContainer.logger(GenericContainer.java:615)
	at org.testcontainers.containers.GenericContainer.doStart(GenericContainer.java:320)
	... 16 more
Caused by: org.testcontainers.containers.ContainerFetchException: Failed to get Docker client for confluentinc/cp-schema-registry:6.0.1
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:99)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:27)
	at org.testcontainers.utility.LazyFuture.getResolvedValue(LazyFuture.java:17)
	at org.testcontainers.utility.LazyFuture.get(LazyFuture.java:39)
	at org.testcontainers.containers.GenericContainer.getDockerImageName(GenericContainer.java:1284)
	... 18 more
Caused by: com.github.dockerjava.api.exception.DockerClientException: Could not pull image: error pulling image configuration: Get "https://production.cloudflare.docker.com/registry-v2/docker/registry/v2/blobs/sha256/d9/d96dacce178fc397cb54d327b4a5169d5e375d414bed8d69cf1f21ce97e1384c/data?verify=1635272618-aCugfw4pw%2FHP%2FgqEe3gt5hlLbYc%3D": net/http: TLS handshake timeout
	at com.github.dockerjava.api.command.PullImageResultCallback.checkDockerClientPullSuccessful(PullImageResultCallback.java:97)
	at com.github.dockerjava.api.command.PullImageResultCallback.throwFirstError(PullImageResultCallback.java:112)
	at com.github.dockerjava.api.async.ResultCallbackTemplate.awaitCompletion(ResultCallbackTemplate.java:93)
	at org.testcontainers.images.TimeLimitedLoggedPullImageResultCallback.awaitCompletion(TimeLimitedLoggedPullImageResultCallback.java:52)
	at org.testcontainers.images.RemoteDockerImage.resolve(RemoteDockerImage.java:82)
	... 22 more

</pre></code>
</details>

