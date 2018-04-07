package com.goku.demo.controller;

import com.goku.demo.message.RequestMessage;
import com.goku.demo.message.ResponseMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;

import java.util.Date;

/**
 * Created by nbfujx on 2018-01-03.
 */
@Controller
public class WsController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public ResponseMessage say(RequestMessage message) {
        System.out.println(message.getName());
        return new ResponseMessage("welcome," + message.getName() + " !");
    }


    @MessageMapping("/welcome2")
    @SendTo("/topic/getResponse2")
    public ResponseMessage say2() {
        return new ResponseMessage("welcome," + new Date() + " !");
    }
}
