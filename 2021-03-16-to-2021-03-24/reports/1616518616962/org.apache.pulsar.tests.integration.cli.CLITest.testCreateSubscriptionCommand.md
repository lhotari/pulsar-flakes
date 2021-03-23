        
Flaky-test: org.apache.pulsar.tests.integration.cli.CLITest.testCreateSubscriptionCommand
Number of failures: 9

org.apache.pulsar.tests.integration.cli.CLITest is flaky. The testCreateSubscriptionCommand test method fails sporadically.

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin topics create-subscription persistent://public/default/testCreateSubscriptionCommmand --subscription subscription-0 failed on 20e2500a409d74e62b9996ceb6b3e225f405f3be9788857491d71b4d85d0194b with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-20T10:48:22.6085053Z](https://github.com/apache/pulsar/runs/2154797922?check_suite_focus=true#step:13:58012)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin topics create-subscription persistent://public/default/testCreateSubscriptionCommmand --subscription subscription-0 failed on 20e2500a409d74e62b9996ceb6b3e225f405f3be9788857491d71b4d85d0194b with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin topics create-subscription persistent://public/default/testCreateSubscriptionCommmand --subscription subscription-0 failed on f9f7e8318b71cf48c5f44c64f5323971d8f6e0099855a51bf87b8b49a2788cad with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-19T06:18:30.3710268Z](https://github.com/apache/pulsar/runs/2145465428?check_suite_focus=true#step:13:56889)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin topics create-subscription persistent://public/default/testCreateSubscriptionCommmand --subscription subscription-0 failed on f9f7e8318b71cf48c5f44c64f5323971d8f6e0099855a51bf87b8b49a2788cad with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin topics create-subscription persistent://public/default/testCreateSubscriptionCommmand --subscription subscription-0 failed on 8988788001f49074b1a4edde5b43e7678bae4acef70da9f1f07452bbe46bf9da with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-19T10:53:56.7384089Z](https://github.com/apache/pulsar/runs/2146721777?check_suite_focus=true#step:13:58054)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin topics create-subscription persistent://public/default/testCreateSubscriptionCommmand --subscription subscription-0 failed on 8988788001f49074b1a4edde5b43e7678bae4acef70da9f1f07452bbe46bf9da with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin topics create-subscription persistent://public/default/testCreateSubscriptionCommmand --subscription subscription-0 failed on 98a1658887cc20d0d588fe44c9cedd97e776327c642f93f685337327f1220072 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-16T10:06:48.8893923Z](https://github.com/apache/pulsar/runs/2119427495?check_suite_focus=true#step:13:58784)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin topics create-subscription persistent://public/default/testCreateSubscriptionCommmand --subscription subscription-0 failed on 98a1658887cc20d0d588fe44c9cedd97e776327c642f93f685337327f1220072 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin topics create-subscription persistent://public/default/testCreateSubscriptionCommmand --subscription subscription-0 failed on 836a800c21fe84c7c1cff9a414f3b39328a53f795a0209840a66e857b84f6b1a with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-18T01:47:53.6416343Z](https://github.com/apache/pulsar/runs/2135691964?check_suite_focus=true#step:13:57702)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin topics create-subscription persistent://public/default/testCreateSubscriptionCommmand --subscription subscription-0 failed on 836a800c21fe84c7c1cff9a414f3b39328a53f795a0209840a66e857b84f6b1a with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin topics create-subscription persistent://public/default/testCreateSubscriptionCommmand --subscription subscription-0 failed on b7f84b625fc2d2dcd127f29598217882ba57d8069698d246549badd91b614e60 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-17T12:03:33.6158214Z](https://github.com/apache/pulsar/runs/2129232091?check_suite_focus=true#step:13:57653)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin topics create-subscription persistent://public/default/testCreateSubscriptionCommmand --subscription subscription-0 failed on b7f84b625fc2d2dcd127f29598217882ba57d8069698d246549badd91b614e60 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin topics create-subscription persistent://public/default/testCreateSubscriptionCommmand --subscription subscription-0 failed on 1f7b6cfa6ee1372ebc7911971e82f406aaf30c9ce2bd4db07235ab7d375515ec with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-16T15:27:28.0347341Z](https://github.com/apache/pulsar/runs/2120491059?check_suite_focus=true#step:13:57237)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin topics create-subscription persistent://public/default/testCreateSubscriptionCommmand --subscription subscription-0 failed on 1f7b6cfa6ee1372ebc7911971e82f406aaf30c9ce2bd4db07235ab7d375515ec with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin topics create-subscription persistent://public/default/testCreateSubscriptionCommmand --subscription subscription-0 failed on a6ac50fb7227130085b62e0c31061e6664e4d66dff6d25d51686845403feb44b with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-22T23:19:27.9804133Z](https://github.com/apache/pulsar/runs/2170427386?check_suite_focus=true#step:12:57653)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin topics create-subscription persistent://public/default/testCreateSubscriptionCommmand --subscription subscription-0 failed on a6ac50fb7227130085b62e0c31061e6664e4d66dff6d25d51686845403feb44b with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin topics create-subscription persistent://public/default/testCreateSubscriptionCommmand --subscription subscription-0 failed on 78eecec2d7ecc0c8f33b5b6b5b8cf1d223a37b69a4e142b7d3375803f68b4e90 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-19T03:33:17.0673394Z](https://github.com/apache/pulsar/runs/2144995322?check_suite_focus=true#step:13:57597)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: /pulsar/bin/pulsar-admin topics create-subscription persistent://public/default/testCreateSubscriptionCommmand --subscription subscription-0 failed on 78eecec2d7ecc0c8f33b5b6b5b8cf1d223a37b69a4e142b7d3375803f68b4e90 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

