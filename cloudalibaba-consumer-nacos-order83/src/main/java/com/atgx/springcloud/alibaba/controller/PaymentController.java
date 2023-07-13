package com.atgx.springcloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liugx
 * @CreateTime: 2023-07-13  08:53
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "payment/{id}")
    public String getPayment(@PathVariable("id") Integer id){

        return "nacos register, serverPort:"+serverPort+"\t id"+id;
    }
}
