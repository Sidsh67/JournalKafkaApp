package com.journal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.journal.pojo.JournalEntity;
import com.journal.service.KafkaProducer;

@RestController
@RequestMapping("/kafka")
public class MessageController {
	@Autowired
	private KafkaProducer producer;

//	public MessageController(KafkaProducer producer) {
//		
//		this.producer = producer;
//	}
	
	@PostMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody JournalEntity message){
		producer.sendMessage(message);
		return ResponseEntity.ok("sent message");
	}
}
