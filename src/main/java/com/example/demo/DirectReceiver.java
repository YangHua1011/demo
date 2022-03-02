package com.example.demo;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import static org.springframework.amqp.support.AmqpHeaders.CORRELATION_ID;

@Component
@RabbitListener(queues = "TestDirectQueue")//监听的队列名称 TestDirectQueue
public class DirectReceiver {

    @RabbitHandler
    public void process(Map message, Channel channel,
                        @Header(AmqpHeaders.DELIVERY_TAG) long tag
                        )  {
        System.out.println();
        System.out.print(new SimpleDateFormat("HH:mm:ss").format(new Date()));
        Integer id = (Integer) message.get("id");

        if (id/3 == 0){
            System.out.print("----处理失败-id:"+id);
        }else if (id==5){
            System.out.print("----未知异常-id:"+id);
            throw new RuntimeException("未知异常");
        }else {
            System.out.print("----处理成功-id:"+id);
        }
    }



}
