package com.journal.topic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaAdmin.NewTopics;
@Configuration
public class KafkaTopic {

	@Bean
	public KafkaAdmin.NewTopics createTopic(){
		return new NewTopics(
				TopicBuilder.name("journal")
				.partitions(2)
				.replicas(1)
				.build()
				
				);
	}
}
