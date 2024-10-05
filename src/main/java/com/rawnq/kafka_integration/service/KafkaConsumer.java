package com.rawnq.kafka_integration.service;

import com.rawnq.kafka_integration.schema.MyEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class KafkaConsumer {

    private static final String TOPIC = "in.dev.rawnq.core";

    @KafkaListener(topics = TOPIC, groupId = "rawnq")
    public void eventListener(MyEvent event) {
        log.info("Event received: {}", event);
    }
}
