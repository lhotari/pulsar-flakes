        
Flaky-test: org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumSourcesTest.testDebeziumMsSqlSource
Number of failures: 12

org.apache.pulsar.tests.integration.io.sources.debezium.PulsarDebeziumSourcesTest is flaky. The testDebeziumMsSqlSource test method fails sporadically.

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on 86b5ac97e0dcadefa5161d85b3162f6c7a80b1e83ecd221717c3cbad959f412d with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T07:28:27.6440492Z](https://github.com/apache/pulsar/runs/3891370523?check_suite_focus=true?check_suite_focus=true#step:13:2820)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on 86b5ac97e0dcadefa5161d85b3162f6c7a80b1e83ecd221717c3cbad959f412d with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on 440b54702c631f43e14de8f6806493c77b1a845f0771588f9fdd48abe18837fb with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T08:29:43.9440531Z](https://github.com/apache/pulsar/runs/3891854661?check_suite_focus=true?check_suite_focus=true#step:13:2740)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on 440b54702c631f43e14de8f6806493c77b1a845f0771588f9fdd48abe18837fb with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on e7a22ae628d47e0b9ece0b3648518d3f0407479d3be413a3002981c650b7e8c1 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T08:18:49.4775579Z](https://github.com/apache/pulsar/runs/3891784568?check_suite_focus=true?check_suite_focus=true#step:13:2726)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on e7a22ae628d47e0b9ece0b3648518d3f0407479d3be413a3002981c650b7e8c1 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on 9c91b2cb0919909c5754a244f6e646fe922965eb533a8ea032e9d9ed7cb01380 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T02:51:57.5375262Z](https://github.com/apache/pulsar/runs/3889806018?check_suite_focus=true?check_suite_focus=true#step:13:2957)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on 9c91b2cb0919909c5754a244f6e646fe922965eb533a8ea032e9d9ed7cb01380 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on bcc1225bc5e33c17d1bf595675018bc544bf3484ba255dad3f04af9fae3ee330 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T10:00:02.5234345Z](https://github.com/apache/pulsar/runs/3892561309?check_suite_focus=true?check_suite_focus=true#step:13:2937)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on bcc1225bc5e33c17d1bf595675018bc544bf3484ba255dad3f04af9fae3ee330 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on d8c054c812b8b6d33c2058b251895ae2cab16a94118cbfa8a48c4630e02f9b56 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T19:44:58.0178299Z](https://github.com/apache/pulsar/runs/3898635934?check_suite_focus=true?check_suite_focus=true#step:13:2985)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on d8c054c812b8b6d33c2058b251895ae2cab16a94118cbfa8a48c4630e02f9b56 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on 6e5a290f693a484771dea154edf6947c51694f332c38357b85536d8bdf42d1d8 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T07:31:23.7955964Z](https://github.com/apache/pulsar/runs/3891419023?check_suite_focus=true?check_suite_focus=true#step:13:2792)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on 6e5a290f693a484771dea154edf6947c51694f332c38357b85536d8bdf42d1d8 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on 6fe690ec708b188b835826d450cc7ce16ba2b7db61ac59613c47e2368dac3d9f with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T19:03:32.8442159Z](https://github.com/apache/pulsar/runs/3898240776?check_suite_focus=true?check_suite_focus=true#step:13:2752)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on 6fe690ec708b188b835826d450cc7ce16ba2b7db61ac59613c47e2368dac3d9f with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on 56485e37f2bc08c05c214b17763dc8d4f5ebe3db2b57b147b6050b51c73cc52c with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

2021-10-14 08:58:42,436 - INFO  - [docker-java-stream--1561151551:DockerUtils$4@383] - DOCKER.exec(PulsarDebeziumSourcesTest-eayvt-pulsar-broker-1:tail -f /var/log/pulsar/broker.log): STDOUT: 2021-10-14T08:58:42,131+0000 [pulsar-load-manager-1-1] INFO  org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerImpl - Writing local data to metadata store because maximum change Infinity% exceeded threshold 10%; time since last report written is 35.001 seconds
2021-10-14T08:58:42,147+0000 [metadata-store-6-1] INFO  org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl - Acquired resource lock on /loadbalance/brokers/pulsar-broker-1:8080
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T08:58:42.4644005Z](https://github.com/apache/pulsar/runs/3892043511?check_suite_focus=true?check_suite_focus=true#step:13:2739)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on 56485e37f2bc08c05c214b17763dc8d4f5ebe3db2b57b147b6050b51c73cc52c with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

2021-10-14 08:58:42,436 - INFO  - [docker-java-stream--1561151551:DockerUtils$4@383] - DOCKER.exec(PulsarDebeziumSourcesTest-eayvt-pulsar-broker-1:tail -f /var/log/pulsar/broker.log): STDOUT: 2021-10-14T08:58:42,131+0000 [pulsar-load-manager-1-1] INFO  org.apache.pulsar.broker.loadbalance.impl.ModularLoadManagerImpl - Writing local data to metadata store because maximum change Infinity% exceeded threshold 10%; time since last report written is 35.001 seconds
2021-10-14T08:58:42,147+0000 [metadata-store-6-1] INFO  org.apache.pulsar.metadata.coordination.impl.ResourceLockImpl - Acquired resource lock on /loadbalance/brokers/pulsar-broker-1:8080
</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on 49cfac88ec3d9db3f4ce34615f4228214564899872a5060d22c2bb7dc6184f84 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T10:38:20.8332845Z](https://github.com/apache/pulsar/runs/3893041452?check_suite_focus=true?check_suite_focus=true#step:13:2756)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on 49cfac88ec3d9db3f4ce34615f4228214564899872a5060d22c2bb7dc6184f84 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on 946b7bc11aeb1b1e50c5f272b7b87190bde39f2e1b38e8683a9e06515fcb4d45 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T09:51:40.6360673Z](https://github.com/apache/pulsar/runs/3892339284?check_suite_focus=true?check_suite_focus=true#step:13:2901)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on 946b7bc11aeb1b1e50c5f272b7b87190bde39f2e1b38e8683a9e06515fcb4d45 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on 61123d1d38e6f7172d067c93c5da16df268ab57f813f5c56b7be27d3f1ccd302 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-10-14T20:32:44.1634678Z](https://github.com/apache/pulsar/runs/3899066774?check_suite_focus=true?check_suite_focus=true#step:13:2740)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /bin/bash -c /opt/mssql-tools/bin/sqlcmd -S localhost -U sa -P "p@ssw0rD" -Q "CREATE DATABASE TestDB;" failed on 61123d1d38e6f7172d067c93c5da16df268ab57f813f5c56b7be27d3f1ccd302 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:284)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.base/java.lang.Thread.run(Thread.java:829)

</pre></code>
</details>

