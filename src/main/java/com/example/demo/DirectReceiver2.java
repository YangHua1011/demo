package com.example.demo;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Map;

@Component
@RabbitListener(queues = "dead_message_queue")//监听的队列名称 TestDirectQueue
public class DirectReceiver2 {

    @RabbitHandler
    public void process(Map message, Channel channel,
                        @Header(AmqpHeaders.DELIVERY_TAG) long tag
    )  {
        System.out.println("死信队列："+message);
    }

}
