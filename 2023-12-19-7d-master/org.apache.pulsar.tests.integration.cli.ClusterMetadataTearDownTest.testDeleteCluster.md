        
Flaky-test: org.apache.pulsar.tests.integration.cli.ClusterMetadataTearDownTest.testDeleteCluster
Number of failures: 1

org.apache.pulsar.tests.integration.cli.ClusterMetadataTearDownTest is flaky. The testDeleteCluster test method fails sporadically.

```
org.apache.bookkeeper.client.BKException$ZKException: Error while using ZooKeeper
	at org.apache.bookkeeper.discover.ZKRegistrationClient.lambda$getChildren$4(ZKRegistrationClient.java:352)
	at org.apache.bookkeeper.zookeeper.ZooKeeperClient$25$1.processResult(ZooKeeperClient.java:1177)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:653)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:538)
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /ledgers/available
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:117)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.bookkeeper.discover.ZKRegistrationClient.lambda$getChildren$4(ZKRegistrationClient.java:351)
	... 3 more

```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-12-17T12:59:55.4672937Z](https://github.com/apache/pulsar/actions/runs/7238358549/job/19719288500#step:12:37227)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.bookkeeper.client.BKException$ZKException: Error while using ZooKeeper
	at org.apache.bookkeeper.discover.ZKRegistrationClient.lambda$getChildren$4(ZKRegistrationClient.java:352)
	at org.apache.bookkeeper.zookeeper.ZooKeeperClient$25$1.processResult(ZooKeeperClient.java:1177)
	at org.apache.zookeeper.ClientCnxn$EventThread.processEvent(ClientCnxn.java:653)
	at org.apache.zookeeper.ClientCnxn$EventThread.run(ClientCnxn.java:538)
Caused by: org.apache.zookeeper.KeeperException$NoNodeException: KeeperErrorCode = NoNode for /ledgers/available
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:117)
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:53)
	at org.apache.bookkeeper.discover.ZKRegistrationClient.lambda$getChildren$4(ZKRegistrationClient.java:351)
	... 3 more

</pre></code>
</details>

