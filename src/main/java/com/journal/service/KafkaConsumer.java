package com.journal.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


import com.journal.pojo.JournalEntity;

@Service
public class KafkaConsumer {

	private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
	@Autowired
	private JournalService service;

	@KafkaListener(topics = "journal", groupId = "journal11")
	public void message(JournalEntity message) {
		System.out.println("hjghtdfesdggghhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
		System.out.println("Consumed data from producer ========= " + message);

		service.save(message);
		logger.info(String.format("message recieve -> %s", message));
	}

}
