package com.example.demo;

import org.springframework.web.client.RestTemplate;

public class A {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        for (int i =0 ;i <=10 ;i++){
            restTemplate.getForObject("http://127.0.0.1:8080/send?id="+i,String.class);
        }
    }
}
