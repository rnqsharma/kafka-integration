package com.rawnq.kafka_integration.boot;

import com.rawnq.kafka_integration.schema.MyEvent;
import com.rawnq.kafka_integration.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.rawnq.kafka_integration")
public class KafkaIntegrationApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(KafkaIntegrationApplication.class, args);
		KafkaProducer producer = applicationContext.getBean(KafkaProducer.class);

		MyEvent event = new MyEvent();
		event.setKey("Key - 1");
		producer.publish(event);
	}

}
