        
Flaky-test: org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession
Number of failures: 94

org.apache.pulsar.metadata.LockManagerTest is flaky. The revalidateLockOnDifferentSession test method fails sporadically.

```
org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.<init>(ZKMetadataStore.java:84)
	at org.apache.pulsar.metadata.api.MetadataStoreFactory.create(MetadataStoreFactory.java:48)
	at org.apache.pulsar.metadata.api.extended.MetadataStoreExtended.create(MetadataStoreExtended.java:42)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:190)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.
[example failure 2021-08-31T10:52:22.3515804Z](https://github.com/apache/pulsar/runs/3471949444?check_suite_focus=true#step:8:4731)
[example failure 2021-08-31T10:46:36.0622692Z](https://github.com/apache/pulsar/runs/3471949444?check_suite_focus=true#step:8:1456)
[example failure 2021-08-31T10:11:41.6684099Z](https://github.com/apache/pulsar/runs/3471561077?check_suite_focus=true#step:8:3101)
[example failure 2021-08-31T10:08:37.5024780Z](https://github.com/apache/pulsar/runs/3471561077?check_suite_focus=true#step:8:1457)
[example failure 2021-08-31T02:52:37.1016786Z](https://github.com/apache/pulsar/runs/3468534508?check_suite_focus=true#step:8:3124)
[example failure 2021-08-31T02:49:39.7548864Z](https://github.com/apache/pulsar/runs/3468534508?check_suite_focus=true#step:8:1455)
[example failure 2021-08-30T22:56:14.4376335Z](https://github.com/apache/pulsar/runs/3467152473?check_suite_focus=true#step:8:1456)
[example failure 2021-08-30T22:40:51.4931124Z](https://github.com/apache/pulsar/runs/3467041097?check_suite_focus=true#step:8:3115)
[example failure 2021-08-30T22:37:28.1021565Z](https://github.com/apache/pulsar/runs/3467041097?check_suite_focus=true#step:8:1455)
[example failure 2021-08-30T19:28:44.4258146Z](https://github.com/apache/pulsar/runs/3465551686?check_suite_focus=true#step:8:1455)
[example failure 2021-08-30T17:35:12.0017224Z](https://github.com/apache/pulsar/runs/3464533950?check_suite_focus=true#step:8:3084)
[example failure 2021-08-30T16:54:43.6933225Z](https://github.com/apache/pulsar/runs/3464151126?check_suite_focus=true#step:8:4764)
[example failure 2021-08-30T16:51:53.0714449Z](https://github.com/apache/pulsar/runs/3464151126?check_suite_focus=true#step:8:3089)
[example failure 2021-08-30T16:49:11.1102601Z](https://github.com/apache/pulsar/runs/3464151126?check_suite_focus=true#step:8:1456)
[example failure 2021-08-30T15:07:17.6819591Z](https://github.com/apache/pulsar/runs/3463119556?check_suite_focus=true#step:8:4785)
[example failure 2021-08-30T15:04:35.0296558Z](https://github.com/apache/pulsar/runs/3463119556?check_suite_focus=true#step:8:3140)
[example failure 2021-08-30T15:01:07.3921613Z](https://github.com/apache/pulsar/runs/3463119556?check_suite_focus=true#step:8:1455)
[example failure 2021-08-30T14:44:31.0471143Z](https://github.com/apache/pulsar/runs/3462898842?check_suite_focus=true#step:8:4786)
[example failure 2021-08-30T14:41:24.2295658Z](https://github.com/apache/pulsar/runs/3462898842?check_suite_focus=true#step:8:3095)
[example failure 2021-08-30T14:33:12.9266304Z](https://github.com/apache/pulsar/runs/3462775600?check_suite_focus=true#step:8:4815)
[example failure 2021-08-30T14:29:58.0136043Z](https://github.com/apache/pulsar/runs/3462775600?check_suite_focus=true#step:8:3124)
[example failure 2021-08-30T14:26:39.4765629Z](https://github.com/apache/pulsar/runs/3462775600?check_suite_focus=true#step:8:1455)
[example failure 2021-08-30T14:22:02.8024567Z](https://github.com/apache/pulsar/runs/3462661628?check_suite_focus=true#step:8:4724)
[example failure 2021-08-30T14:19:15.4035146Z](https://github.com/apache/pulsar/runs/3462661628?check_suite_focus=true#step:8:3090)
[example failure 2021-08-30T14:16:26.7177888Z](https://github.com/apache/pulsar/runs/3462661628?check_suite_focus=true#step:8:1456)
[example failure 2021-08-29T03:11:43.2967458Z](https://github.com/apache/pulsar/runs/3453026968?check_suite_focus=true#step:8:1456)
[example failure 2021-08-29T03:05:39.9703674Z](https://github.com/apache/pulsar/runs/3452988226?check_suite_focus=true#step:8:4768)
[example failure 2021-08-29T03:02:27.1221894Z](https://github.com/apache/pulsar/runs/3452988226?check_suite_focus=true#step:8:3099)
[example failure 2021-08-29T02:59:17.4763734Z](https://github.com/apache/pulsar/runs/3452988226?check_suite_focus=true#step:8:1455)
[example failure 2021-08-28T04:16:40.3874002Z](https://github.com/apache/pulsar/runs/3448741077?check_suite_focus=true#step:8:18496)
[example failure 2021-08-28T03:24:36.8698981Z](https://github.com/apache/pulsar/runs/3448741077?check_suite_focus=true#step:8:1462)
[example failure 2021-08-28T02:35:04.3438231Z](https://github.com/apache/pulsar/runs/3448568862?check_suite_focus=true#step:8:4745)
[example failure 2021-08-28T02:32:24.9595774Z](https://github.com/apache/pulsar/runs/3448568862?check_suite_focus=true#step:8:3105)
[example failure 2021-08-28T02:29:45.2024166Z](https://github.com/apache/pulsar/runs/3448568862?check_suite_focus=true#step:8:1456)
[example failure 2021-08-28T02:12:11.7155104Z](https://github.com/apache/pulsar/runs/3448472088?check_suite_focus=true#step:8:4739)
[example failure 2021-08-28T02:08:17.9590927Z](https://github.com/apache/pulsar/runs/3448472088?check_suite_focus=true#step:8:3105)
[example failure 2021-08-28T02:05:16.9128836Z](https://github.com/apache/pulsar/runs/3448472088?check_suite_focus=true#step:8:1456)
[example failure 2021-08-28T00:16:46.4564885Z](https://github.com/apache/pulsar/runs/3448027088?check_suite_focus=true#step:8:4739)
[example failure 2021-08-28T00:14:01.6358525Z](https://github.com/apache/pulsar/runs/3448027088?check_suite_focus=true#step:8:3105)
[example failure 2021-08-28T00:11:15.0613378Z](https://github.com/apache/pulsar/runs/3448027088?check_suite_focus=true#step:8:1461)
[example failure 2021-08-28T00:07:04.3512529Z](https://github.com/apache/pulsar/runs/3447917397?check_suite_focus=true#step:8:8483)
[example failure 2021-08-27T23:45:38.6109759Z](https://github.com/apache/pulsar/runs/3447917397?check_suite_focus=true#step:8:1455)
[example failure 2021-08-27T18:59:43.8456085Z](https://github.com/apache/pulsar/runs/3446249755?check_suite_focus=true#step:8:1455)
[example failure 2021-08-27T15:27:27.5950188Z](https://github.com/apache/pulsar/runs/3444574425?check_suite_focus=true#step:8:4720)
[example failure 2021-08-27T15:21:39.9218790Z](https://github.com/apache/pulsar/runs/3444574425?check_suite_focus=true#step:8:1460)
[example failure 2021-08-27T15:08:56.9480722Z](https://github.com/apache/pulsar/runs/3444389116?check_suite_focus=true#step:8:4764)
[example failure 2021-08-27T15:06:14.0802872Z](https://github.com/apache/pulsar/runs/3444389116?check_suite_focus=true#step:8:3132)
[example failure 2021-08-27T15:02:26.9724575Z](https://github.com/apache/pulsar/runs/3444389116?check_suite_focus=true#step:8:1454)
[example failure 2021-08-27T11:26:10.4957335Z](https://github.com/apache/pulsar/runs/3442570175?check_suite_focus=true#step:8:3086)
[example failure 2021-08-27T11:24:36.1809037Z](https://github.com/apache/pulsar/runs/3442396885?check_suite_focus=true#step:8:8535)
[example failure 2021-08-27T11:23:48.6210133Z](https://github.com/apache/pulsar/runs/3442570175?check_suite_focus=true#step:8:1455)
[example failure 2021-08-27T11:01:48.6449616Z](https://github.com/apache/pulsar/runs/3442396885?check_suite_focus=true#step:8:1454)
[example failure 2021-08-27T10:55:02.9424653Z](https://github.com/apache/pulsar/runs/3442314900?check_suite_focus=true#step:8:4725)
[example failure 2021-08-27T10:49:11.4494710Z](https://github.com/apache/pulsar/runs/3442314900?check_suite_focus=true#step:8:1466)
[example failure 2021-08-27T10:42:36.1787437Z](https://github.com/apache/pulsar/runs/3442216685?check_suite_focus=true#step:8:4734)
[example failure 2021-08-27T10:39:29.6525495Z](https://github.com/apache/pulsar/runs/3442216685?check_suite_focus=true#step:8:3091)
[example failure 2021-08-27T09:04:11.8274995Z](https://github.com/apache/pulsar/runs/3441486716?check_suite_focus=true#step:8:1460)
[example failure 2021-08-27T09:00:02.4668751Z](https://github.com/apache/pulsar/runs/3441276090?check_suite_focus=true#step:8:8500)
[example failure 2021-08-27T08:56:36.5301827Z](https://github.com/apache/pulsar/runs/3441276090?check_suite_focus=true#step:8:6858)
[example failure 2021-08-27T08:29:43.8099619Z](https://github.com/apache/pulsar/runs/3441181104?check_suite_focus=true#step:8:4729)
[example failure 2021-08-27T08:26:36.7816261Z](https://github.com/apache/pulsar/runs/3441181104?check_suite_focus=true#step:8:3097)
[example failure 2021-08-27T08:24:28.4914466Z](https://github.com/apache/pulsar/runs/3441166427?check_suite_focus=true#step:8:3102)
[example failure 2021-08-27T08:21:54.1998457Z](https://github.com/apache/pulsar/runs/3441166427?check_suite_focus=true#step:8:1454)
[example failure 2021-08-27T08:03:45.9190458Z](https://github.com/apache/pulsar/runs/3440980411?check_suite_focus=true#step:8:4763)
[example failure 2021-08-27T08:01:08.4341143Z](https://github.com/apache/pulsar/runs/3440980411?check_suite_focus=true#step:8:3127)
[example failure 2021-08-27T07:58:32.8881241Z](https://github.com/apache/pulsar/runs/3440980411?check_suite_focus=true#step:8:1455)
[example failure 2021-08-27T07:48:30.7437419Z](https://github.com/apache/pulsar/runs/3440855173?check_suite_focus=true#step:8:1455)
[example failure 2021-08-27T07:38:38.5932397Z](https://github.com/apache/pulsar/runs/3440826598?check_suite_focus=true#step:8:3096)
[example failure 2021-08-27T07:35:56.7577821Z](https://github.com/apache/pulsar/runs/3440826598?check_suite_focus=true#step:8:1455)
[example failure 2021-08-27T07:28:04.1509540Z](https://github.com/apache/pulsar/runs/3440736597?check_suite_focus=true#step:8:4785)
[example failure 2021-08-27T07:25:27.0554858Z](https://github.com/apache/pulsar/runs/3440736597?check_suite_focus=true#step:8:3143)
[example failure 2021-08-27T07:22:49.6464422Z](https://github.com/apache/pulsar/runs/3440736597?check_suite_focus=true#step:8:1460)
[example failure 2021-08-27T07:17:57.3527373Z](https://github.com/apache/pulsar/runs/3440662193?check_suite_focus=true#step:8:4798)
[example failure 2021-08-27T07:14:57.2691005Z](https://github.com/apache/pulsar/runs/3440662193?check_suite_focus=true#step:8:3121)
[example failure 2021-08-27T07:12:22.5523391Z](https://github.com/apache/pulsar/runs/3440662193?check_suite_focus=true#step:8:1454)
[example failure 2021-08-27T07:08:05.1475180Z](https://github.com/apache/pulsar/runs/3440456735?check_suite_focus=true#step:8:8480)
[example failure 2021-08-27T06:40:04.2566138Z](https://github.com/apache/pulsar/runs/3440456735?check_suite_focus=true#step:8:1454)
[example failure 2021-08-27T06:36:55.5237046Z](https://github.com/apache/pulsar/runs/3440410957?check_suite_focus=true#step:8:4733)
[example failure 2021-08-27T06:34:18.7018912Z](https://github.com/apache/pulsar/runs/3440410957?check_suite_focus=true#step:8:3101)
[example failure 2021-08-27T06:31:47.7724633Z](https://github.com/apache/pulsar/runs/3440410957?check_suite_focus=true#step:8:1463)
[example failure 2021-08-27T06:30:31.9841322Z](https://github.com/apache/pulsar/runs/3440270116?check_suite_focus=true#step:8:8491)
[example failure 2021-08-27T05:40:42.9498618Z](https://github.com/apache/pulsar/runs/3440109884?check_suite_focus=true#step:8:3097)
[example failure 2021-08-27T05:37:19.4397756Z](https://github.com/apache/pulsar/runs/3440109884?check_suite_focus=true#step:8:1454)
[example failure 2021-08-27T05:23:37.8052203Z](https://github.com/apache/pulsar/runs/3440010092?check_suite_focus=true#step:8:4758)
[example failure 2021-08-27T05:20:32.6850554Z](https://github.com/apache/pulsar/runs/3440010092?check_suite_focus=true#step:8:3091)
[example failure 2021-08-27T00:45:52.0024589Z](https://github.com/apache/pulsar/runs/3438608620?check_suite_focus=true#step:8:3098)
[example failure 2021-08-26T08:26:05.0315021Z](https://github.com/apache/pulsar/runs/3430539999?check_suite_focus=true#step:8:3097)
[example failure 2021-08-26T08:23:24.4427600Z](https://github.com/apache/pulsar/runs/3430539999?check_suite_focus=true#step:8:1455)
[example failure 2021-08-26T07:21:00.3716907Z](https://github.com/apache/pulsar/runs/3430063512?check_suite_focus=true#step:8:1455)
[example failure 2021-08-26T07:15:13.0266987Z](https://github.com/apache/pulsar/runs/3429971992?check_suite_focus=true#step:8:4713)
[example failure 2021-08-26T07:10:05.2536276Z](https://github.com/apache/pulsar/runs/3429971992?check_suite_focus=true#step:8:1455)
[example failure 2021-08-26T06:58:06.5581365Z](https://github.com/apache/pulsar/runs/3429891881?check_suite_focus=true#step:8:1461)
[example failure 2021-08-25T16:45:08.9779223Z](https://github.com/apache/pulsar/runs/3424390371?check_suite_focus=true#step:8:1455)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.<init>(ZKMetadataStore.java:84)
	at org.apache.pulsar.metadata.api.MetadataStoreFactory.create(MetadataStoreFactory.java:48)
	at org.apache.pulsar.metadata.api.extended.MetadataStoreExtended.create(MetadataStoreExtended.java:42)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:190)
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
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:102)
	at org.apache.bookkeeper.zookeeper.ZooKeeperWatcherBase.waitForConnection(ZooKeeperWatcherBase.java:159)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$Builder.build(PulsarZooKeeperClient.java:262)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.<init>(ZKMetadataStore.java:80)
	... 15 more

</pre></code>
</details>

[example failure 2021-08-26T08:28:43.0540552Z](https://github.com/apache/pulsar/runs/3430539999?check_suite_focus=true#step:8:4728)


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
org.apache.pulsar.metadata.api.MetadataStoreException: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.<init>(ZKMetadataStore.java:84)
	at org.apache.pulsar.metadata.api.MetadataStoreFactory.create(MetadataStoreFactory.java:48)
	at org.apache.pulsar.metadata.api.extended.MetadataStoreExtended.create(MetadataStoreExtended.java:42)
	at org.apache.pulsar.metadata.LockManagerTest.revalidateLockOnDifferentSession(LockManagerTest.java:190)
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
Caused by: org.apache.zookeeper.KeeperException$ConnectionLossException: KeeperErrorCode = ConnectionLoss
	at org.apache.zookeeper.KeeperException.create(KeeperException.java:102)
	at org.apache.bookkeeper.zookeeper.ZooKeeperWatcherBase.waitForConnection(ZooKeeperWatcherBase.java:159)
	at org.apache.pulsar.metadata.impl.PulsarZooKeeperClient$Builder.build(PulsarZooKeeperClient.java:262)
	at org.apache.pulsar.metadata.impl.ZKMetadataStore.<init>(ZKMetadataStore.java:80)
	... 15 more

The command has failed after 3 attempts.
</pre></code>
</details>

