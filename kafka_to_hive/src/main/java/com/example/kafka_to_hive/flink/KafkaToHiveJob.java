package com.example.kafka_to_hive.flink;

import jakarta.annotation.Resource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.EnvironmentSettings;
import org.apache.flink.table.api.TableEnvironment;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.Properties;

public class KafkaToHiveJob {
    StreamExecutionEnvironment environment = StreamExecutionEnvironment.getExecutionEnvironment();
    EnvironmentSettings settings = EnvironmentSettings.newInstance().inStreamingMode().build();
    TableEnvironment tableEnvironment = TableEnvironment.create(settings);
    String kafkaBootstrapServers = "localhost:9092";
    String kafkaTopic = "topic";
    Properties properties = new Properties();
    

}
