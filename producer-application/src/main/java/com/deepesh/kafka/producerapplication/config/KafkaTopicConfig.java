package com.deepesh.kafka.producerapplication.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

	@Bean
	public NewTopic deepeshDemoTopic() {
		return TopicBuilder.name("deepesh-kakfa-event").build();
	}

	@Bean
	public NewTopic deepeshDemoTopicJson() {
		return TopicBuilder.name("deepesh-kakfa-event-json").build();
	}

}
