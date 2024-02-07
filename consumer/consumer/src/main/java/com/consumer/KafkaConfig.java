package com.consumer;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
	
	@KafkaListener(topics = AppConstants.COURSE_UPDATE_TOPIC, groupId=AppConstants.GROUP_ID)
	public void updateCourse(String courseDetails) {
		
		System.out.println(courseDetails);
		
	}

}
