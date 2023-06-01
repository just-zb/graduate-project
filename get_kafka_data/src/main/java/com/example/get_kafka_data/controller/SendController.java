package com.example.get_kafka_data.controller;

import com.example.get_kafka_data.pojo.Message;
import com.example.get_kafka_data.service.MessageService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/kafka")
public class SendController {
    @Resource
    MessageService messageService;
    @PostMapping("/send")
    String send(@RequestBody Message message){
        //对message对象进行处理
        boolean bool = messageService.sendMessage(message);
        if (bool){
            return "{\"code\":0}";
        }
        return "{\"code\":1}";

    }
}
