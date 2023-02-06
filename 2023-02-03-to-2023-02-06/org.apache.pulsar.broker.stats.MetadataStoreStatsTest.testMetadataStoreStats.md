        
Flaky-test: org.apache.pulsar.broker.stats.MetadataStoreStatsTest.testMetadataStoreStats
Number of failures: 1

org.apache.pulsar.broker.stats.MetadataStoreStatsTest is flaky. The testMetadataStoreStats test method fails sporadically.

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

