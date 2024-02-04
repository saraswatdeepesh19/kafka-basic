package com.deepesh.kafka.producerapplication.controller;

import com.deepesh.kafka.producerapplication.dto.User;
import com.deepesh.kafka.producerapplication.kafka.JsonKafkaProducer;
import com.deepesh.kafka.producerapplication.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

	@Autowired
	KafkaProducer kafkaProducer;
	@Autowired
	JsonKafkaProducer jsonKafkaProducer;

	@GetMapping("/publish")
	public ResponseEntity<?> sendMessageProducer(@RequestParam("message") String message){
		kafkaProducer.sendMessage(message);
		return  ResponseEntity.ok("Message sent to the topic");
	}

	@PostMapping("/publish/user")
	public ResponseEntity<?> jsonMessageProducer(@RequestBody User user){
		jsonKafkaProducer.sendMessage(user);
		return  ResponseEntity.ok("Message sent to the topic");
	}
}
