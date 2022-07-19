        
Flaky-test: org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaThreadTest.testJavaLoggingFunction
Number of failures: 92

org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaThreadTest is flaky. The testJavaLoggingFunction test method fails sporadically.

```
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.api.Message.getValue()" because "msg" is null
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.publishAndConsumeMessages(PulsarFunctionsTest.java:1588)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testLoggingFunction(PulsarFunctionsTest.java:1507)
	at org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testJavaLoggingFunction(PulsarFunctionsJavaTest.java:111)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-13T04:19:47.9819420Z](https://github.com/apache/pulsar/runs/6854937592?check_suite_focus=true#step:11:15500)  
[example failure 2022-06-10T18:47:08.7177030Z](https://github.com/apache/pulsar/runs/6836159745?check_suite_focus=true#step:11:15381)  
[example failure 2022-06-10T06:01:53.8449621Z](https://github.com/apache/pulsar/runs/6825606587?check_suite_focus=true#step:11:15576)  
[example failure 2022-06-10T02:48:43.7379144Z](https://github.com/apache/pulsar/runs/6823945554?check_suite_focus=true#step:11:26250)  
[example failure 2022-06-10T02:36:04.7904629Z](https://github.com/apache/pulsar/runs/6823945554?check_suite_focus=true#step:11:15785)  
[example failure 2022-06-10T01:17:38.8970569Z](https://github.com/apache/pulsar/runs/6823122272?check_suite_focus=true#step:11:36393)  
[example failure 2022-06-10T01:06:48.0052953Z](https://github.com/apache/pulsar/runs/6823122272?check_suite_focus=true#step:11:25868)  
[example failure 2022-06-10T00:56:00.4211704Z](https://github.com/apache/pulsar/runs/6823122272?check_suite_focus=true#step:11:15497)  
[example failure 2022-06-09T17:43:17.7468967Z](https://github.com/apache/pulsar/runs/6817776971?check_suite_focus=true#step:11:15309)  
[example failure 2022-06-09T17:41:38.0148575Z](https://github.com/apache/pulsar/runs/6817569418?check_suite_focus=true#step:11:25892)  
[example failure 2022-06-09T17:30:11.5663981Z](https://github.com/apache/pulsar/runs/6817569418?check_suite_focus=true#step:11:15574)  
[example failure 2022-06-09T16:36:00.1406443Z](https://github.com/apache/pulsar/runs/6816143252?check_suite_focus=true#step:11:36625)  
[example failure 2022-06-09T16:22:15.7425533Z](https://github.com/apache/pulsar/runs/6816143252?check_suite_focus=true#step:11:26249)  
[example failure 2022-06-09T16:08:30.3619906Z](https://github.com/apache/pulsar/runs/6816143252?check_suite_focus=true#step:11:15572)  
[example failure 2022-06-09T14:57:55.5169652Z](https://github.com/apache/pulsar/runs/6814912168?check_suite_focus=true#step:11:15474)  
[example failure 2022-06-09T10:23:55.6514072Z](https://github.com/apache/pulsar/runs/6809787540?check_suite_focus=true#step:11:37967)  
[example failure 2022-06-09T10:12:42.7597880Z](https://github.com/apache/pulsar/runs/6809787540?check_suite_focus=true#step:11:27451)  
[example failure 2022-06-09T10:00:21.9386503Z](https://github.com/apache/pulsar/runs/6809787540?check_suite_focus=true#step:11:15441)  
[example failure 2022-06-09T09:32:37.0953642Z](https://github.com/apache/pulsar/runs/6808923731?check_suite_focus=true#step:11:15767)  
[example failure 2022-06-09T09:26:07.6326567Z](https://github.com/apache/pulsar/runs/6808876900?check_suite_focus=true#step:11:38076)  
[example failure 2022-06-09T09:15:46.9931550Z](https://github.com/apache/pulsar/runs/6808720825?check_suite_focus=true#step:11:35849)  
[example failure 2022-06-09T09:12:12.7663894Z](https://github.com/apache/pulsar/runs/6808876900?check_suite_focus=true#step:11:25789)  
[example failure 2022-06-09T09:03:43.2371200Z](https://github.com/apache/pulsar/runs/6808720825?check_suite_focus=true#step:11:25587)  
[example failure 2022-06-09T08:59:51.5356515Z](https://github.com/apache/pulsar/runs/6808876900?check_suite_focus=true#step:11:15247)  
[example failure 2022-06-09T08:51:42.0720399Z](https://github.com/apache/pulsar/runs/6808720825?check_suite_focus=true#step:11:15360)  
[example failure 2022-06-09T03:22:36.1610655Z](https://github.com/apache/pulsar/runs/6805195693?check_suite_focus=true#step:11:35997)  
[example failure 2022-06-09T03:11:41.9929006Z](https://github.com/apache/pulsar/runs/6805195693?check_suite_focus=true#step:11:25659)  
[example failure 2022-06-09T03:00:49.1864399Z](https://github.com/apache/pulsar/runs/6805195693?check_suite_focus=true#step:11:15252)  
[example failure 2022-06-09T01:19:02.7574393Z](https://github.com/apache/pulsar/runs/6804205558?check_suite_focus=true#step:11:36010)  
[example failure 2022-06-09T01:06:47.9105756Z](https://github.com/apache/pulsar/runs/6804205558?check_suite_focus=true#step:11:25646)  
[example failure 2022-06-09T00:54:35.0120375Z](https://github.com/apache/pulsar/runs/6804205558?check_suite_focus=true#step:11:15291)  
[example failure 2022-06-09T00:33:44.6591550Z](https://github.com/apache/pulsar/runs/6803986305?check_suite_focus=true#step:11:17270)  
[example failure 2022-06-09T00:29:46.8507139Z](https://github.com/apache/pulsar/runs/6803777298?check_suite_focus=true#step:11:36230)  
[example failure 2022-06-09T00:18:53.2038199Z](https://github.com/apache/pulsar/runs/6803777298?check_suite_focus=true#step:11:25943)  
[example failure 2022-06-09T00:07:41.8220218Z](https://github.com/apache/pulsar/runs/6803777298?check_suite_focus=true#step:11:15465)  
[example failure 2022-06-08T17:41:11.8591487Z](https://github.com/apache/pulsar/runs/6798647982?check_suite_focus=true#step:11:15420)  
[example failure 2022-06-08T16:11:25.1506915Z](https://github.com/apache/pulsar/runs/6796769759?check_suite_focus=true#step:11:36322)  
[example failure 2022-06-08T15:58:48.3807156Z](https://github.com/apache/pulsar/runs/6796769759?check_suite_focus=true#step:11:25889)  
[example failure 2022-06-08T15:45:54.5815527Z](https://github.com/apache/pulsar/runs/6796769759?check_suite_focus=true#step:11:15535)  
[example failure 2022-06-08T15:25:12.8957918Z](https://github.com/apache/pulsar/runs/6796371332?check_suite_focus=true#step:11:15472)  
[example failure 2022-06-08T10:08:21.0867565Z](https://github.com/apache/pulsar/runs/6790882203?check_suite_focus=true#step:11:25751)  
[example failure 2022-06-08T09:57:03.3321930Z](https://github.com/apache/pulsar/runs/6790882203?check_suite_focus=true#step:11:15351)  
[example failure 2022-06-07T14:37:02.2255219Z](https://github.com/apache/pulsar/runs/6775730053?check_suite_focus=true#step:11:15459)  
[example failure 2022-06-07T07:35:24.5144607Z](https://github.com/apache/pulsar/runs/6769117688?check_suite_focus=true#step:11:25632)  
[example failure 2022-06-07T07:24:20.4368012Z](https://github.com/apache/pulsar/runs/6769117688?check_suite_focus=true#step:11:15165)  
[example failure 2022-06-07T05:32:42.8230322Z](https://github.com/apache/pulsar/runs/6767820771?check_suite_focus=true#step:11:27255)  
[example failure 2022-06-07T05:19:28.3404234Z](https://github.com/apache/pulsar/runs/6767820771?check_suite_focus=true#step:11:15330)  
[example failure 2022-06-07T03:22:38.4252446Z](https://github.com/apache/pulsar/runs/6766549572?check_suite_focus=true#step:11:36459)  
[example failure 2022-06-07T03:09:52.7109041Z](https://github.com/apache/pulsar/runs/6766549572?check_suite_focus=true#step:11:26053)  
[example failure 2022-06-07T02:57:00.4620205Z](https://github.com/apache/pulsar/runs/6766549572?check_suite_focus=true#step:11:15454)  
[example failure 2022-06-06T17:04:46.9751612Z](https://github.com/apache/pulsar/runs/6758945470?check_suite_focus=true#step:11:36684)  
[example failure 2022-06-06T16:51:20.6420266Z](https://github.com/apache/pulsar/runs/6758945470?check_suite_focus=true#step:11:25993)  
[example failure 2022-06-06T16:38:02.5064513Z](https://github.com/apache/pulsar/runs/6758945470?check_suite_focus=true#step:11:15562)  
[example failure 2022-06-06T12:55:06.0388149Z](https://github.com/apache/pulsar/runs/6755461657?check_suite_focus=true#step:11:15297)  
[example failure 2022-06-06T10:52:15.5436473Z](https://github.com/apache/pulsar/runs/6753976874?check_suite_focus=true#step:11:15375)  
[example failure 2022-06-06T10:19:34.8995913Z](https://github.com/apache/pulsar/runs/6753292309?check_suite_focus=true#step:11:25824)  
[example failure 2022-06-06T10:08:03.1000480Z](https://github.com/apache/pulsar/runs/6753292309?check_suite_focus=true#step:11:15552)  
[example failure 2022-06-04T20:02:12.7140601Z](https://github.com/apache/pulsar/runs/6740368588?check_suite_focus=true#step:11:15441)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.api.Message.getValue()" because "msg" is null
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.publishAndConsumeMessages(PulsarFunctionsTest.java:1588)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testLoggingFunction(PulsarFunctionsTest.java:1507)
	at org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testJavaLoggingFunction(PulsarFunctionsJavaTest.java:111)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

```
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.api.Message.getValue()" because "msg" is null
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.publishAndConsumeMessages(PulsarFunctionsTest.java:1590)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testLoggingFunction(PulsarFunctionsTest.java:1509)
	at org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testJavaLoggingFunction(PulsarFunctionsJavaTest.java:111)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-18T23:26:56.7647184Z](https://github.com/apache/pulsar/runs/7399610677?check_suite_focus=true#step:11:14842)  
[example failure 2022-07-18T16:15:00.2371652Z](https://github.com/apache/pulsar/runs/7393199016?check_suite_focus=true#step:11:14806)  
[example failure 2022-07-18T07:57:51.6654857Z](https://github.com/apache/pulsar/runs/7384930246?check_suite_focus=true#step:11:16252)  
[example failure 2022-07-18T04:07:38.5353857Z](https://github.com/apache/pulsar/runs/7382714766?check_suite_focus=true#step:11:16215)  
[example failure 2022-07-16T14:56:33.4218486Z](https://github.com/apache/pulsar/runs/7371189595?check_suite_focus=true#step:11:14902)  
[example failure 2022-07-16T04:06:17.5770979Z](https://github.com/apache/pulsar/runs/7367995755?check_suite_focus=true#step:11:14748)  
[example failure 2022-07-15T15:06:12.3184449Z](https://github.com/apache/pulsar/runs/7359049560?check_suite_focus=true#step:11:14881)  
[example failure 2022-07-15T11:51:39.1678376Z](https://github.com/apache/pulsar/runs/7356101824?check_suite_focus=true#step:11:15008)  
[example failure 2022-07-15T07:55:23.3013291Z](https://github.com/apache/pulsar/runs/7353793418?check_suite_focus=true#step:11:14771)  
[example failure 2022-07-15T07:03:52.2684121Z](https://github.com/apache/pulsar/runs/7353306567?check_suite_focus=true#step:11:14805)  
[example failure 2022-07-15T06:53:37.7183449Z](https://github.com/apache/pulsar/runs/7353151617?check_suite_focus=true#step:11:14857)  
[example failure 2022-07-15T06:31:09.7249027Z](https://github.com/apache/pulsar/runs/7352803596?check_suite_focus=true#step:11:14903)  
[example failure 2022-07-15T06:12:12.5654766Z](https://github.com/apache/pulsar/runs/7352377885?check_suite_focus=true#step:11:14901)  
[example failure 2022-07-15T03:27:59.4656813Z](https://github.com/apache/pulsar/runs/7351335385?check_suite_focus=true#step:11:14958)  
[example failure 2022-07-14T15:22:52.8947730Z](https://github.com/apache/pulsar/runs/7342638018?check_suite_focus=true#step:11:16551)  
[example failure 2022-07-14T11:41:30.6877817Z](https://github.com/apache/pulsar/runs/7338901321?check_suite_focus=true#step:11:15009)  
[example failure 2022-07-13T14:50:04.6691563Z](https://github.com/apache/pulsar/runs/7321858711?check_suite_focus=true#step:11:14771)  
[example failure 2022-07-13T04:06:28.3807447Z](https://github.com/apache/pulsar/runs/7313999877?check_suite_focus=true#step:11:14901)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.api.Message.getValue()" because "msg" is null
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.publishAndConsumeMessages(PulsarFunctionsTest.java:1590)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testLoggingFunction(PulsarFunctionsTest.java:1509)
	at org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testJavaLoggingFunction(PulsarFunctionsJavaTest.java:111)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

```
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.api.Message.getValue()" because "msg" is null
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.publishAndConsumeMessages(PulsarFunctionsTest.java:1583)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testLoggingFunction(PulsarFunctionsTest.java:1506)
	at org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testJavaLoggingFunction(PulsarFunctionsJavaTest.java:111)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-06-03T07:47:30.2889515Z](https://github.com/apache/pulsar/runs/6721931367?check_suite_focus=true#step:11:15323)  
[example failure 2022-06-03T02:07:06.0987787Z](https://github.com/apache/pulsar/runs/6718951498?check_suite_focus=true#step:11:25672)  
[example failure 2022-06-03T01:55:42.6224642Z](https://github.com/apache/pulsar/runs/6718951498?check_suite_focus=true#step:11:15466)  
[example failure 2022-06-02T03:03:32.5508071Z](https://github.com/apache/pulsar/runs/6701295057?check_suite_focus=true#step:11:35966)  
[example failure 2022-06-02T02:52:09.8328706Z](https://github.com/apache/pulsar/runs/6701295057?check_suite_focus=true#step:11:25726)  
[example failure 2022-06-02T02:40:50.6728587Z](https://github.com/apache/pulsar/runs/6701295057?check_suite_focus=true#step:11:15268)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.api.Message.getValue()" because "msg" is null
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.publishAndConsumeMessages(PulsarFunctionsTest.java:1583)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testLoggingFunction(PulsarFunctionsTest.java:1506)
	at org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testJavaLoggingFunction(PulsarFunctionsJavaTest.java:111)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

```
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.api.Message.getValue()" because "msg" is null
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.publishAndConsumeMessages(PulsarFunctionsTest.java:1589)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testLoggingFunction(PulsarFunctionsTest.java:1508)
	at org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testJavaLoggingFunction(PulsarFunctionsJavaTest.java:111)
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2022-07-08T01:03:45.0666186Z](https://github.com/apache/pulsar/runs/7243856905?check_suite_focus=true#step:11:14871)  
[example failure 2022-07-07T10:42:00.4793018Z](https://github.com/apache/pulsar/runs/7231498832?check_suite_focus=true#step:11:15023)  
[example failure 2022-07-07T10:24:10.8542094Z](https://github.com/apache/pulsar/runs/7230774261?check_suite_focus=true#step:11:35173)  
[example failure 2022-07-07T10:11:27.6792704Z](https://github.com/apache/pulsar/runs/7230774261?check_suite_focus=true#step:11:25073)  
[example failure 2022-07-07T09:58:43.5474211Z](https://github.com/apache/pulsar/runs/7230774261?check_suite_focus=true#step:11:15143)  
[example failure 2022-07-07T08:32:11.1033505Z](https://github.com/apache/pulsar/runs/7229163999?check_suite_focus=true#step:11:15008)  
[example failure 2022-07-06T12:40:00.2835743Z](https://github.com/apache/pulsar/runs/7214143903?check_suite_focus=true#step:11:36335)  
[example failure 2022-07-06T12:28:11.2648165Z](https://github.com/apache/pulsar/runs/7214143903?check_suite_focus=true#step:11:26372)  
[example failure 2022-07-06T12:15:00.7736070Z](https://github.com/apache/pulsar/runs/7214143903?check_suite_focus=true#step:11:15014)  
[example failure 2022-07-04T02:18:45.7430947Z](https://github.com/apache/pulsar/runs/7173062225?check_suite_focus=true#step:11:15172)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.NullPointerException: Cannot invoke "org.apache.pulsar.client.api.Message.getValue()" because "msg" is null
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.publishAndConsumeMessages(PulsarFunctionsTest.java:1589)
	at org.apache.pulsar.tests.integration.functions.PulsarFunctionsTest.testLoggingFunction(PulsarFunctionsTest.java:1508)
	at org.apache.pulsar.tests.integration.functions.java.PulsarFunctionsJavaTest.testJavaLoggingFunction(PulsarFunctionsJavaTest.java:111)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:132)
	at org.testng.internal.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:45)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:73)
	at org.testng.internal.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

