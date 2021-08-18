package com.yyw.springcloud.controller;


import com.yyw.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider iMessageProvider;


    @GetMapping(value = "/sendMessage")
    public  String SendMessage(){
        return iMessageProvider.send();
    }
}
