        
Flaky-test: org.apache.pulsar.broker.stats.MetadataStoreStatsTest.testMetadataStoreStats
Number of failures: 8

org.apache.pulsar.broker.stats.MetadataStoreStatsTest is flaky. The testMetadataStoreStats test method fails sporadically.

```
java.lang.AssertionError:
Assertion failed with metrics:
# TYPE pulsar_resource_group_calculated_messages_quota counter
# TYPE pulsar_txn_tp_committed_count counter
# TYPE pulsar_broker_lookup_pending_requests gauge
pulsar_broker_lookup_pending_requests{cluster="test"} 0.0
# TYPE jvm_info gauge
jvm_info{cluster="test",runtime="OpenJDK Runtime Environment",vendor="Eclipse Adoptium",version="17.0.5+8"} 1.0
# TYPE brk_ledgeroffloader_read_bytes counter
# TYPE pulsar_ml_cache_pendingreads_entries_read counter
pulsar_ml_cache_pendingreads_entries_read_total{cluster="test"} 11965.0
pulsar_ml_cache_pendingreads_entries_read_created{cluster="test"} 1.675329175942E9
# TYPE pulsar_resource_group_bytes_used counter
# TYPE pulsar_broker_pending_bytes_to_dispatch gauge
pulsar_broker_pending_bytes_to_dispatch{cluster="test"} 0.0
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-02T09:30:30.8637751Z](https://github.com/apache/pulsar/actions/runs/4072071397/jobs/7016199219#step:10:1277)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError:
Assertion failed with metrics:
# TYPE pulsar_resource_group_calculated_messages_quota counter
# TYPE pulsar_txn_tp_committed_count counter
# TYPE pulsar_broker_lookup_pending_requests gauge
pulsar_broker_lookup_pending_requests{cluster="test"} 0.0
# TYPE jvm_info gauge
jvm_info{cluster="test",runtime="OpenJDK Runtime Environment",vendor="Eclipse Adoptium",version="17.0.5+8"} 1.0
# TYPE brk_ledgeroffloader_read_bytes counter
# TYPE pulsar_ml_cache_pendingreads_entries_read counter
pulsar_ml_cache_pendingreads_entries_read_total{cluster="test"} 11965.0
pulsar_ml_cache_pendingreads_entries_read_created{cluster="test"} 1.675329175942E9
# TYPE pulsar_resource_group_bytes_used counter
# TYPE pulsar_broker_pending_bytes_to_dispatch gauge
pulsar_broker_pending_bytes_to_dispatch{cluster="test"} 0.0
# TYPE jvm_memory_pool_allocated_bytes counter
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'profiled nmethods'"} 7.684901888E9
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'profiled nmethods'"} 1.67532944597E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="ZHeap"} 8.0209772544E10
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="ZHeap"} 1.67532944597E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 3.497597568E9
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 1.67532944597E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="Compressed Class Space"} 1.983553568E9
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="Compressed Class Space"} 1.67532944597E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="Metaspace"} 1.7578943656E10
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="Metaspace"} 1.67532944597E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'non-nmethods'"} 3.45592192E8
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'non-nmethods'"} 1.67532944597E9
# TYPE pulsar_resource_group_calculated_bytes_quota counter
# TYPE pulsar_metadata_store_ops_latency_ms histogram
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="del",status="fail"} 1.675330226201E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 1.675330226208E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="del",status="success"} 1.675330226201E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 1.675330226208E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="get",status="fail"} 1.675330058618E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 1.675330226208E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="1.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="3.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="5.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="10.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="20.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="50.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="100.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="200.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="500.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="1000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="2000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="5000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="+Inf"} 7.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="get",status="success"} 7.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="get",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="get",status="success"} 1.675330058618E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="put",status="fail"} 1.675330058618E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="1.0"} 3.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="3.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="5.0"} 12.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="10.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="20.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="50.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="100.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="200.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="500.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="1000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="2000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="5000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="+Inf"} 16.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="get",status="success"} 16.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="get",status="success"} 66.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="get",status="success"} 1.675330226208E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="del",status="fail"} 1.675330058618E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="put",status="fail"} 1.675330226201E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="1.0"} 1.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="3.0"} 4.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="5.0"} 23.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="10.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="20.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="50.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="100.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="200.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="500.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="1000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="2000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="5000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="+Inf"} 28.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="get",status="success"} 28.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="get",status="success"} 135.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="get",status="success"} 1.675330226201E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="get",status="fail"} 1.675330226201E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="del",status="success"} 1.675330058618E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="1.0"} 6.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="3.0"} 10.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="5.0"} 14.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="10.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="20.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="50.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="100.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="200.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="500.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="1000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="2000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="5000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="+Inf"} 15.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="put",status="success"} 15.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="put",status="success"} 37.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="put",status="success"} 1.675330226201E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="1.0"} 50.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="3.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="5.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="10.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="20.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="50.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="100.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="200.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="500.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="1000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="2000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="5000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="+Inf"} 52.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="put",status="success"} 52.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="put",status="success"} 6.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="put",status="success"} 1.675330058618E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="del",status="success"} 1.675330226208E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="1.0"} 1.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="3.0"} 2.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="5.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="10.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="20.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="50.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="100.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="200.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="500.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="1000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="2000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="5000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="+Inf"} 5.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="put",status="success"} 5.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="put",status="success"} 16.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="put",status="success"} 1.675330226208E9
# TYPE pulsar_batch_metadata_store_batch_execute_time_ms histogram
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 14.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 15.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_count{cluster="test",name="configuration-metadata-store"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_sum{cluster="test",name="configuration-metadata-store"} 25.0
pulsar_batch_metadata_store_batch_execute_time_ms_created{cluster="test",name="configuration-metadata-store"} 1.675330226211E9
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="1.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="5.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="10.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="20.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="50.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="100.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="200.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="500.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="1000.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="+Inf"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_count{cluster="test",name="metadata-store"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_sum{cluster="test",name="metadata-store"} 1.0
pulsar_batch_metadata_store_batch_execute_time_ms_created{cluster="test",name="metadata-store"} 1.675330226204E9
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_right counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_right_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_right_created{cluster="test"} 1.675329175942E9
# TYPE topic_load_times summary
topic_load_times{cluster="test",quantile="0.5"} NaN
topic_load_times{cluster="test",quantile="0.75"} NaN
topic_load_times{cluster="test",quantile="0.95"} NaN
topic_load_times{cluster="test",quantile="0.99"} NaN
topic_load_times{cluster="test",quantile="0.999"} NaN
topic_load_times{cluster="test",quantile="0.9999"} NaN
topic_load_times_count{cluster="test"} 2.0
topic_load_times_sum{cluster="test"} 2710.0
topic_load_times_created{cluster="test"} 1.675329137399E9
# TYPE pulsar_ml_reads_inflight_bytes gauge
pulsar_ml_reads_inflight_bytes{cluster="test"} -1.0
# TYPE pulsar_resource_group_updates counter
# TYPE jvm_memory_direct_bytes_used gauge
jvm_memory_direct_bytes_used{cluster="test"} 1.9104221E7
# TYPE jvm_threads_current gauge
jvm_threads_current{cluster="test"} 189.0
# TYPE jvm_threads_daemon gauge
jvm_threads_daemon{cluster="test"} 84.0
# TYPE jvm_threads_peak gauge
jvm_threads_peak{cluster="test"} 614.0
# TYPE jvm_threads_started counter
jvm_threads_started_total{cluster="test"} 11221.0
# TYPE jvm_threads_deadlocked gauge
jvm_threads_deadlocked{cluster="test"} 0.0
# TYPE jvm_threads_deadlocked_monitor gauge
jvm_threads_deadlocked_monitor{cluster="test"} 0.0
# TYPE jvm_threads_state gauge
jvm_threads_state{cluster="test",state="NEW"} 0.0
jvm_threads_state{cluster="test",state="TERMINATED"} 0.0
jvm_threads_state{cluster="test",state="RUNNABLE"} 38.0
jvm_threads_state{cluster="test",state="BLOCKED"} 0.0
jvm_threads_state{cluster="test",state="WAITING"} 66.0
jvm_threads_state{cluster="test",state="TIMED_WAITING"} 85.0
jvm_threads_state{cluster="test",state="UNKNOWN"} 0.0
# TYPE pulsar_batch_metadata_store_queue_wait_time_ms histogram
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 5.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 22.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_count{cluster="test",name="configuration-metadata-store"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_sum{cluster="test",name="configuration-metadata-store"} 88.0
pulsar_batch_metadata_store_queue_wait_time_ms_created{cluster="test",name="configuration-metadata-store"} 1.675330226211E9
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="1.0"} 7.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="5.0"} 42.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="10.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="20.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="50.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="100.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="200.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="500.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="1000.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="+Inf"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_count{cluster="test",name="metadata-store"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_sum{cluster="test",name="metadata-store"} 187.0
pulsar_batch_metadata_store_queue_wait_time_ms_created{cluster="test",name="metadata-store"} 1.675330226204E9
# TYPE pulsar_batch_metadata_store_batch_size histogram
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 11.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 17.0
pulsar_batch_metadata_store_batch_size_count{cluster="test",name="configuration-metadata-store"} 17.0
pulsar_batch_metadata_store_batch_size_sum{cluster="test",name="configuration-metadata-store"} 24.0
pulsar_batch_metadata_store_batch_size_created{cluster="test",name="configuration-metadata-store"} 1.675330226211E9
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="1.0"} 30.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="5.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="10.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="20.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="50.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="100.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="200.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="500.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="1000.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="+Inf"} 37.0
pulsar_batch_metadata_store_batch_size_count{cluster="test",name="metadata-store"} 37.0
pulsar_batch_metadata_store_batch_size_sum{cluster="test",name="metadata-store"} 48.0
pulsar_batch_metadata_store_batch_size_created{cluster="test",name="metadata-store"} 1.675330226204E9
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_left counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_left_total{cluster="test"} 173.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_left_created{cluster="test"} 1.675329175942E9
# TYPE process_cpu_seconds counter
process_cpu_seconds_total{cluster="test"} 475.09
# TYPE process_start_time_seconds gauge
process_start_time_seconds{cluster="test"} 1.675329088621E9
# TYPE process_open_fds gauge
process_open_fds{cluster="test"} 654.0
# TYPE process_max_fds gauge
process_max_fds{cluster="test"} 65536.0
# TYPE process_virtual_memory_bytes gauge
process_virtual_memory_bytes{cluster="test"} 6.3229612032E10
# TYPE process_resident_memory_bytes gauge
process_resident_memory_bytes{cluster="test"} 3.568582656E9
# TYPE pulsar_metadata_store_put_bytes counter
pulsar_metadata_store_put_bytes_total{cluster="test",name="configuration-metadata-store"} 2280.0
pulsar_metadata_store_put_bytes_created{cluster="test",name="configuration-metadata-store"} 1.675330226208E9
pulsar_metadata_store_put_bytes_total{cluster="test",name="metadata-store"} 1933.0
pulsar_metadata_store_put_bytes_created{cluster="test",name="metadata-store"} 1.675330226201E9
pulsar_metadata_store_put_bytes_total{cluster="test",name=""} 985.0
pulsar_metadata_store_put_bytes_created{cluster="test",name=""} 1.675330058618E9
# TYPE pulsar_broker_throttled_connections gauge
pulsar_broker_throttled_connections{cluster="test"} 0.0
# TYPE pulsar_txn_tp_aborted_count counter
# TYPE pulsar_broker_topic_load_pending_requests gauge
pulsar_broker_topic_load_pending_requests{cluster="test"} 0.0
# TYPE pulsar_authentication_success counter
pulsar_authentication_success_total{cluster="test",provider_name="AuthenticationProviderTls",auth_method="tls"} 6.0
pulsar_authentication_success_created{cluster="test",provider_name="AuthenticationProviderTls",auth_method="tls"} 1.67532952367E9
# TYPE pulsar_broker_throttled_connections_global_limit gauge
pulsar_broker_throttled_connections_global_limit{cluster="test"} 0.0
# TYPE pulsar_ml_cache_pendingreads_matched_included counter
pulsar_ml_cache_pendingreads_matched_included_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_included_created{cluster="test"} 1.675329175942E9
# TYPE pulsar_resource_group_namespace_unregisters counter
# TYPE jvm_gc_collection_seconds summary
jvm_gc_collection_seconds_count{cluster="test",gc="ZGC Cycles"} 199.0
jvm_gc_collection_seconds_sum{cluster="test",gc="ZGC Cycles"} 210.486
jvm_gc_collection_seconds_count{cluster="test",gc="ZGC Pauses"} 600.0
jvm_gc_collection_seconds_sum{cluster="test",gc="ZGC Pauses"} 0.017
# TYPE caffeine_cache_hit counter
caffeine_cache_hit_total{cluster="test",cache="owned-bundles"} 5.0
caffeine_cache_hit_total{cluster="test",cache="bundles"} 5.0
# TYPE caffeine_cache_miss counter
caffeine_cache_miss_total{cluster="test",cache="owned-bundles"} 4.0
caffeine_cache_miss_total{cluster="test",cache="bundles"} 4.0
# TYPE caffeine_cache_requests counter
caffeine_cache_requests_total{cluster="test",cache="owned-bundles"} 9.0
caffeine_cache_requests_total{cluster="test",cache="bundles"} 9.0
# TYPE caffeine_cache_eviction counter
caffeine_cache_eviction_total{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_eviction_total{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_eviction_weight gauge
caffeine_cache_eviction_weight{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_eviction_weight{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_load_failure counter
caffeine_cache_load_failure_total{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_load_failure_total{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_loads counter
caffeine_cache_loads_total{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_loads_total{cluster="test",cache="bundles"} 4.0
# TYPE caffeine_cache_estimated_size gauge
caffeine_cache_estimated_size{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_estimated_size{cluster="test",cache="bundles"} 3.0
# TYPE caffeine_cache_load_duration_seconds summary
caffeine_cache_load_duration_seconds_count{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_load_duration_seconds_sum{cluster="test",cache="owned-bundles"} 0.004702334
caffeine_cache_load_duration_seconds_count{cluster="test",cache="bundles"} 4.0
caffeine_cache_load_duration_seconds_sum{cluster="test",cache="bundles"} 0.02401077
# TYPE pulsar_replicated_subscriptions_pending_snapshots gauge
pulsar_replicated_subscriptions_pending_snapshots{cluster="test"} 0.0
# TYPE pulsar_ml_cache_pendingreads_matched counter
pulsar_ml_cache_pendingreads_matched_total{cluster="test"} 430.0
pulsar_ml_cache_pendingreads_matched_created{cluster="test"} 1.675329175942E9
# TYPE pulsar_broker_load_manager_bundle_assigment summary
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.5"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.99"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.999"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="1.0"} NaN
pulsar_broker_load_manager_bundle_assigment_count{cluster="test"} 255.0
pulsar_broker_load_manager_bundle_assigment_sum{cluster="test"} 3740.0
# TYPE pulsar_batch_metadata_store_executor_queue_size gauge
pulsar_batch_metadata_store_executor_queue_size{cluster="test",name="configuration-metadata-store"} 1.0
pulsar_batch_metadata_store_executor_queue_size{cluster="test",name="metadata-store"} 1.0
# TYPE jvm_memory_objects_pending_finalization gauge
jvm_memory_objects_pending_finalization{cluster="test"} 0.0
# TYPE jvm_memory_bytes_used gauge
jvm_memory_bytes_used{cluster="test",area="heap"} 5.32676608E8
jvm_memory_bytes_used{cluster="test",area="nonheap"} 2.32873408E8
# TYPE jvm_memory_bytes_committed gauge
jvm_memory_bytes_committed{cluster="test",area="heap"} 1.073741824E9
jvm_memory_bytes_committed{cluster="test",area="nonheap"} 2.392064E8
# TYPE jvm_memory_bytes_max gauge
jvm_memory_bytes_max{cluster="test",area="heap"} 1.073741824E9
jvm_memory_bytes_max{cluster="test",area="nonheap"} -1.0
# TYPE jvm_memory_bytes_init gauge
jvm_memory_bytes_init{cluster="test",area="heap"} 1.1534336E8
jvm_memory_bytes_init{cluster="test",area="nonheap"} 7667712.0
# TYPE jvm_memory_pool_bytes_used gauge
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'non-nmethods'"} 2356480.0
jvm_memory_pool_bytes_used{cluster="test",pool="Metaspace"} 1.2560128E8
jvm_memory_pool_bytes_used{cluster="test",pool="ZHeap"} 5.32676608E8
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'profiled nmethods'"} 6.1715328E7
jvm_memory_pool_bytes_used{cluster="test",pool="Compressed Class Space"} 1.3852864E7
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2.9347456E7
# TYPE jvm_memory_pool_bytes_committed gauge
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'non-nmethods'"} 2752512.0
jvm_memory_pool_bytes_committed{cluster="test",pool="Metaspace"} 1.277952E8
jvm_memory_pool_bytes_committed{cluster="test",pool="ZHeap"} 1.073741824E9
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'profiled nmethods'"} 6.3832064E7
jvm_memory_pool_bytes_committed{cluster="test",pool="Compressed Class Space"} 1.507328E7
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2.9753344E7
# TYPE jvm_memory_pool_bytes_max gauge
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'non-nmethods'"} 5828608.0
jvm_memory_pool_bytes_max{cluster="test",pool="Metaspace"} -1.0
jvm_memory_pool_bytes_max{cluster="test",pool="ZHeap"} 1.073741824E9
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'profiled nmethods'"} 1.22912768E8
jvm_memory_pool_bytes_max{cluster="test",pool="Compressed Class Space"} 1.073741824E9
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 1.22916864E8
# TYPE jvm_memory_pool_bytes_init gauge
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'non-nmethods'"} 2555904.0
jvm_memory_pool_bytes_init{cluster="test",pool="Metaspace"} 0.0
jvm_memory_pool_bytes_init{cluster="test",pool="ZHeap"} 8388608.0
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'profiled nmethods'"} 2555904.0
jvm_memory_pool_bytes_init{cluster="test",pool="Compressed Class Space"} 0.0
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2555904.0
# TYPE jvm_memory_pool_collection_used_bytes gauge
jvm_memory_pool_collection_used_bytes{cluster="test",pool="ZHeap"} 6.73185792E8
# TYPE jvm_memory_pool_collection_committed_bytes gauge
jvm_memory_pool_collection_committed_bytes{cluster="test",pool="ZHeap"} 1.073741824E9
# TYPE jvm_memory_pool_collection_max_bytes gauge
jvm_memory_pool_collection_max_bytes{cluster="test",pool="ZHeap"} 1.073741824E9
# TYPE jvm_memory_pool_collection_init_bytes gauge
jvm_memory_pool_collection_init_bytes{cluster="test",pool="ZHeap"} 8388608.0
# TYPE jvm_memory_direct_bytes_max gauge
jvm_memory_direct_bytes_max{cluster="test"} 1.073741824E9
# TYPE pulsar_broker_lookup_redirects counter
pulsar_broker_lookup_redirects_total{cluster="test"} 0.0
pulsar_broker_lookup_redirects_created{cluster="test"} 1.675329133617E9
# TYPE pulsar_ml_cache_pendingreads_entries_notread counter
pulsar_ml_cache_pendingreads_entries_notread_total{cluster="test"} 603.0
pulsar_ml_cache_pendingreads_entries_notread_created{cluster="test"} 1.675329175942E9
# TYPE pulsar_resource_group_aggregate_usage_secs summary
pulsar_resource_group_aggregate_usage_secs{cluster="test",quantile="0.5"} 0.002632824
pulsar_resource_group_aggregate_usage_secs{cluster="test",quantile="0.9"} 0.010299783
pulsar_resource_group_aggregate_usage_secs_count{cluster="test"} 16.0
pulsar_resource_group_aggregate_usage_secs_sum{cluster="test"} 0.07402732699999999
pulsar_resource_group_aggregate_usage_secs_created{cluster="test"} 1.675329165983E9
# TYPE pulsar_broker_lookup summary
pulsar_broker_lookup{cluster="test",quantile="0.5"} NaN
pulsar_broker_lookup{cluster="test",quantile="0.99"} NaN
pulsar_broker_lookup{cluster="test",quantile="0.999"} NaN
pulsar_broker_lookup{cluster="test",quantile="1.0"} -Inf
pulsar_broker_lookup_count{cluster="test"} 1651.0
pulsar_broker_lookup_sum{cluster="test"} 30469.0
# TYPE pulsar_authentication_failures counter
pulsar_authentication_failures_total{cluster="test",provider_name="AuthenticationProviderTls",auth_method="tls",reason="Client unable to authenticate with TLS certificate"} 24.0
pulsar_authentication_failures_created{cluster="test",provider_name="AuthenticationProviderTls",auth_method="tls",reason="Client unable to authenticate with TLS certificate"} 1.675329520464E9
# TYPE pulsar_expired_token counter
pulsar_expired_token_total{cluster="test"} 0.0
pulsar_expired_token_created{cluster="test"} 1.675330229855E9
# TYPE pulsar_ml_cache_pendingreads_missed counter
pulsar_ml_cache_pendingreads_missed_total{cluster="test"} 11965.0
pulsar_ml_cache_pendingreads_missed_created{cluster="test"} 1.675329175942E9
# TYPE jvm_buffer_pool_used_bytes gauge
jvm_buffer_pool_used_bytes{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_used_bytes{cluster="test",pool="direct"} 1.9104221E7
jvm_buffer_pool_used_bytes{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE jvm_buffer_pool_capacity_bytes gauge
jvm_buffer_pool_capacity_bytes{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_capacity_bytes{cluster="test",pool="direct"} 1.910422E7
jvm_buffer_pool_capacity_bytes{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE jvm_buffer_pool_used_buffers gauge
jvm_buffer_pool_used_buffers{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_used_buffers{cluster="test",pool="direct"} 223.0
jvm_buffer_pool_used_buffers{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE pulsar_broker_lookup_answers counter
pulsar_broker_lookup_answers_total{cluster="test"} 1624.0
pulsar_broker_lookup_answers_created{cluster="test"} 1.675329133617E9
# TYPE brk_ledgeroffloader_delete_offload_ops counter
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_both counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_both_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_both_created{cluster="test"} 1.675329175942E9
# TYPE pulsar_broker_lookup_failures counter
pulsar_broker_lookup_failures_total{cluster="test"} 0.0
pulsar_broker_lookup_failures_created{cluster="test"} 1.675329133617E9
# TYPE jetty_requests counter
jetty_requests_total{cluster="test"} 48.0
# TYPE jetty_requests_active gauge
jetty_requests_active{cluster="test"} 0.0
# TYPE jetty_requests_active_max gauge
jetty_requests_active_max{cluster="test"} 10.0
# TYPE jetty_request_time_max_seconds gauge
jetty_request_time_max_seconds{cluster="test"} 34.064
# TYPE jetty_request_time_seconds counter
jetty_request_time_seconds_total{cluster="test"} 34.896
# TYPE jetty_dispatched counter
jetty_dispatched_total{cluster="test"} 48.0
# TYPE jetty_dispatched_active gauge
jetty_dispatched_active{cluster="test"} 0.0
# TYPE jetty_dispatched_active_max gauge
jetty_dispatched_active_max{cluster="test"} 4.0
# TYPE jetty_dispatched_time_max gauge
jetty_dispatched_time_max{cluster="test"} 34064.0
# TYPE jetty_dispatched_time_seconds counter
jetty_dispatched_time_seconds_total{cluster="test"} 34.417
# TYPE jetty_async_requests counter
jetty_async_requests_total{cluster="test"} 32.0
# TYPE jetty_async_requests_waiting gauge
jetty_async_requests_waiting{cluster="test"} 0.0
# TYPE jetty_async_requests_waiting_max gauge
jetty_async_requests_waiting_max{cluster="test"} 9.0
# TYPE jetty_async_dispatches counter
jetty_async_dispatches_total{cluster="test"} 0.0
# TYPE jetty_expires counter
jetty_expires_total{cluster="test"} 0.0
# TYPE jetty_responses counter
jetty_responses_total{cluster="test",code="1xx"} 0.0
jetty_responses_total{cluster="test",code="2xx"} 20.0
jetty_responses_total{cluster="test",code="3xx"} 0.0
jetty_responses_total{cluster="test",code="4xx"} 0.0
jetty_responses_total{cluster="test",code="5xx"} 27.0
# TYPE jetty_stats_seconds gauge
jetty_stats_seconds{cluster="test"} 784.706
# TYPE jetty_responses_bytes counter
jetty_responses_bytes_total{cluster="test"} 2739.0
# TYPE pulsar_resource_group_namespace_registers counter
# TYPE pulsar_expiring_token_minutes histogram
pulsar_expiring_token_minutes_bucket{cluster="test",le="5.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="10.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="60.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="240.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="+Inf"} 0.0
pulsar_expiring_token_minutes_count{cluster="test"} 0.0
pulsar_expiring_token_minutes_sum{cluster="test"} 0.0
pulsar_expiring_token_minutes_created{cluster="test"} 1.675330229855E9
# TYPE pulsar_resource_group_messages_used counter
# TYPE pulsar_version_info gauge
pulsar_version_info{cluster="test",version="2.12.0-SNAPSHOT",commit="bb06afd4b71ed49b7bfaf1f7c92173f4f6313a47"} 1.0
# TYPE pulsar_ml_reads_available_inflight_bytes gauge
pulsar_ml_reads_available_inflight_bytes{cluster="test"} -1.0
# TYPE pulsar_resource_group_tenant_registers counter
# TYPE jvm_classes_currently_loaded gauge
jvm_classes_currently_loaded{cluster="test"} 21347.0
# TYPE jvm_classes_loaded counter
jvm_classes_loaded_total{cluster="test"} 23959.0
# TYPE jvm_classes_unloaded counter
jvm_classes_unloaded_total{cluster="test"} 2612.0
# TYPE pulsar_resource_group_calculate_quota_secs summary
pulsar_resource_group_calculate_quota_secs{cluster="test",quantile="0.5"} 8.2E-6
pulsar_resource_group_calculate_quota_secs{cluster="test",quantile="0.9"} 1.0E-5
pulsar_resource_group_calculate_quota_secs_count{cluster="test"} 16.0
pulsar_resource_group_calculate_quota_secs_sum{cluster="test"} 0.004557930999999999
pulsar_resource_group_calculate_quota_secs_created{cluster="test"} 1.675329165983E9
# TYPE pulsar_txn_tp_commit_latency summary
# TYPE pulsar_resource_group_tenant_unregisters counter
# TYPE pulsar_broker_publish_latency summary
pulsar_broker_publish_latency{cluster="test",quantile="0.0"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.5"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.95"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.99"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.999"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.9999"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="1.0"} NaN
pulsar_broker_publish_latency_count{cluster="test"} 18199.0
pulsar_broker_publish_latency_sum{cluster="test"} 2799407.0
# TYPE pulsar_storage_write_latency_le_200 gauge
pulsar_storage_write_latency_le_200{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_16_kb gauge
pulsar_entry_size_le_16_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_logical_size gauge
pulsar_storage_logical_size{cluster="test"} 0
pulsar_storage_logical_size{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_le_1_mb gauge
pulsar_entry_size_le_1_mb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_producers_count gauge
pulsar_producers_count{cluster="test"} 0
pulsar_producers_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_rate_out gauge
pulsar_rate_out{cluster="test"} 0
pulsar_rate_out{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_storage_ledger_write_latency_sum gauge
pulsar_storage_ledger_write_latency_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_200 gauge
pulsar_storage_ledger_write_latency_le_200{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_consumer_msg_ack_rate gauge
pulsar_consumer_msg_ack_rate{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_1 gauge
pulsar_storage_ledger_write_latency_le_1{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_1000 gauge
pulsar_storage_ledger_write_latency_le_1000{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_2_kb gauge
pulsar_entry_size_le_2_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_20 gauge
pulsar_storage_ledger_write_latency_le_20{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_50 gauge
pulsar_storage_write_latency_le_50{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_5 gauge
pulsar_storage_write_latency_le_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_delayed_message_index_size_bytes gauge
pulsar_delayed_message_index_size_bytes{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_size gauge
pulsar_storage_size{cluster="test"} 0
pulsar_storage_size{cluster="test",namespace="prop/ns-abc1"} 15600
# TYPE pulsar_storage_write_latency_le_10 gauge
pulsar_storage_write_latency_le_10{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_throughput_in gauge
pulsar_throughput_in{cluster="test"} 0
pulsar_throughput_in{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_storage_write_latency_le_1 gauge
pulsar_storage_write_latency_le_1{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_in_bytes_total gauge
pulsar_in_bytes_total{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_le_128 gauge
pulsar_entry_size_le_128{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_rate_in gauge
pulsar_rate_in{cluster="test"} 0
pulsar_rate_in{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_txn_tb_aborted_total gauge
pulsar_txn_tb_aborted_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_100_kb gauge
pulsar_entry_size_le_100_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_throughput_out gauge
pulsar_throughput_out{cluster="test"} 0
pulsar_throughput_out{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_topics_count gauge
pulsar_topics_count{cluster="test"} 0
pulsar_topics_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_storage_read_rate gauge
pulsar_storage_read_rate{cluster="test"} 0
pulsar_storage_read_rate{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_in_messages_total gauge
pulsar_in_messages_total{cluster="test",namespace="prop/ns-abc1"} 100
# TYPE pulsar_storage_write_latency_count gauge
pulsar_storage_write_latency_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_1_kb gauge
pulsar_entry_size_le_1_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_10 gauge
pulsar_storage_ledger_write_latency_le_10{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_100 gauge
pulsar_storage_write_latency_le_100{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_50 gauge
pulsar_storage_ledger_write_latency_le_50{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_overflow gauge
pulsar_storage_ledger_write_latency_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_1000 gauge
pulsar_storage_write_latency_le_1000{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_20 gauge
pulsar_storage_write_latency_le_20{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_sum gauge
pulsar_storage_write_latency_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_0_5 gauge
pulsar_storage_ledger_write_latency_le_0_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_0_5 gauge
pulsar_storage_write_latency_le_0_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_count gauge
pulsar_entry_size_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_100 gauge
pulsar_storage_ledger_write_latency_le_100{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_out_messages_total gauge
pulsar_out_messages_total{cluster="test",namespace="prop/ns-abc1"} 100
# TYPE pulsar_entry_size_le_overflow gauge
pulsar_entry_size_le_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_subscription_delayed gauge
pulsar_subscription_delayed{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_5 gauge
pulsar_storage_ledger_write_latency_le_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_rate gauge
pulsar_storage_write_rate{cluster="test"} 0
pulsar_storage_write_rate{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_msg_backlog gauge
pulsar_msg_backlog{cluster="test"} 0
pulsar_msg_backlog{cluster="test",namespace="prop/ns-abc1",remote_cluster="local"} 100
# TYPE pulsar_subscriptions_count gauge
pulsar_subscriptions_count{cluster="test"} 0
pulsar_subscriptions_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_entry_size_le_4_kb gauge
pulsar_entry_size_le_4_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_count gauge
pulsar_storage_ledger_write_latency_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_txn_tb_active_total gauge
pulsar_txn_tb_active_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_backlog_size gauge
pulsar_storage_backlog_size{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_txn_tb_committed_total gauge
pulsar_txn_tb_committed_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_consumers_count gauge
pulsar_consumers_count{cluster="test"} 0
pulsar_consumers_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_entry_size_le_512 gauge
pulsar_entry_size_le_512{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_out_bytes_total gauge
pulsar_out_bytes_total{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_sum gauge
pulsar_entry_size_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_offloaded_size gauge
pulsar_storage_offloaded_size{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_overflow gauge
pulsar_storage_write_latency_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_ml_cache_entries gauge
pulsar_ml_cache_entries{cluster="test"} 0
# TYPE pulsar_ml_cache_evicted_entries_total gauge
pulsar_ml_cache_evicted_entries_total{cluster="test"} 100
# TYPE pulsar_ml_cache_evictions gauge
pulsar_ml_cache_evictions{cluster="test"} 0
# TYPE pulsar_ml_cache_hits_rate gauge
pulsar_ml_cache_hits_rate{cluster="test"} 0.0
# TYPE pulsar_ml_cache_hits_throughput gauge
pulsar_ml_cache_hits_throughput{cluster="test"} 0.0
# TYPE pulsar_ml_cache_inserted_entries_total gauge
pulsar_ml_cache_inserted_entries_total{cluster="test"} 100
# TYPE pulsar_ml_cache_misses_rate gauge
pulsar_ml_cache_misses_rate{cluster="test"} 0.0
# TYPE pulsar_ml_cache_misses_throughput gauge
pulsar_ml_cache_misses_throughput{cluster="test"} 0.0
# TYPE pulsar_ml_cache_pool_active_allocations gauge
pulsar_ml_cache_pool_active_allocations{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_huge gauge
pulsar_ml_cache_pool_active_allocations_huge{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_normal gauge
pulsar_ml_cache_pool_active_allocations_normal{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_small gauge
pulsar_ml_cache_pool_active_allocations_small{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_allocated gauge
pulsar_ml_cache_pool_allocated{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_used gauge
pulsar_ml_cache_pool_used{cluster="test"} 0
# TYPE pulsar_ml_cache_used_size gauge
pulsar_ml_cache_used_size{cluster="test"} 0
# TYPE pulsar_ml_count gauge
pulsar_ml_count{cluster="test"} 1
# TYPE pulsar_ml_AddEntryBytesRate gauge
pulsar_ml_AddEntryBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryErrors gauge
pulsar_ml_AddEntryErrors{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryLatencyBuckets gauge
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_AddEntryLatencyBuckets_OVERFLOW gauge
pulsar_ml_AddEntryLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryMessagesRate gauge
pulsar_ml_AddEntryMessagesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntrySucceed gauge
pulsar_ml_AddEntrySucceed{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryWithReplicasBytesRate gauge
pulsar_ml_AddEntryWithReplicasBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_EntrySizeBuckets gauge
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_128.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1024.0_2048.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="102400.0_1048576.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="128.0_512.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="16384.0_102400.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="2048.0_4096.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="4096.0_16384.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="512.0_1024.0"} 0.0
# TYPE pulsar_ml_EntrySizeBuckets_OVERFLOW gauge
pulsar_ml_EntrySizeBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_LedgerAddEntryLatencyBuckets gauge
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_LedgerAddEntryLatencyBuckets_OVERFLOW gauge
pulsar_ml_LedgerAddEntryLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_LedgerSwitchLatencyBuckets gauge
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_LedgerSwitchLatencyBuckets_OVERFLOW gauge
pulsar_ml_LedgerSwitchLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_MarkDeleteRate gauge
pulsar_ml_MarkDeleteRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_NumberOfMessagesInBacklog gauge
pulsar_ml_NumberOfMessagesInBacklog{cluster="test", namespace="prop/ns-abc1/persistent"} 100.0
# TYPE pulsar_ml_ReadEntriesBytesRate gauge
pulsar_ml_ReadEntriesBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesErrors gauge
pulsar_ml_ReadEntriesErrors{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesRate gauge
pulsar_ml_ReadEntriesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesSucceeded gauge
pulsar_ml_ReadEntriesSucceeded{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_StoredMessagesSize gauge
pulsar_ml_StoredMessagesSize{cluster="test", namespace="prop/ns-abc1/persistent"} 15600.0
# TYPE pulsar_active_connections gauge
pulsar_active_connections{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_connection_closed_total_count gauge
pulsar_connection_closed_total_count{cluster="test", broker="localhost", metric="broker_connection"} 0
# TYPE pulsar_connection_create_fail_count gauge
pulsar_connection_create_fail_count{cluster="test", broker="localhost", metric="broker_connection"} 0
# TYPE pulsar_connection_create_success_count gauge
pulsar_connection_create_success_count{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_connection_created_total_count gauge
pulsar_connection_created_total_count{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_lb_bandwidth_in_usage gauge
pulsar_lb_bandwidth_in_usage{cluster="test", broker="localhost", metric="loadBalancing"} 0.0
# TYPE pulsar_lb_bandwidth_out_usage gauge
pulsar_lb_bandwidth_out_usage{cluster="test", broker="localhost", metric="loadBalancing"} 0.0
# TYPE pulsar_lb_cpu_usage gauge
pulsar_lb_cpu_usage{cluster="test", broker="localhost", metric="loadBalancing"} 6.0723123E-5
# TYPE pulsar_lb_directMemory_usage gauge
pulsar_lb_directMemory_usage{cluster="test", broker="localhost", metric="loadBalancing"} 1.6601562
# TYPE pulsar_lb_memory_usage gauge
pulsar_lb_memory_usage{cluster="test", broker="localhost", metric="loadBalancing"} 73.828125
# TYPE pulsar_lb_bundles_split_total gauge
pulsar_lb_bundles_split_total{cluster="test", metric="bundlesSplit"} 0
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_max_queue_size gauge
pulsar_managedLedger_client_bookkeeper_ml_scheduler_max_queue_size{cluster="test"} -1
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_threads gauge
pulsar_managedLedger_client_bookkeeper_ml_scheduler_threads{cluster="test"} 2
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_completed_tasks gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_completed_tasks{cluster="test"} 9
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_queue gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_queue{cluster="test"} 1
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_total_tasks gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_total_tasks{cluster="test"} 10
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_completed_tasks gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_completed_tasks{cluster="test"} 16
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_queue gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_queue{cluster="test"} 3
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_total_tasks gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_total_tasks{cluster="test"} 19
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution summary
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.5"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.75"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.95"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.99"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.9999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="1.0"} -Infinity
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_count{cluster="test", success="false"} 0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_sum{cluster="test", success="false"} 0.0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.5"} 0.016
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.75"} 0.016
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.95"} 0.016
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.99"} 0.016
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.999"} 0.016
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.9999"} 0.016
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="1.0"} 0.016
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_count{cluster="test", success="true"} 23
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_sum{cluster="test", success="true"} 8.0
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued summary
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.5"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.75"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.95"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.99"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.9999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="1.0"} -Infinity
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_count{cluster="test", success="false"} 0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_sum{cluster="test", success="false"} 0.0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.5"} 0.124
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.75"} 0.124
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.95"} 0.124
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.99"} 0.124
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.999"} 0.124
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.9999"} 0.124
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="1.0"} 0.124
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_count{cluster="test", success="true"} 23
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_sum{cluster="test", success="true"} 170.0

 expected object to not be null
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.assertNotNull(Assert.java:1319)
	at org.apache.pulsar.broker.stats.MetadataStoreStatsTest.testMetadataStoreStats(MetadataStoreStatsTest.java:113)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

```
java.lang.AssertionError:
Assertion failed with metrics:
# TYPE pulsar_resource_group_tenant_registers counter
# TYPE pulsar_broker_lookup_redirects counter
pulsar_broker_lookup_redirects_total{cluster="test"} 34.0
pulsar_broker_lookup_redirects_created{cluster="test"} 1.67534209765E9
# TYPE pulsar_ml_cache_pendingreads_matched counter
pulsar_ml_cache_pendingreads_matched_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_created{cluster="test"} 1.675342124416E9
# TYPE jvm_memory_objects_pending_finalization gauge
jvm_memory_objects_pending_finalization{cluster="test"} 0.0
# TYPE jvm_memory_bytes_used gauge
jvm_memory_bytes_used{cluster="test",area="heap"} 6.43825664E8
jvm_memory_bytes_used{cluster="test",area="nonheap"} 2.28160024E8
# TYPE jvm_memory_bytes_committed gauge
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-02T13:03:46.8861208Z](https://github.com/apache/pulsar/actions/runs/4074476334/jobs/7019922662#step:11:1316)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError:
Assertion failed with metrics:
# TYPE pulsar_resource_group_tenant_registers counter
# TYPE pulsar_broker_lookup_redirects counter
pulsar_broker_lookup_redirects_total{cluster="test"} 34.0
pulsar_broker_lookup_redirects_created{cluster="test"} 1.67534209765E9
# TYPE pulsar_ml_cache_pendingreads_matched counter
pulsar_ml_cache_pendingreads_matched_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_created{cluster="test"} 1.675342124416E9
# TYPE jvm_memory_objects_pending_finalization gauge
jvm_memory_objects_pending_finalization{cluster="test"} 0.0
# TYPE jvm_memory_bytes_used gauge
jvm_memory_bytes_used{cluster="test",area="heap"} 6.43825664E8
jvm_memory_bytes_used{cluster="test",area="nonheap"} 2.28160024E8
# TYPE jvm_memory_bytes_committed gauge
jvm_memory_bytes_committed{cluster="test",area="heap"} 1.073741824E9
jvm_memory_bytes_committed{cluster="test",area="nonheap"} 2.32718336E8
# TYPE jvm_memory_bytes_max gauge
jvm_memory_bytes_max{cluster="test",area="heap"} 1.073741824E9
jvm_memory_bytes_max{cluster="test",area="nonheap"} -1.0
# TYPE jvm_memory_bytes_init gauge
jvm_memory_bytes_init{cluster="test",area="heap"} 1.1534336E8
jvm_memory_bytes_init{cluster="test",area="nonheap"} 7667712.0
# TYPE jvm_memory_pool_bytes_used gauge
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'non-nmethods'"} 2376704.0
jvm_memory_pool_bytes_used{cluster="test",pool="Metaspace"} 1.23690952E8
jvm_memory_pool_bytes_used{cluster="test",pool="ZHeap"} 6.43825664E8
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'profiled nmethods'"} 6.063936E7
jvm_memory_pool_bytes_used{cluster="test",pool="Compressed Class Space"} 1.379016E7
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2.7662848E7
# TYPE jvm_memory_pool_bytes_committed gauge
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'non-nmethods'"} 2686976.0
jvm_memory_pool_bytes_committed{cluster="test",pool="Metaspace"} 1.26222336E8
jvm_memory_pool_bytes_committed{cluster="test",pool="ZHeap"} 1.073741824E9
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'profiled nmethods'"} 6.0686336E7
jvm_memory_pool_bytes_committed{cluster="test",pool="Compressed Class Space"} 1.540096E7
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2.7721728E7
# TYPE jvm_memory_pool_bytes_max gauge
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'non-nmethods'"} 5828608.0
jvm_memory_pool_bytes_max{cluster="test",pool="Metaspace"} -1.0
jvm_memory_pool_bytes_max{cluster="test",pool="ZHeap"} 1.073741824E9
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'profiled nmethods'"} 1.22912768E8
jvm_memory_pool_bytes_max{cluster="test",pool="Compressed Class Space"} 1.073741824E9
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 1.22916864E8
# TYPE jvm_memory_pool_bytes_init gauge
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'non-nmethods'"} 2555904.0
jvm_memory_pool_bytes_init{cluster="test",pool="Metaspace"} 0.0
jvm_memory_pool_bytes_init{cluster="test",pool="ZHeap"} 8388608.0
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'profiled nmethods'"} 2555904.0
jvm_memory_pool_bytes_init{cluster="test",pool="Compressed Class Space"} 0.0
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2555904.0
# TYPE jvm_memory_pool_collection_used_bytes gauge
jvm_memory_pool_collection_used_bytes{cluster="test",pool="ZHeap"} 6.291456E8
# TYPE jvm_memory_pool_collection_committed_bytes gauge
jvm_memory_pool_collection_committed_bytes{cluster="test",pool="ZHeap"} 1.073741824E9
# TYPE jvm_memory_pool_collection_max_bytes gauge
jvm_memory_pool_collection_max_bytes{cluster="test",pool="ZHeap"} 1.073741824E9
# TYPE jvm_memory_pool_collection_init_bytes gauge
jvm_memory_pool_collection_init_bytes{cluster="test",pool="ZHeap"} 8388608.0
# TYPE pulsar_resource_group_tenant_unregisters counter
# TYPE pulsar_txn_tp_aborted_count counter
# TYPE brk_ledgeroffloader_read_bytes counter
# TYPE jvm_memory_pool_allocated_bytes counter
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'profiled nmethods'"} 1.3691257728E10
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'profiled nmethods'"} 1.675342244106E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="ZHeap"} 1.3500416E11
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="ZHeap"} 1.675342244106E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 6.330975104E9
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 1.675342244106E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="Compressed Class Space"} 3.9279878E9
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="Compressed Class Space"} 1.675342244106E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="Metaspace"} 3.4351096512E10
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="Metaspace"} 1.675342244106E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'non-nmethods'"} 6.86915072E8
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'non-nmethods'"} 1.675342244106E9
# TYPE pulsar_metadata_store_put_bytes counter
pulsar_metadata_store_put_bytes_total{cluster="test",name="configuration-metadata-store"} 2280.0
pulsar_metadata_store_put_bytes_created{cluster="test",name="configuration-metadata-store"} 1.675343025243E9
pulsar_metadata_store_put_bytes_total{cluster="test",name="metadata-store"} 1928.0
pulsar_metadata_store_put_bytes_created{cluster="test",name="metadata-store"} 1.675343025231E9
pulsar_metadata_store_put_bytes_total{cluster="test",name=""} 985.0
pulsar_metadata_store_put_bytes_created{cluster="test",name=""} 1.675342883508E9
# TYPE pulsar_txn_tp_commit_latency summary
# TYPE pulsar_batch_metadata_store_queue_wait_time_ms histogram
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 1.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_count{cluster="test",name="configuration-metadata-store"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_sum{cluster="test",name="configuration-metadata-store"} 85.0
pulsar_batch_metadata_store_queue_wait_time_ms_created{cluster="test",name="configuration-metadata-store"} 1.675343025247E9
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="1.0"} 11.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="5.0"} 45.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="10.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="20.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="50.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="100.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="200.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="500.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="1000.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="+Inf"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_count{cluster="test",name="metadata-store"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_sum{cluster="test",name="metadata-store"} 157.0
pulsar_batch_metadata_store_queue_wait_time_ms_created{cluster="test",name="metadata-store"} 1.675343025235E9
# TYPE pulsar_batch_metadata_store_batch_execute_time_ms histogram
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 15.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 16.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 16.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_count{cluster="test",name="configuration-metadata-store"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_sum{cluster="test",name="configuration-metadata-store"} 16.0
pulsar_batch_metadata_store_batch_execute_time_ms_created{cluster="test",name="configuration-metadata-store"} 1.675343025247E9
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="1.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="5.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="10.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="20.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="50.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="100.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="200.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="500.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="1000.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="+Inf"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_count{cluster="test",name="metadata-store"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_sum{cluster="test",name="metadata-store"} 8.0
pulsar_batch_metadata_store_batch_execute_time_ms_created{cluster="test",name="metadata-store"} 1.675343025235E9
# TYPE jvm_threads_current gauge
jvm_threads_current{cluster="test"} 201.0
# TYPE jvm_threads_daemon gauge
jvm_threads_daemon{cluster="test"} 98.0
# TYPE jvm_threads_peak gauge
jvm_threads_peak{cluster="test"} 521.0
# TYPE jvm_threads_started counter
jvm_threads_started_total{cluster="test"} 11260.0
# TYPE jvm_threads_deadlocked gauge
jvm_threads_deadlocked{cluster="test"} 0.0
# TYPE jvm_threads_deadlocked_monitor gauge
jvm_threads_deadlocked_monitor{cluster="test"} 0.0
# TYPE jvm_threads_state gauge
jvm_threads_state{cluster="test",state="NEW"} 0.0
jvm_threads_state{cluster="test",state="TERMINATED"} 0.0
jvm_threads_state{cluster="test",state="RUNNABLE"} 18.0
jvm_threads_state{cluster="test",state="BLOCKED"} 0.0
jvm_threads_state{cluster="test",state="WAITING"} 83.0
jvm_threads_state{cluster="test",state="TIMED_WAITING"} 100.0
jvm_threads_state{cluster="test",state="UNKNOWN"} 0.0
# TYPE jvm_classes_currently_loaded gauge
jvm_classes_currently_loaded{cluster="test"} 21204.0
# TYPE jvm_classes_loaded counter
jvm_classes_loaded_total{cluster="test"} 22968.0
# TYPE jvm_classes_unloaded counter
jvm_classes_unloaded_total{cluster="test"} 1764.0
# TYPE jvm_info gauge
jvm_info{cluster="test",runtime="OpenJDK Runtime Environment",vendor="Eclipse Adoptium",version="17.0.6+10"} 1.0
# TYPE pulsar_resource_group_namespace_unregisters counter
# TYPE pulsar_ml_cache_pendingreads_entries_notread counter
pulsar_ml_cache_pendingreads_entries_notread_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_entries_notread_created{cluster="test"} 1.675342124416E9
# TYPE pulsar_ml_cache_pendingreads_matched_included counter
pulsar_ml_cache_pendingreads_matched_included_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_included_created{cluster="test"} 1.675342124416E9
# TYPE pulsar_broker_throttled_connections gauge
pulsar_broker_throttled_connections{cluster="test"} -22.0
# TYPE pulsar_version_info gauge
pulsar_version_info{cluster="test",version="2.12.0-SNAPSHOT",commit="9e023e462539ba5514bdb4bde803de3649e2ca9c"} 1.0
# TYPE pulsar_resource_group_calculate_quota_secs summary
pulsar_resource_group_calculate_quota_secs{cluster="test",quantile="0.5"} 5.2E-6
pulsar_resource_group_calculate_quota_secs{cluster="test",quantile="0.9"} 0.005514085
pulsar_resource_group_calculate_quota_secs_count{cluster="test"} 2.0
pulsar_resource_group_calculate_quota_secs_sum{cluster="test"} 0.0055192850000000005
pulsar_resource_group_calculate_quota_secs_created{cluster="test"} 1.675342117914E9
# TYPE pulsar_ml_reads_inflight_bytes gauge
pulsar_ml_reads_inflight_bytes{cluster="test"} -1.0
# TYPE pulsar_authentication_failures counter
pulsar_authentication_failures_total{cluster="test",provider_name="AuthenticationProviderTls",auth_method="tls",reason="Client unable to authenticate with TLS certificate"} 2.0
pulsar_authentication_failures_created{cluster="test",provider_name="AuthenticationProviderTls",auth_method="tls",reason="Client unable to authenticate with TLS certificate"} 1.675342231179E9
# TYPE pulsar_replicated_subscriptions_snapshot_ms summary
pulsar_replicated_subscriptions_snapshot_ms_count{cluster="test"} 2.0
pulsar_replicated_subscriptions_snapshot_ms_sum{cluster="test"} 0.0
pulsar_replicated_subscriptions_snapshot_ms_created{cluster="test"} 1.675342500692E9
# TYPE pulsar_resource_group_namespace_registers counter
# TYPE pulsar_expired_token counter
pulsar_expired_token_total{cluster="test"} 0.0
pulsar_expired_token_created{cluster="test"} 1.675343026208E9
# TYPE pulsar_metadata_store_ops_latency_ms histogram
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="del",status="fail"} 1.675343025231E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 1.675343025243E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="del",status="success"} 1.675343025231E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 1.675343025243E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="get",status="fail"} 1.675342883508E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 1.675343025243E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="1.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="3.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="5.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="10.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="20.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="50.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="100.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="200.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="500.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="1000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="2000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="5000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="+Inf"} 7.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="get",status="success"} 7.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="get",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="get",status="success"} 1.675342883508E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="put",status="fail"} 1.675342883508E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="3.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="5.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="10.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="20.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="50.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="100.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="200.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="500.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="1000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="2000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="5000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="+Inf"} 16.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="get",status="success"} 16.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="get",status="success"} 59.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="get",status="success"} 1.675343025243E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="del",status="fail"} 1.675342883508E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="put",status="fail"} 1.675343025231E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="1.0"} 4.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="3.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="5.0"} 25.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="10.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="20.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="50.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="100.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="200.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="500.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="1000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="2000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="5000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="+Inf"} 28.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="get",status="success"} 28.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="get",status="success"} 103.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="get",status="success"} 1.675343025231E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="get",status="fail"} 1.675343025231E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="del",status="success"} 1.675342883508E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="1.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="3.0"} 10.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="5.0"} 13.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="10.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="20.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="50.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="100.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="200.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="500.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="1000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="2000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="5000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="+Inf"} 15.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="put",status="success"} 15.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="put",status="success"} 45.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="put",status="success"} 1.675343025231E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="1.0"} 51.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="3.0"} 51.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="5.0"} 51.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="10.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="20.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="50.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="100.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="200.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="500.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="1000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="2000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="5000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="+Inf"} 52.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="put",status="success"} 52.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="put",status="success"} 10.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="put",status="success"} 1.675342883508E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="del",status="success"} 1.675343025243E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="1.0"} 1.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="3.0"} 3.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="5.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="10.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="20.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="50.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="100.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="200.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="500.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="1000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="2000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="5000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="+Inf"} 5.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="put",status="success"} 5.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="put",status="success"} 14.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="put",status="success"} 1.675343025243E9
# TYPE brk_ledgeroffloader_delete_offload_ops counter
# TYPE pulsar_ml_cache_pendingreads_entries_read counter
pulsar_ml_cache_pendingreads_entries_read_total{cluster="test"} 107.0
pulsar_ml_cache_pendingreads_entries_read_created{cluster="test"} 1.675342124416E9
# TYPE pulsar_replicated_subscriptions_pending_snapshots gauge
pulsar_replicated_subscriptions_pending_snapshots{cluster="test"} 0.0
# TYPE pulsar_expiring_token_minutes histogram
pulsar_expiring_token_minutes_bucket{cluster="test",le="5.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="10.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="60.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="240.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="+Inf"} 0.0
pulsar_expiring_token_minutes_count{cluster="test"} 0.0
pulsar_expiring_token_minutes_sum{cluster="test"} 0.0
pulsar_expiring_token_minutes_created{cluster="test"} 1.675343026208E9
# TYPE pulsar_ml_reads_available_inflight_bytes gauge
pulsar_ml_reads_available_inflight_bytes{cluster="test"} -1.0
# TYPE topic_load_times summary
topic_load_times{cluster="test",quantile="0.5"} NaN
topic_load_times{cluster="test",quantile="0.75"} NaN
topic_load_times{cluster="test",quantile="0.95"} NaN
topic_load_times{cluster="test",quantile="0.99"} NaN
topic_load_times{cluster="test",quantile="0.999"} NaN
topic_load_times{cluster="test",quantile="0.9999"} NaN
topic_load_times_count{cluster="test"} 11.0
topic_load_times_sum{cluster="test"} 1535.0
topic_load_times_created{cluster="test"} 1.675342100205E9
# TYPE pulsar_batch_metadata_store_batch_size histogram
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 11.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 17.0
pulsar_batch_metadata_store_batch_size_count{cluster="test",name="configuration-metadata-store"} 17.0
pulsar_batch_metadata_store_batch_size_sum{cluster="test",name="configuration-metadata-store"} 24.0
pulsar_batch_metadata_store_batch_size_created{cluster="test",name="configuration-metadata-store"} 1.675343025247E9
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="1.0"} 28.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="5.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="10.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="20.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="50.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="100.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="200.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="500.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="1000.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="+Inf"} 36.0
pulsar_batch_metadata_store_batch_size_count{cluster="test",name="metadata-store"} 36.0
pulsar_batch_metadata_store_batch_size_sum{cluster="test",name="metadata-store"} 48.0
pulsar_batch_metadata_store_batch_size_created{cluster="test",name="metadata-store"} 1.675343025235E9
# TYPE pulsar_resource_group_bytes_used counter
# TYPE pulsar_broker_lookup_failures counter
pulsar_broker_lookup_failures_total{cluster="test"} 1.0
pulsar_broker_lookup_failures_created{cluster="test"} 1.67534209765E9
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_right counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_right_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_right_created{cluster="test"} 1.675342124422E9
# TYPE jvm_memory_direct_bytes_used gauge
jvm_memory_direct_bytes_used{cluster="test"} 1.728714E7
# TYPE pulsar_broker_load_manager_bundle_assigment summary
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.5"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.99"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.999"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="1.0"} NaN
pulsar_broker_load_manager_bundle_assigment_count{cluster="test"} 235.0
pulsar_broker_load_manager_bundle_assigment_sum{cluster="test"} 2656.0
# TYPE pulsar_batch_metadata_store_executor_queue_size gauge
pulsar_batch_metadata_store_executor_queue_size{cluster="test",name="configuration-metadata-store"} 1.0
pulsar_batch_metadata_store_executor_queue_size{cluster="test",name="metadata-store"} 1.0
# TYPE pulsar_broker_topic_load_pending_requests gauge
pulsar_broker_topic_load_pending_requests{cluster="test"} 0.0
# TYPE jvm_memory_direct_bytes_max gauge
jvm_memory_direct_bytes_max{cluster="test"} 1.073741824E9
# TYPE pulsar_broker_lookup_pending_requests gauge
pulsar_broker_lookup_pending_requests{cluster="test"} 0.0
# TYPE pulsar_ml_cache_pendingreads_missed counter
pulsar_ml_cache_pendingreads_missed_total{cluster="test"} 107.0
pulsar_ml_cache_pendingreads_missed_created{cluster="test"} 1.675342124416E9
# TYPE jvm_gc_collection_seconds summary
jvm_gc_collection_seconds_count{cluster="test",gc="ZGC Cycles"} 341.0
jvm_gc_collection_seconds_sum{cluster="test",gc="ZGC Cycles"} 200.837
jvm_gc_collection_seconds_count{cluster="test",gc="ZGC Pauses"} 1024.0
jvm_gc_collection_seconds_sum{cluster="test",gc="ZGC Pauses"} 0.013
# TYPE pulsar_broker_lookup_answers counter
pulsar_broker_lookup_answers_total{cluster="test"} 819.0
pulsar_broker_lookup_answers_created{cluster="test"} 1.67534209765E9
# TYPE pulsar_resource_group_updates counter
# TYPE process_cpu_seconds counter
process_cpu_seconds_total{cluster="test"} 343.9
# TYPE process_start_time_seconds gauge
process_start_time_seconds{cluster="test"} 1.675342071922E9
# TYPE process_open_fds gauge
process_open_fds{cluster="test"} 651.0
# TYPE process_max_fds gauge
process_max_fds{cluster="test"} 65536.0
# TYPE process_virtual_memory_bytes gauge
process_virtual_memory_bytes{cluster="test"} 6.321272832E10
# TYPE process_resident_memory_bytes gauge
process_resident_memory_bytes{cluster="test"} 3.390898176E9
# TYPE pulsar_txn_tp_committed_count counter
# TYPE pulsar_broker_http_rejected_requests counter
pulsar_broker_http_rejected_requests_total{cluster="test"} 1.0
pulsar_broker_http_rejected_requests_created{cluster="test"} 1.675342223258E9
# TYPE pulsar_broker_lookup summary
pulsar_broker_lookup{cluster="test",quantile="0.5"} NaN
pulsar_broker_lookup{cluster="test",quantile="0.99"} NaN
pulsar_broker_lookup{cluster="test",quantile="0.999"} NaN
pulsar_broker_lookup{cluster="test",quantile="1.0"} -Inf
pulsar_broker_lookup_count{cluster="test"} 853.0
pulsar_broker_lookup_sum{cluster="test"} 21816.0
# TYPE pulsar_broker_pending_bytes_to_dispatch gauge
pulsar_broker_pending_bytes_to_dispatch{cluster="test"} 0.0
# TYPE caffeine_cache_hit counter
caffeine_cache_hit_total{cluster="test",cache="owned-bundles"} 5.0
caffeine_cache_hit_total{cluster="test",cache="bundles"} 5.0
# TYPE caffeine_cache_miss counter
caffeine_cache_miss_total{cluster="test",cache="owned-bundles"} 4.0
caffeine_cache_miss_total{cluster="test",cache="bundles"} 4.0
# TYPE caffeine_cache_requests counter
caffeine_cache_requests_total{cluster="test",cache="owned-bundles"} 9.0
caffeine_cache_requests_total{cluster="test",cache="bundles"} 9.0
# TYPE caffeine_cache_eviction counter
caffeine_cache_eviction_total{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_eviction_total{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_eviction_weight gauge
caffeine_cache_eviction_weight{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_eviction_weight{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_load_failure counter
caffeine_cache_load_failure_total{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_load_failure_total{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_loads counter
caffeine_cache_loads_total{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_loads_total{cluster="test",cache="bundles"} 4.0
# TYPE caffeine_cache_estimated_size gauge
caffeine_cache_estimated_size{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_estimated_size{cluster="test",cache="bundles"} 3.0
# TYPE caffeine_cache_load_duration_seconds summary
caffeine_cache_load_duration_seconds_count{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_load_duration_seconds_sum{cluster="test",cache="owned-bundles"} 0.009992653
caffeine_cache_load_duration_seconds_count{cluster="test",cache="bundles"} 4.0
caffeine_cache_load_duration_seconds_sum{cluster="test",cache="bundles"} 0.014449421
# TYPE pulsar_broker_throttled_connections_global_limit gauge
pulsar_broker_throttled_connections_global_limit{cluster="test"} 0.0
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_both counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_both_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_both_created{cluster="test"} 1.675342124422E9
# TYPE jetty_requests counter
jetty_requests_total{cluster="test"} 9.0
# TYPE jetty_requests_active gauge
jetty_requests_active{cluster="test"} 0.0
# TYPE jetty_requests_active_max gauge
jetty_requests_active_max{cluster="test"} 1.0
# TYPE jetty_request_time_max_seconds gauge
jetty_request_time_max_seconds{cluster="test"} 0.023
# TYPE jetty_request_time_seconds counter
jetty_request_time_seconds_total{cluster="test"} 0.086
# TYPE jetty_dispatched counter
jetty_dispatched_total{cluster="test"} 9.0
# TYPE jetty_dispatched_active gauge
jetty_dispatched_active{cluster="test"} 0.0
# TYPE jetty_dispatched_active_max gauge
jetty_dispatched_active_max{cluster="test"} 1.0
# TYPE jetty_dispatched_time_max gauge
jetty_dispatched_time_max{cluster="test"} 7.0
# TYPE jetty_dispatched_time_seconds counter
jetty_dispatched_time_seconds_total{cluster="test"} 0.028
# TYPE jetty_async_requests counter
jetty_async_requests_total{cluster="test"} 9.0
# TYPE jetty_async_requests_waiting gauge
jetty_async_requests_waiting{cluster="test"} 0.0
# TYPE jetty_async_requests_waiting_max gauge
jetty_async_requests_waiting_max{cluster="test"} 1.0
# TYPE jetty_async_dispatches counter
jetty_async_dispatches_total{cluster="test"} 0.0
# TYPE jetty_expires counter
jetty_expires_total{cluster="test"} 0.0
# TYPE jetty_responses counter
jetty_responses_total{cluster="test",code="1xx"} 0.0
jetty_responses_total{cluster="test",code="2xx"} 9.0
jetty_responses_total{cluster="test",code="3xx"} 0.0
jetty_responses_total{cluster="test",code="4xx"} 0.0
jetty_responses_total{cluster="test",code="5xx"} 0.0
# TYPE jetty_stats_seconds gauge
jetty_stats_seconds{cluster="test"} 0.472
# TYPE jetty_responses_bytes counter
jetty_responses_bytes_total{cluster="test"} 498.0
# TYPE pulsar_broker_publish_latency summary
pulsar_broker_publish_latency{cluster="test",quantile="0.0"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.5"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.95"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.99"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.999"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.9999"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="1.0"} NaN
pulsar_broker_publish_latency_count{cluster="test"} 2460.0
pulsar_broker_publish_latency_sum{cluster="test"} 60107.0
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_left counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_left_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_left_created{cluster="test"} 1.675342124416E9
# TYPE pulsar_resource_group_messages_used counter
# TYPE pulsar_resource_group_aggregate_usage_secs summary
pulsar_resource_group_aggregate_usage_secs{cluster="test",quantile="0.5"} 7.45311E-4
pulsar_resource_group_aggregate_usage_secs{cluster="test",quantile="0.9"} 0.001216319
pulsar_resource_group_aggregate_usage_secs_count{cluster="test"} 2.0
pulsar_resource_group_aggregate_usage_secs_sum{cluster="test"} 0.00196163
pulsar_resource_group_aggregate_usage_secs_created{cluster="test"} 1.675342117914E9
# TYPE pulsar_authentication_success counter
pulsar_authentication_success_total{cluster="test",provider_name="AuthenticationProviderTls",auth_method="tls"} 4.0
pulsar_authentication_success_created{cluster="test",provider_name="AuthenticationProviderTls",auth_method="tls"} 1.675342230915E9
# TYPE jvm_buffer_pool_used_bytes gauge
jvm_buffer_pool_used_bytes{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_used_bytes{cluster="test",pool="direct"} 1.728714E7
jvm_buffer_pool_used_bytes{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE jvm_buffer_pool_capacity_bytes gauge
jvm_buffer_pool_capacity_bytes{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_capacity_bytes{cluster="test",pool="direct"} 1.7287139E7
jvm_buffer_pool_capacity_bytes{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE jvm_buffer_pool_used_buffers gauge
jvm_buffer_pool_used_buffers{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_used_buffers{cluster="test",pool="direct"} 204.0
jvm_buffer_pool_used_buffers{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE pulsar_resource_group_calculated_bytes_quota counter
# TYPE pulsar_resource_group_calculated_messages_quota counter
# TYPE pulsar_storage_write_latency_le_200 gauge
pulsar_storage_write_latency_le_200{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_16_kb gauge
pulsar_entry_size_le_16_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_logical_size gauge
pulsar_storage_logical_size{cluster="test"} 0
pulsar_storage_logical_size{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_le_1_mb gauge
pulsar_entry_size_le_1_mb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_producers_count gauge
pulsar_producers_count{cluster="test"} 0
pulsar_producers_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_rate_out gauge
pulsar_rate_out{cluster="test"} 0
pulsar_rate_out{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_storage_ledger_write_latency_sum gauge
pulsar_storage_ledger_write_latency_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_200 gauge
pulsar_storage_ledger_write_latency_le_200{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_consumer_msg_ack_rate gauge
pulsar_consumer_msg_ack_rate{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_1 gauge
pulsar_storage_ledger_write_latency_le_1{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_1000 gauge
pulsar_storage_ledger_write_latency_le_1000{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_2_kb gauge
pulsar_entry_size_le_2_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_20 gauge
pulsar_storage_ledger_write_latency_le_20{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_50 gauge
pulsar_storage_write_latency_le_50{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_5 gauge
pulsar_storage_write_latency_le_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_delayed_message_index_size_bytes gauge
pulsar_delayed_message_index_size_bytes{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_size gauge
pulsar_storage_size{cluster="test"} 0
pulsar_storage_size{cluster="test",namespace="prop/ns-abc1"} 15600
# TYPE pulsar_storage_write_latency_le_10 gauge
pulsar_storage_write_latency_le_10{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_throughput_in gauge
pulsar_throughput_in{cluster="test"} 0
pulsar_throughput_in{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_storage_write_latency_le_1 gauge
pulsar_storage_write_latency_le_1{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_in_bytes_total gauge
pulsar_in_bytes_total{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_le_128 gauge
pulsar_entry_size_le_128{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_rate_in gauge
pulsar_rate_in{cluster="test"} 0
pulsar_rate_in{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_txn_tb_aborted_total gauge
pulsar_txn_tb_aborted_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_100_kb gauge
pulsar_entry_size_le_100_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_throughput_out gauge
pulsar_throughput_out{cluster="test"} 0
pulsar_throughput_out{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_topics_count gauge
pulsar_topics_count{cluster="test"} 0
pulsar_topics_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_storage_read_rate gauge
pulsar_storage_read_rate{cluster="test"} 0
pulsar_storage_read_rate{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_in_messages_total gauge
pulsar_in_messages_total{cluster="test",namespace="prop/ns-abc1"} 100
# TYPE pulsar_storage_write_latency_count gauge
pulsar_storage_write_latency_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_1_kb gauge
pulsar_entry_size_le_1_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_10 gauge
pulsar_storage_ledger_write_latency_le_10{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_100 gauge
pulsar_storage_write_latency_le_100{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_50 gauge
pulsar_storage_ledger_write_latency_le_50{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_overflow gauge
pulsar_storage_ledger_write_latency_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_1000 gauge
pulsar_storage_write_latency_le_1000{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_20 gauge
pulsar_storage_write_latency_le_20{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_sum gauge
pulsar_storage_write_latency_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_0_5 gauge
pulsar_storage_ledger_write_latency_le_0_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_0_5 gauge
pulsar_storage_write_latency_le_0_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_count gauge
pulsar_entry_size_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_100 gauge
pulsar_storage_ledger_write_latency_le_100{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_out_messages_total gauge
pulsar_out_messages_total{cluster="test",namespace="prop/ns-abc1"} 100
# TYPE pulsar_entry_size_le_overflow gauge
pulsar_entry_size_le_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_subscription_delayed gauge
pulsar_subscription_delayed{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_5 gauge
pulsar_storage_ledger_write_latency_le_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_rate gauge
pulsar_storage_write_rate{cluster="test"} 0
pulsar_storage_write_rate{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_msg_backlog gauge
pulsar_msg_backlog{cluster="test"} 0
pulsar_msg_backlog{cluster="test",namespace="prop/ns-abc1",remote_cluster="local"} 0
# TYPE pulsar_subscriptions_count gauge
pulsar_subscriptions_count{cluster="test"} 0
pulsar_subscriptions_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_entry_size_le_4_kb gauge
pulsar_entry_size_le_4_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_count gauge
pulsar_storage_ledger_write_latency_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_txn_tb_active_total gauge
pulsar_txn_tb_active_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_backlog_size gauge
pulsar_storage_backlog_size{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_txn_tb_committed_total gauge
pulsar_txn_tb_committed_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_consumers_count gauge
pulsar_consumers_count{cluster="test"} 0
pulsar_consumers_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_entry_size_le_512 gauge
pulsar_entry_size_le_512{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_out_bytes_total gauge
pulsar_out_bytes_total{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_sum gauge
pulsar_entry_size_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_offloaded_size gauge
pulsar_storage_offloaded_size{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_overflow gauge
pulsar_storage_write_latency_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_ml_cache_entries gauge
pulsar_ml_cache_entries{cluster="test"} 0
# TYPE pulsar_ml_cache_evicted_entries_total gauge
pulsar_ml_cache_evicted_entries_total{cluster="test"} 100
# TYPE pulsar_ml_cache_evictions gauge
pulsar_ml_cache_evictions{cluster="test"} 0
# TYPE pulsar_ml_cache_hits_rate gauge
pulsar_ml_cache_hits_rate{cluster="test"} 0.0
# TYPE pulsar_ml_cache_hits_throughput gauge
pulsar_ml_cache_hits_throughput{cluster="test"} 0.0
# TYPE pulsar_ml_cache_inserted_entries_total gauge
pulsar_ml_cache_inserted_entries_total{cluster="test"} 100
# TYPE pulsar_ml_cache_misses_rate gauge
pulsar_ml_cache_misses_rate{cluster="test"} 0.0
# TYPE pulsar_ml_cache_misses_throughput gauge
pulsar_ml_cache_misses_throughput{cluster="test"} 0.0
# TYPE pulsar_ml_cache_pool_active_allocations gauge
pulsar_ml_cache_pool_active_allocations{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_huge gauge
pulsar_ml_cache_pool_active_allocations_huge{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_normal gauge
pulsar_ml_cache_pool_active_allocations_normal{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_small gauge
pulsar_ml_cache_pool_active_allocations_small{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_allocated gauge
pulsar_ml_cache_pool_allocated{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_used gauge
pulsar_ml_cache_pool_used{cluster="test"} 0
# TYPE pulsar_ml_cache_used_size gauge
pulsar_ml_cache_used_size{cluster="test"} 0
# TYPE pulsar_ml_count gauge
pulsar_ml_count{cluster="test"} 1
# TYPE pulsar_ml_AddEntryBytesRate gauge
pulsar_ml_AddEntryBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryErrors gauge
pulsar_ml_AddEntryErrors{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryLatencyBuckets gauge
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_AddEntryLatencyBuckets_OVERFLOW gauge
pulsar_ml_AddEntryLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryMessagesRate gauge
pulsar_ml_AddEntryMessagesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntrySucceed gauge
pulsar_ml_AddEntrySucceed{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryWithReplicasBytesRate gauge
pulsar_ml_AddEntryWithReplicasBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_EntrySizeBuckets gauge
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_128.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1024.0_2048.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="102400.0_1048576.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="128.0_512.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="16384.0_102400.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="2048.0_4096.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="4096.0_16384.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="512.0_1024.0"} 0.0
# TYPE pulsar_ml_EntrySizeBuckets_OVERFLOW gauge
pulsar_ml_EntrySizeBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_LedgerAddEntryLatencyBuckets gauge
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_LedgerAddEntryLatencyBuckets_OVERFLOW gauge
pulsar_ml_LedgerAddEntryLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_LedgerSwitchLatencyBuckets gauge
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_LedgerSwitchLatencyBuckets_OVERFLOW gauge
pulsar_ml_LedgerSwitchLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_MarkDeleteRate gauge
pulsar_ml_MarkDeleteRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_NumberOfMessagesInBacklog gauge
pulsar_ml_NumberOfMessagesInBacklog{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesBytesRate gauge
pulsar_ml_ReadEntriesBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesErrors gauge
pulsar_ml_ReadEntriesErrors{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesRate gauge
pulsar_ml_ReadEntriesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesSucceeded gauge
pulsar_ml_ReadEntriesSucceeded{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_StoredMessagesSize gauge
pulsar_ml_StoredMessagesSize{cluster="test", namespace="prop/ns-abc1/persistent"} 15600.0
# TYPE pulsar_active_connections gauge
pulsar_active_connections{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_connection_closed_total_count gauge
pulsar_connection_closed_total_count{cluster="test", broker="localhost", metric="broker_connection"} 0
# TYPE pulsar_connection_create_fail_count gauge
pulsar_connection_create_fail_count{cluster="test", broker="localhost", metric="broker_connection"} 0
# TYPE pulsar_connection_create_success_count gauge
pulsar_connection_create_success_count{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_connection_created_total_count gauge
pulsar_connection_created_total_count{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_lb_bandwidth_in_usage gauge
pulsar_lb_bandwidth_in_usage{cluster="test", broker="localhost", metric="loadBalancing"} 0.0
# TYPE pulsar_lb_bandwidth_out_usage gauge
pulsar_lb_bandwidth_out_usage{cluster="test", broker="localhost", metric="loadBalancing"} 0.0
# TYPE pulsar_lb_cpu_usage gauge
pulsar_lb_cpu_usage{cluster="test", broker="localhost", metric="loadBalancing"} 4.3589327E-5
# TYPE pulsar_lb_directMemory_usage gauge
pulsar_lb_directMemory_usage{cluster="test", broker="localhost", metric="loadBalancing"} 1.5625
# TYPE pulsar_lb_memory_usage gauge
pulsar_lb_memory_usage{cluster="test", broker="localhost", metric="loadBalancing"} 81.44531
# TYPE pulsar_lb_bundles_split_total gauge
pulsar_lb_bundles_split_total{cluster="test", metric="bundlesSplit"} 0
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_max_queue_size gauge
pulsar_managedLedger_client_bookkeeper_ml_scheduler_max_queue_size{cluster="test"} -1
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_threads gauge
pulsar_managedLedger_client_bookkeeper_ml_scheduler_threads{cluster="test"} 2
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_completed_tasks gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_completed_tasks{cluster="test"} 7
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_queue gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_queue{cluster="test"} 2
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_total_tasks gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_total_tasks{cluster="test"} 9
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_completed_tasks gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_completed_tasks{cluster="test"} 17
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_queue gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_queue{cluster="test"} 3
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_total_tasks gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_total_tasks{cluster="test"} 20
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution summary
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.5"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.75"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.95"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.99"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.9999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="1.0"} -Infinity
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_count{cluster="test", success="false"} 0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_sum{cluster="test", success="false"} 0.0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.5"} 0.022
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.75"} 0.022
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.95"} 0.022
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.99"} 0.022
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.999"} 0.022
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.9999"} 0.022
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="1.0"} 0.022
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_count{cluster="test", success="true"} 22
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_sum{cluster="test", success="true"} 2.0
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued summary
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.5"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.75"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.95"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.99"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.9999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="1.0"} -Infinity
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_count{cluster="test", success="false"} 0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_sum{cluster="test", success="false"} 0.0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.5"} 0.127
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.75"} 0.127
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.95"} 0.127
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.99"} 0.127
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.999"} 0.127
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.9999"} 0.127
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="1.0"} 0.127
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_count{cluster="test", success="true"} 22
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_sum{cluster="test", success="true"} 150.0

 expected object to not be null
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.assertNotNull(Assert.java:1319)
	at org.apache.pulsar.broker.stats.MetadataStoreStatsTest.testMetadataStoreStats(MetadataStoreStatsTest.java:113)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

```
java.lang.AssertionError:
Assertion failed with metrics:
# TYPE pulsar_broker_lookup_failures counter
pulsar_broker_lookup_failures_total{cluster="test"} 11.0
pulsar_broker_lookup_failures_created{cluster="test"} 1.675349567271E9
# TYPE pulsar_broker_publish_latency summary
pulsar_broker_publish_latency{cluster="test",quantile="0.0"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.5"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.95"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.99"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.999"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.9999"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="1.0"} NaN
pulsar_broker_publish_latency_count{cluster="test"} 7354.0
pulsar_broker_publish_latency_sum{cluster="test"} 985670.0
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-02T15:11:33.2778671Z](https://github.com/apache/pulsar/actions/runs/4073474341/jobs/7022344273#step:11:1262)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError:
Assertion failed with metrics:
# TYPE pulsar_broker_lookup_failures counter
pulsar_broker_lookup_failures_total{cluster="test"} 11.0
pulsar_broker_lookup_failures_created{cluster="test"} 1.675349567271E9
# TYPE pulsar_broker_publish_latency summary
pulsar_broker_publish_latency{cluster="test",quantile="0.0"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.5"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.95"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.99"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.999"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.9999"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="1.0"} NaN
pulsar_broker_publish_latency_count{cluster="test"} 7354.0
pulsar_broker_publish_latency_sum{cluster="test"} 985670.0
# TYPE pulsar_resource_group_calculated_bytes_quota counter
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_right counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_right_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_right_created{cluster="test"} 1.67534960512E9
# TYPE pulsar_ml_reads_inflight_bytes gauge
pulsar_ml_reads_inflight_bytes{cluster="test"} -1.0
# TYPE pulsar_ml_cache_pendingreads_matched_included counter
pulsar_ml_cache_pendingreads_matched_included_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_included_created{cluster="test"} 1.675349605118E9
# TYPE pulsar_broker_load_manager_bundle_assigment summary
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.5"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.99"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.999"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="1.0"} NaN
pulsar_broker_load_manager_bundle_assigment_count{cluster="test"} 227.0
pulsar_broker_load_manager_bundle_assigment_sum{cluster="test"} 2569.0
# TYPE pulsar_broker_lookup_answers counter
pulsar_broker_lookup_answers_total{cluster="test"} 1019.0
pulsar_broker_lookup_answers_created{cluster="test"} 1.675349567271E9
# TYPE pulsar_broker_throttled_connections gauge
pulsar_broker_throttled_connections{cluster="test"} 0.0
# TYPE pulsar_batch_metadata_store_batch_execute_time_ms histogram
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 15.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 16.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_count{cluster="test",name="configuration-metadata-store"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_sum{cluster="test",name="configuration-metadata-store"} 18.0
pulsar_batch_metadata_store_batch_execute_time_ms_created{cluster="test",name="configuration-metadata-store"} 1.67535068884E9
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="1.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="5.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="10.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="20.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="50.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="100.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="200.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="500.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="1000.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="+Inf"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_count{cluster="test",name="metadata-store"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_sum{cluster="test",name="metadata-store"} 13.0
pulsar_batch_metadata_store_batch_execute_time_ms_created{cluster="test",name="metadata-store"} 1.675350688827E9
# TYPE brk_ledgeroffloader_delete_offload_ops counter
# TYPE pulsar_resource_group_tenant_registers counter
# TYPE pulsar_broker_lookup_pending_requests gauge
pulsar_broker_lookup_pending_requests{cluster="test"} 0.0
# TYPE pulsar_broker_lookup summary
pulsar_broker_lookup{cluster="test",quantile="0.5"} NaN
pulsar_broker_lookup{cluster="test",quantile="0.99"} NaN
pulsar_broker_lookup{cluster="test",quantile="0.999"} NaN
pulsar_broker_lookup{cluster="test",quantile="1.0"} -Inf
pulsar_broker_lookup_count{cluster="test"} 1025.0
pulsar_broker_lookup_sum{cluster="test"} 36144.0
# TYPE pulsar_resource_group_namespace_registers counter
# TYPE jvm_memory_objects_pending_finalization gauge
jvm_memory_objects_pending_finalization{cluster="test"} 0.0
# TYPE jvm_memory_bytes_used gauge
jvm_memory_bytes_used{cluster="test",area="heap"} 6.10271232E8
jvm_memory_bytes_used{cluster="test",area="nonheap"} 2.26090128E8
# TYPE jvm_memory_bytes_committed gauge
jvm_memory_bytes_committed{cluster="test",area="heap"} 1.010827264E9
jvm_memory_bytes_committed{cluster="test",area="nonheap"} 2.32521728E8
# TYPE jvm_memory_bytes_max gauge
jvm_memory_bytes_max{cluster="test",area="heap"} 1.073741824E9
jvm_memory_bytes_max{cluster="test",area="nonheap"} -1.0
# TYPE jvm_memory_bytes_init gauge
jvm_memory_bytes_init{cluster="test",area="heap"} 1.1534336E8
jvm_memory_bytes_init{cluster="test",area="nonheap"} 7667712.0
# TYPE jvm_memory_pool_bytes_used gauge
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'non-nmethods'"} 2340224.0
jvm_memory_pool_bytes_used{cluster="test",pool="Metaspace"} 1.20871904E8
jvm_memory_pool_bytes_used{cluster="test",pool="ZHeap"} 6.10271232E8
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'profiled nmethods'"} 6.1774208E7
jvm_memory_pool_bytes_used{cluster="test",pool="Compressed Class Space"} 1.3298224E7
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2.7805568E7
# TYPE jvm_memory_pool_bytes_committed gauge
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'non-nmethods'"} 2686976.0
jvm_memory_pool_bytes_committed{cluster="test",pool="Metaspace"} 1.25108224E8
jvm_memory_pool_bytes_committed{cluster="test",pool="ZHeap"} 1.010827264E9
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'profiled nmethods'"} 6.1865984E7
jvm_memory_pool_bytes_committed{cluster="test",pool="Compressed Class Space"} 1.5007744E7
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2.78528E7
# TYPE jvm_memory_pool_bytes_max gauge
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'non-nmethods'"} 5828608.0
jvm_memory_pool_bytes_max{cluster="test",pool="Metaspace"} -1.0
jvm_memory_pool_bytes_max{cluster="test",pool="ZHeap"} 1.073741824E9
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'profiled nmethods'"} 1.22912768E8
jvm_memory_pool_bytes_max{cluster="test",pool="Compressed Class Space"} 1.073741824E9
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 1.22916864E8
# TYPE jvm_memory_pool_bytes_init gauge
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'non-nmethods'"} 2555904.0
jvm_memory_pool_bytes_init{cluster="test",pool="Metaspace"} 0.0
jvm_memory_pool_bytes_init{cluster="test",pool="ZHeap"} 8388608.0
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'profiled nmethods'"} 2555904.0
jvm_memory_pool_bytes_init{cluster="test",pool="Compressed Class Space"} 0.0
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2555904.0
# TYPE jvm_memory_pool_collection_used_bytes gauge
jvm_memory_pool_collection_used_bytes{cluster="test",pool="ZHeap"} 5.41065216E8
# TYPE jvm_memory_pool_collection_committed_bytes gauge
jvm_memory_pool_collection_committed_bytes{cluster="test",pool="ZHeap"} 1.010827264E9
# TYPE jvm_memory_pool_collection_max_bytes gauge
jvm_memory_pool_collection_max_bytes{cluster="test",pool="ZHeap"} 1.073741824E9
# TYPE jvm_memory_pool_collection_init_bytes gauge
jvm_memory_pool_collection_init_bytes{cluster="test",pool="ZHeap"} 8388608.0
# TYPE jvm_memory_direct_bytes_max gauge
jvm_memory_direct_bytes_max{cluster="test"} 1.073741824E9
# TYPE pulsar_expired_token counter
pulsar_expired_token_total{cluster="test"} 0.0
pulsar_expired_token_created{cluster="test"} 1.675350692359E9
# TYPE pulsar_batch_metadata_store_batch_size histogram
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 11.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 17.0
pulsar_batch_metadata_store_batch_size_count{cluster="test",name="configuration-metadata-store"} 17.0
pulsar_batch_metadata_store_batch_size_sum{cluster="test",name="configuration-metadata-store"} 24.0
pulsar_batch_metadata_store_batch_size_created{cluster="test",name="configuration-metadata-store"} 1.67535068884E9
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="1.0"} 28.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="5.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="10.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="20.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="50.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="100.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="200.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="500.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="1000.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="+Inf"} 36.0
pulsar_batch_metadata_store_batch_size_count{cluster="test",name="metadata-store"} 36.0
pulsar_batch_metadata_store_batch_size_sum{cluster="test",name="metadata-store"} 48.0
pulsar_batch_metadata_store_batch_size_created{cluster="test",name="metadata-store"} 1.675350688827E9
# TYPE jvm_buffer_pool_used_bytes gauge
jvm_buffer_pool_used_bytes{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_used_bytes{cluster="test",pool="direct"} 1.7293548E7
jvm_buffer_pool_used_bytes{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE jvm_buffer_pool_capacity_bytes gauge
jvm_buffer_pool_capacity_bytes{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_capacity_bytes{cluster="test",pool="direct"} 1.7293547E7
jvm_buffer_pool_capacity_bytes{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE jvm_buffer_pool_used_buffers gauge
jvm_buffer_pool_used_buffers{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_used_buffers{cluster="test",pool="direct"} 178.0
jvm_buffer_pool_used_buffers{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE pulsar_metadata_store_ops_latency_ms histogram
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="del",status="fail"} 1.675350688822E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 1.675350688833E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="del",status="success"} 1.675350688822E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 1.675350688833E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="get",status="fail"} 1.67535051798E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 1.675350688833E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="1.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="3.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="5.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="10.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="20.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="50.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="100.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="200.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="500.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="1000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="2000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="5000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="+Inf"} 7.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="get",status="success"} 7.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="get",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="get",status="success"} 1.67535051798E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="put",status="fail"} 1.67535051798E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="1.0"} 3.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="3.0"} 3.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="5.0"} 13.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="10.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="20.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="50.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="100.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="200.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="500.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="1000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="2000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="5000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="+Inf"} 16.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="get",status="success"} 16.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="get",status="success"} 67.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="get",status="success"} 1.675350688833E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="del",status="fail"} 1.67535051798E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="put",status="fail"} 1.675350688822E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="1.0"} 3.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="3.0"} 8.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="5.0"} 26.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="10.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="20.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="50.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="100.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="200.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="500.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="1000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="2000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="5000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="+Inf"} 28.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="get",status="success"} 28.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="get",status="success"} 106.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="get",status="success"} 1.675350688822E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="get",status="fail"} 1.675350688822E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="del",status="success"} 1.67535051798E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="1.0"} 6.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="3.0"} 8.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="5.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="10.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="20.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="50.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="100.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="200.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="500.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="1000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="2000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="5000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="+Inf"} 15.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="put",status="success"} 15.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="put",status="success"} 40.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="put",status="success"} 1.675350688822E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="1.0"} 50.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="3.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="5.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="10.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="20.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="50.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="100.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="200.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="500.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="1000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="2000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="5000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="+Inf"} 52.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="put",status="success"} 52.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="put",status="success"} 5.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="put",status="success"} 1.67535051798E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="del",status="success"} 1.675350688833E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="1.0"} 2.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="3.0"} 3.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="5.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="10.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="20.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="50.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="100.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="200.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="500.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="1000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="2000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="5000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="+Inf"} 5.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="put",status="success"} 5.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="put",status="success"} 13.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="put",status="success"} 1.675350688833E9
# TYPE pulsar_resource_group_calculate_quota_secs summary
pulsar_resource_group_calculate_quota_secs{cluster="test",quantile="0.5"} 5.1E-6
pulsar_resource_group_calculate_quota_secs{cluster="test",quantile="0.9"} 7.801E-6
pulsar_resource_group_calculate_quota_secs_count{cluster="test"} 3.0
pulsar_resource_group_calculate_quota_secs_sum{cluster="test"} 0.007532447
pulsar_resource_group_calculate_quota_secs_created{cluster="test"} 1.675349595679E9
# TYPE jvm_memory_direct_bytes_used gauge
jvm_memory_direct_bytes_used{cluster="test"} 1.73427E7
# TYPE jvm_gc_collection_seconds summary
jvm_gc_collection_seconds_count{cluster="test",gc="ZGC Cycles"} 245.0
jvm_gc_collection_seconds_sum{cluster="test",gc="ZGC Cycles"} 256.665
jvm_gc_collection_seconds_count{cluster="test",gc="ZGC Pauses"} 738.0
jvm_gc_collection_seconds_sum{cluster="test",gc="ZGC Pauses"} 0.02
# TYPE pulsar_ml_reads_available_inflight_bytes gauge
pulsar_ml_reads_available_inflight_bytes{cluster="test"} -1.0
# TYPE pulsar_resource_group_calculated_messages_quota counter
# TYPE pulsar_batch_metadata_store_executor_queue_size gauge
pulsar_batch_metadata_store_executor_queue_size{cluster="test",name="configuration-metadata-store"} 1.0
pulsar_batch_metadata_store_executor_queue_size{cluster="test",name="metadata-store"} 1.0
# TYPE jvm_info gauge
jvm_info{cluster="test",runtime="OpenJDK Runtime Environment",vendor="Eclipse Adoptium",version="17.0.6+10"} 1.0
# TYPE pulsar_version_info gauge
pulsar_version_info{cluster="test",version="2.12.0-SNAPSHOT",commit="e005ce44d1f520ba10db67816fb7c87d1c49d2a3"} 1.0
# TYPE pulsar_resource_group_namespace_unregisters counter
# TYPE pulsar_ml_cache_pendingreads_matched counter
pulsar_ml_cache_pendingreads_matched_total{cluster="test"} 1.0
pulsar_ml_cache_pendingreads_matched_created{cluster="test"} 1.675349605118E9
# TYPE pulsar_resource_group_tenant_unregisters counter
# TYPE pulsar_resource_group_aggregate_usage_secs summary
pulsar_resource_group_aggregate_usage_secs{cluster="test",quantile="0.5"} 0.001705012
pulsar_resource_group_aggregate_usage_secs{cluster="test",quantile="0.9"} 0.02789727
pulsar_resource_group_aggregate_usage_secs_count{cluster="test"} 3.0
pulsar_resource_group_aggregate_usage_secs_sum{cluster="test"} 0.080226589
pulsar_resource_group_aggregate_usage_secs_created{cluster="test"} 1.675349595679E9
# TYPE pulsar_broker_topic_load_pending_requests gauge
pulsar_broker_topic_load_pending_requests{cluster="test"} 0.0
# TYPE pulsar_broker_lookup_redirects counter
pulsar_broker_lookup_redirects_total{cluster="test"} 6.0
pulsar_broker_lookup_redirects_created{cluster="test"} 1.675349567271E9
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_both counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_both_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_both_created{cluster="test"} 1.67534960512E9
# TYPE brk_ledgeroffloader_read_bytes counter
# TYPE jvm_threads_current gauge
jvm_threads_current{cluster="test"} 243.0
# TYPE jvm_threads_daemon gauge
jvm_threads_daemon{cluster="test"} 82.0
# TYPE jvm_threads_peak gauge
jvm_threads_peak{cluster="test"} 563.0
# TYPE jvm_threads_started counter
jvm_threads_started_total{cluster="test"} 12888.0
# TYPE jvm_threads_deadlocked gauge
jvm_threads_deadlocked{cluster="test"} 0.0
# TYPE jvm_threads_deadlocked_monitor gauge
jvm_threads_deadlocked_monitor{cluster="test"} 0.0
# TYPE jvm_threads_state gauge
jvm_threads_state{cluster="test",state="NEW"} 0.0
jvm_threads_state{cluster="test",state="TERMINATED"} 0.0
jvm_threads_state{cluster="test",state="RUNNABLE"} 16.0
jvm_threads_state{cluster="test",state="BLOCKED"} 0.0
jvm_threads_state{cluster="test",state="WAITING"} 153.0
jvm_threads_state{cluster="test",state="TIMED_WAITING"} 74.0
jvm_threads_state{cluster="test",state="UNKNOWN"} 0.0
# TYPE topic_load_times summary
topic_load_times{cluster="test",quantile="0.5"} NaN
topic_load_times{cluster="test",quantile="0.75"} NaN
topic_load_times{cluster="test",quantile="0.95"} NaN
topic_load_times{cluster="test",quantile="0.99"} NaN
topic_load_times{cluster="test",quantile="0.999"} NaN
topic_load_times{cluster="test",quantile="0.9999"} NaN
topic_load_times_count{cluster="test"} 10.0
topic_load_times_sum{cluster="test"} 1892.0
topic_load_times_created{cluster="test"} 1.675349570443E9
# TYPE jetty_requests counter
jetty_requests_total{cluster="test"} 9.0
# TYPE jetty_requests_active gauge
jetty_requests_active{cluster="test"} 0.0
# TYPE jetty_requests_active_max gauge
jetty_requests_active_max{cluster="test"} 1.0
# TYPE jetty_request_time_max_seconds gauge
jetty_request_time_max_seconds{cluster="test"} 0.029
# TYPE jetty_request_time_seconds counter
jetty_request_time_seconds_total{cluster="test"} 0.124
# TYPE jetty_dispatched counter
jetty_dispatched_total{cluster="test"} 9.0
# TYPE jetty_dispatched_active gauge
jetty_dispatched_active{cluster="test"} 0.0
# TYPE jetty_dispatched_active_max gauge
jetty_dispatched_active_max{cluster="test"} 1.0
# TYPE jetty_dispatched_time_max gauge
jetty_dispatched_time_max{cluster="test"} 27.0
# TYPE jetty_dispatched_time_seconds counter
jetty_dispatched_time_seconds_total{cluster="test"} 0.057
# TYPE jetty_async_requests counter
jetty_async_requests_total{cluster="test"} 9.0
# TYPE jetty_async_requests_waiting gauge
jetty_async_requests_waiting{cluster="test"} 0.0
# TYPE jetty_async_requests_waiting_max gauge
jetty_async_requests_waiting_max{cluster="test"} 1.0
# TYPE jetty_async_dispatches counter
jetty_async_dispatches_total{cluster="test"} 0.0
# TYPE jetty_expires counter
jetty_expires_total{cluster="test"} 0.0
# TYPE jetty_responses counter
jetty_responses_total{cluster="test",code="1xx"} 0.0
jetty_responses_total{cluster="test",code="2xx"} 9.0
jetty_responses_total{cluster="test",code="3xx"} 0.0
jetty_responses_total{cluster="test",code="4xx"} 0.0
jetty_responses_total{cluster="test",code="5xx"} 0.0
# TYPE jetty_stats_seconds gauge
jetty_stats_seconds{cluster="test"} 0.692
# TYPE jetty_responses_bytes counter
jetty_responses_bytes_total{cluster="test"} 498.0
# TYPE pulsar_metadata_store_put_bytes counter
pulsar_metadata_store_put_bytes_total{cluster="test",name="configuration-metadata-store"} 2280.0
pulsar_metadata_store_put_bytes_created{cluster="test",name="configuration-metadata-store"} 1.675350688833E9
pulsar_metadata_store_put_bytes_total{cluster="test",name="metadata-store"} 1929.0
pulsar_metadata_store_put_bytes_created{cluster="test",name="metadata-store"} 1.675350688822E9
pulsar_metadata_store_put_bytes_total{cluster="test",name=""} 985.0
pulsar_metadata_store_put_bytes_created{cluster="test",name=""} 1.67535051798E9
# TYPE caffeine_cache_hit counter
caffeine_cache_hit_total{cluster="test",cache="owned-bundles"} 5.0
caffeine_cache_hit_total{cluster="test",cache="bundles"} 5.0
# TYPE caffeine_cache_miss counter
caffeine_cache_miss_total{cluster="test",cache="owned-bundles"} 4.0
caffeine_cache_miss_total{cluster="test",cache="bundles"} 4.0
# TYPE caffeine_cache_requests counter
caffeine_cache_requests_total{cluster="test",cache="owned-bundles"} 9.0
caffeine_cache_requests_total{cluster="test",cache="bundles"} 9.0
# TYPE caffeine_cache_eviction counter
caffeine_cache_eviction_total{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_eviction_total{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_eviction_weight gauge
caffeine_cache_eviction_weight{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_eviction_weight{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_load_failure counter
caffeine_cache_load_failure_total{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_load_failure_total{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_loads counter
caffeine_cache_loads_total{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_loads_total{cluster="test",cache="bundles"} 4.0
# TYPE caffeine_cache_estimated_size gauge
caffeine_cache_estimated_size{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_estimated_size{cluster="test",cache="bundles"} 3.0
# TYPE caffeine_cache_load_duration_seconds summary
caffeine_cache_load_duration_seconds_count{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_load_duration_seconds_sum{cluster="test",cache="owned-bundles"} 0.008023703
caffeine_cache_load_duration_seconds_count{cluster="test",cache="bundles"} 4.0
caffeine_cache_load_duration_seconds_sum{cluster="test",cache="bundles"} 0.017226322
# TYPE pulsar_ml_cache_pendingreads_missed counter
pulsar_ml_cache_pendingreads_missed_total{cluster="test"} 2713.0
pulsar_ml_cache_pendingreads_missed_created{cluster="test"} 1.675349605118E9
# TYPE pulsar_resource_group_updates counter
# TYPE pulsar_broker_throttled_connections_global_limit gauge
pulsar_broker_throttled_connections_global_limit{cluster="test"} 0.0
# TYPE pulsar_ml_cache_pendingreads_entries_notread counter
pulsar_ml_cache_pendingreads_entries_notread_total{cluster="test"} 1.0
pulsar_ml_cache_pendingreads_entries_notread_created{cluster="test"} 1.675349605118E9
# TYPE pulsar_broker_pending_bytes_to_dispatch gauge
pulsar_broker_pending_bytes_to_dispatch{cluster="test"} 0.0
# TYPE jvm_memory_pool_allocated_bytes counter
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'profiled nmethods'"} 7.806843776E9
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'profiled nmethods'"} 1.675350067206E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="ZHeap"} 7.0382518272E10
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="ZHeap"} 1.675350067206E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 3.480838656E9
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 1.675350067206E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="Compressed Class Space"} 1.959364624E9
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="Compressed Class Space"} 1.675350067206E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="Metaspace"} 1.7397193472E10
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="Metaspace"} 1.675350067206E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'non-nmethods'"} 3.41848576E8
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'non-nmethods'"} 1.675350067206E9
# TYPE pulsar_resource_group_messages_used counter
# TYPE jvm_classes_currently_loaded gauge
jvm_classes_currently_loaded{cluster="test"} 20510.0
# TYPE jvm_classes_loaded counter
jvm_classes_loaded_total{cluster="test"} 23258.0
# TYPE jvm_classes_unloaded counter
jvm_classes_unloaded_total{cluster="test"} 2748.0
# TYPE pulsar_ml_cache_pendingreads_entries_read counter
pulsar_ml_cache_pendingreads_entries_read_total{cluster="test"} 2713.0
pulsar_ml_cache_pendingreads_entries_read_created{cluster="test"} 1.675349605118E9
# TYPE pulsar_batch_metadata_store_queue_wait_time_ms histogram
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 7.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_count{cluster="test",name="configuration-metadata-store"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_sum{cluster="test",name="configuration-metadata-store"} 81.0
pulsar_batch_metadata_store_queue_wait_time_ms_created{cluster="test",name="configuration-metadata-store"} 1.67535068884E9
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="1.0"} 12.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="5.0"} 46.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="10.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="20.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="50.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="100.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="200.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="500.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="1000.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="+Inf"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_count{cluster="test",name="metadata-store"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_sum{cluster="test",name="metadata-store"} 148.0
pulsar_batch_metadata_store_queue_wait_time_ms_created{cluster="test",name="metadata-store"} 1.675350688827E9
# TYPE pulsar_expiring_token_minutes histogram
pulsar_expiring_token_minutes_bucket{cluster="test",le="5.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="10.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="60.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="240.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="+Inf"} 0.0
pulsar_expiring_token_minutes_count{cluster="test"} 0.0
pulsar_expiring_token_minutes_sum{cluster="test"} 0.0
pulsar_expiring_token_minutes_created{cluster="test"} 1.675350692359E9
# TYPE pulsar_resource_group_bytes_used counter
# TYPE process_cpu_seconds counter
process_cpu_seconds_total{cluster="test"} 444.04
# TYPE process_start_time_seconds gauge
process_start_time_seconds{cluster="test"} 1.675349531039E9
# TYPE process_open_fds gauge
process_open_fds{cluster="test"} 686.0
# TYPE process_max_fds gauge
process_max_fds{cluster="test"} 65536.0
# TYPE process_virtual_memory_bytes gauge
process_virtual_memory_bytes{cluster="test"} 6.3257235456E10
# TYPE process_resident_memory_bytes gauge
process_resident_memory_bytes{cluster="test"} 3.250163712E9
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_left counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_left_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_left_created{cluster="test"} 1.675349605118E9
# TYPE pulsar_storage_write_latency_le_200 gauge
pulsar_storage_write_latency_le_200{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_16_kb gauge
pulsar_entry_size_le_16_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_logical_size gauge
pulsar_storage_logical_size{cluster="test"} 0
pulsar_storage_logical_size{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_le_1_mb gauge
pulsar_entry_size_le_1_mb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_producers_count gauge
pulsar_producers_count{cluster="test"} 0
pulsar_producers_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_rate_out gauge
pulsar_rate_out{cluster="test"} 0
pulsar_rate_out{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_storage_ledger_write_latency_sum gauge
pulsar_storage_ledger_write_latency_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_200 gauge
pulsar_storage_ledger_write_latency_le_200{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_consumer_msg_ack_rate gauge
pulsar_consumer_msg_ack_rate{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_1 gauge
pulsar_storage_ledger_write_latency_le_1{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_1000 gauge
pulsar_storage_ledger_write_latency_le_1000{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_2_kb gauge
pulsar_entry_size_le_2_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_20 gauge
pulsar_storage_ledger_write_latency_le_20{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_50 gauge
pulsar_storage_write_latency_le_50{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_5 gauge
pulsar_storage_write_latency_le_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_delayed_message_index_size_bytes gauge
pulsar_delayed_message_index_size_bytes{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_size gauge
pulsar_storage_size{cluster="test"} 0
pulsar_storage_size{cluster="test",namespace="prop/ns-abc1"} 15600
# TYPE pulsar_storage_write_latency_le_10 gauge
pulsar_storage_write_latency_le_10{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_throughput_in gauge
pulsar_throughput_in{cluster="test"} 0
pulsar_throughput_in{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_storage_write_latency_le_1 gauge
pulsar_storage_write_latency_le_1{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_in_bytes_total gauge
pulsar_in_bytes_total{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_le_128 gauge
pulsar_entry_size_le_128{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_rate_in gauge
pulsar_rate_in{cluster="test"} 0
pulsar_rate_in{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_txn_tb_aborted_total gauge
pulsar_txn_tb_aborted_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_100_kb gauge
pulsar_entry_size_le_100_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_throughput_out gauge
pulsar_throughput_out{cluster="test"} 0
pulsar_throughput_out{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_topics_count gauge
pulsar_topics_count{cluster="test"} 0
pulsar_topics_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_storage_read_rate gauge
pulsar_storage_read_rate{cluster="test"} 0
pulsar_storage_read_rate{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_in_messages_total gauge
pulsar_in_messages_total{cluster="test",namespace="prop/ns-abc1"} 100
# TYPE pulsar_storage_write_latency_count gauge
pulsar_storage_write_latency_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_1_kb gauge
pulsar_entry_size_le_1_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_10 gauge
pulsar_storage_ledger_write_latency_le_10{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_100 gauge
pulsar_storage_write_latency_le_100{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_50 gauge
pulsar_storage_ledger_write_latency_le_50{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_overflow gauge
pulsar_storage_ledger_write_latency_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_1000 gauge
pulsar_storage_write_latency_le_1000{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_20 gauge
pulsar_storage_write_latency_le_20{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_sum gauge
pulsar_storage_write_latency_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_0_5 gauge
pulsar_storage_ledger_write_latency_le_0_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_0_5 gauge
pulsar_storage_write_latency_le_0_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_count gauge
pulsar_entry_size_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_100 gauge
pulsar_storage_ledger_write_latency_le_100{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_out_messages_total gauge
pulsar_out_messages_total{cluster="test",namespace="prop/ns-abc1"} 100
# TYPE pulsar_entry_size_le_overflow gauge
pulsar_entry_size_le_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_subscription_delayed gauge
pulsar_subscription_delayed{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_5 gauge
pulsar_storage_ledger_write_latency_le_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_rate gauge
pulsar_storage_write_rate{cluster="test"} 0
pulsar_storage_write_rate{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_msg_backlog gauge
pulsar_msg_backlog{cluster="test"} 0
pulsar_msg_backlog{cluster="test",namespace="prop/ns-abc1",remote_cluster="local"} 100
# TYPE pulsar_subscriptions_count gauge
pulsar_subscriptions_count{cluster="test"} 0
pulsar_subscriptions_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_entry_size_le_4_kb gauge
pulsar_entry_size_le_4_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_count gauge
pulsar_storage_ledger_write_latency_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_txn_tb_active_total gauge
pulsar_txn_tb_active_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_backlog_size gauge
pulsar_storage_backlog_size{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_txn_tb_committed_total gauge
pulsar_txn_tb_committed_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_consumers_count gauge
pulsar_consumers_count{cluster="test"} 0
pulsar_consumers_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_entry_size_le_512 gauge
pulsar_entry_size_le_512{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_out_bytes_total gauge
pulsar_out_bytes_total{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_sum gauge
pulsar_entry_size_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_offloaded_size gauge
pulsar_storage_offloaded_size{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_overflow gauge
pulsar_storage_write_latency_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_ml_cache_entries gauge
pulsar_ml_cache_entries{cluster="test"} 0
# TYPE pulsar_ml_cache_evicted_entries_total gauge
pulsar_ml_cache_evicted_entries_total{cluster="test"} 100
# TYPE pulsar_ml_cache_evictions gauge
pulsar_ml_cache_evictions{cluster="test"} 0
# TYPE pulsar_ml_cache_hits_rate gauge
pulsar_ml_cache_hits_rate{cluster="test"} 0.0
# TYPE pulsar_ml_cache_hits_throughput gauge
pulsar_ml_cache_hits_throughput{cluster="test"} 0.0
# TYPE pulsar_ml_cache_inserted_entries_total gauge
pulsar_ml_cache_inserted_entries_total{cluster="test"} 100
# TYPE pulsar_ml_cache_misses_rate gauge
pulsar_ml_cache_misses_rate{cluster="test"} 0.0
# TYPE pulsar_ml_cache_misses_throughput gauge
pulsar_ml_cache_misses_throughput{cluster="test"} 0.0
# TYPE pulsar_ml_cache_pool_active_allocations gauge
pulsar_ml_cache_pool_active_allocations{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_huge gauge
pulsar_ml_cache_pool_active_allocations_huge{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_normal gauge
pulsar_ml_cache_pool_active_allocations_normal{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_small gauge
pulsar_ml_cache_pool_active_allocations_small{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_allocated gauge
pulsar_ml_cache_pool_allocated{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_used gauge
pulsar_ml_cache_pool_used{cluster="test"} 0
# TYPE pulsar_ml_cache_used_size gauge
pulsar_ml_cache_used_size{cluster="test"} 0
# TYPE pulsar_ml_count gauge
pulsar_ml_count{cluster="test"} 1
# TYPE pulsar_ml_AddEntryBytesRate gauge
pulsar_ml_AddEntryBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryErrors gauge
pulsar_ml_AddEntryErrors{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryLatencyBuckets gauge
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_AddEntryLatencyBuckets_OVERFLOW gauge
pulsar_ml_AddEntryLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryMessagesRate gauge
pulsar_ml_AddEntryMessagesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntrySucceed gauge
pulsar_ml_AddEntrySucceed{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryWithReplicasBytesRate gauge
pulsar_ml_AddEntryWithReplicasBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_EntrySizeBuckets gauge
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_128.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1024.0_2048.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="102400.0_1048576.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="128.0_512.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="16384.0_102400.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="2048.0_4096.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="4096.0_16384.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="512.0_1024.0"} 0.0
# TYPE pulsar_ml_EntrySizeBuckets_OVERFLOW gauge
pulsar_ml_EntrySizeBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_LedgerAddEntryLatencyBuckets gauge
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_LedgerAddEntryLatencyBuckets_OVERFLOW gauge
pulsar_ml_LedgerAddEntryLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_LedgerSwitchLatencyBuckets gauge
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_LedgerSwitchLatencyBuckets_OVERFLOW gauge
pulsar_ml_LedgerSwitchLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_MarkDeleteRate gauge
pulsar_ml_MarkDeleteRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_NumberOfMessagesInBacklog gauge
pulsar_ml_NumberOfMessagesInBacklog{cluster="test", namespace="prop/ns-abc1/persistent"} 100.0
# TYPE pulsar_ml_ReadEntriesBytesRate gauge
pulsar_ml_ReadEntriesBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesErrors gauge
pulsar_ml_ReadEntriesErrors{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesRate gauge
pulsar_ml_ReadEntriesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesSucceeded gauge
pulsar_ml_ReadEntriesSucceeded{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_StoredMessagesSize gauge
pulsar_ml_StoredMessagesSize{cluster="test", namespace="prop/ns-abc1/persistent"} 15600.0
# TYPE pulsar_active_connections gauge
pulsar_active_connections{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_connection_closed_total_count gauge
pulsar_connection_closed_total_count{cluster="test", broker="localhost", metric="broker_connection"} 0
# TYPE pulsar_connection_create_fail_count gauge
pulsar_connection_create_fail_count{cluster="test", broker="localhost", metric="broker_connection"} 0
# TYPE pulsar_connection_create_success_count gauge
pulsar_connection_create_success_count{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_connection_created_total_count gauge
pulsar_connection_created_total_count{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_lb_bandwidth_in_usage gauge
pulsar_lb_bandwidth_in_usage{cluster="test", broker="localhost", metric="loadBalancing"} 0.0
# TYPE pulsar_lb_bandwidth_out_usage gauge
pulsar_lb_bandwidth_out_usage{cluster="test", broker="localhost", metric="loadBalancing"} 0.0
# TYPE pulsar_lb_cpu_usage gauge
pulsar_lb_cpu_usage{cluster="test", broker="localhost", metric="loadBalancing"} 6.4805325E-5
# TYPE pulsar_lb_directMemory_usage gauge
pulsar_lb_directMemory_usage{cluster="test", broker="localhost", metric="loadBalancing"} 1.5625
# TYPE pulsar_lb_memory_usage gauge
pulsar_lb_memory_usage{cluster="test", broker="localhost", metric="loadBalancing"} 58.398438
# TYPE pulsar_lb_bundles_split_total gauge
pulsar_lb_bundles_split_total{cluster="test", metric="bundlesSplit"} 0
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_max_queue_size gauge
pulsar_managedLedger_client_bookkeeper_ml_scheduler_max_queue_size{cluster="test"} -1
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_threads gauge
pulsar_managedLedger_client_bookkeeper_ml_scheduler_threads{cluster="test"} 2
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_completed_tasks gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_completed_tasks{cluster="test"} 8
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_queue gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_queue{cluster="test"} 0
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_total_tasks gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_total_tasks{cluster="test"} 8
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_completed_tasks gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_completed_tasks{cluster="test"} 17
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_queue gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_queue{cluster="test"} 4
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_total_tasks gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_total_tasks{cluster="test"} 21
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution summary
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.5"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.75"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.95"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.99"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.9999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="1.0"} -Infinity
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_count{cluster="test", success="false"} 0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_sum{cluster="test", success="false"} 0.0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.5"} 0.066
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.75"} 0.066
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.95"} 0.066
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.99"} 0.066
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.999"} 0.066
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.9999"} 0.066
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="1.0"} 0.066
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_count{cluster="test", success="true"} 23
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_sum{cluster="test", success="true"} 6.0
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued summary
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.5"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.75"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.95"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.99"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.9999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="1.0"} -Infinity
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_count{cluster="test", success="false"} 0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_sum{cluster="test", success="false"} 0.0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.5"} 0.048
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.75"} 0.048
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.95"} 0.048
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.99"} 0.048
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.999"} 0.048
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.9999"} 0.048
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="1.0"} 0.048
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_count{cluster="test", success="true"} 23
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_sum{cluster="test", success="true"} 174.0

 expected object to not be null
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.assertNotNull(Assert.java:1319)
	at org.apache.pulsar.broker.stats.MetadataStoreStatsTest.testMetadataStoreStats(MetadataStoreStatsTest.java:113)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

```
java.lang.AssertionError:
Assertion failed with metrics:
# TYPE pulsar_resource_group_namespace_registers counter
# TYPE pulsar_replicated_subscriptions_snapshot_ms summary
pulsar_replicated_subscriptions_snapshot_ms_count{cluster="test"} 22.0
pulsar_replicated_subscriptions_snapshot_ms_sum{cluster="test"} 434.0
pulsar_replicated_subscriptions_snapshot_ms_created{cluster="test"} 1.675461651025E9
# TYPE pulsar_ml_cache_pendingreads_missed counter
pulsar_ml_cache_pendingreads_missed_total{cluster="test"} 807.0
pulsar_ml_cache_pendingreads_missed_created{cluster="test"} 1.675461227482E9
# TYPE pulsar_authentication_failures counter
# TYPE pulsar_broker_lookup_pending_requests gauge
pulsar_broker_lookup_pending_requests{cluster="test"} 0.0
# TYPE pulsar_batch_metadata_store_batch_size histogram
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 11.0
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-03T22:08:33.5081666Z](https://github.com/apache/pulsar/actions/runs/4088105891/jobs/7049537991#step:11:1262)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError:
Assertion failed with metrics:
# TYPE pulsar_resource_group_namespace_registers counter
# TYPE pulsar_replicated_subscriptions_snapshot_ms summary
pulsar_replicated_subscriptions_snapshot_ms_count{cluster="test"} 22.0
pulsar_replicated_subscriptions_snapshot_ms_sum{cluster="test"} 434.0
pulsar_replicated_subscriptions_snapshot_ms_created{cluster="test"} 1.675461651025E9
# TYPE pulsar_ml_cache_pendingreads_missed counter
pulsar_ml_cache_pendingreads_missed_total{cluster="test"} 807.0
pulsar_ml_cache_pendingreads_missed_created{cluster="test"} 1.675461227482E9
# TYPE pulsar_authentication_failures counter
# TYPE pulsar_broker_lookup_pending_requests gauge
pulsar_broker_lookup_pending_requests{cluster="test"} 0.0
# TYPE pulsar_batch_metadata_store_batch_size histogram
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 11.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 17.0
pulsar_batch_metadata_store_batch_size_count{cluster="test",name="configuration-metadata-store"} 17.0
pulsar_batch_metadata_store_batch_size_sum{cluster="test",name="configuration-metadata-store"} 24.0
pulsar_batch_metadata_store_batch_size_created{cluster="test",name="configuration-metadata-store"} 1.675462111671E9
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="1.0"} 28.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="5.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="10.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="20.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="50.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="100.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="200.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="500.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="1000.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="+Inf"} 36.0
pulsar_batch_metadata_store_batch_size_count{cluster="test",name="metadata-store"} 36.0
pulsar_batch_metadata_store_batch_size_sum{cluster="test",name="metadata-store"} 48.0
pulsar_batch_metadata_store_batch_size_created{cluster="test",name="metadata-store"} 1.675462111664E9
# TYPE jvm_classes_currently_loaded gauge
jvm_classes_currently_loaded{cluster="test"} 22764.0
# TYPE jvm_classes_loaded counter
jvm_classes_loaded_total{cluster="test"} 25952.0
# TYPE jvm_classes_unloaded counter
jvm_classes_unloaded_total{cluster="test"} 3188.0
# TYPE jvm_memory_direct_bytes_max gauge
jvm_memory_direct_bytes_max{cluster="test"} 1.073741824E9
# TYPE pulsar_resource_group_tenant_unregisters counter
# TYPE pulsar_resource_group_calculate_quota_secs summary
pulsar_resource_group_calculate_quota_secs{cluster="test",quantile="0.5"} NaN
pulsar_resource_group_calculate_quota_secs{cluster="test",quantile="0.9"} NaN
pulsar_resource_group_calculate_quota_secs_count{cluster="test"} 0.0
pulsar_resource_group_calculate_quota_secs_sum{cluster="test"} 0.0
pulsar_resource_group_calculate_quota_secs_created{cluster="test"} 1.675461221222E9
# TYPE pulsar_broker_throttled_connections gauge
pulsar_broker_throttled_connections{cluster="test"} -2.0
# TYPE pulsar_broker_throttled_connections_global_limit gauge
pulsar_broker_throttled_connections_global_limit{cluster="test"} 0.0
# TYPE pulsar_broker_lookup_answers counter
pulsar_broker_lookup_answers_total{cluster="test"} 2282.0
pulsar_broker_lookup_answers_created{cluster="test"} 1.67546120086E9
# TYPE pulsar_version_info gauge
pulsar_version_info{cluster="test",version="2.12.0-SNAPSHOT",commit="cdf4ff8554048e30fb6b8060fdc65bf5d40b1e94"} 1.0
# TYPE pulsar_broker_publish_latency summary
pulsar_broker_publish_latency{cluster="test",quantile="0.0"} +Inf
pulsar_broker_publish_latency{cluster="test",quantile="0.5"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.95"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.99"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.999"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.9999"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="1.0"} -Inf
pulsar_broker_publish_latency_count{cluster="test"} 2733.0
pulsar_broker_publish_latency_sum{cluster="test"} 78895.0
# TYPE pulsar_resource_group_messages_used counter
# TYPE pulsar_batch_metadata_store_executor_queue_size gauge
pulsar_batch_metadata_store_executor_queue_size{cluster="test",name="configuration-metadata-store"} 1.0
pulsar_batch_metadata_store_executor_queue_size{cluster="test",name="metadata-store"} 1.0
# TYPE brk_ledgeroffloader_delete_offload_ops counter
# TYPE pulsar_broker_topic_load_pending_requests gauge
pulsar_broker_topic_load_pending_requests{cluster="test"} 0.0
# TYPE pulsar_expired_token counter
pulsar_expired_token_total{cluster="test"} 0.0
pulsar_expired_token_created{cluster="test"} 1.675462112888E9
# TYPE jvm_info gauge
jvm_info{cluster="test",runtime="OpenJDK Runtime Environment",vendor="Eclipse Adoptium",version="17.0.6+10"} 1.0
# TYPE pulsar_resource_group_updates counter
# TYPE pulsar_resource_group_aggregate_usage_secs summary
pulsar_resource_group_aggregate_usage_secs{cluster="test",quantile="0.5"} NaN
pulsar_resource_group_aggregate_usage_secs{cluster="test",quantile="0.9"} NaN
pulsar_resource_group_aggregate_usage_secs_count{cluster="test"} 0.0
pulsar_resource_group_aggregate_usage_secs_sum{cluster="test"} 0.0
pulsar_resource_group_aggregate_usage_secs_created{cluster="test"} 1.675461221222E9
# TYPE pulsar_ml_reads_inflight_bytes gauge
pulsar_ml_reads_inflight_bytes{cluster="test"} -1.0
# TYPE pulsar_ml_reads_available_inflight_bytes gauge
pulsar_ml_reads_available_inflight_bytes{cluster="test"} -1.0
# TYPE jvm_memory_objects_pending_finalization gauge
jvm_memory_objects_pending_finalization{cluster="test"} 0.0
# TYPE jvm_memory_bytes_used gauge
jvm_memory_bytes_used{cluster="test",area="heap"} 7.04643072E8
jvm_memory_bytes_used{cluster="test",area="nonheap"} 2.45919984E8
# TYPE jvm_memory_bytes_committed gauge
jvm_memory_bytes_committed{cluster="test",area="heap"} 1.073741824E9
jvm_memory_bytes_committed{cluster="test",area="nonheap"} 2.51199488E8
# TYPE jvm_memory_bytes_max gauge
jvm_memory_bytes_max{cluster="test",area="heap"} 1.073741824E9
jvm_memory_bytes_max{cluster="test",area="nonheap"} -1.0
# TYPE jvm_memory_bytes_init gauge
jvm_memory_bytes_init{cluster="test",area="heap"} 1.1534336E8
jvm_memory_bytes_init{cluster="test",area="nonheap"} 7667712.0
# TYPE jvm_memory_pool_bytes_used gauge
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'non-nmethods'"} 2406528.0
jvm_memory_pool_bytes_used{cluster="test",pool="Metaspace"} 1.3194504E8
jvm_memory_pool_bytes_used{cluster="test",pool="ZHeap"} 7.04643072E8
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'profiled nmethods'"} 6.6819968E7
jvm_memory_pool_bytes_used{cluster="test",pool="Compressed Class Space"} 1.4764576E7
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2.9983872E7
# TYPE jvm_memory_pool_bytes_committed gauge
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'non-nmethods'"} 2621440.0
jvm_memory_pool_bytes_committed{cluster="test",pool="Metaspace"} 1.33758976E8
jvm_memory_pool_bytes_committed{cluster="test",pool="ZHeap"} 1.073741824E9
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'profiled nmethods'"} 6.8091904E7
jvm_memory_pool_bytes_committed{cluster="test",pool="Compressed Class Space"} 1.5663104E7
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 3.1064064E7
# TYPE jvm_memory_pool_bytes_max gauge
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'non-nmethods'"} 5828608.0
jvm_memory_pool_bytes_max{cluster="test",pool="Metaspace"} -1.0
jvm_memory_pool_bytes_max{cluster="test",pool="ZHeap"} 1.073741824E9
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'profiled nmethods'"} 1.22912768E8
jvm_memory_pool_bytes_max{cluster="test",pool="Compressed Class Space"} 1.073741824E9
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 1.22916864E8
# TYPE jvm_memory_pool_bytes_init gauge
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'non-nmethods'"} 2555904.0
jvm_memory_pool_bytes_init{cluster="test",pool="Metaspace"} 0.0
jvm_memory_pool_bytes_init{cluster="test",pool="ZHeap"} 8388608.0
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'profiled nmethods'"} 2555904.0
jvm_memory_pool_bytes_init{cluster="test",pool="Compressed Class Space"} 0.0
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2555904.0
# TYPE jvm_memory_pool_collection_used_bytes gauge
jvm_memory_pool_collection_used_bytes{cluster="test",pool="ZHeap"} 6.75282944E8
# TYPE jvm_memory_pool_collection_committed_bytes gauge
jvm_memory_pool_collection_committed_bytes{cluster="test",pool="ZHeap"} 1.073741824E9
# TYPE jvm_memory_pool_collection_max_bytes gauge
jvm_memory_pool_collection_max_bytes{cluster="test",pool="ZHeap"} 1.073741824E9
# TYPE jvm_memory_pool_collection_init_bytes gauge
jvm_memory_pool_collection_init_bytes{cluster="test",pool="ZHeap"} 8388608.0
# TYPE jvm_buffer_pool_used_bytes gauge
jvm_buffer_pool_used_bytes{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_used_bytes{cluster="test",pool="direct"} 2.1825954E7
jvm_buffer_pool_used_bytes{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE jvm_buffer_pool_capacity_bytes gauge
jvm_buffer_pool_capacity_bytes{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_capacity_bytes{cluster="test",pool="direct"} 2.1825953E7
jvm_buffer_pool_capacity_bytes{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE jvm_buffer_pool_used_buffers gauge
jvm_buffer_pool_used_buffers{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_used_buffers{cluster="test",pool="direct"} 231.0
jvm_buffer_pool_used_buffers{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE pulsar_resource_group_bytes_used counter
# TYPE topic_load_times summary
topic_load_times{cluster="test",quantile="0.5"} NaN
topic_load_times{cluster="test",quantile="0.75"} NaN
topic_load_times{cluster="test",quantile="0.95"} NaN
topic_load_times{cluster="test",quantile="0.99"} NaN
topic_load_times{cluster="test",quantile="0.999"} NaN
topic_load_times{cluster="test",quantile="0.9999"} NaN
topic_load_times_count{cluster="test"} 2.0
topic_load_times_sum{cluster="test"} 1869.0
topic_load_times_created{cluster="test"} 1.67546120344E9
# TYPE pulsar_ml_cache_pendingreads_matched counter
pulsar_ml_cache_pendingreads_matched_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_created{cluster="test"} 1.675461227481E9
# TYPE pulsar_expiring_token_minutes histogram
pulsar_expiring_token_minutes_bucket{cluster="test",le="5.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="10.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="60.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="240.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="+Inf"} 0.0
pulsar_expiring_token_minutes_count{cluster="test"} 0.0
pulsar_expiring_token_minutes_sum{cluster="test"} 0.0
pulsar_expiring_token_minutes_created{cluster="test"} 1.675462112888E9
# TYPE pulsar_resource_group_calculated_messages_quota counter
# TYPE pulsar_resource_group_namespace_unregisters counter
# TYPE pulsar_metadata_store_ops_latency_ms histogram
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="del",status="fail"} 1.675462111661E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 1.675462111667E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="del",status="success"} 1.675462111661E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 1.675462111667E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="get",status="fail"} 1.675461968708E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 1.675462111667E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="1.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="3.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="5.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="10.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="20.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="50.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="100.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="200.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="500.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="1000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="2000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="5000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="+Inf"} 7.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="get",status="success"} 7.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="get",status="success"} 1.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="get",status="success"} 1.675461968708E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="put",status="fail"} 1.675461968708E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="1.0"} 4.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="3.0"} 6.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="5.0"} 13.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="10.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="20.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="50.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="100.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="200.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="500.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="1000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="2000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="5000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="+Inf"} 16.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="get",status="success"} 16.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="get",status="success"} 68.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="get",status="success"} 1.675462111667E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="del",status="fail"} 1.675461968708E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="put",status="fail"} 1.675462111661E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="1.0"} 3.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="3.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="5.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="10.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="20.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="50.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="100.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="200.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="500.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="1000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="2000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="5000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="+Inf"} 28.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="get",status="success"} 28.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="get",status="success"} 107.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="get",status="success"} 1.675462111661E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="get",status="fail"} 1.675462111661E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="del",status="success"} 1.675461968708E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="1.0"} 3.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="3.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="5.0"} 14.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="10.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="20.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="50.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="100.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="200.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="500.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="1000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="2000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="5000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="+Inf"} 15.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="put",status="success"} 15.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="put",status="success"} 51.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="put",status="success"} 1.675462111661E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="1.0"} 49.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="3.0"} 51.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="5.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="10.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="20.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="50.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="100.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="200.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="500.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="1000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="2000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="5000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="+Inf"} 52.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="put",status="success"} 52.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="put",status="success"} 8.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="put",status="success"} 1.675461968708E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="del",status="success"} 1.675462111667E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="1.0"} 2.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="3.0"} 3.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="5.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="10.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="20.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="50.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="100.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="200.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="500.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="1000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="2000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="5000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="+Inf"} 5.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="put",status="success"} 5.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="put",status="success"} 12.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="put",status="success"} 1.675462111667E9
# TYPE pulsar_ml_cache_pendingreads_entries_read counter
pulsar_ml_cache_pendingreads_entries_read_total{cluster="test"} 807.0
pulsar_ml_cache_pendingreads_entries_read_created{cluster="test"} 1.675461227481E9
# TYPE jvm_memory_pool_allocated_bytes counter
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'profiled nmethods'"} 1.4093501696E10
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'profiled nmethods'"} 1.67546145292E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="ZHeap"} 1.23169931264E11
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="ZHeap"} 1.67546145292E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 6.267403648E9
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 1.67546145292E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="Compressed Class Space"} 3.514188328E9
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="Compressed Class Space"} 1.67546145292E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="Metaspace"} 3.105392396E10
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="Metaspace"} 1.67546145292E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'non-nmethods'"} 6.04543872E8
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'non-nmethods'"} 1.67546145292E9
# TYPE pulsar_metadata_store_put_bytes counter
pulsar_metadata_store_put_bytes_total{cluster="test",name="configuration-metadata-store"} 2280.0
pulsar_metadata_store_put_bytes_created{cluster="test",name="configuration-metadata-store"} 1.675462111667E9
pulsar_metadata_store_put_bytes_total{cluster="test",name="metadata-store"} 1930.0
pulsar_metadata_store_put_bytes_created{cluster="test",name="metadata-store"} 1.675462111661E9
pulsar_metadata_store_put_bytes_total{cluster="test",name=""} 985.0
pulsar_metadata_store_put_bytes_created{cluster="test",name=""} 1.675461968708E9
# TYPE pulsar_batch_metadata_store_batch_execute_time_ms histogram
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_count{cluster="test",name="configuration-metadata-store"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_sum{cluster="test",name="configuration-metadata-store"} 4.0
pulsar_batch_metadata_store_batch_execute_time_ms_created{cluster="test",name="configuration-metadata-store"} 1.675462111671E9
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="1.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="5.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="10.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="20.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="50.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="100.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="200.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="500.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="1000.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="+Inf"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_count{cluster="test",name="metadata-store"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_sum{cluster="test",name="metadata-store"} 2.0
pulsar_batch_metadata_store_batch_execute_time_ms_created{cluster="test",name="metadata-store"} 1.675462111664E9
# TYPE pulsar_broker_lookup_redirects counter
pulsar_broker_lookup_redirects_total{cluster="test"} 0.0
pulsar_broker_lookup_redirects_created{cluster="test"} 1.67546120086E9
# TYPE jvm_gc_collection_seconds summary
jvm_gc_collection_seconds_count{cluster="test",gc="ZGC Cycles"} 337.0
jvm_gc_collection_seconds_sum{cluster="test",gc="ZGC Cycles"} 196.756
jvm_gc_collection_seconds_count{cluster="test",gc="ZGC Pauses"} 1012.0
jvm_gc_collection_seconds_sum{cluster="test",gc="ZGC Pauses"} 0.016
# TYPE pulsar_resource_group_tenant_registers counter
# TYPE pulsar_replicated_subscriptions_pending_snapshots gauge
pulsar_replicated_subscriptions_pending_snapshots{cluster="test"} 0.0
# TYPE pulsar_ml_cache_pendingreads_entries_notread counter
pulsar_ml_cache_pendingreads_entries_notread_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_entries_notread_created{cluster="test"} 1.675461227481E9
# TYPE pulsar_authentication_success counter
pulsar_authentication_success_total{cluster="test",provider_name="AuthenticationProviderToken",auth_method="token"} 19.0
pulsar_authentication_success_created{cluster="test",provider_name="AuthenticationProviderToken",auth_method="token"} 1.675461295707E9
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_both counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_both_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_both_created{cluster="test"} 1.675461227482E9
# TYPE jetty_requests counter
jetty_requests_total{cluster="test"} 9.0
# TYPE jetty_requests_active gauge
jetty_requests_active{cluster="test"} 0.0
# TYPE jetty_requests_active_max gauge
jetty_requests_active_max{cluster="test"} 1.0
# TYPE jetty_request_time_max_seconds gauge
jetty_request_time_max_seconds{cluster="test"} 0.025
# TYPE jetty_request_time_seconds counter
jetty_request_time_seconds_total{cluster="test"} 0.103
# TYPE jetty_dispatched counter
jetty_dispatched_total{cluster="test"} 9.0
# TYPE jetty_dispatched_active gauge
jetty_dispatched_active{cluster="test"} 0.0
# TYPE jetty_dispatched_active_max gauge
jetty_dispatched_active_max{cluster="test"} 1.0
# TYPE jetty_dispatched_time_max gauge
jetty_dispatched_time_max{cluster="test"} 8.0
# TYPE jetty_dispatched_time_seconds counter
jetty_dispatched_time_seconds_total{cluster="test"} 0.031
# TYPE jetty_async_requests counter
jetty_async_requests_total{cluster="test"} 9.0
# TYPE jetty_async_requests_waiting gauge
jetty_async_requests_waiting{cluster="test"} 0.0
# TYPE jetty_async_requests_waiting_max gauge
jetty_async_requests_waiting_max{cluster="test"} 1.0
# TYPE jetty_async_dispatches counter
jetty_async_dispatches_total{cluster="test"} 0.0
# TYPE jetty_expires counter
jetty_expires_total{cluster="test"} 0.0
# TYPE jetty_responses counter
jetty_responses_total{cluster="test",code="1xx"} 0.0
jetty_responses_total{cluster="test",code="2xx"} 9.0
jetty_responses_total{cluster="test",code="3xx"} 0.0
jetty_responses_total{cluster="test",code="4xx"} 0.0
jetty_responses_total{cluster="test",code="5xx"} 0.0
# TYPE jetty_stats_seconds gauge
jetty_stats_seconds{cluster="test"} 0.458
# TYPE jetty_responses_bytes counter
jetty_responses_bytes_total{cluster="test"} 498.0
# TYPE pulsar_broker_lookup summary
pulsar_broker_lookup{cluster="test",quantile="0.5"} NaN
pulsar_broker_lookup{cluster="test",quantile="0.99"} NaN
pulsar_broker_lookup{cluster="test",quantile="0.999"} NaN
pulsar_broker_lookup{cluster="test",quantile="1.0"} -Inf
pulsar_broker_lookup_count{cluster="test"} 2282.0
pulsar_broker_lookup_sum{cluster="test"} 20814.0
# TYPE jvm_threads_current gauge
jvm_threads_current{cluster="test"} 443.0
# TYPE jvm_threads_daemon gauge
jvm_threads_daemon{cluster="test"} 103.0
# TYPE jvm_threads_peak gauge
jvm_threads_peak{cluster="test"} 774.0
# TYPE jvm_threads_started counter
jvm_threads_started_total{cluster="test"} 13749.0
# TYPE jvm_threads_deadlocked gauge
jvm_threads_deadlocked{cluster="test"} 0.0
# TYPE jvm_threads_deadlocked_monitor gauge
jvm_threads_deadlocked_monitor{cluster="test"} 0.0
# TYPE jvm_threads_state gauge
jvm_threads_state{cluster="test",state="NEW"} 0.0
jvm_threads_state{cluster="test",state="TERMINATED"} 0.0
jvm_threads_state{cluster="test",state="RUNNABLE"} 17.0
jvm_threads_state{cluster="test",state="BLOCKED"} 0.0
jvm_threads_state{cluster="test",state="WAITING"} 337.0
jvm_threads_state{cluster="test",state="TIMED_WAITING"} 89.0
jvm_threads_state{cluster="test",state="UNKNOWN"} 0.0
# TYPE pulsar_broker_pending_bytes_to_dispatch gauge
pulsar_broker_pending_bytes_to_dispatch{cluster="test"} 0.0
# TYPE pulsar_ml_cache_pendingreads_matched_included counter
pulsar_ml_cache_pendingreads_matched_included_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_included_created{cluster="test"} 1.675461227482E9
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_right counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_right_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_right_created{cluster="test"} 1.675461227482E9
# TYPE pulsar_resource_group_calculated_bytes_quota counter
# TYPE pulsar_broker_lookup_failures counter
pulsar_broker_lookup_failures_total{cluster="test"} 0.0
pulsar_broker_lookup_failures_created{cluster="test"} 1.67546120086E9
# TYPE caffeine_cache_hit counter
caffeine_cache_hit_total{cluster="test",cache="owned-bundles"} 5.0
caffeine_cache_hit_total{cluster="test",cache="bundles"} 5.0
# TYPE caffeine_cache_miss counter
caffeine_cache_miss_total{cluster="test",cache="owned-bundles"} 4.0
caffeine_cache_miss_total{cluster="test",cache="bundles"} 4.0
# TYPE caffeine_cache_requests counter
caffeine_cache_requests_total{cluster="test",cache="owned-bundles"} 9.0
caffeine_cache_requests_total{cluster="test",cache="bundles"} 9.0
# TYPE caffeine_cache_eviction counter
caffeine_cache_eviction_total{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_eviction_total{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_eviction_weight gauge
caffeine_cache_eviction_weight{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_eviction_weight{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_load_failure counter
caffeine_cache_load_failure_total{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_load_failure_total{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_loads counter
caffeine_cache_loads_total{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_loads_total{cluster="test",cache="bundles"} 4.0
# TYPE caffeine_cache_estimated_size gauge
caffeine_cache_estimated_size{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_estimated_size{cluster="test",cache="bundles"} 3.0
# TYPE caffeine_cache_load_duration_seconds summary
caffeine_cache_load_duration_seconds_count{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_load_duration_seconds_sum{cluster="test",cache="owned-bundles"} 0.011376585
caffeine_cache_load_duration_seconds_count{cluster="test",cache="bundles"} 4.0
caffeine_cache_load_duration_seconds_sum{cluster="test",cache="bundles"} 0.012861183
# TYPE jvm_memory_direct_bytes_used gauge
jvm_memory_direct_bytes_used{cluster="test"} 2.1875106E7
# TYPE brk_ledgeroffloader_read_bytes counter
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_left counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_left_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_left_created{cluster="test"} 1.675461227482E9
# TYPE process_cpu_seconds counter
process_cpu_seconds_total{cluster="test"} 371.98
# TYPE process_start_time_seconds gauge
process_start_time_seconds{cluster="test"} 1.675461165476E9
# TYPE process_open_fds gauge
process_open_fds{cluster="test"} 977.0
# TYPE process_max_fds gauge
process_max_fds{cluster="test"} 65536.0
# TYPE process_virtual_memory_bytes gauge
process_virtual_memory_bytes{cluster="test"} 6.3483936768E10
# TYPE process_resident_memory_bytes gauge
process_resident_memory_bytes{cluster="test"} 3.42124544E9
# TYPE pulsar_batch_metadata_store_queue_wait_time_ms histogram
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 6.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 23.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 23.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_count{cluster="test",name="configuration-metadata-store"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_sum{cluster="test",name="configuration-metadata-store"} 88.0
pulsar_batch_metadata_store_queue_wait_time_ms_created{cluster="test",name="configuration-metadata-store"} 1.675462111671E9
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="1.0"} 6.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="5.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="10.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="20.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="50.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="100.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="200.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="500.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="1000.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="+Inf"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_count{cluster="test",name="metadata-store"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_sum{cluster="test",name="metadata-store"} 170.0
pulsar_batch_metadata_store_queue_wait_time_ms_created{cluster="test",name="metadata-store"} 1.675462111664E9
# TYPE pulsar_broker_load_manager_bundle_assigment summary
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.5"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.99"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.999"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="1.0"} NaN
pulsar_broker_load_manager_bundle_assigment_count{cluster="test"} 288.0
pulsar_broker_load_manager_bundle_assigment_sum{cluster="test"} 3509.0
# TYPE pulsar_storage_write_latency_le_200 gauge
pulsar_storage_write_latency_le_200{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_16_kb gauge
pulsar_entry_size_le_16_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_logical_size gauge
pulsar_storage_logical_size{cluster="test"} 0
pulsar_storage_logical_size{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_le_1_mb gauge
pulsar_entry_size_le_1_mb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_producers_count gauge
pulsar_producers_count{cluster="test"} 0
pulsar_producers_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_rate_out gauge
pulsar_rate_out{cluster="test"} 0
pulsar_rate_out{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_storage_ledger_write_latency_sum gauge
pulsar_storage_ledger_write_latency_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_200 gauge
pulsar_storage_ledger_write_latency_le_200{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_consumer_msg_ack_rate gauge
pulsar_consumer_msg_ack_rate{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_1 gauge
pulsar_storage_ledger_write_latency_le_1{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_1000 gauge
pulsar_storage_ledger_write_latency_le_1000{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_2_kb gauge
pulsar_entry_size_le_2_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_20 gauge
pulsar_storage_ledger_write_latency_le_20{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_50 gauge
pulsar_storage_write_latency_le_50{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_5 gauge
pulsar_storage_write_latency_le_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_delayed_message_index_size_bytes gauge
pulsar_delayed_message_index_size_bytes{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_size gauge
pulsar_storage_size{cluster="test"} 0
pulsar_storage_size{cluster="test",namespace="prop/ns-abc1"} 15600
# TYPE pulsar_storage_write_latency_le_10 gauge
pulsar_storage_write_latency_le_10{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_throughput_in gauge
pulsar_throughput_in{cluster="test"} 0
pulsar_throughput_in{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_storage_write_latency_le_1 gauge
pulsar_storage_write_latency_le_1{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_in_bytes_total gauge
pulsar_in_bytes_total{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_le_128 gauge
pulsar_entry_size_le_128{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_rate_in gauge
pulsar_rate_in{cluster="test"} 0
pulsar_rate_in{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_txn_tb_aborted_total gauge
pulsar_txn_tb_aborted_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_100_kb gauge
pulsar_entry_size_le_100_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_throughput_out gauge
pulsar_throughput_out{cluster="test"} 0
pulsar_throughput_out{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_topics_count gauge
pulsar_topics_count{cluster="test"} 0
pulsar_topics_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_storage_read_rate gauge
pulsar_storage_read_rate{cluster="test"} 0
pulsar_storage_read_rate{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_in_messages_total gauge
pulsar_in_messages_total{cluster="test",namespace="prop/ns-abc1"} 100
# TYPE pulsar_storage_write_latency_count gauge
pulsar_storage_write_latency_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_1_kb gauge
pulsar_entry_size_le_1_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_10 gauge
pulsar_storage_ledger_write_latency_le_10{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_100 gauge
pulsar_storage_write_latency_le_100{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_50 gauge
pulsar_storage_ledger_write_latency_le_50{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_overflow gauge
pulsar_storage_ledger_write_latency_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_1000 gauge
pulsar_storage_write_latency_le_1000{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_20 gauge
pulsar_storage_write_latency_le_20{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_sum gauge
pulsar_storage_write_latency_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_0_5 gauge
pulsar_storage_ledger_write_latency_le_0_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_0_5 gauge
pulsar_storage_write_latency_le_0_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_count gauge
pulsar_entry_size_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_100 gauge
pulsar_storage_ledger_write_latency_le_100{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_out_messages_total gauge
pulsar_out_messages_total{cluster="test",namespace="prop/ns-abc1"} 100
# TYPE pulsar_entry_size_le_overflow gauge
pulsar_entry_size_le_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_subscription_delayed gauge
pulsar_subscription_delayed{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_5 gauge
pulsar_storage_ledger_write_latency_le_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_rate gauge
pulsar_storage_write_rate{cluster="test"} 0
pulsar_storage_write_rate{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_msg_backlog gauge
pulsar_msg_backlog{cluster="test"} 0
pulsar_msg_backlog{cluster="test",namespace="prop/ns-abc1",remote_cluster="local"} 100
# TYPE pulsar_subscriptions_count gauge
pulsar_subscriptions_count{cluster="test"} 0
pulsar_subscriptions_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_entry_size_le_4_kb gauge
pulsar_entry_size_le_4_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_count gauge
pulsar_storage_ledger_write_latency_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_txn_tb_active_total gauge
pulsar_txn_tb_active_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_backlog_size gauge
pulsar_storage_backlog_size{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_txn_tb_committed_total gauge
pulsar_txn_tb_committed_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_consumers_count gauge
pulsar_consumers_count{cluster="test"} 0
pulsar_consumers_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_entry_size_le_512 gauge
pulsar_entry_size_le_512{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_out_bytes_total gauge
pulsar_out_bytes_total{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_sum gauge
pulsar_entry_size_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_offloaded_size gauge
pulsar_storage_offloaded_size{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_overflow gauge
pulsar_storage_write_latency_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_ml_cache_entries gauge
pulsar_ml_cache_entries{cluster="test"} 0
# TYPE pulsar_ml_cache_evicted_entries_total gauge
pulsar_ml_cache_evicted_entries_total{cluster="test"} 100
# TYPE pulsar_ml_cache_evictions gauge
pulsar_ml_cache_evictions{cluster="test"} 0
# TYPE pulsar_ml_cache_hits_rate gauge
pulsar_ml_cache_hits_rate{cluster="test"} 0.0
# TYPE pulsar_ml_cache_hits_throughput gauge
pulsar_ml_cache_hits_throughput{cluster="test"} 0.0
# TYPE pulsar_ml_cache_inserted_entries_total gauge
pulsar_ml_cache_inserted_entries_total{cluster="test"} 100
# TYPE pulsar_ml_cache_misses_rate gauge
pulsar_ml_cache_misses_rate{cluster="test"} 0.0
# TYPE pulsar_ml_cache_misses_throughput gauge
pulsar_ml_cache_misses_throughput{cluster="test"} 0.0
# TYPE pulsar_ml_cache_pool_active_allocations gauge
pulsar_ml_cache_pool_active_allocations{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_huge gauge
pulsar_ml_cache_pool_active_allocations_huge{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_normal gauge
pulsar_ml_cache_pool_active_allocations_normal{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_small gauge
pulsar_ml_cache_pool_active_allocations_small{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_allocated gauge
pulsar_ml_cache_pool_allocated{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_used gauge
pulsar_ml_cache_pool_used{cluster="test"} 0
# TYPE pulsar_ml_cache_used_size gauge
pulsar_ml_cache_used_size{cluster="test"} 0
# TYPE pulsar_ml_count gauge
pulsar_ml_count{cluster="test"} 1
# TYPE pulsar_ml_AddEntryBytesRate gauge
pulsar_ml_AddEntryBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryErrors gauge
pulsar_ml_AddEntryErrors{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryLatencyBuckets gauge
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_AddEntryLatencyBuckets_OVERFLOW gauge
pulsar_ml_AddEntryLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryMessagesRate gauge
pulsar_ml_AddEntryMessagesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntrySucceed gauge
pulsar_ml_AddEntrySucceed{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryWithReplicasBytesRate gauge
pulsar_ml_AddEntryWithReplicasBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_EntrySizeBuckets gauge
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_128.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1024.0_2048.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="102400.0_1048576.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="128.0_512.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="16384.0_102400.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="2048.0_4096.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="4096.0_16384.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="512.0_1024.0"} 0.0
# TYPE pulsar_ml_EntrySizeBuckets_OVERFLOW gauge
pulsar_ml_EntrySizeBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_LedgerAddEntryLatencyBuckets gauge
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_LedgerAddEntryLatencyBuckets_OVERFLOW gauge
pulsar_ml_LedgerAddEntryLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_LedgerSwitchLatencyBuckets gauge
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_LedgerSwitchLatencyBuckets_OVERFLOW gauge
pulsar_ml_LedgerSwitchLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_MarkDeleteRate gauge
pulsar_ml_MarkDeleteRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_NumberOfMessagesInBacklog gauge
pulsar_ml_NumberOfMessagesInBacklog{cluster="test", namespace="prop/ns-abc1/persistent"} 100.0
# TYPE pulsar_ml_ReadEntriesBytesRate gauge
pulsar_ml_ReadEntriesBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesErrors gauge
pulsar_ml_ReadEntriesErrors{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesRate gauge
pulsar_ml_ReadEntriesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesSucceeded gauge
pulsar_ml_ReadEntriesSucceeded{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_StoredMessagesSize gauge
pulsar_ml_StoredMessagesSize{cluster="test", namespace="prop/ns-abc1/persistent"} 15600.0
# TYPE pulsar_active_connections gauge
pulsar_active_connections{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_connection_closed_total_count gauge
pulsar_connection_closed_total_count{cluster="test", broker="localhost", metric="broker_connection"} 0
# TYPE pulsar_connection_create_fail_count gauge
pulsar_connection_create_fail_count{cluster="test", broker="localhost", metric="broker_connection"} 0
# TYPE pulsar_connection_create_success_count gauge
pulsar_connection_create_success_count{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_connection_created_total_count gauge
pulsar_connection_created_total_count{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_lb_bandwidth_in_usage gauge
pulsar_lb_bandwidth_in_usage{cluster="test", broker="localhost", metric="loadBalancing"} 0.0
# TYPE pulsar_lb_bandwidth_out_usage gauge
pulsar_lb_bandwidth_out_usage{cluster="test", broker="localhost", metric="loadBalancing"} 0.0
# TYPE pulsar_lb_cpu_usage gauge
pulsar_lb_cpu_usage{cluster="test", broker="localhost", metric="loadBalancing"} 4.397256E-5
# TYPE pulsar_lb_directMemory_usage gauge
pulsar_lb_directMemory_usage{cluster="test", broker="localhost", metric="loadBalancing"} 1.953125
# TYPE pulsar_lb_memory_usage gauge
pulsar_lb_memory_usage{cluster="test", broker="localhost", metric="loadBalancing"} 85.546875
# TYPE pulsar_lb_bundles_split_total gauge
pulsar_lb_bundles_split_total{cluster="test", metric="bundlesSplit"} 0
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_max_queue_size gauge
pulsar_managedLedger_client_bookkeeper_ml_scheduler_max_queue_size{cluster="test"} -1
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_threads gauge
pulsar_managedLedger_client_bookkeeper_ml_scheduler_threads{cluster="test"} 2
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_completed_tasks gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_completed_tasks{cluster="test"} 10
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_queue gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_queue{cluster="test"} 1
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_total_tasks gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_total_tasks{cluster="test"} 11
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_completed_tasks gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_completed_tasks{cluster="test"} 12
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_queue gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_queue{cluster="test"} 4
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_total_tasks gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_total_tasks{cluster="test"} 16
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution summary
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.5"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.75"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.95"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.99"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.9999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="1.0"} -Infinity
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_count{cluster="test", success="false"} 0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_sum{cluster="test", success="false"} 0.0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.5"} 0.052
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.75"} 0.052
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.95"} 0.052
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.99"} 0.052
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.999"} 0.052
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.9999"} 0.052
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="1.0"} 0.052
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_count{cluster="test", success="true"} 20
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_sum{cluster="test", success="true"} 1.0
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued summary
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.5"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.75"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.95"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.99"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.9999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="1.0"} -Infinity
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_count{cluster="test", success="false"} 0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_sum{cluster="test", success="false"} 0.0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.5"} 0.023
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.75"} 0.023
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.95"} 0.023
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.99"} 0.023
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.999"} 0.023
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.9999"} 0.023
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="1.0"} 0.023
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_count{cluster="test", success="true"} 20
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_sum{cluster="test", success="true"} 140.0

 expected object to not be null
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.assertNotNull(Assert.java:1319)
	at org.apache.pulsar.broker.stats.MetadataStoreStatsTest.testMetadataStoreStats(MetadataStoreStatsTest.java:113)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

```
java.lang.AssertionError:
Assertion failed with metrics:
# TYPE pulsar_resource_group_updates counter
# TYPE pulsar_broker_publish_latency summary
pulsar_broker_publish_latency{cluster="test",quantile="0.0"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.5"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.95"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.99"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.999"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.9999"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="1.0"} NaN
pulsar_broker_publish_latency_count{cluster="test"} 18220.0
pulsar_broker_publish_latency_sum{cluster="test"} 2362546.0
# TYPE pulsar_broker_topic_load_pending_requests gauge
pulsar_broker_topic_load_pending_requests{cluster="test"} 0.0
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-02T10:42:19.3402304Z](https://github.com/apache/pulsar/actions/runs/4073367805/jobs/7017478663#step:10:1277)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError:
Assertion failed with metrics:
# TYPE pulsar_resource_group_updates counter
# TYPE pulsar_broker_publish_latency summary
pulsar_broker_publish_latency{cluster="test",quantile="0.0"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.5"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.95"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.99"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.999"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.9999"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="1.0"} NaN
pulsar_broker_publish_latency_count{cluster="test"} 18220.0
pulsar_broker_publish_latency_sum{cluster="test"} 2362546.0
# TYPE pulsar_broker_topic_load_pending_requests gauge
pulsar_broker_topic_load_pending_requests{cluster="test"} 0.0
# TYPE pulsar_resource_group_namespace_unregisters counter
# TYPE pulsar_resource_group_calculated_bytes_quota counter
# TYPE pulsar_broker_throttled_connections gauge
pulsar_broker_throttled_connections{cluster="test"} 0.0
# TYPE pulsar_broker_throttled_connections_global_limit gauge
pulsar_broker_throttled_connections_global_limit{cluster="test"} 0.0
# TYPE pulsar_ml_cache_pendingreads_entries_read counter
pulsar_ml_cache_pendingreads_entries_read_total{cluster="test"} 10239.0
pulsar_ml_cache_pendingreads_entries_read_created{cluster="test"} 1.675333543835E9
# TYPE pulsar_batch_metadata_store_queue_wait_time_ms histogram
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 9.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_count{cluster="test",name="configuration-metadata-store"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_sum{cluster="test",name="configuration-metadata-store"} 74.0
pulsar_batch_metadata_store_queue_wait_time_ms_created{cluster="test",name="configuration-metadata-store"} 1.67533453588E9
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="1.0"} 8.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="5.0"} 46.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="10.0"} 49.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="20.0"} 49.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="50.0"} 49.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="100.0"} 49.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="200.0"} 49.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="500.0"} 49.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="1000.0"} 49.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="+Inf"} 49.0
pulsar_batch_metadata_store_queue_wait_time_ms_count{cluster="test",name="metadata-store"} 49.0
pulsar_batch_metadata_store_queue_wait_time_ms_sum{cluster="test",name="metadata-store"} 183.0
pulsar_batch_metadata_store_queue_wait_time_ms_created{cluster="test",name="metadata-store"} 1.67533453588E9
# TYPE pulsar_resource_group_calculated_messages_quota counter
# TYPE pulsar_ml_cache_pendingreads_missed counter
pulsar_ml_cache_pendingreads_missed_total{cluster="test"} 10239.0
pulsar_ml_cache_pendingreads_missed_created{cluster="test"} 1.675333543835E9
# TYPE jvm_buffer_pool_used_bytes gauge
jvm_buffer_pool_used_bytes{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_used_bytes{cluster="test",pool="direct"} 1.9030457E7
jvm_buffer_pool_used_bytes{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE jvm_buffer_pool_capacity_bytes gauge
jvm_buffer_pool_capacity_bytes{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_capacity_bytes{cluster="test",pool="direct"} 1.9030456E7
jvm_buffer_pool_capacity_bytes{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE jvm_buffer_pool_used_buffers gauge
jvm_buffer_pool_used_buffers{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_used_buffers{cluster="test",pool="direct"} 218.0
jvm_buffer_pool_used_buffers{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE caffeine_cache_hit counter
caffeine_cache_hit_total{cluster="test",cache="owned-bundles"} 5.0
caffeine_cache_hit_total{cluster="test",cache="bundles"} 5.0
# TYPE caffeine_cache_miss counter
caffeine_cache_miss_total{cluster="test",cache="owned-bundles"} 4.0
caffeine_cache_miss_total{cluster="test",cache="bundles"} 4.0
# TYPE caffeine_cache_requests counter
caffeine_cache_requests_total{cluster="test",cache="owned-bundles"} 9.0
caffeine_cache_requests_total{cluster="test",cache="bundles"} 9.0
# TYPE caffeine_cache_eviction counter
caffeine_cache_eviction_total{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_eviction_total{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_eviction_weight gauge
caffeine_cache_eviction_weight{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_eviction_weight{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_load_failure counter
caffeine_cache_load_failure_total{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_load_failure_total{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_loads counter
caffeine_cache_loads_total{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_loads_total{cluster="test",cache="bundles"} 4.0
# TYPE caffeine_cache_estimated_size gauge
caffeine_cache_estimated_size{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_estimated_size{cluster="test",cache="bundles"} 3.0
# TYPE caffeine_cache_load_duration_seconds summary
caffeine_cache_load_duration_seconds_count{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_load_duration_seconds_sum{cluster="test",cache="owned-bundles"} 0.012365441
caffeine_cache_load_duration_seconds_count{cluster="test",cache="bundles"} 4.0
caffeine_cache_load_duration_seconds_sum{cluster="test",cache="bundles"} 0.014524968
# TYPE jvm_memory_direct_bytes_max gauge
jvm_memory_direct_bytes_max{cluster="test"} 1.073741824E9
# TYPE pulsar_replicated_subscriptions_pending_snapshots gauge
pulsar_replicated_subscriptions_pending_snapshots{cluster="test"} 0.0
# TYPE pulsar_broker_lookup_redirects counter
pulsar_broker_lookup_redirects_total{cluster="test"} 0.0
pulsar_broker_lookup_redirects_created{cluster="test"} 1.675333501369E9
# TYPE pulsar_authentication_success counter
pulsar_authentication_success_total{cluster="test",provider_name="AuthenticationProviderToken",auth_method="token"} 19.0
pulsar_authentication_success_created{cluster="test",provider_name="AuthenticationProviderToken",auth_method="token"} 1.675333631554E9
pulsar_authentication_success_total{cluster="test",provider_name="AuthenticationProviderTls",auth_method="tls"} 6.0
pulsar_authentication_success_created{cluster="test",provider_name="AuthenticationProviderTls",auth_method="tls"} 1.67533385896E9
# TYPE pulsar_version_info gauge
pulsar_version_info{cluster="test",version="2.12.0-SNAPSHOT",commit="723dfa9fbee0b28c54c939894976b7a274b42357"} 1.0
# TYPE pulsar_ml_reads_inflight_bytes gauge
pulsar_ml_reads_inflight_bytes{cluster="test"} -1.0
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_right counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_right_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_right_created{cluster="test"} 1.675333543835E9
# TYPE pulsar_ml_cache_pendingreads_entries_notread counter
pulsar_ml_cache_pendingreads_entries_notread_total{cluster="test"} 600.0
pulsar_ml_cache_pendingreads_entries_notread_created{cluster="test"} 1.675333543835E9
# TYPE jvm_memory_direct_bytes_used gauge
jvm_memory_direct_bytes_used{cluster="test"} 1.9038649E7
# TYPE pulsar_resource_group_tenant_unregisters counter
# TYPE brk_ledgeroffloader_delete_offload_ops counter
# TYPE pulsar_resource_group_aggregate_usage_secs summary
pulsar_resource_group_aggregate_usage_secs{cluster="test",quantile="0.5"} 0.001388116
pulsar_resource_group_aggregate_usage_secs{cluster="test",quantile="0.9"} 0.004663755
pulsar_resource_group_aggregate_usage_secs_count{cluster="test"} 16.0
pulsar_resource_group_aggregate_usage_secs_sum{cluster="test"} 0.033073681
pulsar_resource_group_aggregate_usage_secs_created{cluster="test"} 1.675333532593E9
# TYPE pulsar_ml_cache_pendingreads_matched counter
pulsar_ml_cache_pendingreads_matched_total{cluster="test"} 600.0
pulsar_ml_cache_pendingreads_matched_created{cluster="test"} 1.675333543835E9
# TYPE pulsar_authentication_failures counter
pulsar_authentication_failures_total{cluster="test",provider_name="AuthenticationProviderTls",auth_method="tls",reason="Client unable to authenticate with TLS certificate"} 24.0
pulsar_authentication_failures_created{cluster="test",provider_name="AuthenticationProviderTls",auth_method="tls",reason="Client unable to authenticate with TLS certificate"} 1.675333855883E9
# TYPE jvm_memory_objects_pending_finalization gauge
jvm_memory_objects_pending_finalization{cluster="test"} 0.0
# TYPE jvm_memory_bytes_used gauge
jvm_memory_bytes_used{cluster="test",area="heap"} 6.33339904E8
jvm_memory_bytes_used{cluster="test",area="nonheap"} 2.34433344E8
# TYPE jvm_memory_bytes_committed gauge
jvm_memory_bytes_committed{cluster="test",area="heap"} 1.073741824E9
jvm_memory_bytes_committed{cluster="test",area="nonheap"} 2.3822336E8
# TYPE jvm_memory_bytes_max gauge
jvm_memory_bytes_max{cluster="test",area="heap"} 1.073741824E9
jvm_memory_bytes_max{cluster="test",area="nonheap"} -1.0
# TYPE jvm_memory_bytes_init gauge
jvm_memory_bytes_init{cluster="test",area="heap"} 1.1534336E8
jvm_memory_bytes_init{cluster="test",area="nonheap"} 7667712.0
# TYPE jvm_memory_pool_bytes_used gauge
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'non-nmethods'"} 2355712.0
jvm_memory_pool_bytes_used{cluster="test",pool="Metaspace"} 1.2585288E8
jvm_memory_pool_bytes_used{cluster="test",pool="ZHeap"} 6.33339904E8
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'profiled nmethods'"} 6.2933376E7
jvm_memory_pool_bytes_used{cluster="test",pool="Compressed Class Space"} 1.3809136E7
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2.948224E7
# TYPE jvm_memory_pool_bytes_committed gauge
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'non-nmethods'"} 2686976.0
jvm_memory_pool_bytes_committed{cluster="test",pool="Metaspace"} 1.27926272E8
jvm_memory_pool_bytes_committed{cluster="test",pool="ZHeap"} 1.073741824E9
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'profiled nmethods'"} 6.3045632E7
jvm_memory_pool_bytes_committed{cluster="test",pool="Compressed Class Space"} 1.507328E7
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2.94912E7
# TYPE jvm_memory_pool_bytes_max gauge
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'non-nmethods'"} 5828608.0
jvm_memory_pool_bytes_max{cluster="test",pool="Metaspace"} -1.0
jvm_memory_pool_bytes_max{cluster="test",pool="ZHeap"} 1.073741824E9
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'profiled nmethods'"} 1.22912768E8
jvm_memory_pool_bytes_max{cluster="test",pool="Compressed Class Space"} 1.073741824E9
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 1.22916864E8
# TYPE jvm_memory_pool_bytes_init gauge
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'non-nmethods'"} 2555904.0
jvm_memory_pool_bytes_init{cluster="test",pool="Metaspace"} 0.0
jvm_memory_pool_bytes_init{cluster="test",pool="ZHeap"} 8388608.0
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'profiled nmethods'"} 2555904.0
jvm_memory_pool_bytes_init{cluster="test",pool="Compressed Class Space"} 0.0
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2555904.0
# TYPE jvm_memory_pool_collection_used_bytes gauge
jvm_memory_pool_collection_used_bytes{cluster="test",pool="ZHeap"} 6.31242752E8
# TYPE jvm_memory_pool_collection_committed_bytes gauge
jvm_memory_pool_collection_committed_bytes{cluster="test",pool="ZHeap"} 1.073741824E9
# TYPE jvm_memory_pool_collection_max_bytes gauge
jvm_memory_pool_collection_max_bytes{cluster="test",pool="ZHeap"} 1.073741824E9
# TYPE jvm_memory_pool_collection_init_bytes gauge
jvm_memory_pool_collection_init_bytes{cluster="test",pool="ZHeap"} 8388608.0
# TYPE pulsar_batch_metadata_store_batch_size histogram
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 11.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 17.0
pulsar_batch_metadata_store_batch_size_count{cluster="test",name="configuration-metadata-store"} 17.0
pulsar_batch_metadata_store_batch_size_sum{cluster="test",name="configuration-metadata-store"} 24.0
pulsar_batch_metadata_store_batch_size_created{cluster="test",name="configuration-metadata-store"} 1.67533453588E9
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="1.0"} 29.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="5.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="10.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="20.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="50.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="100.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="200.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="500.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="1000.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="+Inf"} 37.0
pulsar_batch_metadata_store_batch_size_count{cluster="test",name="metadata-store"} 37.0
pulsar_batch_metadata_store_batch_size_sum{cluster="test",name="metadata-store"} 49.0
pulsar_batch_metadata_store_batch_size_created{cluster="test",name="metadata-store"} 1.67533453588E9
# TYPE pulsar_broker_lookup_answers counter
pulsar_broker_lookup_answers_total{cluster="test"} 1642.0
pulsar_broker_lookup_answers_created{cluster="test"} 1.675333501375E9
# TYPE topic_load_times summary
topic_load_times{cluster="test",quantile="0.5"} NaN
topic_load_times{cluster="test",quantile="0.75"} NaN
topic_load_times{cluster="test",quantile="0.95"} NaN
topic_load_times{cluster="test",quantile="0.99"} NaN
topic_load_times{cluster="test",quantile="0.999"} NaN
topic_load_times{cluster="test",quantile="0.9999"} NaN
topic_load_times_count{cluster="test"} 2.0
topic_load_times_sum{cluster="test"} 1974.0
topic_load_times_created{cluster="test"} 1.675333504498E9
# TYPE pulsar_txn_tp_committed_count counter
# TYPE pulsar_txn_tp_aborted_count counter
# TYPE pulsar_broker_lookup_pending_requests gauge
pulsar_broker_lookup_pending_requests{cluster="test"} 0.0
# TYPE jvm_threads_current gauge
jvm_threads_current{cluster="test"} 189.0
# TYPE jvm_threads_daemon gauge
jvm_threads_daemon{cluster="test"} 84.0
# TYPE jvm_threads_peak gauge
jvm_threads_peak{cluster="test"} 613.0
# TYPE jvm_threads_started counter
jvm_threads_started_total{cluster="test"} 11416.0
# TYPE jvm_threads_deadlocked gauge
jvm_threads_deadlocked{cluster="test"} 0.0
# TYPE jvm_threads_deadlocked_monitor gauge
jvm_threads_deadlocked_monitor{cluster="test"} 0.0
# TYPE jvm_threads_state gauge
jvm_threads_state{cluster="test",state="NEW"} 0.0
jvm_threads_state{cluster="test",state="TERMINATED"} 0.0
jvm_threads_state{cluster="test",state="RUNNABLE"} 38.0
jvm_threads_state{cluster="test",state="BLOCKED"} 0.0
jvm_threads_state{cluster="test",state="WAITING"} 66.0
jvm_threads_state{cluster="test",state="TIMED_WAITING"} 85.0
jvm_threads_state{cluster="test",state="UNKNOWN"} 0.0
# TYPE pulsar_resource_group_tenant_registers counter
# TYPE jvm_gc_collection_seconds summary
jvm_gc_collection_seconds_count{cluster="test",gc="ZGC Cycles"} 211.0
jvm_gc_collection_seconds_sum{cluster="test",gc="ZGC Cycles"} 223.802
jvm_gc_collection_seconds_count{cluster="test",gc="ZGC Pauses"} 633.0
jvm_gc_collection_seconds_sum{cluster="test",gc="ZGC Pauses"} 0.021
# TYPE pulsar_batch_metadata_store_executor_queue_size gauge
pulsar_batch_metadata_store_executor_queue_size{cluster="test",name="configuration-metadata-store"} 1.0
pulsar_batch_metadata_store_executor_queue_size{cluster="test",name="metadata-store"} 1.0
# TYPE pulsar_batch_metadata_store_batch_execute_time_ms histogram
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 15.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 16.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_count{cluster="test",name="configuration-metadata-store"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_sum{cluster="test",name="configuration-metadata-store"} 20.0
pulsar_batch_metadata_store_batch_execute_time_ms_created{cluster="test",name="configuration-metadata-store"} 1.67533453588E9
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="1.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="5.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="10.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="20.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="50.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="100.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="200.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="500.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="1000.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="+Inf"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_count{cluster="test",name="metadata-store"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_sum{cluster="test",name="metadata-store"} 0.0
pulsar_batch_metadata_store_batch_execute_time_ms_created{cluster="test",name="metadata-store"} 1.67533453588E9
# TYPE pulsar_resource_group_calculate_quota_secs summary
pulsar_resource_group_calculate_quota_secs{cluster="test",quantile="0.5"} 8.0E-6
pulsar_resource_group_calculate_quota_secs{cluster="test",quantile="0.9"} 1.21E-5
pulsar_resource_group_calculate_quota_secs_count{cluster="test"} 16.0
pulsar_resource_group_calculate_quota_secs_sum{cluster="test"} 0.007545587
pulsar_resource_group_calculate_quota_secs_created{cluster="test"} 1.675333532593E9
# TYPE pulsar_resource_group_bytes_used counter
# TYPE pulsar_metadata_store_put_bytes counter
pulsar_metadata_store_put_bytes_total{cluster="test",name="configuration-metadata-store"} 2280.0
pulsar_metadata_store_put_bytes_created{cluster="test",name="configuration-metadata-store"} 1.67533453588E9
pulsar_metadata_store_put_bytes_total{cluster="test",name="metadata-store"} 1955.0
pulsar_metadata_store_put_bytes_created{cluster="test",name="metadata-store"} 1.675334535879E9
pulsar_metadata_store_put_bytes_total{cluster="test",name=""} 985.0
pulsar_metadata_store_put_bytes_created{cluster="test",name=""} 1.675334375188E9
# TYPE pulsar_expiring_token_minutes histogram
pulsar_expiring_token_minutes_bucket{cluster="test",le="5.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="10.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="60.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="240.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="+Inf"} 0.0
pulsar_expiring_token_minutes_count{cluster="test"} 0.0
pulsar_expiring_token_minutes_sum{cluster="test"} 0.0
pulsar_expiring_token_minutes_created{cluster="test"} 1.675334538546E9
# TYPE pulsar_broker_pending_bytes_to_dispatch gauge
pulsar_broker_pending_bytes_to_dispatch{cluster="test"} 0.0
# TYPE pulsar_broker_lookup summary
pulsar_broker_lookup{cluster="test",quantile="0.5"} NaN
pulsar_broker_lookup{cluster="test",quantile="0.99"} NaN
pulsar_broker_lookup{cluster="test",quantile="0.999"} NaN
pulsar_broker_lookup{cluster="test",quantile="1.0"} -Inf
pulsar_broker_lookup_count{cluster="test"} 1675.0
pulsar_broker_lookup_sum{cluster="test"} 32438.0
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_both counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_both_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_both_created{cluster="test"} 1.675333543835E9
# TYPE jvm_memory_pool_allocated_bytes counter
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'profiled nmethods'"} 7.993701248E9
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'profiled nmethods'"} 1.675333772253E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="ZHeap"} 8.423211008E10
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="ZHeap"} 1.675333772253E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 3.672234112E9
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 1.675333772253E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="Compressed Class Space"} 2.104878648E9
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="Compressed Class Space"} 1.675333772253E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="Metaspace"} 1.8705482696E10
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="Metaspace"} 1.675333772253E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'non-nmethods'"} 3.6422528E8
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'non-nmethods'"} 1.675333772253E9
# TYPE pulsar_metadata_store_ops_latency_ms histogram
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="del",status="fail"} 1.675334535879E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 1.67533453588E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="del",status="success"} 1.675334535879E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 1.67533453588E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="get",status="fail"} 1.675334375188E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 1.67533453588E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="1.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="3.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="5.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="10.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="20.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="50.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="100.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="200.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="500.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="1000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="2000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="5000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="+Inf"} 7.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="get",status="success"} 7.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="get",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="get",status="success"} 1.675334375188E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="put",status="fail"} 1.675334375188E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="1.0"} 4.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="3.0"} 4.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="5.0"} 14.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="10.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="20.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="50.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="100.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="200.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="500.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="1000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="2000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="5000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="+Inf"} 16.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="get",status="success"} 16.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="get",status="success"} 61.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="get",status="success"} 1.67533453588E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="del",status="fail"} 1.675334375188E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="put",status="fail"} 1.675334535879E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="1.0"} 2.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="3.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="5.0"} 25.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="10.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="20.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="50.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="100.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="200.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="500.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="1000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="2000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="5000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="+Inf"} 28.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="get",status="success"} 28.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="get",status="success"} 120.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="get",status="success"} 1.675334535879E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="get",status="fail"} 1.675334535879E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="del",status="success"} 1.675334375188E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="1.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="3.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="5.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="10.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="20.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="50.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="100.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="200.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="500.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="1000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="2000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="5000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="+Inf"} 16.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="put",status="success"} 16.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="put",status="success"} 51.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="put",status="success"} 1.675334535879E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="1.0"} 48.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="3.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="5.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="10.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="20.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="50.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="100.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="200.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="500.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="1000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="2000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="5000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="+Inf"} 52.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="put",status="success"} 52.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="put",status="success"} 13.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="put",status="success"} 1.675334375188E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="del",status="success"} 1.67533453588E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="1.0"} 4.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="3.0"} 4.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="5.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="10.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="20.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="50.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="100.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="200.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="500.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="1000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="2000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="5000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="+Inf"} 5.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="put",status="success"} 5.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="put",status="success"} 7.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="put",status="success"} 1.67533453588E9
# TYPE brk_ledgeroffloader_read_bytes counter
# TYPE pulsar_ml_cache_pendingreads_matched_included counter
pulsar_ml_cache_pendingreads_matched_included_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_included_created{cluster="test"} 1.675333543835E9
# TYPE pulsar_txn_tp_commit_latency summary
# TYPE pulsar_resource_group_namespace_registers counter
# TYPE pulsar_broker_lookup_failures counter
pulsar_broker_lookup_failures_total{cluster="test"} 0.0
pulsar_broker_lookup_failures_created{cluster="test"} 1.675333501371E9
# TYPE pulsar_resource_group_messages_used counter
# TYPE jetty_requests counter
jetty_requests_total{cluster="test"} 54.0
# TYPE jetty_requests_active gauge
jetty_requests_active{cluster="test"} 0.0
# TYPE jetty_requests_active_max gauge
jetty_requests_active_max{cluster="test"} 10.0
# TYPE jetty_request_time_max_seconds gauge
jetty_request_time_max_seconds{cluster="test"} 34.075
# TYPE jetty_request_time_seconds counter
jetty_request_time_seconds_total{cluster="test"} 34.638
# TYPE jetty_dispatched counter
jetty_dispatched_total{cluster="test"} 54.0
# TYPE jetty_dispatched_active gauge
jetty_dispatched_active{cluster="test"} 0.0
# TYPE jetty_dispatched_active_max gauge
jetty_dispatched_active_max{cluster="test"} 4.0
# TYPE jetty_dispatched_time_max gauge
jetty_dispatched_time_max{cluster="test"} 34075.0
# TYPE jetty_dispatched_time_seconds counter
jetty_dispatched_time_seconds_total{cluster="test"} 34.251
# TYPE jetty_async_requests counter
jetty_async_requests_total{cluster="test"} 46.0
# TYPE jetty_async_requests_waiting gauge
jetty_async_requests_waiting{cluster="test"} 0.0
# TYPE jetty_async_requests_waiting_max gauge
jetty_async_requests_waiting_max{cluster="test"} 9.0
# TYPE jetty_async_dispatches counter
jetty_async_dispatches_total{cluster="test"} 0.0
# TYPE jetty_expires counter
jetty_expires_total{cluster="test"} 0.0
# TYPE jetty_responses counter
jetty_responses_total{cluster="test",code="1xx"} 0.0
jetty_responses_total{cluster="test",code="2xx"} 20.0
jetty_responses_total{cluster="test",code="3xx"} 0.0
jetty_responses_total{cluster="test",code="4xx"} 0.0
jetty_responses_total{cluster="test",code="5xx"} 33.0
# TYPE jetty_stats_seconds gauge
jetty_stats_seconds{cluster="test"} 759.223
# TYPE jetty_responses_bytes counter
jetty_responses_bytes_total{cluster="test"} 2739.0
# TYPE jvm_classes_currently_loaded gauge
jvm_classes_currently_loaded{cluster="test"} 21222.0
# TYPE jvm_classes_loaded counter
jvm_classes_loaded_total{cluster="test"} 23755.0
# TYPE jvm_classes_unloaded counter
jvm_classes_unloaded_total{cluster="test"} 2533.0
# TYPE pulsar_broker_load_manager_bundle_assigment summary
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.5"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.99"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.999"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="1.0"} NaN
pulsar_broker_load_manager_bundle_assigment_count{cluster="test"} 268.0
pulsar_broker_load_manager_bundle_assigment_sum{cluster="test"} 3809.0
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_left counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_left_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_left_created{cluster="test"} 1.675333543835E9
# TYPE pulsar_ml_reads_available_inflight_bytes gauge
pulsar_ml_reads_available_inflight_bytes{cluster="test"} -1.0
# TYPE process_cpu_seconds counter
process_cpu_seconds_total{cluster="test"} 436.82
# TYPE process_start_time_seconds gauge
process_start_time_seconds{cluster="test"} 1.675333456146E9
# TYPE process_open_fds gauge
process_open_fds{cluster="test"} 654.0
# TYPE process_max_fds gauge
process_max_fds{cluster="test"} 65536.0
# TYPE process_virtual_memory_bytes gauge
process_virtual_memory_bytes{cluster="test"} 6.320877568E10
# TYPE process_resident_memory_bytes gauge
process_resident_memory_bytes{cluster="test"} 3.462520832E9
# TYPE jvm_info gauge
jvm_info{cluster="test",runtime="OpenJDK Runtime Environment",vendor="Eclipse Adoptium",version="17.0.6+10"} 1.0
# TYPE pulsar_expired_token counter
pulsar_expired_token_total{cluster="test"} 0.0
pulsar_expired_token_created{cluster="test"} 1.675334538546E9
# TYPE pulsar_storage_write_latency_le_200 gauge
pulsar_storage_write_latency_le_200{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_16_kb gauge
pulsar_entry_size_le_16_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_logical_size gauge
pulsar_storage_logical_size{cluster="test"} 0
pulsar_storage_logical_size{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_le_1_mb gauge
pulsar_entry_size_le_1_mb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_producers_count gauge
pulsar_producers_count{cluster="test"} 0
pulsar_producers_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_rate_out gauge
pulsar_rate_out{cluster="test"} 0
pulsar_rate_out{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_storage_ledger_write_latency_sum gauge
pulsar_storage_ledger_write_latency_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_200 gauge
pulsar_storage_ledger_write_latency_le_200{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_consumer_msg_ack_rate gauge
pulsar_consumer_msg_ack_rate{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_1 gauge
pulsar_storage_ledger_write_latency_le_1{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_1000 gauge
pulsar_storage_ledger_write_latency_le_1000{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_2_kb gauge
pulsar_entry_size_le_2_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_20 gauge
pulsar_storage_ledger_write_latency_le_20{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_50 gauge
pulsar_storage_write_latency_le_50{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_5 gauge
pulsar_storage_write_latency_le_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_delayed_message_index_size_bytes gauge
pulsar_delayed_message_index_size_bytes{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_size gauge
pulsar_storage_size{cluster="test"} 0
pulsar_storage_size{cluster="test",namespace="prop/ns-abc1"} 15600
# TYPE pulsar_storage_write_latency_le_10 gauge
pulsar_storage_write_latency_le_10{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_throughput_in gauge
pulsar_throughput_in{cluster="test"} 0
pulsar_throughput_in{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_storage_write_latency_le_1 gauge
pulsar_storage_write_latency_le_1{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_in_bytes_total gauge
pulsar_in_bytes_total{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_le_128 gauge
pulsar_entry_size_le_128{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_rate_in gauge
pulsar_rate_in{cluster="test"} 0
pulsar_rate_in{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_txn_tb_aborted_total gauge
pulsar_txn_tb_aborted_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_100_kb gauge
pulsar_entry_size_le_100_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_throughput_out gauge
pulsar_throughput_out{cluster="test"} 0
pulsar_throughput_out{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_topics_count gauge
pulsar_topics_count{cluster="test"} 0
pulsar_topics_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_storage_read_rate gauge
pulsar_storage_read_rate{cluster="test"} 0
pulsar_storage_read_rate{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_in_messages_total gauge
pulsar_in_messages_total{cluster="test",namespace="prop/ns-abc1"} 100
# TYPE pulsar_storage_write_latency_count gauge
pulsar_storage_write_latency_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_1_kb gauge
pulsar_entry_size_le_1_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_10 gauge
pulsar_storage_ledger_write_latency_le_10{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_100 gauge
pulsar_storage_write_latency_le_100{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_50 gauge
pulsar_storage_ledger_write_latency_le_50{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_overflow gauge
pulsar_storage_ledger_write_latency_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_1000 gauge
pulsar_storage_write_latency_le_1000{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_20 gauge
pulsar_storage_write_latency_le_20{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_sum gauge
pulsar_storage_write_latency_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_0_5 gauge
pulsar_storage_ledger_write_latency_le_0_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_0_5 gauge
pulsar_storage_write_latency_le_0_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_count gauge
pulsar_entry_size_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_100 gauge
pulsar_storage_ledger_write_latency_le_100{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_out_messages_total gauge
pulsar_out_messages_total{cluster="test",namespace="prop/ns-abc1"} 100
# TYPE pulsar_entry_size_le_overflow gauge
pulsar_entry_size_le_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_subscription_delayed gauge
pulsar_subscription_delayed{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_5 gauge
pulsar_storage_ledger_write_latency_le_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_rate gauge
pulsar_storage_write_rate{cluster="test"} 0
pulsar_storage_write_rate{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_msg_backlog gauge
pulsar_msg_backlog{cluster="test"} 0
pulsar_msg_backlog{cluster="test",namespace="prop/ns-abc1",remote_cluster="local"} 1
# TYPE pulsar_subscriptions_count gauge
pulsar_subscriptions_count{cluster="test"} 0
pulsar_subscriptions_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_entry_size_le_4_kb gauge
pulsar_entry_size_le_4_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_count gauge
pulsar_storage_ledger_write_latency_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_txn_tb_active_total gauge
pulsar_txn_tb_active_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_backlog_size gauge
pulsar_storage_backlog_size{cluster="test",namespace="prop/ns-abc1"} 78
# TYPE pulsar_txn_tb_committed_total gauge
pulsar_txn_tb_committed_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_consumers_count gauge
pulsar_consumers_count{cluster="test"} 0
pulsar_consumers_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_entry_size_le_512 gauge
pulsar_entry_size_le_512{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_out_bytes_total gauge
pulsar_out_bytes_total{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_sum gauge
pulsar_entry_size_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_offloaded_size gauge
pulsar_storage_offloaded_size{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_overflow gauge
pulsar_storage_write_latency_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_ml_cache_entries gauge
pulsar_ml_cache_entries{cluster="test"} 0
# TYPE pulsar_ml_cache_evicted_entries_total gauge
pulsar_ml_cache_evicted_entries_total{cluster="test"} 100
# TYPE pulsar_ml_cache_evictions gauge
pulsar_ml_cache_evictions{cluster="test"} 0
# TYPE pulsar_ml_cache_hits_rate gauge
pulsar_ml_cache_hits_rate{cluster="test"} 0.0
# TYPE pulsar_ml_cache_hits_throughput gauge
pulsar_ml_cache_hits_throughput{cluster="test"} 0.0
# TYPE pulsar_ml_cache_inserted_entries_total gauge
pulsar_ml_cache_inserted_entries_total{cluster="test"} 100
# TYPE pulsar_ml_cache_misses_rate gauge
pulsar_ml_cache_misses_rate{cluster="test"} 0.0
# TYPE pulsar_ml_cache_misses_throughput gauge
pulsar_ml_cache_misses_throughput{cluster="test"} 0.0
# TYPE pulsar_ml_cache_pool_active_allocations gauge
pulsar_ml_cache_pool_active_allocations{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_huge gauge
pulsar_ml_cache_pool_active_allocations_huge{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_normal gauge
pulsar_ml_cache_pool_active_allocations_normal{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_small gauge
pulsar_ml_cache_pool_active_allocations_small{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_allocated gauge
pulsar_ml_cache_pool_allocated{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_used gauge
pulsar_ml_cache_pool_used{cluster="test"} 0
# TYPE pulsar_ml_cache_used_size gauge
pulsar_ml_cache_used_size{cluster="test"} 0
# TYPE pulsar_ml_count gauge
pulsar_ml_count{cluster="test"} 1
# TYPE pulsar_ml_AddEntryBytesRate gauge
pulsar_ml_AddEntryBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryErrors gauge
pulsar_ml_AddEntryErrors{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryLatencyBuckets gauge
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_AddEntryLatencyBuckets_OVERFLOW gauge
pulsar_ml_AddEntryLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryMessagesRate gauge
pulsar_ml_AddEntryMessagesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntrySucceed gauge
pulsar_ml_AddEntrySucceed{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryWithReplicasBytesRate gauge
pulsar_ml_AddEntryWithReplicasBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_EntrySizeBuckets gauge
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_128.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1024.0_2048.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="102400.0_1048576.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="128.0_512.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="16384.0_102400.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="2048.0_4096.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="4096.0_16384.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="512.0_1024.0"} 0.0
# TYPE pulsar_ml_EntrySizeBuckets_OVERFLOW gauge
pulsar_ml_EntrySizeBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_LedgerAddEntryLatencyBuckets gauge
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_LedgerAddEntryLatencyBuckets_OVERFLOW gauge
pulsar_ml_LedgerAddEntryLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_LedgerSwitchLatencyBuckets gauge
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_LedgerSwitchLatencyBuckets_OVERFLOW gauge
pulsar_ml_LedgerSwitchLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_MarkDeleteRate gauge
pulsar_ml_MarkDeleteRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_NumberOfMessagesInBacklog gauge
pulsar_ml_NumberOfMessagesInBacklog{cluster="test", namespace="prop/ns-abc1/persistent"} 1.0
# TYPE pulsar_ml_ReadEntriesBytesRate gauge
pulsar_ml_ReadEntriesBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesErrors gauge
pulsar_ml_ReadEntriesErrors{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesRate gauge
pulsar_ml_ReadEntriesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesSucceeded gauge
pulsar_ml_ReadEntriesSucceeded{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_StoredMessagesSize gauge
pulsar_ml_StoredMessagesSize{cluster="test", namespace="prop/ns-abc1/persistent"} 15600.0
# TYPE pulsar_active_connections gauge
pulsar_active_connections{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_connection_closed_total_count gauge
pulsar_connection_closed_total_count{cluster="test", broker="localhost", metric="broker_connection"} 0
# TYPE pulsar_connection_create_fail_count gauge
pulsar_connection_create_fail_count{cluster="test", broker="localhost", metric="broker_connection"} 0
# TYPE pulsar_connection_create_success_count gauge
pulsar_connection_create_success_count{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_connection_created_total_count gauge
pulsar_connection_created_total_count{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_lb_bandwidth_in_usage gauge
pulsar_lb_bandwidth_in_usage{cluster="test", broker="localhost", metric="loadBalancing"} 0.0
# TYPE pulsar_lb_bandwidth_out_usage gauge
pulsar_lb_bandwidth_out_usage{cluster="test", broker="localhost", metric="loadBalancing"} 0.0
# TYPE pulsar_lb_cpu_usage gauge
pulsar_lb_cpu_usage{cluster="test", broker="localhost", metric="loadBalancing"} 5.7520556E-5
# TYPE pulsar_lb_directMemory_usage gauge
pulsar_lb_directMemory_usage{cluster="test", broker="localhost", metric="loadBalancing"} 1.6601562
# TYPE pulsar_lb_memory_usage gauge
pulsar_lb_memory_usage{cluster="test", broker="localhost", metric="loadBalancing"} 74.41406
# TYPE pulsar_lb_bundles_split_total gauge
pulsar_lb_bundles_split_total{cluster="test", metric="bundlesSplit"} 0
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_max_queue_size gauge
pulsar_managedLedger_client_bookkeeper_ml_scheduler_max_queue_size{cluster="test"} -1
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_threads gauge
pulsar_managedLedger_client_bookkeeper_ml_scheduler_threads{cluster="test"} 2
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_completed_tasks gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_completed_tasks{cluster="test"} 11
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_queue gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_queue{cluster="test"} 4
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_total_tasks gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_total_tasks{cluster="test"} 15
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_completed_tasks gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_completed_tasks{cluster="test"} 15
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_queue gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_queue{cluster="test"} 1
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_total_tasks gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_total_tasks{cluster="test"} 16
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution summary
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.5"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.75"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.95"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.99"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.9999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="1.0"} -Infinity
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_count{cluster="test", success="false"} 0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_sum{cluster="test", success="false"} 0.0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.5"} 0.019
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.75"} 0.019
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.95"} 0.019
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.99"} 0.019
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.999"} 0.019
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.9999"} 0.019
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="1.0"} 0.019
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_count{cluster="test", success="true"} 24
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_sum{cluster="test", success="true"} 2.0
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued summary
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.5"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.75"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.95"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.99"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.9999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="1.0"} -Infinity
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_count{cluster="test", success="false"} 0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_sum{cluster="test", success="false"} 0.0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.5"} 1.049
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.75"} 1.049
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.95"} 1.049
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.99"} 1.049
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.999"} 1.049
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.9999"} 1.049
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="1.0"} 1.049
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_count{cluster="test", success="true"} 24
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_sum{cluster="test", success="true"} 172.0

 expected object to not be null
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.assertNotNull(Assert.java:1319)
	at org.apache.pulsar.broker.stats.MetadataStoreStatsTest.testMetadataStoreStats(MetadataStoreStatsTest.java:113)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

```
java.lang.AssertionError:
Assertion failed with metrics:
# TYPE jvm_buffer_pool_used_bytes gauge
jvm_buffer_pool_used_bytes{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_used_bytes{cluster="test",pool="direct"} 1.7327153E7
jvm_buffer_pool_used_bytes{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE jvm_buffer_pool_capacity_bytes gauge
jvm_buffer_pool_capacity_bytes{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_capacity_bytes{cluster="test",pool="direct"} 1.7327152E7
jvm_buffer_pool_capacity_bytes{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE jvm_buffer_pool_used_buffers gauge
jvm_buffer_pool_used_buffers{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_used_buffers{cluster="test",pool="direct"} 207.0
jvm_buffer_pool_used_buffers{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE pulsar_resource_group_calculate_quota_secs summary
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-02T04:46:00.8853124Z](https://github.com/apache/pulsar/actions/runs/4071192392/jobs/7012876216#step:11:1266)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError:
Assertion failed with metrics:
# TYPE jvm_buffer_pool_used_bytes gauge
jvm_buffer_pool_used_bytes{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_used_bytes{cluster="test",pool="direct"} 1.7327153E7
jvm_buffer_pool_used_bytes{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE jvm_buffer_pool_capacity_bytes gauge
jvm_buffer_pool_capacity_bytes{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_capacity_bytes{cluster="test",pool="direct"} 1.7327152E7
jvm_buffer_pool_capacity_bytes{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE jvm_buffer_pool_used_buffers gauge
jvm_buffer_pool_used_buffers{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_used_buffers{cluster="test",pool="direct"} 207.0
jvm_buffer_pool_used_buffers{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE pulsar_resource_group_calculate_quota_secs summary
pulsar_resource_group_calculate_quota_secs{cluster="test",quantile="0.5"} 0.01702333
pulsar_resource_group_calculate_quota_secs{cluster="test",quantile="0.9"} 0.01702333
pulsar_resource_group_calculate_quota_secs_count{cluster="test"} 1.0
pulsar_resource_group_calculate_quota_secs_sum{cluster="test"} 0.01702333
pulsar_resource_group_calculate_quota_secs_created{cluster="test"} 1.675312053991E9
# TYPE pulsar_ml_cache_pendingreads_entries_notread counter
pulsar_ml_cache_pendingreads_entries_notread_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_entries_notread_created{cluster="test"} 1.675312063623E9
# TYPE pulsar_replicated_subscriptions_pending_snapshots gauge
pulsar_replicated_subscriptions_pending_snapshots{cluster="test"} 0.0
# TYPE topic_load_times summary
topic_load_times{cluster="test",quantile="0.5"} NaN
topic_load_times{cluster="test",quantile="0.75"} NaN
topic_load_times{cluster="test",quantile="0.95"} NaN
topic_load_times{cluster="test",quantile="0.99"} NaN
topic_load_times{cluster="test",quantile="0.999"} NaN
topic_load_times{cluster="test",quantile="0.9999"} NaN
topic_load_times_count{cluster="test"} 5.0
topic_load_times_sum{cluster="test"} 2015.0
topic_load_times_created{cluster="test"} 1.675312028721E9
# TYPE jvm_threads_current gauge
jvm_threads_current{cluster="test"} 349.0
# TYPE jvm_threads_daemon gauge
jvm_threads_daemon{cluster="test"} 88.0
# TYPE jvm_threads_peak gauge
jvm_threads_peak{cluster="test"} 671.0
# TYPE jvm_threads_started counter
jvm_threads_started_total{cluster="test"} 12634.0
# TYPE jvm_threads_deadlocked gauge
jvm_threads_deadlocked{cluster="test"} 0.0
# TYPE jvm_threads_deadlocked_monitor gauge
jvm_threads_deadlocked_monitor{cluster="test"} 0.0
# TYPE jvm_threads_state gauge
jvm_threads_state{cluster="test",state="NEW"} 0.0
jvm_threads_state{cluster="test",state="TERMINATED"} 0.0
jvm_threads_state{cluster="test",state="RUNNABLE"} 18.0
jvm_threads_state{cluster="test",state="BLOCKED"} 0.0
jvm_threads_state{cluster="test",state="WAITING"} 242.0
jvm_threads_state{cluster="test",state="TIMED_WAITING"} 89.0
jvm_threads_state{cluster="test",state="UNKNOWN"} 0.0
# TYPE pulsar_expiring_token_minutes histogram
pulsar_expiring_token_minutes_bucket{cluster="test",le="5.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="10.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="60.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="240.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="+Inf"} 0.0
pulsar_expiring_token_minutes_count{cluster="test"} 0.0
pulsar_expiring_token_minutes_sum{cluster="test"} 0.0
pulsar_expiring_token_minutes_created{cluster="test"} 1.675313159889E9
# TYPE pulsar_metadata_store_ops_latency_ms histogram
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="del",status="fail"} 1.67531315679E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 1.675313156799E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="del",status="success"} 1.67531315679E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 1.675313156799E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="get",status="fail"} 1.675312989854E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 1.675313156799E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="1.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="3.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="5.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="10.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="20.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="50.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="100.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="200.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="500.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="1000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="2000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="5000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="+Inf"} 7.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="get",status="success"} 7.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="get",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="get",status="success"} 1.675312989854E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="put",status="fail"} 1.675312989854E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="3.0"} 1.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="5.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="10.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="20.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="50.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="100.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="200.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="500.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="1000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="2000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="5000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="+Inf"} 16.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="get",status="success"} 16.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="get",status="success"} 72.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="get",status="success"} 1.675313156799E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="del",status="fail"} 1.675312989854E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="put",status="fail"} 1.67531315679E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="1.0"} 3.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="3.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="5.0"} 27.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="10.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="20.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="50.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="100.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="200.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="500.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="1000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="2000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="5000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="+Inf"} 28.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="get",status="success"} 28.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="get",status="success"} 111.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="get",status="success"} 1.675313156789E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="get",status="fail"} 1.67531315679E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="del",status="success"} 1.675312989854E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="1.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="3.0"} 9.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="5.0"} 14.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="10.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="20.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="50.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="100.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="200.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="500.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="1000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="2000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="5000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="+Inf"} 15.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="put",status="success"} 15.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="put",status="success"} 37.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="put",status="success"} 1.67531315679E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="1.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="3.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="5.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="10.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="20.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="50.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="100.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="200.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="500.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="1000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="2000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="5000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="+Inf"} 52.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="put",status="success"} 52.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="put",status="success"} 1.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="put",status="success"} 1.675312989854E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="del",status="success"} 1.675313156799E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="1.0"} 2.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="3.0"} 3.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="5.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="10.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="20.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="50.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="100.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="200.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="500.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="1000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="2000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="5000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="+Inf"} 5.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="put",status="success"} 5.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="put",status="success"} 13.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="put",status="success"} 1.675313156799E9
# TYPE pulsar_batch_metadata_store_executor_queue_size gauge
pulsar_batch_metadata_store_executor_queue_size{cluster="test",name="configuration-metadata-store"} 1.0
pulsar_batch_metadata_store_executor_queue_size{cluster="test",name="metadata-store"} 1.0
# TYPE pulsar_broker_publish_latency summary
pulsar_broker_publish_latency{cluster="test",quantile="0.0"} +Inf
pulsar_broker_publish_latency{cluster="test",quantile="0.5"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.95"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.99"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.999"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.9999"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="1.0"} -Inf
pulsar_broker_publish_latency_count{cluster="test"} 1644.0
pulsar_broker_publish_latency_sum{cluster="test"} 21842.0
# TYPE pulsar_ml_cache_pendingreads_matched counter
pulsar_ml_cache_pendingreads_matched_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_created{cluster="test"} 1.675312063623E9
# TYPE pulsar_batch_metadata_store_queue_wait_time_ms histogram
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 3.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_count{cluster="test",name="configuration-metadata-store"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_sum{cluster="test",name="configuration-metadata-store"} 90.0
pulsar_batch_metadata_store_queue_wait_time_ms_created{cluster="test",name="configuration-metadata-store"} 1.675313156802E9
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="1.0"} 10.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="5.0"} 47.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="10.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="20.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="50.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="100.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="200.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="500.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="1000.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="+Inf"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_count{cluster="test",name="metadata-store"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_sum{cluster="test",name="metadata-store"} 162.0
pulsar_batch_metadata_store_queue_wait_time_ms_created{cluster="test",name="metadata-store"} 1.675313156795E9
# TYPE pulsar_version_info gauge
pulsar_version_info{cluster="test",version="2.12.0-SNAPSHOT",commit="c7e64a285110e87402cd292fe9a4b5bc14913919"} 1.0
# TYPE pulsar_broker_pending_bytes_to_dispatch gauge
pulsar_broker_pending_bytes_to_dispatch{cluster="test"} 0.0
# TYPE pulsar_resource_group_calculated_messages_quota counter
# TYPE pulsar_broker_lookup summary
pulsar_broker_lookup{cluster="test",quantile="0.5"} NaN
pulsar_broker_lookup{cluster="test",quantile="0.99"} NaN
pulsar_broker_lookup{cluster="test",quantile="0.999"} NaN
pulsar_broker_lookup{cluster="test",quantile="1.0"} -Inf
pulsar_broker_lookup_count{cluster="test"} 2295.0
pulsar_broker_lookup_sum{cluster="test"} 25266.0
# TYPE caffeine_cache_hit counter
caffeine_cache_hit_total{cluster="test",cache="owned-bundles"} 5.0
caffeine_cache_hit_total{cluster="test",cache="bundles"} 5.0
# TYPE caffeine_cache_miss counter
caffeine_cache_miss_total{cluster="test",cache="owned-bundles"} 4.0
caffeine_cache_miss_total{cluster="test",cache="bundles"} 4.0
# TYPE caffeine_cache_requests counter
caffeine_cache_requests_total{cluster="test",cache="owned-bundles"} 9.0
caffeine_cache_requests_total{cluster="test",cache="bundles"} 9.0
# TYPE caffeine_cache_eviction counter
caffeine_cache_eviction_total{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_eviction_total{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_eviction_weight gauge
caffeine_cache_eviction_weight{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_eviction_weight{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_load_failure counter
caffeine_cache_load_failure_total{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_load_failure_total{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_loads counter
caffeine_cache_loads_total{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_loads_total{cluster="test",cache="bundles"} 4.0
# TYPE caffeine_cache_estimated_size gauge
caffeine_cache_estimated_size{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_estimated_size{cluster="test",cache="bundles"} 3.0
# TYPE caffeine_cache_load_duration_seconds summary
caffeine_cache_load_duration_seconds_count{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_load_duration_seconds_sum{cluster="test",cache="owned-bundles"} 0.001069209
caffeine_cache_load_duration_seconds_count{cluster="test",cache="bundles"} 4.0
caffeine_cache_load_duration_seconds_sum{cluster="test",cache="bundles"} 0.023404379
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_left counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_left_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_left_created{cluster="test"} 1.675312063624E9
# TYPE pulsar_ml_reads_inflight_bytes gauge
pulsar_ml_reads_inflight_bytes{cluster="test"} -1.0
# TYPE pulsar_expired_token counter
pulsar_expired_token_total{cluster="test"} 0.0
pulsar_expired_token_created{cluster="test"} 1.675313159889E9
# TYPE jvm_memory_pool_allocated_bytes counter
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'profiled nmethods'"} 1.2541431296E10
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'profiled nmethods'"} 1.675312238452E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="ZHeap"} 1.33076877312E11
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="ZHeap"} 1.675312238452E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 5.879912448E9
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 1.675312238452E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="Compressed Class Space"} 3.308154424E9
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="Compressed Class Space"} 1.675312238452E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="Metaspace"} 2.921764276E10
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="Metaspace"} 1.675312238452E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'non-nmethods'"} 5.65164672E8
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'non-nmethods'"} 1.675312238452E9
# TYPE pulsar_resource_group_bytes_used counter
# TYPE pulsar_batch_metadata_store_batch_size histogram
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 11.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 17.0
pulsar_batch_metadata_store_batch_size_count{cluster="test",name="configuration-metadata-store"} 17.0
pulsar_batch_metadata_store_batch_size_sum{cluster="test",name="configuration-metadata-store"} 24.0
pulsar_batch_metadata_store_batch_size_created{cluster="test",name="configuration-metadata-store"} 1.675313156802E9
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="1.0"} 30.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="5.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="10.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="20.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="50.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="100.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="200.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="500.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="1000.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="+Inf"} 37.0
pulsar_batch_metadata_store_batch_size_count{cluster="test",name="metadata-store"} 37.0
pulsar_batch_metadata_store_batch_size_sum{cluster="test",name="metadata-store"} 48.0
pulsar_batch_metadata_store_batch_size_created{cluster="test",name="metadata-store"} 1.675313156795E9
# TYPE pulsar_broker_topic_load_pending_requests gauge
pulsar_broker_topic_load_pending_requests{cluster="test"} 0.0
# TYPE pulsar_ml_cache_pendingreads_missed counter
pulsar_ml_cache_pendingreads_missed_total{cluster="test"} 401.0
pulsar_ml_cache_pendingreads_missed_created{cluster="test"} 1.675312063624E9
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_right counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_right_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_right_created{cluster="test"} 1.675312063624E9
# TYPE pulsar_txn_tp_committed_count counter
# TYPE jvm_gc_collection_seconds summary
jvm_gc_collection_seconds_count{cluster="test",gc="ZGC Cycles"} 283.0
jvm_gc_collection_seconds_sum{cluster="test",gc="ZGC Cycles"} 321.599
jvm_gc_collection_seconds_count{cluster="test",gc="ZGC Pauses"} 849.0
jvm_gc_collection_seconds_sum{cluster="test",gc="ZGC Pauses"} 0.015
# TYPE jvm_memory_direct_bytes_used gauge
jvm_memory_direct_bytes_used{cluster="test"} 1.7392689E7
# TYPE pulsar_txn_tp_aborted_count counter
# TYPE pulsar_ml_cache_pendingreads_entries_read counter
pulsar_ml_cache_pendingreads_entries_read_total{cluster="test"} 401.0
pulsar_ml_cache_pendingreads_entries_read_created{cluster="test"} 1.675312063623E9
# TYPE pulsar_txn_tp_commit_latency summary
# TYPE pulsar_broker_lookup_answers counter
pulsar_broker_lookup_answers_total{cluster="test"} 2258.0
pulsar_broker_lookup_answers_created{cluster="test"} 1.675312025557E9
# TYPE pulsar_resource_group_namespace_registers counter
# TYPE pulsar_broker_lookup_pending_requests gauge
pulsar_broker_lookup_pending_requests{cluster="test"} 0.0
# TYPE pulsar_broker_load_manager_bundle_assigment summary
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.5"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.99"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.999"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="1.0"} NaN
pulsar_broker_load_manager_bundle_assigment_count{cluster="test"} 305.0
pulsar_broker_load_manager_bundle_assigment_sum{cluster="test"} 4212.0
# TYPE pulsar_ml_cache_pendingreads_matched_included counter
pulsar_ml_cache_pendingreads_matched_included_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_included_created{cluster="test"} 1.675312063623E9
# TYPE pulsar_broker_throttled_connections gauge
pulsar_broker_throttled_connections{cluster="test"} -20.0
# TYPE pulsar_metadata_store_put_bytes counter
pulsar_metadata_store_put_bytes_total{cluster="test",name="configuration-metadata-store"} 2280.0
pulsar_metadata_store_put_bytes_created{cluster="test",name="configuration-metadata-store"} 1.675313156799E9
pulsar_metadata_store_put_bytes_total{cluster="test",name="metadata-store"} 1929.0
pulsar_metadata_store_put_bytes_created{cluster="test",name="metadata-store"} 1.67531315679E9
pulsar_metadata_store_put_bytes_total{cluster="test",name=""} 985.0
pulsar_metadata_store_put_bytes_created{cluster="test",name=""} 1.675312989854E9
# TYPE pulsar_ml_reads_available_inflight_bytes gauge
pulsar_ml_reads_available_inflight_bytes{cluster="test"} -1.0
# TYPE jvm_memory_direct_bytes_max gauge
jvm_memory_direct_bytes_max{cluster="test"} 1.073741824E9
# TYPE pulsar_authentication_success counter
pulsar_authentication_success_total{cluster="test",provider_name="AuthenticationProviderToken",auth_method="token"} 19.0
pulsar_authentication_success_created{cluster="test",provider_name="AuthenticationProviderToken",auth_method="token"} 1.675312175266E9
pulsar_authentication_success_total{cluster="test",provider_name="AuthenticationProviderTls",auth_method="tls"} 4.0
pulsar_authentication_success_created{cluster="test",provider_name="AuthenticationProviderTls",auth_method="tls"} 1.675312214594E9
# TYPE pulsar_broker_lookup_failures counter
pulsar_broker_lookup_failures_total{cluster="test"} 0.0
pulsar_broker_lookup_failures_created{cluster="test"} 1.675312025557E9
# TYPE brk_ledgeroffloader_delete_offload_ops counter
# TYPE process_cpu_seconds counter
process_cpu_seconds_total{cluster="test"} 549.99
# TYPE process_start_time_seconds gauge
process_start_time_seconds{cluster="test"} 1.675311988796E9
# TYPE process_open_fds gauge
process_open_fds{cluster="test"} 923.0
# TYPE process_max_fds gauge
process_max_fds{cluster="test"} 65536.0
# TYPE process_virtual_memory_bytes gauge
process_virtual_memory_bytes{cluster="test"} 6.33777152E10
# TYPE process_resident_memory_bytes gauge
process_resident_memory_bytes{cluster="test"} 3.58189056E9
# TYPE pulsar_resource_group_aggregate_usage_secs summary
pulsar_resource_group_aggregate_usage_secs{cluster="test",quantile="0.5"} 0.003471627
pulsar_resource_group_aggregate_usage_secs{cluster="test",quantile="0.9"} 0.003471627
pulsar_resource_group_aggregate_usage_secs_count{cluster="test"} 1.0
pulsar_resource_group_aggregate_usage_secs_sum{cluster="test"} 0.003471627
pulsar_resource_group_aggregate_usage_secs_created{cluster="test"} 1.675312053991E9
# TYPE pulsar_resource_group_messages_used counter
# TYPE pulsar_broker_http_rejected_requests counter
pulsar_broker_http_rejected_requests_total{cluster="test"} 1.0
pulsar_broker_http_rejected_requests_created{cluster="test"} 1.675312204373E9
# TYPE jvm_info gauge
jvm_info{cluster="test",runtime="OpenJDK Runtime Environment",vendor="Eclipse Adoptium",version="17.0.6+10"} 1.0
# TYPE brk_ledgeroffloader_read_bytes counter
# TYPE pulsar_resource_group_calculated_bytes_quota counter
# TYPE pulsar_broker_lookup_redirects counter
pulsar_broker_lookup_redirects_total{cluster="test"} 37.0
pulsar_broker_lookup_redirects_created{cluster="test"} 1.675312025557E9
# TYPE jetty_requests counter
jetty_requests_total{cluster="test"} 9.0
# TYPE jetty_requests_active gauge
jetty_requests_active{cluster="test"} 0.0
# TYPE jetty_requests_active_max gauge
jetty_requests_active_max{cluster="test"} 1.0
# TYPE jetty_request_time_max_seconds gauge
jetty_request_time_max_seconds{cluster="test"} 0.025
# TYPE jetty_request_time_seconds counter
jetty_request_time_seconds_total{cluster="test"} 0.109
# TYPE jetty_dispatched counter
jetty_dispatched_total{cluster="test"} 9.0
# TYPE jetty_dispatched_active gauge
jetty_dispatched_active{cluster="test"} 0.0
# TYPE jetty_dispatched_active_max gauge
jetty_dispatched_active_max{cluster="test"} 1.0
# TYPE jetty_dispatched_time_max gauge
jetty_dispatched_time_max{cluster="test"} 10.0
# TYPE jetty_dispatched_time_seconds counter
jetty_dispatched_time_seconds_total{cluster="test"} 0.039
# TYPE jetty_async_requests counter
jetty_async_requests_total{cluster="test"} 9.0
# TYPE jetty_async_requests_waiting gauge
jetty_async_requests_waiting{cluster="test"} 0.0
# TYPE jetty_async_requests_waiting_max gauge
jetty_async_requests_waiting_max{cluster="test"} 1.0
# TYPE jetty_async_dispatches counter
jetty_async_dispatches_total{cluster="test"} 0.0
# TYPE jetty_expires counter
jetty_expires_total{cluster="test"} 0.0
# TYPE jetty_responses counter
jetty_responses_total{cluster="test",code="1xx"} 0.0
jetty_responses_total{cluster="test",code="2xx"} 9.0
jetty_responses_total{cluster="test",code="3xx"} 0.0
jetty_responses_total{cluster="test",code="4xx"} 0.0
jetty_responses_total{cluster="test",code="5xx"} 0.0
# TYPE jetty_stats_seconds gauge
jetty_stats_seconds{cluster="test"} 0.616
# TYPE jetty_responses_bytes counter
jetty_responses_bytes_total{cluster="test"} 498.0
# TYPE pulsar_authentication_failures counter
pulsar_authentication_failures_total{cluster="test",provider_name="AuthenticationProviderTls",auth_method="tls",reason="Client unable to authenticate with TLS certificate"} 2.0
pulsar_authentication_failures_created{cluster="test",provider_name="AuthenticationProviderTls",auth_method="tls",reason="Client unable to authenticate with TLS certificate"} 1.6753122151E9
# TYPE jvm_memory_objects_pending_finalization gauge
jvm_memory_objects_pending_finalization{cluster="test"} 0.0
# TYPE jvm_memory_bytes_used gauge
jvm_memory_bytes_used{cluster="test",area="heap"} 5.51550976E8
jvm_memory_bytes_used{cluster="test",area="nonheap"} 2.42682376E8
# TYPE jvm_memory_bytes_committed gauge
jvm_memory_bytes_committed{cluster="test",area="heap"} 1.073741824E9
jvm_memory_bytes_committed{cluster="test",area="nonheap"} 2.49626624E8
# TYPE jvm_memory_bytes_max gauge
jvm_memory_bytes_max{cluster="test",area="heap"} 1.073741824E9
jvm_memory_bytes_max{cluster="test",area="nonheap"} -1.0
# TYPE jvm_memory_bytes_init gauge
jvm_memory_bytes_init{cluster="test",area="heap"} 1.1534336E8
jvm_memory_bytes_init{cluster="test",area="nonheap"} 7667712.0
# TYPE jvm_memory_pool_bytes_used gauge
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'non-nmethods'"} 2376704.0
jvm_memory_pool_bytes_used{cluster="test",pool="Metaspace"} 1.30110744E8
jvm_memory_pool_bytes_used{cluster="test",pool="ZHeap"} 5.51550976E8
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'profiled nmethods'"} 6.4450304E7
jvm_memory_pool_bytes_used{cluster="test",pool="Compressed Class Space"} 1.4426224E7
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 3.132096E7
# TYPE jvm_memory_pool_bytes_committed gauge
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'non-nmethods'"} 2621440.0
jvm_memory_pool_bytes_committed{cluster="test",pool="Metaspace"} 1.3303808E8
jvm_memory_pool_bytes_committed{cluster="test",pool="ZHeap"} 1.073741824E9
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'profiled nmethods'"} 6.619136E7
jvm_memory_pool_bytes_committed{cluster="test",pool="Compressed Class Space"} 1.6121856E7
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 3.1653888E7
# TYPE jvm_memory_pool_bytes_max gauge
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'non-nmethods'"} 5828608.0
jvm_memory_pool_bytes_max{cluster="test",pool="Metaspace"} -1.0
jvm_memory_pool_bytes_max{cluster="test",pool="ZHeap"} 1.073741824E9
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'profiled nmethods'"} 1.22912768E8
jvm_memory_pool_bytes_max{cluster="test",pool="Compressed Class Space"} 1.073741824E9
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 1.22916864E8
# TYPE jvm_memory_pool_bytes_init gauge
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'non-nmethods'"} 2555904.0
jvm_memory_pool_bytes_init{cluster="test",pool="Metaspace"} 0.0
jvm_memory_pool_bytes_init{cluster="test",pool="ZHeap"} 8388608.0
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'profiled nmethods'"} 2555904.0
jvm_memory_pool_bytes_init{cluster="test",pool="Compressed Class Space"} 0.0
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2555904.0
# TYPE jvm_memory_pool_collection_used_bytes gauge
jvm_memory_pool_collection_used_bytes{cluster="test",pool="ZHeap"} 5.3477376E8
# TYPE jvm_memory_pool_collection_committed_bytes gauge
jvm_memory_pool_collection_committed_bytes{cluster="test",pool="ZHeap"} 1.073741824E9
# TYPE jvm_memory_pool_collection_max_bytes gauge
jvm_memory_pool_collection_max_bytes{cluster="test",pool="ZHeap"} 1.073741824E9
# TYPE jvm_memory_pool_collection_init_bytes gauge
jvm_memory_pool_collection_init_bytes{cluster="test",pool="ZHeap"} 8388608.0
# TYPE pulsar_batch_metadata_store_batch_execute_time_ms histogram
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 16.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_count{cluster="test",name="configuration-metadata-store"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_sum{cluster="test",name="configuration-metadata-store"} 10.0
pulsar_batch_metadata_store_batch_execute_time_ms_created{cluster="test",name="configuration-metadata-store"} 1.675313156802E9
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="1.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="5.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="10.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="20.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="50.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="100.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="200.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="500.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="1000.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="+Inf"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_count{cluster="test",name="metadata-store"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_sum{cluster="test",name="metadata-store"} 7.0
pulsar_batch_metadata_store_batch_execute_time_ms_created{cluster="test",name="metadata-store"} 1.675313156795E9
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_both counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_both_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_both_created{cluster="test"} 1.675312063624E9
# TYPE jvm_classes_currently_loaded gauge
jvm_classes_currently_loaded{cluster="test"} 22257.0
# TYPE jvm_classes_loaded counter
jvm_classes_loaded_total{cluster="test"} 25083.0
# TYPE jvm_classes_unloaded counter
jvm_classes_unloaded_total{cluster="test"} 2826.0
# TYPE pulsar_replicated_subscriptions_snapshot_ms summary
pulsar_replicated_subscriptions_snapshot_ms_count{cluster="test"} 24.0
pulsar_replicated_subscriptions_snapshot_ms_sum{cluster="test"} 551.0
pulsar_replicated_subscriptions_snapshot_ms_created{cluster="test"} 1.675312523758E9
# TYPE pulsar_broker_throttled_connections_global_limit gauge
pulsar_broker_throttled_connections_global_limit{cluster="test"} 0.0
# TYPE pulsar_resource_group_namespace_unregisters counter
# TYPE pulsar_resource_group_tenant_registers counter
# TYPE pulsar_resource_group_updates counter
# TYPE pulsar_resource_group_tenant_unregisters counter
# TYPE pulsar_storage_write_latency_le_200 gauge
pulsar_storage_write_latency_le_200{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_16_kb gauge
pulsar_entry_size_le_16_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_logical_size gauge
pulsar_storage_logical_size{cluster="test"} 0
pulsar_storage_logical_size{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_le_1_mb gauge
pulsar_entry_size_le_1_mb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_producers_count gauge
pulsar_producers_count{cluster="test"} 0
pulsar_producers_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_rate_out gauge
pulsar_rate_out{cluster="test"} 0
pulsar_rate_out{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_storage_ledger_write_latency_sum gauge
pulsar_storage_ledger_write_latency_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_200 gauge
pulsar_storage_ledger_write_latency_le_200{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_consumer_msg_ack_rate gauge
pulsar_consumer_msg_ack_rate{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_1 gauge
pulsar_storage_ledger_write_latency_le_1{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_1000 gauge
pulsar_storage_ledger_write_latency_le_1000{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_2_kb gauge
pulsar_entry_size_le_2_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_20 gauge
pulsar_storage_ledger_write_latency_le_20{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_50 gauge
pulsar_storage_write_latency_le_50{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_5 gauge
pulsar_storage_write_latency_le_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_delayed_message_index_size_bytes gauge
pulsar_delayed_message_index_size_bytes{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_size gauge
pulsar_storage_size{cluster="test"} 0
pulsar_storage_size{cluster="test",namespace="prop/ns-abc1"} 15600
# TYPE pulsar_storage_write_latency_le_10 gauge
pulsar_storage_write_latency_le_10{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_throughput_in gauge
pulsar_throughput_in{cluster="test"} 0
pulsar_throughput_in{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_storage_write_latency_le_1 gauge
pulsar_storage_write_latency_le_1{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_in_bytes_total gauge
pulsar_in_bytes_total{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_le_128 gauge
pulsar_entry_size_le_128{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_rate_in gauge
pulsar_rate_in{cluster="test"} 0
pulsar_rate_in{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_txn_tb_aborted_total gauge
pulsar_txn_tb_aborted_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_100_kb gauge
pulsar_entry_size_le_100_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_throughput_out gauge
pulsar_throughput_out{cluster="test"} 0
pulsar_throughput_out{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_topics_count gauge
pulsar_topics_count{cluster="test"} 0
pulsar_topics_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_storage_read_rate gauge
pulsar_storage_read_rate{cluster="test"} 0
pulsar_storage_read_rate{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_in_messages_total gauge
pulsar_in_messages_total{cluster="test",namespace="prop/ns-abc1"} 100
# TYPE pulsar_storage_write_latency_count gauge
pulsar_storage_write_latency_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_1_kb gauge
pulsar_entry_size_le_1_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_10 gauge
pulsar_storage_ledger_write_latency_le_10{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_100 gauge
pulsar_storage_write_latency_le_100{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_50 gauge
pulsar_storage_ledger_write_latency_le_50{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_overflow gauge
pulsar_storage_ledger_write_latency_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_1000 gauge
pulsar_storage_write_latency_le_1000{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_20 gauge
pulsar_storage_write_latency_le_20{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_sum gauge
pulsar_storage_write_latency_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_0_5 gauge
pulsar_storage_ledger_write_latency_le_0_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_0_5 gauge
pulsar_storage_write_latency_le_0_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_count gauge
pulsar_entry_size_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_100 gauge
pulsar_storage_ledger_write_latency_le_100{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_out_messages_total gauge
pulsar_out_messages_total{cluster="test",namespace="prop/ns-abc1"} 100
# TYPE pulsar_entry_size_le_overflow gauge
pulsar_entry_size_le_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_subscription_delayed gauge
pulsar_subscription_delayed{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_5 gauge
pulsar_storage_ledger_write_latency_le_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_rate gauge
pulsar_storage_write_rate{cluster="test"} 0
pulsar_storage_write_rate{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_msg_backlog gauge
pulsar_msg_backlog{cluster="test"} 0
pulsar_msg_backlog{cluster="test",namespace="prop/ns-abc1",remote_cluster="local"} 100
# TYPE pulsar_subscriptions_count gauge
pulsar_subscriptions_count{cluster="test"} 0
pulsar_subscriptions_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_entry_size_le_4_kb gauge
pulsar_entry_size_le_4_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_count gauge
pulsar_storage_ledger_write_latency_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_txn_tb_active_total gauge
pulsar_txn_tb_active_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_backlog_size gauge
pulsar_storage_backlog_size{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_txn_tb_committed_total gauge
pulsar_txn_tb_committed_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_consumers_count gauge
pulsar_consumers_count{cluster="test"} 0
pulsar_consumers_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_entry_size_le_512 gauge
pulsar_entry_size_le_512{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_out_bytes_total gauge
pulsar_out_bytes_total{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_sum gauge
pulsar_entry_size_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_offloaded_size gauge
pulsar_storage_offloaded_size{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_overflow gauge
pulsar_storage_write_latency_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_ml_cache_entries gauge
pulsar_ml_cache_entries{cluster="test"} 0
# TYPE pulsar_ml_cache_evicted_entries_total gauge
pulsar_ml_cache_evicted_entries_total{cluster="test"} 100
# TYPE pulsar_ml_cache_evictions gauge
pulsar_ml_cache_evictions{cluster="test"} 0
# TYPE pulsar_ml_cache_hits_rate gauge
pulsar_ml_cache_hits_rate{cluster="test"} 0.0
# TYPE pulsar_ml_cache_hits_throughput gauge
pulsar_ml_cache_hits_throughput{cluster="test"} 0.0
# TYPE pulsar_ml_cache_inserted_entries_total gauge
pulsar_ml_cache_inserted_entries_total{cluster="test"} 100
# TYPE pulsar_ml_cache_misses_rate gauge
pulsar_ml_cache_misses_rate{cluster="test"} 0.0
# TYPE pulsar_ml_cache_misses_throughput gauge
pulsar_ml_cache_misses_throughput{cluster="test"} 0.0
# TYPE pulsar_ml_cache_pool_active_allocations gauge
pulsar_ml_cache_pool_active_allocations{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_huge gauge
pulsar_ml_cache_pool_active_allocations_huge{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_normal gauge
pulsar_ml_cache_pool_active_allocations_normal{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_small gauge
pulsar_ml_cache_pool_active_allocations_small{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_allocated gauge
pulsar_ml_cache_pool_allocated{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_used gauge
pulsar_ml_cache_pool_used{cluster="test"} 0
# TYPE pulsar_ml_cache_used_size gauge
pulsar_ml_cache_used_size{cluster="test"} 0
# TYPE pulsar_ml_count gauge
pulsar_ml_count{cluster="test"} 1
# TYPE pulsar_ml_AddEntryBytesRate gauge
pulsar_ml_AddEntryBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryErrors gauge
pulsar_ml_AddEntryErrors{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryLatencyBuckets gauge
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_AddEntryLatencyBuckets_OVERFLOW gauge
pulsar_ml_AddEntryLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryMessagesRate gauge
pulsar_ml_AddEntryMessagesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntrySucceed gauge
pulsar_ml_AddEntrySucceed{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryWithReplicasBytesRate gauge
pulsar_ml_AddEntryWithReplicasBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_EntrySizeBuckets gauge
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_128.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1024.0_2048.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="102400.0_1048576.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="128.0_512.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="16384.0_102400.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="2048.0_4096.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="4096.0_16384.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="512.0_1024.0"} 0.0
# TYPE pulsar_ml_EntrySizeBuckets_OVERFLOW gauge
pulsar_ml_EntrySizeBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_LedgerAddEntryLatencyBuckets gauge
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_LedgerAddEntryLatencyBuckets_OVERFLOW gauge
pulsar_ml_LedgerAddEntryLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_LedgerSwitchLatencyBuckets gauge
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_LedgerSwitchLatencyBuckets_OVERFLOW gauge
pulsar_ml_LedgerSwitchLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_MarkDeleteRate gauge
pulsar_ml_MarkDeleteRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_NumberOfMessagesInBacklog gauge
pulsar_ml_NumberOfMessagesInBacklog{cluster="test", namespace="prop/ns-abc1/persistent"} 100.0
# TYPE pulsar_ml_ReadEntriesBytesRate gauge
pulsar_ml_ReadEntriesBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesErrors gauge
pulsar_ml_ReadEntriesErrors{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesRate gauge
pulsar_ml_ReadEntriesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesSucceeded gauge
pulsar_ml_ReadEntriesSucceeded{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_StoredMessagesSize gauge
pulsar_ml_StoredMessagesSize{cluster="test", namespace="prop/ns-abc1/persistent"} 15600.0
# TYPE pulsar_active_connections gauge
pulsar_active_connections{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_connection_closed_total_count gauge
pulsar_connection_closed_total_count{cluster="test", broker="localhost", metric="broker_connection"} 0
# TYPE pulsar_connection_create_fail_count gauge
pulsar_connection_create_fail_count{cluster="test", broker="localhost", metric="broker_connection"} 0
# TYPE pulsar_connection_create_success_count gauge
pulsar_connection_create_success_count{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_connection_created_total_count gauge
pulsar_connection_created_total_count{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_lb_bandwidth_in_usage gauge
pulsar_lb_bandwidth_in_usage{cluster="test", broker="localhost", metric="loadBalancing"} 0.0
# TYPE pulsar_lb_bandwidth_out_usage gauge
pulsar_lb_bandwidth_out_usage{cluster="test", broker="localhost", metric="loadBalancing"} 0.0
# TYPE pulsar_lb_cpu_usage gauge
pulsar_lb_cpu_usage{cluster="test", broker="localhost", metric="loadBalancing"} 6.5001484E-5
# TYPE pulsar_lb_directMemory_usage gauge
pulsar_lb_directMemory_usage{cluster="test", broker="localhost", metric="loadBalancing"} 1.5625
# TYPE pulsar_lb_memory_usage gauge
pulsar_lb_memory_usage{cluster="test", broker="localhost", metric="loadBalancing"} 75.0
# TYPE pulsar_lb_bundles_split_total gauge
pulsar_lb_bundles_split_total{cluster="test", metric="bundlesSplit"} 0
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_max_queue_size gauge
pulsar_managedLedger_client_bookkeeper_ml_scheduler_max_queue_size{cluster="test"} -1
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_threads gauge
pulsar_managedLedger_client_bookkeeper_ml_scheduler_threads{cluster="test"} 2
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_completed_tasks gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_completed_tasks{cluster="test"} 14
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_queue gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_queue{cluster="test"} 3
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_total_tasks gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_total_tasks{cluster="test"} 17
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_completed_tasks gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_completed_tasks{cluster="test"} 12
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_queue gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_queue{cluster="test"} 1
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_total_tasks gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_total_tasks{cluster="test"} 13
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution summary
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.5"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.75"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.95"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.99"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.9999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="1.0"} -Infinity
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_count{cluster="test", success="false"} 0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_sum{cluster="test", success="false"} 0.0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.5"} 0.04
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.75"} 0.04
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.95"} 0.04
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.99"} 0.04
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.999"} 0.04
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.9999"} 0.04
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="1.0"} 0.04
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_count{cluster="test", success="true"} 24
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_sum{cluster="test", success="true"} 9.0
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued summary
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.5"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.75"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.95"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.99"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.9999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="1.0"} -Infinity
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_count{cluster="test", success="false"} 0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_sum{cluster="test", success="false"} 0.0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.5"} 0.035
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.75"} 0.035
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.95"} 0.035
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.99"} 0.035
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.999"} 0.035
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.9999"} 0.035
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="1.0"} 0.035
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_count{cluster="test", success="true"} 24
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_sum{cluster="test", success="true"} 182.0

 expected object to not be null
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.assertNotNull(Assert.java:1319)
	at org.apache.pulsar.broker.stats.MetadataStoreStatsTest.testMetadataStoreStats(MetadataStoreStatsTest.java:113)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

```
java.lang.AssertionError:
Assertion failed with metrics:
# TYPE pulsar_batch_metadata_store_batch_size histogram
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 11.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 17.0
pulsar_batch_metadata_store_batch_size_count{cluster="test",name="configuration-metadata-store"} 17.0
pulsar_batch_metadata_store_batch_size_sum{cluster="test",name="configuration-metadata-store"} 24.0
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-02T10:55:19.4914867Z](https://github.com/apache/pulsar/actions/runs/4073474341/jobs/7017682379#step:10:1277)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError:
Assertion failed with metrics:
# TYPE pulsar_batch_metadata_store_batch_size histogram
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 11.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 17.0
pulsar_batch_metadata_store_batch_size_count{cluster="test",name="configuration-metadata-store"} 17.0
pulsar_batch_metadata_store_batch_size_sum{cluster="test",name="configuration-metadata-store"} 24.0
pulsar_batch_metadata_store_batch_size_created{cluster="test",name="configuration-metadata-store"} 1.675335316353E9
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="1.0"} 28.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="5.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="10.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="20.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="50.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="100.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="200.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="500.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="1000.0"} 36.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="+Inf"} 36.0
pulsar_batch_metadata_store_batch_size_count{cluster="test",name="metadata-store"} 36.0
pulsar_batch_metadata_store_batch_size_sum{cluster="test",name="metadata-store"} 48.0
pulsar_batch_metadata_store_batch_size_created{cluster="test",name="metadata-store"} 1.675335316342E9
# TYPE pulsar_resource_group_namespace_unregisters counter
# TYPE pulsar_ml_cache_pendingreads_matched_included counter
pulsar_ml_cache_pendingreads_matched_included_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_included_created{cluster="test"} 1.675334199117E9
# TYPE pulsar_expired_token counter
pulsar_expired_token_total{cluster="test"} 0.0
pulsar_expired_token_created{cluster="test"} 1.675335318636E9
# TYPE pulsar_batch_metadata_store_batch_execute_time_ms histogram
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 16.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_count{cluster="test",name="configuration-metadata-store"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_sum{cluster="test",name="configuration-metadata-store"} 10.0
pulsar_batch_metadata_store_batch_execute_time_ms_created{cluster="test",name="configuration-metadata-store"} 1.675335316353E9
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="1.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="5.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="10.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="20.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="50.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="100.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="200.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="500.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="1000.0"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="+Inf"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_count{cluster="test",name="metadata-store"} 36.0
pulsar_batch_metadata_store_batch_execute_time_ms_sum{cluster="test",name="metadata-store"} 11.0
pulsar_batch_metadata_store_batch_execute_time_ms_created{cluster="test",name="metadata-store"} 1.675335316342E9
# TYPE pulsar_broker_lookup_redirects counter
pulsar_broker_lookup_redirects_total{cluster="test"} 0.0
pulsar_broker_lookup_redirects_created{cluster="test"} 1.675334155427E9
# TYPE pulsar_resource_group_calculate_quota_secs summary
pulsar_resource_group_calculate_quota_secs{cluster="test",quantile="0.5"} 6.4E-6
pulsar_resource_group_calculate_quota_secs{cluster="test",quantile="0.9"} 9.1E-6
pulsar_resource_group_calculate_quota_secs_count{cluster="test"} 4.0
pulsar_resource_group_calculate_quota_secs_sum{cluster="test"} 0.008965443
pulsar_resource_group_calculate_quota_secs_created{cluster="test"} 1.675334190054E9
# TYPE pulsar_ml_cache_pendingreads_missed counter
pulsar_ml_cache_pendingreads_missed_total{cluster="test"} 4036.0
pulsar_ml_cache_pendingreads_missed_created{cluster="test"} 1.675334199117E9
# TYPE pulsar_batch_metadata_store_executor_queue_size gauge
pulsar_batch_metadata_store_executor_queue_size{cluster="test",name="configuration-metadata-store"} 1.0
pulsar_batch_metadata_store_executor_queue_size{cluster="test",name="metadata-store"} 1.0
# TYPE pulsar_resource_group_aggregate_usage_secs summary
pulsar_resource_group_aggregate_usage_secs{cluster="test",quantile="0.5"} 0.005302621
pulsar_resource_group_aggregate_usage_secs{cluster="test",quantile="0.9"} 0.020550998
pulsar_resource_group_aggregate_usage_secs_count{cluster="test"} 4.0
pulsar_resource_group_aggregate_usage_secs_sum{cluster="test"} 0.077540953
pulsar_resource_group_aggregate_usage_secs_created{cluster="test"} 1.675334190052E9
# TYPE jvm_threads_current gauge
jvm_threads_current{cluster="test"} 384.0
# TYPE jvm_threads_daemon gauge
jvm_threads_daemon{cluster="test"} 60.0
# TYPE jvm_threads_peak gauge
jvm_threads_peak{cluster="test"} 704.0
# TYPE jvm_threads_started counter
jvm_threads_started_total{cluster="test"} 15799.0
# TYPE jvm_threads_deadlocked gauge
jvm_threads_deadlocked{cluster="test"} 0.0
# TYPE jvm_threads_deadlocked_monitor gauge
jvm_threads_deadlocked_monitor{cluster="test"} 0.0
# TYPE jvm_threads_state gauge
jvm_threads_state{cluster="test",state="NEW"} 0.0
jvm_threads_state{cluster="test",state="TERMINATED"} 0.0
jvm_threads_state{cluster="test",state="RUNNABLE"} 16.0
jvm_threads_state{cluster="test",state="BLOCKED"} 0.0
jvm_threads_state{cluster="test",state="WAITING"} 311.0
jvm_threads_state{cluster="test",state="TIMED_WAITING"} 57.0
jvm_threads_state{cluster="test",state="UNKNOWN"} 0.0
# TYPE jetty_requests counter
jetty_requests_total{cluster="test"} 9.0
# TYPE jetty_requests_active gauge
jetty_requests_active{cluster="test"} 0.0
# TYPE jetty_requests_active_max gauge
jetty_requests_active_max{cluster="test"} 1.0
# TYPE jetty_request_time_max_seconds gauge
jetty_request_time_max_seconds{cluster="test"} 0.028
# TYPE jetty_request_time_seconds counter
jetty_request_time_seconds_total{cluster="test"} 0.105
# TYPE jetty_dispatched counter
jetty_dispatched_total{cluster="test"} 9.0
# TYPE jetty_dispatched_active gauge
jetty_dispatched_active{cluster="test"} 0.0
# TYPE jetty_dispatched_active_max gauge
jetty_dispatched_active_max{cluster="test"} 1.0
# TYPE jetty_dispatched_time_max gauge
jetty_dispatched_time_max{cluster="test"} 12.0
# TYPE jetty_dispatched_time_seconds counter
jetty_dispatched_time_seconds_total{cluster="test"} 0.048
# TYPE jetty_async_requests counter
jetty_async_requests_total{cluster="test"} 9.0
# TYPE jetty_async_requests_waiting gauge
jetty_async_requests_waiting{cluster="test"} 0.0
# TYPE jetty_async_requests_waiting_max gauge
jetty_async_requests_waiting_max{cluster="test"} 1.0
# TYPE jetty_async_dispatches counter
jetty_async_dispatches_total{cluster="test"} 0.0
# TYPE jetty_expires counter
jetty_expires_total{cluster="test"} 0.0
# TYPE jetty_responses counter
jetty_responses_total{cluster="test",code="1xx"} 0.0
jetty_responses_total{cluster="test",code="2xx"} 9.0
jetty_responses_total{cluster="test",code="3xx"} 0.0
jetty_responses_total{cluster="test",code="4xx"} 0.0
jetty_responses_total{cluster="test",code="5xx"} 0.0
# TYPE jetty_stats_seconds gauge
jetty_stats_seconds{cluster="test"} 0.527
# TYPE jetty_responses_bytes counter
jetty_responses_bytes_total{cluster="test"} 498.0
# TYPE pulsar_ml_reads_available_inflight_bytes gauge
pulsar_ml_reads_available_inflight_bytes{cluster="test"} -1.0
# TYPE pulsar_broker_publish_latency summary
pulsar_broker_publish_latency{cluster="test",quantile="0.0"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.5"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.95"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.99"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.999"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.9999"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="1.0"} NaN
pulsar_broker_publish_latency_count{cluster="test"} 7941.0
pulsar_broker_publish_latency_sum{cluster="test"} 1513330.0
# TYPE pulsar_txn_tp_aborted_count counter
pulsar_txn_tp_aborted_count_total{cluster="test",namespace="prop/use/ns-abc",topic="persistent://prop/use/ns-abc/successTopic",subscription="subscriptionName",status="succeed"} 1.0
pulsar_txn_tp_aborted_count_created{cluster="test",namespace="prop/use/ns-abc",topic="persistent://prop/use/ns-abc/successTopic",subscription="subscriptionName",status="succeed"} 1.675334639841E9
# TYPE pulsar_resource_group_calculated_bytes_quota counter
# TYPE pulsar_broker_pending_bytes_to_dispatch gauge
pulsar_broker_pending_bytes_to_dispatch{cluster="test"} 0.0
# TYPE pulsar_resource_group_updates counter
# TYPE jvm_classes_currently_loaded gauge
jvm_classes_currently_loaded{cluster="test"} 21479.0
# TYPE jvm_classes_loaded counter
jvm_classes_loaded_total{cluster="test"} 24115.0
# TYPE jvm_classes_unloaded counter
jvm_classes_unloaded_total{cluster="test"} 2636.0
# TYPE pulsar_resource_group_calculated_messages_quota counter
# TYPE pulsar_ml_cache_pendingreads_matched counter
pulsar_ml_cache_pendingreads_matched_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_created{cluster="test"} 1.675334199117E9
# TYPE jvm_gc_collection_seconds summary
jvm_gc_collection_seconds_count{cluster="test",gc="ZGC Cycles"} 209.0
jvm_gc_collection_seconds_sum{cluster="test",gc="ZGC Cycles"} 250.867
jvm_gc_collection_seconds_count{cluster="test",gc="ZGC Pauses"} 628.0
jvm_gc_collection_seconds_sum{cluster="test",gc="ZGC Pauses"} 0.017
# TYPE pulsar_version_info gauge
pulsar_version_info{cluster="test",version="2.12.0-SNAPSHOT",commit="e005ce44d1f520ba10db67816fb7c87d1c49d2a3"} 1.0
# TYPE caffeine_cache_hit counter
caffeine_cache_hit_total{cluster="test",cache="owned-bundles"} 5.0
caffeine_cache_hit_total{cluster="test",cache="bundles"} 5.0
# TYPE caffeine_cache_miss counter
caffeine_cache_miss_total{cluster="test",cache="owned-bundles"} 4.0
caffeine_cache_miss_total{cluster="test",cache="bundles"} 4.0
# TYPE caffeine_cache_requests counter
caffeine_cache_requests_total{cluster="test",cache="owned-bundles"} 9.0
caffeine_cache_requests_total{cluster="test",cache="bundles"} 9.0
# TYPE caffeine_cache_eviction counter
caffeine_cache_eviction_total{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_eviction_total{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_eviction_weight gauge
caffeine_cache_eviction_weight{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_eviction_weight{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_load_failure counter
caffeine_cache_load_failure_total{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_load_failure_total{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_loads counter
caffeine_cache_loads_total{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_loads_total{cluster="test",cache="bundles"} 4.0
# TYPE caffeine_cache_estimated_size gauge
caffeine_cache_estimated_size{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_estimated_size{cluster="test",cache="bundles"} 3.0
# TYPE caffeine_cache_load_duration_seconds summary
caffeine_cache_load_duration_seconds_count{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_load_duration_seconds_sum{cluster="test",cache="owned-bundles"} 0.007568361
caffeine_cache_load_duration_seconds_count{cluster="test",cache="bundles"} 4.0
caffeine_cache_load_duration_seconds_sum{cluster="test",cache="bundles"} 0.019402346
# TYPE jvm_buffer_pool_used_bytes gauge
jvm_buffer_pool_used_bytes{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_used_bytes{cluster="test",pool="direct"} 1.7438631E7
jvm_buffer_pool_used_bytes{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE jvm_buffer_pool_capacity_bytes gauge
jvm_buffer_pool_capacity_bytes{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_capacity_bytes{cluster="test",pool="direct"} 1.743863E7
jvm_buffer_pool_capacity_bytes{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE jvm_buffer_pool_used_buffers gauge
jvm_buffer_pool_used_buffers{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_used_buffers{cluster="test",pool="direct"} 165.0
jvm_buffer_pool_used_buffers{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE process_cpu_seconds counter
process_cpu_seconds_total{cluster="test"} 475.95
# TYPE process_start_time_seconds gauge
process_start_time_seconds{cluster="test"} 1.675334099748E9
# TYPE process_open_fds gauge
process_open_fds{cluster="test"} 894.0
# TYPE process_max_fds gauge
process_max_fds{cluster="test"} 65536.0
# TYPE process_virtual_memory_bytes gauge
process_virtual_memory_bytes{cluster="test"} 6.3414472704E10
# TYPE process_resident_memory_bytes gauge
process_resident_memory_bytes{cluster="test"} 3.078115328E9
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_left counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_left_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_left_created{cluster="test"} 1.675334199117E9
# TYPE pulsar_broker_load_manager_bundle_assigment summary
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.5"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.99"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.999"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="1.0"} NaN
pulsar_broker_load_manager_bundle_assigment_count{cluster="test"} 211.0
pulsar_broker_load_manager_bundle_assigment_sum{cluster="test"} 3089.0
# TYPE pulsar_resource_group_tenant_unregisters counter
# TYPE pulsar_broker_lookup_answers counter
pulsar_broker_lookup_answers_total{cluster="test"} 1446.0
pulsar_broker_lookup_answers_created{cluster="test"} 1.675334155427E9
# TYPE pulsar_resource_group_namespace_registers counter
# TYPE pulsar_resource_group_bytes_used counter
# TYPE pulsar_batch_metadata_store_queue_wait_time_ms histogram
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 6.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 21.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_count{cluster="test",name="configuration-metadata-store"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_sum{cluster="test",name="configuration-metadata-store"} 75.0
pulsar_batch_metadata_store_queue_wait_time_ms_created{cluster="test",name="configuration-metadata-store"} 1.675335316353E9
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="1.0"} 6.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="5.0"} 46.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="10.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="20.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="50.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="100.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="200.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="500.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="1000.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="+Inf"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_count{cluster="test",name="metadata-store"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_sum{cluster="test",name="metadata-store"} 160.0
pulsar_batch_metadata_store_queue_wait_time_ms_created{cluster="test",name="metadata-store"} 1.675335316342E9
# TYPE pulsar_metadata_store_put_bytes counter
pulsar_metadata_store_put_bytes_total{cluster="test",name="configuration-metadata-store"} 2280.0
pulsar_metadata_store_put_bytes_created{cluster="test",name="configuration-metadata-store"} 1.67533531635E9
pulsar_metadata_store_put_bytes_total{cluster="test",name="metadata-store"} 1928.0
pulsar_metadata_store_put_bytes_created{cluster="test",name="metadata-store"} 1.675335316338E9
pulsar_metadata_store_put_bytes_total{cluster="test",name=""} 985.0
pulsar_metadata_store_put_bytes_created{cluster="test",name=""} 1.675335139388E9
# TYPE pulsar_broker_lookup summary
pulsar_broker_lookup{cluster="test",quantile="0.5"} NaN
pulsar_broker_lookup{cluster="test",quantile="0.99"} NaN
pulsar_broker_lookup{cluster="test",quantile="0.999"} NaN
pulsar_broker_lookup{cluster="test",quantile="1.0"} NaN
pulsar_broker_lookup_count{cluster="test"} 1446.0
pulsar_broker_lookup_sum{cluster="test"} 60246.0
# TYPE pulsar_broker_throttled_connections gauge
pulsar_broker_throttled_connections{cluster="test"} 0.0
# TYPE pulsar_broker_topic_load_pending_requests gauge
pulsar_broker_topic_load_pending_requests{cluster="test"} 0.0
# TYPE jvm_memory_objects_pending_finalization gauge
jvm_memory_objects_pending_finalization{cluster="test"} 0.0
# TYPE jvm_memory_bytes_used gauge
jvm_memory_bytes_used{cluster="test",area="heap"} 4.67664896E8
jvm_memory_bytes_used{cluster="test",area="nonheap"} 2.33248216E8
# TYPE jvm_memory_bytes_committed gauge
jvm_memory_bytes_committed{cluster="test",area="heap"} 1.073741824E9
jvm_memory_bytes_committed{cluster="test",area="nonheap"} 2.38026752E8
# TYPE jvm_memory_bytes_max gauge
jvm_memory_bytes_max{cluster="test",area="heap"} 1.073741824E9
jvm_memory_bytes_max{cluster="test",area="nonheap"} -1.0
# TYPE jvm_memory_bytes_init gauge
jvm_memory_bytes_init{cluster="test",area="heap"} 1.1534336E8
jvm_memory_bytes_init{cluster="test",area="nonheap"} 7667712.0
# TYPE jvm_memory_pool_bytes_used gauge
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'non-nmethods'"} 2362368.0
jvm_memory_pool_bytes_used{cluster="test",pool="Metaspace"} 1.25305328E8
jvm_memory_pool_bytes_used{cluster="test",pool="ZHeap"} 4.67664896E8
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'profiled nmethods'"} 6.3423872E7
jvm_memory_pool_bytes_used{cluster="test",pool="Compressed Class Space"} 1.3904104E7
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2.8252544E7
# TYPE jvm_memory_pool_bytes_committed gauge
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'non-nmethods'"} 2555904.0
jvm_memory_pool_bytes_committed{cluster="test",pool="Metaspace"} 1.2812288E8
jvm_memory_pool_bytes_committed{cluster="test",pool="ZHeap"} 1.073741824E9
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'profiled nmethods'"} 6.3504384E7
jvm_memory_pool_bytes_committed{cluster="test",pool="Compressed Class Space"} 1.5532032E7
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2.8311552E7
# TYPE jvm_memory_pool_bytes_max gauge
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'non-nmethods'"} 5828608.0
jvm_memory_pool_bytes_max{cluster="test",pool="Metaspace"} -1.0
jvm_memory_pool_bytes_max{cluster="test",pool="ZHeap"} 1.073741824E9
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'profiled nmethods'"} 1.22912768E8
jvm_memory_pool_bytes_max{cluster="test",pool="Compressed Class Space"} 1.073741824E9
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 1.22916864E8
# TYPE jvm_memory_pool_bytes_init gauge
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'non-nmethods'"} 2555904.0
jvm_memory_pool_bytes_init{cluster="test",pool="Metaspace"} 0.0
jvm_memory_pool_bytes_init{cluster="test",pool="ZHeap"} 8388608.0
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'profiled nmethods'"} 2555904.0
jvm_memory_pool_bytes_init{cluster="test",pool="Compressed Class Space"} 0.0
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2555904.0
# TYPE jvm_memory_pool_collection_used_bytes gauge
jvm_memory_pool_collection_used_bytes{cluster="test",pool="ZHeap"} 4.6137344E8
# TYPE jvm_memory_pool_collection_committed_bytes gauge
jvm_memory_pool_collection_committed_bytes{cluster="test",pool="ZHeap"} 1.073741824E9
# TYPE jvm_memory_pool_collection_max_bytes gauge
jvm_memory_pool_collection_max_bytes{cluster="test",pool="ZHeap"} 1.073741824E9
# TYPE jvm_memory_pool_collection_init_bytes gauge
jvm_memory_pool_collection_init_bytes{cluster="test",pool="ZHeap"} 8388608.0
# TYPE pulsar_broker_lookup_failures counter
pulsar_broker_lookup_failures_total{cluster="test"} 1.0
pulsar_broker_lookup_failures_created{cluster="test"} 1.675334155427E9
# TYPE pulsar_broker_lookup_pending_requests gauge
pulsar_broker_lookup_pending_requests{cluster="test"} 0.0
# TYPE topic_load_times summary
topic_load_times{cluster="test",quantile="0.5"} NaN
topic_load_times{cluster="test",quantile="0.75"} NaN
topic_load_times{cluster="test",quantile="0.95"} NaN
topic_load_times{cluster="test",quantile="0.99"} NaN
topic_load_times{cluster="test",quantile="0.999"} NaN
topic_load_times{cluster="test",quantile="0.9999"} NaN
topic_load_times_count{cluster="test"} 2.0
topic_load_times_sum{cluster="test"} 4111.0
topic_load_times_created{cluster="test"} 1.675334160264E9
# TYPE brk_ledgeroffloader_delete_offload_ops counter
# TYPE brk_ledgeroffloader_read_bytes counter
# TYPE jvm_memory_pool_allocated_bytes counter
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'profiled nmethods'"} 3.79339008E8
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'profiled nmethods'"} 1.675335311704E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="ZHeap"} 3.223322624E9
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="ZHeap"} 1.675335311703E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 1.68799488E8
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 1.675335311704E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="Compressed Class Space"} 8.3409024E7
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="Compressed Class Space"} 1.675335311704E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="Metaspace"} 7.51554048E8
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="Metaspace"} 1.675335311704E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'non-nmethods'"} 1.4174208E7
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'non-nmethods'"} 1.675335311704E9
# TYPE jvm_memory_direct_bytes_max gauge
jvm_memory_direct_bytes_max{cluster="test"} 1.073741824E9
# TYPE pulsar_ml_cache_pendingreads_entries_notread counter
pulsar_ml_cache_pendingreads_entries_notread_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_entries_notread_created{cluster="test"} 1.675334199117E9
# TYPE pulsar_txn_tp_committed_count counter
# TYPE pulsar_replicated_subscriptions_pending_snapshots gauge
pulsar_replicated_subscriptions_pending_snapshots{cluster="test"} 0.0
# TYPE pulsar_metadata_store_ops_latency_ms histogram
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="del",status="fail"} 1.675335316338E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 1.67533531635E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="del",status="success"} 1.675335316338E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 1.67533531635E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="get",status="fail"} 1.675335139388E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 1.67533531635E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="1.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="3.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="5.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="10.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="20.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="50.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="100.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="200.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="500.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="1000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="2000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="5000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="+Inf"} 7.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="get",status="success"} 7.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="get",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="get",status="success"} 1.675335139388E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="put",status="fail"} 1.675335139388E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="1.0"} 2.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="3.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="5.0"} 11.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="10.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="20.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="50.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="100.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="200.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="500.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="1000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="2000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="5000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="+Inf"} 16.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="get",status="success"} 16.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="get",status="success"} 65.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="get",status="success"} 1.67533531635E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="del",status="fail"} 1.675335139388E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="put",status="fail"} 1.675335316338E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="1.0"} 1.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="3.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="5.0"} 27.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="10.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="20.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="50.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="100.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="200.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="500.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="1000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="2000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="5000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="+Inf"} 28.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="get",status="success"} 28.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="get",status="success"} 108.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="get",status="success"} 1.675335316338E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="get",status="fail"} 1.675335316338E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="del",status="success"} 1.675335139388E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="1.0"} 4.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="3.0"} 10.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="5.0"} 13.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="10.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="20.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="50.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="100.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="200.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="500.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="1000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="2000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="5000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="+Inf"} 15.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="put",status="success"} 15.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="put",status="success"} 43.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="put",status="success"} 1.675335316338E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="1.0"} 51.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="3.0"} 51.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="5.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="10.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="20.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="50.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="100.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="200.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="500.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="1000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="2000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="5000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="+Inf"} 52.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="put",status="success"} 52.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="put",status="success"} 7.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="put",status="success"} 1.675335139388E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="del",status="success"} 1.67533531635E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="1.0"} 3.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="3.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="5.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="10.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="20.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="50.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="100.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="200.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="500.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="1000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="2000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="5000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="+Inf"} 5.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="put",status="success"} 5.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="put",status="success"} 5.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="put",status="success"} 1.67533531635E9
# TYPE pulsar_txn_tp_commit_latency summary
# TYPE pulsar_ml_reads_inflight_bytes gauge
pulsar_ml_reads_inflight_bytes{cluster="test"} -1.0
# TYPE pulsar_broker_throttled_connections_global_limit gauge
pulsar_broker_throttled_connections_global_limit{cluster="test"} 0.0
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_both counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_both_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_both_created{cluster="test"} 1.675334199117E9
# TYPE jvm_memory_direct_bytes_used gauge
jvm_memory_direct_bytes_used{cluster="test"} 1.7487783E7
# TYPE pulsar_replicated_subscriptions_snapshot_ms summary
pulsar_replicated_subscriptions_snapshot_ms_count{cluster="test"} 22.0
pulsar_replicated_subscriptions_snapshot_ms_sum{cluster="test"} 607.0
pulsar_replicated_subscriptions_snapshot_ms_created{cluster="test"} 1.675334769346E9
# TYPE pulsar_expiring_token_minutes histogram
pulsar_expiring_token_minutes_bucket{cluster="test",le="5.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="10.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="60.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="240.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="+Inf"} 0.0
pulsar_expiring_token_minutes_count{cluster="test"} 0.0
pulsar_expiring_token_minutes_sum{cluster="test"} 0.0
pulsar_expiring_token_minutes_created{cluster="test"} 1.675335318636E9
# TYPE pulsar_ml_cache_pendingreads_entries_read counter
pulsar_ml_cache_pendingreads_entries_read_total{cluster="test"} 4036.0
pulsar_ml_cache_pendingreads_entries_read_created{cluster="test"} 1.675334199117E9
# TYPE jvm_info gauge
jvm_info{cluster="test",runtime="OpenJDK Runtime Environment",vendor="Eclipse Adoptium",version="17.0.6+10"} 1.0
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_right counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_right_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_right_created{cluster="test"} 1.675334199117E9
# TYPE pulsar_resource_group_messages_used counter
# TYPE pulsar_resource_group_tenant_registers counter
# TYPE pulsar_storage_write_latency_le_200 gauge
pulsar_storage_write_latency_le_200{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_16_kb gauge
pulsar_entry_size_le_16_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_logical_size gauge
pulsar_storage_logical_size{cluster="test"} 0
pulsar_storage_logical_size{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_le_1_mb gauge
pulsar_entry_size_le_1_mb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_producers_count gauge
pulsar_producers_count{cluster="test"} 0
pulsar_producers_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_rate_out gauge
pulsar_rate_out{cluster="test"} 0
pulsar_rate_out{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_storage_ledger_write_latency_sum gauge
pulsar_storage_ledger_write_latency_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_200 gauge
pulsar_storage_ledger_write_latency_le_200{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_consumer_msg_ack_rate gauge
pulsar_consumer_msg_ack_rate{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_1 gauge
pulsar_storage_ledger_write_latency_le_1{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_1000 gauge
pulsar_storage_ledger_write_latency_le_1000{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_2_kb gauge
pulsar_entry_size_le_2_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_20 gauge
pulsar_storage_ledger_write_latency_le_20{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_50 gauge
pulsar_storage_write_latency_le_50{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_5 gauge
pulsar_storage_write_latency_le_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_delayed_message_index_size_bytes gauge
pulsar_delayed_message_index_size_bytes{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_size gauge
pulsar_storage_size{cluster="test"} 0
pulsar_storage_size{cluster="test",namespace="prop/ns-abc1"} 15600
# TYPE pulsar_storage_write_latency_le_10 gauge
pulsar_storage_write_latency_le_10{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_throughput_in gauge
pulsar_throughput_in{cluster="test"} 0
pulsar_throughput_in{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_storage_write_latency_le_1 gauge
pulsar_storage_write_latency_le_1{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_in_bytes_total gauge
pulsar_in_bytes_total{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_le_128 gauge
pulsar_entry_size_le_128{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_rate_in gauge
pulsar_rate_in{cluster="test"} 0
pulsar_rate_in{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_txn_tb_aborted_total gauge
pulsar_txn_tb_aborted_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_100_kb gauge
pulsar_entry_size_le_100_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_throughput_out gauge
pulsar_throughput_out{cluster="test"} 0
pulsar_throughput_out{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_topics_count gauge
pulsar_topics_count{cluster="test"} 0
pulsar_topics_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_storage_read_rate gauge
pulsar_storage_read_rate{cluster="test"} 0
pulsar_storage_read_rate{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_in_messages_total gauge
pulsar_in_messages_total{cluster="test",namespace="prop/ns-abc1"} 100
# TYPE pulsar_storage_write_latency_count gauge
pulsar_storage_write_latency_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_1_kb gauge
pulsar_entry_size_le_1_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_10 gauge
pulsar_storage_ledger_write_latency_le_10{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_100 gauge
pulsar_storage_write_latency_le_100{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_50 gauge
pulsar_storage_ledger_write_latency_le_50{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_overflow gauge
pulsar_storage_ledger_write_latency_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_1000 gauge
pulsar_storage_write_latency_le_1000{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_20 gauge
pulsar_storage_write_latency_le_20{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_sum gauge
pulsar_storage_write_latency_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_0_5 gauge
pulsar_storage_ledger_write_latency_le_0_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_0_5 gauge
pulsar_storage_write_latency_le_0_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_count gauge
pulsar_entry_size_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_100 gauge
pulsar_storage_ledger_write_latency_le_100{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_out_messages_total gauge
pulsar_out_messages_total{cluster="test",namespace="prop/ns-abc1"} 100
# TYPE pulsar_entry_size_le_overflow gauge
pulsar_entry_size_le_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_subscription_delayed gauge
pulsar_subscription_delayed{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_5 gauge
pulsar_storage_ledger_write_latency_le_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_rate gauge
pulsar_storage_write_rate{cluster="test"} 0
pulsar_storage_write_rate{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_msg_backlog gauge
pulsar_msg_backlog{cluster="test"} 0
pulsar_msg_backlog{cluster="test",namespace="prop/ns-abc1",remote_cluster="local"} 100
# TYPE pulsar_subscriptions_count gauge
pulsar_subscriptions_count{cluster="test"} 0
pulsar_subscriptions_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_entry_size_le_4_kb gauge
pulsar_entry_size_le_4_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_count gauge
pulsar_storage_ledger_write_latency_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_txn_tb_active_total gauge
pulsar_txn_tb_active_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_backlog_size gauge
pulsar_storage_backlog_size{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_txn_tb_committed_total gauge
pulsar_txn_tb_committed_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_consumers_count gauge
pulsar_consumers_count{cluster="test"} 0
pulsar_consumers_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_entry_size_le_512 gauge
pulsar_entry_size_le_512{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_out_bytes_total gauge
pulsar_out_bytes_total{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_sum gauge
pulsar_entry_size_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_offloaded_size gauge
pulsar_storage_offloaded_size{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_overflow gauge
pulsar_storage_write_latency_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_ml_cache_entries gauge
pulsar_ml_cache_entries{cluster="test"} 0
# TYPE pulsar_ml_cache_evicted_entries_total gauge
pulsar_ml_cache_evicted_entries_total{cluster="test"} 100
# TYPE pulsar_ml_cache_evictions gauge
pulsar_ml_cache_evictions{cluster="test"} 0
# TYPE pulsar_ml_cache_hits_rate gauge
pulsar_ml_cache_hits_rate{cluster="test"} 0.0
# TYPE pulsar_ml_cache_hits_throughput gauge
pulsar_ml_cache_hits_throughput{cluster="test"} 0.0
# TYPE pulsar_ml_cache_inserted_entries_total gauge
pulsar_ml_cache_inserted_entries_total{cluster="test"} 100
# TYPE pulsar_ml_cache_misses_rate gauge
pulsar_ml_cache_misses_rate{cluster="test"} 0.0
# TYPE pulsar_ml_cache_misses_throughput gauge
pulsar_ml_cache_misses_throughput{cluster="test"} 0.0
# TYPE pulsar_ml_cache_pool_active_allocations gauge
pulsar_ml_cache_pool_active_allocations{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_huge gauge
pulsar_ml_cache_pool_active_allocations_huge{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_normal gauge
pulsar_ml_cache_pool_active_allocations_normal{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_small gauge
pulsar_ml_cache_pool_active_allocations_small{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_allocated gauge
pulsar_ml_cache_pool_allocated{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_used gauge
pulsar_ml_cache_pool_used{cluster="test"} 0
# TYPE pulsar_ml_cache_used_size gauge
pulsar_ml_cache_used_size{cluster="test"} 0
# TYPE pulsar_ml_count gauge
pulsar_ml_count{cluster="test"} 1
# TYPE pulsar_ml_AddEntryBytesRate gauge
pulsar_ml_AddEntryBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryErrors gauge
pulsar_ml_AddEntryErrors{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryLatencyBuckets gauge
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_AddEntryLatencyBuckets_OVERFLOW gauge
pulsar_ml_AddEntryLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryMessagesRate gauge
pulsar_ml_AddEntryMessagesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntrySucceed gauge
pulsar_ml_AddEntrySucceed{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryWithReplicasBytesRate gauge
pulsar_ml_AddEntryWithReplicasBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_EntrySizeBuckets gauge
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_128.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1024.0_2048.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="102400.0_1048576.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="128.0_512.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="16384.0_102400.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="2048.0_4096.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="4096.0_16384.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="512.0_1024.0"} 0.0
# TYPE pulsar_ml_EntrySizeBuckets_OVERFLOW gauge
pulsar_ml_EntrySizeBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_LedgerAddEntryLatencyBuckets gauge
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_LedgerAddEntryLatencyBuckets_OVERFLOW gauge
pulsar_ml_LedgerAddEntryLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_LedgerSwitchLatencyBuckets gauge
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_LedgerSwitchLatencyBuckets_OVERFLOW gauge
pulsar_ml_LedgerSwitchLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_MarkDeleteRate gauge
pulsar_ml_MarkDeleteRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_NumberOfMessagesInBacklog gauge
pulsar_ml_NumberOfMessagesInBacklog{cluster="test", namespace="prop/ns-abc1/persistent"} 100.0
# TYPE pulsar_ml_ReadEntriesBytesRate gauge
pulsar_ml_ReadEntriesBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesErrors gauge
pulsar_ml_ReadEntriesErrors{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesRate gauge
pulsar_ml_ReadEntriesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesSucceeded gauge
pulsar_ml_ReadEntriesSucceeded{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_StoredMessagesSize gauge
pulsar_ml_StoredMessagesSize{cluster="test", namespace="prop/ns-abc1/persistent"} 15600.0
# TYPE pulsar_active_connections gauge
pulsar_active_connections{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_connection_closed_total_count gauge
pulsar_connection_closed_total_count{cluster="test", broker="localhost", metric="broker_connection"} 0
# TYPE pulsar_connection_create_fail_count gauge
pulsar_connection_create_fail_count{cluster="test", broker="localhost", metric="broker_connection"} 0
# TYPE pulsar_connection_create_success_count gauge
pulsar_connection_create_success_count{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_connection_created_total_count gauge
pulsar_connection_created_total_count{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_lb_bandwidth_in_usage gauge
pulsar_lb_bandwidth_in_usage{cluster="test", broker="localhost", metric="loadBalancing"} 0.0
# TYPE pulsar_lb_bandwidth_out_usage gauge
pulsar_lb_bandwidth_out_usage{cluster="test", broker="localhost", metric="loadBalancing"} 0.0
# TYPE pulsar_lb_cpu_usage gauge
pulsar_lb_cpu_usage{cluster="test", broker="localhost", metric="loadBalancing"} 6.986743E-5
# TYPE pulsar_lb_directMemory_usage gauge
pulsar_lb_directMemory_usage{cluster="test", broker="localhost", metric="loadBalancing"} 1.5625
# TYPE pulsar_lb_memory_usage gauge
pulsar_lb_memory_usage{cluster="test", broker="localhost", metric="loadBalancing"} 66.60156
# TYPE pulsar_lb_bundles_split_total gauge
pulsar_lb_bundles_split_total{cluster="test", metric="bundlesSplit"} 0
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_max_queue_size gauge
pulsar_managedLedger_client_bookkeeper_ml_scheduler_max_queue_size{cluster="test"} -1
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_threads gauge
pulsar_managedLedger_client_bookkeeper_ml_scheduler_threads{cluster="test"} 2
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_completed_tasks gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_completed_tasks{cluster="test"} 15
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_queue gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_queue{cluster="test"} 3
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_total_tasks gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_total_tasks{cluster="test"} 18
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_completed_tasks gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_completed_tasks{cluster="test"} 11
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_queue gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_queue{cluster="test"} 1
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_total_tasks gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_total_tasks{cluster="test"} 12
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution summary
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.5"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.75"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.95"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.99"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.9999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="1.0"} -Infinity
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_count{cluster="test", success="false"} 0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_sum{cluster="test", success="false"} 0.0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.5"} 0.082
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.75"} 0.082
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.95"} 0.082
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.99"} 0.082
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.999"} 0.082
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.9999"} 0.082
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="1.0"} 0.082
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_count{cluster="test", success="true"} 24
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_sum{cluster="test", success="true"} 5.0
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued summary
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.5"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.75"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.95"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.99"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.9999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="1.0"} -Infinity
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_count{cluster="test", success="false"} 0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_sum{cluster="test", success="false"} 0.0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.5"} 0.067
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.75"} 0.067
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.95"} 0.067
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.99"} 0.067
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.999"} 0.067
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.9999"} 0.067
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="1.0"} 0.067
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_count{cluster="test", success="true"} 24
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_sum{cluster="test", success="true"} 180.0

 expected object to not be null
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.assertNotNull(Assert.java:1319)
	at org.apache.pulsar.broker.stats.MetadataStoreStatsTest.testMetadataStoreStats(MetadataStoreStatsTest.java:113)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

```
java.lang.AssertionError:
Assertion failed with metrics:
# TYPE pulsar_ml_cache_pendingreads_missed counter
pulsar_ml_cache_pendingreads_missed_total{cluster="test"} 13890.0
pulsar_ml_cache_pendingreads_missed_created{cluster="test"} 1.675429365162E9
# TYPE pulsar_resource_group_messages_used counter
# TYPE pulsar_broker_lookup_pending_requests gauge
pulsar_broker_lookup_pending_requests{cluster="test"} 0.0
# TYPE pulsar_resource_group_tenant_registers counter
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_left counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_left_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_left_created{cluster="test"} 1.675429365162E9
# TYPE jvm_threads_current gauge
jvm_threads_current{cluster="test"} 151.0
# TYPE jvm_threads_daemon gauge
```

Usage tip: To enable automatic navigation to failure message, open the following links with CTRL/CMD-click.  
[example failure 2023-02-03T13:20:02.7647242Z](https://github.com/apache/pulsar/actions/runs/4084265136/jobs/7040983653#step:11:1262)  


<details>
<summary>Full exception stacktrace</summary>
<code><pre>
java.lang.AssertionError:
Assertion failed with metrics:
# TYPE pulsar_ml_cache_pendingreads_missed counter
pulsar_ml_cache_pendingreads_missed_total{cluster="test"} 13890.0
pulsar_ml_cache_pendingreads_missed_created{cluster="test"} 1.675429365162E9
# TYPE pulsar_resource_group_messages_used counter
# TYPE pulsar_broker_lookup_pending_requests gauge
pulsar_broker_lookup_pending_requests{cluster="test"} 0.0
# TYPE pulsar_resource_group_tenant_registers counter
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_left counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_left_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_left_created{cluster="test"} 1.675429365162E9
# TYPE jvm_threads_current gauge
jvm_threads_current{cluster="test"} 151.0
# TYPE jvm_threads_daemon gauge
jvm_threads_daemon{cluster="test"} 84.0
# TYPE jvm_threads_peak gauge
jvm_threads_peak{cluster="test"} 576.0
# TYPE jvm_threads_started counter
jvm_threads_started_total{cluster="test"} 12251.0
# TYPE jvm_threads_deadlocked gauge
jvm_threads_deadlocked{cluster="test"} 0.0
# TYPE jvm_threads_deadlocked_monitor gauge
jvm_threads_deadlocked_monitor{cluster="test"} 0.0
# TYPE jvm_threads_state gauge
jvm_threads_state{cluster="test",state="NEW"} 0.0
jvm_threads_state{cluster="test",state="TERMINATED"} 0.0
jvm_threads_state{cluster="test",state="RUNNABLE"} 18.0
jvm_threads_state{cluster="test",state="BLOCKED"} 0.0
jvm_threads_state{cluster="test",state="WAITING"} 62.0
jvm_threads_state{cluster="test",state="TIMED_WAITING"} 71.0
jvm_threads_state{cluster="test",state="UNKNOWN"} 0.0
# TYPE pulsar_resource_group_aggregate_usage_secs summary
pulsar_resource_group_aggregate_usage_secs{cluster="test",quantile="0.5"} 0.001444776
pulsar_resource_group_aggregate_usage_secs{cluster="test",quantile="0.9"} 0.006127417
pulsar_resource_group_aggregate_usage_secs_count{cluster="test"} 16.0
pulsar_resource_group_aggregate_usage_secs_sum{cluster="test"} 0.07362183700000001
pulsar_resource_group_aggregate_usage_secs_created{cluster="test"} 1.675429354994E9
# TYPE pulsar_ml_cache_pendingreads_matched_included counter
pulsar_ml_cache_pendingreads_matched_included_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_included_created{cluster="test"} 1.675429365162E9
# TYPE pulsar_resource_group_updates counter
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_both counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_both_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_both_created{cluster="test"} 1.675429365162E9
# TYPE pulsar_expiring_token_minutes histogram
pulsar_expiring_token_minutes_bucket{cluster="test",le="5.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="10.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="60.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="240.0"} 0.0
pulsar_expiring_token_minutes_bucket{cluster="test",le="+Inf"} 0.0
pulsar_expiring_token_minutes_count{cluster="test"} 0.0
pulsar_expiring_token_minutes_sum{cluster="test"} 0.0
pulsar_expiring_token_minutes_created{cluster="test"} 1.675430401891E9
# TYPE jvm_classes_currently_loaded gauge
jvm_classes_currently_loaded{cluster="test"} 20487.0
# TYPE jvm_classes_loaded counter
jvm_classes_loaded_total{cluster="test"} 22109.0
# TYPE jvm_classes_unloaded counter
jvm_classes_unloaded_total{cluster="test"} 1622.0
# TYPE pulsar_txn_tp_commit_latency summary
# TYPE pulsar_expired_token counter
pulsar_expired_token_total{cluster="test"} 0.0
pulsar_expired_token_created{cluster="test"} 1.675430401891E9
# TYPE pulsar_resource_group_tenant_unregisters counter
# TYPE pulsar_resource_group_namespace_registers counter
# TYPE pulsar_broker_throttled_connections_global_limit gauge
pulsar_broker_throttled_connections_global_limit{cluster="test"} 0.0
# TYPE pulsar_resource_group_calculated_messages_quota counter
# TYPE pulsar_txn_tp_aborted_count counter
# TYPE pulsar_ml_reads_available_inflight_bytes gauge
pulsar_ml_reads_available_inflight_bytes{cluster="test"} -1.0
# TYPE pulsar_metadata_store_put_bytes counter
pulsar_metadata_store_put_bytes_total{cluster="test",name="configuration-metadata-store"} 2280.0
pulsar_metadata_store_put_bytes_created{cluster="test",name="configuration-metadata-store"} 1.675430399325E9
pulsar_metadata_store_put_bytes_total{cluster="test",name="metadata-store"} 1929.0
pulsar_metadata_store_put_bytes_created{cluster="test",name="metadata-store"} 1.675430399313E9
pulsar_metadata_store_put_bytes_total{cluster="test",name=""} 985.0
pulsar_metadata_store_put_bytes_created{cluster="test",name=""} 1.675430236619E9
# TYPE pulsar_broker_lookup summary
pulsar_broker_lookup{cluster="test",quantile="0.5"} NaN
pulsar_broker_lookup{cluster="test",quantile="0.99"} NaN
pulsar_broker_lookup{cluster="test",quantile="0.999"} NaN
pulsar_broker_lookup{cluster="test",quantile="1.0"} -Inf
pulsar_broker_lookup_count{cluster="test"} 1683.0
pulsar_broker_lookup_sum{cluster="test"} 25494.0
# TYPE pulsar_resource_group_calculated_bytes_quota counter
# TYPE pulsar_broker_throttled_connections gauge
pulsar_broker_throttled_connections{cluster="test"} 0.0
# TYPE brk_ledgeroffloader_read_bytes counter
# TYPE pulsar_resource_group_calculate_quota_secs summary
pulsar_resource_group_calculate_quota_secs{cluster="test",quantile="0.5"} 5.9E-6
pulsar_resource_group_calculate_quota_secs{cluster="test",quantile="0.9"} 1.0401E-5
pulsar_resource_group_calculate_quota_secs_count{cluster="test"} 16.0
pulsar_resource_group_calculate_quota_secs_sum{cluster="test"} 0.010166955
pulsar_resource_group_calculate_quota_secs_created{cluster="test"} 1.675429354994E9
# TYPE pulsar_broker_load_manager_bundle_assigment summary
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.5"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.99"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="0.999"} NaN
pulsar_broker_load_manager_bundle_assigment{cluster="test",quantile="1.0"} NaN
pulsar_broker_load_manager_bundle_assigment_count{cluster="test"} 251.0
pulsar_broker_load_manager_bundle_assigment_sum{cluster="test"} 5154.0
# TYPE pulsar_broker_topic_load_pending_requests gauge
pulsar_broker_topic_load_pending_requests{cluster="test"} 0.0
# TYPE pulsar_txn_tp_committed_count counter
# TYPE pulsar_broker_lookup_answers counter
pulsar_broker_lookup_answers_total{cluster="test"} 1683.0
pulsar_broker_lookup_answers_created{cluster="test"} 1.675429328609E9
# TYPE pulsar_resource_group_namespace_unregisters counter
# TYPE jetty_requests counter
jetty_requests_total{cluster="test"} 9.0
# TYPE jetty_requests_active gauge
jetty_requests_active{cluster="test"} 0.0
# TYPE jetty_requests_active_max gauge
jetty_requests_active_max{cluster="test"} 1.0
# TYPE jetty_request_time_max_seconds gauge
jetty_request_time_max_seconds{cluster="test"} 0.029
# TYPE jetty_request_time_seconds counter
jetty_request_time_seconds_total{cluster="test"} 0.115
# TYPE jetty_dispatched counter
jetty_dispatched_total{cluster="test"} 9.0
# TYPE jetty_dispatched_active gauge
jetty_dispatched_active{cluster="test"} 0.0
# TYPE jetty_dispatched_active_max gauge
jetty_dispatched_active_max{cluster="test"} 1.0
# TYPE jetty_dispatched_time_max gauge
jetty_dispatched_time_max{cluster="test"} 12.0
# TYPE jetty_dispatched_time_seconds counter
jetty_dispatched_time_seconds_total{cluster="test"} 0.045
# TYPE jetty_async_requests counter
jetty_async_requests_total{cluster="test"} 9.0
# TYPE jetty_async_requests_waiting gauge
jetty_async_requests_waiting{cluster="test"} 0.0
# TYPE jetty_async_requests_waiting_max gauge
jetty_async_requests_waiting_max{cluster="test"} 1.0
# TYPE jetty_async_dispatches counter
jetty_async_dispatches_total{cluster="test"} 0.0
# TYPE jetty_expires counter
jetty_expires_total{cluster="test"} 0.0
# TYPE jetty_responses counter
jetty_responses_total{cluster="test",code="1xx"} 0.0
jetty_responses_total{cluster="test",code="2xx"} 9.0
jetty_responses_total{cluster="test",code="3xx"} 0.0
jetty_responses_total{cluster="test",code="4xx"} 0.0
jetty_responses_total{cluster="test",code="5xx"} 0.0
# TYPE jetty_stats_seconds gauge
jetty_stats_seconds{cluster="test"} 0.616
# TYPE jetty_responses_bytes counter
jetty_responses_bytes_total{cluster="test"} 498.0
# TYPE pulsar_broker_lookup_redirects counter
pulsar_broker_lookup_redirects_total{cluster="test"} 0.0
pulsar_broker_lookup_redirects_created{cluster="test"} 1.675429328609E9
# TYPE jvm_info gauge
jvm_info{cluster="test",runtime="OpenJDK Runtime Environment",vendor="Eclipse Adoptium",version="17.0.6+10"} 1.0
# TYPE pulsar_metadata_store_ops_latency_ms histogram
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="del",status="fail"} 1.675430399313E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="put",status="fail"} 1.675430399325E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="del",status="success"} 1.675430399313E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="get",status="fail"} 1.675430399325E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="get",status="fail"} 1.675430236619E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="del",status="fail"} 1.675430399325E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="1.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="3.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="5.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="10.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="20.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="50.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="100.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="200.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="500.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="1000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="2000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="5000.0"} 7.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="get",status="success",le="+Inf"} 7.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="get",status="success"} 7.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="get",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="get",status="success"} 1.675430236619E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="put",status="fail"} 1.675430236619E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="3.0"} 4.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="5.0"} 13.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="10.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="20.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="50.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="100.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="200.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="500.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="1000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="2000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="5000.0"} 16.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="get",status="success",le="+Inf"} 16.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="get",status="success"} 16.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="get",status="success"} 70.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="get",status="success"} 1.675430399325E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="del",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="del",status="fail"} 1.675430236619E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="put",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="put",status="fail"} 1.675430399313E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="1.0"} 1.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="3.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="5.0"} 27.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="10.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="20.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="50.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="100.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="200.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="500.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="1000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="2000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="5000.0"} 28.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="success",le="+Inf"} 28.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="get",status="success"} 28.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="get",status="success"} 124.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="get",status="success"} 1.675430399313E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="get",status="fail",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="get",status="fail"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="get",status="fail"} 1.675430399313E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="del",status="success"} 1.675430236619E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="1.0"} 4.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="3.0"} 10.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="5.0"} 14.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="10.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="20.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="50.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="100.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="200.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="500.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="1000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="2000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="5000.0"} 15.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="metadata-store",type="put",status="success",le="+Inf"} 15.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="metadata-store",type="put",status="success"} 15.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="metadata-store",type="put",status="success"} 41.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="metadata-store",type="put",status="success"} 1.675430399313E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="1.0"} 49.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="3.0"} 51.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="5.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="10.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="20.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="50.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="100.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="200.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="500.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="1000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="2000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="5000.0"} 52.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="",type="put",status="success",le="+Inf"} 52.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="",type="put",status="success"} 52.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="",type="put",status="success"} 9.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="",type="put",status="success"} 1.675430236619E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="1.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="3.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="5.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="10.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="20.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="50.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="100.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="200.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="500.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="1000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="2000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="5000.0"} 0.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="del",status="success",le="+Inf"} 0.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="del",status="success"} 0.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="del",status="success"} 1.675430399325E9
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="1.0"} 3.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="3.0"} 4.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="5.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="10.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="20.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="50.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="100.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="200.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="500.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="1000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="2000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="5000.0"} 5.0
pulsar_metadata_store_ops_latency_ms_bucket{cluster="test",name="configuration-metadata-store",type="put",status="success",le="+Inf"} 5.0
pulsar_metadata_store_ops_latency_ms_count{cluster="test",name="configuration-metadata-store",type="put",status="success"} 5.0
pulsar_metadata_store_ops_latency_ms_sum{cluster="test",name="configuration-metadata-store",type="put",status="success"} 8.0
pulsar_metadata_store_ops_latency_ms_created{cluster="test",name="configuration-metadata-store",type="put",status="success"} 1.675430399325E9
# TYPE pulsar_batch_metadata_store_executor_queue_size gauge
pulsar_batch_metadata_store_executor_queue_size{cluster="test",name="configuration-metadata-store"} 1.0
pulsar_batch_metadata_store_executor_queue_size{cluster="test",name="metadata-store"} 1.0
# TYPE brk_ledgeroffloader_delete_offload_ops counter
# TYPE caffeine_cache_hit counter
caffeine_cache_hit_total{cluster="test",cache="owned-bundles"} 5.0
caffeine_cache_hit_total{cluster="test",cache="bundles"} 5.0
# TYPE caffeine_cache_miss counter
caffeine_cache_miss_total{cluster="test",cache="owned-bundles"} 4.0
caffeine_cache_miss_total{cluster="test",cache="bundles"} 4.0
# TYPE caffeine_cache_requests counter
caffeine_cache_requests_total{cluster="test",cache="owned-bundles"} 9.0
caffeine_cache_requests_total{cluster="test",cache="bundles"} 9.0
# TYPE caffeine_cache_eviction counter
caffeine_cache_eviction_total{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_eviction_total{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_eviction_weight gauge
caffeine_cache_eviction_weight{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_eviction_weight{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_load_failure counter
caffeine_cache_load_failure_total{cluster="test",cache="owned-bundles"} 0.0
caffeine_cache_load_failure_total{cluster="test",cache="bundles"} 0.0
# TYPE caffeine_cache_loads counter
caffeine_cache_loads_total{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_loads_total{cluster="test",cache="bundles"} 4.0
# TYPE caffeine_cache_estimated_size gauge
caffeine_cache_estimated_size{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_estimated_size{cluster="test",cache="bundles"} 3.0
# TYPE caffeine_cache_load_duration_seconds summary
caffeine_cache_load_duration_seconds_count{cluster="test",cache="owned-bundles"} 3.0
caffeine_cache_load_duration_seconds_sum{cluster="test",cache="owned-bundles"} 0.005189774
caffeine_cache_load_duration_seconds_count{cluster="test",cache="bundles"} 4.0
caffeine_cache_load_duration_seconds_sum{cluster="test",cache="bundles"} 0.023504239
# TYPE pulsar_ml_cache_pendingreads_entries_notread counter
pulsar_ml_cache_pendingreads_entries_notread_total{cluster="test"} 330.0
pulsar_ml_cache_pendingreads_entries_notread_created{cluster="test"} 1.675429365162E9
# TYPE pulsar_replicated_subscriptions_pending_snapshots gauge
pulsar_replicated_subscriptions_pending_snapshots{cluster="test"} 0.0
# TYPE pulsar_ml_cache_pendingreads_entries_read counter
pulsar_ml_cache_pendingreads_entries_read_total{cluster="test"} 13890.0
pulsar_ml_cache_pendingreads_entries_read_created{cluster="test"} 1.675429365162E9
# TYPE jvm_memory_pool_allocated_bytes counter
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'profiled nmethods'"} 6.88668096E9
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'profiled nmethods'"} 1.675429807871E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="ZHeap"} 6.628048896E10
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="ZHeap"} 1.675429807871E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 3.198797568E9
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 1.675429807871E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="Compressed Class Space"} 1.699789744E9
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="Compressed Class Space"} 1.675429807871E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="Metaspace"} 1.5221152776E10
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="Metaspace"} 1.675429807871E9
jvm_memory_pool_allocated_bytes_total{cluster="test",pool="CodeHeap 'non-nmethods'"} 3.0562368E8
jvm_memory_pool_allocated_bytes_created{cluster="test",pool="CodeHeap 'non-nmethods'"} 1.675429807871E9
# TYPE pulsar_broker_lookup_failures counter
pulsar_broker_lookup_failures_total{cluster="test"} 10.0
pulsar_broker_lookup_failures_created{cluster="test"} 1.675429328609E9
# TYPE pulsar_batch_metadata_store_queue_wait_time_ms histogram
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 4.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_count{cluster="test",name="configuration-metadata-store"} 24.0
pulsar_batch_metadata_store_queue_wait_time_ms_sum{cluster="test",name="configuration-metadata-store"} 77.0
pulsar_batch_metadata_store_queue_wait_time_ms_created{cluster="test",name="configuration-metadata-store"} 1.675430399334E9
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="1.0"} 6.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="5.0"} 47.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="10.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="20.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="50.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="100.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="200.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="500.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="1000.0"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_bucket{cluster="test",name="metadata-store",le="+Inf"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_count{cluster="test",name="metadata-store"} 48.0
pulsar_batch_metadata_store_queue_wait_time_ms_sum{cluster="test",name="metadata-store"} 180.0
pulsar_batch_metadata_store_queue_wait_time_ms_created{cluster="test",name="metadata-store"} 1.675430399318E9
# TYPE jvm_memory_objects_pending_finalization gauge
jvm_memory_objects_pending_finalization{cluster="test"} 0.0
# TYPE jvm_memory_bytes_used gauge
jvm_memory_bytes_used{cluster="test",area="heap"} 7.38197504E8
jvm_memory_bytes_used{cluster="test",area="nonheap"} 2.27789552E8
# TYPE jvm_memory_bytes_committed gauge
jvm_memory_bytes_committed{cluster="test",area="heap"} 1.073741824E9
jvm_memory_bytes_committed{cluster="test",area="nonheap"} 2.3166976E8
# TYPE jvm_memory_bytes_max gauge
jvm_memory_bytes_max{cluster="test",area="heap"} 1.073741824E9
jvm_memory_bytes_max{cluster="test",area="nonheap"} -1.0
# TYPE jvm_memory_bytes_init gauge
jvm_memory_bytes_init{cluster="test",area="heap"} 1.1534336E8
jvm_memory_bytes_init{cluster="test",area="nonheap"} 7667712.0
# TYPE jvm_memory_pool_bytes_used gauge
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'non-nmethods'"} 2367872.0
jvm_memory_pool_bytes_used{cluster="test",pool="Metaspace"} 1.21359736E8
jvm_memory_pool_bytes_used{cluster="test",pool="ZHeap"} 7.38197504E8
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'profiled nmethods'"} 6.1237632E7
jvm_memory_pool_bytes_used{cluster="test",pool="Compressed Class Space"} 1.3324664E7
jvm_memory_pool_bytes_used{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2.9499648E7
# TYPE jvm_memory_pool_bytes_committed gauge
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'non-nmethods'"} 2555904.0
jvm_memory_pool_bytes_committed{cluster="test",pool="Metaspace"} 1.23338752E8
jvm_memory_pool_bytes_committed{cluster="test",pool="ZHeap"} 1.073741824E9
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'profiled nmethods'"} 6.1734912E7
jvm_memory_pool_bytes_committed{cluster="test",pool="Compressed Class Space"} 1.4483456E7
jvm_memory_pool_bytes_committed{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2.9556736E7
# TYPE jvm_memory_pool_bytes_max gauge
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'non-nmethods'"} 5828608.0
jvm_memory_pool_bytes_max{cluster="test",pool="Metaspace"} -1.0
jvm_memory_pool_bytes_max{cluster="test",pool="ZHeap"} 1.073741824E9
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'profiled nmethods'"} 1.22912768E8
jvm_memory_pool_bytes_max{cluster="test",pool="Compressed Class Space"} 1.073741824E9
jvm_memory_pool_bytes_max{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 1.22916864E8
# TYPE jvm_memory_pool_bytes_init gauge
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'non-nmethods'"} 2555904.0
jvm_memory_pool_bytes_init{cluster="test",pool="Metaspace"} 0.0
jvm_memory_pool_bytes_init{cluster="test",pool="ZHeap"} 8388608.0
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'profiled nmethods'"} 2555904.0
jvm_memory_pool_bytes_init{cluster="test",pool="Compressed Class Space"} 0.0
jvm_memory_pool_bytes_init{cluster="test",pool="CodeHeap 'non-profiled nmethods'"} 2555904.0
# TYPE jvm_memory_pool_collection_used_bytes gauge
jvm_memory_pool_collection_used_bytes{cluster="test",pool="ZHeap"} 5.93494016E8
# TYPE jvm_memory_pool_collection_committed_bytes gauge
jvm_memory_pool_collection_committed_bytes{cluster="test",pool="ZHeap"} 1.073741824E9
# TYPE jvm_memory_pool_collection_max_bytes gauge
jvm_memory_pool_collection_max_bytes{cluster="test",pool="ZHeap"} 1.073741824E9
# TYPE jvm_memory_pool_collection_init_bytes gauge
jvm_memory_pool_collection_init_bytes{cluster="test",pool="ZHeap"} 8388608.0
# TYPE pulsar_batch_metadata_store_batch_execute_time_ms histogram
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 15.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_count{cluster="test",name="configuration-metadata-store"} 17.0
pulsar_batch_metadata_store_batch_execute_time_ms_sum{cluster="test",name="configuration-metadata-store"} 16.0
pulsar_batch_metadata_store_batch_execute_time_ms_created{cluster="test",name="configuration-metadata-store"} 1.675430399334E9
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="1.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="5.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="10.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="20.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="50.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="100.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="200.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="500.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="1000.0"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_bucket{cluster="test",name="metadata-store",le="+Inf"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_count{cluster="test",name="metadata-store"} 37.0
pulsar_batch_metadata_store_batch_execute_time_ms_sum{cluster="test",name="metadata-store"} 2.0
pulsar_batch_metadata_store_batch_execute_time_ms_created{cluster="test",name="metadata-store"} 1.675430399318E9
# TYPE jvm_memory_direct_bytes_max gauge
jvm_memory_direct_bytes_max{cluster="test"} 1.073741824E9
# TYPE topic_load_times summary
topic_load_times{cluster="test",quantile="0.5"} NaN
topic_load_times{cluster="test",quantile="0.75"} NaN
topic_load_times{cluster="test",quantile="0.95"} NaN
topic_load_times{cluster="test",quantile="0.99"} NaN
topic_load_times{cluster="test",quantile="0.999"} NaN
topic_load_times{cluster="test",quantile="0.9999"} NaN
topic_load_times_count{cluster="test"} 0.0
topic_load_times_sum{cluster="test"} 0.0
topic_load_times_created{cluster="test"} 1.675429391623E9
# TYPE pulsar_ml_cache_pendingreads_matched counter
pulsar_ml_cache_pendingreads_matched_total{cluster="test"} 330.0
pulsar_ml_cache_pendingreads_matched_created{cluster="test"} 1.675429365162E9
# TYPE pulsar_batch_metadata_store_batch_size histogram
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="1.0"} 11.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="5.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="10.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="20.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="50.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="100.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="200.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="500.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="1000.0"} 17.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="configuration-metadata-store",le="+Inf"} 17.0
pulsar_batch_metadata_store_batch_size_count{cluster="test",name="configuration-metadata-store"} 17.0
pulsar_batch_metadata_store_batch_size_sum{cluster="test",name="configuration-metadata-store"} 24.0
pulsar_batch_metadata_store_batch_size_created{cluster="test",name="configuration-metadata-store"} 1.675430399334E9
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="1.0"} 30.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="5.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="10.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="20.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="50.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="100.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="200.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="500.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="1000.0"} 37.0
pulsar_batch_metadata_store_batch_size_bucket{cluster="test",name="metadata-store",le="+Inf"} 37.0
pulsar_batch_metadata_store_batch_size_count{cluster="test",name="metadata-store"} 37.0
pulsar_batch_metadata_store_batch_size_sum{cluster="test",name="metadata-store"} 48.0
pulsar_batch_metadata_store_batch_size_created{cluster="test",name="metadata-store"} 1.675430399318E9
# TYPE pulsar_ml_reads_inflight_bytes gauge
pulsar_ml_reads_inflight_bytes{cluster="test"} -1.0
# TYPE pulsar_broker_pending_bytes_to_dispatch gauge
pulsar_broker_pending_bytes_to_dispatch{cluster="test"} 0.0
# TYPE jvm_gc_collection_seconds summary
jvm_gc_collection_seconds_count{cluster="test",gc="ZGC Cycles"} 226.0
jvm_gc_collection_seconds_sum{cluster="test",gc="ZGC Cycles"} 243.634
jvm_gc_collection_seconds_count{cluster="test",gc="ZGC Pauses"} 680.0
jvm_gc_collection_seconds_sum{cluster="test",gc="ZGC Pauses"} 0.013
# TYPE jvm_buffer_pool_used_bytes gauge
jvm_buffer_pool_used_bytes{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_used_bytes{cluster="test",pool="direct"} 1.7392057E7
jvm_buffer_pool_used_bytes{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE jvm_buffer_pool_capacity_bytes gauge
jvm_buffer_pool_capacity_bytes{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_capacity_bytes{cluster="test",pool="direct"} 1.7392056E7
jvm_buffer_pool_capacity_bytes{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE jvm_buffer_pool_used_buffers gauge
jvm_buffer_pool_used_buffers{cluster="test",pool="mapped"} 0.0
jvm_buffer_pool_used_buffers{cluster="test",pool="direct"} 186.0
jvm_buffer_pool_used_buffers{cluster="test",pool="mapped - 'non-volatile memory'"} 0.0
# TYPE pulsar_resource_group_bytes_used counter
# TYPE pulsar_broker_publish_latency summary
pulsar_broker_publish_latency{cluster="test",quantile="0.0"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.5"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.95"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.99"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.999"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="0.9999"} NaN
pulsar_broker_publish_latency{cluster="test",quantile="1.0"} NaN
pulsar_broker_publish_latency_count{cluster="test"} 19756.0
pulsar_broker_publish_latency_sum{cluster="test"} 3302721.0
# TYPE jvm_memory_direct_bytes_used gauge
jvm_memory_direct_bytes_used{cluster="test"} 1.7392057E7
# TYPE pulsar_version_info gauge
pulsar_version_info{cluster="test",version="2.12.0-SNAPSHOT",commit="840a096c88081c42b056806b30b46b9c8dc9bebe"} 1.0
# TYPE pulsar_ml_cache_pendingreads_matched_overlapping_miss_right counter
pulsar_ml_cache_pendingreads_matched_overlapping_miss_right_total{cluster="test"} 0.0
pulsar_ml_cache_pendingreads_matched_overlapping_miss_right_created{cluster="test"} 1.675429365162E9
# TYPE process_cpu_seconds counter
process_cpu_seconds_total{cluster="test"} 432.09
# TYPE process_start_time_seconds gauge
process_start_time_seconds{cluster="test"} 1.675429290256E9
# TYPE process_open_fds gauge
process_open_fds{cluster="test"} 546.0
# TYPE process_max_fds gauge
process_max_fds{cluster="test"} 65536.0
# TYPE process_virtual_memory_bytes gauge
process_virtual_memory_bytes{cluster="test"} 6.3182516224E10
# TYPE process_resident_memory_bytes gauge
process_resident_memory_bytes{cluster="test"} 3.405770752E9
# TYPE pulsar_storage_write_latency_le_200 gauge
pulsar_storage_write_latency_le_200{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_16_kb gauge
pulsar_entry_size_le_16_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_logical_size gauge
pulsar_storage_logical_size{cluster="test"} 0
pulsar_storage_logical_size{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_le_1_mb gauge
pulsar_entry_size_le_1_mb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_producers_count gauge
pulsar_producers_count{cluster="test"} 0
pulsar_producers_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_rate_out gauge
pulsar_rate_out{cluster="test"} 0
pulsar_rate_out{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_storage_ledger_write_latency_sum gauge
pulsar_storage_ledger_write_latency_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_200 gauge
pulsar_storage_ledger_write_latency_le_200{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_consumer_msg_ack_rate gauge
pulsar_consumer_msg_ack_rate{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_1 gauge
pulsar_storage_ledger_write_latency_le_1{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_1000 gauge
pulsar_storage_ledger_write_latency_le_1000{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_2_kb gauge
pulsar_entry_size_le_2_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_20 gauge
pulsar_storage_ledger_write_latency_le_20{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_50 gauge
pulsar_storage_write_latency_le_50{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_5 gauge
pulsar_storage_write_latency_le_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_delayed_message_index_size_bytes gauge
pulsar_delayed_message_index_size_bytes{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_size gauge
pulsar_storage_size{cluster="test"} 0
pulsar_storage_size{cluster="test",namespace="prop/ns-abc1"} 15600
# TYPE pulsar_storage_write_latency_le_10 gauge
pulsar_storage_write_latency_le_10{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_throughput_in gauge
pulsar_throughput_in{cluster="test"} 0
pulsar_throughput_in{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_storage_write_latency_le_1 gauge
pulsar_storage_write_latency_le_1{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_in_bytes_total gauge
pulsar_in_bytes_total{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_le_128 gauge
pulsar_entry_size_le_128{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_rate_in gauge
pulsar_rate_in{cluster="test"} 0
pulsar_rate_in{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_txn_tb_aborted_total gauge
pulsar_txn_tb_aborted_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_100_kb gauge
pulsar_entry_size_le_100_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_throughput_out gauge
pulsar_throughput_out{cluster="test"} 0
pulsar_throughput_out{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_topics_count gauge
pulsar_topics_count{cluster="test"} 0
pulsar_topics_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_storage_read_rate gauge
pulsar_storage_read_rate{cluster="test"} 0
pulsar_storage_read_rate{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_in_messages_total gauge
pulsar_in_messages_total{cluster="test",namespace="prop/ns-abc1"} 100
# TYPE pulsar_storage_write_latency_count gauge
pulsar_storage_write_latency_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_le_1_kb gauge
pulsar_entry_size_le_1_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_10 gauge
pulsar_storage_ledger_write_latency_le_10{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_100 gauge
pulsar_storage_write_latency_le_100{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_50 gauge
pulsar_storage_ledger_write_latency_le_50{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_overflow gauge
pulsar_storage_ledger_write_latency_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_1000 gauge
pulsar_storage_write_latency_le_1000{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_20 gauge
pulsar_storage_write_latency_le_20{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_sum gauge
pulsar_storage_write_latency_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_0_5 gauge
pulsar_storage_ledger_write_latency_le_0_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_le_0_5 gauge
pulsar_storage_write_latency_le_0_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_entry_size_count gauge
pulsar_entry_size_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_100 gauge
pulsar_storage_ledger_write_latency_le_100{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_out_messages_total gauge
pulsar_out_messages_total{cluster="test",namespace="prop/ns-abc1"} 100
# TYPE pulsar_entry_size_le_overflow gauge
pulsar_entry_size_le_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_subscription_delayed gauge
pulsar_subscription_delayed{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_le_5 gauge
pulsar_storage_ledger_write_latency_le_5{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_rate gauge
pulsar_storage_write_rate{cluster="test"} 0
pulsar_storage_write_rate{cluster="test",namespace="prop/ns-abc1"} 0.0
# TYPE pulsar_msg_backlog gauge
pulsar_msg_backlog{cluster="test"} 0
pulsar_msg_backlog{cluster="test",namespace="prop/ns-abc1",remote_cluster="local"} 100
# TYPE pulsar_subscriptions_count gauge
pulsar_subscriptions_count{cluster="test"} 0
pulsar_subscriptions_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_entry_size_le_4_kb gauge
pulsar_entry_size_le_4_kb{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_ledger_write_latency_count gauge
pulsar_storage_ledger_write_latency_count{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_txn_tb_active_total gauge
pulsar_txn_tb_active_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_backlog_size gauge
pulsar_storage_backlog_size{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_txn_tb_committed_total gauge
pulsar_txn_tb_committed_total{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_consumers_count gauge
pulsar_consumers_count{cluster="test"} 0
pulsar_consumers_count{cluster="test",namespace="prop/ns-abc1"} 1
# TYPE pulsar_entry_size_le_512 gauge
pulsar_entry_size_le_512{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_out_bytes_total gauge
pulsar_out_bytes_total{cluster="test",namespace="prop/ns-abc1"} 7800
# TYPE pulsar_entry_size_sum gauge
pulsar_entry_size_sum{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_offloaded_size gauge
pulsar_storage_offloaded_size{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_storage_write_latency_overflow gauge
pulsar_storage_write_latency_overflow{cluster="test",namespace="prop/ns-abc1"} 0
# TYPE pulsar_ml_cache_entries gauge
pulsar_ml_cache_entries{cluster="test"} 0
# TYPE pulsar_ml_cache_evicted_entries_total gauge
pulsar_ml_cache_evicted_entries_total{cluster="test"} 100
# TYPE pulsar_ml_cache_evictions gauge
pulsar_ml_cache_evictions{cluster="test"} 0
# TYPE pulsar_ml_cache_hits_rate gauge
pulsar_ml_cache_hits_rate{cluster="test"} 0.0
# TYPE pulsar_ml_cache_hits_throughput gauge
pulsar_ml_cache_hits_throughput{cluster="test"} 0.0
# TYPE pulsar_ml_cache_inserted_entries_total gauge
pulsar_ml_cache_inserted_entries_total{cluster="test"} 100
# TYPE pulsar_ml_cache_misses_rate gauge
pulsar_ml_cache_misses_rate{cluster="test"} 0.0
# TYPE pulsar_ml_cache_misses_throughput gauge
pulsar_ml_cache_misses_throughput{cluster="test"} 0.0
# TYPE pulsar_ml_cache_pool_active_allocations gauge
pulsar_ml_cache_pool_active_allocations{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_huge gauge
pulsar_ml_cache_pool_active_allocations_huge{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_normal gauge
pulsar_ml_cache_pool_active_allocations_normal{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_active_allocations_small gauge
pulsar_ml_cache_pool_active_allocations_small{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_allocated gauge
pulsar_ml_cache_pool_allocated{cluster="test"} 0
# TYPE pulsar_ml_cache_pool_used gauge
pulsar_ml_cache_pool_used{cluster="test"} 0
# TYPE pulsar_ml_cache_used_size gauge
pulsar_ml_cache_used_size{cluster="test"} 0
# TYPE pulsar_ml_count gauge
pulsar_ml_count{cluster="test"} 1
# TYPE pulsar_ml_AddEntryBytesRate gauge
pulsar_ml_AddEntryBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryErrors gauge
pulsar_ml_AddEntryErrors{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryLatencyBuckets gauge
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_AddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_AddEntryLatencyBuckets_OVERFLOW gauge
pulsar_ml_AddEntryLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryMessagesRate gauge
pulsar_ml_AddEntryMessagesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntrySucceed gauge
pulsar_ml_AddEntrySucceed{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_AddEntryWithReplicasBytesRate gauge
pulsar_ml_AddEntryWithReplicasBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_EntrySizeBuckets gauge
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_128.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1024.0_2048.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="102400.0_1048576.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="128.0_512.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="16384.0_102400.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="2048.0_4096.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="4096.0_16384.0"} 0.0
pulsar_ml_EntrySizeBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="512.0_1024.0"} 0.0
# TYPE pulsar_ml_EntrySizeBuckets_OVERFLOW gauge
pulsar_ml_EntrySizeBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_LedgerAddEntryLatencyBuckets gauge
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_LedgerAddEntryLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_LedgerAddEntryLatencyBuckets_OVERFLOW gauge
pulsar_ml_LedgerAddEntryLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_LedgerSwitchLatencyBuckets gauge
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.0_0.5"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="0.5_1.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="1.0_5.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="10.0_20.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="100.0_200.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="20.0_50.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="200.0_1000.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="5.0_10.0"} 0.0
pulsar_ml_LedgerSwitchLatencyBuckets{cluster="test", namespace="prop/ns-abc1/persistent", quantile="50.0_100.0"} 0.0
# TYPE pulsar_ml_LedgerSwitchLatencyBuckets_OVERFLOW gauge
pulsar_ml_LedgerSwitchLatencyBuckets_OVERFLOW{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_MarkDeleteRate gauge
pulsar_ml_MarkDeleteRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_NumberOfMessagesInBacklog gauge
pulsar_ml_NumberOfMessagesInBacklog{cluster="test", namespace="prop/ns-abc1/persistent"} 100.0
# TYPE pulsar_ml_ReadEntriesBytesRate gauge
pulsar_ml_ReadEntriesBytesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesErrors gauge
pulsar_ml_ReadEntriesErrors{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesRate gauge
pulsar_ml_ReadEntriesRate{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_ReadEntriesSucceeded gauge
pulsar_ml_ReadEntriesSucceeded{cluster="test", namespace="prop/ns-abc1/persistent"} 0.0
# TYPE pulsar_ml_StoredMessagesSize gauge
pulsar_ml_StoredMessagesSize{cluster="test", namespace="prop/ns-abc1/persistent"} 15600.0
# TYPE pulsar_active_connections gauge
pulsar_active_connections{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_connection_closed_total_count gauge
pulsar_connection_closed_total_count{cluster="test", broker="localhost", metric="broker_connection"} 0
# TYPE pulsar_connection_create_fail_count gauge
pulsar_connection_create_fail_count{cluster="test", broker="localhost", metric="broker_connection"} 0
# TYPE pulsar_connection_create_success_count gauge
pulsar_connection_create_success_count{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_connection_created_total_count gauge
pulsar_connection_created_total_count{cluster="test", broker="localhost", metric="broker_connection"} 1
# TYPE pulsar_lb_bandwidth_in_usage gauge
pulsar_lb_bandwidth_in_usage{cluster="test", broker="localhost", metric="loadBalancing"} 0.0
# TYPE pulsar_lb_bandwidth_out_usage gauge
pulsar_lb_bandwidth_out_usage{cluster="test", broker="localhost", metric="loadBalancing"} 0.0
# TYPE pulsar_lb_cpu_usage gauge
pulsar_lb_cpu_usage{cluster="test", broker="localhost", metric="loadBalancing"} 6.058184E-5
# TYPE pulsar_lb_directMemory_usage gauge
pulsar_lb_directMemory_usage{cluster="test", broker="localhost", metric="loadBalancing"} 1.5625
# TYPE pulsar_lb_memory_usage gauge
pulsar_lb_memory_usage{cluster="test", broker="localhost", metric="loadBalancing"} 65.82031
# TYPE pulsar_lb_bundles_split_total gauge
pulsar_lb_bundles_split_total{cluster="test", metric="bundlesSplit"} 0
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_max_queue_size gauge
pulsar_managedLedger_client_bookkeeper_ml_scheduler_max_queue_size{cluster="test"} -1
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_threads gauge
pulsar_managedLedger_client_bookkeeper_ml_scheduler_threads{cluster="test"} 2
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_completed_tasks gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_completed_tasks{cluster="test"} 16
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_queue gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_queue{cluster="test"} 1
# TYPE pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_total_tasks gauge
pulsar_managedLedger_client_thread_0_bookkeeper_ml_scheduler_total_tasks{cluster="test"} 17
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_completed_tasks gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_completed_tasks{cluster="test"} 11
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_queue gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_queue{cluster="test"} 3
# TYPE pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_total_tasks gauge
pulsar_managedLedger_client_thread_1_bookkeeper_ml_scheduler_total_tasks{cluster="test"} 14
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution summary
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.5"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.75"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.95"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.99"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="0.9999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="false", quantile="1.0"} -Infinity
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_count{cluster="test", success="false"} 0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_sum{cluster="test", success="false"} 0.0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.5"} 0.089
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.75"} 0.089
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.95"} 0.089
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.99"} 0.089
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.999"} 0.089
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="0.9999"} 0.089
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution{cluster="test", success="true", quantile="1.0"} 0.089
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_count{cluster="test", success="true"} 25
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_execution_sum{cluster="test", success="true"} 3.0
# TYPE pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued summary
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.5"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.75"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.95"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.99"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="0.9999"} NaN
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="false", quantile="1.0"} -Infinity
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_count{cluster="test", success="false"} 0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_sum{cluster="test", success="false"} 0.0
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.5"} 0.328
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.75"} 0.328
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.95"} 0.328
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.99"} 0.328
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.999"} 0.328
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="0.9999"} 0.328
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued{cluster="test", success="true", quantile="1.0"} 0.328
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_count{cluster="test", success="true"} 25
pulsar_managedLedger_client_bookkeeper_ml_scheduler_task_queued_sum{cluster="test", success="true"} 190.0

 expected object to not be null
	at org.testng.Assert.fail(Assert.java:110)
	at org.testng.Assert.assertNotNull(Assert.java:1319)
	at org.apache.pulsar.broker.stats.MetadataStoreStatsTest.testMetadataStoreStats(MetadataStoreStatsTest.java:113)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:568)
	at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:139)
	at org.testng.internal.invokers.InvokeMethodRunnable.runOne(InvokeMethodRunnable.java:47)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:76)
	at org.testng.internal.invokers.InvokeMethodRunnable.call(InvokeMethodRunnable.java:11)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)

</pre></code>
</details>

