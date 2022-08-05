package com.example.rocket.controller;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {
    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @RequestMapping("/pushMessage")
    public String get(@RequestParam("id") int id) {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

//        SendResult sendResult = rocketMQTemplate.syncSend("first-topic", "你好,Java旅途" + id);
//        System.out.println(sendResult);
//        System.out.println(simpleDateFormat.format(new Date())+"---发送成功");
        for (int i = 0;i < 40;i++){
            rocketMQTemplate.syncSend("first-topic", i);
        }
        return "OK";
    }
}
