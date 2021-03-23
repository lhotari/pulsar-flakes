        
Flaky-test: org.apache.pulsar.tests.integration.functions.PulsarFunctionsProcessTest.testAvroSchemaFunction
Number of failures: 15

org.apache.pulsar.tests.integration.functions.PulsarFunctionsProcessTest is flaky. The testAvroSchemaFunction test method fails sporadically.

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-rqrlbdzq --output test-avroschema-output-wpzirjzo --jar /pulsar/examples/java-test-functions.jar failed on 2cd1564ecda78dc573ffa32a71c6a9d222241a072c1783636fdd696d0e0f9db7 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-18T13:25:11.4457389Z](https://github.com/apache/pulsar/runs/2138106794?check_suite_focus=true#step:13:19403)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-rqrlbdzq --output test-avroschema-output-wpzirjzo --jar /pulsar/examples/java-test-functions.jar failed on 2cd1564ecda78dc573ffa32a71c6a9d222241a072c1783636fdd696d0e0f9db7 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-dabqzbfd --output test-avroschema-output-bmgbqjht --jar /pulsar/examples/java-test-functions.jar failed on 8a8118150379b0a7669bc23330ad7e1ec13eb7c4606e5483ddfac6f3bade9895 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-22T05:09:11.3852283Z](https://github.com/apache/pulsar/runs/2162901945?check_suite_focus=true#step:12:39903)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-dabqzbfd --output test-avroschema-output-bmgbqjht --jar /pulsar/examples/java-test-functions.jar failed on 8a8118150379b0a7669bc23330ad7e1ec13eb7c4606e5483ddfac6f3bade9895 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-mrwfjjku --output test-avroschema-output-rpdiupwh --jar /pulsar/examples/java-test-functions.jar failed on a46df2d59f23b969d457085d42b63282e3b7bf3ac663d2a14a16a1a421172933 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-16T19:37:36.9413563Z](https://github.com/apache/pulsar/runs/2122021298?check_suite_focus=true#step:13:20323)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-mrwfjjku --output test-avroschema-output-rpdiupwh --jar /pulsar/examples/java-test-functions.jar failed on a46df2d59f23b969d457085d42b63282e3b7bf3ac663d2a14a16a1a421172933 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-megymehu --output test-avroschema-output-qwgjmako --jar /pulsar/examples/java-test-functions.jar failed on 3723bed30399201d4e645b56576090231526fda44eaa98c0532180ca86075cf8 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-18T22:52:53.6242598Z](https://github.com/apache/pulsar/runs/2142615119?check_suite_focus=true#step:13:19664)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-megymehu --output test-avroschema-output-qwgjmako --jar /pulsar/examples/java-test-functions.jar failed on 3723bed30399201d4e645b56576090231526fda44eaa98c0532180ca86075cf8 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-ncerpwyc --output test-avroschema-output-mrcccjdj --jar /pulsar/examples/java-test-functions.jar failed on e008aaed6638c265d262458e49572f7c01c8d55fecaef9a9c7c216381aa9d4c9 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-19T21:58:46.2774774Z](https://github.com/apache/pulsar/runs/2151941960?check_suite_focus=true#step:13:38119)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-ncerpwyc --output test-avroschema-output-mrcccjdj --jar /pulsar/examples/java-test-functions.jar failed on e008aaed6638c265d262458e49572f7c01c8d55fecaef9a9c7c216381aa9d4c9 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-lepijxmh --output test-avroschema-output-yjlysucm --jar /pulsar/examples/java-test-functions.jar failed on af59c70b582d53696a50aedffbba3e8a8bb938eeeadd66dda7e8bb1a2150e919 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-20T10:24:29.6984656Z](https://github.com/apache/pulsar/runs/2154722823?check_suite_focus=true#step:13:36846)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-lepijxmh --output test-avroschema-output-yjlysucm --jar /pulsar/examples/java-test-functions.jar failed on af59c70b582d53696a50aedffbba3e8a8bb938eeeadd66dda7e8bb1a2150e919 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-hkczhiwb --output test-avroschema-output-rwfxcozr --jar /pulsar/examples/java-test-functions.jar failed on 41d0ab445060d9236022a70be67d2ad0d9c3953854cb1b3ddd4f435baab893cb with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-23T02:45:32.1822500Z](https://github.com/apache/pulsar/runs/2171516844?check_suite_focus=true#step:12:19714)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-hkczhiwb --output test-avroschema-output-rwfxcozr --jar /pulsar/examples/java-test-functions.jar failed on 41d0ab445060d9236022a70be67d2ad0d9c3953854cb1b3ddd4f435baab893cb with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-ezstmodl --output test-avroschema-output-ntkmbabk --jar /pulsar/examples/java-test-functions.jar failed on b840ff1421f99de67501296d830380e5394ae7db12551ad9c6e8274002b1394e with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-20T01:13:15.3346335Z](https://github.com/apache/pulsar/runs/2152924736?check_suite_focus=true#step:13:37461)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-ezstmodl --output test-avroschema-output-ntkmbabk --jar /pulsar/examples/java-test-functions.jar failed on b840ff1421f99de67501296d830380e5394ae7db12551ad9c6e8274002b1394e with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-yzhtijib --output test-avroschema-output-fyzpepzg --jar /pulsar/examples/java-test-functions.jar failed on c96953c2df2d9ffe79f3038db9f1e1a7a43ed8a6dec4708073ec3f7ef9e90687 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-17T06:31:47.1313631Z](https://github.com/apache/pulsar/runs/2127869274?check_suite_focus=true#step:13:17659)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-yzhtijib --output test-avroschema-output-fyzpepzg --jar /pulsar/examples/java-test-functions.jar failed on c96953c2df2d9ffe79f3038db9f1e1a7a43ed8a6dec4708073ec3f7ef9e90687 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-clakoqwx --output test-avroschema-output-bgjqzutd --jar /pulsar/examples/java-test-functions.jar failed on 3d3ac25c8aaee50416646d55da197720151975a6aa0888e6849dcb9947c849d1 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-19T18:08:20.5893189Z](https://github.com/apache/pulsar/runs/2150254851?check_suite_focus=true#step:13:25613)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-clakoqwx --output test-avroschema-output-bgjqzutd --jar /pulsar/examples/java-test-functions.jar failed on 3d3ac25c8aaee50416646d55da197720151975a6aa0888e6849dcb9947c849d1 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-emjxidgr --output test-avroschema-output-zmoobrrr --jar /pulsar/examples/java-test-functions.jar failed on 943cb080f337788929786a454a53645133ce8e1d5ce04a7cc130fe93700800db with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-20T08:29:13.5903836Z](https://github.com/apache/pulsar/runs/2154437752?check_suite_focus=true#step:13:19315)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-emjxidgr --output test-avroschema-output-zmoobrrr --jar /pulsar/examples/java-test-functions.jar failed on 943cb080f337788929786a454a53645133ce8e1d5ce04a7cc130fe93700800db with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-uwfpwcdh --output test-avroschema-output-zweiqnos --jar /pulsar/examples/java-test-functions.jar failed on 5ab76a384f0444a5d4e722657147af5541fcd1b4a949107a94620c47998e1883 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-19T21:43:59.3644115Z](https://github.com/apache/pulsar/runs/2151941960?check_suite_focus=true#step:13:18857)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-uwfpwcdh --output test-avroschema-output-zweiqnos --jar /pulsar/examples/java-test-functions.jar failed on 5ab76a384f0444a5d4e722657147af5541fcd1b4a949107a94620c47998e1883 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-kfbemizt --output test-avroschema-output-pjsrqpvp --jar /pulsar/examples/java-test-functions.jar failed on ce0167f41978c781f975f0c4e623dd19b168a143871a3fdb6bc2f5e582fb6871 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-23T01:00:59.9070401Z](https://github.com/apache/pulsar/runs/2170893800?check_suite_focus=true#step:12:38270)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-kfbemizt --output test-avroschema-output-pjsrqpvp --jar /pulsar/examples/java-test-functions.jar failed on ce0167f41978c781f975f0c4e623dd19b168a143871a3fdb6bc2f5e582fb6871 with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-lvfqezrc --output test-avroschema-output-svregcmb --jar /pulsar/examples/java-test-functions.jar failed on 6a73d875e2a61b9a17442dc05e45f311655b0d7a6102dc1832c512ed758e8a7f with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-22T04:51:43.6120911Z](https://github.com/apache/pulsar/runs/2162901945?check_suite_focus=true#step:12:18558)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-lvfqezrc --output test-avroschema-output-svregcmb --jar /pulsar/examples/java-test-functions.jar failed on 6a73d875e2a61b9a17442dc05e45f311655b0d7a6102dc1832c512ed758e8a7f with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

```
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-bvguqsij --output test-avroschema-output-yhsdgryt --jar /pulsar/examples/java-test-functions.jar failed on ff7bc16e58e29efea9e8f04ed803e94d5980b9cad313b0de9365e3c8535e50ed with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-03-20T10:39:12.8241685Z](https://github.com/apache/pulsar/runs/2154722823?check_suite_focus=true#step:13:56048)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.tests.integration.docker.ContainerExecException: sh -c /pulsar/bin/pulsar-admin functions create --tenant public --namespace default --name test-avroschema-fn-202003241756 --className org.apache.pulsar.functions.api.examples.AvroSchemaTestFunction --inputs test-avroschema-input-bvguqsij --output test-avroschema-output-yhsdgryt --jar /pulsar/examples/java-test-functions.jar failed on ff7bc16e58e29efea9e8f04ed803e94d5980b9cad313b0de9365e3c8535e50ed with error code 1
	at org.apache.pulsar.tests.integration.utils.DockerUtils$2.onComplete(DockerUtils.java:259)
	at org.testcontainers.shaded.com.github.dockerjava.core.exec.AbstrAsyncDockerCmdExec$1.onComplete(AbstrAsyncDockerCmdExec.java:51)
	at org.testcontainers.shaded.com.github.dockerjava.core.DefaultInvocationBuilder.lambda$executeAndStream$1(DefaultInvocationBuilder.java:276)
	at java.lang.Thread.run(Thread.java:748)

</pre></code>
</details>

