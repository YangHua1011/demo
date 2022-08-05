package com.example.rocket;

import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RocketApplicationTests {


	@Autowired
	private RocketMQTemplate rocketMQTemplate;

	@Test
	void contextLoads() {

		for (int i = 0;i < 20;i++){
			rocketMQTemplate.syncSend("first-topic", i);
		}
	}

}
