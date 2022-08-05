package com.example.demo;

import org.springframework.context.ApplicationEvent;
import org.springframework.util.CollectionUtils;

/**
 * 编写事件源
 * @author oKong
 *
 */
@SuppressWarnings("serial")
public class CustomEvent extends ApplicationEvent {
    public static void main(String[] args) {
    }
    private MessageEntity messageEntity;

    public CustomEvent(Object source, MessageEntity messageEntity) {
        super(source);
        this.messageEntity = messageEntity;
    }

    public MessageEntity getMessageEntity() {
        return this.messageEntity;
    }
}
