package com.journal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.journal.pojo.JournalEntity;

@Service
public class KafkaProducer {
	@Autowired
	KafkaTemplate<String, Object> template;

//	public KafkaProducer(KafkaTemplate<String, Object> template) {
//		this.template = template;
//	}

	public void sendMessage(JournalEntity message) {

		System.out.println(message);
		template.send("journal", message);
	}

}
