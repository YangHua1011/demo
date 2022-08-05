package com.example.demo;

import lombok.Builder;

/**
 * 消息实体类
 * @author oKong
 *
 */
@Builder
public class MessageEntity {

    String message;

    String code;

    @Override
    public String toString() {
        return "MessageEntity{" +
                "message='" + message + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
