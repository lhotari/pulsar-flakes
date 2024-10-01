        
Flaky-test: org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest.testDebeziumOracleDbSource
Number of failures: 1

org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumOracleSourceTest is flaky. The testDebeziumOracleDbSource test method fails sporadically.

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin source create --tenant public --namespace default --name test-source-debezium-oracle-PROCESS-bcjpbdlj --source-type debezium-oracle --sourceConfig {"topic.namespace":"debezium/oracle","database.user":"dbzuser","database.dbname":"XE","database.hostname":"debezium-oracledb-12c","database.password":"dbz","database.history.pulsar.service.url":"pulsar://pulsar-proxy:6650","database.server.name":"XE","schema.include.list":"inv","json-with-envelope":true,"database.port":"1521","snapshot.mode":"schema_only"} --destinationTopicName debe-output-topic-name-0 --ram 134217728 failed on 21d43286419cb31931d6a925152160f29c9b13e9c5029d8f0e3824eddb1c78c3 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:840)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2024-09-18T12:58:10.4455348Z](https://github.com/apache/pulsar/actions/runs/10921811614/job/30316624625#step:12:11693)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin source create --tenant public --namespace default --name test-source-debezium-oracle-PROCESS-bcjpbdlj --source-type debezium-oracle --sourceConfig {"topic.namespace":"debezium/oracle","database.user":"dbzuser","database.dbname":"XE","database.hostname":"debezium-oracledb-12c","database.password":"dbz","database.history.pulsar.service.url":"pulsar://pulsar-proxy:6650","database.server.name":"XE","schema.include.list":"inv","json-with-envelope":true,"database.port":"1521","snapshot.mode":"schema_only"} --destinationTopicName debe-output-topic-name-0 --ram 134217728 failed on 21d43286419cb31931d6a925152160f29c9b13e9c5029d8f0e3824eddb1c78c3 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:840)

</pre></code>
</details>

