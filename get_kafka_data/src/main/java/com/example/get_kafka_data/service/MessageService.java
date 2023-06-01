package com.example.get_kafka_data.service;

import com.example.get_kafka_data.pojo.Message;
import org.springframework.stereotype.Service;

public interface MessageService {
    public boolean sendMessage(Message message);
}
