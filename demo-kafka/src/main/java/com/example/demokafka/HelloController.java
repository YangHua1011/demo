package com.example.demokafka;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.ProducerListener;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class HelloController {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;


    @GetMapping("send1")
    public boolean send1( String message) {
        try {
            ListenableFuture<SendResult<String, Object>> send = kafkaTemplate.send("test-topic", message);
            kafkaTemplate.setProducerListener(new ProducerListener<String, Object>() {

                @Override
                public void onSuccess(ProducerRecord<String, Object> producerRecord, RecordMetadata recordMetadata) {

                }

                @Override
                public void onError(ProducerRecord<String, Object> producerRecord, RecordMetadata recordMetadata, Exception exception) {

                }
            });
            SendResult<String, Object> stringObjectSendResult = send.get();


            System.out.println("消息1发送成功...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @GetMapping("send2")
    public boolean send2( String message) {
        try {
            kafkaTemplate.send("test-topic2", message);
            System.out.println("消息2发送成功...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

}
