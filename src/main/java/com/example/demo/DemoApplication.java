package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.example.demo.dao")
//@EnableElasticsearchRepositories("com.example.demo.res")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication app =new SpringApplication(DemoApplication.class);
//        app.addListeners(new MyApplicationStartingEventListener());//加入自定义的监听类
        app.run(args);
    }

}
