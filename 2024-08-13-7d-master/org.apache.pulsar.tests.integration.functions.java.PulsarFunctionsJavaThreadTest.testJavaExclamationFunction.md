        
Flaky-test: org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaThreadTest.testJavaExclamationFunction
Number of failures: 1

org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaThreadTest is flaky. The testJavaExclamationFunction test method fails sporadically.

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin functions stats --tenant public --namespace default --name test-exclamation-fn-dzttmrei failed on b14943d19f4c567089b248b1ea288ca7242210b6e017b3f9b715d015fc58820e with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:1583)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-08-11T07:04:11.3947117Z](https://github.com/apache/pulsar/actions/runs/10337482529/job/28614876735#step:12:24688)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin functions stats --tenant public --namespace default --name test-exclamation-fn-dzttmrei failed on b14943d19f4c567089b248b1ea288ca7242210b6e017b3f9b715d015fc58820e with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:1583)

</pre></code>
</details>

