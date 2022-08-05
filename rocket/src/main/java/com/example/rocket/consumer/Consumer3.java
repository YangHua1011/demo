package com.example.rocket.consumer;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.apache.rocketmq.spring.core.RocketMQPushConsumerLifecycleListener;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@RocketMQMessageListener(topic = "first-topic",consumerGroup = "my-consumer")
public class Consumer3 implements RocketMQListener<MessageExt>, RocketMQPushConsumerLifecycleListener {
    @Override
    public void onMessage(MessageExt message) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date())+"---consumer3---"+Thread.currentThread().getName()+"---接收到消息："+message.getQueueId()+"---"+new String(message.getBody()));
        int i = (int) (Math.random() * 100);
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(simpleDateFormat.format(new Date())+"---consumer3---"+Thread.currentThread().getName()+"---消费完成："+message.getQueueId()+"---"+new String(message.getBody()));
    }
    @Override
    public void prepareStart(DefaultMQPushConsumer consumer) {
        consumer.setInstanceName("Consumer3");
    }
}
