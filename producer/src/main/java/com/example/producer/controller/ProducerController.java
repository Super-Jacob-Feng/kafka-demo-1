package com.example.producer.controller;

import com.example.producer.model.SendBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/send")
    public String post(@RequestBody SendBody sendBody) {
        kafkaTemplate.send(sendBody.getTopic(), sendBody.getMessage());
        return "Published successfully";
    }

}
