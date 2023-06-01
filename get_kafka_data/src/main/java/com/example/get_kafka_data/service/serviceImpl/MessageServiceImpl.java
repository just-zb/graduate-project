package com.example.get_kafka_data.service.serviceImpl;

import com.example.get_kafka_data.pojo.Message;
import com.example.get_kafka_data.service.MessageService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jakarta.annotation.Resource;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class MessageServiceImpl implements MessageService {
    @Resource
    private KafkaTemplate<String,String> kafkaTemplate;

    private static final Gson gson = new GsonBuilder().create();
    @Override
    public boolean sendMessage(Message message) {
        kafkaTemplate.send("topic",gson.toJson(message));
        return true;
    }
}
