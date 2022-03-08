package com.example.demorocket;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RocketMQMessageListener(topic = "first-topic",consumerGroup = "my-consumer-group1")
public class Consumer2 implements RocketMQListener<String> {
    @Override
    public void onMessage(String message) {
        System.out.println(new Date());
        System.out.println("消费者1："+message);
    }
}
