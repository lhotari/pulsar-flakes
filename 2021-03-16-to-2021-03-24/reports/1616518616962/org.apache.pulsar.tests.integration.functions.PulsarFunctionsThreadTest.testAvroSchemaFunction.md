        
Flaky-test: org.apache.pulsar.tests.integration.functions.PulsarFunctionsThreadTest.testAvroSchemaFunction
Number of failures: 1

org.apache.pulsar.tests.integration.functions.PulsarFunctionsThreadTest is flaky. The testAvroSchemaFunction test method fails sporadically.

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-reghbmek --output test-avroschema-output-hhqwzfdy --jar /pulsar/examples/java-test-functions.jar failed on bbb54b6232221d3f38a5328658aa304371c962e6e428bd7c4ddd429190519c48 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-19T12:31:46.1132006Z](https://github.com/apache/pulsar/runs/2146894071?check_suite_focus=true#step:12:8866)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-reghbmek --output test-avroschema-output-hhqwzfdy --jar /pulsar/examples/java-test-functions.jar failed on bbb54b6232221d3f38a5328658aa304371c962e6e428bd7c4ddd429190519c48 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

