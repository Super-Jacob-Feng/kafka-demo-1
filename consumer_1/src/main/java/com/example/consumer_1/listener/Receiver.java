package com.example.consumer_1.listener;

import java.util.concurrent.CountDownLatch;

import org.springframework.kafka.annotation.KafkaListener;

public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public CountDownLatch getLatch() {
        return latch;
    }

    @KafkaListener(topics = "CollaborationTopic")
    public void collaborationTopicReceive(String message) {
        System.out.println("receive message from CollaborationTopic: " + message);
        latch.countDown();
    }

}
