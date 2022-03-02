package com.example.demo;

import com.example.demo.config.DirectRabbitConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class HelloController {


    @Autowired
    DirectRabbitConfig directRabbitConfig;

    @GetMapping("/send")
    public String sayHello(Integer id){

        return sendDirectMessage(id);
    }


    public String sendDirectMessage(Integer id) {
        String messageId = String.valueOf(UUID.randomUUID());
        Integer messageData = id;
        String createTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Map<String,Object> map=new HashMap<>();
        map.put("messageId",messageId);
        map.put("id",id);
        map.put("messageData",messageData);
        map.put("createTime",createTime);
        //将消息携带绑定键值：TestDirectRouting 发送到交换机TestDirectExchange
        directRabbitConfig.send(map);
        return "ok";
    }

}
