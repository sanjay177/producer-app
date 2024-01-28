package com.sr.basic.boot.spring.schedular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ProducerScheduler {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Scheduled(fixedRate = 10000)
    private void generateMessageJob(){
        System.out.println("Generate Message for Kafka");
        sendMessage("Generate Message for Kafka From Topic", "spring-boot-custom");
    }

    public void sendMessage(String msg, String topicName) {
        kafkaTemplate.send(topicName, msg);
    }
}
