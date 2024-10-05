package com.rawnq.kafka_integration;

import com.rawnq.kafka_integration.boot.KafkaIntegrationApplication;
import org.springframework.boot.SpringApplication;

public class TestKafkaIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.from(KafkaIntegrationApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
