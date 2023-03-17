package com.atgx.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: liugx
 * @CreateTime: 2023-03-17  08:46
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/consul")
    public String patmentConsul(){
       return "Spring cloud --consul:"+serverPort+" \t"+ UUID.randomUUID();
    }
}
