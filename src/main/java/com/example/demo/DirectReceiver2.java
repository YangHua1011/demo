//package com.example.demo;
//
//import com.rabbitmq.client.AMQP;
//import com.rabbitmq.client.Channel;
//import com.rabbitmq.client.impl.AMQImpl;
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//import java.util.Map;
//
//@Component
//@RabbitListener(queues = "TestDirectQueue")//监听的队列名称 TestDirectQueue
//public class DirectReceiver2 {
//
//    @RabbitHandler
//    public void process(Channel channel, Map testMessage) {
//        try {
//            channel.basicAck(1,false);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("DirectReceiver消费者收到消息  : " + testMessage.toString());
//    }
//
//}
