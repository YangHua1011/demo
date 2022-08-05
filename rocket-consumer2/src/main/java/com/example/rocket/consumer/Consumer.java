package com.example.rocket.consumer;

import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

@Component
@RocketMQMessageListener(topic = "first-topic",consumerGroup = "my-consumer")
public class Consumer implements RocketMQListener<MessageExt> {

    private static AtomicInteger i = new AtomicInteger(0);
    @Override
    public void onMessage(MessageExt message) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date())+"---my-consumer---"+Thread.currentThread().getName()+"---接收到消息："+new String(message.getBody()));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
