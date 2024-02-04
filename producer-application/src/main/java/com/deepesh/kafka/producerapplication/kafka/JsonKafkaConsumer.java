package com.deepesh.kafka.producerapplication.kafka;

import com.deepesh.kafka.producerapplication.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
	@KafkaListener(topics = "deepesh-kakfa-event-json",groupId = "mygroup")
	public void jsonConsumer(User user){
		LOGGER.info(String.format("Message Received %s",user.toString()));
	}
}
