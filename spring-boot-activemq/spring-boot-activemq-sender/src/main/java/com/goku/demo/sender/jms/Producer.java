package com.goku.demo.sender.jms;

import javax.jms.Destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    @Autowired // 也可以注入JmsTemplate，JmsMessagingTemplate对JmsTemplate进行了封装
    private JmsMessagingTemplate jmsTemplate;
    // 发送消息，destination是发送到的队列，message是待发送的消息
    public void sendMessage(Destination destination, final String message){
        jmsTemplate.convertAndSend(destination, message);
    }

    @JmsListener(destination="out.queue")
    public void consumerMessage(String text){
        System.out.println("从out.queue队列收到的回复报文为:"+text);
    }
}