package com.deepesh.kafka.producerapplication.kafka;

import com.deepesh.kafka.producerapplication.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

	@Autowired
	KafkaTemplate<?, ?> kafkaTemplate;

	public void sendMessage(User data) {
		LOGGER.info(String.format("Message sent %s",data.toString()));
		Message message = MessageBuilder
				.withPayload(data)
				.setHeader(KafkaHeaders.TOPIC, "deepesh-kakfa-event-json")
				.build();
		kafkaTemplate.send(message);
	}

}
