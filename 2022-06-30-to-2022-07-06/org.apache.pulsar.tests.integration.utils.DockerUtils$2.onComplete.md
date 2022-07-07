        
Flaky-test: org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete
Number of failures: 1

org.apache.pulsar.tests.integration.utils.DockerUtils$2 is flaky. The onComplete test method fails sporadically.

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin sources create --name test-source-property-vxqmrgkm --destinationTopicName test-source-property-input-gipnfttb --archive /pulsar/examples/java-test-functions.jar --classname org.apache.pulsar.tests.integration.io.TestPropertySource failed on de523cb101aead16cb6c24e9a519e719d93764b5eb11c22dbfdef722e7ab6e7f with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-05T08:17:40.3536612Z](https://github.com/apache/pulsar/runs/7191875538?check_suite_focus=true#step:12:326)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin sources create --name test-source-property-vxqmrgkm --destinationTopicName test-source-property-input-gipnfttb --archive /pulsar/examples/java-test-functions.jar --classname org.apache.pulsar.tests.integration.io.TestPropertySource failed on de523cb101aead16cb6c24e9a519e719d93764b5eb11c22dbfdef722e7ab6e7f with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:750)

</pre></code>
</details>

