package com.rawnq.kafka_integration.service;

import com.rawnq.kafka_integration.schema.MyEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class KafkaProducer {

    private static final String TOPIC = "in.dev.rawnq.core";

    private final KafkaTemplate<String, MyEvent> kafkaTemplate;

    public void publish(MyEvent event) {
        String key = event.getKey();
        kafkaTemplate.send(TOPIC, key, event);
        log.info("Message published {}", event);
    }
}
