package com.example.demorocket;

import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.SendStatus;
import org.springframework.messaging.Message;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @RequestMapping("/send")
    public String get( int id) {
        SendResult sendResult = rocketMQTemplate.syncSend("first-topic", "你好,Java旅途" + id);
        System.out.println(sendResult);
        Message message = new GenericMessage<String>("你好,Java旅途" + id);
        rocketMQTemplate.asyncSend("first-topic", message, new SendCallback() {
            @Override
            public void onSuccess(SendResult sendResult) {
                System.out.println("发送成功"+sendResult);
            }

            @Override
            public void onException(Throwable throwable) {
                System.out.println("发送失败"+throwable.getMessage());
            }
        },1000,3);

        SendResult sendResult1 = rocketMQTemplate.syncSend("", "");
        SendStatus sendStatus = sendResult.getSendStatus();
        return "ok";
    }
}
