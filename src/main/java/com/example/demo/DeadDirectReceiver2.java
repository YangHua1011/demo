//package com.example.demo;
//
//import com.rabbitmq.client.Channel;
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.amqp.support.AmqpHeaders;
//import org.springframework.messaging.handler.annotation.Header;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Map;
//
//@Component
//@RabbitListener(queues = "queueDead")//监听的队列名称 TestDirectQueue
//public class DeadDirectReceiver2 {
//
//    @RabbitHandler
//    public void process(Channel channel, Map messsage,@Header(AmqpHeaders.DELIVERY_TAG) long tag) {
//
//        System.out.print(new SimpleDateFormat("HH:mm:ss").format(new Date()));
//        System.out.println();
//        Integer id = (Integer) messsage.get("id");
//        System.out.println("死信队列----处理成功-id:"+id);
//
//        try {
//            channel.basicAck(tag,false);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
